package X;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;

@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* renamed from: X.5Bv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113835Bv implements InterfaceC113845Bw {
    public C114085Cu A00;
    public C5C3 A01;
    public Runnable A02;
    public List A03;
    public InterfaceC16660sJ A04;
    public InterfaceC16660sJ A05;
    public boolean A06;
    public Rect A07;
    public final View A08;
    public final C57S A09;
    public final C114105Cw A0A;
    public final InterfaceC113865By A0B;
    public final Executor A0C;
    public final InterfaceC09390do A0D;

    @Override // X.InterfaceC113845Bw
    public final void EnR(C114085Cu c114085Cu, C5C3 c5c3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A06 = true;
        this.A01 = c5c3;
        this.A00 = c114085Cu;
        this.A04 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        A00(EnumC114125Cy.StartInput);
    }

    @Override // X.InterfaceC113845Bw
    public final void Eoa() {
        this.A06 = false;
        this.A04 = C25087B8j.A00;
        this.A05 = C25088B8k.A00;
        this.A07 = null;
        A00(EnumC114125Cy.StopInput);
    }

    public C113835Bv(View view, InterfaceC1128557s interfaceC1128557s) {
        C113855Bx c113855Bx = new C113855Bx(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: X.5Bz
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: X.WKl
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
            }
        };
        this.A08 = view;
        this.A0B = c113855Bx;
        this.A0C = executor;
        this.A04 = C5C0.A00;
        this.A05 = C5C1.A00;
        this.A01 = new C5C3("", C5C2.A01);
        this.A00 = C114085Cu.A06;
        this.A03 = new ArrayList();
        this.A0D = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EV(this, 36));
        this.A0A = new C114105Cw(interfaceC1128557s, c113855Bx);
        this.A09 = new C57S(new EnumC114125Cy[16]);
    }

    private final void A00(EnumC114125Cy enumC114125Cy) {
        this.A09.A09(enumC114125Cy);
        if (this.A02 == null) {
            Runnable runnable = new Runnable() { // from class: X.D0r
                @Override // java.lang.Runnable
                public final void run() {
                    C113835Bv c113835Bv = C113835Bv.this;
                    c113835Bv.A02 = null;
                    Boolean bool = null;
                    Boolean bool2 = null;
                    C57S c57s = c113835Bv.A09;
                    int i = c57s.A00;
                    if (i > 0) {
                        Object[] objArr = c57s.A02;
                        int i2 = 0;
                        do {
                            EnumC114125Cy enumC114125Cy2 = (EnumC114125Cy) objArr[i2];
                            int ordinal = enumC114125Cy2.ordinal();
                            boolean z = true;
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if ((ordinal == 2 || ordinal == 3) && !AbstractC166997dE.A1Z(bool, false)) {
                                        if (enumC114125Cy2 != EnumC114125Cy.ShowKeyboard) {
                                            z = false;
                                        }
                                        bool2 = Boolean.valueOf(z);
                                    }
                                    i2++;
                                } else {
                                    bool2 = false;
                                }
                            } else {
                                bool2 = true;
                            }
                            bool = bool2;
                            i2++;
                        } while (i2 < i);
                    }
                    c57s.A01();
                    if (AbstractC166997dE.A1Z(bool, true)) {
                        C113835Bv.A01(c113835Bv);
                    }
                    if (bool2 != null) {
                        boolean booleanValue = bool2.booleanValue();
                        C03T c03t = ((C113855Bx) c113835Bv.A0B).A01.A00;
                        if (booleanValue) {
                            c03t.A02();
                        } else {
                            c03t.A01();
                        }
                    }
                    if (AbstractC166997dE.A1Z(bool, false)) {
                        C113835Bv.A01(c113835Bv);
                    }
                }
            };
            this.A0C.execute(runnable);
            this.A02 = runnable;
        }
    }

    public static final void A01(C113835Bv c113835Bv) {
        C113855Bx c113855Bx = (C113855Bx) c113835Bv.A0B;
        ((InputMethodManager) c113855Bx.A02.getValue()).restartInput(c113855Bx.A00);
    }

    @Override // X.InterfaceC113845Bw
    public final void CMy() {
        A00(EnumC114125Cy.HideKeyboard);
    }

    @Override // X.InterfaceC113845Bw
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public final void CtA(C114205Dh c114205Dh) {
        Rect rect;
        this.A07 = new Rect(C1H4.A01(c114205Dh.A01), C1H4.A01(c114205Dh.A03), C1H4.A01(c114205Dh.A02), C1H4.A01(c114205Dh.A00));
        if (this.A03.isEmpty() && (rect = this.A07) != null) {
            this.A08.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // X.InterfaceC113845Bw
    public final void Ele() {
        A00(EnumC114125Cy.ShowKeyboard);
    }

    @Override // X.InterfaceC113845Bw
    public final void EnQ() {
        A00(EnumC114125Cy.StartInput);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (X.C14360o3.A0K(r6.A02, r14.A02) == false) goto L9;
     */
    @Override // X.InterfaceC113845Bw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FCH(X.C5C3 r13, X.C5C3 r14) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113835Bv.FCH(X.5C3, X.5C3):void");
    }

    @Override // X.InterfaceC113845Bw
    public final void FCR(C114205Dh c114205Dh, C114205Dh c114205Dh2, C127055oj c127055oj, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3, InterfaceC16660sJ interfaceC16660sJ) {
        C114105Cw c114105Cw = this.A0A;
        synchronized (c114105Cw.A0C) {
            c114105Cw.A04 = c5c3;
            c114105Cw.A03 = interfaceC31114Dlw;
            c114105Cw.A02 = c127055oj;
            c114105Cw.A05 = interfaceC16660sJ;
            c114105Cw.A01 = c114205Dh;
            c114105Cw.A00 = c114205Dh2;
            if (c114105Cw.A06 || c114105Cw.A0B) {
                C114105Cw.A00(c114105Cw);
            }
        }
    }
}
