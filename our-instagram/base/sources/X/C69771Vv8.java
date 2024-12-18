package X;

import java.util.List;

/* renamed from: X.Vv8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69771Vv8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C135266Ab A03;
    public final C135266Ab A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69771Vv8) {
                C69771Vv8 c69771Vv8 = (C69771Vv8) obj;
                if (!C14360o3.A0K(this.A04, c69771Vv8.A04) || !C14360o3.A0K(this.A03, c69771Vv8.A03) || !C14360o3.A0K(this.A05, c69771Vv8.A05) || this.A00 != c69771Vv8.A00 || this.A01 != c69771Vv8.A01 || this.A02 != c69771Vv8.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A03, this.A04.hashCode() * 31)) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalSplitPaneLayoutData(topSectionRenderResult=");
        sb.append(this.A04);
        sb.append(", bottomSectionRenderResult=");
        sb.append(this.A03);
        sb.append(", detentPixels=");
        sb.append(this.A05);
        sb.append(", initialDetent=");
        sb.append(this.A00);
        sb.append(", topSectionMinHeight=");
        sb.append(this.A01);
        sb.append(", totalHeight=");
        return AbstractC25236BEt.A0Z(sb, this.A02);
    }

    public C69771Vv8(C135266Ab c135266Ab, C135266Ab c135266Ab2, List list, int i, int i2, int i3) {
        this.A04 = c135266Ab;
        this.A03 = c135266Ab2;
        this.A05 = list;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
