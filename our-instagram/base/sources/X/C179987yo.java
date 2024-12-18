package X;

import android.graphics.Bitmap;
import android.os.Looper;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179987yo extends AbstractC178807ws implements InterfaceC179997yp {
    public int A00;
    public InterfaceC179927yi A01;
    public InterfaceC179867yc A02;
    public InterfaceC178737wl A03;
    public final InterfaceC178407wE A04;
    public final InterfaceC175477rN A05;
    public final InterfaceC178297w3 A06;
    public final Object A07;
    public volatile A6Z A08;
    public volatile boolean A09;

    public static void A01(C179987yo c179987yo) {
        synchronized (c179987yo.A07) {
            c179987yo.A08 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r0.CLt() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010d, code lost:
    
        if (((X.AbstractC179917yh) r20.A01).A00 != 1) goto L67;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.A6Z, java.lang.Object] */
    @Override // X.InterfaceC179997yp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Eps(X.C22936A9g r21, X.BCQ r22, X.C22813A4g r23) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C179987yo.Eps(X.A9g, X.BCQ, X.A4g):void");
    }

    public C179987yo(InterfaceC178207vu interfaceC178207vu) {
        InterfaceC178407wE interfaceC178407wE;
        super.A00 = interfaceC178207vu;
        this.A09 = true;
        this.A07 = new Object();
        this.A05 = new C23405AZe(this);
        C178307w4 c178307w4 = InterfaceC178297w3.A00;
        InterfaceC178207vu interfaceC178207vu2 = super.A00;
        interfaceC178207vu2.getClass();
        this.A06 = (InterfaceC178297w3) interfaceC178207vu2.Aq1(c178307w4);
        C178307w4 c178307w42 = InterfaceC178407wE.A00;
        InterfaceC178207vu interfaceC178207vu3 = super.A00;
        interfaceC178207vu3.getClass();
        if (interfaceC178207vu3.CRZ(c178307w42)) {
            InterfaceC178207vu interfaceC178207vu4 = super.A00;
            interfaceC178207vu4.getClass();
            interfaceC178407wE = (InterfaceC178407wE) interfaceC178207vu4.Aq1(c178307w42);
        } else {
            interfaceC178407wE = null;
        }
        this.A04 = interfaceC178407wE;
    }

    public static void A00(Bitmap bitmap, BCQ bcq, A6X a6x, C179987yo c179987yo, C22813A4g c22813A4g, File file) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("Method handlePreviewPhotoTaken must be invoked on a background thread");
        }
        if (file != null && c22813A4g != null) {
            IOException A02 = AbstractC23117AKb.A02(bitmap, file);
            A01(c179987yo);
            APL.A01(bitmap, bcq, a6x, null);
            APL.A05(c22813A4g, file, A02);
            return;
        }
        A01(c179987yo);
        APL.A01(bitmap, bcq, a6x, null);
    }
}
