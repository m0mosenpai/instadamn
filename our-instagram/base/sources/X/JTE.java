package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.HashtagImpl;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class JTE implements InterfaceC13000lm {
    public final UserSession A00;
    public final HashSet A01;

    public JTE(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC166987dD.A1H();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.MUD r7, X.InterfaceC11380iw r8, X.C5HW r9, java.lang.String r10, int r11) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTE.A0F(X.MUD, X.0iw, X.5HW, java.lang.String, int):void");
    }

    public final void A0G(MUD mud, InterfaceC11380iw interfaceC11380iw, C5HW c5hw, String str, String str2, String str3, int i) {
        List list;
        MUP mup;
        JTF jtf;
        String str4;
        List A0m;
        AbstractC167017dG.A1R(str, interfaceC11380iw);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, this.A00), "newsfeed_story_hide");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("module_name", interfaceC11380iw.getModuleName());
            c0Zx.A06("channel_id", A07(c0Zx, c5hw, A06(c0Zx, c5hw)));
            if (str2 != null) {
                c0Zx.A06("clicked_filters", str2);
            }
            A0f.A9K("af_candidate_id", A04(A0f, this, c5hw, str));
            A0B(A0f, c5hw);
            A0f.A9K("af_candidate_id", c5hw.A04.A0Q);
            AbstractC31175DnJ.A0z(A0f, i);
            AbstractC37302Gc3.A0t(A0f);
            A0C(A0f, c5hw);
            String str5 = null;
            if (str2 != null && (A0m = AbstractC167007dF.A0m(str2, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null) {
                list = AbstractC001800i.A0a(A0m);
            } else {
                list = null;
            }
            A0f.AAk("selected_filters", list);
            A0f.AAP("pill", str3);
            if (mud != null) {
                mup = (MUP) mud.A00;
            } else {
                mup = null;
            }
            A0f.AAQ(A02(mup), "truncation_logging_data");
            if (c5hw.A0I()) {
                jtf = JTF.UNSEEN;
            } else {
                jtf = JTF.NONE;
            }
            A0f.A8R(jtf, "highlight_type");
            if (mud != null) {
                str4 = mud.A01;
            } else {
                str4 = null;
            }
            A0f.AAP("notification_feed_session_id", str4);
            if (mud != null) {
                str5 = mud.A02;
            }
            A0f.AAP("notification_feed_visit_id", str5);
            A0f.AAQ(c0Zx, "extra_data");
            A0f.Cht();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(X.MUD r7, X.InterfaceC11380iw r8, X.C5HW r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTE.A0H(X.MUD, X.0iw, X.5HW, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(X.InterfaceC11380iw r16, X.C51693MsO r17, X.C5HW r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JTE.A0I(X.0iw, X.MsO, X.5HW, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final JTD A00(C5HW c5hw) {
        Object c09540e5;
        try {
            String str = c5hw.A0D;
            if (str == null) {
                str = "";
            }
            c09540e5 = JTD.valueOf(AbstractC166997dE.A10(Locale.ROOT, str));
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        if (c09540e5 instanceof C09540e5) {
            c09540e5 = null;
        }
        JTD jtd = (JTD) c09540e5;
        if (jtd == null) {
            return JTD.OTHER_STORIES;
        }
        return jtd;
    }

    public static final JTD A01(String str) {
        Object c09540e5;
        try {
            c09540e5 = JTD.valueOf(AbstractC166997dE.A10(Locale.ROOT, str));
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        if (c09540e5 instanceof C09540e5) {
            c09540e5 = null;
        }
        JTD jtd = (JTD) c09540e5;
        if (jtd == null) {
            return JTD.OTHER_STORIES;
        }
        return jtd;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0Zx, X.Jtb] */
    public static final C44861Jtb A02(MUP mup) {
        if (mup != null && mup.A02) {
            ?? c0Zx = new C0Zx();
            c0Zx.A05("show_more_position", AbstractC31171DnF.A0V(mup.A01));
            c0Zx.A03("is_show_more_clicked", AbstractC31172DnG.A0s(mup.A03));
            return c0Zx;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.Jtc] */
    private final C44862Jtc A03(C5HW c5hw, String str) {
        List list;
        Long l;
        ?? c0Zx = new C0Zx();
        c0Zx.A01(EnumC37319GcL.ACTIVITY_FEED, "notification_channel");
        c0Zx.A05("recipient_ig_id", Long.valueOf(AbstractC167027dH.A03(str)));
        c0Zx.A06("notification_type", c5hw.A0C);
        c0Zx.A07("mentioned_user_ids", A0A(c5hw));
        C206259Bi c206259Bi = c5hw.A04.A07;
        Long l2 = null;
        if (c206259Bi != null) {
            list = (List) c206259Bi.A03;
        } else {
            list = null;
        }
        c0Zx.A07("mentioned_content_ids", list);
        C206259Bi c206259Bi2 = c5hw.A04.A07;
        if (c206259Bi2 != null) {
            l = (Long) c206259Bi2.A02;
        } else {
            l = null;
        }
        c0Zx.A05("content_id", l);
        C206259Bi c206259Bi3 = c5hw.A04.A07;
        if (c206259Bi3 != null) {
            l2 = (Long) c206259Bi3.A01;
        }
        c0Zx.A05("ad_id", l2);
        return c0Zx;
    }

    public static final Long A05(C5HW c5hw) {
        String A09 = c5hw.A09("merchant_id");
        if (A09 == null && (A09 = c5hw.A09("business_user_id")) == null) {
            return null;
        }
        return AbstractC166997dE.A0j(A09);
    }

    public static String A06(C0Zx c0Zx, C5HW c5hw) {
        c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c5hw.A05.toString());
        C121695fL c121695fL = c5hw.A04.A0I;
        if (c121695fL != null) {
            return c121695fL.A0F;
        }
        return null;
    }

    public static String A07(C0Zx c0Zx, C5HW c5hw, String str) {
        c0Zx.A06("tip_id", str);
        C121695fL c121695fL = c5hw.A04.A0I;
        if (c121695fL != null) {
            return c121695fL.A04;
        }
        return null;
    }

    public static final String A09(Integer num) {
        if (num == null) {
            return "custom_button";
        }
        switch (num.intValue()) {
            case 0:
                return "follow";
            case 1:
                return "unfollow";
            case 2:
                return "confirm";
            case 3:
                return "request_cancelled";
            case 4:
                return "unblock";
            case 5:
                return "delete";
            default:
                return "custom_button";
        }
    }

    public static final List A0A(C5HW c5hw) {
        List list;
        C5HX c5hx = c5hw.A04;
        C206259Bi c206259Bi = c5hx.A07;
        if (c206259Bi == null || (list = (List) c206259Bi.A04) == null) {
            List list2 = c5hx.A0y;
            if (list2 == null) {
                return AbstractC16960so.A1R(AbstractC37302Gc3.A0W(c5hx.A0f), AbstractC37302Gc3.A0V(c5hw.A04.A0l));
            }
            return list2;
        }
        return list;
    }

    public static void A0B(InterfaceC02590Ai interfaceC02590Ai, C5HW c5hw) {
        interfaceC02590Ai.AAP("tuuid", c5hw.A04.A0s);
        interfaceC02590Ai.A8R(A00(c5hw), "section");
    }

    public static void A0C(InterfaceC02590Ai interfaceC02590Ai, C5HW c5hw) {
        interfaceC02590Ai.AAP(AbstractC111324zv.A00(4179), c5hw.A04.A0d);
        interfaceC02590Ai.AAP("time_bucket", A08(c5hw.A06));
    }

    public static void A0D(C0Zx c0Zx, C5HW c5hw, String str) {
        c0Zx.A06("collection_id", str);
        c0Zx.A06("collection_type", c5hw.A09("collection_type"));
        c0Zx.A06(DialogModule.KEY_TITLE, c5hw.A09(DialogModule.KEY_TITLE));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public static Long A04(InterfaceC02590Ai interfaceC02590Ai, JTE jte, C5HW c5hw, String str) {
        interfaceC02590Ai.AAQ(jte.A03(c5hw, str), "notif_logging_data");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("activity_feed_tab", "all");
        c0Zx.A06(AbstractC111324zv.A00(3863), c5hw.A04.A0V);
        c0Zx.A06("af_agg_id", c5hw.A09);
        interfaceC02590Ai.AAQ(c0Zx, "activity_feed_data");
        interfaceC02590Ai.A9K("story_type", Long.valueOf(c5hw.A00));
        return c5hw.A04.A0Q;
    }

    public static final String A08(Integer num) {
        switch (num.intValue()) {
            case 2:
                return "TODAY";
            case 3:
                return "YESTERDAY";
            case 4:
                return "LAST_7_DAYS";
            case 5:
                return "LAST_30_DAYS";
            case 6:
                return "OLDER";
            default:
                return null;
        }
    }

    public static final void A0E(InterfaceC11380iw interfaceC11380iw, JTE jte, C5HW c5hw, String str, int i) {
        String str2;
        String str3;
        String str4;
        HashSet A0C;
        Object[] array;
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, str);
        A00.A0C("story_id", c5hw.A09);
        A00.A08(Integer.valueOf(c5hw.A00), "story_type");
        A00.A0C("tuuid", c5hw.A04.A0s);
        A00.A0C("section", c5hw.A0D);
        A00.A08(Integer.valueOf(i), "position");
        A00.A0B("af_candidate_id", c5hw.A04.A0Q);
        HashtagImpl A02 = c5hw.A02();
        if (A02 != null) {
            A00.A0C("tag_id", A02.A0C);
        }
        A00.A0C("tab", "you");
        String A04 = C16030qx.A02.A04(AbstractC12290kX.A00);
        if (A04 != null) {
            A00.A0C("physical_device_id", A04);
        }
        C19260xA c19260xA = new C19260xA();
        C19260xA.A00(c19260xA, interfaceC11380iw.getModuleName(), "module_name");
        C19260xA.A00(c19260xA, c5hw.A05.toString(), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        C121695fL c121695fL = c5hw.A04.A0I;
        if (c121695fL != null) {
            str2 = c121695fL.A0F;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            C19260xA.A00(c19260xA, str2, "tip_id");
        }
        C121695fL c121695fL2 = c5hw.A04.A0I;
        if (c121695fL2 != null) {
            str3 = c121695fL2.A04;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            C19260xA.A00(c19260xA, str3, "channel_id");
        }
        String A08 = c5hw.A08();
        if (A08 != null) {
            C19260xA.A00(c19260xA, A08, "event_id");
        }
        C5Hd c5Hd = c5hw.A05;
        if ((c5Hd == C5Hd.USER_COMMENT_LIKED_SINGLE_MEDIA || c5Hd == C5Hd.USER_SINGLE_MEDIA) && (str4 = c5hw.A04.A0b) != null) {
            C19260xA.A00(c19260xA, str4, "comment_id");
        }
        String str5 = "product_id";
        String A09 = c5hw.A09("product_id");
        String A092 = c5hw.A09("collection_id");
        if (A09 == null) {
            if (A092 != null) {
                C19260xA.A00(c19260xA, A092, "collection_id");
                C19260xA.A00(c19260xA, c5hw.A09("collection_type"), "collection_type");
                str5 = DialogModule.KEY_TITLE;
                A09 = c5hw.A09(DialogModule.KEY_TITLE);
            }
            A0C = c5hw.A0C();
            if (A0C != null && (array = A0C.toArray(new String[0])) != null) {
                C19260xA.A00(c19260xA, array.toString(), "highlighted_notifications");
            }
            A00.A05(c19260xA, "extra_data");
            AbstractC31173DnH.A1S(A00, jte.A00);
        }
        C19260xA.A00(c19260xA, A09, str5);
        String A093 = c5hw.A09("merchant_name");
        if (A093 == null) {
            A093 = c5hw.A09("business_username");
        }
        C19260xA.A00(c19260xA, A093, "merchant_name");
        String A094 = c5hw.A09("merchant_id");
        if (A094 == null) {
            A094 = c5hw.A09("business_user_id");
        }
        C19260xA.A00(c19260xA, A094, "merchant_id");
        A0C = c5hw.A0C();
        if (A0C != null) {
            C19260xA.A00(c19260xA, array.toString(), "highlighted_notifications");
        }
        A00.A05(c19260xA, "extra_data");
        AbstractC31173DnH.A1S(A00, jte.A00);
    }
}
