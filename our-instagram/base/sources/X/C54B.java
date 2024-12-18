package X;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.54B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54B extends C0YY implements InterfaceC16820sZ {
    public static final C54B A00 = new C54B();

    public C54B() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new Object() { // from class: X.54C
            public final Handler A00 = new Handler(Looper.getMainLooper());
            public final Map A01 = new LinkedHashMap();
            public final java.util.Set A02 = new LinkedHashSet();
        };
    }
}
