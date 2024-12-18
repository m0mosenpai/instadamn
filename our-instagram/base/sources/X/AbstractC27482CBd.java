package X;

import android.os.Build;
import android.view.inputmethod.InputConnection;

/* renamed from: X.CBd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27482CBd {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.CoT, X.Bb9] */
    public static final C25792Bb9 A00(InputConnection inputConnection, InterfaceC16660sJ interfaceC16660sJ) {
        if (Build.VERSION.SDK_INT >= 34) {
            return new C25791Bb8(inputConnection, interfaceC16660sJ);
        }
        return new AbstractC28859CoT(inputConnection, interfaceC16660sJ);
    }
}
