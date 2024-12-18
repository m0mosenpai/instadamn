package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.WNf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnLayoutChangeListenerC70242WNf implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C6XX A04;
    public final /* synthetic */ C6XY A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public ViewOnLayoutChangeListenerC70242WNf(InterfaceC11380iw interfaceC11380iw, IgImageView igImageView, C38321qM c38321qM, C6XX c6xx, C6XY c6xy, String str, float f, boolean z, boolean z2) {
        this.A03 = c38321qM;
        this.A02 = igImageView;
        this.A07 = z;
        this.A08 = z2;
        this.A05 = c6xy;
        this.A06 = str;
        this.A01 = interfaceC11380iw;
        this.A00 = f;
        this.A04 = c6xx;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        C38321qM c38321qM = this.A03;
        IgImageView igImageView = this.A02;
        ExtendedImageUrl A1o = c38321qM.A1o(igImageView.getWidth());
        boolean z = this.A07;
        if (!z && !this.A08) {
            InterfaceC11380iw interfaceC11380iw = this.A01;
            String str = this.A06;
            C6XX c6xx = this.A04;
            if (A1o != null) {
                igImageView.A0E = new C70822Whf(c6xx);
                igImageView.setUrl(A1o, interfaceC11380iw);
                return;
            } else {
                igImageView.setVisibility(4);
                C37947Gmp.A01(str, "Null image");
                return;
            }
        }
        C6XY c6xy = this.A05;
        String str2 = this.A06;
        InterfaceC11380iw interfaceC11380iw2 = this.A01;
        boolean z2 = this.A08;
        C6XY.A00(interfaceC11380iw2, A1o, igImageView, this.A04, c6xy, str2, this.A00, z2, z);
    }
}
