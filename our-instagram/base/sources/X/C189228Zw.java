package X;

/* renamed from: X.8Zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189228Zw extends AbstractC189198Zo {
    public final C8Ba A00;
    public final C115475Kh A01;
    public final InterfaceC16620sF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C189228Zw) {
                C189228Zw c189228Zw = (C189228Zw) obj;
                if (!C14360o3.A0K(this.A01, c189228Zw.A01) || !C14360o3.A0K(this.A02, c189228Zw.A02) || !C14360o3.A0K(this.A00, c189228Zw.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateFirstFrameEvent(videoSegment=");
        sb.append(this.A01);
        sb.append(", onBitmapReady=");
        sb.append(this.A02);
        sb.append(", bitmapGeneratorParams=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C189228Zw(C8Ba c8Ba, C115475Kh c115475Kh, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = c115475Kh;
        this.A02 = interfaceC16620sF;
        this.A00 = c8Ba;
    }
}
