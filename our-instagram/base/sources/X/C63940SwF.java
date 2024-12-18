package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.SwF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63940SwF implements InterfaceC65572Tn5 {
    public static C63940SwF A03;
    public Handler A00;
    public HandlerThread A01;
    public final Map A02;

    @Override // X.InterfaceC65572Tn5
    public final void EEu(C62604SIi c62604SIi) {
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((InterfaceC65572Tn5) A16.next()).EEu(null);
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void ES9(String str, String str2) {
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((InterfaceC65572Tn5) A16.next()).ES9(str, str2);
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void ESA(C62604SIi c62604SIi, String str, String str2) {
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((InterfaceC65572Tn5) A16.next()).ESA(c62604SIi, str, str2);
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void FBF() {
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((InterfaceC65572Tn5) A16.next()).FBF();
        }
    }

    @Override // X.InterfaceC65572Tn5
    public final void flush() {
        Looper looper;
        if (!AbstractC61545RpP.A00) {
            boolean z = AbstractC61545RpP.A01;
            Iterator A16 = AbstractC166997dE.A16(this.A02);
            while (A16.hasNext()) {
                InterfaceC65572Tn5 interfaceC65572Tn5 = (InterfaceC65572Tn5) A16.next();
                if (z) {
                    if (this.A01 == null) {
                        HandlerThread handlerThread = new HandlerThread("CookieManagerFlush", 10);
                        AbstractC09770fa.A00(handlerThread);
                        this.A01 = handlerThread;
                        handlerThread.start();
                        HandlerThread handlerThread2 = this.A01;
                        if (handlerThread2 != null) {
                            looper = handlerThread2.getLooper();
                        } else {
                            looper = null;
                        }
                        this.A00 = new Handler(looper);
                    }
                    Handler handler = this.A00;
                    if (handler != null) {
                        handler.post(new RunnableC64547TJj(interfaceC65572Tn5));
                    }
                }
                interfaceC65572Tn5.flush();
            }
        }
    }

    public C63940SwF() {
        WeakHashMap weakHashMap = new WeakHashMap();
        this.A02 = weakHashMap;
        Object obj = new Object();
        if (!weakHashMap.containsKey("SystemCookieManager")) {
            weakHashMap.put("SystemCookieManager", obj);
        }
    }
}
