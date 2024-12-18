package X;

import android.os.Parcelable;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G2D implements InterfaceC37193Ga4 {
    public final User A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final Product A03;
    public final String A04;

    public G2D(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Product product, String str) {
        String str2;
        String str3;
        AbstractC167007dF.A1F(product, 3, str);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = product;
        this.A04 = str;
        Parcelable.Creator creator = User.CREATOR;
        User user = product.A0B;
        if (user != null) {
            str2 = AbstractC76433bn.A00(user);
            str3 = user.A03.getUsername();
        } else {
            str2 = null;
            str3 = null;
        }
        User user2 = new User(str2, str3);
        user2.A0i(user != null ? user.A03.Bhu() : null);
        this.A00 = user2;
    }

    @Override // X.InterfaceC37193Ga4
    public final void CNX(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        C14360o3.A0B(viewStub, 0);
        AbstractC31181DnP.A09(viewStub).setUrl(this.A00.Bhu(), this.A01);
    }

    @Override // X.InterfaceC37193Ga4
    public final /* synthetic */ void DDM(C148336m3 c148336m3) {
    }

    @Override // X.InterfaceC37193Ga4
    public final void EOe(C2EC c2ec, C2DS c2ds, DirectShareTarget directShareTarget, String str, boolean z) {
        C14360o3.A0B(str, 0);
        String A1A = AbstractC25228BEl.A1A(str);
        if (A1A != null && A1A.length() != 0) {
            C28531Zo.A04.A0E(this.A02, this.A03, this.A01.getModuleName(), this.A04, A1A);
        }
    }

    @Override // X.InterfaceC37193Ga4
    public final User CE6() {
        return this.A00;
    }
}
