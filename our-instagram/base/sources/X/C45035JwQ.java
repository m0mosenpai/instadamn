package X;

/* renamed from: X.JwQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45035JwQ extends C0T6 {
    public InterfaceC83713oG A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45035JwQ) {
                C45035JwQ c45035JwQ = (C45035JwQ) obj;
                if (this.A01 != c45035JwQ.A01 || !C14360o3.A0K(this.A00, c45035JwQ.A00) || !C14360o3.A0K(this.A03, c45035JwQ.A03) || !C14360o3.A0K(this.A02, c45035JwQ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0K(this.A03, ((this.A01 * 31) + AbstractC167017dG.A0M(this.A00)) * 31));
    }

    public C45035JwQ(InterfaceC83713oG interfaceC83713oG, String str, String str2, int i) {
        AbstractC37302Gc3.A1U(str, str2);
        this.A01 = i;
        this.A00 = interfaceC83713oG;
        this.A03 = str;
        this.A02 = str2;
    }
}
