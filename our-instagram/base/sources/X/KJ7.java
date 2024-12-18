package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class KJ7 extends AbstractC66422zJ {
    public final InterfaceC50456MPk A00;
    public final InterfaceC50457MPl A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_unified_sticker_entrypoint_item, false);
        C44666JqB c44666JqB = new C44666JqB(A0D);
        KKp.A01(AbstractC166987dD.A0s(A0D), this, 17);
        return c44666JqB;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        C44666JqB c44666JqB = (C44666JqB) c3oo;
        C14360o3.A0B(c44666JqB, 1);
        C7IK Auw = this.A01.Auw();
        if (Auw != null) {
            JQ1.A0X(c44666JqB.A01, Auw);
        }
        ImageView imageView = c44666JqB.A00;
        boolean z = this instanceof KQC;
        Context A06 = AbstractC31173DnH.A06(imageView, 0);
        if (z) {
            AbstractC31173DnH.A0z(A06, imageView, R.drawable.direct_unified_music_sticker_entrypoint_icon);
        } else {
            AbstractC31173DnH.A0z(A06, imageView, R.drawable.direct_unified_cutout_sticker_entrypoint_icon);
        }
        TextView textView = c44666JqB.A01;
        if (z) {
            C14360o3.A0B(textView, 0);
            i = 2131960761;
        } else {
            C14360o3.A0B(textView, 0);
            i = 2131960758;
        }
        textView.setText(i);
        InterfaceC50456MPk interfaceC50456MPk = this.A00;
        if (interfaceC50456MPk != null && (c44666JqB.itemView instanceof ViewGroup) && interfaceC50456MPk.EjO()) {
            Context A03 = AbstractC37301Gc2.A03(c44666JqB);
            View view = c44666JqB.itemView;
            AbstractC43592JPx.A1T(view);
            ViewGroup viewGroup = (ViewGroup) view;
            View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(A03), viewGroup, R.layout.direct_unified_entry_point_nux, false);
            ViewGroup.LayoutParams layoutParams = A0C.getLayoutParams();
            if (layoutParams != null) {
                C56302iJ c56302iJ = (C56302iJ) layoutParams;
                c56302iJ.A0s = imageView.getId();
                c56302iJ.A0u = imageView.getId();
                ((ViewGroup.MarginLayoutParams) c56302iJ).topMargin = A03.getResources().getDimensionPixelSize(R.dimen.annotation_cluster_name_plate_padding_top);
                A0C.setLayoutParams(c56302iJ);
                viewGroup.setClipChildren(false);
                viewGroup.addView(A0C);
                interfaceC50456MPk.Cmx();
                return;
            }
            throw AbstractC166987dD.A15("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public KJ7(InterfaceC50456MPk interfaceC50456MPk, InterfaceC50457MPl interfaceC50457MPl) {
        this.A01 = interfaceC50457MPl;
        this.A00 = interfaceC50456MPk;
    }
}
