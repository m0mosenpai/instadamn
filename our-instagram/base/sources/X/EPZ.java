package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EPZ extends C7E1 {
    public final ERC A00;
    public final List A01 = AbstractC166987dD.A1E();

    public EPZ(InterfaceC11380iw interfaceC11380iw, EIW eiw) {
        ERC erc = new ERC(interfaceC11380iw, eiw);
        this.A00 = erc;
        A0B(erc);
    }

    public final ArrayList A0C() {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (FJK fjk : this.A01) {
            if (fjk.A00) {
                User user = fjk.A01;
                C14360o3.A07(user);
                A1E.add(user);
            }
        }
        return A1E;
    }
}
