package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class E7k extends C0T6 implements InterfaceC37240Gap {
    public final List A00;
    public final User A01;
    public final String A02;
    public final String A03;

    public E7k(User user, String str, String str2, List list) {
        AbstractC25233BEq.A0w(2, str, list, str2);
        this.A01 = user;
        this.A02 = str;
        this.A00 = list;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7k) {
                E7k e7k = (E7k) obj;
                if (!C14360o3.A0K(this.A01, e7k.A01) || !C14360o3.A0K(this.A02, e7k.A02) || !C14360o3.A0K(this.A00, e7k.A00) || !C14360o3.A0K(this.A03, e7k.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0M(this.A01) * 31)));
    }
}
