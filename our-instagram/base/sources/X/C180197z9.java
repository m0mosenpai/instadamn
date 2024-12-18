package X;

import android.content.Context;
import android.os.Handler;
import java.util.List;

/* renamed from: X.7z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180197z9 extends AbstractC178657wd implements InterfaceC180207zA {
    public int A00;
    public int A01;
    public Handler A02;
    public final Context A03;
    public final C1814082s A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final boolean A07;

    public C180197z9(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A07 = true;
        this.A04 = new C1814082s();
        Context context = interfaceC178207vu.getContext();
        C14360o3.A07(context);
        this.A03 = context;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C57243PbR(this, 8));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C57243PbR(this, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r0 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.C180197z9 r3) {
        /*
            r2 = 0
            X.7vh r1 = X.InterfaceC179867yc.A00     // Catch: java.lang.RuntimeException -> L4a
            X.7vf r0 = r3.A0A(r1)     // Catch: java.lang.RuntimeException -> L4a
            X.C14360o3.A07(r0)     // Catch: java.lang.RuntimeException -> L4a
            X.7yc r0 = (X.InterfaceC179867yc) r0     // Catch: java.lang.RuntimeException -> L4a
            boolean r0 = r0.CLY()     // Catch: java.lang.RuntimeException -> L4a
            if (r0 == 0) goto L25
            X.7vf r0 = r3.A0A(r1)     // Catch: java.lang.RuntimeException -> L4a
            X.C14360o3.A07(r0)     // Catch: java.lang.RuntimeException -> L4a
            X.7yc r0 = (X.InterfaceC179867yc) r0     // Catch: java.lang.RuntimeException -> L4a
            android.view.View r0 = r0.Bfy()     // Catch: java.lang.RuntimeException -> L4a
            android.view.Display r0 = r0.getDisplay()     // Catch: java.lang.RuntimeException -> L4a
            if (r0 != 0) goto L37
        L25:
            android.content.Context r1 = r3.A03     // Catch: java.lang.RuntimeException -> L4a
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L4a
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch: java.lang.RuntimeException -> L4a
            if (r0 == 0) goto L4a
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.RuntimeException -> L4a
            if (r0 == 0) goto L4a
        L37:
            int r1 = r0.getRotation()     // Catch: java.lang.RuntimeException -> L4a
            r0 = 1
            if (r1 == r0) goto L3f
            goto L42
        L3f:
            r2 = 90
            return r2
        L42:
            r0 = 2
            if (r1 == r0) goto L4b
            r0 = 3
            if (r1 != r0) goto L4a
            r2 = 270(0x10e, float:3.78E-43)
        L4a:
            return r2
        L4b:
            r2 = 180(0xb4, float:2.52E-43)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180197z9.A00(X.7z9):int");
    }

    public static final void A01(C180197z9 c180197z9) {
        List list = c180197z9.A04.A00;
        C14360o3.A07(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((BBS) list.get(i)).DX1(c180197z9.A01, c180197z9.A00);
        }
    }

    public static final void A03(C180197z9 c180197z9, final InterfaceC16820sZ interfaceC16820sZ) {
        Handler handler = c180197z9.A02;
        if (handler == null) {
            C178307w4 c178307w4 = InterfaceC178297w3.A00;
            InterfaceC178207vu interfaceC178207vu = ((AbstractC178657wd) c180197z9).A00;
            if (interfaceC178207vu.CRZ(c178307w4)) {
                c180197z9.A02 = ((InterfaceC178297w3) interfaceC178207vu.Aq1(c178307w4)).BAu("Lite-Controller-Thread");
            }
            handler = c180197z9.A02;
            if (handler == null) {
                interfaceC16820sZ.invoke();
                return;
            }
        }
        handler.post(new Runnable() { // from class: X.ApI
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                InterfaceC16820sZ.this.invoke();
            }
        });
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        InterfaceC178067vf A0A = A0A(InterfaceC179867yc.A00);
        C14360o3.A07(A0A);
        ((InterfaceC179867yc) A0A).A9y((InterfaceC178677wf) this.A05.getValue());
    }

    @Override // X.InterfaceC178067vf
    public final C178087vh BKV() {
        C178087vh c178087vh = InterfaceC180207zA.A00;
        C14360o3.A08(c178087vh);
        return c178087vh;
    }
}
