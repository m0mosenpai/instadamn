package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.6Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140356Wo {
    public int A00;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final InterfaceC11380iw A04;
    public final C191138dB A05;
    public final int A06;
    public final FrameLayout A07;
    public final FrameLayout A08;
    public final FrameLayout A09;
    public final C55942hf A0A;
    public final KKw A0B;
    public final KKw A0C;
    public final KKw A0D;

    public C140356Wo(View.OnClickListener onClickListener, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A04 = interfaceC11380iw;
        this.A03 = view;
        this.A05 = AbstractC191128dA.A00(userSession);
        this.A0A = C55942hf.A04(70.0d, 6.0d);
        Context context = view.getContext();
        C14360o3.A07(context);
        int A01 = (int) (AbstractC13890nF.A01(context) * 0.3f);
        this.A02 = A01;
        this.A06 = (int) (A01 * 0.5f);
        View requireViewById = view.requireViewById(R.id.first_image);
        C14360o3.A07(requireViewById);
        FrameLayout frameLayout = (FrameLayout) requireViewById;
        this.A07 = frameLayout;
        View requireViewById2 = view.requireViewById(R.id.second_image);
        C14360o3.A07(requireViewById2);
        FrameLayout frameLayout2 = (FrameLayout) requireViewById2;
        this.A08 = frameLayout2;
        View requireViewById3 = view.requireViewById(R.id.third_image);
        C14360o3.A07(requireViewById3);
        FrameLayout frameLayout3 = (FrameLayout) requireViewById3;
        this.A09 = frameLayout3;
        KKw kKw = new KKw(context, A01);
        this.A0B = kKw;
        KKw kKw2 = new KKw(context, A01);
        this.A0C = kKw2;
        KKw kKw3 = new KKw(context, A01);
        this.A0D = kKw3;
        A01(frameLayout, kKw, 0);
        A01(frameLayout2, kKw2, 1);
        A01(frameLayout3, kKw3, 2);
        C0fQ.A00(onClickListener, view);
    }

    public final void A02(O8S o8s) {
        C14360o3.A0B(o8s, 0);
        List list = o8s.A01;
        this.A00 = o8s.A00;
        boolean z = !list.isEmpty();
        View view = this.A03;
        if (z) {
            boolean z2 = false;
            if (view.getVisibility() == 0) {
                z2 = true;
            }
            view.setVisibility(0);
            AbstractC13880nE.A0g(view, this.A06);
            A00(this.A07, this.A0B, list, 0);
            A00(this.A08, this.A0C, list, 1);
            A00(this.A09, this.A0D, list, 2);
            this.A01 = true;
            if (!z2) {
                this.A05.A03(this.A00);
                return;
            }
            return;
        }
        view.setVisibility(8);
        this.A01 = false;
    }

    private final void A01(FrameLayout frameLayout, KKw kKw, int i) {
        float f = this.A02 / 2.0f;
        frameLayout.setPivotX(f);
        frameLayout.setPivotY(f);
        float f2 = i;
        float f3 = 8.0f;
        if (i % 2 == 0) {
            f2 = i + 1;
            f3 = -8.0f;
        }
        frameLayout.setRotation(f2 * f3);
        frameLayout.removeAllViews();
        frameLayout.addView(kKw);
        kKw.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int i2 = kKw.A00;
        AbstractC13880nE.A0g(kKw, i2);
        AbstractC13880nE.A0W(kKw, i2);
        AMo.A06(kKw, i2);
        kKw.setBackgroundColor(kKw.getContext().getColor(R.color.context_line_color));
    }

    public final void A03(boolean z) {
        int i;
        int i2;
        if (this.A01) {
            if (z) {
                i = this.A06;
                i2 = 0;
            } else {
                i = 0;
                i2 = 8;
            }
            AbstractC125325le A01 = AbstractC125325le.A01(this.A03, 0);
            A01.A0G();
            A01.A0R(r0.getWidth(), i);
            A01.A04 = 0;
            A01.A03 = i2;
            A01.A0F(!z).A0E(this.A0A).A0H();
            if (z) {
                this.A05.A03(this.A00);
            }
        }
    }

    private final void A00(View view, IgImageView igImageView, List list, int i) {
        if (i < list.size()) {
            C38321qM c38321qM = (C38321qM) list.get(i);
            view.setVisibility(0);
            ExtendedImageUrl A1o = c38321qM.A1o(this.A02);
            if (A1o != null) {
                igImageView.setUrl(A1o, this.A04);
                return;
            } else {
                igImageView.A09();
                return;
            }
        }
        view.setVisibility(8);
    }
}
