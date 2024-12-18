package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.CdV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28283CdV {
    public final QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();
    public final CWR A01;

    public final void A02(CAZ caz) {
        String A01;
        C14360o3.A0B(caz, 0);
        String A00 = caz.A00();
        if (A00 == null || (A01 = AnonymousClass001.A0g(caz.A01(), ": ", A00)) == null) {
            A01 = caz.A01();
        }
        A03(A01);
    }

    private final void A00(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325724260, str, str2);
        }
    }

    public final void A01() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(325724260);
        }
        A04("query_begin");
        CWR cwr = this.A01;
        A00(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, cwr.A02.A00);
        A00("surface_session_id", cwr.A0C);
        A00("bottom_sheet_session_id", cwr.A0B);
    }

    public final void A04(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(325724260, str);
        }
    }

    public final void A05(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(325715839, str);
        }
    }

    public final void A06(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325726718, str, str2);
        }
    }

    public final void A07(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325715894, str, str2);
        }
    }

    public final void A08(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325715839, str, str2);
        }
    }

    public final void A09(String str, String str2, int i) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            if (str2 == null) {
                str2 = "unknown";
            }
            quickPerformanceLogger.markerAnnotate(325725822, i, str, str2);
        }
    }

    public C28283CdV(CWR cwr) {
        this.A01 = cwr;
    }

    public final void A03(String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (str != null && (quickPerformanceLogger = this.A00) != null) {
            quickPerformanceLogger.markerAnnotate(325715894, "error_message", str);
            quickPerformanceLogger.markerAnnotate(325725822, "error_message", str);
            quickPerformanceLogger.markerAnnotate(325715839, "error_message", str);
            quickPerformanceLogger.markerAnnotate(325724260, "error_message", str);
        }
        QuickPerformanceLogger quickPerformanceLogger2 = this.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerEnd(325715894, (short) 3);
            quickPerformanceLogger2.markerEnd(325725822, (short) 3);
            quickPerformanceLogger2.markerEnd(325715839, (short) 3);
            quickPerformanceLogger2.markerEnd(325724260, (short) 3);
        }
    }
}
