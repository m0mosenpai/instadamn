package X;

import android.view.View;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.9oX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220479oX extends C33H {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C220479oX(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        View view;
        switch (this.A00) {
            case 0:
                ((C190448c2) this.A02).A00 = null;
                return;
            case 1:
                ((C185098Ja) this.A02).A00 = false;
                return;
            case 2:
            case 4:
            case 6:
            default:
                super.Dto(c5sw);
                return;
            case 3:
                ((L7W) this.A02).A00 = true;
                return;
            case 5:
                C155536yi c155536yi = (C155536yi) this.A02;
                c155536yi.A03 = null;
                c155536yi.A00 = null;
                c155536yi.A02 = null;
                c155536yi.A05 = false;
                Runnable runnable = c155536yi.A04;
                if (runnable != null && (view = c155536yi.A01) != null) {
                    view.removeCallbacks(runnable);
                }
                c155536yi.A04 = null;
                return;
            case 7:
                ((C37784Gjz) this.A02).A00 = null;
                return;
        }
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        C23031Ai c23031Ai;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        switch (this.A00) {
            case 0:
                int A0H = AbstractC166987dD.A0H(this.A01);
                C190448c2 c190448c2 = (C190448c2) this.A02;
                if (A0H != 0) {
                    InterfaceC19630xq A0x = AbstractC166987dD.A0x(c190448c2.A03);
                    AbstractC167007dF.A18(A0x, "story_private_mention_reshare_tooltip_impression_count", A0x.getInt("story_private_mention_reshare_tooltip_impression_count", 0) + 1);
                } else {
                    C23031Ai A00 = AbstractC23021Ah.A00(c190448c2.A03);
                    AbstractC167007dF.A1L(A00, A00.A3z, C23031Ai.A8c, 193, true);
                }
                c190448c2.A01 = true;
                return;
            case 1:
                ((Number) this.A01).intValue();
                AbstractC167017dG.A0g(AbstractC166987dD.A0x(((C185098Ja) this.A02).A04), "clips_nux_camera_tooltip_green_screen_count").apply();
                return;
            case 2:
                AbstractC167007dF.A17(AbstractC166987dD.A0w((C23031Ai) this.A01), AbstractC111324zv.A00(4027));
                UserSession userSession = (UserSession) this.A02;
                AbstractC201108us.A00(C82G.A05, EnumC201098ur.VIEW, C82H.A13, null, userSession);
                return;
            case 3:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 4:
                Integer num = C05F.A00;
                Object obj = this.A01;
                if (num == obj) {
                    c23031Ai = (C23031Ai) this.A02;
                    z = true;
                    interfaceC16530ry = c23031Ai.A2S;
                    c0yrArr = C23031Ai.A8c;
                    i = 290;
                } else {
                    if (C05F.A01 != obj) {
                        return;
                    }
                    c23031Ai = (C23031Ai) this.A02;
                    z = true;
                    interfaceC16530ry = c23031Ai.A4Q;
                    c0yrArr = C23031Ai.A8c;
                    i = 292;
                }
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 5:
                ((InterfaceC155566yl) this.A01).Dts(((C155536yi) this.A02).A07);
                return;
            case 6:
                UserSession userSession2 = ((C198248pZ) this.A02).A07;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                C14360o3.A0B(userSession2, 0);
                InterfaceC02590Ai A02 = AMW.A02(interfaceC11380iw, userSession2);
                A02.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "story_postcapture_tooltip");
                AbstractC167027dH.A0t(A02, "view");
                AbstractC167007dF.A12(A02, AMW.A05(userSession2));
                A02.Cht();
                return;
            default:
                ((InterfaceC43437JHb) this.A01).Dm8();
                return;
        }
    }
}
