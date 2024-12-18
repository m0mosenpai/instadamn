package X;

import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;

/* renamed from: X.Bv6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26965Bv6 extends C1P1 {
    public final /* synthetic */ GBV A00;

    public C26965Bv6(GBV gbv) {
        this.A00 = gbv;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1709986938);
        GBV gbv = this.A00;
        C9GR.A0F(gbv.A04.getContext(), "translation_failed", 2131975720);
        gbv.A06.A0K(EnumC155686yx.A03);
        C0f9.A0A(139149447, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(782659761);
        this.A00.A06.A0K(EnumC155686yx.A02);
        C0f9.A0A(-406271069, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserDetailTabController userDetailTabController;
        EnumC155686yx enumC155686yx;
        int A03 = C0f9.A03(1828346478);
        HAN han = (HAN) obj;
        int A032 = C0f9.A03(1918297093);
        C14360o3.A0B(han, 0);
        String str = han.A00;
        GBV gbv = this.A00;
        if (str == null) {
            C9GR.A01(gbv.A04.getContext(), "translation_failed", 2131975720, 0);
            userDetailTabController = gbv.A06;
            enumC155686yx = EnumC155686yx.A03;
        } else {
            AbstractC27678CIx.A00(C57352kA.A05(gbv.A02), han.A01);
            userDetailTabController = gbv.A06;
            String str2 = han.A00;
            C155666yv c155666yv = userDetailTabController.A0O;
            User user = c155666yv.A0J;
            if (user != null) {
                user.A03.EgE(str2);
                c155666yv.A00();
            }
            enumC155686yx = EnumC155686yx.A04;
        }
        userDetailTabController.A0K(enumC155686yx);
        C0f9.A0A(1029165865, A032);
        C0f9.A0A(689143499, A03);
    }
}
