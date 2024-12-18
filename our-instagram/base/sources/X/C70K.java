package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.70K, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70K {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final ViewStub A02;
    public final IgSimpleImageView A03;
    public final IgImageView A04;
    public final TouchInterceptorFrameLayout A05;
    public final View A06;

    public C70K(View view) {
        C14360o3.A0B(view, 1);
        this.A06 = view;
        View requireViewById = view.requireViewById(R.id.expanded_profile_pic_container);
        C14360o3.A07(requireViewById);
        this.A00 = (ViewGroup) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.expanded_profile_pic);
        C14360o3.A07(requireViewById2);
        this.A04 = (IgImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.profile_share_card);
        C14360o3.A07(requireViewById3);
        this.A01 = (ViewGroup) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.touch_interceptor_expanded_profile_pic);
        C14360o3.A07(requireViewById4);
        this.A05 = (TouchInterceptorFrameLayout) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.expanded_profile_picture_edit_button);
        C14360o3.A07(requireViewById5);
        this.A03 = (IgSimpleImageView) requireViewById5;
        this.A02 = (ViewStub) view.requireViewById(R.id.multiple_profile_picture_viewstub);
    }
}
