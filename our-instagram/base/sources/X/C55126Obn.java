package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.lang.Thread;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.Obn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55126Obn {
    public boolean A00;
    public boolean A01;
    public final InterfaceC58176Pqg A02;
    public final InterfaceC58047PoY A03;
    public volatile PW4 A09;
    public final Queue A07 = new ConcurrentLinkedQueue();
    public final Map A06 = new WeakHashMap();
    public final Object A04 = new Object();
    public final Object A08 = new Object();
    public final String A05 = AnonymousClass001.A0R("FU_", "CreationRenderController");

    public static synchronized void A01(C55126Obn c55126Obn) {
        synchronized (c55126Obn) {
            synchronized (c55126Obn.A08) {
                if (c55126Obn.A09 == null || c55126Obn.A09.getState() == Thread.State.TERMINATED) {
                    c55126Obn.A09 = new PW4(c55126Obn);
                    c55126Obn.A09.start();
                }
                synchronized (c55126Obn.A09) {
                    c55126Obn.A09.A00 = true;
                    c55126Obn.A09.notify();
                }
            }
        }
    }

    public C55126Obn(Context context, UserSession userSession, InterfaceC58047PoY interfaceC58047PoY) {
        this.A02 = new C56393P2e(context, userSession);
        this.A03 = interfaceC58047PoY;
    }

    public static void A00(C55126Obn c55126Obn) {
        if (c55126Obn.A09 != null) {
            synchronized (c55126Obn.A08) {
                if (c55126Obn.A09 != null) {
                    c55126Obn.A09 = null;
                }
            }
        }
    }

    public static void A02(Exception exc, String str) {
        C0w9.A07(AnonymousClass001.A0u("RenderManager ", str, ": ", exc.getMessage()), exc);
    }
}
