package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KJb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45664KJb extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final KDM A01;
    public final boolean A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        boolean z = this.A02;
        int i = R.layout.direct_thread_color_picker_item_view;
        if (z) {
            i = R.layout.direct_thread_color_picker_grid_item_view;
        }
        return new C44740JrN(AbstractC25227BEk.A0D(A0E, viewGroup, i, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Drawable A00;
        C48315LZo c48315LZo = (C48315LZo) interfaceC66482zP;
        C44740JrN c44740JrN = (C44740JrN) c3oo;
        AbstractC167007dF.A1K(c48315LZo, c44740JrN);
        IgImageView igImageView = c44740JrN.A03;
        Context context = igImageView.getContext();
        TextView textView = c44740JrN.A01;
        String str = c48315LZo.A08;
        textView.setText(str);
        textView.setContentDescription(str);
        boolean z = this.A02;
        if (z) {
            IgImageView igImageView2 = c44740JrN.A04;
            if (igImageView2 != null) {
                igImageView2.setVisibility(AbstractC167007dF.A05(c48315LZo.A09 ? 1 : 0));
            }
        } else {
            c44740JrN.A05.setChecked(c48315LZo.A09);
        }
        AbstractC56952jT.A04(c44740JrN.A05, C05F.A00);
        View view = c44740JrN.A00;
        AbstractC56952jT.A04(view, C05F.A02);
        String str2 = c48315LZo.A04;
        if (c48315LZo.A05 == null) {
            c44740JrN.A02.setVisibility(8);
        } else {
            TextView textView2 = c44740JrN.A02;
            textView2.setVisibility(0);
            textView2.setText(c48315LZo.A05);
        }
        igImageView.setScaleType(c48315LZo.A02);
        AbstractC31172DnG.A1B(context, igImageView, AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_background));
        int i = c48315LZo.A01;
        if (i != 0) {
            A00 = context.getDrawable(i);
            if (A00 != null) {
                Integer num = c48315LZo.A03;
                if (num != null) {
                    A00.setTint(num.intValue());
                }
            } else {
                A00 = null;
            }
        } else {
            if (str2 != null && AbstractC81033jX.A04(str2)) {
                igImageView.setUrl(AbstractC81033jX.A00(AbstractC25227BEk.A0B(str2), -1, -1), this.A00);
                ViewOnClickListenerC48068LPt.A00(view, this, c44740JrN, c48315LZo, 11);
            }
            int[] iArr = c48315LZo.A06;
            int i2 = c48315LZo.A00;
            int i3 = R.drawable.direct_thread_color_picker_color_preview;
            if (z) {
                i3 = R.drawable.direct_thread_color_picker_grid_color_preview;
            }
            A00 = AbstractC46761KmI.A00(context, iArr, i2, i3);
        }
        igImageView.setImageDrawable(A00);
        ViewOnClickListenerC48068LPt.A00(view, this, c44740JrN, c48315LZo, 11);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48315LZo.class;
    }

    public C45664KJb(InterfaceC11380iw interfaceC11380iw, KDM kdm, boolean z) {
        this.A00 = interfaceC11380iw;
        this.A01 = kdm;
        this.A02 = z;
    }
}
