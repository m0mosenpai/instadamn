package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.HashMap;

/* renamed from: X.Lma, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49048Lma implements InterfaceC164907Zd {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final LEK A02;
    public final InterfaceC163877Vb A03;
    public final InterfaceC08830cm A04;

    public C49048Lma(AbstractC59962oe abstractC59962oe, UserSession userSession, LEK lek, InterfaceC163877Vb interfaceC163877Vb, InterfaceC08830cm interfaceC08830cm) {
        AbstractC25234BEr.A0j(1, abstractC59962oe, lek, interfaceC08830cm, interfaceC163877Vb);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = lek;
        this.A04 = interfaceC08830cm;
        this.A03 = interfaceC163877Vb;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean AFt(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        InterfaceC163557Ts A0Z = AbstractC43593JPy.A0Z(this.A04);
        String str = directMessageIdentifier.A02;
        if (str == null) {
            str = directMessageIdentifier.A00;
        }
        C160787Im BT7 = A0Z.BT7(str);
        if (BT7 != null && BT7.A06()) {
            UserSession userSession = BT7.A0d;
            C2056398n A00 = AbstractC2056298m.A00(userSession);
            String str2 = BT7.A0e.A0V().A02;
            InterfaceC19630xq interfaceC19630xq = A00.A00;
            boolean A0K = C14360o3.A0K(interfaceC19630xq.getString("preference_direct_last_regenerated_ai_direct_message_identifier_id", null), str2);
            int i = 0;
            if (A0K) {
                i = interfaceC19630xq.getInt("preference_direct_regenerate_ai_message_request_count", 0);
            }
            if (i < AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36608428625696485L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIu(DirectMessageIdentifier directMessageIdentifier, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(directMessageIdentifier, 0);
        this.A03.CMc();
        HashMap A00 = A00(directMessageIdentifier);
        if (A00 == null) {
            return false;
        }
        HashMap A0r = AbstractC167017dG.A0r("on_complete", new C66237U5h(new C50363MLp(32, interfaceC16820sZ, this)));
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A03 = U6H.A09;
        c35205Ffx.A02 = U6G.A05;
        C65981Txa A03 = c35205Ffx.A03();
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.messenger.aibot.feedback_controller", A00, A0r);
        Context requireContext = this.A00.requireContext();
        IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(this.A01).A00;
        igBloksScreenConfig.A0C = A03;
        A02.A06(requireContext, igBloksScreenConfig);
        return true;
    }

    @Override // X.InterfaceC164907Zd
    public final boolean CIv(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
        HashMap A00 = A00(directMessageIdentifier);
        if (A00 == null) {
            return false;
        }
        C66237U5h c66237U5h = new C66237U5h(new C50357MLj(this, 47));
        UserSession userSession = this.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        C62862tP A002 = C62862tP.A00(new SparseArray(), abstractC59962oe, abstractC59962oe, userSession, null);
        C69618VsL A01 = FTe.A01("com.bloks.www.messenger.aibot.good_feedback_submit_controller");
        A01.A04 = A00;
        A01.A01 = c66237U5h;
        A01.A00(abstractC59962oe.requireContext(), A002);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.HashMap A00(com.instagram.model.direct.messageid.DirectMessageIdentifier r8) {
        /*
            r7 = this;
            X.0cm r6 = r7.A04
            X.7Ux r0 = X.AbstractC31176DnK.A0X(r6)
            int r5 = X.AbstractC31172DnG.A00(r0)
            X.LEK r3 = r7.A02
            java.lang.String r2 = r8.A01
            java.lang.String r1 = "DirectThreadFragment.giveFeedback"
            r0 = 0
            X.3nh r4 = X.LEK.A00(r3, r2, r1, r0)
            r3 = 0
            if (r4 != 0) goto L19
            return r3
        L19:
            X.7Ux r0 = X.AbstractC31176DnK.A0X(r6)
            X.2EC r1 = r0.Co6()
            java.lang.String r2 = ""
            if (r1 == 0) goto L3b
            java.lang.String r0 = r4.A1u
            com.instagram.user.model.User r0 = r1.CDl(r0)
            if (r0 == 0) goto L63
            X.17P r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r1 = r0.Aah()
        L33:
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A04
            if (r1 != r0) goto L60
            java.lang.String r0 = r4.A1u
            if (r0 != 0) goto L61
        L3b:
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r5 != r0) goto L41
            java.lang.String r2 = r4.A1u
        L41:
            X.7BW r0 = r4.A0Q
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L65
            int r0 = r1.length()
            if (r0 == 0) goto L65
            java.lang.String r0 = "bot_response_id"
            X.0e4 r1 = X.AbstractC166987dD.A1L(r0, r1)
            java.lang.String r0 = "persona_id"
            X.0e4[] r0 = X.AbstractC25229BEm.A1b(r0, r2, r1)
            java.util.HashMap r0 = X.AbstractC06930Yk.A02(r0)
            return r0
        L60:
            r0 = r2
        L61:
            r2 = r0
            goto L3b
        L63:
            r1 = r3
            goto L33
        L65:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49048Lma.A00(com.instagram.model.direct.messageid.DirectMessageIdentifier):java.util.HashMap");
    }

    public static final void A01(C49048Lma c49048Lma) {
        Context requireContext = c49048Lma.A00.requireContext();
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        AbstractC25226BEj.A1N(requireContext, A0Y, 2131959877);
        A0Y.A02();
        A0Y.A07(R.drawable.instagram_check_pano_outline_24);
        A0Y.A0O = true;
        AbstractC25233BEq.A1F(A0Y);
    }
}
