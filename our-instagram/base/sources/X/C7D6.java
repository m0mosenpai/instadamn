package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7D6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7D6 extends AbstractC159317Cr {
    public final UserSession A00;
    public final UserSession A01;
    public final C159347Cu A02;

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19630xq interfaceC19630xq = AbstractC2056298m.A00(this.A00).A00;
        int i = interfaceC19630xq.getInt(AnonymousClass001.A0R("message_composer_tool_tip_impressions_count_", "TRY_STORE_STICKERS"), 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D(AnonymousClass001.A0R("message_composer_tool_tip_impressions_count_", "TRY_STORE_STICKERS"), i + 1);
        ARD.E7G(AnonymousClass001.A0R("message_composer_tool_tip_last_seen_timestamp_", "TRY_STORE_STICKERS"), System.currentTimeMillis());
        ARD.apply();
    }

    public C7D6(UserSession userSession, C159347Cu c159347Cu) {
        super(2131971101);
        this.A00 = userSession;
        this.A01 = userSession;
        this.A02 = c159347Cu;
    }
}
