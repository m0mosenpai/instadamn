package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179527y2 {
    public ViewOnTouchListenerC180057yv A00;
    public InterfaceC180067yw A01;
    public C179107xM A02;
    public AnonymousClass818 A03;
    public InterfaceC179867yc A04;
    public InterfaceC179577y7 A05;
    public C174867qM A06;
    public final C179537y3 A07;
    public final InterfaceC178677wf A08;
    public final int A09;
    public final C178987xA A0A;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.7qM, java.lang.Object] */
    public final void A00() {
        InterfaceC180067yw interfaceC180067yw = this.A01;
        InterfaceC179867yc interfaceC179867yc = this.A04;
        if (interfaceC179867yc != null && interfaceC179867yc.CLY() && interfaceC180067yw != null) {
            View Bfy = interfaceC179867yc.Bfy();
            C14360o3.A07(Bfy);
            C9X1 c9x1 = (C9X1) interfaceC180067yw;
            c9x1.A03 = Bfy;
            Bfy.setOnTouchListener(c9x1.A09);
            ViewOnTouchListenerC180057yv viewOnTouchListenerC180057yv = this.A00;
            if (viewOnTouchListenerC180057yv != null) {
                View Bfy2 = interfaceC179867yc.Bfy();
                C174867qM c174867qM = viewOnTouchListenerC180057yv.A00;
                if (c174867qM == null) {
                    WeakReference weakReference = new WeakReference(Bfy2);
                    ?? obj = new Object();
                    obj.A00 = weakReference;
                    viewOnTouchListenerC180057yv.A00 = obj;
                } else {
                    c174867qM.A01(new WeakReference(Bfy2));
                }
                C174867qM c174867qM2 = viewOnTouchListenerC180057yv.A00;
                C14360o3.A07(c174867qM2);
                C179107xM c179107xM = this.A02;
                if (c179107xM != null) {
                    C179107xM.A05(c179107xM, new C203818zp(c174867qM2), null);
                    this.A06 = c174867qM2;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A01(C179507y0 c179507y0, C179517y1 c179517y1, C179107xM c179107xM) {
        this.A02 = c179107xM;
        if (c179507y0 != null) {
            c179107xM.A03 = c179507y0;
        }
        if (c179517y1 != null) {
            c179107xM.A04 = c179517y1;
        }
        C178987xA c178987xA = this.A0A;
        if (c178987xA != null) {
            Handler handler = c178987xA.A01;
            if (handler.getLooper() != Looper.myLooper()) {
                handler.sendMessage(Message.obtain(c178987xA.A04.A00, 4, c179107xM));
            } else {
                C178987xA.A00(c179107xM, c178987xA);
            }
            c179107xM.A08 = true;
            c179107xM.A01 = this.A09;
        }
    }

    public C179527y2(C178987xA c178987xA, int i) {
        this.A0A = c178987xA;
        this.A09 = i;
        this.A07 = new C179537y3(this);
        this.A08 = new InterfaceC178677wf() { // from class: X.7y4
            @Override // X.InterfaceC178677wf
            public final void Dah(C176507t8 c176507t8) {
            }

            @Override // X.InterfaceC178677wf
            public final void Dai(C176507t8 c176507t8) {
            }

            @Override // X.InterfaceC178677wf
            public final void Daj(C176507t8 c176507t8, int i2, int i3) {
            }

            @Override // X.InterfaceC178677wf
            public final void Dan(View view) {
                C179527y2.this.A00();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.7y7] */
    public final void A02(List list) {
        AnonymousClass818 anonymousClass818;
        AnonymousClass818 anonymousClass8182;
        Iterator it = list.iterator();
        while (true) {
            anonymousClass818 = null;
            if (it.hasNext()) {
                C81A c81a = (C81A) it.next();
                if (c81a instanceof AnonymousClass818) {
                    AnonymousClass818 anonymousClass8183 = (AnonymousClass818) c81a;
                    if (c81a instanceof InterfaceC179577y7) {
                        anonymousClass818 = (InterfaceC179577y7) c81a;
                    }
                    anonymousClass8182 = anonymousClass818;
                    anonymousClass818 = anonymousClass8183;
                }
            } else {
                anonymousClass8182 = null;
                break;
            }
        }
        this.A03 = anonymousClass818;
        this.A05 = anonymousClass8182;
        C179107xM c179107xM = this.A02;
        if (c179107xM != null) {
            if (c179107xM.A02 == null) {
                c179107xM.A07 = list;
                return;
            } else {
                c179107xM.A07 = null;
                C179107xM.A05(c179107xM, new C81C(list), null);
                return;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C179527y2() {
        this(null, 0);
    }
}
