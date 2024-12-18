package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.T6v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64271T6v implements YO0 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C61c A03;
    public final C1335961f A04;

    public C64271T6v(C61c c61c, C1335961f c1335961f, int i, long j, long j2) {
        this.A04 = c1335961f;
        this.A00 = i;
        this.A03 = c61c;
        this.A01 = j;
        this.A02 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration A00(X.C69C r5, com.google.android.gms.common.internal.BaseGmsClient r6, int r7) {
        /*
            com.google.android.gms.common.internal.zzk r0 = r6.A0Q
            if (r0 != 0) goto L1f
            r4 = 0
        L5:
            r3 = 0
            if (r4 == 0) goto L34
            boolean r0 = r4.A02
            if (r0 == 0) goto L34
            int[] r2 = r4.A04
            if (r2 != 0) goto L22
            int[] r2 = r4.A05
            if (r2 == 0) goto L2d
            r1 = 0
        L15:
            int r0 = r2.length
            if (r1 >= r0) goto L2d
            r0 = r2[r1]
            if (r0 == r7) goto L34
            int r1 = r1 + 1
            goto L15
        L1f:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r4 = r0.A02
            goto L5
        L22:
            r1 = 0
        L23:
            int r0 = r2.length
            if (r1 >= r0) goto L34
            r0 = r2[r1]
            if (r0 == r7) goto L2d
            int r1 = r1 + 1
            goto L23
        L2d:
            int r1 = r5.A00
            int r0 = r4.A00
            if (r1 >= r0) goto L34
            return r4
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64271T6v.A00(X.69C, com.google.android.gms.common.internal.BaseGmsClient, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        C1335961f c1335961f = this.A04;
        if (c1335961f.A08()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = C125745mM.A00().A00;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.A03) {
                C69C c69c = (C69C) c1335961f.A09.get(this.A03);
                if (c69c != null) {
                    Object obj = c69c.A04;
                    if (obj instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                        long j2 = this.A01;
                        boolean z = true;
                        long j3 = 0;
                        boolean A1O = AbstractC167007dF.A1O((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)));
                        int i7 = baseGmsClient.A0E;
                        if (rootTelemetryConfiguration != null) {
                            A1O &= rootTelemetryConfiguration.A04;
                            i2 = rootTelemetryConfiguration.A01;
                            i3 = rootTelemetryConfiguration.A02;
                            i = rootTelemetryConfiguration.A00;
                            if (baseGmsClient.A0Q != null && !baseGmsClient.CRe()) {
                                ConnectionTelemetryConfiguration A00 = A00(c69c, baseGmsClient, this.A00);
                                if (A00 != null) {
                                    if (!A00.A03 || j2 <= 0) {
                                        z = false;
                                    }
                                    i3 = A00.A00;
                                    A1O = z;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            i = 0;
                            i2 = 5000;
                            i3 = 100;
                        }
                        if (c5ks.A0F()) {
                            i4 = 0;
                            i5 = 0;
                        } else {
                            if (c5ks.A05) {
                                i4 = 100;
                            } else {
                                Exception A05 = c5ks.A05();
                                if (A05 instanceof Rk3) {
                                    Status status = ((Rk3) A05).A00;
                                    i4 = status.A00;
                                    ConnectionResult connectionResult = status.A02;
                                    if (connectionResult != null) {
                                        i5 = connectionResult.A01;
                                    }
                                } else {
                                    i4 = 101;
                                }
                            }
                            i5 = -1;
                        }
                        if (A1O) {
                            j3 = j2;
                            long j4 = this.A02;
                            j = System.currentTimeMillis();
                            i6 = (int) AbstractC58318PtA.A0B(j4);
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        AbstractC166997dE.A1H(c1335961f.A06, new C62585SHk(new MethodInvocation(null, null, this.A00, i4, i5, i7, i6, j3, j), i, i3, i2), 18);
                    }
                }
            }
        }
    }
}
