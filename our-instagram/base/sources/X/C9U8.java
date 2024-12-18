package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.9U8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9U8 extends AbstractC66542zW {
    public final List A00;
    public final List A01;

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        Bitmap[] bitmapArr;
        C51683MsE c51683MsE;
        C51683MsE c51683MsE2;
        C09530e4 c09530e4 = (C09530e4) this.A01.get(i);
        Bitmap[] bitmapArr2 = null;
        if (c09530e4 != null && (c51683MsE2 = (C51683MsE) c09530e4.A01) != null) {
            bitmapArr = c51683MsE2.A01();
        } else {
            bitmapArr = null;
        }
        C09530e4 c09530e42 = (C09530e4) this.A00.get(i2);
        if (c09530e42 != null && (c51683MsE = (C51683MsE) c09530e42.A01) != null) {
            bitmapArr2 = c51683MsE.A01();
        }
        return AbstractC16990sr.A0d(bitmapArr, bitmapArr2);
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        Object obj;
        C09530e4 c09530e4 = (C09530e4) this.A01.get(i);
        Object obj2 = null;
        if (c09530e4 != null) {
            obj = c09530e4.A00;
        } else {
            obj = null;
        }
        C09530e4 c09530e42 = (C09530e4) this.A00.get(i2);
        if (c09530e42 != null) {
            obj2 = c09530e42.A00;
        }
        return C14360o3.A0K(obj, obj2);
    }

    public C9U8(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
