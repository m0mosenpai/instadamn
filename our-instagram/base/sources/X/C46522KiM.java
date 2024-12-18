package X;

import java.util.Arrays;

/* renamed from: X.KiM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46522KiM {
    public String A00;
    public byte[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46522KiM) {
                C46522KiM c46522KiM = (C46522KiM) obj;
                if (!C14360o3.A0K(this.A00, c46522KiM.A00) || !C14360o3.A0K(this.A01, c46522KiM.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("BackupDataFeatureEntry(feature=", this.A00, ", backupData=", Arrays.toString(this.A01), ')');
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + Arrays.hashCode(this.A01);
    }
}
