package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SaY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63010SaY {
    public static final C63010SaY A01 = new C63010SaY();
    public final AtomicReference A00 = new AtomicReference();

    public final int hashCode() {
        return AbstractC58322PtE.A08(null);
    }

    public final boolean A01() {
        AtomicReference atomicReference = this.A00;
        if (atomicReference.get() != null) {
            return AbstractC166987dD.A1a(atomicReference.get());
        }
        boolean A1O = AbstractC167007dF.A1O(C63392SjE.A00((Context) C63164SeO.A00().A01(Context.class), "com.google.mlkit.dynamite.text.latin"));
        atomicReference.set(Boolean.valueOf(A1O));
        return A1O;
    }

    public final boolean equals(Object obj) {
        if (obj != this && !(obj instanceof C63010SaY)) {
            return false;
        }
        return true;
    }

    public final String A00() {
        if (true != A01()) {
            return "play-services-mlkit-text-recognition";
        }
        return "text-recognition";
    }
}
