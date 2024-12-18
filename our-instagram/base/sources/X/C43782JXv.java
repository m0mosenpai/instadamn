package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JXv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43782JXv {
    public int A00;
    public final C006802i A01;
    public final UserSession A02;

    public C43782JXv(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AbstractC43592JPx.A0N();
    }

    public final void A01() {
        int i = this.A00 + 1;
        this.A00 = i;
        C006802i c006802i = this.A01;
        c006802i.markerAnnotate(20125924, "inbox_fetch_attempted", i);
        c006802i.markerPoint(20125924, AnonymousClass001.A0c("inbox_fetch_", "_start", this.A00));
    }

    public final void A04(String str) {
        C006802i c006802i = this.A01;
        c006802i.markerAnnotate(20125924, "cancel_reason", str);
        c006802i.markerEnd(20125924, (short) 4);
    }

    public final void A05(String str) {
        C006802i c006802i = this.A01;
        c006802i.markerAnnotate(20125924, TraceFieldType.FailureReason, str);
        c006802i.markerEnd(20125924, (short) 3);
    }

    public static MarkerEditor A00(C006802i c006802i, AbstractC46972Dl abstractC46972Dl, String str, String str2) {
        c006802i.markerStart(20125924);
        MarkerEditor withMarker = c006802i.withMarker(20125924);
        withMarker.annotate("start_reason", str);
        withMarker.annotate("inbox_mode", abstractC46972Dl.A04);
        withMarker.annotate("inbox_type", C99U.A00(abstractC46972Dl.A03));
        withMarker.annotate("account_type", str2);
        withMarker.annotate("thread_folder", AbstractC31453Drx.A00(abstractC46972Dl.A00));
        return withMarker;
    }

    public final void A02(AbstractC46972Dl abstractC46972Dl, C4I3 c4i3, String str) {
        String str2;
        boolean A1U = AbstractC167007dF.A1U(c4i3);
        C006802i c006802i = this.A01;
        if (c006802i.isMarkerOn(20125924, A1U ? 1 : 0)) {
            A04(str);
        }
        this.A00 = A1U ? 1 : 0;
        EnumC222416a A0I = C17060sy.A01.A01(this.A02).A0I();
        if (A0I != null) {
            str2 = A0I.A01;
        } else {
            str2 = null;
        }
        MarkerEditor A00 = A00(c006802i, abstractC46972Dl, str, str2);
        A00.annotate("thread_filter", c4i3.A00);
        A00.annotate("inbox_fetch_attempted", A1U ? 1 : 0);
        A00.markerEditingCompleted();
    }

    public final void A03(AbstractC46972Dl abstractC46972Dl, String str, java.util.Set set) {
        String str2;
        boolean A1U = AbstractC167007dF.A1U(set);
        C006802i c006802i = this.A01;
        if (c006802i.isMarkerOn(20125924, A1U ? 1 : 0)) {
            A04(str);
        }
        this.A00 = A1U ? 1 : 0;
        EnumC222416a A0I = C17060sy.A01.A01(this.A02).A0I();
        if (A0I != null) {
            str2 = A0I.A01;
        } else {
            str2 = null;
        }
        List A0Z = AbstractC001800i.A0Z(AbstractC001800i.A0a(set));
        MarkerEditor A00 = A00(c006802i, abstractC46972Dl, str, str2);
        A00.annotate("thread_filter", AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0Z));
        A00.annotate("inbox_fetch_attempted", A1U ? 1 : 0);
        A00.markerEditingCompleted();
    }
}
