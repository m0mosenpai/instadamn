package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashSet;

/* renamed from: X.4de, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99614de {
    public int A00;
    public Choreographer A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final QuickPerformanceLogger A05;
    public final C99604dd A06;
    public final java.util.Set A07;

    public C99614de(Context context, QuickPerformanceLogger quickPerformanceLogger, C99604dd c99604dd) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(quickPerformanceLogger, 2);
        Handler handler = new Handler(Looper.getMainLooper());
        this.A03 = context;
        this.A04 = handler;
        this.A05 = quickPerformanceLogger;
        this.A06 = c99604dd;
        Choreographer choreographer = Choreographer.getInstance();
        C14360o3.A07(choreographer);
        this.A01 = choreographer;
        this.A07 = new HashSet();
    }
}
