package X;

import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.ProductTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5L4, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5L4 {
    public static final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;

    public static final String A00(AndroidLink androidLink) {
        C14360o3.A0B(androidLink, 0);
        String Aw8 = androidLink.Aw8();
        if (Aw8 != null) {
            android.net.Uri A03 = AbstractC08820cl.A03(Aw8);
            C14360o3.A07(A03);
            return A03.getQueryParameter(AbstractC43591JPw.A00(132));
        }
        return null;
    }

    public static final String A01(AndroidLink androidLink) {
        C14360o3.A0B(androidLink, 0);
        String Aw8 = androidLink.Aw8();
        if (Aw8 != null) {
            android.net.Uri A03 = AbstractC08820cl.A03(Aw8);
            C14360o3.A07(A03);
            return A03.getQueryParameter("product_id");
        }
        return null;
    }

    public static final boolean A03(C38321qM c38321qM) {
        boolean z = false;
        if (c38321qM.A63()) {
            List A3w = c38321qM.A3w(EnumC75383a5.A0y);
            if (A3w != null && !A3w.isEmpty()) {
                return true;
            }
            return false;
        }
        if (c38321qM.A5M()) {
            Iterable A0C = C17s.A0C(0, c38321qM.A0p());
            if ((A0C instanceof Collection) && ((Collection) A0C).isEmpty()) {
                return false;
            }
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                C38321qM A1e = c38321qM.A1e(((AbstractC16880sg) it).A00());
                if (A1e != null && !A1e.A5M() && A03(A1e)) {
                    return true;
                }
            }
            return false;
        }
        if (A02(c38321qM).isEmpty()) {
            z = true;
        }
        return !z;
    }

    public static final boolean A04(AndroidLink androidLink) {
        android.net.Uri A01;
        String queryParameter;
        String Aw8 = androidLink.Aw8();
        if (Aw8 != null && (A01 = AbstractC08820cl.A01(A00, Aw8)) != null && (queryParameter = A01.getQueryParameter("checkout_style")) != null && queryParameter.equals("native_checkout")) {
            return true;
        }
        return false;
    }

    public static final ArrayList A02(C38321qM c38321qM) {
        ArrayList arrayList = new ArrayList();
        ArrayList A3O = c38321qM.A3O();
        if (A3O != null && !A3O.isEmpty()) {
            Iterator it = A3O.iterator();
            while (it.hasNext()) {
                ProductTag productTag = (ProductTag) it.next();
                if (productTag.A00 != 1) {
                    arrayList.add(productTag);
                }
            }
        }
        return arrayList;
    }
}
