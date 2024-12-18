package X;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.9Kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208619Kv implements InterfaceC25216BDo {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final C9LA A03;
    public final AtomicBoolean A04;
    public final Context A05;
    public final ViewGroup A06;
    public final C9L9 A07;

    public C208619Kv(Context context, ViewGroup viewGroup, UserSession userSession) {
        C14360o3.A0B(context, 1);
        AbstractC167017dG.A1R(userSession, viewGroup);
        this.A05 = context;
        this.A02 = userSession;
        this.A06 = viewGroup;
        this.A07 = new C9L9(new C85N(context, userSession));
        this.A03 = new C9LA(context, viewGroup);
        this.A04 = AbstractC166997dE.A17();
        this.A00 = true;
    }

    @Override // X.InterfaceC25216BDo
    public final void Dyt(C115475Kh c115475Kh) {
        if (this.A01) {
            int i = c115475Kh.A08;
            if (i > 2000) {
                c115475Kh.A08 = i - CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            }
            this.A01 = false;
        }
    }

    @Override // X.InterfaceC25216BDo
    public final void Eht(Handler handler, C1810981l c1810981l, C184628Hd c184628Hd, ShutterButton shutterButton, int i, int i2) {
        AbstractC167027dH.A12(c1810981l, handler, shutterButton);
        C14360o3.A0B(c184628Hd, 5);
        this.A07.A01 = new AZS(handler, c1810981l, c184628Hd, this, shutterButton, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c4, code lost:
    
        if (r4 >= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        r0 = r5 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
    
        if (r0 > r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
    
        X.C0eD.A0c(r0, r9);
        r3 = java.util.Arrays.copyOfRange(r10, r5, r0);
        X.C14360o3.A07(r3);
        r19 = new X.C17u(0, r3.length - 1).iterator();
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e6, code lost:
    
        if (r19.hasNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e8, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ea, code lost:
    
        r2 = (java.lang.Number) r2;
        r1 = r5 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f0, code lost:
    
        r18 = X.AbstractC009903n.A06(X.A3K.A00, r2.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fa, code lost:
    
        r6[r1] = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0103, code lost:
    
        r2 = r19.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
    
        if (r19.hasNext() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010d, code lost:
    
        r1 = r3[X.AbstractC166987dD.A0H(r2)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        r17 = r19.next();
        r0 = r3[X.AbstractC166987dD.A0H(r17)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0121, code lost:
    
        if (java.lang.Float.compare(r1, r0) >= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        r2 = r17;
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
    
        if (r19.hasNext() != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        if (r5 == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fe, code lost:
    
        r5 = r5 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0100, code lost:
    
        if (r5 < 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019b, code lost:
    
        if (r2 >= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        r0 = r5 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019f, code lost:
    
        if (r0 > r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
    
        X.C0eD.A0c(r0, r4);
        r0 = java.util.Arrays.copyOfRange(r10, r5, r0);
        X.C14360o3.A07(r0);
        r3[r5 / 4] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01af, code lost:
    
        if (r5 == r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b1, code lost:
    
        r5 = r5 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b3, code lost:
    
        if (r5 < 0) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC25216BDo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FB2(android.graphics.Bitmap r24) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208619Kv.FB2(android.graphics.Bitmap):void");
    }

    @Override // X.InterfaceC25216BDo
    public final boolean CbZ() {
        return AbstractC167007dF.A1W(this.A07.A02);
    }

    @Override // X.InterfaceC25216BDo
    public final void Dzj() {
        AtomicBoolean atomicBoolean = this.A04;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
        }
    }

    @Override // X.InterfaceC25216BDo
    public final void ESY(float f) {
        this.A03.A00 = f;
    }

    @Override // X.InterfaceC25216BDo
    public final void setEnabled(boolean z) {
        this.A00 = z;
    }
}
