package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ftn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35929Ftn implements InterfaceC37147GYi {
    public final int A00;
    public final Object A01;

    public C35929Ftn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37147GYi
    public final void Dqa(EnumC33332EoR enumC33332EoR) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(enumC33332EoR, 0);
                if (enumC33332EoR == EnumC33332EoR.A02) {
                    ((BusinessConversionActivity) this.A01).A06 = true;
                    return;
                } else {
                    if (enumC33332EoR != EnumC33332EoR.A04) {
                        return;
                    }
                    ((BusinessConversionActivity) this.A01).A05 = true;
                    return;
                }
            case 1:
                V1Y.A03((V1Y) ((ViewOnClickListenerC35677FpC) this.A01).A01);
                return;
            case 2:
                if (enumC33332EoR != EnumC33332EoR.A02) {
                    return;
                }
                C31721DwQ.A0C((C31721DwQ) this.A01);
                return;
            default:
                DialogInterfaceOnCancelListenerC32263EIy dialogInterfaceOnCancelListenerC32263EIy = (DialogInterfaceOnCancelListenerC32263EIy) this.A01;
                if (enumC33332EoR == EnumC33332EoR.A02) {
                    UserSession userSession = dialogInterfaceOnCancelListenerC32263EIy.A00;
                    C9CN c9cn = new C9CN(CallerContext.A00(DialogInterfaceOnCancelListenerC32263EIy.class), "ig_android_ig_business_asset_ig_to_fb_crossposting", "ig_to_fb_crossposting", "crossposting", "loading");
                    C35918Ftc c35918Ftc = new C35918Ftc(dialogInterfaceOnCancelListenerC32263EIy, 2);
                    C14360o3.A0B(userSession, 0);
                    C97N.A00(C97M.A00(userSession)).AV3(c9cn, C97J.A00, c35918Ftc);
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC37147GYi
    public final void onError(Throwable th) {
    }
}
