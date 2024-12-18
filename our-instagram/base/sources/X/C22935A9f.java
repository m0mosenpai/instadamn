package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.A9f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22935A9f {
    public final Context A00;
    public final QuickPerformanceLogger A01;
    public final Object A02;
    public final InterfaceC220315d A03;
    public final C1KI A04;
    public volatile boolean A05;

    public C22935A9f(Context context, C1KI c1ki, QuickPerformanceLogger quickPerformanceLogger, boolean z) {
        C14360o3.A0B(c1ki, 4);
        this.A00 = context;
        this.A01 = quickPerformanceLogger;
        this.A04 = c1ki;
        AXO axo = new AXO(this);
        this.A03 = axo;
        this.A02 = new Object();
        if (z) {
            c1ki.EDS(axo);
        }
    }
}
