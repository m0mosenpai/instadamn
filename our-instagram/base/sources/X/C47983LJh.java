package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.LJh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47983LJh {
    public final C26069Bfx A00;
    public final LGT A01;

    public static final C44881Jtv A01(C47983LJh c47983LJh, Integer num, Integer num2) {
        return A00(c47983LJh, null, null, num, num2, null, null, null, null);
    }

    public static void A02(C44881Jtv c44881Jtv, C47983LJh c47983LJh) {
        c47983LJh.A01.A01(c44881Jtv, c47983LJh.A00.A03);
    }

    public final void A03(List list) {
        C44881Jtv A00 = A00(this, null, null, C05F.A01, null, null, null, null, list);
        LGT lgt = this.A01;
        String str = this.A00.A03;
        AbstractC167017dG.A1N(str, A00);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lgt.A02, "client_load_appreciationfeed_init");
        if (A0f.isSampled()) {
            JQ0.A13(LGT.A00(A0f, lgt, AbstractC50529MSi.A01(), str), A0f, A00);
            A0f.Cht();
        }
    }

    public /* synthetic */ C47983LJh(C26069Bfx c26069Bfx, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        LGT lgt = new LGT(AbstractC12220kQ.A01(interfaceC11380iw, userSession));
        this.A00 = c26069Bfx;
        this.A01 = lgt;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.Jtv] */
    public static final C44881Jtv A00(C47983LJh c47983LJh, Boolean bool, Boolean bool2, Integer num, Integer num2, Long l, String str, String str2, List list) {
        String str3;
        String str4;
        switch (num.intValue()) {
            case 0:
                str3 = "appreciation_gift_awareness";
                break;
            case 1:
                str3 = "appreciation_feed";
                break;
            case 2:
                str3 = "appreciation_feed_onboarding";
                break;
            case 3:
                str3 = "appreciation_feed_overflow_menu";
                break;
            case 4:
                str3 = "appreciation_feed_disclaimer";
                break;
            default:
                str3 = "facebook_banner";
                break;
        }
        C26069Bfx c26069Bfx = c47983LJh.A00;
        String str5 = c26069Bfx.A02;
        String str6 = c26069Bfx.A00;
        String str7 = c26069Bfx.A01;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str4 = "unlike";
                    break;
                case 2:
                    str4 = "filter";
                    break;
                case 3:
                    str4 = "profile";
                    break;
                case 4:
                    str4 = AbstractC111324zv.A00(1160);
                    break;
                case 5:
                    str4 = "onboarding";
                    break;
                case 6:
                    str4 = "dismiss";
                    break;
                case 7:
                    str4 = "not_now";
                    break;
                case 8:
                    str4 = "story";
                    break;
                case 9:
                    str4 = "block_user";
                    break;
                case 10:
                    str4 = "unblock_user";
                    break;
                case 11:
                    str4 = AbstractC111324zv.A00(3011);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str4 = "exit";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str4 = "learn_more";
                    break;
                default:
                    str4 = "like";
                    break;
            }
        } else {
            str4 = null;
        }
        AbstractC167027dH.A13(str5, str6, str7);
        ?? c0Zx = new C0Zx();
        AbstractC43592JPx.A1N(c0Zx, str3);
        c0Zx.A06("media_id", str5);
        c0Zx.A06("receiver_id", str6);
        c0Zx.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        if (str4 != null && AbstractC25225BEi.A1Y(str4)) {
            c0Zx.A06("target_name", str4);
        }
        if (bool != null) {
            c0Zx.A03("has_next_page", Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            c0Zx.A03("is_receiver_onboarded", Boolean.valueOf(bool2.booleanValue()));
        }
        if (list != null) {
            c0Zx.A07("displayed_transaction_ids", list);
        }
        if (str != null) {
            c0Zx.A06(AbstractC58317Pt9.A00(138), str);
        }
        if (str2 != null) {
            c0Zx.A06("sender_id", str2);
        }
        if (l != null) {
            c0Zx.A06("selected_filter_gift_id", AbstractC43592JPx.A0y(l));
        }
        return c0Zx;
    }
}
