package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.68X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68X extends AbstractC56652iy implements C68Y {
    public C1349268q[] A00;
    public AbstractC56652iy[] A01;
    public byte[] A02;
    public String[] A03;

    public final void A00(C68W c68w) {
        byte b;
        byte b2;
        List list = c68w.A01;
        if (list == null) {
            list = new ArrayList();
            c68w.A01 = list;
        }
        list.add(this);
        C1349268q[] c1349268qArr = this.A00;
        if (c1349268qArr != null) {
            for (C1349268q c1349268q : c1349268qArr) {
                List list2 = c68w.A00;
                if (list2 == null) {
                    list2 = new ArrayList();
                    c68w.A00 = list2;
                }
                list2.add(c1349268q);
            }
        }
        byte[] bArr = this.A02;
        if (bArr != null) {
            byte[] bArr2 = c68w.A03;
            if (bArr2 != null) {
                int length = bArr.length;
                int length2 = bArr2.length;
                int i = 0;
                if (length <= length2) {
                    if (length < length2) {
                        while (i < length) {
                            if (bArr[i] > bArr2[i]) {
                                b2 = bArr[i];
                            } else {
                                b2 = bArr2[i];
                            }
                            bArr2[i] = b2;
                            i++;
                        }
                    }
                } else {
                    while (i < length2) {
                        if (bArr[i] > bArr2[i]) {
                            b = bArr[i];
                        } else {
                            b = bArr2[i];
                        }
                        bArr[i] = b;
                        i++;
                    }
                }
            }
            c68w.A03 = bArr;
        }
        AbstractC56652iy[] abstractC56652iyArr = this.A01;
        if (abstractC56652iyArr != null) {
            for (AbstractC56652iy abstractC56652iy : abstractC56652iyArr) {
                ((C68X) abstractC56652iy).A00(c68w);
            }
        }
        ((C1348568b) super.A02).A01(c68w, this, this.A03);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        AbstractC56602it abstractC56602it;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            C68Y c68y = (C68Y) C68Z.class.newInstance();
            c68y.ANn(byteBuffer, A00);
            abstractC56602it = c68y;
        } else {
            abstractC56602it = null;
        }
        AbstractC56602it abstractC56602it2 = abstractC56602it;
        if (abstractC56602it2 != null) {
            super.A03 = abstractC56602it2;
            float f = 0.0f;
            int A002 = AbstractC1348468a.A00(byteBuffer, i, 1);
            if (A002 != 0) {
                f = byteBuffer.getFloat(A002);
            }
            super.A01 = f;
            float f2 = 0.0f;
            int A003 = AbstractC1348468a.A00(byteBuffer, i, 2);
            if (A003 != 0) {
                f2 = byteBuffer.getFloat(A003);
            }
            super.A00 = f2;
            AbstractC56612iu abstractC56612iu = (AbstractC56612iu) AbstractC1348468a.A01(C1348568b.class, byteBuffer, i, 4);
            if (abstractC56612iu != null) {
                super.A02 = abstractC56612iu;
                this.A00 = (C1349268q[]) AbstractC1348468a.A06(C1349168p.class, byteBuffer, i, 5);
                this.A01 = (AbstractC56652iy[]) AbstractC1348468a.A06(C68X.class, byteBuffer, i, 6);
                this.A03 = AbstractC1348468a.A07(byteBuffer, i, 7);
                this.A02 = AbstractC1348468a.A04(byteBuffer, i, 9);
                this.A04 = (AnonymousClass692[]) AbstractC1348468a.A06(AnonymousClass691.class, byteBuffer, i, 10);
                return;
            }
            throw new IllegalArgumentException("root layer cannot be null");
        }
        throw new IllegalArgumentException("size cannot be null");
    }
}
