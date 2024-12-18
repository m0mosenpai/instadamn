package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mmw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51391Mmw extends AbstractC65952Twx {
    public final UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51391Mmw(UserSession userSession, C52164N6q c52164N6q) {
        super(c52164N6q);
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
    }

    @Override // X.AbstractC65952Twx
    public final Fragment A03(int i) {
        Fragment n7r;
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31173DnH.A1C(A0b, this.A00);
        if (i == EnumC53213NgB.A04.A00) {
            n7r = new N6h();
        } else if (i == EnumC53213NgB.A05.A00) {
            n7r = new N7R();
        } else {
            throw AbstractC166987dD.A12(AnonymousClass001.A0c("Tab position ", " is not supported", i));
        }
        n7r.setArguments(A0b);
        return n7r;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(17202552);
        int length = EnumC53213NgB.values().length;
        C0f9.A0A(-1227172056, A03);
        return length;
    }
}
