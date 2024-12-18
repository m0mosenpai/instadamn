package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7D5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7D5 extends AbstractC159317Cr {
    public final UserSession A00;
    public final C2EE A01;
    public final C23031Ai A02;

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19630xq interfaceC19630xq = this.A02.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("direct_scheduled_messages_tooltip_seen_count", interfaceC19630xq.getInt("direct_scheduled_messages_tooltip_seen_count", 0) + 1);
        ARD.E7G("direct_scheduled_messages_tooltip_timestamp", System.currentTimeMillis());
        ARD.apply();
        C7G0 c7g0 = new C7G0(this.A00, this.A01.C7I());
        C18920wW c18920wW = c7g0.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_schedule_message_nux_impression");
        if (A00.isSampled()) {
            A00.AAP("open_thread_id", c7g0.A02);
            A00.AAP("nux_type", "tooltip");
            A00.Cht();
        }
    }

    public C7D5(UserSession userSession, C2EE c2ee) {
        super(2131972875);
        this.A00 = userSession;
        this.A01 = c2ee;
        this.A02 = AbstractC23021Ah.A00(userSession);
    }
}
