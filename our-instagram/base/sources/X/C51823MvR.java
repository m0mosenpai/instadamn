package X;

/* renamed from: X.MvR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51823MvR extends C0T6 implements InterfaceC185318Jx {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51823MvR) {
                C51823MvR c51823MvR = (C51823MvR) obj;
                if (!C14360o3.A0K(this.A02, c51823MvR.A02) || !C14360o3.A0K(this.A01, c51823MvR.A01) || this.A04 != c51823MvR.A04 || this.A03 != c51823MvR.A03 || this.A00 != c51823MvR.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC185318Jx
    public final boolean Cce() {
        return this.A04;
    }

    @Override // X.InterfaceC185318Jx
    public final String getName() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A04, ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC25227BEk.A07(this.A01)) * 31)) + this.A00;
    }

    public C51823MvR(String str, String str2, int i, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextToSpeechListItemModel(name=");
        A1C.append(this.A02);
        A1C.append(", emojiCode=");
        A1C.append(this.A01);
        A1C.append(", isSelected=");
        A1C.append(this.A04);
        A1C.append(", isLoading=");
        A1C.append(this.A03);
        A1C.append(", itemType=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }

    public C51823MvR() {
        this(null, null, 0, false, false);
    }
}
