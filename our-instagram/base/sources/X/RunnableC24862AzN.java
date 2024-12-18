package X;

import android.content.Context;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.AzN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24862AzN implements Runnable {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ AbstractC223709uF A01;
    public final /* synthetic */ C89F A02;
    public final /* synthetic */ C89P A03;
    public final /* synthetic */ C89N A04;

    public RunnableC24862AzN(AbstractC59962oe abstractC59962oe, AbstractC223709uF abstractC223709uF, C89F c89f, C89P c89p, C89N c89n) {
        this.A02 = c89f;
        this.A03 = c89p;
        this.A00 = abstractC59962oe;
        this.A04 = c89n;
        this.A01 = abstractC223709uF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AAN A00 = AbstractC226279yk.A00();
        C89F c89f = this.A02;
        SimpleVideoLayout simpleVideoLayout = c89f.A0T;
        simpleVideoLayout.setLayoutParams(A00.A06);
        C89F.A04(c89f, A00);
        C89P c89p = this.A03;
        C89F.A00(this.A00, c89f, c89p, AbstractC167007dF.A1M(c89p.A0M() ? 1 : 0));
        C89F.A05(c89f, c89p);
        C89N c89n = this.A04;
        Context context = c89f.A0F;
        C38321qM c38321qM = ((C215169fs) this.A01).A00;
        boolean A1R = AbstractC167007dF.A1R(0, context, c38321qM);
        C221849qn c221849qn = c89n.A00;
        if (c221849qn == null) {
            c221849qn = new C221849qn(context, c89n.A05, new A6K(c89n));
            c89n.A00 = c221849qn;
        }
        C5TA c5ta = new C5TA(c221849qn.A01, c221849qn.A02, null, c221849qn, "ClipsTemplateBuilderReferenceMediaPlayer");
        c221849qn.A00 = c5ta;
        String str = c38321qM.A0M;
        C75363a3 CFR = c38321qM.CFR();
        C4S7 c4s7 = new C4S7(c38321qM, 0);
        c4s7.A00 = A1R;
        c5ta.A08(simpleVideoLayout, CFR, c4s7, str, "ClipsTemplateBuilderReferenceMediaPlayer", 1.0f, -1, 0, A1R, A1R);
    }
}
