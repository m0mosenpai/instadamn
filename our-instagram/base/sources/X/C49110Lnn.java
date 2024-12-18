package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.Lnn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49110Lnn implements C7QC {
    public final InterfaceC11380iw A00;
    public final InterfaceC165247aD A01;
    public final C162907Rb A02;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.direct_product_share_message, false);
        C7N9.A01(A0C);
        AbstractC010103p.A0B(A0C, new C44441Jl8(viewGroup, 3));
        C49166Loj c49166Loj = new C49166Loj(A0C);
        this.A02.A00(c49166Loj);
        return c49166Loj;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A02.A01(c7qd);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49166Loj c49166Loj = (C49166Loj) c7qd;
        KTI kti = (KTI) interfaceC129555tK;
        boolean A1R = AbstractC167007dF.A1R(0, c49166Loj, kti);
        C7QL c7ql = kti.A01;
        FrameLayout frameLayout = c49166Loj.A01;
        Object value = c7ql.A05.getValue();
        if (value != null) {
            AbstractC1580577p.A06((Drawable) value, frameLayout, c7ql, A1R);
            C45081JxB c45081JxB = kti.A02;
            if (c45081JxB != null) {
                IgProgressImageView igProgressImageView = c49166Loj.A07;
                igProgressImageView.setVisibility(0);
                igProgressImageView.setForeground(igProgressImageView.getContext().getDrawable(R.drawable.bubble_border_square));
                float A02 = C17s.A02(c45081JxB.A00, 0.8f, 1.91f);
                c49166Loj.A08.A00 = A02;
                igProgressImageView.setAspectRatio(A02);
                igProgressImageView.setExpiration(c45081JxB.A01);
                igProgressImageView.setUrl(c45081JxB.A02, this.A00);
            } else {
                c49166Loj.A07.setVisibility(8);
            }
            CircularImageView circularImageView = c49166Loj.A06;
            AbstractC37302Gc3.A0o(frameLayout.getContext(), circularImageView, kti.A05, 2131959249);
            ImageUrl imageUrl = kti.A00;
            if (imageUrl != null) {
                circularImageView.setUrl(imageUrl, this.A00);
            } else {
                circularImageView.A09();
            }
            TextView textView = c49166Loj.A05;
            textView.setText(kti.A04);
            textView.setTypeface(textView.getTypeface(), A1R ? 1 : 0);
            c49166Loj.A03.setText(kti.A03);
            c49166Loj.A02.post(new RunnableC49993M5i(this, c49166Loj, kti));
            this.A02.A02(c49166Loj, kti);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C49110Lnn(InterfaceC11380iw interfaceC11380iw, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        this.A01 = interfaceC165247aD;
        this.A00 = interfaceC11380iw;
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        this.A02 = AbstractC43594JPz.A0b(new C1580177l(null, new C49010Lly(this), c7az.A00(interfaceC165247aD), new C7Q9((InterfaceC165307aJ) interfaceC165247aD, z), (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false), c7az);
    }
}
