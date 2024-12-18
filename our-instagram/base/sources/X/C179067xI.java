package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;

/* renamed from: X.7xI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179067xI implements Handler.Callback {
    public final InterfaceC179037xF A00;
    public final ConditionVariable A01 = new ConditionVariable();
    public final Handler A02;
    public final C178987xA A03;

    public static void A00(C179067xI c179067xI, Long l) {
        try {
            AbstractC1808580n.A03("MediaGraphRendererSession.render");
            C178987xA c178987xA = c179067xI.A03;
            if (c178987xA.A01.getLooper() == Looper.myLooper()) {
                if (!c178987xA.A04.A06()) {
                    c178987xA.A03.A00(EnumC200658u8.A0l);
                    c178987xA.A05.DRo(c178987xA);
                } else {
                    InterfaceC178977x9 interfaceC178977x9 = c178987xA.A05;
                    interfaceC178977x9.DRq(c178987xA, l);
                    try {
                        try {
                            AbstractC1808580n.A03("MediaGraphHost.mMediaGraph.render()");
                            InterfaceC179077xJ interfaceC179077xJ = c178987xA.A00;
                            interfaceC179077xJ.getClass();
                            interfaceC179077xJ.EGd(c179067xI.A00, l);
                            AbstractC1808580n.A01();
                            AbstractC1808580n.A03("MediaGraphHost.mMediaGraph.render().listeners()");
                            interfaceC178977x9.DRn(c178987xA, l);
                        } catch (Exception e) {
                            interfaceC178977x9.DRm(c178987xA, e);
                        }
                        AbstractC1808580n.A01();
                    } catch (Throwable th) {
                        AbstractC1808580n.A01();
                        throw th;
                    }
                }
                return;
            }
            c178987xA.A03.A00(EnumC200658u8.A0m);
            throw new IllegalStateException("render() can be only called if you already are in the render thread");
        } finally {
            AbstractC1808580n.A01();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.813, java.lang.Object] */
    public final void A01(int i, int i2, int i3, boolean z, int i4, int i5) {
        C178987xA c178987xA = this.A03;
        SparseArray sparseArray = c178987xA.A02;
        ?? obj = new Object();
        obj.A01 = i2;
        obj.A00 = i3;
        obj.A03 = i4;
        obj.A02 = i5;
        obj.A04 = z;
        sparseArray.put(i, obj);
        InterfaceC179077xJ interfaceC179077xJ = c178987xA.A00;
        if (interfaceC179077xJ != null) {
            try {
                interfaceC179077xJ.FBm(i, i2, i3, z, i4, i5);
            } catch (Exception e) {
                c178987xA.A05.DRm(c178987xA, e);
            }
        }
    }

    public final void A02(Long l, boolean z) {
        Message obtain;
        C178987xA c178987xA = this.A03;
        c178987xA.A05.DRp(c178987xA, l);
        Handler handler = this.A02;
        if (l != null) {
            obtain = Message.obtain(handler, 1, l);
        } else {
            obtain = Message.obtain(handler, 1);
        }
        obtain.getClass();
        if (z) {
            handler.removeMessages(1);
        }
        handler.sendMessage(obtain);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            A00(this, (Long) message.obj);
        }
        return true;
    }

    public C179067xI(InterfaceC179037xF interfaceC179037xF, C178987xA c178987xA) {
        this.A03 = c178987xA;
        this.A00 = interfaceC179037xF;
        this.A02 = new Handler(((C179027xE) interfaceC179037xF).A05.A00.getLooper(), this);
    }
}
