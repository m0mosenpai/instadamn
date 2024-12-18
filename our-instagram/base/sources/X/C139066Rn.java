package X;

/* renamed from: X.6Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139066Rn extends AbstractC139056Rm {
    public String A00;
    public boolean A01;
    public boolean A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("imagecomponent_");
        sb.append(this.A05);
        sb.append("(onScreen: ");
        sb.append(this.A04);
        sb.append(", hasBeenOnScreen: ");
        sb.append(this.A03);
        sb.append(", didLoad: ");
        sb.append(this.A02);
        sb.append(", didFailToLoad: ");
        sb.append(this.A01);
        sb.append(", loadSource: ");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
