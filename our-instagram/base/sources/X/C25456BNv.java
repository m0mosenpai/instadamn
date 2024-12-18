package X;

import android.animation.Animator;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BNv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25456BNv extends AbstractC51572Yf {
    public final Animator A00;
    public final C37669Gi2 A01;
    public final C51762Yz A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final EnumC85043qs A05;
    public final InterfaceC31061Dl3 A06;
    public final boolean A07;
    public final float A08;
    public final long A09;
    public final long A0A;
    public final AbstractC25398BLp A0B;

    public C25456BNv(Animator animator, C37669Gi2 c37669Gi2, C51762Yz c51762Yz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC85043qs enumC85043qs, AbstractC25398BLp abstractC25398BLp, InterfaceC31061Dl3 interfaceC31061Dl3, float f, long j, long j2, boolean z) {
        AbstractC167027dH.A0a(1, interfaceC31061Dl3, c37669Gi2, userSession, interfaceC11380iw);
        C14360o3.A0B(enumC85043qs, 9);
        this.A06 = interfaceC31061Dl3;
        this.A01 = c37669Gi2;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A09 = j;
        this.A0A = j2;
        this.A08 = f;
        this.A07 = z;
        this.A05 = enumC85043qs;
        this.A00 = animator;
        this.A02 = c51762Yz;
        this.A0B = abstractC25398BLp;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51322Xf c51322Xf = (C51322Xf) AbstractC77183d4.A00(c76223bS, C25457BNw.A00, new Object[0]);
        float f = this.A08;
        C2XI A0j = AbstractC25228BEl.A0j(c76223bS, (f + 1.0f) * 1.0f);
        C2XI A0j2 = AbstractC25228BEl.A0j(c76223bS, 1.0f);
        long j = this.A09;
        long A01 = C2Z3.A01(1.0f / 2.0f, C2Z3.A01(f, j));
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C25458BNx.A00);
        Object obj = AbstractC85353rQ.A01(new BFF(A0j, 27), this.A04).A00;
        Object A002 = AbstractC77183d4.A00(c76223bS, C25459BNy.A00, new Object[0]);
        AbstractC77313dH.A00(c76223bS, new C29709D8c(3, A00, A002, obj, this), new Object[]{this.A05});
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A1F;
        C51722Yv A0A = AbstractC25234BEr.A0A(A0j, null, new C9CV(A0j, num));
        Integer num2 = C05F.A00;
        C51722Yv A0X = AbstractC25231BEo.A0X(A0j2, A0A, num2);
        long A012 = C2Z3.A01(1.0f - f, j);
        C51722Yv A003 = C9CU.A00(A0X, num2, 0, A012);
        Integer num3 = C05F.A01;
        C51722Yv A004 = C9CU.A00(A003, num3, 0, A012);
        long j2 = this.A0A;
        C51722Yv A14 = AbstractC25232BEp.A14(A004, 0, A01);
        Integer num4 = C05F.A08;
        BNU bnu = new BNU(AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_direct_outline_44), ImageView.ScaleType.FIT_CENTER, AbstractC25230BEn.A0e(C9CV.A00(C9CV.A00(C9CV.A00(AbstractC25233BEq.A0U(C9CV.A00(C9CV.A00(AbstractC25233BEq.A0W(AbstractC25234BEr.A0E(C9CU.A00(A14, num4, 0, A01), AbstractC25227BEk.A0Z(0, A01), 0, j2), c76223bS, 2131973639), C05F.A0D, "clips_ufi_share_button_component", 4), num4, "direct_share_button", 4), AbstractC25225BEi.A0o(num2, EnumC77683ds.CENTER, 3), num3, 0), num, DRP.A00(this, 42), 4), C05F.A03, DRP.A00(this, 43), 4), C05F.A04, DRP.A00(this, 44), 4), C05F.A0C, new C30177DRh(42, this, A002, A00, obj), null).A00(null), false);
        AbstractC107374si.A00(bnu, c51322Xf);
        return bnu;
    }
}
