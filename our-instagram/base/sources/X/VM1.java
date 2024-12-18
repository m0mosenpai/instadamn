package X;

import android.content.Context;
import android.view.ViewManager;
import android.view.WindowManager;
import android.view.animation.PathInterpolator;
import com.facebook.R;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public abstract class VM1 {
    public static final Object A00(final C6FQ c6fq, C6FW c6fw) {
        Integer num;
        int i;
        int hashCode;
        C1338462s c1338462s = (C1338462s) c6fw.A03(0);
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 1);
        C6FG A00 = C103064kh.A00(c6fq, c6fw, 2);
        if (A0F == null) {
            AbstractC25241Le.A02("bk.action.toast.ShowToastV2", "Cannot show toast with invalid options.");
            return null;
        }
        AnonymousClass634.A02(A00).A0C(c1338462s, null);
        int A03 = A0F.A03(35, 5000);
        int A032 = A0F.A03(42, 100);
        int A033 = A0F.A03(36, 100);
        PathInterpolator A002 = AbstractC68281VKt.A00(A0F.A08(43));
        PathInterpolator A003 = AbstractC68281VKt.A00(A0F.A08(38));
        final InterfaceC103384lE A0B = A0F.A0B(41);
        InterfaceC71887X8u interfaceC71887X8u = new InterfaceC71887X8u() { // from class: X.WTX
            @Override // X.InterfaceC71887X8u
            public final void Dlx() {
                InterfaceC103384lE interfaceC103384lE = A0B;
                C6FQ c6fq2 = c6fq;
                if (interfaceC103384lE != null) {
                    C131845xK.A00(c6fq2, C6FW.A01, interfaceC103384lE);
                }
            }
        };
        final InterfaceC103384lE A0B2 = A0F.A0B(40);
        InterfaceC71886X8t interfaceC71886X8t = new InterfaceC71886X8t() { // from class: X.WTV
            @Override // X.InterfaceC71886X8t
            public final void DAk() {
                InterfaceC103384lE interfaceC103384lE = A0B2;
                C6FQ c6fq2 = c6fq;
                if (interfaceC103384lE != null) {
                    C131845xK.A00(c6fq2, C6FW.A01, interfaceC103384lE);
                }
            }
        };
        boolean A0S = A0F.A0S(54, false);
        String A0D = c1338462s.A02.A0D();
        boolean equals = "mini".equals(A0F.A0L(44));
        String A0L = A0F.A0L(48);
        if (A0L != null && (hashCode = A0L.hashCode()) != -1383228885 && hashCode == 115029 && A0L.equals("top")) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (A03 != -1) {
            C69456Vnf c69456Vnf = new C69456Vnf(A002, A003, interfaceC71886X8t, interfaceC71887X8u, A00, c1338462s, num, A0D, A03, A032, A033, A0S, equals);
            C6FG c6fg = c69456Vnf.A07;
            Context context = c6fg.A00;
            boolean z = c69456Vnf.A0B;
            Integer num2 = c69456Vnf.A09;
            C66351UBk c66351UBk = new C66351UBk(context, num2, z);
            c66351UBk.setBloksContentViewFromParseResult(c6fg, c69456Vnf.A08);
            c66351UBk.A00 = c69456Vnf.A00;
            c66351UBk.A02 = c69456Vnf.A02;
            c66351UBk.A01 = c69456Vnf.A01;
            c66351UBk.A04 = c69456Vnf.A04;
            c66351UBk.A03 = c69456Vnf.A03;
            c66351UBk.A06 = new WTW(c69456Vnf);
            c66351UBk.A05 = new WTU(c66351UBk, c69456Vnf);
            c66351UBk.A0A = c69456Vnf.A0C;
            c66351UBk.setTag(R.id.foa_toast_tag_server_id, c69456Vnf.A0A);
            C66351UBk c66351UBk2 = (C66351UBk) AbstractC70006VzQ.A00.get();
            if (c66351UBk2 != null) {
                c66351UBk2.A03(c66351UBk2.A01);
            }
            int i2 = -1;
            if (z) {
                i2 = -2;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i2, -2, 99, 8, -3);
            if (z) {
                i = 17;
            } else {
                i = 80;
                if (num2.equals(C05F.A00)) {
                    i = 48;
                }
            }
            layoutParams.gravity = i;
            try {
                ViewManager viewManager = (ViewManager) context.getSystemService("window");
                if (viewManager != null) {
                    viewManager.addView(c66351UBk, layoutParams);
                    AbstractC70006VzQ.A00 = new WeakReference(c66351UBk);
                    c66351UBk.A02();
                    return null;
                }
                throw new IllegalStateException("Window manager required but not found.");
            } catch (WindowManager.BadTokenException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("Auto-dismiss duration must be >= 0ms");
    }
}
