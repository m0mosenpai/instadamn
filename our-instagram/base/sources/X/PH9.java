package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.shopping.ProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PH9 implements InterfaceC37295Gbw {
    public C38686GzR A00;
    public final Context A01;
    public final View A02;
    public final C38686GzR A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C47Z A06;
    public final String A07;
    public final N5Q A08;

    public PH9(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, N5Q n5q, C47Z c47z, String str) {
        C38686GzR c38686GzR;
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A05 = userSession;
        this.A02 = view;
        this.A08 = n5q;
        this.A04 = interfaceC11380iw;
        this.A06 = c47z;
        this.A07 = str;
        if (c47z != null) {
            c38686GzR = c47z.A0q;
        } else {
            c38686GzR = null;
        }
        this.A03 = c38686GzR;
        this.A00 = c38686GzR;
    }

    @Override // X.InterfaceC43444JHi
    public final void A8F(User user) {
    }

    @Override // X.InterfaceC37183GZu
    public final FragmentActivity B8O() {
        return null;
    }

    @Override // X.InterfaceC43444JHi
    public final void D7m(User user) {
    }

    @Override // X.InterfaceC37182GZt
    public final void DDE(Context context, User user, String str, int i) {
    }

    @Override // X.InterfaceC37183GZu
    public final void DFQ(FBUserTag fBUserTag) {
    }

    @Override // X.InterfaceC37183GZu
    public final void DFR(FBUserTag fBUserTag) {
    }

    @Override // X.InterfaceC37184GZv
    public final void DKa(User user, boolean z) {
    }

    @Override // X.InterfaceC37182GZt
    public final void DT2(User user, int i) {
    }

    @Override // X.InterfaceC37184GZv
    public final void Dew(User user) {
    }

    @Override // X.GYN
    public final void Ds5() {
    }

    @Override // X.InterfaceC37184GZv, X.InterfaceC37182GZt
    public final void Dy8(User user, int i) {
    }

    @Override // X.InterfaceC43444JHi
    public final void EDC(View view) {
    }

    private final void A00(Product product, String str) {
        String str2;
        UserSession userSession = this.A05;
        boolean A00 = Ny2.A00(userSession);
        C47Z c47z = this.A06;
        if (c47z != null && (str2 = c47z.A2g) != null) {
            ArrayList arrayList = c47z.A43;
            InterfaceC11380iw interfaceC11380iw = this.A04;
            boolean A0t = c47z.A0t();
            Object obj = null;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) next;
                    if (C14360o3.A0K(tag.getId(), product.A0H) || C14360o3.A0K(tag.A04(), product.A0J)) {
                        obj = next;
                        break;
                    }
                }
                MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) obj;
                if (mediaSuggestedProductTag != null) {
                    AbstractC55225Oes.A0B(interfaceC11380iw, userSession, mediaSuggestedProductTag, str, str2, A0t, A00);
                }
            }
        }
    }

    public final ArrayList A01() {
        C38686GzR c38686GzR = this.A00;
        String str = this.A07;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = C41747IeL.A01(c38686GzR, str).iterator();
        while (it.hasNext()) {
            A1E.add(new ProductTag((Product) it.next()));
        }
        return A1E;
    }

    @Override // X.InterfaceC43445JHj
    public final void CvL(Product product) {
        C38686GzR A00;
        ArrayList A1E;
        C38686GzR c38686GzR = this.A00;
        if (c38686GzR != null) {
            Collection collection = (Collection) c38686GzR.A01;
            if (collection != null) {
                A1E = AbstractC166987dD.A1F(collection);
            } else {
                A1E = AbstractC166987dD.A1E();
            }
            C38682GzN A01 = C41722Idt.A01(product);
            if (A01 != null) {
                A1E.add(A01);
                A00 = this.A00;
                if (A00 != null) {
                    A00.A01 = A1E;
                }
            } else {
                return;
            }
        } else {
            A00 = C41722Idt.A00(null, null, this.A07, AbstractC166987dD.A1J(product));
            this.A00 = A00;
        }
        C47Z c47z = this.A06;
        if (c47z != null) {
            c47z.A0q = A00;
        }
        this.A08.A01();
        A00(product, "add");
    }

    @Override // X.InterfaceC43445JHj
    public final void D9a(Product product) {
        String str;
        ArrayList A01 = C41747IeL.A01(this.A00, this.A07);
        A01.remove(product);
        C38686GzR c38686GzR = this.A00;
        if (c38686GzR != null) {
            str = c38686GzR.A02;
        } else {
            str = null;
        }
        C38686GzR A00 = C41722Idt.A00(null, null, str, A01);
        this.A00 = A00;
        C47Z c47z = this.A06;
        if (c47z != null) {
            c47z.A0q = A00;
        }
        this.A08.A01();
        A00(product, "remove");
    }

    @Override // X.InterfaceC43422JGm
    public final void D9b(ProductCollection productCollection) {
        C38686GzR c38686GzR = this.A00;
        if (c38686GzR != null) {
            c38686GzR.A03 = null;
            c38686GzR.A00 = null;
        }
        C47Z c47z = this.A06;
        if (c47z != null) {
            c47z.A0q = c38686GzR;
        }
        this.A08.A01();
    }

    @Override // X.InterfaceC43445JHj
    public final boolean Eja(Product product) {
        return Ny2.A00(this.A05);
    }
}
