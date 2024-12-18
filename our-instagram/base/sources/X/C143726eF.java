package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.6eF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143726eF {
    public static final C143726eF A00 = new Object();

    public static final int A01(Context context) {
        C14360o3.A0B(context, 0);
        return (AbstractC13890nF.A01(context) - ((int) (0.5625f * AbstractC84863qa.A02(context)))) / 2;
    }

    public static final int A04(Context context, C41551w4 c41551w4) {
        C14360o3.A0B(context, 0);
        if (c41551w4 != null && !A0E(context, c41551w4)) {
            return 0;
        }
        boolean A0B = A0B(context);
        int A02 = AbstractC84863qa.A02(context);
        int A01 = (int) (AbstractC13890nF.A01(context) / 0.5625f);
        if (A0B) {
            A02 -= A01;
            A01 = A03(context);
        }
        return (A02 - A01) / 2;
    }

    public static final void A05(Context context, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(context, 2);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ReelViewerMediaAspectRatioUtil.maybeAdjustLayoutBasedOnAspectRatio", 1024082962);
        }
        try {
            if (!A0E(context, c41551w4)) {
                A09(interfaceC143576dw);
            }
            if (!A0D(context, c41551w4)) {
                A07(c41551w4, interfaceC143576dw, AbstractC13890nF.A01(context));
            }
            if (A0E(context, c41551w4)) {
                A06(context, interfaceC143576dw, (int) (AbstractC13890nF.A01(context) / 0.5625f), A04(context, c41551w4));
            } else {
                RoundedCornerFrameLayout BRC = interfaceC143576dw.BRC();
                if (A0D(context, c41551w4) && BRC != null) {
                    A08(c41551w4, interfaceC143576dw, BRC, AbstractC84863qa.A02(context), A01(context));
                }
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-677621190);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-2145881162);
            }
            throw th;
        }
    }

    public static final void A08(C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, RoundedCornerFrameLayout roundedCornerFrameLayout, int i, int i2) {
        int i3;
        View view;
        int i4 = (int) (0.5625f * i);
        AbstractC13880nE.A0g(roundedCornerFrameLayout, i4);
        AbstractC13880nE.A0W(roundedCornerFrameLayout, i);
        AbstractC13880nE.A0X(roundedCornerFrameLayout, 1);
        View C9H = interfaceC143576dw.C9H();
        if (C9H != null) {
            AbstractC13880nE.A0e(C9H, i2);
            AbstractC13880nE.A0V(C9H, i2);
        }
        View findViewById = roundedCornerFrameLayout.findViewById(R.id.reel_viewer_media_container);
        if (c41551w4.A0N && findViewById != null && findViewById.getY() > 0.0f) {
            int width = (int) (i4 / (findViewById.getWidth() / findViewById.getHeight()));
            int height = findViewById.getHeight() - width;
            AbstractC13880nE.A0g(findViewById, i4);
            AbstractC13880nE.A0W(findViewById, width);
            if (c41551w4.A04 == null) {
                c41551w4.A04 = Integer.valueOf((int) findViewById.getY());
                InterfaceC56392iX C5B = interfaceC143576dw.C5B();
                if (C5B != null && (view = C5B.getView()) != null) {
                    i3 = view.getHeight();
                } else {
                    i3 = 0;
                }
                findViewById.setY(((int) findViewById.getY()) + i3 + (height / 2));
            }
        }
    }

    public static final boolean A0B(Context context) {
        C14360o3.A0B(context, 0);
        if (((int) (AbstractC13890nF.A01(context) / 0.5625f)) + A03(context) > AbstractC84863qa.A02(context)) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(Context context) {
        C14360o3.A0B(context, 0);
        if ((!A0A(context)) && AbstractC52812bN.A00) {
            return true;
        }
        return false;
    }

    public static final boolean A0D(Context context, C41551w4 c41551w4) {
        C14360o3.A0B(context, 0);
        if (A0F(c41551w4) && c41551w4.A0H.A1a && (!A0A(context))) {
            return true;
        }
        if ((!A0A(context)) && AbstractC52812bN.A00) {
            return true;
        }
        return false;
    }

    public static final boolean A0E(Context context, C41551w4 c41551w4) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(c41551w4, 1);
        if (A0F(c41551w4) && A0A(context)) {
            return true;
        }
        return false;
    }

    public static final boolean A0F(C41551w4 c41551w4) {
        List list;
        if (c41551w4.A0H.A0i()) {
            return true;
        }
        List list2 = c41551w4.A05;
        if (list2 != null) {
            AbstractC001800i.A0a(list2);
        }
        List list3 = c41551w4.A05;
        if (list3 != null) {
            list = AbstractC001800i.A0a(list3);
        } else {
            list = C16930sl.A00;
        }
        if (list.size() <= 1) {
            return true;
        }
        return false;
    }

    public static final int A00(Context context) {
        if (A0B(context)) {
            return A03(context);
        }
        return context.getResources().getDimensionPixelOffset(R.dimen.asset_picker_redesign_sticker_height);
    }

    public static final int A02(Context context) {
        return Math.min(AbstractC84863qa.A02(context), (int) (AbstractC13890nF.A01(context) / 0.5625f));
    }

    public static final int A03(Context context) {
        return context.getResources().getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen) + (context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material) * 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(android.content.Context r5, X.InterfaceC143576dw r6, int r7, int r8) {
        /*
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r4 = r6.BRC()
            if (r4 == 0) goto L34
            X.AbstractC13880nE.A0W(r4, r7)
            X.0od r0 = X.C14650od.A03
            if (r0 == 0) goto L26
            com.instagram.common.session.UserSession r3 = X.C14650od.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327026663176448(0x810f3d00013900, double:3.036696166763578E-306)
            boolean r2 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L26
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r2 != 0) goto L29
        L26:
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
        L29:
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getDimensionPixelOffset(r1)
            r4.setCornerRadius(r0)
        L34:
            X.2iX r2 = r6.C5B()
            if (r2 == 0) goto L49
            android.view.View r1 = r2.getView()
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r0 = r2.getView()
            X.AbstractC13880nE.A0W(r0, r8)
        L49:
            android.view.View r2 = r6.C9H()
            if (r2 == 0) goto L65
            int r0 = A03(r5)
            r2.setMinimumHeight(r0)
            boolean r0 = r2 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L62
            r1 = r2
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = 80
            r1.setGravity(r0)
        L62:
            X.AbstractC13880nE.A0U(r2, r8)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143726eF.A06(android.content.Context, X.6dw, int, int):void");
    }

    public static final void A07(C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw, int i) {
        View findViewById;
        RoundedCornerFrameLayout BRC = interfaceC143576dw.BRC();
        if (BRC != null) {
            BRC.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            View C9H = interfaceC143576dw.C9H();
            if (C9H != null) {
                AbstractC13880nE.A0e(C9H, 0);
                AbstractC13880nE.A0V(C9H, 0);
            }
            if (c41551w4.A04 != null && (findViewById = BRC.findViewById(R.id.reel_viewer_media_container)) != null && findViewById.findViewById(R.id.reel_viewer_texture_view) != null) {
                AbstractC13880nE.A0g(findViewById, i);
                AbstractC13880nE.A0W(findViewById, (int) (i / (findViewById.getWidth() / findViewById.getHeight())));
                findViewById.setY(r3.intValue());
                c41551w4.A04 = null;
            }
        }
    }

    public static final void A09(InterfaceC143576dw interfaceC143576dw) {
        View view;
        RoundedCornerFrameLayout BRC = interfaceC143576dw.BRC();
        if (BRC != null) {
            BRC.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        InterfaceC56392iX C5B = interfaceC143576dw.C5B();
        if (C5B != null && (view = C5B.getView()) != null) {
            view.setVisibility(8);
        }
        RoundedCornerFrameLayout BRC2 = interfaceC143576dw.BRC();
        if (BRC2 != null) {
            BRC2.setCornerRadius(0);
        }
        View C9H = interfaceC143576dw.C9H();
        if (C9H != null) {
            AbstractC13880nE.A0U(C9H, 0);
        }
    }

    public static final boolean A0A(Context context) {
        if (AbstractC13890nF.A01(context) / AbstractC84863qa.A02(context) >= 0.5625f) {
            return false;
        }
        return true;
    }

    public static final boolean A0G(C41551w4 c41551w4, int i, int i2) {
        if ((A0F(c41551w4) && c41551w4.A0H.A1a && i2 / i >= 0.5625f) || (i2 / i >= 0.5625f && AbstractC52812bN.A00)) {
            return true;
        }
        return false;
    }
}
