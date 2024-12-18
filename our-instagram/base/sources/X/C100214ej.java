package X;

import android.os.Process;

/* renamed from: X.4ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100214ej extends AbstractC100064eU implements InterfaceC100084eW {
    public long[][] A01;
    public C100224ek A03;
    public final boolean A04;
    public int A00 = 0;
    public C100224ek A02 = new C100224ek(Process.myPid());

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "io";
    }

    private void A00() {
        long[][] jArr;
        int length;
        if (this.A04 && (length = (jArr = this.A01).length) != 0) {
            C100224ek c100224ek = this.A02;
            c100224ek.A00();
            C100224ek c100224ek2 = this.A03;
            c100224ek2.A00();
            long[] jArr2 = jArr[this.A00];
            jArr2[0] = c100224ek.A00;
            System.arraycopy(c100224ek.A02, 0, jArr2, 1, 2);
            System.arraycopy(c100224ek2.A02, 0, jArr2, 3, 2);
            int i = this.A00 + 1;
            this.A00 = i;
            this.A00 = i % length;
        }
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        if (this.A04) {
            A00();
        }
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
        if (this.A04) {
            A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r1.A01 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C100214ej() {
        /*
            r5 = this;
            r5.<init>()
            r4 = 0
            r5.A00 = r4
            int r1 = android.os.Process.myPid()
            X.4ek r0 = new X.4ek
            r0.<init>(r1)
            r5.A02 = r0
            X.4ek r1 = new X.4ek
            r1.<init>()
            r5.A03 = r1
            X.4ek r0 = r5.A02
            boolean r0 = r0.A01
            r3 = 1
            if (r0 == 0) goto L24
            boolean r1 = r1.A01
            r0 = 1
            if (r1 != 0) goto L25
        L24:
            r0 = 0
        L25:
            r5.A04 = r0
            r1 = 2
            if (r0 == 0) goto L3e
            r2 = 15
            r0 = 5
            int[] r1 = new int[r1]
            r1[r3] = r0
            r1[r4] = r2
        L33:
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            long[][] r0 = (long[][]) r0
            r5.A01 = r0
            return
        L3e:
            int[] r1 = new int[r1]
            r1 = {x0044: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100214ej.<init>():void");
    }
}
