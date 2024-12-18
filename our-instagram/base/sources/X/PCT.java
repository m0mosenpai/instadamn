package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.labelbutton.LabelButton;

/* loaded from: classes9.dex */
public final class PCT implements InterfaceC57985PnV {
    public int A00;
    public int A01;
    public int A02;
    public C8QJ A03;
    public C54469O4x A04;
    public OZT A05;
    public C51904Mwm A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final Drawable A0F;
    public final Drawable A0G;
    public final Drawable A0H;
    public final Drawable A0I;
    public final Handler A0J;
    public final ViewGroup A0K;
    public final UserSession A0L;
    public final C55177Odh A0M;
    public final Runnable A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC09390do A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final InterfaceC09390do A0l;
    public final InterfaceC09390do A0m;
    public final InterfaceC09390do A0n;
    public final InterfaceC09390do A0o;
    public final InterfaceC09390do A0p;
    public final InterfaceC09390do A0q;
    public final InterfaceC09390do A0r;
    public final InterfaceC09390do A0s;
    public final InterfaceC09390do A0t;

    public /* synthetic */ PCT(Context context, ViewGroup viewGroup, UserSession userSession, C55177Odh c55177Odh) {
        C14360o3.A0B(c55177Odh, 4);
        this.A0L = userSession;
        this.A0C = context;
        this.A0K = viewGroup;
        this.A0M = c55177Odh;
        this.A0l = C57513Pfn.A00(this, 17);
        this.A0b = C57513Pfn.A00(this, 4);
        this.A0m = C57513Pfn.A00(this, 18);
        this.A0t = C57513Pfn.A00(this, 29);
        this.A0a = C57513Pfn.A00(this, 3);
        this.A0i = C57513Pfn.A00(this, 12);
        this.A0p = C57513Pfn.A00(this, 23);
        this.A0r = C57513Pfn.A00(this, 27);
        this.A0d = C57513Pfn.A00(this, 6);
        this.A0e = C57513Pfn.A00(this, 9);
        this.A0Y = C57513Pfn.A00(this, 0);
        this.A0W = C57516Pfq.A00(this, 47);
        this.A0j = C57513Pfn.A00(this, 14);
        this.A0n = C57513Pfn.A00(this, 19);
        this.A00 = -1;
        this.A0o = C57513Pfn.A00(this, 21);
        this.A0k = C57513Pfn.A00(this, 16);
        this.A0Z = C57513Pfn.A00(this, 2);
        this.A0X = C57516Pfq.A00(this, 48);
        this.A0q = C57513Pfn.A00(this, 25);
        this.A0s = C57513Pfn.A00(this, 28);
        this.A0J = AbstractC167007dF.A0J();
        this.A0N = new RunnableC56924PNr(this);
        this.A0c = C1XM.A00(C57429PeR.A00);
        this.A0F = context.getDrawable(R.drawable.instagram_microphone_outline_44);
        this.A0I = context.getDrawable(R.drawable.instagram_video_chat_outline_44);
        this.A0E = context.getDrawable(R.drawable.instagram_microphone_off_outline_44);
        this.A0H = context.getDrawable(R.drawable.instagram_video_chat_off_outline_44);
        this.A0D = context.getDrawable(R.drawable.instagram_volume_off_outline_44);
        this.A0G = context.getDrawable(R.drawable.instagram_volume_outline_44);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0g = AbstractC09440dt.A00(enumC09460dv, new C57249PbX(R.drawable.instagram_rotate_outline_44, 49, context));
        this.A0f = AbstractC09440dt.A00(enumC09460dv, new C57249PbX(R.drawable.instagram_dual_camera_pano_outline_24, 49, context));
        Context context2 = viewGroup.getContext();
        this.A0O = AbstractC166997dE.A0p(context2, 2131976748);
        this.A0P = AbstractC166997dE.A0p(context2, 2131976749);
        this.A0S = AbstractC166997dE.A0p(context2, 2131976754);
        this.A0T = AbstractC166997dE.A0p(context2, 2131976755);
        this.A0V = AbstractC166997dE.A0p(context2, 2131976662);
        this.A0U = AbstractC166997dE.A0p(context2, 2131976660);
        this.A0R = AbstractC166997dE.A0p(context2, 2131976663);
        this.A0Q = AbstractC166997dE.A0p(context2, 2131976661);
        this.A0h = C57513Pfn.A00(this, 10);
        this.A0A = true;
        this.A0B = true;
    }

