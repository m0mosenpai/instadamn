package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KIL extends AbstractC66412zI {
    public final C47785L8p A00;
    public final boolean A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44792JsD(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_media_item, false), this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        C47785L8p c47785L8p = this.A00;
        View A06 = AbstractC31171DnF.A06(c3oo);
        c47785L8p.A00.A04(A06);
        c47785L8p.A02.remove(A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (r1 != null) goto L18;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r10, X.C3OO r11) {
        /*
            r9 = this;
            X.KYd r10 = (X.C46015KYd) r10
            X.JsD r11 = (X.C44792JsD) r11
            r4 = 0
            X.AbstractC167007dF.A1K(r10, r11)
            X.L8p r1 = r9.A00
            android.view.View r0 = X.AbstractC31171DnF.A06(r11)
            r1.A01(r0, r10)
            X.1qM r3 = r10.A00
            boolean r0 = r3.A5O()
            if (r0 == 0) goto L20
            X.1qM r3 = r3.A1e(r4)
            if (r3 != 0) goto L20
        L1f:
            return
        L20:
            com.instagram.common.ui.base.IgTextView r8 = r11.A02
            boolean r0 = r10.A03
            r0 = r0 ^ 1
            r5 = 8
            int r0 = X.AbstractC167007dF.A05(r0)
            r8.setVisibility(r0)
            android.content.Context r7 = X.AbstractC31172DnG.A05(r11)
            r6 = 2131966781(0x7f133b3d, float:1.957041E38)
            int r0 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.content.res.Resources r1 = X.AbstractC166997dE.A0M(r7)
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = X.C84963qk.A04(r1, r2, r0, r4, r4)
            X.AbstractC31177DnL.A0r(r7, r8, r0, r6)
            boolean r0 = r10.A04
            if (r0 == 0) goto Lc6
            X.0do r0 = r11.A07
            int r6 = X.AbstractC167027dH.A01(r0)
        L53:
            android.view.View r2 = r11.itemView
            r1 = -2
            X.2iJ r0 = new X.2iJ
            r0.<init>(r6, r1)
            r2.setLayoutParams(r0)
            com.instagram.igds.components.imagebutton.IgImageButton r2 = r11.A05
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r7 = r11.A04
            int r6 = r7.getChildCount()
            r1 = 2
            r0 = 8
            if (r6 != r1) goto L6c
            r0 = 0
        L6c:
            r2.setVisibility(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.A00 = r0
            boolean r0 = r3.A4w()
            if (r0 == 0) goto Lbb
            android.net.Uri r1 = r3.A05
            if (r1 == 0) goto L87
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.AbstractC81033jX.A00(r1, r0, r0)
        L82:
            X.0iw r0 = r11.A01
            r2.setUrl(r1, r0)
        L87:
            boolean r0 = r10.A02
            if (r0 == 0) goto Lb5
            boolean r0 = r3.Cff()
            if (r0 == 0) goto Lb5
            boolean r0 = r3.A4g()
            if (r0 == 0) goto Lb5
            X.2iX r0 = r11.A03
            r0.setVisibility(r4)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r1 = r11.A06
            X.LOz r0 = new X.LOz
            r0.<init>(r4, r10, r3)
            X.C0fQ.A00(r0, r1)
        La6:
            boolean r0 = r11.A08
            if (r0 != 0) goto L1f
            r1 = 17
            X.OkA r0 = new X.OkA
            r0.<init>(r10, r1)
            X.C0fQ.A00(r0, r2)
            return
        Lb5:
            X.2iX r0 = r11.A03
            r0.setVisibility(r5)
            goto La6
        Lbb:
            android.content.Context r0 = X.AbstractC37301Gc2.A03(r11)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r3.A1q(r0)
            if (r1 == 0) goto L87
            goto L82
        Lc6:
            int r6 = r11.A00
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIL.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C46015KYd.class;
    }

    public KIL(C47785L8p c47785L8p, boolean z) {
        this.A00 = c47785L8p;
        this.A01 = z;
    }
}
