package X;

import java.util.Arrays;

/* renamed from: X.Pza, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58663Pza implements Comparable {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C58663Pza)) {
            return false;
        }
        C58663Pza c58663Pza = (C58663Pza) obj;
        return c58663Pza.A01 == this.A01 && c58663Pza.A00 == this.A00;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C58663Pza c58663Pza = (C58663Pza) obj;
        C14360o3.A0B(c58663Pza, 0);
        return C14360o3.A00(this.A01, c58663Pza.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Z(Integer.valueOf(this.A01), this.A00));
    }

    public C58663Pza(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
