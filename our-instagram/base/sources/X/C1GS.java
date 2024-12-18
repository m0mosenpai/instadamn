package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1GS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GS extends C0YY implements InterfaceC16820sZ {
    public static final C1GS A00 = new C1GS();

    public C1GS() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
