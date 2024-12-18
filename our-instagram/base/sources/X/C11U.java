package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.11U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11U extends C0YY implements InterfaceC16820sZ {
    public static final C11U A00 = new C11U();

    public C11U() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
