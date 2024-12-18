package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with GenericXmaMessageItemDefinition.")
/* loaded from: classes8.dex */
public final class KIQ extends AbstractC66412zI {
    public final UserSession A00;
    public final C75Y A01;
    public final InterfaceC165597am A02;
    public final C49123Lo2 A03;
    public final C7QB A04;

    public KIQ(UserSession userSession, C75Y c75y, InterfaceC165597am interfaceC165597am, C49123Lo2 c49123Lo2, C7QB c7qb) {
        C14360o3.A0B(interfaceC165597am, 5);
        this.A00 = userSession;
        this.A01 = c75y;
        this.A03 = c49123Lo2;
        this.A04 = c7qb;
        this.A02 = interfaceC165597am;
    }

    @Override // X.AbstractC66422zJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C44742JrP createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C44742JrP c44742JrP = new C44742JrP(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_poll_message, false));
        this.A04.D8a(c44742JrP.A05);
        c44742JrP.A04.EZv(new C48558Ldv(0, this, c44742JrP));
        return c44742JrP;
    }

    @Override // X.AbstractC66422zJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void bind(C44742JrP c44742JrP, K0K k0k) {
        AbstractC167007dF.A1K(k0k, c44742JrP);
        C7QY c7qy = k0k.A01;
        C158747Ak c158747Ak = c7qy.A0A;
        if (c158747Ak != null) {
            C7QB c7qb = this.A04;
            KS7 ks7 = c44742JrP.A05;
            c7qb.CzN(ks7, c7qy);
            C75Y c75y = this.A01;
            if (c75y != null) {
                c75y.bind(ks7, c158747Ak);
            }
        }
        if (c7qy.A0H != null) {
            c44742JrP.A04.setVisibility(0);
            C49123Lo2 c49123Lo2 = this.A03;
            C44782Js3 c44782Js3 = c44742JrP.A01;
            if (c44782Js3 != null) {
                c49123Lo2.ADy(c7qy, c44782Js3);
                c44742JrP.A02.setVisibility(AbstractC167007dF.A05(c7qy.BCt() ? 1 : 0));
            } else {
                C14360o3.A0F("pollViewHolder");
                throw C00O.createAndThrow();
            }
        } else {
            c44742JrP.A02.setVisibility(8);
            c44742JrP.A04.setVisibility(8);
        }
        C7BR c7br = k0k.A00.A0C;
        if (c7br != null && c44742JrP.A00 == null) {
            c44742JrP.A00 = new C7S9(this.A00, c44742JrP.A03, this.A02);
        }
        C7S9 c7s9 = c44742JrP.A00;
        if (c7s9 != null) {
            c7s9.A00(c7br);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K0K.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44742JrP c44742JrP = (C44742JrP) c3oo;
        C14360o3.A0B(c44742JrP, 0);
        C75Y c75y = this.A01;
        if (c75y != null) {
            c75y.unbind(c44742JrP.A05);
        }
    }
}
