package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KKE extends IgFrameLayout {
    public InterfaceC11380iw A00;
    public AbstractC47343Kvs A01;
    public final IgImageView A02;

    public KKE(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC47343Kvs abstractC47343Kvs) {
        super(context);
        String str;
        int i;
        Context A0L = AbstractC166997dE.A0L(this);
        IgImageView igImageView = new IgImageView(A0L);
        this.A02 = igImageView;
        this.A01 = abstractC47343Kvs;
        this.A00 = interfaceC11380iw;
        Resources resources = getResources();
        int A08 = AbstractC166997dE.A08(resources);
        igImageView.setPadding(A08, A08, A08, A08);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        ((ViewGroup.LayoutParams) layoutParams).width = dimensionPixelSize;
        ((ViewGroup.LayoutParams) layoutParams).height = dimensionPixelSize;
        igImageView.setLayoutParams(layoutParams);
        AbstractC47343Kvs abstractC47343Kvs2 = this.A01;
        if (abstractC47343Kvs2 != null) {
            if (abstractC47343Kvs2 instanceof KQA) {
                str = ((KQA) abstractC47343Kvs2).A01;
            } else if (abstractC47343Kvs2 instanceof KQB) {
                str = ((KQB) abstractC47343Kvs2).A02;
            } else {
                str = ((KQ9) abstractC47343Kvs2).A01;
            }
        } else {
            str = null;
        }
        igImageView.setContentDescription(str);
        if (abstractC47343Kvs2 instanceof KQA) {
            InterfaceC11380iw interfaceC11380iw2 = this.A00;
            if (interfaceC11380iw2 != null) {
                AbstractC25235BEs.A1I(interfaceC11380iw2, igImageView, ((KQA) abstractC47343Kvs2).A02);
            }
        } else {
            if (abstractC47343Kvs2 instanceof KQ9) {
                i = R.drawable.igd_expression_tray_giphy;
            } else {
                i = abstractC47343Kvs2 instanceof KQB ? ((KQB) abstractC47343Kvs2).A00 : i;
            }
            AbstractC166997dE.A19(A0L, igImageView, i);
        }
        addView(igImageView);
    }
}
