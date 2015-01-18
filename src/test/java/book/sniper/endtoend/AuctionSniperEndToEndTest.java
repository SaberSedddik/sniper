package book.sniper.endtoend;

import book.sniper.auctionserver.FakeAuctionServer;
import org.junit.After;
import org.junit.Test;

/**
 * Created by saberseddik on 15-01-14.
 */
public class AuctionSniperEndToEndTest {

    private final FakeAuctionServer auction = new FakeAuctionServer("item-54321");
    private final ApplicationRunner application = new ApplicationRunner();

    @Test
    public void sniperJoinsAuctionUntilAuctionClosed() throws Exception{
        auction.startSellingItem();
        application.startBiddingIn(auction);
        auction.hasReceivedJoinRequestFromSniper();
        auction.announceClosed();
        application.showsSniperHasLostAuction();
    }

    @After
    public void stopAuction(){
        auction.stop();
    }

    @After
    public void stopApplication(){
        application.stop();
    }


}
