package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OHP {
    public final UserSession A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Mq, java.lang.Object] */
    public final void A00(InterfaceC16620sF interfaceC16620sF, byte[] bArr) {
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("video_call/rtc_message/");
        A0c.A0K("rtc_message", bArr);
        A0c.A0Q(new Object());
        ((AbstractC23721Ec) A0c).A06 = EnumC23341Bw.VideoCall;
        C1ON A0N = A0c.A0N();
        A0N.A00 = new N9T(interfaceC16620sF);
        C1GJ.A04(A0N, 242);
    }

    public OHP(UserSession userSession) {
        this.A00 = userSession;
    }
}
