package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.shopping.ProductArEffectMetadataIntf;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.Product;

/* renamed from: X.IbD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41623IbD {
    public Fragment A00;
    public String A01;
    public String A02;
    public String A03;
    public final InterfaceC1819385d A04 = new C42138Ilm(this);
    public final C189698ao A05;
    public final FragmentActivity A06;
    public final C22P A07;
    public final UserSession A08;
    public final ProductItemWithAR A09;
    public final Boolean A0A;
    public final String A0B;
    public final String A0C;

    public final void A01() {
        C189698ao c189698ao = this.A05;
        c189698ao.A01(this.A04);
        Boolean bool = this.A0A;
        if (bool != null && bool.booleanValue() && !c189698ao.A04.A00()) {
            if (c189698ao.A05(C05F.A0Y, AbstractC167017dG.A0j())) {
                return;
            }
        }
        A00(this);
    }

    public C41623IbD(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, Boolean bool, String str, String str2) {
        this.A06 = fragmentActivity;
        this.A08 = userSession;
        this.A0C = str;
        this.A07 = c22p;
        this.A0B = str2;
        this.A0A = bool;
        this.A09 = new ProductItemWithAR(productArEffectMetadataIntf.F5u(), product.A01);
        this.A05 = new C189698ao(AbstractC166987dD.A0O(fragmentActivity), fragmentActivity, null, AbstractC31171DnF.A0D("ShoppingCameraNavigator"), userSession);
    }

    public static final void A00(C41623IbD c41623IbD) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(2022), c41623IbD.A09);
        A0b.putSerializable("camera_entry_point", c41623IbD.A07);
        A0b.putString("shopping_session_id", c41623IbD.A0C);
        A0b.putString("viewer_session_id", c41623IbD.A03);
        AbstractC37300Gc1.A0c(A0b, c41623IbD.A0B);
        A0b.putString("checkout_session_id", c41623IbD.A01);
        A0b.putString("source_media_id", c41623IbD.A02);
        A0b.putString("ch", null);
        A0b.putString(AbstractC111324zv.A00(2180), null);
        A0b.putString(AbstractC111324zv.A00(1332), null);
        UserSession userSession = c41623IbD.A08;
        FragmentActivity fragmentActivity = c41623IbD.A06;
        C6XJ A02 = C6XJ.A02(fragmentActivity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5341));
        AbstractC31179DnN.A1S(A02);
        Fragment fragment = c41623IbD.A00;
        if (fragment != null) {
            A02.A0D(fragment, 5);
        } else {
            A02.A0C(fragmentActivity);
        }
        c41623IbD.A05.A02(c41623IbD.A04);
    }
}
