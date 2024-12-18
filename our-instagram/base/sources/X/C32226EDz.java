package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.DirectRealtimePayload;

/* renamed from: X.EDz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32226EDz extends AnonymousClass935 {
    public final C1P1 A00;
    public final InterfaceC37261GbE A01;

    public C32226EDz(C1P1 c1p1, UserSession userSession, InterfaceC37261GbE interfaceC37261GbE) {
        super(userSession);
        this.A01 = interfaceC37261GbE;
        this.A00 = c1p1;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(173697489);
        InterfaceC37261GbE interfaceC37261GbE = this.A01;
        InterfaceC37261GbE.A00(interfaceC37261GbE);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFail(abstractC115105If);
        }
        interfaceC37261GbE.DUq(AbstractC35240FgZ.A00(abstractC115105If), null);
        C0f9.A0A(-1896066468, A03);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0048 -> B:9:0x0049). Please report as a decompilation issue!!! */
    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        String str;
        DirectRealtimePayload directRealtimePayload;
        int A03 = C0f9.A03(244621642);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A032 = C0f9.A03(1299273244);
        InterfaceC37261GbE interfaceC37261GbE = this.A01;
        C162337Ov.A0a(interfaceC37261GbE.BtO(), C05F.A00);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onSuccess(interfaceC40821up);
        }
        try {
        } catch (Exception unused) {
            C18950wb.A00("Item ID doesn't exist in session scoped API callback.", 20134884, true).report();
        }
        if (interfaceC40821up instanceof InterfaceC37134GXv) {
            str = ((InterfaceC37134GXv) interfaceC40821up).BK3();
        } else {
            if ((interfaceC40821up instanceof ECP) && (directRealtimePayload = ((ECP) interfaceC40821up).A00) != null) {
                str = directRealtimePayload.itemId;
            }
            str = null;
        }
        interfaceC37261GbE.DUq(null, str);
        C0f9.A0A(-1348546799, A032);
        C0f9.A0A(-439936160, A03);
    }
}
