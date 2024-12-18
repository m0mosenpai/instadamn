package X;

import android.os.Process;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0QQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QQ extends C0DS {
    public int A00;
    public final int A01;
    public final C0DR A02;
    public final String A03;
    public volatile long A04;
    public volatile long A05;
    public volatile Thread A06;
    public volatile boolean A07;
    public final /* synthetic */ C0QO A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QQ(C0DR c0dr, C0QO c0qo, String str, int i, int i2) {
        super(i2);
        this.A08 = c0qo;
        this.A02 = c0dr;
        this.A01 = i;
        this.A03 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C0QO c0qo = this.A08;
        String str = c0qo.A03;
        String str2 = this.A03;
        C0K8.A0P(str, "Running %s%s", str2, "");
        this.A04 = SystemClock.uptimeMillis();
        this.A05 = Process.myTid();
        this.A06 = Thread.currentThread();
        ReentrantLock reentrantLock = c0qo.A0B;
        reentrantLock.lock();
        try {
            C012504o c012504o = c0qo.A00;
            c012504o.add(this);
            reentrantLock.unlock();
            ThreadLocal threadLocal = c0qo.A04;
            threadLocal.set(str2);
            try {
                C0BH c0bh = c0qo.A02;
                String A0R = AnonymousClass001.A0R("AppInit_", str2);
                C14360o3.A0B(A0R, 0);
                C0BJ.A00(A0R);
                C07120Zi c07120Zi = new C07120Zi(c0bh);
                try {
                    C0DR c0dr = this.A02;
                    int i = this.A01;
                    ((C211211o) c0dr).A00().A03();
                    c07120Zi.close();
                    threadLocal.set(null);
                    C0K8.A0P(str, "  Finished %s in %dms", str2, Long.valueOf(SystemClock.uptimeMillis() - this.A04));
                    reentrantLock.lock();
                    c012504o.remove(this);
                    reentrantLock.unlock();
                    this.A06 = null;
                    ArrayList arrayList = new ArrayList();
                    reentrantLock = c0qo.A0C;
                    reentrantLock.lock();
                    C005001p c005001p = c0qo.A01;
                    Integer valueOf = Integer.valueOf(i);
                    C0DU c0du = (C0DU) c005001p.get(valueOf);
                    C0DU c0du2 = c0du;
                    if (c0du == null) {
                        Object obj = new Object();
                        c005001p.put(valueOf, obj);
                        c0du2 = obj;
                    }
                    c0du2.A01 = true;
                    ArrayList arrayList2 = c0du2.A00;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Object obj2 = arrayList2.get(i2);
                            C14360o3.A07(obj2);
                            C0QQ c0qq = (C0QQ) obj2;
                            c0qq.A00--;
                            if (c0qq.A00 == 0) {
                                arrayList.add(c0qq);
                            }
                        }
                        c0du2.A00 = null;
                    }
                    reentrantLock.unlock();
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        c0qo.A06.execute((Runnable) arrayList.get(i3));
                    }
                    if (c0qo.A09.decrementAndGet() == 0) {
                        C0QO.A00(c0qo);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    C0DN.A00(null, str2, c0qo.A0A);
                    C0K8.A0L(str, "Exception in %s", th, str2);
                    throw th;
                } catch (Throwable th2) {
                    threadLocal.set(null);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
