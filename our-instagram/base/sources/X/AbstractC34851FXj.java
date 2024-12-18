package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.FXj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34851FXj {
    public static void A01(GHY ghy, C34957Fah c34957Fah, E1C e1c) {
        String str;
        Drawable A00;
        Drawable A002;
        int i;
        View view = e1c.itemView;
        Context context = view.getContext();
        View.OnClickListener onClickListener = ghy.A05;
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, view);
        }
        View.OnLongClickListener onLongClickListener = ghy.A06;
        if (onLongClickListener != null) {
            view.setOnLongClickListener(onLongClickListener);
        }
        if (ghy.A05 == null && ghy.A06 == null) {
            view.setClickable(false);
        } else {
            try {
                str = context.getString(ghy.A04);
            } catch (Resources.NotFoundException unused) {
                str = "";
            }
            view.setContentDescription(str);
            AbstractC56952jT.A01(view);
        }
        CharSequence charSequence = ghy.A08;
        TextView textView = e1c.A03;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setText(ghy.A04);
        }
        C18C.A0F(AbstractC167007dF.A1P(textView.getPaddingLeft(), textView.getPaddingRight()));
        textView.setCompoundDrawablePadding(AbstractC166987dD.A0C(context, 8));
        boolean z = ghy.A0B;
        int i2 = ghy.A03;
        if (z) {
            int i3 = ghy.A0D;
            A00 = AbstractC85953sP.A01(context, i2, i3);
            A002 = AbstractC85953sP.A01(context, ghy.A01, i3);
        } else {
            A00 = AbstractC85953sP.A00(context, i2);
            A002 = AbstractC85953sP.A00(context, ghy.A01);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(A00, (Drawable) null, A002, (Drawable) null);
        int i4 = ghy.A02;
        if (i4 != 0) {
            e1c.A04.setImageDrawable(AbstractC85953sP.A00(context, i4));
        }
        view.setBackgroundResource(FC0.A00(context, c34957Fah));
        if (c34957Fah.A01) {
            if (c34957Fah.A02) {
                e1c.A00.setBackgroundColor(AbstractC167007dF.A09(context, R.attr.igds_color_elevated_separator));
            }
            e1c.A00.setVisibility(0);
        } else {
            e1c.A00.setVisibility(8);
        }
        if (c34957Fah.A04) {
            textView.setGravity(17);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -1;
            textView.setLayoutParams(layoutParams);
        } else {
            textView.setGravity(19);
        }
        CheckBox checkBox = e1c.A01;
        checkBox.setVisibility(8);
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener(null);
        boolean z2 = ghy.A0A;
        textView.setTypeface(null);
        if (!z2) {
            i = ghy.A00;
        } else {
            i = ghy.A0D;
        }
        AbstractC166987dD.A1O(context, textView, i);
        textView.setAlpha(AbstractC31175DnJ.A00(ghy.A09 ? 1 : 0));
        if (ghy instanceof C33236ElV) {
            C33236ElV c33236ElV = (C33236ElV) ghy;
            FHS fhs = c33236ElV.A01;
            QPTooltipAnchor qPTooltipAnchor = c33236ElV.A00;
            C35791FrT c35791FrT = fhs.A00;
            String str2 = C35791FrT.A09;
            C33232ElR c33232ElR = c35791FrT.A05;
            C64742wY c64742wY = c33232ElR.A01;
            if (c64742wY != null) {
                c64742wY.A00(textView, qPTooltipAnchor, c33232ElR.A00);
            }
        }
        if (ghy.A07 != null) {
            TextView textView2 = e1c.A02;
            textView2.setVisibility(0);
            textView2.setText(ghy.A07);
            e1c.itemView.setLayoutParams(new LinearLayout.LayoutParams(e1c.itemView.getLayoutParams().width, -2));
            e1c.itemView.setPadding(0, 30, 0, 30);
        }
        e1c.itemView.setEnabled(ghy.A0A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, java.lang.Object, X.E1C] */
    public static E1C A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_menu_item);
        ?? c3oo = new C3OO(A0A);
        c3oo.A03 = AbstractC166997dE.A0T(A0A, R.id.row_simple_text_textview);
        c3oo.A02 = AbstractC166997dE.A0T(A0A, R.id.row_simple_text_detail);
        c3oo.A00 = A0A.requireViewById(R.id.row_divider);
        c3oo.A01 = (CheckBox) A0A.requireViewById(R.id.checkbox);
        c3oo.A04 = (IgSimpleImageView) A0A.requireViewById(R.id.row_simple_text_end);
        A0A.setTag(c3oo);
        return c3oo;
    }
}
