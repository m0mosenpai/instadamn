package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: X.MEj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50182MEj extends C0YY implements InterfaceC16820sZ {
    public static final C50182MEj A00 = new C50182MEj();

    public C50182MEj() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        DisplayMetrics displayMetrics;
        Resources system = Resources.getSystem();
        if (system != null && (displayMetrics = system.getDisplayMetrics()) != null) {
            i = displayMetrics.densityDpi;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
