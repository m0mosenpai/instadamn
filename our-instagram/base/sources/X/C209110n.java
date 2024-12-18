package X;

import android.os.Process;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.10n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C209110n extends MarkerEditor implements PointEditor {
    public int A00;
    public long A01;
    public C0XJ A02;
    public String A03;
    public final RunnableC16080r6 A05;
    public final C10390h6 A06;
    public final C006802i A08;
    public int A04 = 7;
    public final C05570Rh A07 = C05570Rh.A00;

    @Override // com.facebook.quicklog.MarkerEditor
    public final boolean isSampled() {
        return true;
    }

    private C0XJ A00() {
        C0XJ c0xj = this.A02;
        if (c0xj == null) {
            C0XJ c0xj2 = new C0XJ();
            this.A02 = c0xj2;
            return c0xj2;
        }
        return c0xj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r4.isEmpty() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A01(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L9
            boolean r0 = r4.isEmpty()
            r2 = 0
            if (r0 == 0) goto L16
        L9:
            r2 = 1
            X.0h6 r1 = r3.A06
            if (r1 == 0) goto L16
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            r1.A08(r0)
        L16:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209110n.A01(java.lang.String):boolean");
    }

    @Override // com.facebook.quicklog.MarkerEditor, com.facebook.quicklog.PointEditor
    public final void markerEditingCompleted() {
        if (this.A03 != null) {
            pointEditingCompleted();
        }
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor point(String str, String str2, long j) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        int i = this.A04;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Process.myTid();
        c006802i.A0l(runnableC16080r6, str, str2, timeUnit, i, 0, j);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointCustomTimestamp(long j) {
        if (this.A00 == 1 && j != -1) {
            throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
        }
        this.A01 = j;
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final MarkerEditor pointEditingCompleted() {
        String obj;
        if (this.A03 != null) {
            C0XJ c0xj = this.A02;
            if (c0xj != null) {
                c0xj.A03 = true;
            }
            C006802i c006802i = this.A08;
            RunnableC16080r6 runnableC16080r6 = this.A05;
            int i = this.A04;
            String str = this.A03;
            C0XJ c0xj2 = this.A02;
            long j = this.A01;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i2 = this.A00;
            Process.myTid();
            if (C006802i.A0K(c006802i, str)) {
                C0X2 c0x2 = null;
                if (c006802i.A0o != null) {
                    c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
                }
                boolean z = false;
                if (j == -1) {
                    z = true;
                }
                long A0L = c006802i.A0L(j, timeUnit);
                C0XD c0xd = c006802i.A0A;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                boolean z2 = false;
                if (!z) {
                    z2 = true;
                }
                c0xd.A08(c0x2, c0xj2, c006802i.A0M(), runnableC16080r6, str, timeUnit2, i, i2, A0L, z2);
                int i3 = runnableC16080r6.A03;
                if (C006802i.A0I(c006802i)) {
                    if (c0xj2 == null) {
                        obj = null;
                    } else {
                        obj = c0xj2.toString();
                    }
                    C006802i.A0A(c006802i, "markerPoint", str, obj, i3);
                }
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A05(c0x2);
                }
            }
            this.A03 = null;
            this.A02 = null;
            this.A01 = -1L;
            this.A00 = 0;
            return this;
        }
        throw new IllegalStateException("You should not use PointEditor after point was completed");
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final PointEditor pointEditor(String str) {
        this.A03 = str;
        this.A01 = -1L;
        this.A00 = 0;
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointShouldIncludeMetadata(boolean z) {
        int i;
        if (z) {
            if (this.A01 == -1) {
                i = 1;
            } else {
                throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
            }
        } else {
            i = 0;
        }
        this.A00 = i;
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor pointWithMetadata(String str, String str2, long j) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        int i = this.A04;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Process.myTid();
        c006802i.A0l(runnableC16080r6, str, str2, timeUnit, i, 1, j);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r5.A0S != false) goto L12;
     */
    @Override // com.facebook.quicklog.MarkerEditor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.quicklog.MarkerEditor setSurviveUserSwitch(boolean r7) {
        /*
            r6 = this;
            X.02i r3 = r6.A08
            X.0r6 r5 = r6.A05
            X.0XD r0 = r3.A0A     // Catch: java.lang.Throwable -> L3b
            X.0XB r2 = r0.A04     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            r2.CIx(r1)     // Catch: java.lang.Throwable -> L3b
            r2.E7e(r1, r5)     // Catch: java.lang.Throwable -> L3b
            r5.A0S = r7     // Catch: java.lang.Throwable -> L33
            r2.E7f(r1, r5)     // Catch: java.lang.Throwable -> L3b
            r2.CIy(r1)     // Catch: java.lang.Throwable -> L3b
            X.0Xq r4 = r3.A0n     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L30
            boolean r0 = r5.A0R     // Catch: java.lang.Throwable -> L31
            r3 = 0
            if (r0 != 0) goto L25
            boolean r0 = r5.A0S     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r0 == 0) goto L26
        L25:
            r2 = 1
        L26:
            int r1 = r5.A03     // Catch: java.lang.Throwable -> L31
            int r0 = r5.A02     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L2d
            r3 = 1
        L2d:
            r4.EEa(r1, r0, r3)     // Catch: java.lang.Throwable -> L31
        L30:
            return r6
        L31:
            r0 = move-exception
            goto L3a
        L33:
            r0 = move-exception
            r2.E7f(r1, r5)     // Catch: java.lang.Throwable -> L3b
            r2.CIy(r1)     // Catch: java.lang.Throwable -> L3b
        L3a:
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209110n.setSurviveUserSwitch(boolean):com.facebook.quicklog.MarkerEditor");
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor withLevel(int i) {
        this.A04 = i;
        return this;
    }

    public C209110n(RunnableC16080r6 runnableC16080r6, C10390h6 c10390h6, C006802i c006802i) {
        this.A08 = c006802i;
        this.A06 = c10390h6;
        this.A05 = runnableC16080r6;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double d) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(d), 6);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float f) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(f), 6);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int i) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(i), 2);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long j) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(j), 3);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String str2) {
        if (A01(str) && str2 != null) {
            A00().A00(str, str2, 1);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean z) {
        if (A01(str)) {
            A00().A00(str, String.valueOf(z), 8);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double[] dArr) {
        if (A01(str)) {
            A00().A00(str, C0Wu.A00(dArr), 7);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float[] fArr) {
        String obj;
        if (A01(str)) {
            C0XJ A00 = A00();
            int length = fArr.length;
            if (length == 0) {
                obj = "";
            } else {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                do {
                    sb.append(fArr[i]);
                    sb.append(",,,");
                    i++;
                } while (i < length);
                sb.setLength(sb.length() - 3);
                obj = sb.toString();
            }
            A00.A00(str, obj, 7);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int[] iArr) {
        if (A01(str)) {
            A00().A00(str, C0Wu.A01(iArr), 5);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long[] jArr) {
        if (A01(str)) {
            A00().A00(str, C0Wu.A02(jArr), 10);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String[] strArr) {
        if (strArr != null && A01(str)) {
            A00().A00(str, C0Wu.A03(strArr), 4);
        }
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean[] zArr) {
        if (A01(str)) {
            A00().A00(str, C0Wu.A04(zArr), 9);
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double d) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A02(str, d);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "double", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int i) {
        this.A08.A0j(this.A05, str, i);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long j) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A03(str, j);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "long", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String str2) {
        this.A08.A0k(this.A05, str, str2);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean z) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A0W.A06(str, z);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "boolean", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double[] dArr) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A04(str, dArr);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "double_array", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int[] iArr) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A05(str, iArr);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "int_array", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long[] jArr) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A06(str, jArr);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "long_array", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String[] strArr) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A07(str, strArr);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "string_array", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean[] zArr) {
        C006802i c006802i = this.A08;
        RunnableC16080r6 runnableC16080r6 = this.A05;
        if (C006802i.A0K(c006802i, str)) {
            C0X2 c0x2 = null;
            if (c006802i.A0o != null) {
                c0x2 = c006802i.A0o.A01(runnableC16080r6.A03);
            }
            C0XD c0xd = c006802i.A0A;
            C0XP A0M = c006802i.A0M();
            C0XB c0xb = c0xd.A04;
            c0xb.CIx(c0x2);
            c0xb.E7e(c0x2, runnableC16080r6);
            try {
                runnableC16080r6.A08(str, zArr);
                A0M.A01(c0x2, runnableC16080r6);
                if (c0x2 != null) {
                    c0x2.A0N = true;
                }
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                if (c006802i.A0o != null && c0x2 != null) {
                    c006802i.A0o.A07(c0x2, "boolean_array", true);
                    return this;
                }
            } catch (Throwable th) {
                c0xb.E7f(c0x2, runnableC16080r6);
                c0xb.CIy(c0x2);
                throw th;
            }
        }
        return this;
    }
}
