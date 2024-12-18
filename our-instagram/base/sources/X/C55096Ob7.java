package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.SpinningGradientBorder;

/* renamed from: X.Ob7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55096Ob7 {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final UserSession A03;
    public final SpinningGradientBorder A04;
    public final Integer A05;

    private void A01(ColorStateList colorStateList, Drawable drawable, View.OnClickListener onClickListener, String str, int i) {
        TextView textView = this.A02;
        textView.setText(str);
        textView.setTextColor(colorStateList);
        SpinningGradientBorder spinningGradientBorder = this.A04;
        spinningGradientBorder.setBackground(drawable);
        spinningGradientBorder.setSpinnerState(i);
        View view = this.A01;
        C0fQ.A00(onClickListener, view);
        view.setOnLongClickListener(null);
        AbstractC56952jT.A01(view);
    }

    public final void A03(C34942FaS c34942FaS, InterfaceC58148PqD interfaceC58148PqD) {
        A04(c34942FaS, interfaceC58148PqD, 1);
    }

    public final void A04(C34942FaS c34942FaS, InterfaceC58148PqD interfaceC58148PqD, int i) {
        String string;
        ColorStateList A02;
        int i2;
        int i3;
        Integer num = this.A05;
        if (num == C05F.A0Y && i <= 1) {
            C0w9.A03("OneTapSendButtonHolder", AnonymousClass001.A07(i, "misconfigured holder. type=", "BLAST", ", numTargets="));
        }
        TextView textView = this.A02;
        int BQ4 = interfaceC58148PqD.BQ4(textView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams.width != BQ4) {
            layoutParams.width = BQ4;
            textView.setLayoutParams(layoutParams);
        }
        switch (c34942FaS.A01.intValue()) {
            case 2:
                long j = c34942FaS.A00;
                Context context = this.A00;
                A01(C02G.A02(context, AbstractC53242c7.A07(context)), null, ViewOnClickListenerC55465OkK.A00(this, interfaceC58148PqD, 24), context.getString(2131976066), 1);
                if (j <= 0) {
                    return;
                }
                this.A04.setCurrentPlayTime(j);
                return;
            case 3:
                int intValue = num.intValue();
                Context context2 = this.A00;
                Resources resources = context2.getResources();
                switch (intValue) {
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                        i3 = 2131960270;
                        string = resources.getString(i3);
                        break;
                    case 4:
                        string = AbstractC43594JPz.A0t(resources, i, 2131960440);
                        break;
                    case 5:
                        i3 = 2131952460;
                        string = resources.getString(i3);
                        break;
                    case 7:
                    case 8:
                        i3 = 2131964674;
                        string = resources.getString(i3);
                        break;
                    default:
                        i3 = 2131960520;
                        string = resources.getString(i3);
                        break;
                }
                A02 = C02G.A02(context2, AbstractC53242c7.A07(context2));
                i2 = 2;
                break;
            case 4:
                string = this.A01.getResources().getString(2131960520);
                Context context3 = this.A00;
                A02 = C02G.A02(context3, AbstractC53242c7.A09(context3));
                i2 = 0;
                break;
            case 5:
                String A00 = A00(i);
                GradientDrawable gradientDrawable = new GradientDrawable();
                Context context4 = this.A00;
                C14360o3.A0B(context4, 0);
                gradientDrawable.setColor(C1QI.A0B(context4, null));
                gradientDrawable.setCornerRadius(MSZ.A01(context4));
                A01(C02G.A02(context4, AbstractC53242c7.A0E(context4)), gradientDrawable, ViewOnClickListenerC55465OkK.A00(this, interfaceC58148PqD, 25), A00, 0);
                return;
            default:
                String A002 = A00(i);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                Context context5 = this.A00;
                C14360o3.A0B(context5, 0);
                gradientDrawable2.setColor(C1QI.A0B(context5, null));
                gradientDrawable2.setCornerRadius(MSZ.A01(context5));
                A01(C1QI.A0C(context5, null), gradientDrawable2, ViewOnClickListenerC55465OkK.A00(this, interfaceC58148PqD, 23), A002, 0);
                return;
        }
        A01(A02, null, null, string, i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private String A00(int i) {
        Resources resources;
        int i2;
        int intValue = this.A05.intValue();
        Context context = this.A00;
        switch (intValue) {
            case 1:
            case 2:
                resources = context.getResources();
                i2 = 2131973639;
                return resources.getString(i2);
            case 3:
                resources = context.getResources();
                i2 = 2131955209;
                return resources.getString(i2);
            case 4:
                return AbstractC43594JPz.A0t(context.getResources(), i, 2131960436);
            case 5:
                resources = context.getResources();
                i2 = 2131954458;
                return resources.getString(i2);
            case 6:
                resources = context.getResources();
                i2 = 2131961561;
                return resources.getString(i2);
            case 7:
            case 8:
                resources = context.getResources();
                i2 = 2131964642;
                return resources.getString(i2);
            default:
                resources = context.getResources();
                i2 = 2131973280;
                return resources.getString(i2);
        }
    }

    public final void A02() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.A00.getSystemService("accessibility");
        View view = this.A01;
        if (view.isAccessibilityFocused() && accessibilityManager != null && AbstractC56862jK.A02(accessibilityManager, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_PGO);
            obtain.setClassName(C55096Ob7.class.toString());
            obtain.getText().add(view.getContentDescription());
            obtain.setSource(view);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public final void A05(String str, Integer num) {
        String str2;
        Resources resources;
        int i;
        if (num == C05F.A0C) {
            resources = this.A00.getResources();
            i = 2131960753;
        } else {
            Integer num2 = this.A05;
            Integer num3 = C05F.A0j;
            if (num2 != num3 && (num == C05F.A0N || num == C05F.A0Y)) {
                resources = this.A00.getResources();
                i = 2131960439;
            } else if (num2 == num3) {
                if (num != C05F.A0N && num != C05F.A0Y) {
                    resources = this.A00.getResources();
                    i = 2131952426;
                } else {
                    resources = this.A00.getResources();
                    i = 2131952467;
                    if (C18U.A05(C06090Tz.A05, this.A03)) {
                        i = 2131952468;
                    }
                }
            } else if (num2 == C05F.A01) {
                resources = this.A00.getResources();
                i = 2131960471;
            } else if (num2 == C05F.A00) {
                resources = this.A00.getResources();
                i = 2131960435;
            } else {
                str2 = null;
                this.A01.setContentDescription(str2);
            }
        }
        str2 = AbstractC166997dE.A0r(resources, str, i);
        this.A01.setContentDescription(str2);
    }

    public C55096Ob7(View view, UserSession userSession, Integer num) {
        this.A01 = view.requireViewById(R.id.one_tap_send_button_container);
        SpinningGradientBorder spinningGradientBorder = (SpinningGradientBorder) view.requireViewById(R.id.one_tap_send_button_spinning_gradient_border);
        this.A04 = spinningGradientBorder;
        this.A02 = AbstractC166997dE.A0T(spinningGradientBorder, R.id.selectable_user_row_send_button_text_view);
        this.A05 = num;
        this.A00 = view.getContext();
        this.A03 = userSession;
    }
}
