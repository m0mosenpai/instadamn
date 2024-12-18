package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NMB extends C33H {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public NMB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        switch (this.A00) {
            case 4:
                C14360o3.A0B(c5sw, 0);
                ((InterfaceC1569372x) this.A01).DMf(null);
                return true;
            case 5:
                C14360o3.A0B(c5sw, 0);
                C55196Oe3.A00((Context) this.A01, (C55196Oe3) this.A02);
                return true;
            default:
                return super.Dtk(c5sw);
        }
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        if (6 - this.A00 != 0) {
            super.Dto(c5sw);
            return;
        }
        OZT A08 = ((PCT) this.A02).A08();
        Object obj = this.A01;
        NTZ ntz = A08.A00;
        C51904Mwm c51904Mwm = (C51904Mwm) ((AbstractC55206OeJ) ntz).A01;
        if (c51904Mwm == null || c51904Mwm.A03 != obj) {
            return;
        }
        boolean z = c51904Mwm.A0C;
        boolean z2 = c51904Mwm.A0I;
        boolean z3 = c51904Mwm.A0J;
        Integer num = c51904Mwm.A02;
        boolean z4 = c51904Mwm.A0L;
        boolean z5 = c51904Mwm.A08;
        boolean z6 = c51904Mwm.A06;
        boolean z7 = c51904Mwm.A07;
        boolean z8 = c51904Mwm.A0U;
        boolean z9 = c51904Mwm.A0P;
        boolean z10 = c51904Mwm.A0V;
        boolean z11 = c51904Mwm.A0W;
        boolean z12 = c51904Mwm.A0H;
        boolean z13 = c51904Mwm.A0Y;
        boolean z14 = c51904Mwm.A0O;
        boolean z15 = c51904Mwm.A0S;
        boolean z16 = c51904Mwm.A0M;
        boolean z17 = c51904Mwm.A0N;
        boolean z18 = c51904Mwm.A0K;
        boolean z19 = c51904Mwm.A0T;
        boolean z20 = c51904Mwm.A0B;
        boolean z21 = c51904Mwm.A0Z;
        ntz.A0J(new C51904Mwm(num, null, c51904Mwm.A04, c51904Mwm.A05, c51904Mwm.A01, c51904Mwm.A00, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, c51904Mwm.A0G, c51904Mwm.A0F, c51904Mwm.A0D, c51904Mwm.A0R, c51904Mwm.A0A, c51904Mwm.A0E, c51904Mwm.A0X, c51904Mwm.A0Q, C51904Mwm.A00(c51904Mwm, num)));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        String str;
        InterfaceC19630xq interfaceC19630xq;
        String str2;
        int i;
        InterfaceC19610xo ARD;
        C23031Ai A00;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i2;
        UserSession userSession;
        int i3;
        C41768Iek c41768Iek;
        InterfaceC19630xq A02;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c5sw, 0);
                EnumC53325Ni3 enumC53325Ni3 = (EnumC53325Ni3) this.A01;
                if (enumC53325Ni3 == null || enumC53325Ni3.ordinal() != 0) {
                    return;
                }
                A00 = AbstractC23021Ah.A00(((C51155Miy) this.A02).A04);
                z = true;
                interfaceC16530ry = A00.A54;
                c0yrArr = C23031Ai.A8c;
                i2 = 419;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i2, z);
                return;
            case 1:
                NJG njg = (NJG) this.A02;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                njg.A03.invoke(this.A01);
                return;
            case 2:
                A00 = (C23031Ai) this.A02;
                z = true;
                interfaceC16530ry = A00.A3P;
                c0yrArr = C23031Ai.A8c;
                i2 = 105;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i2, z);
                return;
            case 3:
                A00 = (C23031Ai) this.A02;
                z = true;
                interfaceC16530ry = A00.A3Q;
                c0yrArr = C23031Ai.A8c;
                i2 = 106;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i2, z);
                return;
            case 4:
                A00 = AbstractC23021Ah.A00((UserSession) this.A02);
                z = false;
                interfaceC16530ry = A00.A7s;
                c0yrArr = C23031Ai.A8c;
                i2 = 213;
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i2, z);
                return;
            case 5:
                C55196Oe3.A04((C55196Oe3) this.A02, "IMPRESSION");
                return;
            case 6:
                OZT A08 = ((PCT) this.A02).A08();
                Number number = (Number) this.A01;
                NTZ ntz = A08.A00;
                OI6 oi6 = ntz.A0K;
                int intValue = number.intValue();
                switch (intValue) {
                    case 1:
                        str = "cowatch_watch_more";
                        break;
                    case 2:
                        str = "minimize";
                        break;
                    case 3:
                        str = "photobooth";
                        break;
                    case 4:
                        str = "avatar";
                        break;
                    case 5:
                        str = "screenshare";
                        break;
                    case 6:
                        str = "dual_camera_on_call_start";
                        break;
                    case 7:
                        str = "dual_camera_on_flip";
                        break;
                    default:
                        str = "cowatch";
                        break;
                }
                oi6.A00(new PA1(str));
                switch (intValue) {
                    case 0:
                        ntz.A06 = true;
                        interfaceC19630xq = ntz.A0J.A01;
                        str2 = "video_call_cowatch_look_at_posts_tooltip_display_count";
                        break;
                    case 1:
                        ntz.A05 = true;
                        AbstractC50522MSa.A1T(ntz.A0J.A01, "video_call_cowatch_change_content_tooltip_display_count_v2", 0);
                        AbstractC53884NsG.A00(ntz.A0H).A03(EnumC53379NjU.A06, null, AbstractC167007dF.A0n("nux_type", "cowatch_watch_more"));
                        return;
                    case 2:
                        ntz.A0A = true;
                        interfaceC19630xq = ntz.A0J.A01;
                        str2 = "video_call_minimize_tooltip_display_count";
                        break;
                    case 3:
                        ntz.A0B = true;
                        interfaceC19630xq = ntz.A0J.A01;
                        str2 = "video_call_photobooth_tooltip_on_halo_display_count";
                        break;
                    case 4:
                        ntz.A03 = true;
                        return;
                    case 5:
                        ntz.A0C = true;
                        oi6.A00(C56590PAm.A00);
                        interfaceC19630xq = ntz.A0J.A01;
                        str2 = "video_call_screenshare_tooltip_display_count";
                        break;
                    case 6:
                        ntz.A07 = true;
                        interfaceC19630xq = ntz.A0J.A01;
                        str2 = "video_call_dual_camera_tooltip_on_call_start_display_count";
                        break;
                    case 7:
                        ntz.A07 = true;
                        interfaceC19630xq = ntz.A0J.A01;
                        str2 = "video_call_dual_camera_tooltip_on_flip_display_count";
                        break;
                    default:
                        throw B4Z.A00();
                }
                i = interfaceC19630xq.getInt(str2, 0) + 1;
                ARD = interfaceC19630xq.ARD();
                ARD.E7D(str2, i);
                ARD.apply();
                return;
            default:
                C52253NAt c52253NAt = (C52253NAt) this.A02;
                switch (AbstractC166987dD.A0H(this.A01)) {
                    case 0:
                        UserSession userSession2 = c52253NAt.A02;
                        C14360o3.A0B(userSession2, 0);
                        C41768Iek c41768Iek2 = C41768Iek.A00;
                        int i5 = C41768Iek.A02(userSession2, c41768Iek2).getInt("tag_products_tooltip_seen_count", 0);
                        InterfaceC19610xo ARD2 = C41768Iek.A02(userSession2, c41768Iek2).ARD();
                        ARD2.E7D("tag_products_tooltip_seen_count", i5 + 1);
                        ARD2.apply();
                        ARD = C41768Iek.A02(userSession2, c41768Iek2).ARD();
                        ARD.E7G("tag_products_tooltip_last_shown_time_sec", AbstractC43593JPy.A07());
                        ARD.apply();
                        return;
                    case 1:
                        userSession = c52253NAt.A02;
                        i3 = 0;
                        C14360o3.A0B(userSession, 0);
                        c41768Iek = C41768Iek.A00;
                        A02 = C41768Iek.A02(userSession, c41768Iek);
                        str2 = "tag_products_affiliate_post_tooltip_seen_count";
                        int i6 = A02.getInt(str2, i3);
                        ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
                        i = i6 + 1;
                        ARD.E7D(str2, i);
                        ARD.apply();
                        return;
                    case 2:
                        userSession = c52253NAt.A02;
                        i3 = 0;
                        C14360o3.A0B(userSession, 0);
                        c41768Iek = C41768Iek.A00;
                        A02 = C41768Iek.A02(userSession, c41768Iek);
                        str2 = "tag_products_collections_promotions_tooltip_seen_count";
                        int i62 = A02.getInt(str2, i3);
                        ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
                        i = i62 + 1;
                        ARD.E7D(str2, i);
                        ARD.apply();
                        return;
                    case 3:
                        userSession = c52253NAt.A02;
                        i3 = 0;
                        C14360o3.A0B(userSession, 0);
                        c41768Iek = C41768Iek.A00;
                        A02 = C41768Iek.A02(userSession, c41768Iek);
                        str2 = "stories_font_selection_tooltip_seen_count";
                        int i622 = A02.getInt(str2, i3);
                        ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
                        i = i622 + 1;
                        ARD.E7D(str2, i);
                        ARD.apply();
                        return;
                    case 4:
                        userSession = c52253NAt.A02;
                        i3 = 0;
                        C14360o3.A0B(userSession, 0);
                        c41768Iek = C41768Iek.A00;
                        A02 = C41768Iek.A02(userSession, c41768Iek);
                        str2 = "tag_products_affiliate_story_tooltip_seen_count";
                        int i6222 = A02.getInt(str2, i3);
                        ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
                        i = i6222 + 1;
                        ARD.E7D(str2, i);
                        ARD.apply();
                        return;
                    case 5:
                    case 6:
                        userSession = c52253NAt.A02;
                        i3 = 0;
                        C14360o3.A0B(userSession, 0);
                        c41768Iek = C41768Iek.A00;
                        A02 = C41768Iek.A02(userSession, c41768Iek);
                        str2 = "tag_products_products_tab_tooltip_seen_count";
                        int i62222 = A02.getInt(str2, i3);
                        ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
                        i = i62222 + 1;
                        ARD.E7D(str2, i);
                        ARD.apply();
                        return;
                    default:
                        return;
                }
        }
    }
}
