package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;

/* renamed from: X.6lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147916lN implements InterfaceC145136gY {
    public C105824pt A00;
    public C138246Of A01;
    public boolean A02;
    public boolean A03;
    public long A04;
    public long A05;
    public final InterfaceC147636ko A07;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final Runnable A08 = new Runnable() { // from class: X.6lO
        @Override // java.lang.Runnable
        public final void run() {
            C138246Of c138246Of;
            C147916lN c147916lN = C147916lN.this;
            if (c147916lN.A02 && (c138246Of = c147916lN.A01) != null) {
                Object value = c138246Of.A0C.getValue();
                C14360o3.A07(value);
                C150956qv.A08(new View[]{(View) value}, true);
            }
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (X.C14360o3.A0K(r5.A01, r8) != false) goto L13;
     */
    @Override // X.InterfaceC145136gY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8t(X.C41181vS r6, X.C41551w4 r7, X.InterfaceC143576dw r8, X.C141596ac r9) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r8, r4)
            r3 = 1
            X.C14360o3.A0B(r6, r3)
            X.4pt r2 = r6.A0c
            boolean r0 = r5.A02
            if (r0 == 0) goto L44
            X.4pt r1 = r5.A00
            r0 = 0
            if (r1 == 0) goto L42
            java.lang.String r1 = r1.A0X
            r1.getClass()
        L18:
            if (r2 == 0) goto L1f
            java.lang.String r0 = r2.A0X
            r0.getClass()
        L1f:
            boolean r0 = X.AbstractC50102Ry.A00(r1, r0)
            if (r0 == 0) goto L44
            X.6Of r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r0, r8)
            if (r0 == 0) goto L44
        L2d:
            X.1vY r1 = r6.A0e
            X.1vY r0 = X.EnumC41231vY.A04
            if (r1 != r0) goto L41
            if (r2 == 0) goto L41
            boolean r0 = r5.A02
            if (r0 != 0) goto L41
            r5.A02 = r3
            X.6Of r8 = (X.C138246Of) r8
            r5.A01 = r8
            r5.A00 = r2
        L41:
            return
        L42:
            r1 = r0
            goto L18
        L44:
            boolean r0 = r5.A02
            if (r0 == 0) goto L2d
            r5.A02 = r4
            r5.A03 = r4
            r1 = 0
            r5.A01 = r1
            r5.A00 = r1
            android.os.Handler r0 = r5.A06
            r0.removeCallbacksAndMessages(r1)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147916lN.D8t(X.1vS, X.1w4, X.6dw, X.6ac):void");
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DNK(Reel reel) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DOJ(int i) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPQ() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DPR() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DWn() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DXv(String str) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void DhB() {
    }

    @Override // X.InterfaceC145136gY
    public final boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final boolean DsD() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dyy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void Dz0() {
    }

    @Override // X.InterfaceC145136gY
    public final void E00(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
        C14360o3.A0B(c41181vS, 0);
        C14360o3.A0B(interfaceC143586dx, 1);
        if (this.A02) {
            if (C14360o3.A0K(c41181vS.A0c, this.A00)) {
                if (interfaceC143586dx.equals(this.A01)) {
                    if (!this.A03) {
                        this.A03 = true;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean BWM() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final int Bs6() {
        C138246Of c138246Of;
        if (!this.A02 || (c138246Of = this.A01) == null) {
            return 0;
        }
        C14360o3.A07(c138246Of.A0E.getValue());
        return (int) (((View) r0).getWidth() * 0.5f);
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Buz() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Cc5() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void Djr(int i) {
        if (this.A02 && this.A03) {
            C138246Of c138246Of = this.A01;
            if (c138246Of != null) {
                Object value = c138246Of.A0C.getValue();
                C14360o3.A07(value);
                ((TextView) value).setText(C23831Eq.A02(i));
                Object value2 = c138246Of.A0C.getValue();
                C14360o3.A07(value2);
                AbstractC125325le.A04(null, new View[]{(View) value2}, false);
            }
            Handler handler = this.A06;
            Runnable runnable = this.A08;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 2000L);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Djs(int i, int i2) {
        C138246Of c138246Of;
        if (this.A02 && this.A03 && (c138246Of = this.A01) != null) {
            c138246Of.A02(i, i2);
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Dju(int i, int i2) {
        if (this.A02 && this.A03) {
            C138246Of c138246Of = this.A01;
            if (c138246Of != null) {
                c138246Of.A02(i, i2);
            }
            C138246Of c138246Of2 = this.A01;
            if (c138246Of2 != null) {
                ((View) c138246Of2.A0F.getValue()).performHapticFeedback(0);
                Object value = c138246Of2.A0E.getValue();
                C14360o3.A07(value);
                ProgressAnchorContainer.A00((ProgressAnchorContainer) value, false);
            }
        }
    }

    @Override // X.InterfaceC145136gY
    public final void Djv() {
        C138246Of c138246Of;
        if (this.A02 && this.A03 && (c138246Of = this.A01) != null) {
            Object value = c138246Of.A0E.getValue();
            C14360o3.A07(value);
            ProgressAnchorContainer.A00((ProgressAnchorContainer) value, true);
        }
    }

    @Override // X.InterfaceC145136gY
    public final /* synthetic */ boolean Dra() {
        return false;
    }

    @Override // X.InterfaceC145136gY
    public final void Dz7() {
        if (this.A02 && this.A03) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A04 >= 1000) {
                long AXr = this.A07.AXr();
                if (this.A05 != AXr) {
                    this.A05 = AXr;
                }
                this.A04 = elapsedRealtime;
                C138246Of c138246Of = this.A01;
                if (c138246Of != null) {
                    Object value = c138246Of.A0C.getValue();
                    C14360o3.A07(value);
                    ((TextView) value).setText(C23831Eq.A02(AXr));
                }
            }
            C138246Of c138246Of2 = this.A01;
            if (c138246Of2 != null) {
                Object value2 = c138246Of2.A07.getValue();
                C14360o3.A07(value2);
                View view = (View) value2;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    @Override // X.InterfaceC145136gY
    public final void onDestroyView() {
        if (this.A02) {
            this.A02 = false;
            this.A03 = false;
            this.A01 = null;
            this.A00 = null;
            this.A06.removeCallbacksAndMessages(null);
        }
    }

    public C147916lN(InterfaceC147636ko interfaceC147636ko) {
        this.A07 = interfaceC147636ko;
    }
}
