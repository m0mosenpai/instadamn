package X;

import java.util.Arrays;

/* renamed from: X.SNt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62729SNt {
    public C62680SLt A01;
    public Object[] A02 = new Object[8];
    public int A00 = 0;

    public final C64775TTj A00() {
        C62680SLt c62680SLt = this.A01;
        if (c62680SLt == null) {
            C64775TTj A00 = C64775TTj.A00(this, this.A02, this.A00);
            c62680SLt = this.A01;
            if (c62680SLt == null) {
                return A00;
            }
        }
        throw c62680SLt.A00();
    }

    public final void A01(Object obj, Object obj2) {
        int i = this.A00 + 1;
        Object[] objArr = this.A02;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.A02 = Arrays.copyOf(objArr, AbstractC58323PtF.A03(length, i2));
        }
        AbstractC62216S2l.A00(obj, obj2);
        Object[] objArr2 = this.A02;
        int i3 = this.A00;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.A00 = i3 + 1;
    }
}
