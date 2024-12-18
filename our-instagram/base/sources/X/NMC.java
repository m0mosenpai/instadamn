package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NMC extends C33H {
    public final int A00;
    public final Object A01;

    public NMC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C5SW A00(C5SU c5su, Object obj, int i) {
        c5su.A04 = new NMC(obj, i);
        return c5su.A00();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC16820sZ interfaceC16820sZ;
        C23031Ai A00;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        InterfaceC19610xo ARD;
        switch (this.A00) {
            case 0:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return;
            case 1:
                A00 = AbstractC23021Ah.A00(((P0G) this.A01).A06);
                z = true;
                interfaceC16530ry = A00.A1F;
                c0yrArr = C23031Ai.A8c;
                i = 183;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 2:
                UserSession userSession = ((C54970OTc) this.A01).A01;
                AbstractC46542Bs.A00(userSession).A08(true);
                boolean A1X = MSZ.A1X(C196068lw.A00(userSession), "ClipsShareSheetTooltipManager");
                C82G c82g = C82G.A0N;
                C82H c82h = C82H.A10;
                EnumC201098ur enumC201098ur = EnumC201098ur.VIEW;
                C82I A0H = MSW.A0H();
                MSX.A1I(A0H, A1X);
                AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
                return;
            case 3:
                A00 = AbstractC23021Ah.A00((UserSession) this.A01);
                z = true;
                interfaceC16530ry = A00.A2w;
                c0yrArr = C23031Ai.A8c;
                i = 153;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 4:
                A00 = AbstractC23021Ah.A00((UserSession) this.A01);
                z = true;
                interfaceC16530ry = A00.A33;
                c0yrArr = C23031Ai.A8c;
                i = 154;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, z);
                return;
            case 5:
                InterfaceC19630xq interfaceC19630xq = ((C54415O2v) this.A01).A00.A01;
                AbstractC50522MSa.A1T(interfaceC19630xq, "exclusive_post_creation_tooltip_count", 0);
                long currentTimeMillis = System.currentTimeMillis();
                ARD = interfaceC19630xq.ARD();
                ARD.E7G("exclusive_post_creation_tooltip_timestamp", currentTimeMillis);
                ARD.apply();
                return;
            case 6:
                interfaceC16820sZ = ((C56479P5t) this.A01).A0A;
                interfaceC16820sZ.invoke();
                return;
            case 7:
                OHM ohm = (OHM) this.A01;
                if (ohm == null) {
                    return;
                }
                C52689NTa c52689NTa = ohm.A00;
                AbstractC50522MSa.A1T(c52689NTa.A0N.A01, "video_call_cowatch_navigate_to_profile_tooltip_display_count", 0);
                c52689NTa.A05 = true;
                return;
            case 8:
                InterfaceC19630xq A0x = AbstractC166987dD.A0x((UserSession) this.A01);
                ARD = A0x.ARD();
                ARD.E7D("fb_feed_crossposting_advanced_settings_tooltip", AbstractC31172DnG.A01(A0x, "fb_feed_crossposting_advanced_settings_tooltip") + 1);
                ARD.apply();
                return;
            default:
                ARD = AbstractC31176DnK.A0e(((C54565O8r) this.A01).A01);
                ARD.E77("has_shown_discount_auto_tag_nux", true);
                ARD.apply();
                return;
        }
    }
}
