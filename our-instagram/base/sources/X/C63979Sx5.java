package X;

import java.util.Collection;

/* renamed from: X.Sx5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63979Sx5 implements C3Tt {
    @Override // X.C3Tt
    public final boolean isEnabled() {
        return C2S1.A00().A07().A04();
    }

    @Override // X.C3Tt
    public final void onLeaksDetected(Collection collection) {
        C2S1.A00().A02().A09("Leak", null, 0);
    }
}
