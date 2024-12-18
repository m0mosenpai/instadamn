package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.util.List;

/* renamed from: X.XPd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerC72131XPd extends Handler {
    public final /* synthetic */ C73314Y4c A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC70118W4q abstractC70118W4q;
        InterfaceC174857qL interfaceC174857qL;
        List<YQR> list;
        C174757qB c174757qB;
        InterfaceC174857qL interfaceC174857qL2;
        C14360o3.A0B(message, 0);
        int i = message.what;
        switch (i) {
            case 1:
                C73314Y4c c73314Y4c = this.A00;
                Object obj = message.obj;
                C14360o3.A0C(obj, "null cannot be cast to non-null type android.view.Surface");
                c73314Y4c.A02 = (Surface) obj;
                C73314Y4c.A02(c73314Y4c);
                XPQ xpq = new XPQ();
                C11T.A02(new RunnableC73521YHl(xpq, c73314Y4c.A04));
                c73314Y4c.A03 = xpq;
                return;
            case 2:
                C73314Y4c c73314Y4c2 = this.A00;
                C72175XRj c72175XRj = c73314Y4c2.A05;
                if (c72175XRj != null && (interfaceC174857qL2 = c73314Y4c2.A08.A04.A04) != null) {
                    interfaceC174857qL2.A9o(c72175XRj);
                    return;
                }
                return;
            case 3:
                Object obj2 = message.obj;
                if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                    C73314Y4c c73314Y4c3 = this.A00;
                    C73314Y4c.A01(c73314Y4c3);
                    for (YQR yqr : list) {
                        yqr.EYM(new C72740XmC(yqr, c73314Y4c3));
                        C73314Y4c.A00(yqr, c73314Y4c3);
                    }
                    c73314Y4c3.A06 = true;
                    C11T.A02(new RunnableC73505YGj(c73314Y4c3.A04));
                    InterfaceC174767qC interfaceC174767qC = c73314Y4c3.A07;
                    if ((interfaceC174767qC instanceof C174757qB) && (c174757qB = (C174757qB) interfaceC174767qC) != null) {
                        c174757qB.A0P(C81S.A00, "");
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C73314Y4c.A01(this.A00);
                return;
            case 5:
                C73314Y4c c73314Y4c4 = this.A00;
                C72175XRj c72175XRj2 = c73314Y4c4.A05;
                if (c72175XRj2 != null && (interfaceC174857qL = c73314Y4c4.A08.A04.A04) != null) {
                    interfaceC174857qL.EG2(c72175XRj2);
                }
                XPQ xpq2 = c73314Y4c4.A03;
                if (xpq2 != null) {
                    xpq2.release();
                    c73314Y4c4.A03 = null;
                }
                C11T.A02(new RunnableC73507YGl(c73314Y4c4.A04));
                return;
            case 6:
                C73314Y4c c73314Y4c5 = this.A00;
                int i2 = message.arg1;
                int i3 = message.arg2;
                c73314Y4c5.A01 = i2;
                c73314Y4c5.A00 = i3;
                C73314Y4c.A02(c73314Y4c5);
                return;
            case 7:
                Object obj3 = message.obj;
                if ((obj3 instanceof AbstractC70118W4q) && (abstractC70118W4q = (AbstractC70118W4q) obj3) != null) {
                    C72175XRj c72175XRj3 = this.A00.A05;
                    if (c72175XRj3 != null) {
                        c72175XRj3.A01 = abstractC70118W4q;
                        c72175XRj3.A00 = 0;
                        return;
                    } else {
                        abstractC70118W4q.A03(AbstractC166987dD.A14("View hasn't been setup yet"));
                        return;
                    }
                }
                return;
            default:
                throw AbstractC25230BEn.A0n("Invalid msg what: ", i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC72131XPd(Looper looper, C73314Y4c c73314Y4c) {
        super(looper);
        this.A00 = c73314Y4c;
    }
}
