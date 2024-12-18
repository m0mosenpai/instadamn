package X;

import android.webkit.MimeTypeMap;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class N0Z extends OMB {
    public static UserSession A05;
    public static final N0Z A06 = new OMB();
    public static final C12M A07;
    public static final C12T A08;
    public static final C12T A09;
    public static final C19L A0A;
    public InterfaceC58100PpP A00;
    public SmartCaptureLogger A01;
    public C12T A02;
    public C12T A03;
    public C19L A04;

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        File file;
        N0Z n0z = A06;
        A05 = AbstractC31177DnL.A0S(c6fq);
        C6BQ.A09(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0B(A0B, 1);
        C64161T1o c64161T1o = new C64161T1o(A0B);
        UserSession userSession = A05;
        if (userSession != null) {
            WVG A00 = OVd.A00(userSession);
            C12T c12t = A09;
            C12T c12t2 = A08;
            C19L c19l = A0A;
            int A072 = AbstractC25230BEn.A07(2, c12t2, c19l);
            if (n0z.A00 == null) {
                n0z.A00 = A00;
                n0z.A03 = c12t;
                n0z.A02 = c12t2;
                n0z.A04 = c19l;
                n0z.A01 = c64161T1o;
            }
            SmartCaptureLogger smartCaptureLogger = n0z.A01;
            if (smartCaptureLogger != null) {
                smartCaptureLogger.logEvent("docupload_started");
            }
            ArrayList A01 = n0z.A01(c6fq, c6fw);
            if (A01 != null && (file = (File) AbstractC001800i.A0J(A01)) != null) {
                InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 0);
                InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 1);
                InterfaceC103384lE A0I3 = AbstractC31175DnJ.A0I(c6fw, 2);
                String A0e = AbstractC31177DnL.A0e(c6fw, A072);
                C14360o3.A0B(A0e, 1);
                String A0x = AbstractC43593JPy.A0x();
                String A002 = AbstractC54106Nw4.A00(AbstractC43592JPx.A0x(file), A0x, 0);
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.getName()));
                if (mimeTypeFromExtension == null) {
                    mimeTypeFromExtension = AbstractC58317Pt9.A00(9);
                }
                C55191Odx c55191Odx = new C55191Odx(file, mimeTypeFromExtension, A002);
                String A0h = MSX.A0h(file);
                UserSession userSession2 = A05;
                if (userSession2 != null) {
                    C54993OUc A003 = AbstractC54105Nw3.A00(userSession2, A0x, A0e, A0h, 1, false);
                    C19L c19l2 = n0z.A04;
                    if (c19l2 == null) {
                        str = "uiScope";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    AbstractC166987dD.A1Z(new JWL(A0I, A0I2, n0z, A003, file, A0I3, c6fq, c55191Odx, null, 1), c19l2);
                }
            }
            return null;
        }
        str = "userSession";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.OMB, X.N0Z] */
    static {
        C12M c12m = new C12M();
        A07 = c12m;
        C12T c12t = c12m.A04;
        A09 = c12t;
        C12V c12v = c12m.CPG(1515051608, 3).get(C12X.A00);
        C14360o3.A0C(c12v, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        A08 = (C12T) c12v;
        A0A = AnonymousClass194.A02(AnonymousClass190.A02(c12t, new AnonymousClass197(null)));
    }
}
