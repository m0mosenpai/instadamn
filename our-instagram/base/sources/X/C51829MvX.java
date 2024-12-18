package X;

/* renamed from: X.MvX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51829MvX extends C0T6 implements InterfaceC58034PoK {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51829MvX) {
                C51829MvX c51829MvX = (C51829MvX) obj;
                if (!C14360o3.A0K(this.A01, c51829MvX.A01) || !C14360o3.A0K(this.A00, c51829MvX.A00) || this.A03 != c51829MvX.A03 || this.A02 != c51829MvX.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58034PoK
    public final boolean Cce() {
        return this.A03;
    }

    @Override // X.InterfaceC58034PoK
    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A00)) * 31));
    }

    public C51829MvX(String str, String str2, boolean z, boolean z2) {
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TtsVoiceModel(name=");
        A1C.append(this.A01);
        A1C.append(", emojiCode=");
        A1C.append(this.A00);
        A1C.append(", isSelected=");
        A1C.append(this.A03);
        A1C.append(", isLoading=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }

    public C51829MvX() {
        this(null, null, false, false);
    }
}
