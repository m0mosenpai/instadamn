package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.List;

/* renamed from: X.99K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99K {
    public int A00;
    public List A01;
    public final Context A02;
    public final C99M A03;
    public final QuickPerformanceLogger A04;
    public final boolean A05;

    public C99K(Context context, boolean z) {
        C14360o3.A0B(context, 1);
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A04 = qPLInstance == null ? QuickPerformanceLoggerProvider.A01 : qPLInstance;
        this.A03 = new C99M(this);
        this.A02 = context;
        this.A05 = z;
    }
}
