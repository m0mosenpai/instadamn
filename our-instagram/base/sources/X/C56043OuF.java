package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.OuF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56043OuF implements InterfaceC60602pj {
    public long A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public TextView A05;
    public C55982hj A06;
    public InterfaceC155836zD A07;
    public AppBarLayout A08;
    public OriginalAudioSubtype A09;
    public IgLinearLayout A0A;
    public ColorFilterAlphaImageView A0B;
    public final long A0C;
    public final C8JW A0D;
    public final AbstractC59962oe A0E;
    public final N8L A0F;
    public final C153756vk A0G;
    public final UserSession A0H;
    public final ImageUrl A0I;
    public final EnumC39549HdL A0J;
    public final C38335GtV A0K;
    public final Boolean A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final boolean A0W;

    public C56043OuF(C8JW c8jw, AbstractC59962oe abstractC59962oe, N8L n8l, C153756vk c153756vk, UserSession userSession, ImageUrl imageUrl, EnumC39549HdL enumC39549HdL, C38335GtV c38335GtV, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j, boolean z) {
        C14360o3.A0B(userSession, 3);
        this.A0K = c38335GtV;
        this.A0E = abstractC59962oe;
        this.A0H = userSession;
        this.A0W = z;
        this.A0M = str;
        this.A0C = j;
        this.A0D = c8jw;
        this.A0P = str2;
        this.A0O = str3;
        this.A0V = str4;
        this.A0U = str5;
        this.A0N = str6;
        this.A0Q = str7;
        this.A0S = str8;
        this.A0R = str9;
        this.A0L = bool;
        this.A0T = str10;
        this.A0I = imageUrl;
        this.A0G = c153756vk;
        this.A0F = n8l;
        this.A0J = enumC39549HdL;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A03 = AbstractC31176DnK.A0C(view, R.id.use_in_camera_button_scene_root);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.use_in_camera_label);
        this.A05 = A0N;
        if (A0N == null) {
            C14360o3.A0F("useInCameraLabel");
            throw C00O.createAndThrow();
        }
        A0N.setText(2131976418);
        this.A0A = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.action_button_container);
        this.A02 = AbstractC166997dE.A0S(view, R.id.use_in_camera_button);
        this.A04 = AbstractC167007dF.A0N(view, R.id.use_in_camera_label);
        this.A0B = (ColorFilterAlphaImageView) AbstractC166997dE.A0R(view, R.id.use_in_camera_icon);
        this.A08 = (AppBarLayout) AbstractC166997dE.A0R(view, R.id.app_bar_layout);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}
