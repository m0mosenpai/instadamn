package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* loaded from: classes12.dex */
public final class YBT implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C1345666g A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AbstractC1346866s.A04("MailboxInstagramSecureMessage", AbstractC111324zv.A00(5243), this.A00);
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        MailboxNullable A0J = AbstractC43593JPy.A0J();
        C73393YBd c73393YBd = new C73393YBd(this, 4);
        AbstractC1345065z abstractC1345065z = C1345666g.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0J, 1000, 1, "MCAMailboxInstagramSecureMessage", "InstagramMessageInsertOptimistic", c73393YBd);
    }

    public YBT(C1345666g c1345666g, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, String str2, String str3, String str4, String str5, List list, int i, long j, boolean z) {
        this.A02 = c1345666g;
        this.A00 = i;
        this.A03 = mailboxFutureImpl;
        this.A01 = j;
        this.A06 = str;
        this.A0A = str2;
        this.A05 = number;
        this.A04 = number2;
        this.A09 = str3;
        this.A08 = str4;
        this.A0B = list;
        this.A07 = str5;
        this.A0C = z;
    }
}
