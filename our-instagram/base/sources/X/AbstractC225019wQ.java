package X;

import android.os.Handler;

/* renamed from: X.9wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225019wQ {
    /* JADX WARN: Type inference failed for: r7v0, types: [X.7s1, java.lang.Object] */
    public static final C176117sU A00(Handler handler, InterfaceC176007sJ interfaceC176007sJ, C179537y3 c179537y3, InterfaceC178337w7 interfaceC178337w7, InterfaceC176037sM interfaceC176037sM) {
        C14360o3.A0B(interfaceC178337w7, 1);
        ?? obj = new Object();
        C176117sU c176117sU = new C176117sU(obj, interfaceC176037sM, new C176097sS(handler, interfaceC178337w7, interfaceC176037sM));
        Handler handler2 = c176117sU.A01;
        c176117sU.A04.A03 = new C176137sW(handler2, interfaceC178337w7, interfaceC176037sM);
        c176117sU.A03(new C176177sa(handler2, new AVC(handler2, c179537y3, interfaceC178337w7, interfaceC176037sM), interfaceC178337w7, obj, interfaceC176037sM));
        c176117sU.A03(new C176247sh(handler2, interfaceC176007sJ, interfaceC178337w7, obj, interfaceC176037sM));
        return c176117sU;
    }
}
