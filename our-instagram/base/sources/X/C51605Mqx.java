package X;

/* renamed from: X.Mqx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51605Mqx extends C0T6 {
    public Integer A00 = null;
    public String A01 = null;
    public boolean A03 = false;
    public String A02 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51605Mqx) {
                C51605Mqx c51605Mqx = (C51605Mqx) obj;
                if (this.A00 != c51605Mqx.A00 || !C14360o3.A0K(this.A01, c51605Mqx.A01) || this.A03 != c51605Mqx.A03 || !C14360o3.A0K(this.A02, c51605Mqx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A02;
        Integer num = this.A00;
        if (num == null) {
            A02 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "TEXT";
            } else {
                str = "STICKER";
            }
            A02 = AbstractC25226BEj.A02(str, intValue);
        }
        return AbstractC167007dF.A0D(this.A03, ((A02 * 31 * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
