package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7G7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7G7 implements InterfaceC160017Fn {
    public Integer A00;
    public final View A01;
    public final ViewGroup A02;
    public final FrameLayout A03;
    public final UserSession A04;
    public final InterfaceC160057Fr A05;
    public final InterfaceC160077Ft A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC16820sZ A0A;
    public final C7FM A0B;
    public final InterfaceC16820sZ A0C;

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    @Override // X.InterfaceC160017Fn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cnr(java.lang.Integer r11, boolean r12) {
        /*
            r10 = this;
            r4 = 0
            X.C14360o3.A0B(r11, r4)
            java.lang.Integer r2 = r10.A00
            if (r11 == r2) goto L1d
            int r6 = r11.intValue()
            r5 = 1
            r0 = 3
            if (r6 != r0) goto L26
            java.lang.Integer r0 = X.C05F.A0Y
            if (r2 != r0) goto L1e
            android.view.ViewGroup r1 = r10.A02
            r0 = 8
            r1.setVisibility(r0)
        L1b:
            r10.A00 = r11
        L1d:
            return
        L1e:
            android.view.View r1 = r10.A01
            android.view.ViewGroup r0 = r10.A02
            X.AbstractC1577376h.A01(r1, r0, r4)
            goto L1b
        L26:
            java.lang.Integer r0 = X.C05F.A0N
            if (r2 != r0) goto L31
            android.view.View r1 = r10.A01
            android.view.ViewGroup r0 = r10.A02
            X.AbstractC1577376h.A01(r1, r0, r5)
        L31:
            com.instagram.common.session.UserSession r9 = r10.A04
            android.view.View r3 = r10.A00(r11)
            android.view.View r2 = r10.A00(r2)
            android.view.ViewGroup r8 = r10.A02
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36320476837978649(0x81094800002219, double:3.032554030934461E-306)
            boolean r0 = X.C18U.A06(r7, r9, r0)
            if (r0 == 0) goto La7
            r0 = 36320476838437407(0x8109480007221f, double:3.0325540312245814E-306)
            boolean r0 = X.C18U.A06(r7, r9, r0)
            if (r0 == 0) goto La7
            if (r8 == 0) goto L88
            X.5le r7 = X.AbstractC125325le.A01(r8, r5)
            r7.A0G()
            r0 = 140(0x8c, double:6.9E-322)
            X.5le r8 = r7.A0C(r0)
            r7 = 1064849900(0x3f7851ec, float:0.97)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A0U(r7, r1, r0)
            r8.A0V(r7, r1, r0)
            r8.A03 = r4
            r1 = 1092616192(0x41200000, float:10.0)
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>(r1)
            X.5le r1 = r8.A0D(r0)
            X.7CN r0 = new X.7CN
            r0.<init>()
            r1.A06 = r0
        L85:
            r1.A0H()
        L88:
            X.7FM r2 = r10.A0B
            switch(r6) {
                case 0: goto L95;
                case 1: goto La4;
                case 2: goto L9b;
                case 3: goto L8d;
                case 4: goto L8d;
                case 5: goto L9e;
                case 6: goto L98;
                case 7: goto La1;
                default: goto L8d;
            }
        L8d:
            X.7GX r1 = X.C7GX.A0E
        L8f:
            X.7GY r0 = X.C7GY.A04
            r2.A00(r0, r1, r5)
            goto L1b
        L95:
            X.7GX r1 = X.C7GX.A03
            goto L8f
        L98:
            X.7GX r1 = X.C7GX.A0D
            goto L8f
        L9b:
            X.7GX r1 = X.C7GX.A0R
            goto L8f
        L9e:
            X.7GX r1 = X.C7GX.A0T
            goto L8f
        La1:
            X.7GX r1 = X.C7GX.A07
            goto L8f
        La4:
            X.7GX r1 = X.C7GX.A0Q
            goto L8f
        La7:
            boolean r0 = X.C14360o3.A0K(r3, r2)
            if (r0 != 0) goto Ldb
            if (r3 == 0) goto Lb2
            X.AbstractC1577376h.A00(r3)
        Lb2:
            if (r2 == 0) goto L88
            X.5le r4 = X.AbstractC125325le.A01(r2, r4)
            r4.A0G()
            r1 = 1062836634(0x3f59999a, float:0.85)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A0P(r1, r0)
            r4.A0Q(r1, r0)
            r0 = 8
            r4.A03 = r0
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            X.2hf r0 = X.C55942hf.A04(r2, r0)
            X.5le r0 = r4.A0E(r0)
            X.5le r1 = r0.A0F(r5)
            goto L85
        Ldb:
            if (r3 == 0) goto L88
            X.AbstractC1577376h.A00(r3)
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7G7.Cnr(java.lang.Integer, boolean):void");
    }

    @Override // X.InterfaceC160017Fn
    public final void FCA(Boolean bool, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        InterfaceC09390do interfaceC09390do = this.A09;
        InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) interfaceC09390do.getValue();
        FrameLayout frameLayout = this.A03;
        int intValue = ((Number) this.A0A.invoke()).intValue();
        C14360o3.A0B(interfaceC56392iX, 0);
        ImageView imageView = (ImageView) interfaceC56392iX.getView();
        AbstractC160187Ge.A02(imageView, R.drawable.instagram_photo_gen_ai_pano_outline_24, true);
        AbstractC160187Ge.A01(frameLayout, imageView, null, intValue, false, true);
        C0fQ.A00(new ViewOnClickListenerC23207AQr(interfaceC16820sZ), ((InterfaceC56392iX) interfaceC09390do.getValue()).getView());
    }

    @Override // X.InterfaceC160017Fn
    public final void FCB(C7F3 c7f3, Boolean bool, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        boolean z2;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        InterfaceC09390do interfaceC09390do = this.A09;
        InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) interfaceC09390do.getValue();
        FrameLayout frameLayout = this.A03;
        int intValue = ((Number) this.A0A.invoke()).intValue();
        C14360o3.A0B(interfaceC56392iX, 0);
        ImageView imageView = (ImageView) interfaceC56392iX.getView();
        AbstractC160187Ge.A02(imageView, R.drawable.instagram_edit_ai_pano_outline_24, true);
        AbstractC160187Ge.A01(frameLayout, imageView, null, intValue, false, true);
        C0fQ.A00(new LPO(c7f3, str, interfaceC16820sZ, z2, z), ((InterfaceC56392iX) interfaceC09390do.getValue()).getView());
    }

    @Override // X.InterfaceC160017Fn
    public final void FCC(boolean z, InterfaceC16820sZ interfaceC16820sZ) {
        C3PR c3pr;
        int[] iArr;
        UserSession userSession = this.A04;
        InterfaceC09390do interfaceC09390do = this.A09;
        InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) interfaceC09390do.getValue();
        FrameLayout frameLayout = this.A03;
        int intValue = ((Number) this.A0A.invoke()).intValue();
        C7IK c7ik = (C7IK) this.A0C.invoke();
        C14360o3.A0B(interfaceC56392iX, 1);
        ImageView imageView = (ImageView) interfaceC56392iX.getView();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36320030161772466L);
        int i = R.drawable.direct_search_sticker_icon;
        if (A06) {
            i = R.drawable.direct_bolt_sticker_icon;
        }
        if (C18U.A06(c06090Tz, userSession, 36320476837978649L) && C18U.A06(c06090Tz, userSession, 36320476838306333L)) {
            C14360o3.A0B(imageView, 0);
            Context context = imageView.getContext();
            Drawable drawable = context.getDrawable(i);
            if (drawable != null) {
                if (c7ik != null && (iArr = c7ik.A0K) != null && iArr.length == 0) {
                    drawable.setColorFilter(AbstractC53242c7.A0F(context, R.attr.cyanBubbleBackground), PorterDuff.Mode.SRC_IN);
                    imageView.setImageDrawable(drawable);
                } else if ((drawable instanceof C3PR) && (c3pr = (C3PR) drawable) != null) {
                    c3pr.A01(new C23695AeU(imageView));
                }
            }
        } else {
            AbstractC160187Ge.A02(imageView, i, false);
        }
        AbstractC160187Ge.A01(frameLayout, imageView, c7ik, intValue, false, false);
        C0fQ.A00(new ViewOnClickListenerC23208AQs(interfaceC16820sZ), ((InterfaceC56392iX) interfaceC09390do.getValue()).getView());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e9  */
    @Override // X.InterfaceC160017Fn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FCD(X.C9CH r37, X.C148286ly r38, com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r39, X.InterfaceC16820sZ r40) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7G7.FCD(X.9CH, X.6ly, com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController, X.0sZ):void");
    }

    public C7G7(View view, View view2, FrameLayout frameLayout, UserSession userSession, InterfaceC160057Fr interfaceC160057Fr, InterfaceC160077Ft interfaceC160077Ft, C7FM c7fm, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A04 = userSession;
        this.A01 = view;
        this.A03 = frameLayout;
        this.A0A = interfaceC16820sZ;
        this.A0C = interfaceC16820sZ2;
        this.A0B = c7fm;
        this.A06 = interfaceC160077Ft;
        this.A05 = interfaceC160057Fr;
        View requireViewById = view2.requireViewById(R.id.row_thread_composer_shortcut_viewgroup);
        C14360o3.A07(requireViewById);
        this.A02 = (ViewGroup) requireViewById;
        this.A07 = C1XM.A00(new C206819Dm(this, 38));
        this.A08 = C1XM.A00(new C206819Dm(this, 39));
        this.A09 = C1XM.A00(new C206819Dm(view2, 40));
        this.A00 = C05F.A0Y;
    }

    private final View A00(Integer num) {
        InterfaceC09390do interfaceC09390do;
        switch (num.intValue()) {
            case 0:
                interfaceC09390do = this.A07;
                break;
            case 1:
            case 2:
            case 5:
            case 7:
                return ((InterfaceC56392iX) this.A09.getValue()).getView();
            case 3:
            case 4:
            default:
                return null;
            case 6:
                interfaceC09390do = this.A08;
                break;
        }
        return (View) interfaceC09390do.getValue();
    }
}
