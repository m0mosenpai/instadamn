package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.7w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178267w0 extends AbstractC178277w1 implements InterfaceC178297w3 {
    public static volatile C178777wp A01;
    public final Handler A00;

    public static C23385AYj A00(Context context, C178017va c178017va) {
        C23385AYj c23385AYj = new C23385AYj(context, new C178027vb(c178017va));
        c23385AYj.A02((InterfaceC178287w2) new C178267w0(c23385AYj));
        return c23385AYj;
    }

    public static C178777wp A01() {
        C178777wp c178777wp;
        if (A01 != null) {
            return A01;
        }
        synchronized (C178777wp.class) {
            if (A01 == null) {
                A01 = new C178777wp();
            }
            c178777wp = A01;
        }
        return c178777wp;
    }

    @Override // X.InterfaceC178287w2
    public final C178307w4 BKX() {
        return InterfaceC178297w3.A00;
    }

    public C178267w0(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        this.A00 = new Handler(Looper.getMainLooper());
    }

    @Override // X.InterfaceC178297w3
    public final Handler BAu(String str) {
        Pair pair;
        HashMap hashMap = A01().A00;
        synchronized (hashMap) {
            pair = (Pair) hashMap.get(str);
        }
        if (pair != null) {
            return (Handler) pair.second;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("Handler not found: ", str));
    }

    @Override // X.InterfaceC178297w3
    public final void E7h(String str) {
        Pair pair;
        C178777wp A012 = A01();
        synchronized (A012) {
            HashMap hashMap = A012.A00;
            synchronized (hashMap) {
                pair = (Pair) hashMap.remove(str);
            }
            if (pair != null) {
                HandlerThread handlerThread = (HandlerThread) pair.first;
                handlerThread.quitSafely();
                try {
                    handlerThread.join(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7vu] */
    public C178267w0() {
        this(new Object());
    }
}
