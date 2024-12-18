package X;

import android.util.JsonWriter;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.api.schemas.MediaType;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.OdF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55152OdF {
    public static final C1ON A00(UserSession userSession, C84923qg c84923qg, C38321qM c38321qM, String str, String str2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        Integer num;
        String str4;
        String str5;
        String str6;
        String str7;
        Long l;
        String str8;
        JML Bns;
        AbstractC167007dF.A1E(c84923qg, 0, userSession);
        String str9 = c84923qg.A0e;
        String str10 = c84923qg.A0G;
        boolean A1R = AbstractC167007dF.A1R(0, str9, str10);
        Matcher A09 = AbstractC13670mt.A09(str9);
        ArrayList A1E = AbstractC166987dD.A1E();
        while (A09.find()) {
            String group = A09.group(A1R ? 1 : 0);
            if (group != null) {
                A1E.add(AbstractC002300n.A0d(group, "@", "", false));
            }
        }
        C186808Px A00 = AbstractC186788Pv.A00(userSession);
        if (AbstractC25226BEj.A1b(A1E)) {
            A00.A01(str10, A1E);
        }
        String str11 = null;
        if (c38321qM != null) {
            str3 = c38321qM.A0C.BJN();
            num = c38321qM.A2P();
        } else {
            str3 = null;
            num = C05F.A0C;
        }
        String A14 = AbstractC25225BEi.A14();
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC31173DnH.A1Q(A0c, "media/%s/comment/", new Object[]{c84923qg.A0E});
        A0c.A0P(null, N3H.class, OPS.class, false);
        A0c.A9s("comment_text", str9);
        A0c.A9s("idempotence_token", c84923qg.A00());
        A0c.A9s("user_breadcrumb", AbstractC62866SUp.A00(c84923qg.A04, str9.length(), c84923qg.A00));
        A0c.A9s("container_module", str);
        A0c.A9s("radio_type", str2);
        A0c.A9s("replied_to_comment_id", c84923qg.A0d);
        A0c.A0I("is_carousel_bumped_post", z);
        A0c.A0H("inventory_source", str3);
        A0c.A0H("nav_chain", A14);
        A0c.A0I("is_from_direct_channel", z3);
        A0c.A0I("is_offline_request", z4);
        if (i != -1) {
            A0c.A9s("feed_position", String.valueOf(i));
        }
        if (i2 != -1) {
            A0c.A9s("carousel_index", String.valueOf(i2));
        }
        if (i3 != -1) {
            A0c.A9s("recs_ix", String.valueOf(i3));
        }
        if (num != C05F.A0C) {
            A0c.A9s("delivery_class", AbstractC86623ta.A00(num));
        }
        C38321qM c38321qM2 = c84923qg.A07;
        if (c38321qM2 != null) {
            str4 = c38321qM2.A0C.getLoggingInfoToken();
        } else {
            str4 = null;
        }
        A0c.A0H("logging_info_token", str4);
        C38321qM c38321qM3 = c84923qg.A07;
        if (c38321qM3 != null && (Bns = c38321qM3.A0C.Bns()) != null) {
            str5 = Bns.Bnr();
        } else {
            str5 = null;
        }
        A0c.A0H("repost_id", str5);
        if (c38321qM != null && c38321qM.CdW() == A1R) {
            A0c.A0H("tracking_token", c38321qM.A33());
        }
        CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf = c84923qg.A0T;
        if (commentGiphyMediaInfoIntf != null) {
            String B9n = commentGiphyMediaInfoIntf.B9n();
            Boolean Cdg = commentGiphyMediaInfoIntf.Cdg();
            str6 = null;
            if (B9n != null && Cdg != null) {
                try {
                    StringWriter A0O = AbstractC37300Gc1.A0O();
                    JsonWriter endObject = MSY.A0C(A0O).name("gif_media_id").value(B9n).name("is_sticker").value(Cdg.booleanValue()).endObject();
                    if (endObject != null) {
                        endObject.close();
                        str6 = A0O.toString();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } catch (IOException | NullPointerException e) {
                    C0w9.A07("CommentApiUtil", e);
                }
            }
        } else {
            str6 = null;
        }
        A0c.A0H("gif_params", str6);
        C115925Mi c115925Mi = c84923qg.A05;
        if (c115925Mi != null) {
            String str12 = c115925Mi.A05;
            String str13 = c115925Mi.A06;
            MediaType mediaType = c115925Mi.A00;
            Integer num2 = c115925Mi.A01;
            str7 = null;
            if (mediaType != null && str12 != null && str13 != null && num2 != null) {
                try {
                    StringWriter A0O2 = AbstractC37300Gc1.A0O();
                    JsonWriter A0H = AbstractC50522MSa.A0H(mediaType, c115925Mi, A0O2, str12, str13);
                    if (1 - num2.intValue() != 0) {
                        str8 = "COMMENTS_CONTEXTUAL_RECOMMENDATION";
                    } else {
                        str8 = "COMMENTS";
                    }
                    JsonWriter endObject2 = A0H.value(str8).endObject();
                    if (endObject2 != null) {
                        endObject2.close();
                        str7 = A0O2.toString();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } catch (IOException | NullPointerException e2) {
                    C0w9.A07("CommentApiUtil", e2);
                }
            }
        } else {
            str7 = null;
        }
        A0c.A0H("avatar_params", str7);
        if (C18U.A06(C06090Tz.A05, userSession, 36323264271887486L)) {
            A0c.A9s("include_carousel_child_mentions", "true");
            A0c.A0I("is_from_carousel_child_thread", z2);
        }
        List list = c84923qg.A0H;
        if (list != null) {
            A0c.A0H("carousel_child_mentions", String.valueOf(list));
        }
        A0c.A9s("comment_creation_key", c84923qg.A0G);
        A0c.A9s("include_e2ee_mentioned_user_list", "true");
        A0c.A9s("include_media_code", "true");
        List list2 = null;
        if (c38321qM != null) {
            C130175uN c130175uN = C130175uN.A00;
            l = C130175uN.A00(c38321qM);
            list2 = c130175uN.A01(null, userSession, c38321qM);
        } else {
            l = null;
        }
        String A002 = AbstractC111324zv.A00(490);
        if (l != null) {
            A0c.A0E(A002, l.longValue());
        }
        if (list2 != null) {
            str11 = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "[", "]", list2, null);
        }
        A0c.A0H("fully_visible_media_note_ids", str11);
        return AbstractC31172DnG.A0U(A0c, A1R);
    }

    public static final C1ON A01(UserSession userSession, C38321qM c38321qM, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        Integer num;
        AbstractC167007dF.A1D(userSession, 0, str);
        if (c38321qM != null) {
            str3 = c38321qM.A0C.BJN();
            num = c38321qM.A2P();
        } else {
            str3 = null;
            num = C05F.A0C;
        }
        String A14 = AbstractC25225BEi.A14();
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("media/%s/comment_like/", str);
        A0c.A0P(null, C52084N2k.class, OPR.class, false);
        A0c.A0I("is_carousel_bumped_post", z);
        A0c.A0H("nav_chain", A14);
        A0c.A0I("is_feed_preview_comment", z2);
        A0c.A9s("is_reply_highlight", "false");
        if (str2 != null) {
            A0c.A9s("container_module", str2);
        }
        if (str3 != null) {
            A0c.A9s("inventory_source", str3);
        }
        if (c38321qM != null) {
            A0c.A9s("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
        }
        if (i != -1) {
            A0c.A9s("feed_position", String.valueOf(i));
        }
        if (i2 != -1) {
            A0c.A9s("carousel_index", String.valueOf(i2));
        }
        if (num != C05F.A0C) {
            A0c.A9s("delivery_class", AbstractC86623ta.A00(num));
        }
        if (c38321qM != null && c38321qM.CdW()) {
            A0c.A0H("tracking_token", c38321qM.A33());
        }
        return AbstractC31172DnG.A0U(A0c, true);
    }

    public static final C1ON A02(UserSession userSession, C38321qM c38321qM, String str, String str2, int i, int i2, boolean z, boolean z2) {
        String str3;
        Integer num;
        AbstractC167007dF.A1D(userSession, 0, str);
        if (c38321qM != null) {
            str3 = c38321qM.A0C.BJN();
            num = c38321qM.A2P();
        } else {
            str3 = null;
            num = C05F.A0C;
        }
        String A14 = AbstractC25225BEi.A14();
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("media/%s/comment_unlike/", str);
        A0c.A0P(null, C52084N2k.class, OPR.class, false);
        A0c.A0I("is_carousel_bumped_post", z);
        A0c.A0H("nav_chain", A14);
        A0c.A0I("is_feed_preview_comment", z2);
        A0c.A9s("is_reply_highlight", "false");
        if (str2 != null) {
            A0c.A9s("container_module", str2);
        }
        if (str3 != null) {
            A0c.A9s("inventory_source", str3);
        }
        if (i != -1) {
            String valueOf = String.valueOf(i);
            A0c.A9s("feed_position", valueOf);
            A0c.A9s("m_ix", valueOf);
        }
        if (i2 != -1) {
            A0c.A9s("carousel_index", String.valueOf(i2));
        }
        if (num != C05F.A0C) {
            A0c.A9s("delivery_class", AbstractC86623ta.A00(num));
        }
        if (c38321qM != null && c38321qM.CdW()) {
            A0c.A0H("tracking_token", c38321qM.A33());
        }
        return AbstractC31172DnG.A0U(A0c, true);
    }

    public static final void A04(C52084N2k c52084N2k, String str) {
        String str2;
        String str3;
        String str4;
        HashMap A11 = AbstractC31174DnI.A11(str, 1);
        String str5 = "";
        if (c52084N2k == null || (str2 = Integer.valueOf(c52084N2k.mStatusCode).toString()) == null) {
            str2 = "";
        }
        A11.put(TraceFieldType.ErrorCode, str2);
        if (c52084N2k == null || (str3 = c52084N2k.A00) == null) {
            str3 = "comment_like_client_error";
        }
        A11.put("error_key", str3);
        if (c52084N2k != null && (str4 = c52084N2k.A00) != null) {
            str5 = str4;
        }
        A11.put("error_message", str5);
        A11.put("c_pk", str);
        ((C28191Xx) AbstractC53854Nri.A00()).A00 = new C54590O9r("latest_comment_like_error", A11);
    }

    public static final C1ON A03(UserSession userSession, String str, String str2, java.util.Set set) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("media/%s/comment/bulk_delete/", str);
        A0c.A0R(N2Y.class, ONN.class);
        A0c.A9s("comment_ids_to_delete", C71473Il.A00(',').A02(set));
        return MSY.A0I(A0c, "container_module", str2);
    }
}
