package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes7.dex */
public final class HFD extends AbstractC65632xz {
    public final JPq A00;
    public final INL A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C38376GuD A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        IN1 in1 = (IN1) obj;
        IKK ikk = (IKK) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        AbstractC167017dG.A1P(in1, ikk);
        anonymousClass306.A7a(0);
        this.A01.A01(in1, ikk);
    }

    public HFD(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38376GuD c38376GuD, JPq jPq, INL inl) {
        this.A03 = userSession;
        this.A04 = c38376GuD;
        this.A01 = inl;
        this.A00 = jPq;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1792626937);
        AbstractC167007dF.A1D(view, 1, obj);
        C14360o3.A0B(obj2, 3);
        UserSession userSession = this.A03;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselProductImageViewBinder.Holder");
        C38462Gvj c38462Gvj = (C38462Gvj) tag;
        JPq jPq = this.A00;
        INL inl = this.A01;
        C41580IaT c41580IaT = new C41580IaT(userSession, jPq, inl);
        C39351HZq c39351HZq = (C39351HZq) obj;
        IKK ikk = (IKK) obj2;
        C43210J8h c43210J8h = new C43210J8h(16, this, obj2, obj);
        boolean A1T = AbstractC31175DnJ.A1T(1, c39351HZq, ikk);
        c41580IaT.A02.A01(c39351HZq, ikk);
        String str = c39351HZq.A01;
        String str2 = ikk.A04.A0J;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = c39351HZq.A02;
        C42332Iou A00 = C41580IaT.A00(c39351HZq, ikk, c43210J8h);
        C14360o3.A0B(str2, 1);
        C38376GuD c38376GuD = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C14360o3.A0B(userSession, A1T ? 1 : 0);
        C14360o3.A0B(c38462Gvj, 1);
        C14360o3.A0B(c38376GuD, 3);
        C14360o3.A0B(interfaceC11380iw, 4);
        C41609Iay.A00.A00(interfaceC11380iw, userSession, c38462Gvj.A02, c38376GuD, A00);
        if (str3 != null) {
            c38462Gvj.A01.A0K = str3;
        }
        Context context = c38462Gvj.A00;
        C14360o3.A07(context);
        ExtendedImageUrl A002 = A00.A00(context);
        if (A002 != null) {
            c38462Gvj.A01.setUrl(A002, interfaceC11380iw);
        }
        AbstractC37302Gc3.A0o(context, c38462Gvj.A01, str2, 2131963480);
        inl.A00(view, str);
        C0f9.A0A(-1609893647, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 831604054);
        View A0D = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.hero_carousel_product_image, false);
        A0D.setTag(new C38462Gvj(A0D));
        C0f9.A0A(-604837778, A0G);
        return A0D;
    }
}
