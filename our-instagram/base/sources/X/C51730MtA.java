package X;

/* renamed from: X.MtA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51730MtA extends C0T6 {
    public float A00;
    public String A01;
    public String A02;
    public final int A03;

    public C51730MtA(String str, String str2, float f) {
        this.A03 = 0;
        this.A01 = str;
        this.A00 = f;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this.A03 != 0) {
            if (this != obj) {
                if (obj instanceof C51730MtA) {
                    C51730MtA c51730MtA = (C51730MtA) obj;
                    if (c51730MtA.A03 != 1 || !C14360o3.A0K(this.A02, c51730MtA.A02) || !C14360o3.A0K(this.A01, c51730MtA.A01) || Float.compare(this.A00, c51730MtA.A00) != 0) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C51730MtA)) {
                return false;
            }
            C51730MtA c51730MtA2 = (C51730MtA) obj;
            if (c51730MtA2.A03 != 0 || !C14360o3.A0K(this.A01, c51730MtA2.A01) || Float.compare(this.A00, c51730MtA2.A00) != 0 || !C14360o3.A0K(this.A02, c51730MtA2.A02)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A00;
        int hashCode;
        if (this.A03 != 0) {
            A00 = ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC25227BEk.A07(this.A01)) * 31;
            hashCode = Float.floatToIntBits(this.A00);
        } else {
            A00 = AbstractC166997dE.A00(AbstractC166987dD.A0J(this.A01), this.A00);
            hashCode = this.A02.hashCode();
        }
        return A00 + hashCode;
    }

    public final String toString() {
        if (1 - this.A03 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CommerceMediaProductSuggestionInput(productId=");
        A1C.append(this.A02);
        A1C.append(", merchantId=");
        A1C.append(this.A01);
        A1C.append(", confidenceLevel=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }

    public C51730MtA(String str, String str2, int i, float f) {
        this.A03 = 1;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51730MtA() {
        this(null, null, 1, 0.0f);
        this.A03 = 1;
        this.A03 = 1;
    }
}
