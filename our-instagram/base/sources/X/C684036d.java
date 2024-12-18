package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.36d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C684036d extends AbstractC60592pi implements InterfaceC684136e {
    public ViewStub A00;
    public IgImageView A01;
    public final int A02;
    public final Fragment A03;
    public final InterfaceC11380iw A04;
    public final InterfaceC53832dN A05;
    public final C684336g A06;

    public C684036d(Fragment fragment, InterfaceC11380iw interfaceC11380iw, InterfaceC53832dN interfaceC53832dN) {
        C14360o3.A0B(interfaceC53832dN, 3);
        this.A03 = fragment;
        this.A04 = interfaceC11380iw;
        this.A05 = interfaceC53832dN;
        this.A02 = fragment.requireContext().getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A06 = new C684336g();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        this.A00 = (ViewStub) view.findViewById(R.id.save_popout_image_stub);
    }

    @Override // X.InterfaceC684136e
    public final void Enu(Context context, android.net.Uri uri, int i) {
        C14360o3.A0B(uri, 0);
        if (i >= 0 && this.A00 != null) {
            if (this.A01 == null) {
                A00();
            }
            A01(i);
            IgImageView igImageView = this.A01;
            if (igImageView != null) {
                igImageView.setImageURI(uri);
            }
            this.A06.A01(i);
        }
    }

    @Override // X.InterfaceC684136e
    public final void Env(Context context, C38321qM c38321qM, int i) {
        C14360o3.A0B(c38321qM, 0);
        if (i >= 0) {
            ExtendedImageUrl A1q = c38321qM.A1q(context);
            if (this.A00 != null && A1q != null && !c38321qM.CcN()) {
                if (this.A01 == null) {
                    A00();
                }
                A01(i);
                IgImageView igImageView = this.A01;
                if (igImageView != null) {
                    igImageView.setUrl(A1q, this.A04);
                }
                this.A06.A01(i);
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
    }

    private final void A00() {
        ViewStub viewStub = this.A00;
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView");
            IgImageView igImageView = (IgImageView) inflate;
            this.A01 = igImageView;
            if (igImageView != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(igImageView.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                igImageView.measure(makeMeasureSpec, makeMeasureSpec);
                igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    private final void A01(int i) {
        int i2;
        Fragment fragment = this.A03;
        View view = fragment.mView;
        if (view != null) {
            if (i >= 5) {
                i = 4;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            IgImageView igImageView = this.A01;
            int i3 = 0;
            if (igImageView != null) {
                i2 = igImageView.getMeasuredWidth();
            } else {
                i2 = 0;
            }
            IgImageView igImageView2 = this.A01;
            if (igImageView2 != null) {
                i3 = igImageView2.getMeasuredHeight();
            }
            int i4 = width / 5;
            int i5 = (i * i4) + ((i4 - i2) / 2);
            if (AbstractC13620mo.A02(fragment.requireContext())) {
                i5 = -i5;
            }
            IgImageView igImageView3 = this.A01;
            if (igImageView3 != null) {
                igImageView3.setX(i5);
                igImageView3.setY((height - i3) - this.A02);
                igImageView3.setScaleX(0.0f);
                igImageView3.setScaleY(0.0f);
            }
        }
    }

    @Override // X.InterfaceC684236f
    public final void Cwl(boolean z, float f) {
        IgImageView igImageView = this.A01;
        if (igImageView != null) {
            if (z) {
                igImageView.setScaleX(f);
                igImageView.setScaleY(f);
                return;
            }
            float f2 = (f / 2.0f) + 0.5f;
            igImageView.setScaleX(f2);
            igImageView.setScaleY(f2);
            igImageView.setY(igImageView.getY() + ((1.0f - f) * (this.A02 + igImageView.getWidth())));
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        if (this.A01 != null) {
            A01(4);
        }
        C684336g c684336g = this.A06;
        c684336g.A03(null);
        c684336g.A04.clear();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C684336g c684336g = this.A06;
        c684336g.A03(this);
        c684336g.A02(this.A05);
    }
}
