package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Gpf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38112Gpf extends AbstractC66412zI {
    public final JPS A00;
    public final InterfaceC43406JFw A01;
    public final InterfaceC16660sJ A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HKT hkt = (HKT) interfaceC66482zP;
        C38436GvJ c38436GvJ = (C38436GvJ) c3oo;
        AbstractC167007dF.A1K(hkt, c38436GvJ);
        this.A01.EE0(AbstractC31171DnF.A06(c38436GvJ), this.A00.BAM(hkt), ((AbstractC127945qN) hkt).A02, hkt, false);
        if (hkt.A02) {
            View view = c38436GvJ.itemView;
            AbstractC37304Gc5.A0t(view, c38436GvJ, view.getPaddingLeft(), c38436GvJ.itemView.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        } else {
            View view2 = c38436GvJ.itemView;
            AbstractC37304Gc5.A0t(view2, c38436GvJ, view2.getPaddingLeft(), 0);
        }
        if (hkt.A01) {
            View view3 = c38436GvJ.itemView;
            view3.setPadding(view3.getPaddingLeft(), c38436GvJ.itemView.getPaddingTop(), c38436GvJ.itemView.getPaddingRight(), c38436GvJ.itemView.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        } else {
            View view4 = c38436GvJ.itemView;
            view4.setPadding(view4.getPaddingLeft(), c38436GvJ.itemView.getPaddingTop(), c38436GvJ.itemView.getPaddingRight(), 0);
        }
        c38436GvJ.A01.setText(hkt.A00.A00().A04);
        ViewOnClickListenerC42034Ik3.A00(c38436GvJ.A00, 11, hkt, this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38436GvJ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.inline_keyword, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKT.class;
    }

    public C38112Gpf(JPS jps, InterfaceC43406JFw interfaceC43406JFw, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = jps;
        this.A01 = interfaceC43406JFw;
        this.A02 = interfaceC16660sJ;
    }
}
