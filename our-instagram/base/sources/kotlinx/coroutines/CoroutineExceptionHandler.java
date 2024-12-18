package kotlinx.coroutines;

import X.C12V;
import X.C12W;
import X.C3E9;

/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends C12V {
    public static final C3E9 Key = C3E9.A00;

    void handleException(C12W c12w, Throwable th);
}
