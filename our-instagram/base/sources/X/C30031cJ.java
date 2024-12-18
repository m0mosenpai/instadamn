package X;

import android.text.TextUtils;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.1cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30031cJ implements InterfaceC29301b7 {
    public static final C0KV A03 = new C0KV() { // from class: X.1cL
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A032 = C0f9.A03(397242291);
            int A033 = C0f9.A03(-1822229479);
            C30031cJ c30031cJ = new C30031cJ(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(550148334, A033);
            C0f9.A0A(-54799539, A032);
            return c30031cJ;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        if (abstractC29011ae.C7R().size() > 1) {
            C0w9.A04("DirectSendLiveViewerInviteMessageMutation_withMultipleDirectThreadKeys", "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys", 1);
            return false;
        }
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        Integer num;
        C30011cH c30011cH = (C30011cH) c1ow;
        List C7R = c30011cH.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A06 = c30011cH.A06();
        JTa jTa = ((C1OW) c30011cH).A02;
        if (!c30011cH.A05 && AbstractC159387Cy.A07(this.A00, c30011cH, directThreadKey)) {
            C47413Kx2 c47413Kx2 = (C47413Kx2) this.A02.getValue();
            C14360o3.A0B(interfaceC37261GbE, 1);
            EnumC46252KdU enumC46252KdU = EnumC46252KdU.LIVE;
            String str = c30011cH.A03;
            C14360o3.A07(str);
            C47551KzL c47551KzL = new C47551KzL(str, new MHR(c30011cH, 42));
            AbstractC46926Kp7.A00(c47413Kx2.A00).A02(enumC46252KdU, EnumC46251KdT.SHARE, interfaceC37261GbE, c30011cH, c47551KzL, null);
            num = C05F.A0C;
        } else {
            UserSession userSession = this.A00;
            String str2 = ((C1OW) c30011cH).A05;
            String str3 = c30011cH.A03;
            String str4 = c30011cH.A01.A08;
            boolean z2 = jTa.A09;
            String str5 = jTa.A04;
            L1W l1w = jTa.A00;
            boolean z3 = jTa.A07;
            boolean z4 = jTa.A0A;
            boolean z5 = c30011cH.A05;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            c25621Ms.A05();
            EnumEntries enumEntries = C2EY.A0D;
            c25621Ms.A0B("direct_v2/threads/broadcast/live_viewer_invite/");
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str2, str5, z2, z3, z4);
            c25621Ms.A9s(TraceFieldType.BroadcastId, str3);
            c25621Ms.A0R = true;
            if (!TextUtils.isEmpty(str4)) {
                c25621Ms.A9s("text", str4);
            }
            c25621Ms.A0I("is_x_transport_forward", z5);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            num = C05F.A00;
        }
        C162337Ov.A0Y(c19260xA, num);
    }

    public C30031cJ(final UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8s
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C47413Kx2(UserSession.this);
            }
        });
    }
}
