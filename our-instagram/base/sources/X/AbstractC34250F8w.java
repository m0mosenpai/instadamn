package X;

import com.instagram.model.business.PublicPhoneContact;
import java.io.StringWriter;

/* renamed from: X.F8w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34250F8w {
    public static String A00(PublicPhoneContact publicPhoneContact) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        String str = publicPhoneContact.A03;
        if (str != null) {
            A0S.A0S(AbstractC58317Pt9.A00(348), str);
        }
        String str2 = publicPhoneContact.A00;
        if (str2 != null) {
            A0S.A0S(AbstractC58317Pt9.A00(700), str2);
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
