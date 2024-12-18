package X;

/* renamed from: X.CVj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27986CVj {
    public final float A00;
    public final long A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27986CVj) {
                C27986CVj c27986CVj = (C27986CVj) obj;
                if (this.A02 != c27986CVj.A02 || Float.compare(1.0f, 1.0f) != 0 || Float.compare(this.A00, c27986CVj.A00) != 0 || this.A01 != c27986CVj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "ALPHA";
                break;
            case 1:
                str = "SCALE_X";
                break;
            default:
                str = "SCALE_Y";
                break;
        }
        return AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25228BEl.A0F(str, intValue), 1.0f), this.A00) + AbstractC25228BEl.A03(this.A01);
    }

    public C27986CVj(Integer num, float f, long j) {
        this.A02 = num;
        this.A00 = f;
        this.A01 = j;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PressedStateAnimation(property=");
        switch (this.A02.intValue()) {
            case 0:
                str = "ALPHA";
                break;
            case 1:
                str = "SCALE_X";
                break;
            default:
                str = "SCALE_Y";
                break;
        }
        A1C.append(str);
        A1C.append(", startValue=");
        A1C.append(1.0f);
        A1C.append(", endValue=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(131));
        A1C.append(this.A01);
        return AbstractC167017dG.A0p(A1C);
    }
}
