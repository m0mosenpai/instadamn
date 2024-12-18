package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KM9 extends AbstractRunnableC14200nk {
    public final /* synthetic */ C9A5 A00;
    public final /* synthetic */ C59562nz A01;
    public final /* synthetic */ UserSession A02;

    @Override // java.lang.Runnable
    public final void run() {
        C59562nz c59562nz = this.A01;
        if (c59562nz.A0Y == C05F.A00) {
            c59562nz.A0Y = C05F.A01;
        }
        UserSession userSession = this.A02;
        C25821No c25821No = c59562nz.A0c;
        C1O2 c1o2 = c25821No.A0G;
        ImageUrl imageUrl = c59562nz.A0L;
        C59722oF c59722oF = c59562nz.A0A;
        InterfaceC11560jF interfaceC11560jF = c25821No.A0F;
        C43601zh c43601zh = c25821No.A02;
        C0f6 c0f6 = c25821No.A0E;
        AbstractC167017dG.A1N(userSession, c1o2);
        C14360o3.A0B(imageUrl, 3);
        LGA lga = new LGA(c0f6, interfaceC11560jF, c1o2, c59562nz, c43601zh, c59722oF, userSession, imageUrl);
        InterfaceC09390do interfaceC09390do = LKn.A05;
        LKn A00 = AbstractC46712KlV.A00(lga.A06);
        ImageUrl imageUrl2 = lga.A07;
        C48276LXz.A00(A00, lga, AbstractC43592JPx.A0w(imageUrl2), 0);
        InterfaceC11560jF interfaceC11560jF2 = lga.A02;
        if (interfaceC11560jF2 != null) {
            interfaceC11560jF2.Ck0(0, imageUrl2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KM9(C9A5 c9a5, C59562nz c59562nz, UserSession userSession, boolean z) {
        super(123263072, 2, z, true);
        this.A01 = c59562nz;
        this.A00 = c9a5;
        this.A02 = userSession;
    }
}
