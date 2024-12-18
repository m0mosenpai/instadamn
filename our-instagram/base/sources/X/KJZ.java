package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJZ extends AbstractC66422zJ {
    public final float A00;
    public final C47258KuV A01;
    public final InterfaceC11380iw A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new Jp3(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.ab_test_media_grid_item_layout, false), this.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r11, X.C3OO r12) {
        /*
            r10 = this;
            X.LZj r11 = (X.C48310LZj) r11
            X.Jp3 r12 = (X.Jp3) r12
            X.AbstractC167017dG.A1N(r11, r12)
            java.lang.String r5 = r11.A03
            com.instagram.common.typedurl.ImageUrl r4 = r11.A02
            X.VDG r9 = r11.A01
            boolean r8 = r11.A04
            int r7 = r11.A00
            X.0iw r0 = r10.A02
            X.KuV r6 = r10.A01
            r3 = 3
            r2 = 9
            X.AbstractC167017dG.A1T(r0, r6)
            com.instagram.business.ui.widget.IgABTestMultiImageButton r1 = r12.A00
            r1.setUrl(r4, r0)
            int r0 = r9.ordinal()
            if (r0 == r3) goto L49
            if (r0 == r2) goto L46
            r1.A0H()
        L2b:
            if (r8 == 0) goto L41
            X.6vH r0 = X.EnumC153476vH.A06
            r1.setMediaOverlay(r0)
            int r0 = r7 + 65
            char r0 = (char) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L39:
            r1.setAlphabet(r0)
            r0 = 1
            X.ViewOnClickListenerC48069LPu.A00(r1, r6, r4, r5, r0)
            return
        L41:
            r0 = 0
            r1.setMediaOverlay(r0)
            goto L39
        L46:
            X.6vG r0 = X.EnumC153466vG.A08
            goto L4b
        L49:
            X.6vG r0 = X.EnumC153466vG.A0N
        L4b:
            r1.setIcon(r0)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KJZ.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48310LZj.class;
    }

    public KJZ(C47258KuV c47258KuV, InterfaceC11380iw interfaceC11380iw, float f) {
        this.A02 = interfaceC11380iw;
        this.A01 = c47258KuV;
        this.A00 = f;
    }
}
