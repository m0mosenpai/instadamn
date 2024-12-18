package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1eU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31251eU implements InterfaceC29301b7 {
    public static final C0KV A02 = new C0KV() { // from class: X.1eV
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-153355446);
            int A032 = C0f9.A03(1777400753);
            C31251eU c31251eU = new C31251eU(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(-1212259288, A032);
            C0f9.A0A(-1815417709, A03);
            return c31251eU;
        }
    };
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        boolean z;
        String str2;
        L1W l1w;
        boolean z2;
        C25621Ms A022;
        C31231eS c31231eS = (C31231eS) c1ow;
        List unmodifiableList = Collections.unmodifiableList(((AbstractC29011ae) c31231eS).A04);
        boolean z3 = true;
        if (unmodifiableList.size() != 1) {
            z3 = false;
        }
        C18C.A0E(z3);
        L93 l93 = c31231eS.A00;
        L3Y l3y = l93.A00;
        if (c31231eS.A01 == null) {
            C0w9.A03("DirectSendStatusReplyMessageMutationProcessor", "error in getting the recipient id");
            interfaceC37261GbE.DUq(C114675Fx.A0c, null);
        }
        JTa jTa = ((C1OW) c31231eS).A02;
        DirectAnimatedMedia A00 = l93.A00();
        UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = (DirectThreadKey) unmodifiableList.get(0);
        String str3 = c31231eS.A01;
        String A06 = c31231eS.A06();
        if (A00 != null) {
            String str4 = l93.A00().A05;
            boolean z4 = l93.A00().A06;
            Integer A01 = l93.A01();
            str = c31231eS.A05;
            z = jTa.A09;
            str2 = jTa.A04;
            l1w = jTa.A00;
            z2 = jTa.A07;
            A022 = AbstractC47995LLh.A02(userSession, l3y, directThreadKey, A01, str3);
            A022.A9s("animated_media_id", str4);
            A022.A0I("is_animated_media_sticker", z4);
        } else {
            String str5 = l93.A05;
            Integer A012 = l93.A01();
            str = c31231eS.A05;
            z = jTa.A09;
            str2 = jTa.A04;
            l1w = jTa.A00;
            z2 = jTa.A07;
            A022 = AbstractC47995LLh.A02(userSession, l3y, directThreadKey, A012, str3);
            A022.A9s("reply", str5);
        }
        AbstractC47995LLh.A0D(A022, l1w, directThreadKey, A06, str, str2, z, z2, false);
        C1ON A0N = A022.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    public C31251eU(UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
    }
}
