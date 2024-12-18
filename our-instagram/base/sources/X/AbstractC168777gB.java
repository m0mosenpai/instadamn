package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.7gB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168777gB {
    public static IgFrameLayout A00(Context context, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, -2);
        IgFrameLayout igFrameLayout = new IgFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.emoji_row_item_contents, (ViewGroup) igFrameLayout, true);
        igFrameLayout.setLayoutParams(layoutParams);
        igFrameLayout.setTag(new C168757g9(igFrameLayout, i));
        return igFrameLayout;
    }

    public static IgFrameLayout A01(Context context, int i, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (z) {
            layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material));
        }
        IgFrameLayout igFrameLayout = new IgFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.emoji_row_item_contents, (ViewGroup) igFrameLayout, true);
        igFrameLayout.setLayoutParams(layoutParams);
        igFrameLayout.setTag(new C168757g9(igFrameLayout, i));
        return igFrameLayout;
    }

    public static void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C148336m3 c148336m3, C7OC c7oc, C168757g9 c168757g9) {
        A03(interfaceC11380iw, userSession, c148336m3, c7oc, c168757g9, 1.0f, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r0 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.InterfaceC11380iw r16, com.instagram.common.session.UserSession r17, X.C148336m3 r18, X.C7OC r19, X.C168757g9 r20, float r21, boolean r22) {
        /*
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L10
            r1 = 1455262663(0x56bd8bc7, float:1.0420402E14)
            java.lang.String r0 = "EmojiGridRowItemViewBinder.bindView"
            X.C0fO.A01(r0, r1)
        L10:
            r2 = r20
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r3 = r2.A08     // Catch: java.lang.Throwable -> Lbf
            android.content.Context r11 = r3.getContext()     // Catch: java.lang.Throwable -> Lbf
            android.content.res.Resources r1 = r11.getResources()     // Catch: java.lang.Throwable -> Lbf
            X.3PF r0 = r2.A06     // Catch: java.lang.Throwable -> Lbf
            r0.A02()     // Catch: java.lang.Throwable -> Lbf
            r4 = 0
            r15 = r18
            X.C14360o3.A0B(r15, r4)     // Catch: java.lang.Throwable -> Lbf
            int r0 = r15.A00     // Catch: java.lang.Throwable -> Lbf
            if (r0 >= 0) goto L2d
            r7 = -1
            goto L2f
        L2d:
            int r7 = r0 % 6
        L2f:
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch: java.lang.Throwable -> Lbf
            float r6 = (float) r0     // Catch: java.lang.Throwable -> Lbf
            android.graphics.Matrix r5 = r2.A04     // Catch: java.lang.Throwable -> Lbf
            int r0 = -r7
            float r1 = (float) r0     // Catch: java.lang.Throwable -> Lbf
            float r1 = r1 * r6
            r0 = 0
            r5.setTranslate(r1, r0)     // Catch: java.lang.Throwable -> Lbf
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> Lbf
            int r0 = r2.A03     // Catch: java.lang.Throwable -> Lbf
            r1.width = r0     // Catch: java.lang.Throwable -> Lbf
            r1.height = r0     // Catch: java.lang.Throwable -> Lbf
            r3.setLayoutParams(r1)     // Catch: java.lang.Throwable -> Lbf
            float r0 = r2.A01     // Catch: java.lang.Throwable -> Lbf
            r5.postScale(r0, r0)     // Catch: java.lang.Throwable -> Lbf
            r13 = r16
            r14 = r17
            if (r7 >= 0) goto L6a
            r0 = 0
            r3.setImageMatrix(r0)     // Catch: java.lang.Throwable -> Lbf
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.Throwable -> Lbf
            r3.setScaleType(r0)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r1 = r15.A01     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r0 = r15.A02     // Catch: java.lang.Throwable -> Lbf
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C168157fA.A00(r1, r0)     // Catch: java.lang.Throwable -> Lbf
            goto L7a
        L6a:
            r3.setImageMatrix(r5)     // Catch: java.lang.Throwable -> Lbf
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.Throwable -> Lbf
            r3.setScaleType(r0)     // Catch: java.lang.Throwable -> Lbf
            int r0 = r2.A02     // Catch: java.lang.Throwable -> Lbf
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC168787gC.A00(r14, r15, r0)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L7d
        L7a:
            r3.setUrl(r0, r13)     // Catch: java.lang.Throwable -> Lbf
        L7d:
            java.lang.String r0 = r15.A02     // Catch: java.lang.Throwable -> Lbf
            r3.setContentDescription(r0)     // Catch: java.lang.Throwable -> Lbf
            r0 = 1
            r3.setFocusable(r0)     // Catch: java.lang.Throwable -> Lbf
            r1 = 0
            r3.setVisibility(r4)     // Catch: java.lang.Throwable -> Lbf
            r18 = r22
            if (r22 == 0) goto L97
            boolean r0 = X.AbstractC170297ii.A00(r15)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L97
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r0 = r2.A07     // Catch: java.lang.Throwable -> Lbf
            goto L9b
        L97:
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r0 = r2.A07     // Catch: java.lang.Throwable -> Lbf
            r1 = 8
        L9b:
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> Lbf
            r0 = r21
            r3.setAlpha(r0)     // Catch: java.lang.Throwable -> Lbf
            android.content.res.Resources r12 = r11.getResources()     // Catch: java.lang.Throwable -> Lbf
            X.7gG r10 = new X.7gG     // Catch: java.lang.Throwable -> Lbf
            r16 = r19
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lbf
            r2.A00 = r10     // Catch: java.lang.Throwable -> Lbf
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto Lbe
            r0 = -186951077(0xfffffffff4db5a5b, float:-1.3903145E32)
            X.C0fO.A00(r0)
        Lbe:
            return
        Lbf:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto Lcc
            r0 = 1251405705(0x4a96ef89, float:4945860.5)
            X.C0fO.A00(r0)
        Lcc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC168777gB.A03(X.0iw, com.instagram.common.session.UserSession, X.6m3, X.7OC, X.7g9, float, boolean):void");
    }

    public static void A04(C168757g9 c168757g9) {
        C3PF c3pf = c168757g9.A06;
        c3pf.A02();
        c3pf.A03();
        c168757g9.A00 = null;
        c168757g9.A08.setVisibility(4);
        c168757g9.A07.setVisibility(8);
    }
}
