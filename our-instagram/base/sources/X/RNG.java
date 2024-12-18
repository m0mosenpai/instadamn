package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class RNG extends AbstractC61402Rn1 {
    public boolean A01;
    public Object[] A02 = new Object[4];
    public int A00 = 0;

    public final void A00(Object obj) {
        obj.getClass();
        int i = this.A00 + 1;
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, AbstractC58323PtF.A03(length, i));
        } else {
            if (this.A01) {
                objArr = (Object[]) objArr.clone();
            }
            int i2 = this.A00;
            this.A00 = i2 + 1;
            objArr[i2] = obj;
        }
        this.A02 = objArr;
        this.A01 = false;
        int i22 = this.A00;
        this.A00 = i22 + 1;
        objArr[i22] = obj;
    }
}
