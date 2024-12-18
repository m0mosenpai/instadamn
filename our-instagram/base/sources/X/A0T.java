package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* loaded from: classes4.dex */
public abstract class A0T {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        long j;
        long j2;
        String str3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_thread_ctd_upsell_events");
        InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(userSession).A00;
        int i = interfaceC19630xq.getInt(AbstractC111324zv.A00(4223), 0);
        if (i != 1) {
            if (i != 2) {
                j = 0;
                j2 = interfaceC19630xq.getLong("ctd_upsell_banner_negative_outcome_count_v2", 0L);
                str3 = "ctd_upsell_banner_impression_count_v2";
            } else {
                j = 0;
                j2 = interfaceC19630xq.getLong("ctd_upsell_two_banner_negative_outcome_count", 0L);
                str3 = "ctd_upsell_two_banner_impression_count";
            }
        } else {
            j = 0;
            j2 = interfaceC19630xq.getLong("ctd_upsell_one_banner_negative_outcome_count", 0L);
            str3 = "ctd_upsell_one_banner_impression_count";
        }
        long j3 = interfaceC19630xq.getLong(str3, j);
        if (A0f.isSampled()) {
            A0f.AAP("action", str);
            A0f.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A0f.A9K("negative_outcome_count", Long.valueOf(j2));
            A0f.A9K("total_impression_count", Long.valueOf(j3));
            A0f.Cht();
        }
    }
}
