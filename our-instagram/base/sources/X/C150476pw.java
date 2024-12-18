package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150476pw {
    public static synchronized C150486px A00(final Context context, final InterfaceC150356pk interfaceC150356pk, final AbstractC12990ll abstractC12990ll) {
        C150486px c150486px;
        synchronized (C150476pw.class) {
            final ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 575, 3, false, false);
            Map map = C150486px.A01;
            c150486px = (C150486px) abstractC12990ll.A01(C150486px.class, new InterfaceC16820sZ() { // from class: X.6q0
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    Context context2 = context;
                    AbstractC12990ll abstractC12990ll2 = abstractC12990ll;
                    Executor executor = executorC14040nU;
                    InterfaceC150356pk interfaceC150356pk2 = interfaceC150356pk;
                    Map map2 = C150486px.A01;
                    return new C150486px(context2.getApplicationContext(), interfaceC150356pk2, abstractC12990ll2, executor);
                }
            });
        }
        return c150486px;
    }
}
