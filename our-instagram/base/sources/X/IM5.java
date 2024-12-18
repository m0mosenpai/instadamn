package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class IM5 {
    public final Context A00;
    public final FragmentActivity A01;
    public final AbstractC018607g A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

    public final void A00(Product product, String str) {
        new C1563470e(this.A04, new C42856IxW(), new C1563370d()).A0D(new C42853IxT(this, product, str, AbstractC61112qZ.A00(null)), product, str, null);
    }

    public IM5(Context context, FragmentActivity fragmentActivity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A04 = userSession;
        this.A00 = context;
        this.A02 = abstractC018607g;
        this.A03 = interfaceC11380iw;
        this.A01 = fragmentActivity;
    }
}
