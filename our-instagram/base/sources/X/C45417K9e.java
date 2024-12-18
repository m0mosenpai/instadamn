package X;

import android.content.Intent;

/* renamed from: X.K9e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45417K9e extends AbstractC46377Kfz {
    public final int A00;
    public final int A01;
    public final Intent A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45417K9e) {
                C45417K9e c45417K9e = (C45417K9e) obj;
                if (this.A00 != c45417K9e.A00 || this.A01 != c45417K9e.A01 || !C14360o3.A0K(this.A02, c45417K9e.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AbstractC167017dG.A0M(this.A02);
    }

    public C45417K9e(int i, int i2, Intent intent) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = intent;
    }
}
