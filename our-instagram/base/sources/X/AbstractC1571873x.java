package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.archive.api.IGProfileArchiveHighlightQueryResponseImpl;
import com.instagram.archive.api.IGProfileUnarchiveHighlightQueryResponseImpl;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.73x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1571873x {
    public static final C1ON A00(EnumC53243Ngg enumC53243Ngg, UserSession userSession, String str, String str2, String str3, String str4, List list, java.util.Set set, int i, int i2, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC53243Ngg, 1);
        C14360o3.A0B(set, 2);
        C14360o3.A0B(str, 3);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("highlights/create_reel/");
        c25621Ms.A9s("creation_id", String.valueOf(System.currentTimeMillis()));
        c25621Ms.A9s(CacheBehaviorLogger.SOURCE, enumC53243Ngg.name());
        c25621Ms.A9s("media_ids", jSONArray.toString());
        c25621Ms.A9s(DialogModule.KEY_TITLE, str);
        c25621Ms.A0I("should_add_to_main_grid", z);
        Pair A00 = AnonymousClass566.A00(userSession);
        Object obj = A00.first;
        C14360o3.A06(obj);
        c25621Ms.A0H((String) obj, (String) A00.second);
        A08(c25621Ms, str2, str3, list, i, i2);
        if (str4 != null) {
            c25621Ms.A9s("suggested_reel_id", str4);
        }
        c25621Ms.A0R(EBB.class, C54860ONl.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A01(EnumC53243Ngg enumC53243Ngg, UserSession userSession, String str, String str2, String str3, String str4, List list, java.util.Set set, java.util.Set set2, int i, int i2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(enumC53243Ngg, 2);
        C14360o3.A0B(set, 3);
        C14360o3.A0B(set2, 4);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(it2.next());
        }
        String A06 = AbstractC13670mt.A06("highlights/%s/edit_reel/", str);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B(A06);
        c25621Ms.A9s(CacheBehaviorLogger.SOURCE, enumC53243Ngg.name());
        c25621Ms.A9s("added_media_ids", jSONArray.toString());
        c25621Ms.A9s("removed_media_ids", jSONArray2.toString());
        if (str2 != null) {
            c25621Ms.A9s(DialogModule.KEY_TITLE, str2);
        }
        Pair A00 = AnonymousClass566.A00(userSession);
        Object obj = A00.first;
        C14360o3.A06(obj);
        c25621Ms.A0H((String) obj, (String) A00.second);
        if (list != null) {
            A08(c25621Ms, str3, str4, list, i, i2);
        }
        c25621Ms.A0P(null, EBB.class, C54860ONl.class, false);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r8 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1ON A02(X.C1P1 r6, com.instagram.common.session.UserSession r7, boolean r8, boolean r9) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.0sy r0 = X.C08730cb.A00(r7)
            com.instagram.user.model.User r3 = r0.A00()
            X.17P r0 = r3.A03
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r2 = r0.BlR()
            if (r9 != 0) goto L18
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r0 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A07
            if (r2 != r0) goto L1b
        L18:
            r5 = 1
            if (r8 == 0) goto L68
        L1b:
            r5 = 0
            if (r8 == 0) goto L68
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r1 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A05
        L20:
            X.17P r0 = r3.A03
            r0.EcH(r1)
            r0 = -2
            X.1Ms r4 = new X.1Ms
            r4.<init>(r7, r0)
            r4.A05()
            r0 = 1702(0x6a6, float:2.385E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            r4.A0B(r0)
            if (r8 == 0) goto L65
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r0 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A05
        L3b:
            java.lang.String r1 = r0.A00
            r0 = 939(0x3ab, float:1.316E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r4.A9s(r0, r1)
            if (r5 == 0) goto L4f
            java.lang.String r1 = "check_pending_archive"
            java.lang.String r0 = "1"
            r4.A9s(r1, r0)
        L4f:
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r4.A0R(r1, r0)
            r0 = 1
            r4.A0R = r0
            X.1ON r1 = r4.A0N()
            X.NA9 r0 = new X.NA9
            r0.<init>(r2, r6, r3)
            r1.A00 = r0
            return r1
        L65:
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r0 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A04
            goto L3b
        L68:
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r1 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A04
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1571873x.A02(X.1P1, com.instagram.common.session.UserSession, boolean, boolean):X.1ON");
    }

    public static final C1ON A03(UserSession userSession, Integer num, String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(userSession, 0);
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("max_id", str);
        c1Ee.A05("include_memories", String.valueOf(z));
        String A01 = c1Ee.A01(AnonymousClass001.A0R("v1:", "archive/reel/day_shells_paginated/"));
        C14360o3.A07(A01);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("archive/reel/day_shells_paginated/");
        c25621Ms.A9s("max_id", str);
        if (z) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        c25621Ms.A9s("include_memories", str3);
        c25621Ms.A9s("reel_id", str2);
        c25621Ms.A9s("timezone_offset", String.valueOf(C23831Eq.A00()));
        c25621Ms.A07 = num;
        c25621Ms.A0A = A01;
        c25621Ms.A0P(null, N2Z.class, C54859ONk.class, false);
        return c25621Ms.A0N();
    }

    public static final C1ON A04(UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str2, 2);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B(AbstractC13670mt.A06("archive/reel/%s/mark_memory_seen/", str));
        c25621Ms.A9s(CacheBehaviorLogger.SOURCE, str2);
        c25621Ms.A0I("did_dismiss_badge", z);
        c25621Ms.A9s("timezone_offset", String.valueOf(C23831Eq.A00()));
        c25621Ms.A0P(null, C40781ul.class, C55702hA.class, false);
        return c25621Ms.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r13, 36322233479604286L) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C98934cD A05(android.content.Context r12, com.instagram.common.session.UserSession r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.String r19, boolean r20) {
        /*
            r5 = 0
            X.C14360o3.A0B(r12, r5)
            r3 = 1
            X.C14360o3.A0B(r13, r3)
            r0 = 2
            r1 = r19
            X.C14360o3.A0B(r1, r0)
            r0 = 3
            r6 = r17
            X.C14360o3.A0B(r6, r0)
            java.lang.String r2 = "highlights/"
            java.lang.String r0 = "/highlights_tray/"
            java.lang.String r4 = X.AnonymousClass001.A0g(r2, r1, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r9 = r0.toString()
            X.C14360o3.A07(r9)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r10 = r0.toString()
            X.C14360o3.A07(r10)
            r11 = 0
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r13, r0)
            java.lang.Integer r0 = X.C05F.A0N
            r2.A09(r0)
            r2.A0B(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r3 = r16
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 != 0) goto L51
            r2.A07 = r6
            r2.A0A = r4
        L51:
            java.lang.Class<X.3LZ> r4 = X.C3LZ.class
            java.lang.Class<X.1Mn> r0 = X.C25571Mn.class
            r2.A0P(r11, r4, r0, r5)
            android.util.Pair r0 = X.AnonymousClass566.A00(r13)
            java.lang.Object r4 = r0.first
            X.C14360o3.A06(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r2.A0H(r4, r0)
            if (r20 == 0) goto L74
            X.1CM r0 = new X.1CM
            r0.<init>(r12)
            X.AbstractC23841Er.A00(r12, r2, r13, r0, r5)
        L74:
            java.lang.String r0 = "max_highlights_to_fetch_on_pagination"
            r4 = r18
            r2.A0A(r4, r0)
            java.lang.String r0 = r13.userId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L91
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36322233479604286(0x810ae10000283e, double:3.033664938171942E-306)
            boolean r0 = X.C18U.A06(r4, r13, r0)
            r1 = 1
            if (r0 != 0) goto L92
        L91:
            r1 = 0
        L92:
            java.lang.String r0 = "should_include_my_week_preview"
            r2.A0I(r0, r1)
            java.lang.String r0 = "fetch_high_res_cover_image"
            r2.A0F(r0, r14)
            java.lang.String r0 = "check_highlights_subtab_gating"
            r2.A0F(r0, r15)
            java.lang.String r0 = "com.instagram.barcelona"
            java.lang.String r1 = X.AbstractC14490oL.A05(r12, r0)
            java.lang.String r0 = "threads_app_version"
            r2.A9s(r0, r1)
            java.lang.String r0 = "only_fetch_archived_highlights"
            r2.A0F(r0, r3)
            X.1ON r5 = r2.A0N()
            java.lang.Integer r7 = X.C05F.A15
            java.lang.Integer r8 = X.C05F.A0C
            X.4cD r4 = new X.4cD
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1571873x.A05(android.content.Context, com.instagram.common.session.UserSession, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, boolean):X.4cD");
    }

    public static final void A06(Context context, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, C3YU c3yu, EnumC114765Gh enumC114765Gh) {
        String str;
        if (c3yu == C3YU.A04) {
            str = "media/%s/only_me/";
        } else {
            str = "media/%s/undo_only_me/";
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B(AbstractC13670mt.A06(str, c38321qM.getId()));
        c25621Ms.A9s("media_id", c38321qM.getId());
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        C1ON A0N = c25621Ms.A0N();
        C6WQ c6wq = new C6WQ(context, true);
        c6wq.A00(context.getString(2131965660));
        c6wq.setOwnerActivity(AbstractC13330mJ.A00(context));
        A0N.A00 = new HGW(context, userSession, c38321qM, c3yu, c6wq, enumC114765Gh);
        if (c1p1 != null) {
            A0N.A00 = c1p1;
        }
        C1GJ.A01().schedule(A0N);
    }

    public static final void A07(Context context, UserSession userSession, C38321qM c38321qM) {
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            C1ON A02 = AbstractC55151OdE.A02(userSession, A2u);
            C3YU c3yu = C3YU.A04;
            C6WQ c6wq = new C6WQ(context, true);
            c6wq.A00(context.getString(2131965660));
            c6wq.setOwnerActivity(AbstractC13330mJ.A00(context));
            A02.A00 = new HGW(context, userSession, c38321qM, c3yu, c6wq, null);
            C1GJ.A01().schedule(A02);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A09(YOz yOz, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A04("highlight_id", str);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGProfileArchiveHighlightQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), IGProfileArchiveHighlightQueryResponseImpl.class, true, null, 0, null, "xdt_archive_highlight", new ArrayList());
        AbstractC40691uc.A01(userSession).A01(new YAU(yOz), new YAW(yOz), pandoGraphQLRequest);
    }

    public static final void A0A(YOz yOz, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A04("highlight_id", str);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGProfileUnarchiveHighlightQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), IGProfileUnarchiveHighlightQueryResponseImpl.class, true, null, 0, null, "xdt_unarchive_highlight", new ArrayList());
        AbstractC40691uc.A01(userSession).A01(new YAV(yOz), new YAX(yOz), pandoGraphQLRequest);
    }

    public static final void A08(C25621Ms c25621Ms, String str, String str2, List list, int i, int i2) {
        Object[] objArr;
        String str3;
        String A06;
        if (str != null) {
            if (str2 != null) {
                throw new IllegalArgumentException("Cover media id and cover upload id cannot both be set");
            }
        } else if (str2 == null) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            if (str != null) {
                A0A.A0S("media_id", str);
            } else if (str2 != null) {
                A0A.A0S("upload_id", str2);
            } else {
                throw new IllegalStateException("coverUploadId should not be null");
            }
            if (list != null && list.size() == 4) {
                float floatValue = ((Number) list.get(0)).floatValue();
                float floatValue2 = ((Number) list.get(1)).floatValue();
                float f = i2;
                float f2 = i;
                float floatValue3 = (((Number) list.get(2)).floatValue() * f) - (floatValue * f);
                float floatValue4 = (((Number) list.get(3)).floatValue() * f2) - (floatValue2 * f2);
                if (floatValue4 != 0.0f && floatValue3 != 0.0f && Math.abs(floatValue4 - floatValue3) <= 5.0f) {
                    A0A.A0S("crop_rect", AnonymousClass001.A0E(C71473Il.A00(',').A02(list), '[', ']'));
                    A0A.A0a();
                    A0A.close();
                    c25621Ms.A9s("cover", stringWriter.toString());
                }
            }
            if (list == null) {
                A06 = "Received CropRect was null when we had a passed in cover id";
            } else {
                if (list.size() != 4) {
                    objArr = new Object[]{Integer.valueOf(list.size())};
                    str3 = "CropRect size was incorrect. Expected sized 4, got size: %d";
                } else {
                    objArr = new Object[]{list.get(0), list.get(1), list.get(2), list.get(3), Integer.valueOf(i), Integer.valueOf(i2)};
                    str3 = "Passed in invalid crop rect: left: %f, right: %f, top: %f, bottom: %f, coverHeight: %d, coverWidth: %d";
                }
                A06 = AbstractC13670mt.A06(str3, objArr);
            }
            C0w9.A03("ArchiveApiUtil", A06);
            RectF A07 = MX2.A07(MX2.A01(new Rect(0, 0, i2, i)), i2, i);
            A0A.A0S("crop_rect", AnonymousClass001.A0E(C71473Il.A00(',').A02(AbstractC16960so.A1Q(Float.valueOf(A07.left), Float.valueOf(A07.top), Float.valueOf(A07.right), Float.valueOf(A07.bottom))), '[', ']'));
            A0A.A0a();
            A0A.close();
            c25621Ms.A9s("cover", stringWriter.toString());
        } catch (IOException e) {
            C0w9.A06("ArchiveApiUtil", "Unable to add highlights cover image data", e);
        }
    }
}
