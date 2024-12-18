package X;

/* renamed from: X.CdB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28266CdB {
    public final CAZ A00;
    public final CWM A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28266CdB) {
                C28266CdB c28266CdB = (C28266CdB) obj;
                if (this.A02 != c28266CdB.A02 || !C14360o3.A0K(this.A01, c28266CdB.A01) || !C14360o3.A0K(this.A03, c28266CdB.A03) || !C14360o3.A0K(this.A00, c28266CdB.A00)) {
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
            case 1:
                str = "SUCCESS";
                break;
            case 2:
                str = "FAILED";
                break;
            default:
                str = "LOADING";
                break;
        }
        return ((((AbstractC25228BEl.A0F(str, intValue) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C28266CdB(CAZ caz, CWM cwm, Integer num, String str) {
        this.A02 = num;
        this.A01 = cwm;
        this.A03 = str;
        this.A00 = caz;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineGeneratedImageWithStatus(imageStatus=");
        switch (this.A02.intValue()) {
            case 1:
                str = "SUCCESS";
                break;
            case 2:
                str = "FAILED";
                break;
            default:
                str = "LOADING";
                break;
        }
        A1C.append(str);
        A1C.append(", image=");
        A1C.append(this.A01);
        A1C.append(", prompt=");
        A1C.append(this.A03);
        A1C.append(", imagineError=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C28266CdB() {
        this(null, null, C05F.A00, null);
    }
}
