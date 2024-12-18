package X;

/* loaded from: classes5.dex */
public final class BS5 extends C0T6 implements InterfaceC30806Dgh {
    public final C5QE A00;
    public final Integer A01;
    public final boolean A02;

    public BS5(C5QE c5qe, Integer num, boolean z) {
        C14360o3.A0B(num, 2);
        this.A00 = c5qe;
        this.A01 = num;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BS5) {
                BS5 bs5 = (BS5) obj;
                if (!C14360o3.A0K(this.A00, bs5.A00) || this.A01 != bs5.A01 || this.A02 != bs5.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00);
        Integer num = this.A01;
        return AbstractC166987dD.A0K(this.A02, AbstractC167017dG.A0L(num, JX7.A00(num), A0G));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextContent(text=");
        A1C.append(this.A00);
        A1C.append(", mimicryNoteType=");
        Integer num = this.A01;
        if (num != null) {
            str = JX7.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", useEnlargedStyling=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
