package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KJa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45663KJa extends AbstractC66422zJ {
    public final float A00;
    public final C47259KuW A01;
    public final InterfaceC11380iw A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new Jp5(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_grid_item_layout, false), this.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r10, X.C3OO r11) {
        /*
            r9 = this;
            X.LZj r10 = (X.C48310LZj) r10
            X.Jp5 r11 = (X.Jp5) r11
            X.AbstractC167017dG.A1N(r10, r11)
            java.lang.String r8 = r10.A03
            com.instagram.common.typedurl.ImageUrl r7 = r10.A02
            X.VDG r6 = r10.A01
            boolean r5 = r10.A04
            X.0iw r0 = r9.A02
            X.KuW r4 = r9.A01
            r3 = 3
            r2 = 9
            X.AbstractC167017dG.A1S(r0, r4)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r11.A00
            r1.setUrl(r7, r0)
            int r0 = r6.ordinal()
            if (r0 == r3) goto L3a
            if (r0 == r2) goto L37
            r1.A0H()
        L29:
            if (r5 == 0) goto L35
            X.6vH r0 = X.EnumC153476vH.A06
        L2d:
            r1.setMediaOverlay(r0)
            r0 = 2
            X.ViewOnClickListenerC48069LPu.A00(r1, r4, r7, r8, r0)
            return
        L35:
            r0 = 0
            goto L2d
        L37:
            X.6vG r0 = X.EnumC153466vG.A08
            goto L3c
        L3a:
            X.6vG r0 = X.EnumC153466vG.A0N
        L3c:
            r1.setIcon(r0)
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45663KJa.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48310LZj.class;
    }

    public C45663KJa(C47259KuW c47259KuW, InterfaceC11380iw interfaceC11380iw, float f) {
        this.A02 = interfaceC11380iw;
        this.A01 = c47259KuW;
        this.A00 = f;
    }
}
