package X;

/* renamed from: X.9ZV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZV extends C0T6 {
    public String A04 = null;
    public int A00 = 0;
    public String A02 = null;
    public String A03 = null;
    public long A01 = 0;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZV) {
                C9ZV c9zv = (C9ZV) obj;
                if (!C14360o3.A0K(this.A04, c9zv.A04) || this.A00 != c9zv.A00 || !C14360o3.A0K(this.A02, c9zv.A02) || !C14360o3.A0K(this.A03, c9zv.A03) || this.A01 != c9zv.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((AbstractC167017dG.A0O(this.A04) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (A0O + i) * 31;
        long j = this.A01;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsSoundEffectInfo(sfxName=");
        A1C.append(this.A04);
        A1C.append(", effectDurationMs=");
        A1C.append(this.A00);
        A1C.append(", audioAssetId=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(3348));
        A1C.append(this.A03);
        A1C.append(", startTimeMs=");
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
