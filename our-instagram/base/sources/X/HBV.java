package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* loaded from: classes7.dex */
public final class HBV extends AnonymousClass935 {
    public final /* synthetic */ C75443aB A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ C3Ow A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HBV(UserSession userSession, C75443aB c75443aB, C38321qM c38321qM, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        super(userSession);
        this.A00 = c75443aB;
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A04 = c3Ow;
        this.A03 = reel;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(1232970940);
        C75443aB.A00(this.A00, this.A01, null, AbstractC37301Gc2.A0i(this.A03));
        C0f9.A0A(-132357549, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-29652686);
        C105824pt c105824pt = (C105824pt) obj;
        int A032 = C0f9.A03(-2129047807);
        AbstractC167017dG.A1N(userSession, c105824pt);
        C75443aB c75443aB = this.A00;
        C81063jb c81063jb = c75443aB.A06;
        if (c81063jb != null) {
            c81063jb.A05(this.A01);
        }
        super.A05(userSession, c105824pt);
        Reel A0G = AbstractC37301Gc2.A0M(userSession).A0G(c105824pt);
        C75443aB.A01(c75443aB, this.A02, A0G, this.A04);
        String A0i = AbstractC37301Gc2.A0i(A0G);
        C38321qM c38321qM = this.A01;
        EnumC109104va enumC109104va = c105824pt.A06;
        if (enumC109104va == null) {
            enumC109104va = EnumC109104va.A0E;
        }
        C75443aB.A00(c75443aB, c38321qM, Boolean.valueOf(AbstractC167007dF.A1X(enumC109104va, EnumC109104va.A04)), A0i);
        C0f9.A0A(1661765787, A032);
        C0f9.A0A(-635153119, A03);
    }
}
