package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.6fE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144326fE implements InterfaceC144306fC {
    public View A00;
    public IgFrameLayout A01;
    public IgProgressBar A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public C66645URj A06;
    public GradientSpinnerAvatarView A07;
    public String A08;
    public final Context A09;
    public final C57012jc A0A;

    @Override // X.InterfaceC144306fC
    public final void EYT(boolean z) {
        IgTextView igTextView = this.A03;
        if (z) {
            if (igTextView != null) {
                igTextView.setVisibility(4);
                IgProgressBar igProgressBar = this.A02;
                if (igProgressBar != null) {
                    igProgressBar.setVisibility(0);
                    return;
                }
                C14360o3.A0F("loadingSpinner");
            }
            C14360o3.A0F("buttonView");
        } else {
            if (igTextView != null) {
                igTextView.setVisibility(0);
                IgProgressBar igProgressBar2 = this.A02;
                if (igProgressBar2 != null) {
                    igProgressBar2.setVisibility(4);
                    return;
                }
                C14360o3.A0F("loadingSpinner");
            }
            C14360o3.A0F("buttonView");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144306fC
    public final void FAS(UserSession userSession) {
        IgTextView igTextView = this.A03;
        if (igTextView == null) {
            C14360o3.A0F("buttonView");
            throw C00O.createAndThrow();
        }
        Context context = igTextView.getContext();
        C14360o3.A0A(context);
        C66645URj c66645URj = this.A06;
        if (c66645URj != null) {
            igTextView.setText(AbstractC34281FAb.A00(context, userSession, c66645URj));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C144326fE(Context context, C57012jc c57012jc) {
        this.A09 = context;
        this.A0A = c57012jc;
    }
}
