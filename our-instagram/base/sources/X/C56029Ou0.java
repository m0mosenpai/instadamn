package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Ou0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56029Ou0 implements InterfaceC41501vz {
    public final /* synthetic */ NTX A00;

    public C56029Ou0(NTX ntx) {
        this.A00 = ntx;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = C0f9.A03(-1620630703);
        int A032 = C0f9.A03(-852195678);
        C0x9 c0x9 = new C0x9();
        NTX ntx = this.A00;
        if (C18U.A06(C06090Tz.A05, ntx.A0B, 36310323535347728L)) {
            str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        } else {
            str = "story";
        }
        c0x9.A04(str);
        ntx.A0C.A00(new PA4(str, null, ntx.A08, true));
        C0f9.A0A(-2015332841, A032);
        C0f9.A0A(1627322765, A03);
    }
}
