package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.litho.ComponentTree;

/* renamed from: X.2VI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2VI {
    public static final Handler A00;

    static {
        Looper A002 = ComponentTree.A00();
        C14360o3.A07(A002);
        A00 = new Handler(A002);
    }
}
