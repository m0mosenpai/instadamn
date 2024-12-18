package X;

import android.os.SystemClock;

/* renamed from: X.4ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100224ek {
    public static final String[] A05;
    public long A00;
    public final boolean A01;
    public final long[] A02;
    public final String A03;
    public final long[] A04;

    static {
        String str;
        int i = 0;
        Integer[] numArr = {C05F.A0Y, C05F.A0j};
        String[] strArr = new String[2];
        A05 = strArr;
        int i2 = 0;
        do {
            int i3 = i2 + 1;
            switch (numArr[i].intValue()) {
                case 1:
                    str = "wchar:";
                    break;
                case 2:
                    str = "syscr:";
                    break;
                case 3:
                    str = "syscw:";
                    break;
                case 4:
                    str = "read_bytes:";
                    break;
                case 5:
                    str = "write_bytes:";
                    break;
                case 6:
                    str = "cancelled_write_bytes:";
                    break;
                default:
                    str = "rchar:";
                    break;
            }
            strArr[i2] = str;
            i++;
            i2 = i3;
        } while (i < 2);
    }

    public final void A00() {
        if (!this.A01) {
            return;
        }
        try {
            long[] jArr = new long[2];
            C0JC.A02(this.A03, jArr, A05);
            this.A00 = SystemClock.uptimeMillis();
            int i = 0;
            do {
                long[] jArr2 = this.A02;
                long j = jArr[i];
                long[] jArr3 = this.A04;
                jArr2[i] = j - jArr3[i];
                jArr3[i] = jArr[i];
                i++;
            } while (i < 2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r1.canRead() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C100224ek(int r5) {
        /*
            r4 = this;
            r4.<init>()
            r1 = 2
            long[] r0 = new long[r1]
            r4.A04 = r0
            long[] r0 = new long[r1]
            r4.A02 = r0
            r0 = 0
            r4.A00 = r0
            java.lang.String r3 = "/proc/"
            int r2 = android.os.Process.myPid()
            java.lang.String r1 = "/task/"
            java.lang.String r0 = "/io"
            java.lang.String r0 = X.AnonymousClass001.A0n(r3, r1, r0, r2, r5)
            r4.A03 = r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L32
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L33
        L32:
            r0 = 0
        L33:
            r4.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100224ek.<init>(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r1.canRead() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C100224ek() {
        /*
            r3 = this;
            r3.<init>()
            r1 = 2
            long[] r0 = new long[r1]
            r3.A04 = r0
            long[] r0 = new long[r1]
            r3.A02 = r0
            r0 = 0
            r3.A00 = r0
            java.lang.String r2 = "/proc/"
            int r1 = android.os.Process.myPid()
            java.lang.String r0 = "/io"
            java.lang.String r0 = X.AnonymousClass001.A0c(r2, r0, r1)
            r3.A03 = r0
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L30
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L31
        L30:
            r0 = 0
        L31:
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100224ek.<init>():void");
    }
}
