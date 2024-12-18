package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.R8u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60579R8u extends AbstractC23551Cr {
    public int A00;
    public final C16L[] A01;

    public C60579R8u(C16L[] c16lArr) {
        ((AbstractC23551Cr) this).A00 = c16lArr[0];
        this.A01 = c16lArr;
        this.A00 = 1;
    }

    public static C60579R8u A00(C16L c16l, C16L c16l2) {
        C16L[] c16lArr;
        if (!(c16l2 instanceof C60579R8u)) {
            c16lArr = new C16L[]{c16l, c16l2};
        } else {
            ArrayList A0z = AbstractC31174DnI.A0z(c16l);
            ((C60579R8u) c16l2).A1U(A0z);
            c16lArr = (C16L[]) A0z.toArray(new C16L[A0z.size()]);
        }
        return new C60579R8u(c16lArr);
    }

    @Override // X.AbstractC23551Cr, X.C16L
    public final C16L A0z() {
        C16R A10 = ((AbstractC23551Cr) this).A00.A10();
        if (A10 == C16R.A0D || A10 == C16R.A0C) {
            int i = 1;
            while (true) {
                C16R A1J = A1J();
                if (A1J == null) {
                    break;
                }
                if (A1J.A05) {
                    i++;
                } else if (A1J.A04 && i - 1 == 0) {
                    return this;
                }
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        r2 = r3.A00;
        r1 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r2 >= r1.length) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        r3.A00 = r2 + 1;
        r0 = r1[r2];
        ((X.AbstractC23551Cr) r3).A00 = r0;
        r0 = r0.A1J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 == null) goto L15;
     */
    @Override // X.AbstractC23551Cr, X.C16L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C16R A1J() {
        /*
            r3 = this;
            X.16L r0 = r3.A00
            if (r0 == 0) goto L20
            X.16R r0 = r0.A1J()
            if (r0 != 0) goto L1f
        La:
            int r2 = r3.A00
            X.16L[] r1 = r3.A01
            int r0 = r1.length
            if (r2 >= r0) goto L20
            int r0 = r2 + 1
            r3.A00 = r0
            r0 = r1[r2]
            r3.A00 = r0
            X.16R r0 = r0.A1J()
            if (r0 == 0) goto La
        L1f:
            return r0
        L20:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60579R8u.A1J():X.16R");
    }

    public final void A1U(List list) {
        C16L[] c16lArr = this.A01;
        int length = c16lArr.length;
        for (int i = this.A00 - 1; i < length; i++) {
            C16L c16l = c16lArr[i];
            if (c16l instanceof C60579R8u) {
                ((C60579R8u) c16l).A1U(list);
            } else {
                list.add(c16l);
            }
        }
    }

    @Override // X.AbstractC23551Cr, X.C16L, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            ((AbstractC23551Cr) this).A00.close();
            int i = this.A00;
            C16L[] c16lArr = this.A01;
            if (i < c16lArr.length) {
                this.A00 = i + 1;
                ((AbstractC23551Cr) this).A00 = c16lArr[i];
            } else {
                return;
            }
        }
    }
}
