package X;

import android.graphics.RectF;
import java.util.List;

/* renamed from: X.7xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179377xn implements InterfaceC179087xK {
    public static final Object A08 = new Object();
    public RectF A00;
    public C178907x2 A01;
    public C81F A02;
    public C197818os A04;
    public final C178747wm A05;
    public final C1814082s A06 = new C1814082s();
    public volatile boolean A07 = false;
    public Runnable A03 = null;

    public static InterfaceC179467xw A00(C179377xn c179377xn, InterfaceC179467xw interfaceC179467xw) {
        if (c179377xn.A00 != null) {
            if (c179377xn.A04 == null) {
                c179377xn.A04 = new C197818os();
            }
            AnonymousClass810 texture = interfaceC179467xw.getTexture();
            if (texture != null) {
                AnonymousClass812 anonymousClass812 = texture.A02;
                int i = anonymousClass812.A01;
                int i2 = anonymousClass812.A00;
                C197818os c197818os = c179377xn.A04;
                c197818os.A00 = interfaceC179467xw;
                RectF rectF = c179377xn.A00;
                float f = i;
                float f2 = i2;
                c197818os.A00(1.0f, 1.0f, 0.0f, Math.round(rectF.left * f), Math.round(rectF.top * f2), Math.round(rectF.width() * f), Math.round(c179377xn.A00.height() * f2));
                return c179377xn.A04;
            }
            return interfaceC179467xw;
        }
        return interfaceC179467xw;
    }

    public static void A01(C179377xn c179377xn) {
        synchronized (A08) {
            Runnable runnable = c179377xn.A03;
            if (runnable != null) {
                runnable.run();
                c179377xn.A03 = null;
            }
        }
    }

    public final void A04(Object obj) {
        C1814082s c1814082s = this.A06;
        List list = c1814082s.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC179437xt interfaceC179437xt = (InterfaceC179437xt) list.get(i);
            if (interfaceC179437xt.contains(obj) || interfaceC179437xt.equals(obj)) {
                c1814082s.A02(interfaceC179437xt);
                if (interfaceC179437xt instanceof InterfaceC179087xK) {
                    InterfaceC179087xK interfaceC179087xK = (InterfaceC179087xK) interfaceC179437xt;
                    this.A01.A04(interfaceC179087xK);
                    interfaceC179087xK.release();
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        C81F c81f = this.A02;
        if (c81f != null) {
            c81f.ACv(interfaceC180227zC);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C81F c81f = this.A02;
        if (c81f != null) {
            c81f.detach();
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        C1814082s c1814082s = this.A06;
        List list = c1814082s.A00;
        c1814082s.A00();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC179437xt interfaceC179437xt = (InterfaceC179437xt) list.get(i);
            if (interfaceC179437xt instanceof InterfaceC179087xK) {
                ((InterfaceC179087xK) interfaceC179437xt).release();
            }
        }
    }

    public C179377xn(C178747wm c178747wm) {
        this.A05 = c178747wm;
    }

    public final void A02(C178907x2 c178907x2, InterfaceC179437xt interfaceC179437xt) {
        Object BOS = interfaceC179437xt.BOS();
        C1814082s c1814082s = this.A06;
        List list = c1814082s.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC179437xt interfaceC179437xt2 = (InterfaceC179437xt) list.get(i);
            if (interfaceC179437xt2.contains(BOS) || interfaceC179437xt2.equals(BOS)) {
                return;
            }
        }
        this.A07 = false;
        c1814082s.A01(interfaceC179437xt);
        if (interfaceC179437xt instanceof InterfaceC179087xK) {
            c178907x2.A03((InterfaceC179087xK) interfaceC179437xt);
        }
    }

    public final void A03(InterfaceC179467xw interfaceC179467xw) {
        InterfaceC179467xw A00 = A00(this, interfaceC179467xw);
        InterfaceC180227zC A01 = this.A01.A01();
        boolean z = this.A07;
        if (this.A02 == null) {
            C81F c81f = new C81F(this.A05);
            this.A02 = c81f;
            c81f.ACv(A01);
        }
        C81F c81f2 = this.A02;
        List list = this.A06.A00;
        if (z) {
            c81f2.A02(A01, A00, list, false);
            A01(this);
        } else {
            c81f2.A02(A01, A00, list, true);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        this.A01 = c178907x2;
    }
}
