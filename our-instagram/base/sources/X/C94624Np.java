package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4Np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94624Np {
    public static InterfaceC94654Ns A00;
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ C94624Np A02 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4Np] */
    static {
        Map map = C0YZ.A03;
        AbstractC13230m9.A01(InterfaceC94614No.class);
        A01 = AbstractC09440dt.A01(C94634Nq.A00);
        A00 = C94644Nr.A00;
    }

    public final C94724Nz A00(Context context) {
        InterfaceC94694Nw interfaceC94694Nw = (InterfaceC94694Nw) A01.getValue();
        if (interfaceC94694Nw == null) {
            if (C94704Nx.A03 == null) {
                ReentrantLock reentrantLock = C94704Nx.A02;
                reentrantLock.lock();
                try {
                    if (C94704Nx.A03 == null) {
                        C5O0 c5o0 = null;
                        try {
                            C116205Nz A012 = AbstractC94714Ny.A01();
                            if (A012 != null && A012.compareTo(C116205Nz.A05) >= 0) {
                                C5O0 c5o02 = new C5O0(context);
                                if (c5o02.A03()) {
                                    c5o0 = c5o02;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        C94704Nx.A03 = new C94704Nx(c5o0);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC94694Nw = C94704Nx.A03;
            C14360o3.A0A(interfaceC94694Nw);
        }
        return new C94724Nz(C52842bQ.A00, interfaceC94694Nw);
    }
}
