package X;

import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: X.Ttq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65775Ttq {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final /* synthetic */ FlexboxLayoutManager A07;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r0 == r2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4.A02 == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r6.A05 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C65775Ttq r6) {
        /*
            r0 = -1
            r6.A03 = r0
            r6.A01 = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.A00 = r0
            r5 = 0
            r6.A06 = r5
            r6.A04 = r5
            com.google.android.flexbox.FlexboxLayoutManager r4 = r6.A07
            boolean r3 = r4.CXy()
            r2 = 2
            r1 = 1
            int r0 = r4.A03
            if (r3 == 0) goto L24
            if (r0 != 0) goto L29
            int r0 = r4.A02
            if (r0 != r1) goto L21
        L20:
            r5 = 1
        L21:
            r6.A05 = r5
            return
        L24:
            if (r0 != 0) goto L29
            int r0 = r4.A02
            r2 = 3
        L29:
            if (r0 != r2) goto L21
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65775Ttq.A01(X.Ttq):void");
    }

    public C65775Ttq(FlexboxLayoutManager flexboxLayoutManager) {
        this.A07 = flexboxLayoutManager;
    }

    public static void A00(C65775Ttq c65775Ttq) {
        int A06;
        FlexboxLayoutManager flexboxLayoutManager = c65775Ttq.A07;
        if (!flexboxLayoutManager.CXy() && flexboxLayoutManager.A0L) {
            if (!c65775Ttq.A05) {
                A06 = ((AbstractC70663Fe) flexboxLayoutManager).A03 - flexboxLayoutManager.A0B.A06();
            }
            A06 = flexboxLayoutManager.A0B.A03();
        } else {
            if (!c65775Ttq.A05) {
                A06 = flexboxLayoutManager.A0B.A06();
            }
            A06 = flexboxLayoutManager.A0B.A03();
        }
        c65775Ttq.A00 = A06;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC111324zv.A00(1499));
        sb.append(this.A03);
        sb.append(AbstractC43591JPw.A00(513));
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(1431));
        sb.append(this.A00);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1432));
        sb.append(this.A05);
        sb.append(AbstractC111324zv.A00(1433));
        sb.append(this.A06);
        sb.append(", mAssignedFromSavedState=");
        sb.append(this.A04);
        return AbstractC167027dH.A0R(sb);
    }
}
