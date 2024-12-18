package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33171hf implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1hg
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-343110814);
            int A032 = C0f9.A03(-819923550);
            C33171hf c33171hf = new C33171hf(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(-544298421, A032);
            C0f9.A0A(1626088277, A03);
            return c33171hf;
        }
    };
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [X.L8x, java.lang.Object] */
    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C36451G6a c36451G6a;
        Integer num;
        C33151hd c33151hd = (C33151hd) c1ow;
        DirectThreadKey C7Q = c33151hd.C7Q();
        String A06 = c33151hd.A06();
        String str = c33151hd.A05;
        JTa jTa = ((C1OW) c33151hd).A02;
        boolean z = jTa.A09;
        String str2 = jTa.A04;
        Boolean bool = jTa.A01;
        if (Boolean.TRUE.equals(bool)) {
            UserSession userSession = this.A00;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(C7Q, 2);
            c36451G6a = new C36451G6a(userSession, C7Q, "send_poll_message");
        } else {
            c36451G6a = null;
        }
        C31281Dp3 c31281Dp3 = new C31281Dp3(interfaceC37261GbE, c36451G6a);
        String str3 = c33151hd.A01;
        str3.getClass();
        List list = c33151hd.A02;
        list.getClass();
        ?? obj = new Object();
        obj.A00 = str3;
        obj.A03 = list;
        if (C7Q.A00 != null) {
            UserSession userSession2 = this.A00;
            C14360o3.A0B(userSession2, 0);
            if (RealtimeClientManager.getInstance(userSession2).isMqttConnected()) {
                num = C05F.A01;
                String str4 = C7Q.A00;
                boolean z2 = ((C1OW) c33151hd).A02.A0A;
                C14360o3.A0B(str4, 1);
                AbstractC47886LDg.A00(userSession2, new LGH(null, obj, null, C2EY.A0k, Boolean.valueOf(z2), null, bool, null, null, null, null, null, null, null, null, AbstractC11060iN.A00(userSession2).BdA(), str4, "send_item", null, null, null, A06, null, str, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, false), c31281Dp3);
                C162337Ov.A0Y(c19260xA, num);
            }
        }
        num = C05F.A00;
        UserSession userSession3 = this.A00;
        JTa jTa2 = ((C1OW) c33151hd).A02;
        boolean z3 = jTa2.A0A;
        L1W l1w = jTa2.A00;
        EnumEntries enumEntries = C2EY.A0D;
        C1ON A062 = AbstractC47995LLh.A06(userSession3, l1w, obj, C7Q, bool, null, A06, "direct_v2/threads/broadcast/create_group_poll/", str, str2, z, z3);
        A062.A00 = new EE4(userSession3, c31281Dp3);
        C1GJ.A03(A062);
        C162337Ov.A0Y(c19260xA, num);
    }

    public C33171hf(UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
    }
}
