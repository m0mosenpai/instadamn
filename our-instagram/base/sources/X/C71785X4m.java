package X;

import android.content.Context;
import android.os.Build;
import android.os.PerformanceHintManager;

/* renamed from: X.X4m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71785X4m extends C0YY implements InterfaceC16820sZ {
    public static final C71785X4m A00 = new C71785X4m();

    public C71785X4m() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        if (Build.VERSION.SDK_INT < 31 || (context = AbstractC12290kX.A00) == null) {
            return null;
        }
        return context.getSystemService(PerformanceHintManager.class);
    }
}
