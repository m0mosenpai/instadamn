package X;

import android.view.GestureDetector;
import android.view.View;

/* renamed from: X.LQj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48084LQj implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public ViewOnTouchListenerC48084LQj(C51703MsY c51703MsY, C51361MmM c51361MmM) {
        this.A00 = 23;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        this.A01 = new GestureDetector(c51361MmM.A04.getContext(), new JYK(4, c51703MsY, c51361MmM));
    }

    public static double A00(C55982hj c55982hj) {
        c55982hj.A09(LF4.A0D);
        return C1H4.A00(Math.abs(r4)) * Math.signum(c55982hj.A09.A00);
    }

    public static void A01(View view, int i, Object obj) {
        view.setOnTouchListener(new ViewOnTouchListenerC48084LQj(obj, i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0375, code lost:
    
        if (r3.A09.A0C() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x037d, code lost:
    
        if (r2 != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04a1, code lost:
    
        if (r1.A0C == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04b1, code lost:
    
        if (r1.A0C == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04bb, code lost:
    
        if (r1.A0C == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014a, code lost:
    
        if (r13.getX() >= java.lang.Math.min(r5, r6 + r7)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0170, code lost:
    
        if (r13.getX() > java.lang.Math.min(r12.getRight(), r5 + r7)) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC48084LQj.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC48084LQj(C45128JyU c45128JyU, C44764Jrl c44764Jrl, C45677KJo c45677KJo) {
        this.A00 = 21;
        this.A01 = new GestureDetector(AbstractC31172DnG.A05(c44764Jrl), new C44403Jjg(1, c45677KJo, c44764Jrl, c45128JyU));
    }

    public ViewOnTouchListenerC48084LQj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
