package X;

import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.4KN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4KN extends C4KO {
    public static final void A00(AnonymousClass776 anonymousClass776, C4KN c4kn, Long l) {
        C006802i c006802i = c4kn.A00;
        MarkerEditor withMarker = c006802i.withMarker(anonymousClass776.A01, anonymousClass776.A00);
        withMarker.annotate("is_feed_to_inbox_v2_on_when_end", c006802i.isMarkerOn(1060769838));
        withMarker.annotate("is_feed_to_inbox_v1_on_when_end", c006802i.isMarkerOn(31784971));
        if (l != null) {
            withMarker.annotate("seq_id_from_response", l.longValue());
        }
        withMarker.markerEditingCompleted();
    }

    @Override // X.C4KO
    public final void A0C(AnonymousClass776 anonymousClass776) {
        super.A0C(anonymousClass776);
        if (anonymousClass776 != null) {
            this.A00.markerEnd(20132917, (short) 2);
        }
    }

    @Override // X.C4KO
    public final void A0D(AnonymousClass776 anonymousClass776, Boolean bool, boolean z) {
        super.A0D(anonymousClass776, bool, z);
        if (anonymousClass776 != null) {
            this.A00.markerEnd(20132917, (short) 3);
        }
    }
}
