package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.0Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05890Su {
    public static final Thread A03;
    public static final C05880St A01 = new C05880St();
    public static final ReferenceQueue A02 = new ReferenceQueue();
    public static final C05870Ss A00 = new C05870Ss();

    static {
        Thread thread = new Thread() { // from class: X.0Sq
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                while (true) {
                    try {
                        C05870Ss c05870Ss = AbstractC05890Su.A00;
                        AbstractC05860Sr abstractC05860Sr = (AbstractC05860Sr) AbstractC05890Su.A02.remove();
                        abstractC05860Sr.destruct();
                        if (abstractC05860Sr.previous == null) {
                            AbstractC05860Sr abstractC05860Sr2 = (AbstractC05860Sr) AbstractC05890Su.A01.A00.getAndSet(null);
                            while (abstractC05860Sr2 != null) {
                                AbstractC05860Sr abstractC05860Sr3 = abstractC05860Sr2.next;
                                AbstractC05860Sr abstractC05860Sr4 = AbstractC05890Su.A00.A00;
                                abstractC05860Sr2.next = abstractC05860Sr4.next;
                                abstractC05860Sr4.next = abstractC05860Sr2;
                                abstractC05860Sr2.next.previous = abstractC05860Sr2;
                                abstractC05860Sr2.previous = abstractC05860Sr4;
                                abstractC05860Sr2 = abstractC05860Sr3;
                            }
                        }
                        AbstractC05860Sr abstractC05860Sr5 = abstractC05860Sr.next;
                        abstractC05860Sr5.previous = abstractC05860Sr.previous;
                        abstractC05860Sr.previous.next = abstractC05860Sr5;
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        A03 = thread;
        thread.start();
    }
}
