package X;

import android.os.Bundle;
import com.facebook.quicklog.PointEditor;
import com.instagram.bugreporter.source.BugReportSource;

/* renamed from: X.OrJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55869OrJ implements InterfaceC58266PsA {
    public long A00;
    public final C1QT A01;

    @Override // X.InterfaceC58266PsA
    public final void AW2(Integer num) {
        String str;
        C14360o3.A0B(num, 0);
        C1QT c1qt = this.A01;
        if (c1qt.isOngoingFlow(this.A00)) {
            long j = this.A00;
            if (num.intValue() != 0) {
                str = "gdpr_back_exit";
            } else {
                str = "gdpr_decline";
            }
            c1qt.flowEndCancel(j, str);
        }
    }

    @Override // X.InterfaceC58266PsA
    public final void AWD(BugReportSource bugReportSource, String str) {
        AbstractC167007dF.A1K(bugReportSource, str);
        C1QT c1qt = this.A01;
        Long flowStartIfNotOngoingForMarker = c1qt.flowStartIfNotOngoingForMarker(396366232, str.hashCode(), bugReportSource.name(), false, -1L);
        if (flowStartIfNotOngoingForMarker != null) {
            long longValue = flowStartIfNotOngoingForMarker.longValue();
            this.A00 = longValue;
            c1qt.flowAnnotate(longValue, "client_server_join_key", str);
            c1qt.flowAnnotate(longValue, "asl_session_id", C0L6.A01());
        }
    }

    @Override // X.InterfaceC58266PsA
    public final void AW5(String str, String str2) {
        C1QT c1qt = this.A01;
        if (c1qt.isOngoingFlow(this.A00)) {
            c1qt.flowEndFail(this.A00, "upload_service_error", str2);
        }
    }

    @Override // X.InterfaceC58266PsA
    public final void AW7() {
        C1QT c1qt = this.A01;
        if (c1qt.isOngoingFlow(this.A00)) {
            c1qt.flowEndSuccess(this.A00);
        }
    }

    @Override // X.InterfaceC58266PsA
    public final void AW9(String str) {
        C1QT c1qt = this.A01;
        if (c1qt.isOngoingFlow(this.A00)) {
            c1qt.flowMarkPoint(this.A00, str);
        }
    }

    @Override // X.InterfaceC58266PsA
    public final void AWB(String str, InterfaceC16660sJ interfaceC16660sJ) {
        C1QT c1qt = this.A01;
        if (c1qt.isOngoingFlow(this.A00)) {
            PointEditor markPointWithEditor = c1qt.markPointWithEditor(this.A00, str);
            C14360o3.A0A(markPointWithEditor);
            interfaceC16660sJ.invoke(markPointWithEditor);
            markPointWithEditor.markerEditingCompleted();
        }
    }

    public C55869OrJ(AbstractC12990ll abstractC12990ll, long j) {
        this.A00 = j;
        this.A01 = C1QS.A00(abstractC12990ll);
    }

    @Override // X.InterfaceC58266PsA
    public final Bundle E4I() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putLong("bug_reporter_user_flow_logger_v2_flow_id_extra", this.A00);
        return A0b;
    }
}
