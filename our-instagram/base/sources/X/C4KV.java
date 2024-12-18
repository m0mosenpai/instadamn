package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

/* renamed from: X.4KV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KV extends C4KO {
    public final void A0G(AnonymousClass776 anonymousClass776, List list, int i, int i2, long j, boolean z, boolean z2) {
        C14360o3.A0B(list, 3);
        if (anonymousClass776 != null) {
            C006802i c006802i = this.A00;
            int i3 = anonymousClass776.A01;
            int i4 = anonymousClass776.A00;
            c006802i.withMarker(i3, i4).pointEditor("reverb_post_process_start").markerEditingCompleted();
            MarkerEditor withMarker = c006802i.withMarker(i3, i4);
            withMarker.annotate(DialogModule.KEY_MESSAGE, AbstractC001800i.A0P(", ", "", "", list, null));
            withMarker.annotate("server_response_encrypted_message_count", i2);
            withMarker.annotate("server_response_total_message_count", i);
            withMarker.annotate("thread_jid", j);
            withMarker.annotate("is_tlc_thread", z);
            withMarker.annotate("is_ttlc_thread", z2);
            withMarker.markerEditingCompleted();
        }
    }

    public final AnonymousClass776 A0E(UserSession userSession, ThreadFetchReason threadFetchReason, Long l, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str4, 9);
        AnonymousClass776 A01 = A01(userSession, null, null, l, 20131826, z, z2, true);
        MarkerEditor withMarker = this.A00.withMarker(A01.A01, A01.A00);
        withMarker.annotate("use_recipient_as_eimu_id", z3);
        withMarker.annotate("fetch_by", str2);
        withMarker.annotate("fetch_type", threadFetchReason.getFetchType());
        withMarker.annotate("fetch_reason", threadFetchReason.toString());
        withMarker.annotate(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        withMarker.annotate("call_site", str3);
        withMarker.annotate("uuid", str4);
        withMarker.markerEditingCompleted();
        return A01;
    }

    public final void A0F(AnonymousClass776 anonymousClass776) {
        if (anonymousClass776 != null) {
            C006802i c006802i = this.A00;
            int i = anonymousClass776.A01;
            int i2 = anonymousClass776.A00;
            MarkerEditor withMarker = c006802i.withMarker(i, i2);
            withMarker.annotate("reverb_message_count", 0);
            withMarker.annotate("reverb_shh_msg_count", 0);
            withMarker.markerEditingCompleted();
            c006802i.markerPoint(i, i2, "reverb_post_process_end");
        }
    }
}
