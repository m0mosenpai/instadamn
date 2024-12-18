package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class UKJ extends AbstractC65952Twx {
    public final UserSession A00;
    public final List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UKJ(Fragment fragment, UserSession userSession, List list) {
        super(fragment);
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
        this.A01 = list;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1061353728);
        int size = this.A01.size();
        C0f9.A0A(15666111, A03);
        return size;
    }
}
