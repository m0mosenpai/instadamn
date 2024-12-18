package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JSa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43642JSa {
    public static String A00(AnonymousClass442 anonymousClass442) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A01(A0A, anonymousClass442);
        A0A.close();
        return stringWriter.toString();
    }

    public static void A01(AnonymousClass182 anonymousClass182, AnonymousClass442 anonymousClass442) {
        anonymousClass182.A0d();
        String str = anonymousClass442.A0R;
        if (str != null) {
            anonymousClass182.A0S("client_context", str);
        }
        String str2 = anonymousClass442.A0T;
        if (str2 != null) {
            anonymousClass182.A0S("item_id", str2);
        }
        C2EY c2ey = anonymousClass442.A0F;
        if (c2ey != null) {
            anonymousClass182.A0S("item_type", c2ey.A00);
        }
        AbstractC37301Gc2.A1E(anonymousClass182, anonymousClass442.A0V);
        if (anonymousClass442.A0A != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(4644));
            AbstractC69935Vy6.A00(anonymousClass182, anonymousClass442.A0A);
        }
        if (anonymousClass442.A0C != null) {
            anonymousClass182.A0r("media");
            C38321qM c38321qM = anonymousClass442.A0C;
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        String str3 = anonymousClass442.A0U;
        if (str3 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str3);
        }
        if (anonymousClass442.A03 != null) {
            anonymousClass182.A0r("reel_share");
            LCB.A00(anonymousClass182, anonymousClass442.A03);
        }
        if (anonymousClass442.A04 != null) {
            anonymousClass182.A0r("story_share");
            LCC.A00(anonymousClass182, anonymousClass442.A04);
        }
        if (anonymousClass442.A02 != null) {
            anonymousClass182.A0r("clip");
            IQG.A00(anonymousClass182, anonymousClass442.A02);
        }
        if (anonymousClass442.A0D != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(1101));
            C38321qM c38321qM2 = anonymousClass442.A0D;
            AtomicBoolean atomicBoolean2 = C38321qM.A0i;
            C38801rC.A07(anonymousClass182, c38321qM2);
        }
        if (anonymousClass442.A01 != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(880));
            FUV.A00(anonymousClass442.A01, anonymousClass182);
        }
        if (anonymousClass442.A08 != null) {
            anonymousClass182.A0r("voice_media");
            C4G1.A00(anonymousClass182, anonymousClass442.A08);
        }
        if (anonymousClass442.A07 != null) {
            anonymousClass182.A0r("visual_media");
            AbstractC101574hS.A00(anonymousClass182, anonymousClass442.A07);
        }
        if (anonymousClass442.A06 != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(4914));
            AbstractC101574hS.A00(anonymousClass182, anonymousClass442.A06);
        }
        if (anonymousClass442.A0G != null) {
            anonymousClass182.A0r("animated_media");
            C54V.A00(anonymousClass182, anonymousClass442.A0G);
        }
        if (anonymousClass442.A0H != null) {
            anonymousClass182.A0r("store_sticker");
            AbstractC47869LCp.A00(anonymousClass182, anonymousClass442.A0H);
        }
        if (anonymousClass442.A09 != null) {
            anonymousClass182.A0r("xma");
            AbstractC910043s.A00(anonymousClass182, anonymousClass442.A09);
        }
        if (anonymousClass442.A0B != null) {
            anonymousClass182.A0r("status_reply");
            LCE.A00(anonymousClass182, anonymousClass442.A0B);
        }
        String str4 = anonymousClass442.A0Q;
        if (str4 != null) {
            anonymousClass182.A0S("replied_to_action_source", str4);
        }
        if (anonymousClass442.A00 != null) {
            anonymousClass182.A0r("link");
            AbstractC1122154p.A00(anonymousClass442.A00, anonymousClass182);
        }
        C2EY c2ey2 = anonymousClass442.A0E;
        if (c2ey2 != null) {
            anonymousClass182.A0S("message_item_type", c2ey2.A00);
        }
        if (anonymousClass442.A0I != null) {
            anonymousClass182.A0r("reaction_image_url_info");
            C17Y.A00(anonymousClass182, anonymousClass442.A0I);
        }
        if (anonymousClass442.A05 != null) {
            anonymousClass182.A0r("video_call_event");
            AbstractC101854hw.A00(anonymousClass182, anonymousClass442.A05);
        }
        String str5 = anonymousClass442.A0W;
        if (str5 != null) {
            anonymousClass182.A0S("timestamp", str5);
        }
        Long l = anonymousClass442.A0P;
        if (l != null) {
            anonymousClass182.A0R("timestamp_in_micro", l.longValue());
        }
        String str6 = anonymousClass442.A0S;
        if (str6 != null) {
            anonymousClass182.A0S("collection_item_id", str6);
        }
        Boolean bool = anonymousClass442.A0J;
        if (bool != null) {
            anonymousClass182.A0T("is_ae", bool.booleanValue());
        }
        if (anonymousClass442.A0X != null) {
            anonymousClass182.A0r("media_interventions");
            anonymousClass182.A0d();
            Iterator A14 = AbstractC166997dE.A14(anonymousClass442.A0X);
            while (A14.hasNext()) {
                Map.Entry entry = (Map.Entry) A14.next();
                if (!C16V.A04(anonymousClass182, entry)) {
                    anonymousClass182.A0h(((Number) entry.getValue()).intValue());
                }
            }
            anonymousClass182.A0a();
        }
        Long l2 = anonymousClass442.A0K;
        if (l2 != null) {
            anonymousClass182.A0R("ephemeral_duration_sec", l2.longValue());
        }
        Long l3 = anonymousClass442.A0O;
        if (l3 != null) {
            anonymousClass182.A0R(AbstractC111324zv.A00(4383), l3.longValue());
        }
        Long l4 = anonymousClass442.A0M;
        if (l4 != null) {
            anonymousClass182.A0R("ephemeral_view_duration_sec", l4.longValue());
        }
        Long l5 = anonymousClass442.A0N;
        if (l5 != null) {
            anonymousClass182.A0R(AbstractC111324zv.A00(4382), l5.longValue());
        }
        Long l6 = anonymousClass442.A0L;
        if (l6 != null) {
            anonymousClass182.A0R("message_expiration_timestamp_ms", l6.longValue());
        }
        if (anonymousClass442.A0Y != null) {
            C16V.A03(anonymousClass182, "hscroll_share");
            for (C910143t c910143t : anonymousClass442.A0Y) {
                if (c910143t != null) {
                    AbstractC910043s.A00(anonymousClass182, c910143t);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
