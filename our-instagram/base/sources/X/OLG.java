package X;

/* loaded from: classes9.dex */
public final class OLG {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof OLG) && C14360o3.A0K(this.A00, ((OLG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public OLG(Integer num) {
        this.A00 = num;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StickerInfo(maxSavedCutoutStickerLimit=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
