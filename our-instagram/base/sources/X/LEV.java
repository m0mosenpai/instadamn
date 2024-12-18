package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.direct.armadilloexpress.transportpayload.VideoExtraMetadata;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LEV {
    public final UserSession A00;
    public final C47977LIp A01;
    public final LAA A02;

    public LEV(UserSession userSession, C47977LIp c47977LIp) {
        C14360o3.A0B(c47977LIp, 2);
        this.A00 = userSession;
        this.A01 = c47977LIp;
        this.A02 = AbstractC46927Kp8.A00(userSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Media A00(CommonMediaTransport commonMediaTransport, LEV lev, C31191eO c31191eO, C47Z c47z) {
        Media A0C;
        int i;
        List A08;
        LAA laa;
        String A06;
        long j;
        CommonMediaTransport A03;
        if (commonMediaTransport == null) {
            laa = lev.A02;
            A06 = c31191eO.A06();
            j = 0;
        } else {
            AbstractC60877RXa A0I = Media.DEFAULT_INSTANCE.A0I();
            C14360o3.A07(A0I);
            if (c47z.A11()) {
                String str = c47z.A2M;
                if (str != null && (A03 = LLT.A03(str)) != null) {
                    C45382K6p c45382K6p = (C45382K6p) Thumbnail.DEFAULT_INSTANCE.A0I();
                    c45382K6p.A08(A03);
                    c45382K6p.A07(c47z.A0S);
                    c45382K6p.A06(c47z.A0R);
                    C45386K6t c45386K6t = (C45386K6t) Video.DEFAULT_INSTANCE.A0I();
                    c45386K6t.A08(commonMediaTransport);
                    c45386K6t.A07(c47z.A0S);
                    c45386K6t.A06(c47z.A0R);
                    c45386K6t.A09(c45382K6p);
                    if (c47z.A1j.A00 > 0.0d) {
                        C45372K6f c45372K6f = (C45372K6f) VideoExtraMetadata.DEFAULT_INSTANCE.A0I();
                        float f = (float) c47z.A1j.A00;
                        VideoExtraMetadata videoExtraMetadata = (VideoExtraMetadata) AbstractC43592JPx.A0K(c45372K6f);
                        videoExtraMetadata.bitField0_ |= 1;
                        videoExtraMetadata.uploadMosClientScore_ = f;
                        c45386K6t.A0A(c45372K6f);
                    }
                    A0C = JQ1.A0C(A0I, c45386K6t);
                    i = 3;
                } else {
                    C0K8.A0D("ArmadilloExpressPermanentMediaMessageSender", "Video does not have a preview, skip sending");
                    laa = lev.A02;
                    A06 = c31191eO.A06();
                    j = 1;
                }
            } else {
                C45381K6o c45381K6o = (C45381K6o) StaticPhoto.DEFAULT_INSTANCE.A0I();
                c45381K6o.A08(commonMediaTransport);
                c45381K6o.A07(c47z.A0S);
                c45381K6o.A06(c47z.A0R);
                String str2 = c47z.A2N;
                if (str2 != null && (A08 = LLT.A08(str2)) != null) {
                    Iterator it = A08.iterator();
                    while (it.hasNext()) {
                        int A0B = AbstractC167007dF.A0B(it);
                        StaticPhoto staticPhoto = (StaticPhoto) AbstractC43592JPx.A0K(c45381K6o);
                        InterfaceC65672Tr2 interfaceC65672Tr2 = staticPhoto.scanLengths_;
                        if (!((TZ8) interfaceC65672Tr2).A00) {
                            interfaceC65672Tr2 = RYn.A05(interfaceC65672Tr2);
                            staticPhoto.scanLengths_ = interfaceC65672Tr2;
                        }
                        interfaceC65672Tr2.A8o(A0B);
                    }
                }
                A0C = JQ1.A0C(A0I, c45381K6o);
                i = 1;
            }
            A0C.mediaCase_ = i;
            return (Media) A0I.A02();
        }
        laa.A04(AbstractC43594JPz.A10(j), 7200, A06);
        return null;
    }
}
