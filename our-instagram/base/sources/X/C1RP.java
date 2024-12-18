package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.1RP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RP extends C19Q {
    public long A00;
    public boolean A01;
    public final C1QY A02;
    public final boolean A03;
    public final /* synthetic */ C24091Ge A04;

    @Override // X.C19Q, X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        this.A01 = false;
    }

    @Override // X.C19Q, X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(byteBuffer, 2);
        long j = this.A00;
        if (j > 0) {
            long min = Math.min(j, byteBuffer.remaining());
            A01(-min);
            this.A00 -= min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r4.isEmpty() == false) goto L32;
     */
    @Override // X.C19Q, X.C19O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRequestCallbackDone(X.C1QW r14, X.C1QY r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1RP.onRequestCallbackDone(X.1QW, X.1QY):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7.length() == 0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    @Override // X.C19Q, X.C19O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponseStarted(X.C1QW r16, X.C1QY r17, X.C3JQ r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1RP.onResponseStarted(X.1QW, X.1QY, X.3JQ):void");
    }

    @Override // X.C19Q, X.C19O
    public final void onSucceeded(C1QW c1qw) {
        this.A01 = true;
    }

    public C1RP(C24091Ge c24091Ge, C1QW c1qw, C1QY c1qy, boolean z) {
        long j;
        this.A04 = c24091Ge;
        this.A02 = c1qy;
        this.A03 = z;
        EnumC23341Bw enumC23341Bw = c1qy.A09;
        if (enumC23341Bw == EnumC23341Bw.Image || enumC23341Bw == EnumC23341Bw.VideoCoverImage || enumC23341Bw == EnumC23341Bw.Video || enumC23341Bw == EnumC23341Bw.Other || enumC23341Bw == EnumC23341Bw.Analytics) {
            Number number = (Number) c24091Ge.A0L.get(c1qw);
            if (number == null && (number = (Number) c24091Ge.A0J.get(c1qw)) == null) {
                int ordinal = enumC23341Bw.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        j = 0;
                    } else {
                        j = 40960;
                    }
                } else {
                    j = 163840;
                }
                number = Long.valueOf(j);
                if (number == null) {
                    return;
                }
            }
            long j2 = this.A00;
            long longValue = number.longValue();
            this.A00 = j2 + longValue;
            A01(longValue);
        }
    }

    private final void A00() {
        C24091Ge c24091Ge = this.A04;
        if (!c24091Ge.A0Q) {
            synchronized (c24091Ge.A0H) {
                if (c24091Ge.A0E.A03.size() != 0 && C24091Ge.A02(c24091Ge, true)) {
                    c24091Ge.A03();
                }
            }
        }
    }

    private final void A01(long j) {
        C24141Gj c24141Gj;
        C24131Gi c24131Gi = this.A04.A07;
        if (this.A03) {
            c24141Gj = c24131Gi.A01;
        } else {
            c24141Gj = c24131Gi.A00;
        }
        c24141Gj.A00.addAndGet(j);
        if (j < 0) {
            A00();
        }
    }
}
