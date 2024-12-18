package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29781bt implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1bu
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-2080718848);
            int A032 = C0f9.A03(1311070007);
            C29781bt c29781bt = new C29781bt(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(-503032861, A032);
            C0f9.A0A(-1995839409, A03);
            return c29781bt;
        }
    };
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        if (abstractC29011ae.C7R().size() > 1) {
            C0w9.A04("DirectSendRoomsLinkXMAShareMessageMutation_withMultipleDirectThreadKeys", "Found DirectSendRoomsLinkXMAShareMessageMutation with multiple DirectThreadKeys", 1);
            return false;
        }
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C29761br c29761br = (C29761br) c1ow;
        List C7R = c29761br.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c29761br.A06();
        String str = ((C1OW) c29761br).A05;
        JTa jTa = ((C1OW) c29761br).A02;
        boolean z2 = jTa.A09;
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, null);
        UserSession userSession = this.A00;
        String str2 = c29761br.A02;
        String str3 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        boolean z5 = c29761br.A06;
        String str4 = c29761br.A01;
        str4.getClass();
        String str5 = c29761br.A03;
        str5.getClass();
        String str6 = c29761br.A04;
        str6.getClass();
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/ig_rooms_xma/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str3, z2, z3, z4);
        c25621Ms.A9s("link", str2);
        c25621Ms.A0I("is_audio_only_call", z5);
        c25621Ms.A9s("room_name", str4);
        c25621Ms.A9s("link_hash", str5);
        c25621Ms.A9s("xma_type", str6);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new EE4(userSession, c31281Dp3);
        C1GJ.A03(A0N);
    }

    public C29781bt(UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
    }
}
