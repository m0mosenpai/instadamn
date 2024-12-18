package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Ckc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28629Ckc implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public ViewOnClickListenerC28629Ckc(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1392488510);
                C26743BrP c26743BrP = (C26743BrP) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c26743BrP.A05);
                WEz A01 = AbstractC69993VzD.A01(c26743BrP.requireActivity(), (InterfaceC11380iw) c26743BrP.A02.getValue(), A0r, EnumC65855TvH.A0A, VG2.A0d, this.A02);
                A01.A01 = (User) c26743BrP.A03.getValue();
                A01.A0E = true;
                A01.A07(EnumC39619HeT.A03);
                WEz.A00(null, A01);
                i = -1774715281;
                break;
            case 1:
                A05 = C0f9.A05(-1108104814);
                C26738BrJ c26738BrJ = (C26738BrJ) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(c26738BrJ.A0D);
                String A15 = AbstractC25225BEi.A15(c26738BrJ.A07);
                String A152 = AbstractC25225BEi.A15(c26738BrJ.A06);
                String str = this.A02;
                EnumC25577BSp enumC25577BSp = EnumC25577BSp.REPLACE;
                String A153 = AbstractC25225BEi.A15(c26738BrJ.A05);
                String A154 = AbstractC25225BEi.A15(c26738BrJ.A0B);
                Integer num = (Integer) c26738BrJ.A08.getValue();
                String A155 = AbstractC25225BEi.A15(c26738BrJ.A02);
                LJe.A01(c26738BrJ, A0r2, new C45000Jvq(enumC25577BSp, (ImageUrl) c26738BrJ.A0A.getValue(), null, num, (Integer) c26738BrJ.A03.getValue(), A15, A152, str, A153, A154, A155, null, true));
                AbstractC25233BEq.A14(c26738BrJ);
                i = -1297681982;
                break;
            default:
                A05 = C0f9.A05(733158698);
                AbstractC26782Bs6 abstractC26782Bs6 = (AbstractC26782Bs6) this.A01;
                String str2 = this.A02;
                WEz A012 = AbstractC69993VzD.A01(abstractC26782Bs6.requireActivity(), abstractC26782Bs6, AbstractC166987dD.A0r(abstractC26782Bs6.A00), EnumC65855TvH.A1A, VG2.A0o, str2);
                A012.A08(new C39452Hbe(abstractC26782Bs6, 0));
                WEz.A00(null, A012);
                i = -714387791;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
