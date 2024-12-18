package X;

import com.facebook.stash.core.Stash;
import java.nio.charset.StandardCharsets;

/* renamed from: X.4Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92814Du {
    public final String A00(String str) {
        String obj;
        Object A01;
        if (str == null) {
            A01 = C0HM.A00();
        } else {
            Stash stash = AbstractC92804Dt.A00;
            byte[] readResourceToMemory = stash.readResourceToMemory("secure_salt");
            if (readResourceToMemory != null) {
                obj = new String(readResourceToMemory, C15W.A05);
            } else {
                obj = C0HM.A00().toString();
                C14360o3.A07(obj);
                byte[] bytes = obj.getBytes(C15W.A05);
                C14360o3.A07(bytes);
                stash.write("secure_salt", bytes);
            }
            String A0R = AnonymousClass001.A0R(str, obj);
            C14360o3.A0B(A0R, 0);
            A01 = AbstractC50442Tn.A00.A01(A0R, StandardCharsets.UTF_8);
        }
        String obj2 = A01.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
