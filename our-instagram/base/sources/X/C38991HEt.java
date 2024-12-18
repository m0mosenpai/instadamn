package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.HEt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38991HEt extends AbstractC65632xz {
    public final InterfaceC11380iw A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C38991HEt(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1488975416);
        C14360o3.A0B(obj, 2);
        if (i == 0) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.genericsurvey.ui.MediaPreviewViewBinder.Holder");
            ICB icb = (ICB) tag;
            C38321qM c38321qM = (C38321qM) obj;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            boolean A1a = AbstractC167017dG.A1a(icb, c38321qM);
            C14360o3.A0B(interfaceC11380iw, 2);
            IgProgressImageView igProgressImageView = icb.A00;
            igProgressImageView.setAdjustViewBounds(A1a);
            ImageUrl A1S = c38321qM.A1S();
            if (A1S != null) {
                igProgressImageView.setUrl(A1S, interfaceC11380iw);
                C0f9.A0A(360638764, A0G);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        UnsupportedOperationException A1D = AbstractC166987dD.A1D("View type unhandled");
        C0f9.A0A(-771142939, A0G);
        throw A1D;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1798289546);
        if (i == 0) {
            View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.media_preview_view, false);
            A0C.setTag(new ICB(A0C));
            C0f9.A0A(-899350572, A0G);
            return A0C;
        }
        UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled view type");
        C0f9.A0A(-671779499, A0G);
        throw A1D;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
