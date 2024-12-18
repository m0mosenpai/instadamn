package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayDeque;

/* renamed from: X.3xR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88653xR {
    public final Context A00;
    public final SparseArray A01 = new SparseArray(2);

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void A00(C88663xS c88663xS, final InterfaceC88683xU interfaceC88683xU, final C88653xR c88653xR) {
        synchronized (c88653xR) {
            final int i = c88663xS.A00;
            InterfaceC88683xU interfaceC88683xU2 = new InterfaceC88683xU(interfaceC88683xU, c88653xR, i) { // from class: X.3xX
                public final int A00;
                public final InterfaceC88683xU A01;
                public final /* synthetic */ C88653xR A02;

                {
                    this.A02 = c88653xR;
                    this.A00 = i;
                    this.A01 = interfaceC88683xU;
                }

                @Override // X.InterfaceC88683xU
                public final void E1W(boolean z) {
                    this.A01.E1W(z);
                }

                @Override // X.InterfaceC88683xU
                public final void onExit() {
                    Runnable runnable;
                    int i2 = this.A00;
                    C88653xR c88653xR2 = this.A02;
                    synchronized (c88653xR2) {
                        C88703xW c88703xW = (C88703xW) c88653xR2.A01.get(i2);
                        if (c88703xW != null) {
                            c88703xW.A00 = null;
                            c88703xW.A00 = null;
                            ArrayDeque arrayDeque = c88703xW.A01;
                            if (arrayDeque != null && (runnable = (Runnable) arrayDeque.poll()) != null) {
                                runnable.run();
                            }
                        }
                        this.A01.onExit();
                    }
                }
            };
            Context context = c88653xR.A00;
            C39251s2 A00 = C39251s2.A00(context);
            C40401u8 c40401u8 = c88663xS.A01;
            InterfaceC37781pG A04 = A00.A04(c40401u8.A09);
            try {
                SparseArray sparseArray = c88653xR.A01;
                if (sparseArray.get(i) != null && ((C88703xW) sparseArray.get(i)).A00 != null) {
                    throw new IllegalStateException(AnonymousClass001.A0R("Trying to create a new handler when one already exists for jobId: ", String.valueOf(i)));
                }
                Integer num = c40401u8.A03;
                int i2 = 19;
                if (num == C05F.A01) {
                    i2 = 18;
                }
                HandlerC88723xY handlerC88723xY = new HandlerC88723xY(context, A04.ALb(AnonymousClass001.A0O("UploadJobHandlerManager-", i), i2), c88663xS, interfaceC88683xU2, A04.E7g());
                C88703xW c88703xW = (C88703xW) sparseArray.get(i);
                C88703xW c88703xW2 = c88703xW;
                if (c88703xW == null) {
                    Object obj = new Object();
                    sparseArray.put(i, obj);
                    c88703xW2 = obj;
                }
                c88703xW2.A00 = handlerC88723xY;
                synchronized (handlerC88723xY) {
                    try {
                        if (!handlerC88723xY.A04) {
                            handlerC88723xY.A04 = true;
                            handlerC88723xY.sendMessage(handlerC88723xY.obtainMessage(1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
            }
        }
    }

    public C88653xR(Context context) {
        this.A00 = context;
    }
}
