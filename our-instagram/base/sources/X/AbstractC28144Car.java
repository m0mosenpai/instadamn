package X;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;

/* renamed from: X.Car, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28144Car {
    public static final int A01 = Color.argb(230, 255, 255, 255);
    public static final int A00 = Color.argb(128, 27, 27, 27);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.BZL, X.DiA] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void A00(ComponentActivity componentActivity, CS1 cs1, CS1 cs12) {
        ?? r1;
        AbstractC167017dG.A1P(cs1, cs12);
        View decorView = componentActivity.getWindow().getDecorView();
        C14360o3.A07(decorView);
        InterfaceC16660sJ interfaceC16660sJ = cs1.A03;
        Resources resources = decorView.getResources();
        C14360o3.A07(resources);
        boolean A1a = AbstractC25231BEo.A1a(resources, interfaceC16660sJ);
        boolean A1a2 = AbstractC25231BEo.A1a(resources, cs12.A03);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r1 = new BZJ();
        } else if (i >= 29) {
            r1 = new BZK();
        } else {
            r1 = new Object();
        }
        Window window = componentActivity.getWindow();
        C14360o3.A07(window);
        r1.EgP(decorView, window, cs1, cs12, A1a, A1a2);
        Window window2 = componentActivity.getWindow();
        C14360o3.A07(window2);
        r1.A00(window2);
    }
}
