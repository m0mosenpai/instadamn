package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bwl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27062Bwl extends AbstractC66412zI {
    public final C54445O3z A00;

    @Override // X.AbstractC66422zJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void bind(C25938Bdf c25938Bdf, C29158CtP c29158CtP) {
        int i;
        String A0u;
        boolean A1R = AbstractC167007dF.A1R(0, c29158CtP, c25938Bdf);
        View view = c25938Bdf.itemView;
        Context context = view.getContext();
        AbstractC151906sa abstractC151906sa = c29158CtP.A00;
        view.setEnabled(A1R);
        AbstractC56952jT.A01(c25938Bdf.itemView);
        C54445O3z c54445O3z = this.A00;
        if (c54445O3z != null) {
            ViewOnClickListenerC28668ClG.A02(c25938Bdf.itemView, 34, c54445O3z, abstractC151906sa);
            c25938Bdf.itemView.setOnLongClickListener(new ViewOnLongClickListenerC55478OkX(3, c54445O3z, abstractC151906sa));
        }
        c25938Bdf.A00.setImageResource(abstractC151906sa.A00);
        TextView textView = c25938Bdf.A01;
        AbstractC151926sc abstractC151926sc = abstractC151906sa.A02;
        textView.setText(abstractC151926sc.A01(context));
        c25938Bdf.itemView.setContentDescription(abstractC151926sc.A01(context));
        InterfaceC37108GWt A01 = abstractC151906sa.A01();
        if (A01 instanceof C36585GBj) {
            int i2 = ((C36585GBj) A01).A00;
            InterfaceC56392iX interfaceC56392iX = c25938Bdf.A03;
            View view2 = interfaceC56392iX.getView();
            if (i2 > 0) {
                TextView textView2 = (TextView) view2;
                if (i2 < 10) {
                    A0u = String.valueOf(i2);
                } else {
                    A0u = AbstractC25227BEk.A0u(context, 2131974181);
                }
                textView2.setText(A0u);
                view2 = interfaceC56392iX.getView();
                i = R.drawable.list_badge_small;
            } else {
                i = R.drawable.list_badge_donut;
            }
            view2.setBackgroundResource(i);
            interfaceC56392iX.setVisibility(0);
        } else if (C14360o3.A0K(A01, C36583GBh.A00)) {
            c25938Bdf.A03.setVisibility(8);
            c25938Bdf.A04.setVisibility(0);
            c25938Bdf.A02.setVisibility(8);
        } else if (C14360o3.A0K(A01, C36584GBi.A00)) {
            c25938Bdf.A03.setVisibility(8);
        } else {
            throw B4Z.A00();
        }
        c25938Bdf.A04.setVisibility(8);
        c25938Bdf.A02.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25938Bdf(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.profile_menu_options_row, false));
    }

    public C27062Bwl(C54445O3z c54445O3z) {
        this.A00 = c54445O3z;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C29158CtP.class;
    }

    public C27062Bwl() {
        this(null);
    }
}
