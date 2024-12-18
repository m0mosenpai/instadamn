package X;

import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.J0c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43012J0c implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C43012J0c(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        Object obj;
        switch (this.A00) {
            case 0:
                InterfaceC1119153d interfaceC1119153d = ((C63397SjR) this.A02).A0G;
                if (interfaceC1119153d == null) {
                    return;
                }
                interfaceC1119153d.Czx();
                return;
            case 1:
                C41742IeG c41742IeG = (C41742IeG) this.A02;
                IHO iho = c41742IeG.A05;
                ProductGroup productGroup = iho.A00;
                if (productGroup != null) {
                    HashSet hashSet = new HashSet(productGroup.A00());
                    Map map = iho.A02;
                    for (ProductVariantDimension productVariantDimension : map.keySet()) {
                        String A1A = AbstractC166987dD.A1A(productVariantDimension, map);
                        if (A1A != null) {
                            ProductGroup productGroup2 = iho.A00;
                            if (productGroup2 != null) {
                                List A01 = productGroup2.A01(productVariantDimension, A1A);
                                C14360o3.A07(A01);
                                hashSet.retainAll(AbstractC001800i.A0k(A01));
                            }
                        }
                    }
                    iho.A01 = hashSet;
                    if (AbstractC25226BEj.A1b(hashSet)) {
                        Iterator it = iho.A01.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((Product) obj).A0P) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        Product product = (Product) obj;
                        if (product == null) {
                            product = (Product) iho.A01.iterator().next();
                        }
                        if (!c41742IeG.A02) {
                            return;
                        }
                        AbstractC25651Mw.A00(c41742IeG.A04).E4s(new C42248InY(product));
                        return;
                    }
                    throw AbstractC31172DnG.A0u();
                }
                C14360o3.A0F("_productGroup");
                throw C00O.createAndThrow();
            case 2:
                C37675GiC c37675GiC = (C37675GiC) this.A02;
                c37675GiC.A0I.Czx();
                if (((User) this.A01).A02 != C17Q.A06) {
                    return;
                }
                c37675GiC.A07.onBackPressed();
                return;
            case 3:
                C37598Ggt c37598Ggt = (C37598Ggt) this.A02;
                c37598Ggt.EJo();
                c37598Ggt.Co0((C120985dq) this.A01);
                return;
            case 4:
                C59952od c59952od = ((IN9) this.A02).A05;
                if (c59952od != null) {
                    c59952od.DCM();
                }
                AbstractC56932jR.A06((View) this.A01, 1000L);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        String str;
        switch (this.A00) {
            case 0:
                C63397SjR c63397SjR = (C63397SjR) this.A02;
                InterfaceC1119153d interfaceC1119153d = c63397SjR.A0G;
                if (interfaceC1119153d != null) {
                    interfaceC1119153d.D00();
                }
                BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) this.A01;
                if (browserLiteFragment.A02 == 0) {
                    browserLiteFragment.AIE(10, browserLiteFragment.A0m);
                }
                SPM spm = c63397SjR.A0K;
                if (spm == null) {
                    return;
                }
                int i = browserLiteFragment.A02;
                if (i == 1) {
                    str = "tap";
                } else if (i != 2) {
                    return;
                } else {
                    str = "back_tap";
                }
                spm.A02("secondary_cta", "dismiss", str);
                return;
            case 1:
            default:
                return;
            case 2:
                ((C37675GiC) this.A02).A0I.D00();
                return;
        }
    }
}
