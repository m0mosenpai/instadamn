package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.33A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33A extends C1I2 implements InterfaceC60602pj {
    public boolean A00;
    public boolean A01;
    public int A02;
    public int A03;
    public final ViewOnTouchListenerC60632pm A04;
    public final InterfaceC65282xQ A05;
    public final Map A06;
    public final Fragment A07;
    public final C61372qz A08;
    public final boolean A09;

    public C33A(Fragment fragment, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, C61372qz c61372qz, InterfaceC65282xQ interfaceC65282xQ) {
        this(fragment, viewOnTouchListenerC60632pm, c61372qz, interfaceC65282xQ, false);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00() {
        if (this.A00) {
            Fragment fragment = this.A07;
            if (fragment.mView != null) {
                C3FQ scrollingViewProxy = ((InterfaceC60682pr) fragment).getScrollingViewProxy();
                scrollingViewProxy.EcF(new C42068Ikb(this, scrollingViewProxy));
            }
        }
    }

    public final void A01(C38321qM c38321qM) {
        EnumC75193Zm enumC75193Zm;
        C75113Zb BRZ = this.A05.BRZ(c38321qM);
        if (BRZ != null && ((enumC75193Zm = BRZ.A0m) == EnumC75193Zm.A0J || enumC75193Zm == EnumC75193Zm.A0K || enumC75193Zm == EnumC75193Zm.A0M || enumC75193Zm == EnumC75193Zm.A0N || enumC75193Zm == EnumC75193Zm.A0L)) {
            return;
        }
        this.A00 = true;
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        this.A08.A01(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        if (this.A00) {
            Map map = this.A06;
            if (!map.isEmpty()) {
                for (InterfaceC38381qS interfaceC38381qS : map.keySet()) {
                    Object obj = map.get(interfaceC38381qS);
                    obj.getClass();
                    ((JG5) obj).Dtg(interfaceC38381qS);
                }
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A08.A00.remove(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        if (this.A00) {
            ((InterfaceC60682pr) this.A07).getScrollingViewProxy().EcF(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r1 > r0) goto L22;
     */
    @Override // X.C1I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(X.C3FQ r6, int r7, int r8, int r9, int r10, int r11) {
        /*
            r5 = this;
            r0 = -1396279062(0xffffffffacc678ea, float:-5.6409226E-12)
            int r4 = X.C0f9.A03(r0)
            boolean r0 = r5.A00
            if (r0 == 0) goto L3c
            boolean r0 = r6.CXX()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L23
            boolean r0 = r5.A09
            if (r0 == 0) goto L23
            if (r11 > 0) goto L1a
            r3 = 0
        L1a:
            r5.A01 = r3
            r0 = -232165251(0xfffffffff229707d, float:-3.3560932E30)
        L1f:
            X.C0f9.A0A(r0, r4)
            return
        L23:
            android.view.View r0 = r6.AnU(r2)
            if (r0 != 0) goto L43
            r1 = 0
        L2a:
            int r0 = r5.A02
            if (r7 > r0) goto L40
            if (r7 < r0) goto L36
            int r0 = r5.A03
            if (r1 < r0) goto L40
            if (r1 <= r0) goto L38
        L36:
            r5.A01 = r2
        L38:
            r5.A02 = r7
            r5.A03 = r1
        L3c:
            r0 = -863294036(0xffffffffcc8b2dac, float:-7.296957E7)
            goto L1f
        L40:
            r5.A01 = r3
            goto L38
        L43:
            android.view.View r0 = r6.AnU(r2)
            int r1 = r0.getTop()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33A.onScroll(X.3FQ, int, int, int, int, int):void");
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(1635983874, C0f9.A03(1889708787));
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        A00();
    }

    public C33A(Fragment fragment, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, C61372qz c61372qz, InterfaceC65282xQ interfaceC65282xQ, boolean z) {
        this.A06 = new HashMap();
        this.A07 = fragment;
        this.A04 = viewOnTouchListenerC60632pm;
        this.A05 = interfaceC65282xQ;
        this.A08 = c61372qz;
        this.A09 = z;
    }
}
