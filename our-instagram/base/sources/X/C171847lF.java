package X;

import java.util.List;

/* renamed from: X.7lF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171847lF extends C0T6 implements InterfaceC171857lG {
    public final C171877lI A00;
    public final C171817lC A01;
    public final List A02;
    public final C171867lH A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C171847lF(C171867lH c171867lH, C171877lI c171877lI, C171817lC c171817lC, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(list, 2);
        this.A05 = z;
        this.A02 = list;
        this.A06 = z2;
        this.A04 = list2;
        this.A01 = c171817lC;
        this.A03 = c171867lH;
        this.A07 = z3;
        this.A00 = c171877lI;
        this.A08 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C171847lF) {
                C171847lF c171847lF = (C171847lF) obj;
                if (this.A05 != c171847lF.A05 || !C14360o3.A0K(this.A02, c171847lF.A02) || this.A06 != c171847lF.A06 || !C14360o3.A0K(this.A04, c171847lF.A04) || !C14360o3.A0K(this.A01, c171847lF.A01) || !C14360o3.A0K(this.A03, c171847lF.A03) || this.A07 != c171847lF.A07 || !C14360o3.A0K(this.A00, c171847lF.A00) || this.A08 != c171847lF.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int hashCode4 = ((i * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A06) {
            i2 = 1231;
        }
        int i3 = (hashCode4 + i2) * 31;
        List list = this.A04;
        int i4 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        C171817lC c171817lC = this.A01;
        if (c171817lC == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c171817lC.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        C171867lH c171867lH = this.A03;
        if (c171867lH == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c171867lH.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        int i8 = 1237;
        if (this.A07) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        C171877lI c171877lI = this.A00;
        if (c171877lI != null) {
            i4 = c171877lI.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        int i11 = 1237;
        if (this.A08) {
            i11 = 1231;
        }
        return i10 + i11;
    }
}
