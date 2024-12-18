package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Chb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28483Chb {
    public final QuickPerformanceLogger A00;
    public final C28280CdP A01;
    public final AtomicBoolean A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;

    public C28483Chb(C28280CdP c28280CdP) {
        C14360o3.A0B(c28280CdP, 1);
        this.A01 = c28280CdP;
        this.A00 = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A04 = new AtomicBoolean(false);
        this.A02 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
    }

    public static final void A00(C28483Chb c28483Chb) {
        QuickPerformanceLogger quickPerformanceLogger = c28483Chb.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(325713921, (short) 3);
        }
    }

    public static final void A01(C28483Chb c28483Chb) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!c28483Chb.A04.get() && (quickPerformanceLogger = c28483Chb.A00) != null) {
            quickPerformanceLogger.markerEnd(325720704, (short) 3);
        }
    }

    public static final void A02(C28483Chb c28483Chb, String str) {
        QuickPerformanceLogger quickPerformanceLogger = c28483Chb.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(325713921, str);
        }
    }

    public static final void A03(C28483Chb c28483Chb, String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!c28483Chb.A04.get() && (quickPerformanceLogger = c28483Chb.A00) != null) {
            quickPerformanceLogger.markerPoint(325720704, str);
        }
    }

    public static final void A04(C28483Chb c28483Chb, String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger = c28483Chb.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerAnnotate(325713921, str, str2);
        }
    }

    public static final void A05(C28483Chb c28483Chb, String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (!c28483Chb.A04.get() && (quickPerformanceLogger = c28483Chb.A00) != null) {
            quickPerformanceLogger.markerAnnotate(325720704, str, str2);
        }
    }

    public final void A06() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(325713921);
        }
        A02(this, "query_begin");
        C28280CdP c28280CdP = this.A01;
        A04(this, "bottom_sheet_session_id", c28280CdP.A06);
        A04(this, "surface_session_id", c28280CdP.A08);
        A04(this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC28338CeQ.A01(c28280CdP.A05));
        if (!this.A04.get()) {
            A03(this, "query_begin");
        }
    }
}
