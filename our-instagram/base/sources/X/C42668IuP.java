package X;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.user.model.User;

/* renamed from: X.IuP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42668IuP implements InterfaceC85403rV {
    public final int A00;
    public final Object A01;

    public C42668IuP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        ProductCollectionFragment productCollectionFragment;
        String str2;
        String str3;
        User A02;
        int i = this.A00;
        C14360o3.A0B(str, 1);
        switch (i) {
            case 0:
                ((L9F) this.A01).A09.Cs3(str, false, null);
                return;
            case 1:
                productCollectionFragment = ((HFJ) this.A01).A03;
                break;
            case 2:
                productCollectionFragment = ((HFZ) this.A01).A00;
                break;
            default:
                C38936HCj c38936HCj = (C38936HCj) this.A01;
                C41117IIi c41117IIi = c38936HCj.A03;
                if (c41117IIi != null) {
                    C143536ds c143536ds = c41117IIi.A03;
                    if (((AbstractC149546o6) c143536ds).A00 != null) {
                        boolean A022 = C1P8.A02(c143536ds.A01);
                        C6QX c6qx = c41117IIi.A02;
                        if (A022) {
                            A02 = AbstractC41735Ie7.A02(c6qx, str);
                        } else {
                            A02 = C6RX.A02(c6qx, str);
                        }
                        C84823qW c84823qW = new C84823qW(A02);
                        c84823qW.A1g = "text";
                        C146016hy c146016hy = ((AbstractC149546o6) c143536ds).A00;
                        A02.getId();
                        c146016hy.A01(c41117IIi.A01, c84823qW);
                    }
                }
                FragmentActivity requireActivity = c38936HCj.requireActivity();
                UserSession A0r = AbstractC166987dD.A0r(c38936HCj.A06);
                if (A0r != null) {
                    C6XJ A0L = AbstractC31171DnF.A0L(requireActivity, AbstractC37303Gc4.A02(A0r, AbstractC31402Dr6.A02(A0r, str, "reel_context_sheet_caption", c38936HCj.getModuleName())), A0r, ModalActivity.class, "profile");
                    A0L.A02 = c38936HCj;
                    A0L.A08();
                    A0L.A0C(requireActivity);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
        }
        int ordinal = productCollectionFragment.A0A.A02.ordinal();
        if (ordinal != 6 && ordinal != 8) {
            if (ordinal != 16) {
                str2 = null;
            } else {
                str2 = "shopping_incentive_mention";
                str3 = "incentive";
                if (str2 != null || str3 == null) {
                }
                ProductCollectionFragment.A00(productCollectionFragment, str, str2, str3);
                return;
            }
        } else {
            str2 = "shopping_product_collection_page";
        }
        if (ordinal != 6 && ordinal != 8) {
            if (ordinal != 16) {
                str3 = null;
            }
            str3 = "incentive";
        } else {
            str3 = "shopping_product_collection_page";
        }
        if (str2 != null) {
        }
    }
}
