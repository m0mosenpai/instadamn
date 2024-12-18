package X;

import com.instagram.user.model.User;
import java.io.StringWriter;

/* renamed from: X.17y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC225717y {
    public static String A00(User user) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        C14360o3.A0B(user, 0);
        C16W.A00(A0A, AnonymousClass185.A00(user));
        A0A.close();
        return stringWriter.toString();
    }
}
