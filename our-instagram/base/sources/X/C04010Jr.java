package X;

import android.app.UiModeManager;
import android.content.Context;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04010Jr extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04010Jr(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.13f
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "DarkModeQeBehaviorInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                int i;
                boolean z;
                boolean z2;
                AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (((int) C18U.A01(c06090Tz, A08, 36597180106279665L)) == 0) {
                    C06090Tz c06090Tz2 = C06090Tz.A06;
                    String A04 = C1AD.A04(c06090Tz2, 18859987376078878L);
                    String A042 = C1AD.A04(c06090Tz2, 18859987376144415L);
                    try {
                        UiModeManager uiModeManager = (UiModeManager) this.A00.getSystemService("uimode");
                        if (uiModeManager != null) {
                            i = uiModeManager.getNightMode();
                        } else {
                            i = -1;
                        }
                    } catch (Exception unused) {
                        i = -1;
                    }
                    C18720vz c18720vz = AbstractC12960li.A00;
                    int A00 = AbstractC19730y1.A00(c18720vz).A00();
                    if ("any".equals(A04) || (("dark_mode".equals(A04) && i == 2) || (("light_mode".equals(A04) && i == 1) || ("schedule".equals(A04) && (i == 0 || i == 3))))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ("any".equals(A042) || (("dark_mode".equals(A042) && A00 == 2) || (("light_mode".equals(A042) && A00 == 1) || ("follow_system".equals(A042) && A00 == -1)))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z && z2) {
                        int A01 = (int) C1AD.A01(c06090Tz, 18578512399041269L);
                        String A043 = C1AD.A04(c06090Tz, 18859987375816733L);
                        InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(c18720vz).A00;
                        int i2 = interfaceC19630xq.getInt("dark_mode_toggle_override_iteration_id", -1);
                        int i3 = interfaceC19630xq.getInt("dark_mode_toggle_setting", -1);
                        if (i2 != A01) {
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            int i4 = interfaceC19630xq.getInt("dark_mode_toggle_override_previous_value", i3);
                            ARD.E7D("dark_mode_toggle_override_previous_iteration_id", i2);
                            ARD.E7D("dark_mode_toggle_override_iteration_id", A01);
                            ARD.E7D("dark_mode_toggle_override_previous_value", i4);
                            if (!"not_selected".equals(A043)) {
                                if ("dark_mode".equals(A043)) {
                                    i4 = 2;
                                } else {
                                    if ("light_mode".equals(A043)) {
                                        ARD.E7D("dark_mode_toggle_setting", 1);
                                    } else if ("follow_system".equals(A043)) {
                                        ARD.E7D("dark_mode_toggle_setting", -1);
                                    }
                                    ARD.apply();
                                }
                            }
                            ARD.E7D("dark_mode_toggle_setting", i4);
                            ARD.apply();
                        }
                    }
                }
            }
        };
    }
}
