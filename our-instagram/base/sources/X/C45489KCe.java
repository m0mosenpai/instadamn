package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gallery.GalleryView;

/* renamed from: X.KCe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45489KCe extends AbstractC59962oe implements InterfaceC60072op, MQG {
    public static final String __redex_internal_original_name = "ReelPicsPleaseMediaGridFragment";
    public C47958LGu A00;
    public MPG A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A03 = "reel_pics_please_media_grid_fragment";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession A0r = AbstractC166987dD.A0r(this.A02);
        View A0S = AbstractC166997dE.A0S(view, R.id.gallery);
        L9H l9h = new L9H(10, null, null, null, null, AbstractC166997dE.A0p(view.getContext(), 2131966115), null, 0.5625f, 10, false, false, false, false, false, false, true, false);
        C47958LGu c47958LGu = new C47958LGu(A0S, AbstractC018607g.A00(this), EnumC188968Ym.A02, A0r, null, null, l9h, null, 3, 0, false, false, false);
        c47958LGu.A02 = this.A01;
        this.A00 = c47958LGu;
        AbstractC31176DnK.A1D(view, R.id.media_picker_tab_header);
    }

    @Override // X.MQG
    public final boolean CQn() {
        C47958LGu c47958LGu = this.A00;
        boolean z = false;
        if (c47958LGu != null) {
            GalleryView galleryView = c47958LGu.A03;
            if (galleryView == null) {
                C14360o3.A0F("galleryView");
                throw C00O.createAndThrow();
            }
            ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = galleryView.A0B;
            if (viewOnTouchListenerC195698lA != null && viewOnTouchListenerC195698lA.A04) {
                z = true;
            }
        }
        return !z;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.MQG
    public final boolean isScrolledToTop() {
        C47958LGu c47958LGu = this.A00;
        if (c47958LGu != null) {
            return c47958LGu.A05();
        }
        return false;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C47958LGu c47958LGu = this.A00;
        if (c47958LGu != null) {
            return c47958LGu.A06();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-50791954);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_media_picker_photos, viewGroup, false);
        C0f9.A09(-668194199, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(487131453);
        super.onPause();
        C47958LGu c47958LGu = this.A00;
        if (c47958LGu != null) {
            c47958LGu.A02();
        }
        C0f9.A09(351158886, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2113476584);
        super.onResume();
        C47958LGu c47958LGu = this.A00;
        if (c47958LGu != null) {
            c47958LGu.A03();
        }
        C0f9.A09(-1678523475, A02);
    }
}
