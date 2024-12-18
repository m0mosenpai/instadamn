package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5YA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5YA extends C0YY implements InterfaceC16820sZ {
    public static final C5YA A00 = new C5YA();

    public C5YA() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
