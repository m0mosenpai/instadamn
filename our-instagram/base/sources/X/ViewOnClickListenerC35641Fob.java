package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;

/* renamed from: X.Fob, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35641Fob implements View.OnClickListener {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ EKE A02;
    public final /* synthetic */ GY5 A03;
    public final /* synthetic */ EnumC33445EqI A04;
    public final /* synthetic */ EnumC31713DwI A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public ViewOnClickListenerC35641Fob(AbstractC59962oe abstractC59962oe, AbstractC12990ll abstractC12990ll, EKE eke, GY5 gy5, EnumC33445EqI enumC33445EqI, EnumC31713DwI enumC31713DwI, String str, String str2) {
        this.A02 = eke;
        this.A00 = abstractC59962oe;
        this.A01 = abstractC12990ll;
        this.A05 = enumC31713DwI;
        this.A04 = enumC33445EqI;
        this.A03 = gy5;
        this.A06 = str;
        this.A07 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1P1 c32490ESq;
        C11R c11r;
        int i;
        C1ON c1on;
        int A05 = C0f9.A05(-1232583374);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        EKE eke = this.A02;
        if (elapsedRealtime - eke.A00 < 30000) {
            AbstractC59962oe abstractC59962oe = this.A00;
            AbstractC35254Fgn.A05(abstractC59962oe.requireContext(), AbstractC31174DnI.A0w(abstractC59962oe, 30, 2131974270), abstractC59962oe.getString(2131974271));
            i = -2049441818;
        } else {
            C1Q9 c1q9 = C1Q9.A1O;
            AbstractC12990ll abstractC12990ll = this.A01;
            C35230FgN A02 = c1q9.A02(abstractC12990ll);
            EnumC31713DwI enumC31713DwI = this.A05;
            C35230FgN.A02(A02, this.A04, enumC31713DwI);
            GY5 gy5 = this.A03;
            if (gy5 != null) {
                C35231FgO.A03.A03(this.A00.requireActivity(), abstractC12990ll, gy5, enumC31713DwI, AbstractC35259Fgt.A00(this.A06, this.A07));
            }
            AbstractC59962oe abstractC59962oe2 = this.A00;
            Context context = eke.getContext();
            String A00 = C16030qx.A00(context);
            String A10 = AbstractC31172DnG.A10(context);
            SPT spt = LIA.A07;
            LIA lia = new LIA(eke.requireContext());
            if (eke.A0E) {
                C1ON A002 = AbstractC35079Fcq.A00(context, eke.A01, AbstractC35259Fgt.A00(eke.A09, eke.A0B), A00, A10);
                c32490ESq = new Egg(eke, eke, eke.A07);
                c1on = A002;
            } else if (eke.A0F && eke.A0A != null && context != null) {
                C47989LJs c47989LJs = C47989LJs.A00;
                c47989LJs.A02(eke.A01, eke.C0Q().A01, "user_clicked_on_resend_code_link");
                C07270a1 c07270a1 = eke.A01;
                String str = eke.A0A;
                EnumC31713DwI C0Q = eke.C0Q();
                C32490ESq c32490ESq2 = new C32490ESq(eke);
                C32987Eft c32987Eft = new C32987Eft(context, eke);
                String str2 = C0Q.A01;
                c47989LJs.A02(c07270a1, str2, AbstractC43591JPw.A00(319));
                if (lia.A01.A00() >= 1) {
                    c47989LJs.A02(c07270a1, str2, AbstractC43591JPw.A00(317));
                    c11r = new KK6(null, eke, c32490ESq2, c07270a1, c32987Eft, lia, C0Q, true, str);
                } else {
                    c47989LJs.A02(c07270a1, str2, AbstractC43591JPw.A00(318));
                    C1ON A01 = AbstractC35276FhB.A01(lia.A00, c07270a1, null, null, str, null, true, false);
                    A01.A00 = c32490ESq2;
                    c11r = A01;
                }
                abstractC59962oe2.schedule(c11r);
                eke.A00 = SystemClock.elapsedRealtime();
                i = -988586882;
            } else {
                C47989LJs.A00.A02(eke.A01, eke.C0Q().A01, "user_clicked_on_resend_code_link");
                C1ON A012 = AbstractC35276FhB.A01(context, eke.A01, null, null, eke.A0A, null, true, false);
                c32490ESq = new C32490ESq(eke);
                c1on = A012;
            }
            c1on.A00 = c32490ESq;
            c11r = c1on;
            abstractC59962oe2.schedule(c11r);
            eke.A00 = SystemClock.elapsedRealtime();
            i = -988586882;
        }
        C0f9.A0C(i, A05);
    }
}
