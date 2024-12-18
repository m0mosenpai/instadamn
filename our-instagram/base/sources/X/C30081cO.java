package X;

import android.text.TextUtils;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.1cO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30081cO implements InterfaceC29301b7 {
    public static final C0KV A04 = new C0KV() { // from class: X.1cP
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1517527421);
            int A032 = C0f9.A03(-2009121543);
            C30081cO c30081cO = new C30081cO(userSession, AbstractC28761aE.A00(userSession));
            C0f9.A0A(-1187714414, A032);
            C0f9.A0A(-921636112, A03);
            return c30081cO;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        String str;
        String str2;
        C30061cM c30061cM = (C30061cM) c1ow;
        if (c30061cM.C7R().size() > 1) {
            str = "DirectSendMediaShareMessageMutation_withMultipleDirectThreadKeys";
            str2 = "Found DirectForwardVisualMessageMutation with multiple DirectThreadKeys";
        } else if (c30061cM.A00.A00 == null) {
            str = "DirectSendMediaShareMessageMutation_withNullMedia";
            str2 = "Found DirectForwardVisualMessageMutation with null Media";
        } else {
            return LCX.A01(mnp, c30061cM, this.A01);
        }
        C0w9.A04(str, str2, 1);
        return false;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        String str2;
        String str3;
        Integer num;
        EnumC46252KdU enumC46252KdU;
        EnumC46251KdT enumC46251KdT;
        LAC A00;
        String str4;
        InterfaceC37261GbE interfaceC37261GbE2;
        C30061cM c30061cM;
        Object obj;
        C30061cM c30061cM2 = (C30061cM) c1ow;
        List C7R = c30061cM2.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        if (!c30061cM2.A03 && AbstractC159387Cy.A07(this.A00, c30061cM2, directThreadKey)) {
            if (SocialContextType.A0C.A00.equals(c30061cM2.A02)) {
                C72687XlE c72687XlE = (C72687XlE) this.A03.getValue();
                C14360o3.A0B(interfaceC37261GbE, 1);
                enumC46252KdU = EnumC46252KdU.SOCIAL_CONTEXT;
                C9CL c9cl = c30061cM2.A00;
                Object c25983BeX = new C25983BeX((C38321qM) c9cl.A00, c9cl.A02);
                enumC46251KdT = EnumC46251KdT.REPLY;
                A00 = AbstractC46926Kp7.A00(c72687XlE.A00);
                str4 = null;
                interfaceC37261GbE2 = interfaceC37261GbE;
                c30061cM = c30061cM2;
                obj = c25983BeX;
            } else {
                Kx4 kx4 = (Kx4) this.A02.getValue();
                C14360o3.A0B(interfaceC37261GbE, 1);
                enumC46252KdU = EnumC46252KdU.FEED;
                enumC46251KdT = EnumC46251KdT.SHARE;
                A00 = AbstractC46926Kp7.A00(kx4.A00);
                str4 = null;
                interfaceC37261GbE2 = interfaceC37261GbE;
                c30061cM = c30061cM2;
                obj = c30061cM2;
            }
            A00.A02(enumC46252KdU, enumC46251KdT, interfaceC37261GbE2, c30061cM, obj, str4);
            num = C05F.A0C;
        } else {
            String A06 = c30061cM2.A06();
            JTa jTa = ((C1OW) c30061cM2).A02;
            UserSession userSession = this.A00;
            String str5 = ((C1OW) c30061cM2).A05;
            C9CL c9cl2 = c30061cM2.A00;
            boolean z2 = jTa.A09;
            String str6 = jTa.A04;
            String str7 = jTa.A02;
            L1W l1w = jTa.A00;
            boolean z3 = jTa.A07;
            boolean z4 = jTa.A0A;
            boolean z5 = c30061cM2.A03;
            boolean z6 = c30061cM2.A04;
            String str8 = c30061cM2.A02;
            boolean z7 = c30061cM2.A05;
            C38321qM c38321qM = (C38321qM) c9cl2.A00;
            Integer num2 = (Integer) c9cl2.A01;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            c25621Ms.A09(C05F.A01);
            C2EY c2ey = C2EY.A1F;
            EnumC40111tc BRp = c38321qM.BRp();
            StringBuilder sb = new StringBuilder(AnonymousClass001.A0g("direct_v2/threads/broadcast/", c2ey.A00, "/"));
            sb.append("?media_type=");
            if (BRp == EnumC40111tc.A0Q) {
                str = "photo";
            } else {
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
            }
            sb.append(str);
            c25621Ms.A0B(sb.toString());
            LLX.A04(c25621Ms, l1w, directThreadKey, A06, str5, str6, str7, z2, z3, z4);
            c25621Ms.A9s("media_id", c38321qM.getId());
            c25621Ms.A9s("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
            c25621Ms.A0H("inventory_source", c38321qM.A0C.BJN());
            c25621Ms.A0H("social_context_share_type", str8);
            if (num2 != null) {
                c25621Ms.A9s("post_share_source", F7T.A00(num2));
            }
            String str9 = c9cl2.A04;
            if (!TextUtils.isEmpty(str9)) {
                if (z6) {
                    c25621Ms.A0H("post_reply_text", str9);
                } else {
                    c25621Ms.A9s("text", str9);
                }
            }
            if (z7) {
                c25621Ms.A9s("should_skip_genai_eval", "true");
            }
            C14360o3.A0B(userSession, 1);
            if ((c38321qM.A5n() || c38321qM.A4q()) && C18U.A06(C06090Tz.A05, userSession, 36318144670734302L)) {
                if (c38321qM.A4q()) {
                    str2 = "MEDIA_LABEL";
                } else {
                    str2 = "WARNING_SCREENS";
                }
                if (c38321qM.A4q()) {
                    str3 = "ai_generated_content";
                } else {
                    str3 = "FALLBACK";
                }
                c25621Ms.A9s("share_treatment_type", str2);
                c25621Ms.A9s("share_treatment_title", str3);
            }
            String str10 = c9cl2.A02;
            if (str10 != null) {
                c25621Ms.A9s("carousel_share_child_media_id", str10);
            }
            if (c38321qM.A0C.Bns() != null) {
                c25621Ms.A9s("repost_id", c38321qM.A0C.Bns().Bnr());
            }
            c25621Ms.A0I("is_x_transport_forward", z5);
            if (c38321qM.CdW()) {
                c25621Ms.A0H("tracking_token", c38321qM.A33());
            }
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            num = C05F.A00;
        }
        C162337Ov.A0Y(c19260xA, num);
    }

    public C30081cO(final UserSession userSession, C2DS c2ds) {
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8t
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new Kx4(UserSession.this);
            }
        });
        this.A03 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.YJL
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C72687XlE(UserSession.this);
            }
        });
    }
}
