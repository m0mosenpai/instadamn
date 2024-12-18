package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: X.4YR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YR implements Handler.Callback {
    public C92124As A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final C4YS A05;
    public final InterfaceC96914Xb A06;
    public final InterfaceC96344Us A07;
    public final TreeMap A08 = new TreeMap();

    public static void A00(C4YR c4yr, String str) {
        if (c4yr.A01) {
            c4yr.A02 = true;
            c4yr.A01 = false;
            C4XU c4xu = ((C96904Xa) c4yr.A06).A00;
            c4xu.A08.removeCallbacks(c4xu.A0U);
            C4XU.A04(c4xu, str);
        }
    }

    public final void A01() {
        C4XU c4xu = ((C96904Xa) this.A06).A00;
        if (!c4xu.A0G && c4xu.A0N.A0O) {
            c4xu.A0G = true;
            c4xu.A08.removeCallbacks(c4xu.A0U);
            C4XU.A04(c4xu, "refresh_after_init");
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C4XU c4xu;
        InterfaceC98114aq interfaceC98114aq;
        if (!this.A03) {
            int i = message.what;
            if (i != 1) {
                if (i != 1001) {
                    if (i != 1004) {
                        return false;
                    }
                    Object[] objArr = (Object[]) message.obj;
                    InterfaceC96914Xb interfaceC96914Xb = this.A06;
                    final byte[] bArr = (byte[]) objArr[0];
                    final String str = (String) objArr[1];
                    final long longValue = ((Number) objArr[2]).longValue();
                    c4xu = ((C96904Xa) interfaceC96914Xb).A00;
                    interfaceC98114aq = new InterfaceC98114aq() { // from class: X.WcI
                        @Override // X.InterfaceC98114aq
                        public final void accept(Object obj) {
                            byte[] bArr2 = bArr;
                            String str2 = str;
                            long j = longValue;
                            C4XU c4xu2 = C4XU.$redex_init_class;
                            ((C4TV) obj).A05.A0v.DLl(str2, bArr2, j);
                        }
                    };
                } else {
                    CQ5 cq5 = (CQ5) message.obj;
                    InterfaceC96914Xb interfaceC96914Xb2 = this.A06;
                    final android.net.Uri uri = cq5.A00;
                    final String str2 = cq5.A01;
                    c4xu = ((C96904Xa) interfaceC96914Xb2).A00;
                    interfaceC98114aq = new InterfaceC98114aq() { // from class: X.WcH
                        /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:
                        
                            if (r8 != null) goto L47;
                         */
                        @Override // X.InterfaceC98114aq
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void accept(java.lang.Object r25) {
                            /*
                                Method dump skipped, instructions count: 325
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.WcH.accept(java.lang.Object):void");
                        }
                    };
                }
                C4XX c4xx = c4xu.A0B;
                if (c4xx == null) {
                    c4xx = c4xu.A09(null);
                    c4xu.A0B = c4xx;
                }
                c4xx.A0D(new WcG(interfaceC98114aq));
                return true;
            }
            C72729Xm1 c72729Xm1 = (C72729Xm1) message.obj;
            long j = c72729Xm1.A00;
            long j2 = c72729Xm1.A01;
            TreeMap treeMap = this.A08;
            Long valueOf = Long.valueOf(j2);
            Number number = (Number) treeMap.get(valueOf);
            if (number == null || number.longValue() > j) {
                treeMap.put(valueOf, Long.valueOf(j));
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4YS, java.lang.Object] */
    public C4YR(InterfaceC96914Xb interfaceC96914Xb, C92124As c92124As, InterfaceC96344Us interfaceC96344Us) {
        this.A00 = c92124As;
        this.A06 = interfaceC96914Xb;
        this.A07 = interfaceC96344Us;
        Looper myLooper = Looper.myLooper();
        C4B8.A01(myLooper);
        this.A04 = new Handler(myLooper, this);
        this.A05 = new Object();
    }
}
