package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class G7Q implements InterfaceC65952yX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ EQI A01;

    public G7Q(UserSession userSession, EQI eqi) {
        this.A00 = userSession;
        this.A01 = eqi;
    }

    @Override // X.InterfaceC65952yX
    public final /* bridge */ /* synthetic */ boolean EjD(Object obj) {
        SavedCollection savedCollection = (SavedCollection) obj;
        C14360o3.A0B(savedCollection, 0);
        EnumC33416Epn enumC33416Epn = savedCollection.A07;
        if (enumC33416Epn != EnumC33416Epn.A05 && enumC33416Epn != EnumC33416Epn.A0D) {
            if (C14360o3.A0K(savedCollection.A0F, "my_favs") && C17060sy.A01.A01(this.A00).A1l()) {
                return false;
            }
            if (this.A01.A05) {
                return savedCollection.A0B.booleanValue();
            }
            User user = savedCollection.A08;
            if (user != null) {
                String id = user.getId();
                UserSession userSession = this.A00;
                if (AbstractC31171DnF.A1W(userSession, id) || AbstractC35085Fcw.A00(userSession)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (Collections.unmodifiableList(savedCollection.A0L).size() > 0) {
            return true;
        }
        return false;
    }
}
