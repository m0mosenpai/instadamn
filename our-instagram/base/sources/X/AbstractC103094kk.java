package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.4kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC103094kk {
    public static final C103104kl A01 = new Object();
    public static final InterfaceC103124kn A02 = C103114km.A00;
    public static final C103134ko A00 = C103134ko.A00;

    public static final C16L A00(C6FQ c6fq, String str) {
        C16L A03;
        try {
            AbstractC12990ll A0B = C6BQ.A0B(c6fq);
            if (A0B instanceof UserSession) {
                int i = C222015v.A09;
                A03 = new C07510aQ((UserSession) A0B).A03(str);
            } else if (C6BQ.A06(c6fq).A00) {
                A03 = C07340a8.A00.A03(str);
            } else {
                C52073N1y c52073N1y = C52073N1y.A00;
                C222015v c222015v = AbstractC221915u.A00;
                C14360o3.A08(c222015v);
                A03 = c222015v.A03(str);
            }
            A03.A1J();
            return A03;
        } catch (IOException e) {
            C0K8.A0F("IgBloksInitializer", "Error building delegate parser", e);
            throw new RuntimeException(e);
        }
    }
}
