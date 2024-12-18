package X;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: X.YKj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73556YKj extends AbstractC17030sv {
    public final ArrayDeque A00;
    public final /* synthetic */ PV1 A01;

    public C73556YKj(PV1 pv1) {
        AbstractC72700XlT yKn;
        this.A01 = pv1;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.A00 = arrayDeque;
        File file = pv1.A00;
        if (file.isDirectory()) {
            if (this.A01.A01.intValue() != 0) {
                yKn = new C73558YKl(file, this);
            } else {
                yKn = new C73557YKk(file, this);
            }
        } else if (file.isFile()) {
            yKn = new YKn(file, this);
        } else {
            super.A00 = 2;
            return;
        }
        arrayDeque.push(yKn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3 A[SYNTHETIC] */
    @Override // X.AbstractC17030sv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r7 = this;
        L0:
            java.util.ArrayDeque r3 = r7.A00
            java.lang.Object r6 = r3.peek()
            X.XlT r6 = (X.AbstractC72700XlT) r6
            if (r6 != 0) goto Le
            r0 = 2
        Lb:
            r7.A00 = r0
            return
        Le:
            boolean r0 = r6 instanceof X.C73557YKk
            if (r0 == 0) goto L51
            r4 = r6
            X.YKk r4 = (X.C73557YKk) r4
            boolean r0 = r4.A01
            if (r0 != 0) goto La8
            r0 = 1
            r4.A01 = r0
            java.io.File r4 = r4.A00
        L1e:
            if (r4 == 0) goto La3
            java.io.File r0 = r6.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lbe
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto Lbe
            int r2 = r3.size()
            X.PV1 r1 = r7.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r0) goto Lbe
            java.lang.Integer r0 = r1.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L4b
            X.YKl r0 = new X.YKl
            r0.<init>(r4, r7)
        L47:
            r3.push(r0)
            goto L0
        L4b:
            X.YKk r0 = new X.YKk
            r0.<init>(r4, r7)
            goto L47
        L51:
            boolean r0 = r6 instanceof X.C73558YKl
            if (r0 == 0) goto L89
            r5 = r6
            X.YKl r5 = (X.C73558YKl) r5
            boolean r0 = r5.A01
            r4 = 1
            if (r0 != 0) goto L6d
            java.io.File[] r0 = r5.A03
            if (r0 != 0) goto L6d
            java.io.File r0 = r5.A00
            java.io.File[] r0 = r0.listFiles()
            r5.A03 = r0
            if (r0 != 0) goto L6d
            r5.A01 = r4
        L6d:
            java.io.File[] r2 = r5.A03
            if (r2 == 0) goto L82
            int r1 = r5.A00
            int r0 = r2.length
            if (r1 >= r0) goto L82
            X.C14360o3.A0A(r2)
            int r1 = r5.A00
            int r0 = r1 + 1
            r5.A00 = r0
            r4 = r2[r1]
            goto L1e
        L82:
            boolean r0 = r5.A02
            if (r0 != 0) goto La3
            r5.A02 = r4
            goto L93
        L89:
            r5 = r6
            X.YKn r5 = (X.YKn) r5
            boolean r0 = r5.A00
            if (r0 != 0) goto La3
            r0 = 1
            r5.A00 = r0
        L93:
            java.io.File r4 = r5.A00
            goto L1e
        L96:
            java.io.File r0 = r4.A00
            java.io.File[] r1 = r0.listFiles()
            r4.A02 = r1
            if (r1 == 0) goto La3
            int r0 = r1.length
            if (r0 != 0) goto Lb1
        La3:
            r3.pop()
            goto L0
        La8:
            java.io.File[] r1 = r4.A02
            if (r1 == 0) goto L96
            int r2 = r4.A00
            int r0 = r1.length
            if (r2 >= r0) goto La3
        Lb1:
            X.C14360o3.A0A(r1)
            int r2 = r4.A00
            int r0 = r2 + 1
            r4.A00 = r0
            r4 = r1[r2]
            goto L1e
        Lbe:
            r7.A01 = r4
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73556YKj.A00():void");
    }
}
