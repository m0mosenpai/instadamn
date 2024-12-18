package X;

import java.util.Arrays;

/* renamed from: X.7gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168927gR extends C0T6 {
    public final float A00;
    public final float A01;
    public final AbstractC50812Vc A02;
    public final Object A03;
    public final InterfaceC16820sZ A04;
    public final boolean A05;
    public final Object[] A06;

    public C168927gR(AbstractC50812Vc abstractC50812Vc, Object obj, InterfaceC16820sZ interfaceC16820sZ, Object[] objArr, float f, float f2, boolean z) {
        C14360o3.A0B(obj, 1);
        this.A03 = obj;
        this.A02 = abstractC50812Vc;
        this.A04 = interfaceC16820sZ;
        this.A05 = z;
        this.A01 = f;
        this.A00 = f2;
        this.A06 = objArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168927gR) {
                C168927gR c168927gR = (C168927gR) obj;
                if (!C14360o3.A0K(this.A03, c168927gR.A03) || !C14360o3.A0K(this.A02, c168927gR.A02) || !C14360o3.A0K(this.A04, c168927gR.A04) || this.A05 != c168927gR.A05 || Float.compare(this.A01, c168927gR.A01) != 0 || Float.compare(this.A00, c168927gR.A00) != 0 || !C14360o3.A0K(this.A06, c168927gR.A06)) {
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
        int hashCode4 = this.A03.hashCode() * 31;
        AbstractC50812Vc abstractC50812Vc = this.A02;
        if (abstractC50812Vc == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC50812Vc.hashCode();
        }
        int i = (hashCode4 + hashCode) * 31;
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        if (interfaceC16820sZ == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC16820sZ.hashCode();
        }
        int A00 = (((i + hashCode2) * 31) + AbstractC53644Nnp.A00()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int floatToIntBits = (((((A00 + i2) * 31 * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00)) * 31;
        Object[] objArr = this.A06;
        if (objArr == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Arrays.hashCode(objArr);
        }
        return (floatToIntBits + hashCode3) * 31 * 31;
    }
}
