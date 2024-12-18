package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3f3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78373f3 implements InterfaceC50892Vl {
    public final int A00;
    public final AbstractC50812Vc A01;
    public final C2XE A02;
    public final C2W1 A03;
    public final C76133bI A04;
    public final C78323ey A05;
    public final C75803al A06;
    public final List A07;
    public final AtomicReference A08;
    public final boolean A09;
    public final C76123bH A0A;

    public C78373f3(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2W1 c2w1, C76123bH c76123bH, C76133bI c76133bI, C78323ey c78323ey, C75803al c75803al, List list, int i, boolean z) {
        C14360o3.A0B(c76123bH, 4);
        this.A03 = c2w1;
        this.A02 = c2xe;
        this.A01 = abstractC50812Vc;
        this.A0A = c76123bH;
        this.A06 = c75803al;
        this.A09 = z;
        this.A00 = i;
        this.A07 = list;
        this.A05 = c78323ey;
        this.A04 = c76133bI;
        this.A08 = new AtomicReference(c76123bH);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C78373f3) {
                C78373f3 c78373f3 = (C78373f3) obj;
                if (!C14360o3.A0K(this.A03, c78373f3.A03) || !C14360o3.A0K(this.A02, c78373f3.A02) || !C14360o3.A0K(this.A01, c78373f3.A01) || !C14360o3.A0K(this.A0A, c78373f3.A0A) || !C14360o3.A0K(this.A06, c78373f3.A06) || this.A09 != c78373f3.A09 || this.A00 != c78373f3.A00 || !C14360o3.A0K(this.A07, c78373f3.A07) || !C14360o3.A0K(this.A05, c78373f3.A05) || !C14360o3.A0K(this.A04, c78373f3.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResolveResult(node=");
        sb.append(this.A03);
        sb.append(AbstractC43591JPw.A00(226));
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1404));
        sb.append(this.A01);
        sb.append(", cache=");
        sb.append(this.A0A);
        sb.append(", treeState=");
        sb.append(this.A06);
        sb.append(", isPartialResult=");
        sb.append(this.A09);
        sb.append(AbstractC111324zv.A00(1466));
        sb.append(this.A00);
        sb.append(", eventHandlers=");
        sb.append(this.A07);
        sb.append(", outputs=");
        sb.append(this.A05);
        sb.append(", contextForResuming=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC50892Vl
    public final boolean Ca6() {
        return this.A09;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        C2W1 c2w1 = this.A03;
        int i = 0;
        if (c2w1 == null) {
            hashCode = 0;
        } else {
            hashCode = c2w1.hashCode();
        }
        int hashCode4 = ((((((((hashCode * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i2 = 1237;
        if (this.A09) {
            i2 = 1231;
        }
        int i3 = (((hashCode4 + i2) * 31) + this.A00) * 31;
        List list = this.A07;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        C78323ey c78323ey = this.A05;
        if (c78323ey == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c78323ey.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        C76133bI c76133bI = this.A04;
        if (c76133bI != null) {
            i = c76133bI.hashCode();
        }
        return i5 + i;
    }
}
