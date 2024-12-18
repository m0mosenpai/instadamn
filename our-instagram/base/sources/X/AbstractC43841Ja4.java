package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Ja4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43841Ja4 {
    public static final View A00(View.OnClickListener onClickListener, View view, Integer num, boolean z) {
        C14360o3.A0B(num, 3);
        Integer num2 = C05F.A00;
        int i = R.id.next_button_imageview;
        if (num != num2) {
            i = R.id.next_button_textview;
        }
        View requireViewById = view.requireViewById(i);
        C14360o3.A0A(requireViewById);
        if (num != num2) {
            A02(onClickListener, (TextView) requireViewById, num, z);
            return requireViewById;
        }
        ImageView imageView = (ImageView) requireViewById;
        Resources resources = imageView.getResources();
        int i2 = 2131968535;
        if (z) {
            i2 = 2131961124;
        }
        String A0q = AbstractC166997dE.A0q(resources, i2);
        int i3 = R.drawable.instagram_arrow_right_pano_outline_24;
        if (z) {
            i3 = R.drawable.instagram_check_pano_filled_24;
        }
        imageView.setImageResource(i3);
        imageView.setContentDescription(A0q);
        C0fQ.A00(onClickListener, imageView);
        imageView.setVisibility(0);
        imageView.setEnabled(true);
        return requireViewById;
    }

    public static final Integer A01(Context context) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        int A00 = C3HB.A00(context);
        int A01 = AbstractC13890nF.A01(context);
        int A002 = AbstractC13890nF.A00(context);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        int applyDimension = (int) TypedValue.applyDimension(1, 124.0f, displayMetrics);
        int i = A00 + A01;
        boolean z = false;
        if (dimensionPixelSize + i + ((int) TypedValue.applyDimension(1, 112.0f, resources.getDisplayMetrics())) <= A002) {
            z = true;
        }
        int max = A002 / Math.max(A01, 1);
        if (z) {
            if (i + dimensionPixelSize2 + applyDimension <= A002) {
                return C05F.A00;
            }
            return C05F.A01;
        }
        if (max < 1.4f) {
            return C05F.A0N;
        }
        return C05F.A0C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r6 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.view.View.OnClickListener r3, android.widget.TextView r4, java.lang.Integer r5, boolean r6) {
        /*
            int r2 = r5.intValue()
            r0 = 2
            if (r2 == r0) goto L5f
            r0 = 3
            if (r2 == r0) goto L57
            r0 = 4
            if (r2 == r0) goto L4f
            r0 = 5
            android.content.res.Resources r1 = r4.getResources()
            if (r2 == r0) goto L19
            r0 = 2131968535(0x7f134217, float:1.9573967E38)
            if (r6 == 0) goto L1c
        L19:
            r0 = 2131961124(0x7f132524, float:1.9558936E38)
        L1c:
            java.lang.String r2 = r1.getString(r0)
            X.C14360o3.A0A(r2)
            r4.setText(r2)
            X.1QL r0 = X.C1QI.A0E()
            boolean r0 = r0.A00
            if (r0 == 0) goto L40
            android.content.Context r1 = r4.getContext()
            r0 = 2131100374(0x7f0602d6, float:1.7813128E38)
            int r0 = X.C1QI.A00(r0)
            android.content.res.ColorStateList r0 = X.C02G.A02(r1, r0)
            r4.setTextColor(r0)
        L40:
            r0 = 0
            r4.setContentDescription(r2)
            X.C0fQ.A00(r3, r4)
            r4.setVisibility(r0)
            r0 = 1
            r4.setEnabled(r0)
            return
        L4f:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131968948(0x7f1343b4, float:1.9574805E38)
            goto L1c
        L57:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131961561(0x7f1326d9, float:1.9559822E38)
            goto L1c
        L5f:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131973639(0x7f135607, float:1.958432E38)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC43841Ja4.A02(android.view.View$OnClickListener, android.widget.TextView, java.lang.Integer, boolean):void");
    }

    public static final void A03(View view) {
        Resources resources = view.getResources();
        if (A01(AbstractC166997dE.A0L(view)) == C05F.A0N) {
            AbstractC31172DnG.A1F(resources, AbstractC166997dE.A0S(view, R.id.creation_main_actions).getLayoutParams(), R.dimen.canvas_colour_wheel_offset_y);
        }
    }

    public static final boolean A04(Context context) {
        Integer A01 = A01(context);
        if (A01 != C05F.A00 && A01 != C05F.A01) {
            return false;
        }
        return true;
    }
}
