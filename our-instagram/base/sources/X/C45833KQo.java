package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.KQo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45833KQo extends AbstractC46433Kgt {
    public final ViewModelListUpdate A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45833KQo) {
                C45833KQo c45833KQo = (C45833KQo) obj;
                if (!C14360o3.A0K(this.A03, c45833KQo.A03) || !C14360o3.A0K(this.A01, c45833KQo.A01) || !C14360o3.A0K(this.A00, c45833KQo.A00) || !C14360o3.A0K(this.A02, c45833KQo.A02) || !C14360o3.A0K(this.A04, c45833KQo.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A00, (AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C45833KQo(ViewModelListUpdate viewModelListUpdate, User user, String str, String str2, List list) {
        AbstractC167017dG.A1Q(str, viewModelListUpdate);
        this.A03 = str;
        this.A01 = user;
        this.A00 = viewModelListUpdate;
        this.A02 = str2;
        this.A04 = list;
    }
}
