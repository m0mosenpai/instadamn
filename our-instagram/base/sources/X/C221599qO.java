package X;

/* renamed from: X.9qO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221599qO extends AbstractC189198Zo {
    public final int A00;
    public final C115475Kh A01;
    public final InterfaceC16620sF A02;
    public final C8Ba A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C221599qO) {
                C221599qO c221599qO = (C221599qO) obj;
                if (!C14360o3.A0K(this.A01, c221599qO.A01) || this.A00 != c221599qO.A00 || !C14360o3.A0K(this.A02, c221599qO.A02) || !C14360o3.A0K(this.A03, c221599qO.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A02, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31));
    }

    public C221599qO(C8Ba c8Ba, C115475Kh c115475Kh, InterfaceC16620sF interfaceC16620sF, int i) {
        this.A01 = c115475Kh;
        this.A00 = i;
        this.A02 = interfaceC16620sF;
        this.A03 = c8Ba;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GenerateSingleFrameEvent(videoSegment=");
        A1C.append(this.A01);
        A1C.append(", frameMs=");
        A1C.append(this.A00);
        A1C.append(", onBitmapReady=");
        A1C.append(this.A02);
        A1C.append(", bitmapGeneratorParams=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
