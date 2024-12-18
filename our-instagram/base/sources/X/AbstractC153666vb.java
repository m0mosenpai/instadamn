package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153666vb {
    public boolean A00;
    public final Context A01;
    public final InterfaceC116925Qy A02;
    public final C5R5 A03;
    public final C153686vd A04;
    public final UserSession A05;
    public final C154796xU A06;
    public final boolean A07;
    public final InterfaceC11380iw A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC153666vb(Context context, AbstractC018607g abstractC018607g, C5R5 c5r5, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this(context, null, null, c5r5, interfaceC11380iw, userSession, new C61972ry(context, abstractC018607g, null), null, false);
        C14360o3.A0B(abstractC018607g, 5);
    }

    public final void A01() {
        A00(this, null, null, C16930sl.A00, true, true, false, false);
    }

    public final void A04(Long l, String str, List list, boolean z) {
        C14360o3.A0B(list, 0);
        A00(this, l, str, list, false, true, false, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.AbstractC153666vb r24, java.lang.Long r25, java.lang.String r26, java.util.List r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC153666vb.A00(X.6vb, java.lang.Long, java.lang.String, java.util.List, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r2 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.InterfaceC111084zP r4) {
        /*
            r3 = this;
            if (r4 == 0) goto Le
            java.lang.String r0 = r4.BPp()
            if (r0 != 0) goto L18
            boolean r0 = r4.BUt()
            if (r0 == 0) goto L18
        Le:
            X.6xU r0 = r3.A06
            X.6xV r1 = r0.A03
            r0 = 0
            r1.A07 = r0
            r1.A02 = r0
            return
        L18:
            X.6xU r1 = r3.A06
            java.lang.String r0 = r4.BPp()
            boolean r2 = r4.BUt()
            X.6xV r1 = r1.A03
            r1.A07 = r0
            if (r0 != 0) goto L2b
            r0 = 0
            if (r2 == 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            r1.A0A = r0
            java.lang.Integer r0 = X.C05F.A0C
            r1.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC153666vb.A02(X.4zP):void");
    }

    public void A03(InterfaceC116905Qw interfaceC116905Qw) {
        this.A04.A02.add(interfaceC116905Qw);
    }

    public AbstractC153666vb(Context context, InterfaceC116925Qy interfaceC116925Qy, C153696ve c153696ve, C5R5 c5r5, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, String str, boolean z) {
        this.A01 = context;
        this.A05 = userSession;
        this.A08 = interfaceC11380iw;
        this.A03 = c5r5;
        this.A07 = z;
        this.A02 = interfaceC116925Qy;
        C153686vd c153686vd = new C153686vd(c153696ve, userSession);
        this.A04 = c153686vd;
        this.A06 = new C154796xU(new Handler(Looper.getMainLooper()), userSession, c1gl, str, null, str != null);
        c153686vd.A02.add(new AbstractC116895Qv() { // from class: X.6vg
            @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
            public final void D5H(C37818GkY c37818GkY) {
                C14360o3.A0B(c37818GkY, 0);
                String str2 = c37818GkY.A05;
                if (str2 != null && str2.length() > 0) {
                    AbstractC153666vb.this.A03.EcO(str2);
                }
            }
        });
    }
}
