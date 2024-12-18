package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.NEo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52350NEo extends AbstractC66412zI {
    public final InterfaceC16660sJ A00;

    public C52350NEo(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51310MlX(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.iglive_bottom_sheet_title_description, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r3.length() == 0) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r6, X.C3OO r7) {
        /*
            r5 = this;
            X.Ovh r6 = (X.C56122Ovh) r6
            X.MlX r7 = (X.C51310MlX) r7
            r4 = 0
            X.AbstractC167007dF.A1K(r6, r7)
            java.lang.String r3 = r6.A02
            if (r3 == 0) goto L13
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L14
        L13:
            r1 = 1
        L14:
            r2 = 8
            android.widget.TextView r0 = r7.A02
            if (r1 == 0) goto L35
            r0.setVisibility(r2)
        L1d:
            android.widget.TextView r0 = r7.A00
            r0.setVisibility(r2)
            java.lang.String r1 = r6.A00
            if (r1 == 0) goto L3c
            int r0 = r1.length()
            if (r0 == 0) goto L3c
            android.widget.TextView r0 = r7.A01
            r0.setText(r1)
            r0.setVisibility(r4)
            return
        L35:
            r0.setText(r3)
            r0.setVisibility(r4)
            goto L1d
        L3c:
            android.widget.TextView r0 = r7.A01
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52350NEo.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56122Ovh.class;
    }

    public C52350NEo() {
        this(C57729PjI.A00);
    }
}
