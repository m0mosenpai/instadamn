package X;

import java.lang.ref.WeakReference;
import java.util.Queue;

/* renamed from: X.2wB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64522wB implements InterfaceC12870lZ {
    public WeakReference A00;
    public Queue A01;

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(125737015);
        Queue<C25531Mh> queue = this.A01;
        synchronized (queue) {
            try {
                for (C25531Mh c25531Mh : queue) {
                    c25531Mh.A0R("spinner_outcome", "app_background");
                    c25531Mh.Cht();
                }
                queue.clear();
            } catch (Throwable th) {
                C0f9.A0A(229346996, A03);
                throw th;
            }
        }
        if (this.A00.get() == null) {
            C218914p.A06(this);
        }
        C0f9.A0A(-1016606906, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-138168952);
        if (this.A00.get() == null) {
            C218914p.A06(this);
        }
        C0f9.A0A(782321150, A03);
    }
}
