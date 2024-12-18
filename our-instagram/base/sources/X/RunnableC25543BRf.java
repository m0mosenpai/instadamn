package X;

/* renamed from: X.BRf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC25543BRf implements Runnable {
    public final /* synthetic */ C25541BRd A00;

    public RunnableC25543BRf(C25541BRd c25541BRd) {
        this.A00 = c25541BRd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25541BRd c25541BRd = this.A00;
        C120985dq c120985dq = c25541BRd.A01;
        if (c120985dq != null) {
            c25541BRd.A07.EWQ(c120985dq, false);
            BKQ bkq = c25541BRd.A0C;
            Integer num = C05F.A00;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) bkq.A00, "ig_sundial_gesture_system_events");
            if (A0f.isSampled()) {
                AbstractC25233BEq.A17(A0f, "action", "fanout_menu_exit");
                BKQ.A00(A0f, num);
            }
        }
    }
}
