package X;

import com.instagram.api.schemas.GreetingAttachmentIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import java.util.List;

/* loaded from: classes7.dex */
public class IKM {
    public GreetingAttachmentIntf A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public final OnFeedMessagesIntf A08;

    public IKM(OnFeedMessagesIntf onFeedMessagesIntf) {
        this.A08 = onFeedMessagesIntf;
        onFeedMessagesIntf.Ax8();
        this.A02 = onFeedMessagesIntf.B9e();
        this.A03 = onFeedMessagesIntf.BAJ();
        this.A04 = onFeedMessagesIntf.BDG();
        this.A05 = onFeedMessagesIntf.BEd();
        this.A06 = onFeedMessagesIntf.BEe();
        this.A07 = onFeedMessagesIntf.BEf();
        this.A00 = onFeedMessagesIntf.BGY();
        this.A01 = onFeedMessagesIntf.BvT();
    }
}
