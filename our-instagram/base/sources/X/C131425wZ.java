package X;

import android.os.SystemClock;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.5wZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131425wZ {
    public InterfaceC184808Hv A01;
    public InterfaceC184788Ht A02;
    public C8I8 A03;
    public InterfaceC184828Hx A04;
    public C8I6 A05;
    public Float A06;
    public Integer A07;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC131415wY A0D;
    public boolean A0B = true;
    public int A00 = -1;
    public boolean A08 = true;
    public boolean A0C = true;
    public final Runnable A0E = new Runnable() { // from class: X.5wa
        @Override // java.lang.Runnable
        public final void run() {
            C131425wZ c131425wZ = C131425wZ.this;
            if (((ShutterButton) c131425wZ.A0D).A0C == EnumC131445wb.A04 && c131425wZ.A0C && c131425wZ.A0B) {
                C8I8 c8i8 = c131425wZ.A03;
                if (c8i8 != null) {
                    if (!c8i8.COr()) {
                        c131425wZ.A03.DmC();
                    } else {
                        return;
                    }
                }
                c131425wZ.A07 = C05F.A01;
                c131425wZ.A01("start_long_press_recording");
            }
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.view.MotionEvent r11, X.EnumC131445wb r12, X.C131425wZ r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131425wZ.A00(android.view.MotionEvent, X.5wb, X.5wZ):void");
    }

    public final void A01(String str) {
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o;
        InterfaceC184808Hv interfaceC184808Hv = this.A01;
        if (interfaceC184808Hv != null && !C8HI.A0I(((C184798Hu) interfaceC184808Hv).A00)) {
            InterfaceC184808Hv interfaceC184808Hv2 = this.A01;
            if (interfaceC184808Hv2 != null && (viewOnTouchListenerC1829389o = ((C184798Hu) interfaceC184808Hv2).A00.A0B.A0N) != null && !viewOnTouchListenerC1829389o.A0f) {
                viewOnTouchListenerC1829389o.A06();
            }
            this.A0D.setMode(EnumC131445wb.A04);
            return;
        }
        InterfaceC184788Ht interfaceC184788Ht = this.A02;
        if (interfaceC184788Ht != null) {
            AbstractC183338Bg.A00(((C184778Hs) interfaceC184788Ht).A00.A0f).A0G(str);
        }
        this.A0D.setMode(EnumC131445wb.A07);
        SystemClock.elapsedRealtime();
        C8I8 c8i8 = this.A03;
        if (c8i8 == null) {
            return;
        }
        c8i8.DoG(str);
    }

    public C131425wZ(InterfaceC131415wY interfaceC131415wY) {
        this.A0D = interfaceC131415wY;
    }
}
