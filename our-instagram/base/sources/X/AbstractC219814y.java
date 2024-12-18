package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.14y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC219814y implements InterfaceC219914z {
    public static final Queue A0A = new LinkedList();
    public int A00;
    public C15Q A01;
    public AnonymousClass151 A02;
    public boolean A03;
    public AnonymousClass153[] A04;
    public final int A05;
    public final Handler A06;
    public final AnonymousClass154 A07;
    public final List A08;
    public volatile boolean A09;

    public AbstractC219814y(int i) {
        AnonymousClass154 anonymousClass154;
        AnonymousClass150 A00 = AnonymousClass150.A00();
        this.A08 = new ArrayList();
        this.A04 = new AnonymousClass153[0];
        this.A09 = false;
        this.A00 = 0;
        this.A03 = false;
        this.A05 = i > 0 ? i : 5000;
        synchronized (AnonymousClass154.class) {
            anonymousClass154 = AnonymousClass154.A01;
            if (anonymousClass154 == null) {
                Looper mainLooper = Looper.getMainLooper();
                AnonymousClass155 anonymousClass155 = AnonymousClass155.A05;
                if (anonymousClass155 == null) {
                    anonymousClass155 = new AnonymousClass155(null);
                    AnonymousClass155.A05 = anonymousClass155;
                }
                AnonymousClass150 A002 = AnonymousClass150.A00();
                AnonymousClass157 anonymousClass157 = AnonymousClass157.A01;
                if (anonymousClass157 == null) {
                    anonymousClass157 = new AnonymousClass157(A002);
                    AnonymousClass157.A01 = anonymousClass157;
                }
                anonymousClass154 = new AnonymousClass154(mainLooper, anonymousClass157, anonymousClass155);
                AnonymousClass154.A01 = anonymousClass154;
            }
        }
        this.A07 = anonymousClass154;
        this.A06 = anonymousClass154.A00;
        this.A02 = A00;
        if (i <= 0) {
            String A03 = A03();
            String valueOf = String.valueOf(i);
            C2050595u c2050595u = new C2050595u(null, 1, false);
            c2050595u.A02("event", "init_with_invalid_param");
            c2050595u.A02("booster", A03);
            c2050595u.A02("error", AnonymousClass001.A0g(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, ":", valueOf));
            c2050595u.A00(87);
            A00.CjC(c2050595u);
        }
    }

    public C2050695w A02(int i, int i2) {
        return null;
    }

    public abstract void A04();

    public abstract boolean A05();

    @Override // X.InterfaceC219914z
    public abstract int AhK();

    @Override // X.InterfaceC219914z
    public synchronized boolean EE7(boolean z) {
        boolean z2;
        if (this.A03) {
            A01(false, true, z);
            A04();
            this.A07.A00.removeMessages(0, this);
            this.A03 = false;
            A01(false, false, z);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    @Override // X.InterfaceC219914z
    public final synchronized int EJ2(Integer num, int i) {
        int i2;
        int i3;
        try {
            if (this.A03) {
                A01(true, true, false);
                i2 = 2;
            } else {
                i2 = 1;
                A01(true, true, true);
                this.A00++;
                try {
                    boolean A05 = A05();
                    this.A03 = A05;
                    if (A05) {
                        AnonymousClass154 anonymousClass154 = this.A07;
                        int i4 = this.A05;
                        if (num != null) {
                            i3 = num.intValue();
                        } else {
                            i3 = 0;
                        }
                        Handler handler = anonymousClass154.A00;
                        Message obtain = Message.obtain(handler, 0);
                        obtain.obj = this;
                        obtain.arg1 = i;
                        obtain.arg2 = i3;
                        handler.sendMessageDelayed(obtain, i4);
                    }
                    A01(true, false, this.A03);
                } catch (Throwable th) {
                    this.A06.post(A00(true, false, false, true));
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i2;
    }

    private C6WZ A00(boolean z, boolean z2, boolean z3, boolean z4) {
        C6WZ c6wz;
        Queue queue = A0A;
        synchronized (queue) {
            c6wz = null;
            if (!queue.isEmpty()) {
                c6wz = (C6WZ) queue.remove();
            }
        }
        if (c6wz == null) {
            c6wz = new C6WZ();
        }
        int i = this.A00;
        c6wz.A01 = this;
        c6wz.A05 = z;
        c6wz.A04 = z2;
        c6wz.A03 = z3;
        c6wz.A00 = i;
        c6wz.A02.set(z4);
        return c6wz;
    }

    private void A01(boolean z, boolean z2, boolean z3) {
        if (this.A09) {
            this.A06.post(A00(z, z2, z3, false));
        }
    }

    @Override // X.InterfaceC219914z
    public final void EDO(AnonymousClass153 anonymousClass153) {
        List list = this.A08;
        synchronized (list) {
            if (!list.contains(anonymousClass153)) {
                list.add(anonymousClass153);
                this.A04 = (AnonymousClass153[]) list.toArray(new AnonymousClass153[list.size()]);
                this.A09 = true;
            }
        }
    }

    public final String A03() {
        String A00 = C2050395s.A00(AhK());
        if ("".equals(A00)) {
            return getClass().getSimpleName();
        }
        return A00;
    }

    public AbstractC219814y() {
        this(5000);
    }
}
