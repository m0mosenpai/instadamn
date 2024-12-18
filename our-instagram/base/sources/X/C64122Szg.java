package X;

import com.facebook.proxygen.SamplePolicy;

/* renamed from: X.Szg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64122Szg implements SamplePolicy {
    public static int A02 = 10000;
    public boolean A00;
    public boolean A01;

    @Override // com.facebook.proxygen.SamplePolicy
    public final boolean isSampled() {
        if (!this.A01 && !this.A00 && !C21A.A02()) {
            return false;
        }
        return true;
    }
}
