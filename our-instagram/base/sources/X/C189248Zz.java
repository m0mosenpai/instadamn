package X;

/* renamed from: X.8Zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189248Zz extends AbstractC189198Zo {
    public final C115475Kh A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C189248Zz) && C14360o3.A0K(this.A00, ((C189248Zz) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveFirstFrameEvent(videoSegment=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C189248Zz(C115475Kh c115475Kh) {
        this.A00 = c115475Kh;
    }
}
