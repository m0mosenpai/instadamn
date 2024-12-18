package X;

import java.nio.ByteBuffer;

/* renamed from: X.68l, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68l extends AbstractC1348968m implements C68Y {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.68e, X.68f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.68w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.68w, java.lang.Object] */
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        Object[] objArr;
        Object obj;
        AbstractC1348768d abstractC1348768d = (AbstractC1348768d) AbstractC1348468a.A01(C68k.class, byteBuffer, i, 0);
        AbstractC1348768d abstractC1348768d2 = (AbstractC1348768d) AbstractC1348468a.A01(C68k.class, byteBuffer, i, 1);
        if (abstractC1348768d != null && abstractC1348768d2 != null) {
            Object obj2 = abstractC1348768d.A00;
            if (obj2 != null && (obj = abstractC1348768d2.A00) != null) {
                C56502ij[] c56502ijArr = {(C56502ij) obj2, (C56502ij) obj};
                ?? obj3 = new Object();
                obj3.A01 = c56502ijArr;
                obj3.A00 = 2;
                this.A01 = obj3;
            } else {
                Object[] objArr2 = ((AbstractC1348868e) abstractC1348768d).A00;
                if (objArr2 != null && (objArr = ((AbstractC1348868e) abstractC1348768d2).A00) != null) {
                    C68o[] c68oArr = (C68o[]) objArr2;
                    int length = c68oArr.length;
                    C1349668v[] c1349668vArr = new C1349668v[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        C56502ij[] c56502ijArr2 = {c68oArr[i2], ((C68o[]) objArr)[i2]};
                        ?? obj4 = new Object();
                        obj4.A01 = c56502ijArr2;
                        obj4.A00 = 2;
                        c1349668vArr[i2] = obj4;
                    }
                    float[] fArr = ((C68f) abstractC1348768d).A00;
                    AnonymousClass690[] anonymousClass690Arr = abstractC1348768d.A01;
                    ?? obj5 = new Object();
                    obj5.A00 = c1349668vArr;
                    obj5.A00 = fArr;
                    obj5.A01 = anonymousClass690Arr;
                    this.A02 = obj5;
                }
            }
        }
        AbstractC1348768d abstractC1348768d3 = (AbstractC1348768d) AbstractC1348468a.A01(C1348668c.class, byteBuffer, i, 2);
        if (abstractC1348768d3 != null) {
            this.A07 = (C3LS) abstractC1348768d3.A00;
            if (((AbstractC1348868e) abstractC1348768d3).A00 != null) {
                this.A05 = abstractC1348768d3;
            }
        }
        AbstractC1348768d abstractC1348768d4 = (AbstractC1348768d) AbstractC1348468a.A01(C1348668c.class, byteBuffer, i, 3);
        if (abstractC1348768d4 != null) {
            this.A06 = (C3LS) abstractC1348768d4.A00;
            if (((AbstractC1348868e) abstractC1348768d4).A00 != null) {
                this.A04 = abstractC1348768d4;
            }
        }
        byte b = 0;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 4);
        if (A00 != 0) {
            b = byteBuffer.get(A00);
        }
        this.A00 = b;
        AbstractC1348768d abstractC1348768d5 = (AbstractC1348768d) AbstractC1348468a.A01(C68t.class, byteBuffer, i, 5);
        if (abstractC1348768d5 != null) {
            this.A01 = (C1349768w) abstractC1348768d5.A00;
            if (((AbstractC1348868e) abstractC1348768d5).A00 != null) {
                this.A02 = abstractC1348768d5;
            }
        }
        AbstractC1348768d abstractC1348768d6 = (AbstractC1348768d) AbstractC1348468a.A01(C1349568u.class, byteBuffer, i, 6);
        if (abstractC1348768d6 != null) {
            this.A08 = (C1349968y) abstractC1348768d6.A00;
            if (((AbstractC1348868e) abstractC1348768d6).A00 != null) {
                this.A03 = abstractC1348768d6;
            }
        }
    }
}
