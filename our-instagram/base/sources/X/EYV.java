package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYV extends AbstractC66422zJ {
    public final EK0 A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E22(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.profile_multiple_addresses_edit_list_add_address_item_view_holder, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r1 == 0) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r4, X.C3OO r5) {
        /*
            r3 = this;
            X.Fy1 r4 = (X.C36187Fy1) r4
            X.AbstractC167017dG.A1N(r4, r5)
            android.view.View r2 = r5.itemView
            java.lang.String r0 = r4.A00
            if (r0 == 0) goto L13
            int r1 = r0.length()
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 != 0) goto L15
        L13:
            r0 = 1065353216(0x3f800000, float:1.0)
        L15:
            r2.setAlpha(r0)
            android.view.View r1 = r5.itemView
            r0 = 23
            X.ViewOnClickListenerC35687FpM.A00(r1, r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYV.bind(X.2zP, X.3OO):void");
    }

    public EYV(EK0 ek0) {
        this.A00 = ek0;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36187Fy1.class;
    }
}
