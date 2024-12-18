package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126985oc {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C5C8 A03;
    public final C118125Vw A04;
    public final C5DD A05;
    public final InterfaceC1128957x A06;
    public final AnonymousClass583 A07;
    public final List A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C126985oc) {
                C126985oc c126985oc = (C126985oc) obj;
                if (!C14360o3.A0K(this.A03, c126985oc.A03) || !C14360o3.A0K(this.A04, c126985oc.A04) || !C14360o3.A0K(this.A08, c126985oc.A08) || this.A00 != c126985oc.A00 || this.A09 != c126985oc.A09 || this.A01 != c126985oc.A01 || !C14360o3.A0K(this.A06, c126985oc.A06) || this.A07 != c126985oc.A07 || !C14360o3.A0K(this.A05, c126985oc.A05) || this.A02 != c126985oc.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A03.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int hashCode2 = (((((((((hashCode + i) * 31) + this.A01) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A05.hashCode()) * 31;
        long j = this.A02;
        return hashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TextLayoutInput(text=");
        sb.append((Object) this.A03);
        sb.append(MSV.A00(297));
        sb.append(this.A04);
        sb.append(", placeholders=");
        sb.append(this.A08);
        sb.append(", maxLines=");
        sb.append(this.A00);
        sb.append(", softWrap=");
        sb.append(this.A09);
        sb.append(", overflow=");
        int i = this.A01;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.A06);
        sb.append(", layoutDirection=");
        sb.append(this.A07);
        sb.append(", fontFamilyResolver=");
        sb.append(this.A05);
        sb.append(AbstractC58317Pt9.A00(151));
        sb.append((Object) Constraints.A05(this.A02));
        sb.append(')');
        return sb.toString();
    }

    public C126985oc(C5C8 c5c8, C118125Vw c118125Vw, C5DD c5dd, InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, List list, int i, int i2, long j, boolean z) {
        this.A03 = c5c8;
        this.A04 = c118125Vw;
        this.A08 = list;
        this.A00 = i;
        this.A09 = z;
        this.A01 = i2;
        this.A06 = interfaceC1128957x;
        this.A07 = anonymousClass583;
        this.A05 = c5dd;
        this.A02 = j;
    }
}
