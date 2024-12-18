package X;

/* renamed from: X.Mrv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51664Mrv extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51664Mrv) {
                C51664Mrv c51664Mrv = (C51664Mrv) obj;
                if (this.A03 != c51664Mrv.A03 || this.A04 != c51664Mrv.A04 || this.A02 != c51664Mrv.A02 || this.A00 != c51664Mrv.A00 || this.A01 != c51664Mrv.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int intValue = (64547 + this.A03.intValue()) * 31;
        Integer num = this.A04;
        return ((((AbstractC167017dG.A0L(num, AbstractC53760NqC.A00(num), intValue) + this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public C51664Mrv(Integer num, Integer num2, int i, int i2, int i3) {
        this.A03 = num;
        this.A04 = num2;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioFormat(codec=");
        if (this.A03 != null) {
            str = "AAC";
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", codecProfile=");
        Integer num = this.A04;
        if (num != null) {
            str2 = AbstractC53760NqC.A00(num);
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", sampleRate=");
        A1C.append(this.A02);
        A1C.append(", bitRate=");
        A1C.append(this.A00);
        A1C.append(", channelCount=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
