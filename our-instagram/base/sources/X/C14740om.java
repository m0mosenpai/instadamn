package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.0om, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14740om {
    public static final C14740om A00 = new Object();

    public static final void A03(TextView textView) {
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
        Context context = textView.getContext();
        C14360o3.A07(context);
        textView.setTextColor(new ColorStateList(iArr, new int[]{context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text))}));
    }

    public static final void A07(TabLayout tabLayout, boolean z) {
        TextView textView;
        if (C14640oc.A0E()) {
            int tabCount = tabLayout.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                C154306wf A07 = tabLayout.A07(i);
                View view = null;
                if (A07 != null) {
                    view = A07.A00();
                }
                if ((view instanceof TextView) && (textView = (TextView) view) != null) {
                    A03(textView);
                }
            }
            C14740om c14740om = A00;
            c14740om.A06(tabLayout);
            if (z) {
                tabLayout.setTabIndicatorFullWidth(false);
                c14740om.A04(tabLayout);
            } else {
                c14740om.A05(tabLayout);
            }
        }
    }

    private final void A05(TabLayout tabLayout) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = tabLayout.getContext();
        C14360o3.A07(context);
        gradientDrawable.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon)));
        gradientDrawable.setBounds(0, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
        tabLayout.setSelectedTabIndicator(gradientDrawable);
    }

    public static final int A00(TabLayout tabLayout) {
        int tabCount = tabLayout.getTabCount();
        DisplayMetrics displayMetrics = tabLayout.getContext().getResources().getDisplayMetrics();
        if (tabCount != 0) {
            return displayMetrics.widthPixels / tabLayout.getTabCount();
        }
        return displayMetrics.widthPixels;
    }

    public static final int A01(TabLayout tabLayout, int i) {
        int A002 = A00(tabLayout);
        Context context = tabLayout.getContext();
        C14360o3.A07(context);
        int A01 = A002 - ((i + AbstractC13690mv.A01(context, 20)) + AbstractC13690mv.A01(context, 20));
        if (A01 < 0) {
            A01 = 0;
        }
        return A01 / 2;
    }

    public static final Drawable A02(Drawable drawable, Drawable drawable2) {
        if (C14640oc.A0E()) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            int[] iArr = {android.R.attr.state_selected};
            if (drawable2 == null) {
                drawable2 = drawable;
            }
            stateListDrawable.addState(iArr, drawable2);
            stateListDrawable.addState(StateSet.WILD_CARD, drawable);
            return stateListDrawable;
        }
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(com.google.android.material.tabs.TabLayout r9) {
        /*
            r8 = this;
            int r0 = r9.getTabCount()
            r5 = 0
            X.17u r0 = X.C17s.A0C(r5, r0)
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb0
            r4 = r7
            X.0sg r4 = (X.AbstractC16880sg) r4
            int r0 = r4.A00()
            X.6wf r3 = r9.A07(r0)
            if (r3 == 0) goto Lab
            X.6wg r2 = r3.A04
            if (r2 != 0) goto L28
            android.view.View r2 = r3.A00()
        L28:
            android.view.View r0 = r3.A00()
            if (r0 == 0) goto La1
            r1 = 2131438608(0x7f0b2c10, float:1.8499148E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto La1
            android.view.View r0 = r3.A00()
            if (r0 == 0) goto L9f
            android.view.View r2 = r0.findViewById(r1)
            if (r2 == 0) goto L9f
        L43:
            int r0 = r2.getMeasuredWidth()
        L47:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L4b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lb5
            int r0 = r4.A00()
            X.6wf r3 = r9.A07(r0)
            if (r3 == 0) goto L9a
            X.6wg r2 = r3.A04
            if (r2 != 0) goto L63
            android.view.View r2 = r3.A00()
        L63:
            android.view.View r0 = r3.A00()
            if (r0 == 0) goto L90
            r1 = 2131438608(0x7f0b2c10, float:1.8499148E38)
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto L90
            android.view.View r0 = r3.A00()
            if (r0 == 0) goto L8e
            android.view.View r2 = r0.findViewById(r1)
            if (r2 == 0) goto L8e
        L7e:
            int r0 = r2.getMeasuredWidth()
        L82:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r6.compareTo(r1)
            if (r0 >= 0) goto L4b
            r6 = r1
            goto L4b
        L8e:
            r0 = 0
            goto L82
        L90:
            if (r2 == 0) goto L9a
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r2.measure(r0, r0)
            goto L7e
        L9a:
            int r0 = A00(r9)
            goto L82
        L9f:
            r0 = 0
            goto L47
        La1:
            if (r2 == 0) goto Lab
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r2.measure(r0, r0)
            goto L43
        Lab:
            int r0 = A00(r9)
            goto L47
        Lb0:
            int r4 = A00(r9)
            goto Lbb
        Lb5:
            if (r6 == 0) goto Lb0
            int r4 = r6.intValue()
        Lbb:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            android.content.Context r1 = r9.getContext()
            X.C14360o3.A07(r1)
            r0 = 2130970276(0x7f0406a4, float:1.7549258E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            r2.setColor(r0)
            r3 = 1
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r2}
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r5, r5, r1)
            r2.setBounds(r0)
            int r0 = A01(r9, r4)
            r2.setLayerInsetLeft(r5, r0)
            r2.setLayerInsetRight(r5, r0)
            r9.setSelectedTabIndicator(r2)
            r9.setTabIndicatorFullWidth(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14740om.A04(com.google.android.material.tabs.TabLayout):void");
    }

    private final void A06(TabLayout tabLayout) {
        Context context = tabLayout.getContext();
        C14360o3.A07(context);
        tabLayout.A0B(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text)), context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
    }
}
