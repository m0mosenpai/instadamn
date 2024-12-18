package X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1cA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29951cA implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1cB
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1084721595);
            int A032 = C0f9.A03(1257007449);
            C29951cA c29951cA = new C29951cA(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(-1147672358, A032);
            C0f9.A0A(-1413133414, A03);
            return c29951cA;
        }
    };
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        if (abstractC29011ae.C7R().size() > 1) {
            C0w9.A04("DirectSendLiveVideoShareMessageMutation_withMultipleDirectThreadKeys", "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys", 1);
            return false;
        }
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C29931c8 c29931c8 = (C29931c8) c1ow;
        List C7R = c29931c8.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c29931c8.A06();
        JTa jTa = ((C1OW) c29931c8).A02;
        UserSession userSession = this.A00;
        String str = c29931c8.A05;
        E71 e71 = c29931c8.A00;
        String str2 = c29931c8.A03;
        String str3 = c29931c8.A02;
        String str4 = e71.A02;
        boolean z2 = jTa.A09;
        String str5 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/post_live_reply/");
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str, str5, z2, z3, z4);
        String str6 = ((C105824pt) e71.A01).A0X;
        str6.getClass();
        c25621Ms.A9s(TraceFieldType.BroadcastId, str6);
        c25621Ms.A9s("video_offset", Integer.toString(e71.A00));
        c25621Ms.A9s("reel_id", str2);
        c25621Ms.A9s("entry", str3);
        c25621Ms.A0R = true;
        if (!TextUtils.isEmpty(str4)) {
            c25621Ms.A9s("text", str4);
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
        C162337Ov.A0Y(c19260xA, C05F.A00);
    }

    public C29951cA(UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
    }
}
