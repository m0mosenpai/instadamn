package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.6Of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138246Of extends AbstractC143566dv implements InterfaceC143626e2, InterfaceC143646e4 {
    public C41181vS A00;
    public C41551w4 A01;
    public C141596ac A02;
    public C46078Kaa A03;
    public final ViewGroup A04;
    public final InterfaceC145396gy A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final FrameLayout A0S;
    public final IgProgressImageView A0T;
    public final ScalingTextureView A0U;
    public final InterfaceC09390do A0V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138246Of(View view, UserSession userSession, InterfaceC145396gy interfaceC145396gy) {
        super(view);
        ScalingTextureView scalingTextureView;
        C14360o3.A0B(view, 1);
        this.A05 = interfaceC145396gy;
        this.A0G = C1XM.A00(new C57527Pg1(view, 48));
        this.A0B = C1XM.A00(new C57527Pg1(view, 42));
        this.A0D = C1XM.A00(new C57527Pg1(view, 44));
        this.A07 = C1XM.A00(new C57527Pg1(view, 38));
        this.A0V = C1XM.A00(new C57527Pg1(view, 47));
        this.A0N = C1XM.A00(new C57536PgA(14, userSession, view));
        this.A0O = C1XM.A00(new C57557PgV(view, 5));
        this.A0K = C1XM.A00(new C57557PgV(view, 2));
        this.A0L = C1XM.A00(new C57557PgV(view, 3));
        this.A0C = C1XM.A00(new C57527Pg1(view, 43));
        this.A0M = C1XM.A00(new C57557PgV(view, 4));
        this.A0P = C1XM.A00(new C57557PgV(view, 6));
        this.A06 = C1XM.A00(new C57527Pg1(view, 37));
        this.A0Q = C1XM.A00(new C57557PgV(view, 7));
        this.A0I = C1XM.A00(new C57557PgV(view, 0));
        this.A0H = C1XM.A00(new C57527Pg1(view, 49));
        this.A0E = C1XM.A00(new C57527Pg1(view, 45));
        this.A0F = C1XM.A00(new C57527Pg1(this, 46));
        this.A0R = C1XM.A00(new C57557PgV(view, 8));
        this.A0J = C1XM.A00(new C57557PgV(view, 1));
        this.A09 = C1XM.A00(new C57527Pg1(view, 40));
        this.A0A = C1XM.A00(new C57527Pg1(view, 41));
        this.A08 = C1XM.A00(new C57527Pg1(view, 39));
        Object value = this.A0D.getValue();
        C14360o3.A07(value);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        ((ImageView) value).setScaleType(scaleType);
        A00().getIgImageView().setScaleType(scaleType);
        IgProgressImageView A00 = A00();
        Context context = view.getContext();
        A00.setPlaceHolderColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_stories_loading_background)));
        IgProgressImageView A002 = A00();
        Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
        C14360o3.A0A(drawable);
        A002.setProgressBarDrawable(drawable);
        InterfaceC09390do interfaceC09390do = this.A0G;
        Object value2 = interfaceC09390do.getValue();
        C14360o3.A07(value2);
        Context context2 = ((View) value2).getContext();
        C14360o3.A07(context2);
        UMC umc = new UMC(context2, interfaceC145396gy);
        Object value3 = interfaceC09390do.getValue();
        C14360o3.A07(value3);
        GestureDetector gestureDetector = new GestureDetector(((View) value3).getContext(), umc);
        gestureDetector.setIsLongpressEnabled(false);
        Object value4 = interfaceC09390do.getValue();
        C14360o3.A07(value4);
        ((View) value4).setOnTouchListener(new ViewOnTouchListenerC70253WNy(gestureDetector, umc, interfaceC145396gy));
        this.A0T = A00();
        C57012jc c57012jc = (C57012jc) this.A0N.getValue();
        if (c57012jc != null) {
            scalingTextureView = (ScalingTextureView) c57012jc.A01();
        } else {
            scalingTextureView = null;
        }
        this.A0U = scalingTextureView;
        Object value5 = this.A0G.getValue();
        C14360o3.A07(value5);
        View view2 = (View) value5;
        C14360o3.A0C(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.A04 = (ViewGroup) view2;
        this.A0S = C4R8.A00(userSession, "reel_live_archive_viewer") ? BRC() : null;
    }

    @Override // X.InterfaceC143646e4
    public final void Dds(C141596ac c141596ac, int i) {
        C14360o3.A0B(c141596ac, 0);
        if (i == 1) {
            ((SegmentedProgressBar) this.A0F.getValue()).setProgress(c141596ac.A0B);
        }
    }

    public final IgProgressImageView A00() {
        Object value = this.A0V.getValue();
        C14360o3.A07(value);
        return (IgProgressImageView) value;
    }

    public final void A01() {
        Object value = this.A0D.getValue();
        C14360o3.A07(value);
        ((IgImageView) value).A09();
        Object value2 = this.A0O.getValue();
        C14360o3.A07(value2);
        ((TextView) value2).setText("");
        Object value3 = this.A0K.getValue();
        C14360o3.A07(value3);
        ((TextView) value3).setText("");
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        A00().getIgImageView().A09();
        ((SegmentedProgressBar) this.A0F.getValue()).setProgress(0.0f);
        Object value4 = this.A0C.getValue();
        C14360o3.A07(value4);
        ((TextView) value4).setText("");
        Object value5 = this.A07.getValue();
        C14360o3.A07(value5);
        ((IgImageView) value5).A09();
        C46078Kaa c46078Kaa = this.A03;
        if (c46078Kaa != null) {
            c46078Kaa.setVisibility(8);
        }
    }

    public final void A02(long j, long j2) {
        C46078Kaa c46078Kaa = this.A03;
        if (c46078Kaa == null) {
            Object value = this.A0G.getValue();
            C14360o3.A07(value);
            Context context = ((View) value).getContext();
            C14360o3.A07(context);
            c46078Kaa = new C46078Kaa(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = c46078Kaa.getContext().getResources().getDimensionPixelSize(R.dimen.annotation_cluster_name_plate_padding_top);
            c46078Kaa.setLayoutParams(layoutParams);
            c46078Kaa.setVisibility(8);
            Object value2 = this.A0E.getValue();
            C14360o3.A07(value2);
            ((ProgressAnchorContainer) value2).setAnchorView(c46078Kaa);
            this.A03 = c46078Kaa;
        }
        c46078Kaa.setProgress(C23831Eq.A02(j));
        ((SegmentedProgressBar) this.A0F.getValue()).setProgress(((float) j) / ((float) j2));
    }

    @Override // X.InterfaceC143586dx
    public final IgProgressImageView BGy() {
        return this.A0T;
    }

    @Override // X.InterfaceC143596dy
    public final C41181vS Blb() {
        return this.A00;
    }

    @Override // X.InterfaceC143586dx
    public final FrameLayout Blf() {
        return this.A0S;
    }

    @Override // X.InterfaceC143586dx
    public final ScalingTextureView C6w() {
        return this.A0U;
    }

    @Override // X.InterfaceC143626e2
    public final void ERN(float f) {
        Object value = this.A0P.getValue();
        C14360o3.A07(value);
        ((View) value).setAlpha(f);
        Object value2 = this.A06.getValue();
        C14360o3.A07(value2);
        ((View) value2).setAlpha(f);
    }
}