    public static View A01(PCT pct) {
        return (View) pct.A0m.getValue();
    }

    public static ViewPropertyAnimator A02(ViewPropertyAnimator viewPropertyAnimator, OHL ohl, float f) {
        return viewPropertyAnimator.translationY(f).setInterpolator(ohl.A00).setDuration(300L);
    }

    public static final void A03(Drawable drawable, View view) {
        if (view instanceof LabelButton) {
            ((LabelButton) view).setImageDrawable(drawable);
        } else {
            if (!(view instanceof ImageView)) {
                return;
            }
            ((ImageView) view).setImageDrawable(drawable);
        }
    }

    public static final void A04(View view) {
        LabelButton labelButton;
        if ((view instanceof LabelButton) && (labelButton = (LabelButton) view) != null) {
            labelButton.A01.setVisibility(8);
        }
    }

    public final OZT A08() {
        OZT ozt = this.A05;
        if (ozt != null) {
            return ozt;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }

    public final void A09() {
        ViewPropertyAnimator animate;
        View A0d = AbstractC166987dD.A0d(this.A0e);
        if (A0d instanceof LabelButton) {
            animate = ((LabelButton) A0d).A00.animate();
        } else {
            animate = A0d.animate();
        }
        animate.rotationBy(-180.0f).setDuration(300L).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r4.A0F != false) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0202. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04b5  */
    @Override // X.InterfaceC57985PnV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADV(X.InterfaceC57856PlM r27) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PCT.ADV(X.PlM):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r5 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View A00(android.view.View r3, X.InterfaceC16820sZ r4, X.InterfaceC16820sZ r5, int r6) {
        /*
            android.view.View r2 = r3.findViewById(r6)
            android.content.Context r1 = r3.getContext()
            r0 = 1
            boolean r0 = X.AbstractC56862jK.A01(r1, r0)
            if (r0 == 0) goto L12
            r0 = 0
            if (r5 == 0) goto L13
        L12:
            r0 = 1
        L13:
            X.C14360o3.A0A(r2)
            X.AbstractC47101Krw.A00(r2, r4, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PCT.A00(android.view.View, X.0sZ, X.0sZ, int):android.view.View");
    }

    public static final void A05(View view, int i) {
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        } else {
            i2 = 0;
        }
        if (i2 != i) {
            AbstractC13880nE.A0V(view, i);
        }
    }

    public static final void A06(PCT pct, int i) {
        Context context;
        int i2;
        int A06;
        if (i < 320) {
            try {
                A06 = pct.A0C.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            } catch (Resources.NotFoundException unused) {
                AbstractC166987dD.A1T(C18950wb.A01, "Resource.NotFoundException when getting R.dimen.button_width_narrow", 20134884);
                context = pct.A0C;
                i2 = 40;
                A06 = AbstractC166987dD.A0C(context, i2);
                A07(pct.A0d, A06);
                A07(pct.A0W, A06);
                ((LabelButton) pct.A0j.getValue()).setSize(A06);
                A07(pct.A0e, A06);
                A07(pct.A0Y, A06);
                A07(pct.A0k, A06);
            }
        } else {
            try {
                A06 = AbstractC43594JPz.A06(pct.A0C);
            } catch (Resources.NotFoundException unused2) {
                AbstractC166987dD.A1T(C18950wb.A01, "Resource.NotFoundException when getting R.dimen.button_width", 20134884);
                context = pct.A0C;
                i2 = 48;
                A06 = AbstractC166987dD.A0C(context, i2);
                A07(pct.A0d, A06);
                A07(pct.A0W, A06);
                ((LabelButton) pct.A0j.getValue()).setSize(A06);
                A07(pct.A0e, A06);
                A07(pct.A0Y, A06);
                A07(pct.A0k, A06);
            }
        }
        A07(pct.A0d, A06);
        A07(pct.A0W, A06);
        ((LabelButton) pct.A0j.getValue()).setSize(A06);
        A07(pct.A0e, A06);
        A07(pct.A0Y, A06);
        A07(pct.A0k, A06);
    }

    public static void A07(InterfaceC09390do interfaceC09390do, int i) {
        View view = (View) interfaceC09390do.getValue();
        if (view instanceof LabelButton) {
            ((LabelButton) view).setSize(i);
        }
    }
}
