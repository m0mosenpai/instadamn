package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.litho.ComponentHost;

/* renamed from: X.2Vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50902Vm extends AbstractC50792Va {
    public SparseArray A00;
    public boolean A01;
    public final C2V6 A02;
    public final Integer A03;

    @Override // X.AbstractC50812Vc
    public final boolean A0V(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2, AbstractC50922Vo abstractC50922Vo, AbstractC50922Vo abstractC50922Vo2) {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        return this == abstractC50812Vc;
    }

    public C50902Vm(C2V6 c2v6, Integer num) {
        super("HostComponent");
        this.A01 = false;
        this.A03 = num;
        this.A02 = c2v6;
    }

    public static C50902Vm A03(C2XE c2xe) {
        C2V3 c2v3 = c2xe.A02.A01;
        Integer num = c2v3.A05;
        if (num != C05F.A01 && c2v3.A03.A01) {
            num = C05F.A00;
        }
        return new C50902Vm(c2v3.A03, num);
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A0C;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        Integer num = this.A03;
        C14360o3.A0B(context, 1);
        return new ComponentHost(context, null, num);
    }

    @Override // X.AbstractC50792Va
    public final void A0t(C2XE c2xe, C2WI c2wi, Object obj) {
        C2Y3 c2y3;
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.A0I && componentHost.A0F && (c2y3 = componentHost.A06) != null) {
            c2y3.A0c();
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        ((ComponentHost) obj).A0F = this.A01;
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        ComponentHost componentHost = (ComponentHost) obj;
        if (componentHost.isPressed()) {
            componentHost.setPressed(false);
        }
        componentHost.A0F = false;
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final boolean AFr() {
        return this.A02.A00;
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final C2V6 BeU() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0 != false) goto L6;
     */
    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2Wm D8D(int r3) {
        /*
            r2 = this;
            X.2V6 r1 = r2.A02
            boolean r0 = r1.A00
            if (r0 != 0) goto Lb
            boolean r0 = r1.A01
            r1 = 0
            if (r0 == 0) goto Lc
        Lb:
            r1 = 1
        Lc:
            X.WXg r0 = new X.WXg
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50902Vm.D8D(int):X.2Wm");
    }

    @Override // X.AbstractC50792Va, X.InterfaceC50822Vd
    public final int E4c() {
        return C2V3.hostComponentPoolSize;
    }
}
