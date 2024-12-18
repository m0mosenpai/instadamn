package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KI6 extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC50458MPm A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44665JqA(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_store_sticker_tray_item, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oO, java.lang.Object] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r29, X.C3OO r30) {
        /*
            r28 = this;
            r7 = r30
            r8 = r29
            X.Jzj r8 = (X.C45203Jzj) r8
            X.JqA r7 = (X.C44665JqA) r7
            r9 = 0
            boolean r6 = X.AbstractC167007dF.A1R(r9, r8, r7)
            r0 = r28
            com.instagram.common.session.UserSession r5 = r0.A01
            X.0iw r12 = r0.A00
            com.instagram.model.direct.stickerstore.DirectStoreSticker r4 = r8.A02
            X.Mta r15 = r8.A01
            X.MPm r10 = r0.A02
            X.C14360o3.A0B(r5, r9)
            X.C14360o3.A0B(r12, r6)
            X.AbstractC43594JPz.A1P(r4, r10)
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r3 = r7.A00
            android.content.Context r2 = r3.getContext()
            com.instagram.model.direct.stickerstore.TypedImageUrl r11 = r4.A01
            if (r11 != 0) goto L2e
            com.instagram.model.direct.stickerstore.TypedImageUrl r11 = r4.A00
        L2e:
            X.0oO r1 = new X.0oO
            r1.<init>()
            boolean r0 = r11.A02
            if (r0 == 0) goto Lbd
            X.C14360o3.A0A(r2)
            boolean r0 = X.AbstractC80313iL.A00(r2)
            if (r0 != 0) goto Lbd
            com.instagram.common.typedurl.ImageUrl r0 = r11.A00
            java.lang.String r12 = r4.A04
            java.lang.String r21 = X.AbstractC43592JPx.A0w(r0)
            int r0 = X.AbstractC43594JPz.A04(r2)
            float r11 = (float) r0
            android.content.res.Resources r13 = r2.getResources()
            r0 = 2131165316(0x7f070084, float:1.7944846E38)
            int r14 = r13.getDimensionPixelSize(r0)
            r13 = 1053609165(0x3ecccccd, float:0.4)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.74V r19 = X.C74U.A01(r2, r13, r0, r14)
            r0 = 2130971278(0x7f040a8e, float:1.755129E38)
            int r25 = X.AbstractC167007dF.A09(r2, r0)
            r0 = 2130971277(0x7f040a8d, float:1.7551288E38)
            int r26 = X.AbstractC167007dF.A09(r2, r0)
            java.lang.Integer r20 = X.C05F.A01
            r23 = 0
            X.74P r0 = new X.74P
            r22 = r12
            r24 = r11
            r27 = r9
            r18 = r5
            r17 = r2
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3.setScaleType(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r7.A01
            r0.setCornerRadius(r9)
            r1.A00 = r6
        L93:
            r3.setVisibility(r9)
            java.lang.String r0 = r4.A02
            r3.setContentDescription(r0)
            X.AbstractC56952jT.A01(r3)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r7.A01
            X.3P9 r0 = X.AbstractC166987dD.A0s(r0)
            X.KKn r11 = new X.KKn
            r12 = r15
            r13 = r5
            r14 = r10
            r15 = r7
            r16 = r4
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.A04 = r11
            X.AbstractC47848LBr.A01(r5, r0)
            boolean r0 = r8.A00
            if (r0 != 0) goto Lbc
            r8.A00 = r6
        Lbc:
            return
        Lbd:
            com.instagram.common.typedurl.ImageUrl r0 = r11.A00
            r3.setUrl(r0, r12)
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KI6.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45203Jzj.class;
    }

    public KI6(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC50458MPm interfaceC50458MPm) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = interfaceC50458MPm;
    }
}
