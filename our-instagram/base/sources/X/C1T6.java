package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1T6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T6 extends C0R8 {
    public final Context A00;
    public final String A01;
    public final AtomicBoolean A02;
    public final int A03;
    public final Handler A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "AppCoordinator";
    }

    public static void A01(C1T6 c1t6) {
        if (c1t6.A06) {
            Intent intent = new Intent("com.facebook.fixie.action.FOA_BACKGROUND_EVENT");
            intent.putExtra("FOA_EVENT_SENDER", c1t6.A01);
            intent.putExtra("ACTION_MEMORY_BOOST", false);
            c1t6.A00(intent);
        }
    }

    public static void A02(C1T6 c1t6) {
        int i;
        if (c1t6.A07) {
            C0AT.A00();
            long j = C0AT.A01[23];
            if (j <= 0) {
                i = 100;
            } else {
                i = (int) ((r3[24] / j) * 100.0d);
            }
            int i2 = c1t6.A03;
            if (i <= i2) {
                Intent intent = new Intent("com.facebook.fixie.action.FOA_FOREGROUND_EVENT");
                intent.putExtra("FOA_EVENT_SENDER", c1t6.A01);
                intent.putExtra("ACTION_MEMORY_BOOST", true);
                intent.putExtra("MEMORY_SWAP_FREE_RATIO", i);
                intent.putExtra("MEMORY_BOOST_SWAP_FREE_THRESHOLD", i2);
                c1t6.A00(intent);
            }
        }
    }

    public static boolean A03(C1T6 c1t6) {
        if (c1t6.A02.get() || (((Boolean) C92V.A04.get()).booleanValue() && C92V.A01().A03())) {
            return true;
        }
        return false;
    }

    public static boolean A04(C1T6 c1t6) {
        if (c1t6.A02.get() || !((Boolean) C92V.A04.get()).booleanValue() || C92V.A01().A03()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A05) {
            this.A02.set(C0L6.A07());
            C0L6.A03(new LSX(this), false);
            C0b3.A00();
            Context context = this.A00;
            AbstractC07590aY abstractC07590aY = new AbstractC07590aY(new C48222LVw(this));
            ((AbstractC04710Mn) abstractC07590aY).A00 = new AbstractC07720ao(C0QT.A00, C0QT.A01, C0QW.A00, "FamilyIntentScope");
            C0b3.A02(context, abstractC07590aY);
            if (A03(this)) {
                A02(this);
            } else if (A04(this)) {
                A01(this);
            }
            A08();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103109978555L)) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103110044092L)) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1T6(X.C0Rw r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            r3 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            r5.A02 = r0
            r0 = r6
            X.0RK r0 = (X.C0RK) r0
            android.content.Context r0 = r0.A01
            r5.A00 = r0
            java.lang.String r0 = r0.getPackageName()
            r5.A01 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r4 = r5.A05(r0)
            if (r4 == 0) goto L30
            r0 = 36314103109978555(0x81037c003509bb, double:3.028523259682259E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L31
        L30:
            r0 = 0
        L31:
            r5.A05 = r0
            if (r4 == 0) goto L45
            r0 = 36314103110044092(0x81037c003609bc, double:3.028523259723705E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L46
        L45:
            r0 = 0
        L46:
            r5.A07 = r0
            if (r4 == 0) goto L75
            r0 = 36595578086820030(0x82037c003708be, double:3.2065291684455655E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            long r1 = X.C20150ym.A01(r0)
            int r0 = (int) r1
        L58:
            r5.A03 = r0
            if (r4 == 0) goto L6c
            r0 = 36314103110240702(0x81037c003909be, double:3.028523259848042E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L6c
            r3 = 1
        L6c:
            r5.A06 = r3
            android.os.Handler r0 = r6.Aex()
            r5.A04 = r0
            return
        L75:
            r0 = 10
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1T6.<init>(X.0Rw):void");
    }

    private void A00(Intent intent) {
        if (Process.myPid() == Process.myTid()) {
            this.A04.post(new TNU(intent, this));
        } else {
            C0b3.A00().A06().A0C(this.A00, intent);
        }
    }
}
