package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.426, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass426 {
    public static final AnonymousClass426 A00 = new Object();

    public final void A05(UserSession userSession, com.instagram.tagging.model.Tag tag, String str, String str2, String str3, List list) {
        EnumC223339tQ enumC223339tQ;
        C14360o3.A0B(userSession, 0);
        ArrayList A02 = A02(list);
        if (A04(A02)) {
            ArrayList A01 = A01(str, A02);
            C51413MnL A002 = A00(tag, str);
            if (str3.equals(MSV.A00(85))) {
                enumC223339tQ = EnumC223339tQ.PROFILE_ICON;
            } else {
                enumC223339tQ = null;
            }
            A03(enumC223339tQ, EnumC53372NjN.BOTTOM_SHEET_CLICK, A002, userSession, userSession.userId, str, str2, A01, null);
        }
    }

    public final void A07(UserSession userSession, String str, String str2, int i) {
        C14360o3.A0B(userSession, 0);
        A03(null, EnumC53372NjN.CROSSPOST_WITH_FB_MENTIONS_IMPRESSION, null, userSession, userSession.userId, str, null, null, AbstractC06930Yk.A06(new C09530e4("num_mentions", String.valueOf(i)), new C09530e4(CacheBehaviorLogger.SOURCE, str2)));
    }

    public final void A0A(UserSession userSession, String str, List list) {
        C14360o3.A0B(list, 2);
        if (A04(list)) {
            A03(null, EnumC53372NjN.CROSSPOST_WITH_FB_TAGS_IMPRESSION, null, userSession, userSession.userId, str, null, A01(str, list), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r3 = "ig_post";
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = java.lang.Boolean.valueOf(r0);
        r1 = new X.C0Zx();
        r1.A06("tag_source", r3);
        r1.A06("tag_type", r4);
        r1.A06("media_id", r6);
        r1.A03("is_tag_cropped", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r3 = "fb_post";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r3 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (((com.instagram.model.fbusertag.FBUserTag) r5).A01 != com.instagram.api.schemas.FBTagType.A04) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Zx, X.MnL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C51413MnL A00(com.instagram.tagging.model.Tag r5, java.lang.String r6) {
        /*
            boolean r3 = r5 instanceof com.instagram.model.fbusertag.FBUserTag
            if (r3 == 0) goto L3e
            r0 = r5
            com.instagram.model.fbusertag.FBUserTag r0 = (com.instagram.model.fbusertag.FBUserTag) r0
            com.instagram.api.schemas.FBTagType r1 = r0.A01
            com.instagram.api.schemas.FBTagType r0 = com.instagram.api.schemas.FBTagType.A07
            if (r1 != r0) goto L3e
            java.lang.String r4 = "with_tag"
        Lf:
            com.instagram.model.fbusertag.FBUserTag r5 = (com.instagram.model.fbusertag.FBUserTag) r5
            com.instagram.api.schemas.FBTagType r2 = r5.A01
            com.instagram.api.schemas.FBTagType r1 = com.instagram.api.schemas.FBTagType.A04
            r0 = 1
            if (r2 == r1) goto L3b
        L18:
            r0 = 0
            if (r3 != 0) goto L3b
            java.lang.String r3 = "ig_post"
        L1d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            X.MnL r1 = new X.MnL
            r1.<init>()
            java.lang.String r0 = "tag_source"
            r1.A06(r0, r3)
            java.lang.String r0 = "tag_type"
            r1.A06(r0, r4)
            java.lang.String r0 = "media_id"
            r1.A06(r0, r6)
            java.lang.String r0 = "is_tag_cropped"
            r1.A03(r0, r2)
            return r1
        L3b:
            java.lang.String r3 = "fb_post"
            goto L1d
        L3e:
            java.lang.String r4 = "photo_tag"
            if (r3 == 0) goto L18
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass426.A00(com.instagram.tagging.model.Tag, java.lang.String):X.MnL");
    }

    public static final ArrayList A01(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00((com.instagram.tagging.model.Tag) it.next(), str));
        }
        return arrayList;
    }

    public static final ArrayList A02(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.instagram.tagging.model.Tag) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void A03(EnumC223339tQ enumC223339tQ, EnumC53372NjN enumC53372NjN, C51413MnL c51413MnL, UserSession userSession, String str, String str2, String str3, List list, Map map) {
        long j;
        Long A0k;
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB("fb_tag_carryover_to_ig_crosspost"), userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "fb_tag_carryover_to_ig_crosspost");
        if (A002.isSampled()) {
            if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            A002.A9K("ig_userid", Long.valueOf(j));
            A002.A8R(enumC53372NjN, "event");
            A002.AAP("media_id", str2);
            A002.AAk("tags_rendered_information", list);
            A002.AAQ(c51413MnL, "tag_interacted_information");
            A002.AAP(AbstractC43591JPw.A00(11), str3);
            A002.A8R(enumC223339tQ, "bottom_sheet_entry_point");
            A002.A9M("extra", map);
            A002.Cht();
        }
    }

    public final void A06(UserSession userSession, String str) {
        A03(null, EnumC53372NjN.FB_MENTION_TAP, null, userSession, userSession.userId, null, null, null, AbstractC16850sd.A0M(new C09530e4(CacheBehaviorLogger.SOURCE, str)));
    }

    public static final boolean A04(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof FBUserTag) {
                return true;
            }
        }
        return false;
    }

    public final void A08(UserSession userSession, String str, String str2, String str3, List list) {
        EnumC223339tQ enumC223339tQ;
        ArrayList A02 = A02(list);
        if (A04(A02)) {
            ArrayList A01 = A01(str, A02);
            if (str3.equals(MSV.A00(85))) {
                enumC223339tQ = EnumC223339tQ.PROFILE_ICON;
            } else if (str3.equals(AbstractC111324zv.A00(178))) {
                enumC223339tQ = EnumC223339tQ.CLIP_TAG_PILL;
            } else {
                enumC223339tQ = null;
            }
            A03(enumC223339tQ, EnumC53372NjN.BOTTOM_SHEET_IMPRESSION, null, userSession, userSession.userId, str, str2, A01, null);
        }
    }

    public final void A09(UserSession userSession, String str, List list) {
        if (A04(list)) {
            A03(null, EnumC53372NjN.CROSSPOST_CLIP_WITH_FB_TAGS_IMPRESSION, null, userSession, userSession.userId, str, null, A01(str, list), null);
        }
    }
}
