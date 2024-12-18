package X;

import android.os.Handler;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.Util;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

/* renamed from: X.5gV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122355gV implements InterfaceC98054ak {
    public final C98044aj A03;
    public final /* synthetic */ C4YR A04;
    public final C96084Tr A01 = new Object();
    public final C96304Uo A02 = new C96094Ts(1);
    public long A00 = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4Tr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.4Ts, X.4Uo] */
    public C122355gV(C4YR c4yr, InterfaceC96344Us interfaceC96344Us) {
        this.A04 = c4yr;
        this.A03 = new C98044aj(null, null, interfaceC96344Us);
    }

    public final boolean A00(long j) {
        C4YR c4yr = this.A04;
        C92124As c92124As = c4yr.A00;
        if (!c92124As.A0R) {
            return false;
        }
        if (c4yr.A02) {
            return true;
        }
        Map.Entry ceilingEntry = c4yr.A08.ceilingEntry(Long.valueOf(c92124As.A0C));
        if (ceilingEntry == null || ((Number) ceilingEntry.getValue()).longValue() >= j) {
            return false;
        }
        long longValue = ((Number) ceilingEntry.getKey()).longValue();
        C4XU c4xu = ((C96904Xa) c4yr.A06).A00;
        long j2 = c4xu.A03;
        if (j2 == -9223372036854775807L || j2 < longValue) {
            c4xu.A03 = longValue;
        }
        C4YR.A00(c4yr, "publish_time_expired");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3 >= r6.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(X.AbstractC98234b2 r6, boolean r7) {
        /*
            r5 = this;
            long r3 = r5.A00
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            long r1 = r6.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L13
        L12:
            r2 = 0
        L13:
            X.4YR r1 = r5.A04
            X.4As r0 = r1.A00
            boolean r0 = r0.A0R
            if (r0 == 0) goto L2a
            boolean r0 = r1.A02
            if (r0 != 0) goto L28
            if (r2 != 0) goto L23
            if (r7 == 0) goto L2a
        L23:
            java.lang.String r0 = "forward_seek_forced"
            X.C4YR.A00(r1, r0)
        L28:
            r0 = 1
            return r0
        L2a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122355gV.A01(X.4b2, boolean):boolean");
    }

    @Override // X.InterfaceC98054ak
    public final void AWa(C4B6 c4b6) {
        this.A03.AWa(c4b6);
    }

    @Override // X.InterfaceC98054ak
    public final void ELN(C97974ac c97974ac, int i) {
        this.A03.ELN(c97974ac, i);
    }

    @Override // X.InterfaceC98054ak
    public final void ELO(C97974ac c97974ac, int i, int i2) {
        this.A03.ELN(c97974ac, i);
    }

    @Override // X.InterfaceC98054ak
    public final int ELR(InterfaceC92364Br interfaceC92364Br, int i, int i2, boolean z) {
        return this.A03.ELR(interfaceC92364Br, i, 0, z);
    }

    @Override // X.InterfaceC98054ak
    public final void ELT(C98094ao c98094ao, int i, int i2, int i3, long j) {
        long A01;
        byte[] bArr;
        C98044aj c98044aj = this.A03;
        c98044aj.ELT(c98094ao, i, i2, i3, j);
        while (c98044aj.A0E(false)) {
            C96304Uo c96304Uo = this.A02;
            c96304Uo.clear();
            if (c98044aj.A04(this.A01, c96304Uo, 0, false) == -4) {
                c96304Uo.A00();
                long j2 = c96304Uo.A01;
                C4YR c4yr = this.A04;
                Metadata ANl = c4yr.A05.ANl(c96304Uo);
                if (ANl != null) {
                    EventMessage eventMessage = (EventMessage) ANl.A01[0];
                    String str = eventMessage.A03;
                    String str2 = eventMessage.A04;
                    if ("urn:mpeg:dash:event:2012".equals(str) && (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            long A0A = Util.A0A(new String(eventMessage.A05, AbstractC50482Ts.A05));
                            if (A0A != -9223372036854775807L) {
                                C72729Xm1 c72729Xm1 = new C72729Xm1(j2, A0A);
                                Handler handler = c4yr.A04;
                                handler.sendMessage(handler.obtainMessage(1, c72729Xm1));
                            }
                        } catch (C93194Fv unused) {
                        }
                    } else if ("livedash:trace:f0e6005d-acc5-4de5-b754-00301ef34c80".equals(str)) {
                        android.net.Uri uri = c98044aj.A09;
                        if (eventMessage.A02 == 1 && (bArr = eventMessage.A05) != null) {
                            String str3 = new String(bArr);
                            Handler handler2 = c4yr.A04;
                            handler2.sendMessage(handler2.obtainMessage(1001, new CQ5(str3, uri)));
                        }
                    } else if (!str.contains("urn:fb:metadata")) {
                        Handler handler3 = c4yr.A04;
                        handler3.sendMessage(handler3.obtainMessage(1004, new Object[]{eventMessage.A05, eventMessage.A03, Long.valueOf(eventMessage.A02)}));
                    }
                }
            }
        }
        C98064al c98064al = c98044aj.A0T;
        synchronized (c98044aj) {
            int i4 = c98044aj.A03;
            if (i4 != 0) {
                A01 = C98044aj.A01(c98044aj, i4);
            } else {
                A01 = -1;
            }
        }
        c98064al.A05(A01);
    }

    @Override // X.InterfaceC98054ak
    public final void FDI(android.net.Uri uri) {
        this.A03.A09 = uri;
    }
}
