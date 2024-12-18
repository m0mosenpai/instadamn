package X;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.fragment.AlbumEditFragment;
import java.lang.ref.Reference;

/* renamed from: X.Okv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC55502Okv implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewTreeObserverOnGlobalLayoutListenerC55502Okv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, Object obj2, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC55502Okv(i, obj, obj2));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i;
        int i2;
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4;
        Integer num;
        RectF rectF;
        RectF rectF2;
        int i5;
        N6L n6l;
        C3M4 c3m4;
        View view;
        switch (this.A00) {
            case 0:
                N6K n6k = (N6K) this.A02;
                View view2 = n6k.mView;
                if (view2 != null) {
                    MSZ.A15(view2, this);
                }
                C3M4 c3m42 = (C3M4) this.A01;
                rectF = null;
                rectF2 = n6k.A00;
                i5 = 0;
                c3m4 = c3m42;
                n6l = n6k;
                c3m4.A0X(rectF, rectF2, n6l, new P8V(i5));
                return;
            case 1:
                N6L n6l2 = (N6L) this.A02;
                View view3 = n6l2.mView;
                if (view3 != null) {
                    MSZ.A15(view3, this);
                }
                C3M4 c3m43 = (C3M4) this.A01;
                rectF = null;
                rectF2 = n6l2.A00;
                i5 = 2;
                c3m4 = c3m43;
                n6l = n6l2;
                c3m4.A0X(rectF, rectF2, n6l, new P8V(i5));
                return;
            case 2:
                C50643MXf c50643MXf = (C50643MXf) this.A02;
                if (c50643MXf.A0f == null) {
                    AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "clipsDirectoryProvider is null", null);
                    return;
                }
                AbstractC166997dE.A1K(c50643MXf.A0N, this);
                C183378Bk c183378Bk = c50643MXf.A0Y;
                String A0E = ((C115475Kh) this.A01).A0E();
                IgImageView igImageView = c50643MXf.A0R;
                c183378Bk.A03(Bitmap.Config.ARGB_8888, new C56279Oyo(c50643MXf, 1), A0E, igImageView.getWidth(), igImageView.getHeight());
                return;
            case 3:
                AbstractC166997dE.A1K((View) this.A01, this);
                AlbumEditFragment albumEditFragment = (AlbumEditFragment) this.A02;
                NHE nhe = AlbumEditFragment.A03(albumEditFragment).A01;
                if (nhe != null) {
                    num = Integer.valueOf(((AbstractC48580LeI) nhe).A00.A00);
                } else {
                    num = null;
                }
                AlbumEditFragment.A0F(albumEditFragment, num);
                albumEditFragment.A0T = false;
                return;
            case 4:
                C56234Oxh c56234Oxh = (C56234Oxh) this.A02;
                c56234Oxh.A0I = Float.valueOf(1.0f);
                C55982hj c55982hj = c56234Oxh.A0D;
                if (c55982hj != null) {
                    c55982hj.A02();
                }
                ((View) this.A01).getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            case 5:
                AbstractC166997dE.A1K((View) this.A01, this);
                AbstractC51004MgB abstractC51004MgB = ((C52143N5s) this.A02).A02;
                if (abstractC51004MgB == null) {
                    str = "viewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (!(abstractC51004MgB instanceof NJJ)) {
                    return;
                }
                NJJ njj = (NJJ) abstractC51004MgB;
                N2D n2d = njj.A00;
                if (n2d != null) {
                    n2d.A00.A05();
                }
                AbstractC43594JPz.A1T(((AbstractC51004MgB) njj).A05);
                return;
            case 6:
                view = (View) this.A02;
                if (view.getVisibility() != 0 || ((N9A) this.A01).A00.getAndSet(true)) {
                    return;
                }
                AbstractC166997dE.A1K(view, this);
                return;
            case 7:
                View view4 = (View) this.A02;
                AbstractC166997dE.A1K(view4, this);
                int height = view4.findViewById(R.id.container).getHeight();
                View findViewById = view4.findViewById(R.id.title);
                int i6 = 0;
                if (findViewById != null) {
                    i3 = findViewById.getHeight();
                } else {
                    i3 = 0;
                }
                View findViewById2 = view4.findViewById(R.id.description);
                if (findViewById2 != null) {
                    i4 = findViewById2.getHeight();
                } else {
                    i4 = 0;
                }
                View findViewById3 = view4.findViewById(R.id.headline);
                if (findViewById3 != null) {
                    i6 = findViewById3.getHeight();
                }
                int height2 = (((height - i3) - i4) - i6) - view4.findViewById(R.id.bottom_button_layout).getHeight();
                View view5 = (View) this.A01;
                C14360o3.A0A(view5);
                AbstractC13880nE.A0W(view5, height2);
                return;
            case 8:
                View view6 = (View) this.A01;
                view = (View) this.A02;
                ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
                if (layoutParams != null) {
                    if (AbstractC25228BEl.A0M(view).getDisplayMetrics().densityDpi >= 480) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (view.getHeight() * 0.15d);
                    }
                    view6.setLayoutParams(layoutParams);
                    AbstractC166997dE.A1K(view, this);
                    return;
                }
                throw AbstractC166987dD.A15("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            case 9:
                Reference reference = (Reference) this.A02;
                View view7 = (View) reference.get();
                if (view7 != null) {
                    MSZ.A15(view7, this);
                }
                View view8 = (View) reference.get();
                if (view8 == null) {
                    return;
                }
                int width = view8.getWidth();
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) ((Reference) this.A01).get();
                if (interfaceC16660sJ == null) {
                    return;
                }
                AbstractC43592JPx.A19(width, interfaceC16660sJ);
                return;
            case 10:
                PCT pct = (PCT) this.A02;
                InterfaceC09390do interfaceC09390do = pct.A0t;
                int i7 = 0;
                if (AbstractC167007dF.A0L(interfaceC09390do).getVisibility() == 0) {
                    i = AbstractC167007dF.A0L(interfaceC09390do).getMeasuredHeight();
                } else {
                    i = 0;
                }
                InterfaceC09390do interfaceC09390do2 = pct.A0a;
                if (AbstractC167007dF.A0L(interfaceC09390do2).getVisibility() == 0) {
                    i2 = AbstractC167007dF.A0L(interfaceC09390do2).getMeasuredHeight();
                } else {
                    i2 = pct.A01;
                }
                C54469O4x c54469O4x = pct.A04;
                if (c54469O4x != null) {
                    int paddingTop = ((View) this.A01).getPaddingTop();
                    ViewGroup.LayoutParams layoutParams2 = AbstractC167007dF.A0L(interfaceC09390do2).getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        i7 = marginLayoutParams.bottomMargin;
                    }
                    c54469O4x.A00.A0L.A05(new PDZ(i, i2, paddingTop, i7));
                    return;
                }
                str = "layoutChangeListener";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                PCT pct2 = (PCT) this.A02;
                PCT.A06(pct2, ((Configuration) this.A01).screenWidthDp);
                view = PCT.A01(pct2);
                AbstractC166997dE.A1K(view, this);
                return;
        }
    }
}
