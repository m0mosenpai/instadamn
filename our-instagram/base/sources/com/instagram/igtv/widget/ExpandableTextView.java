package com.instagram.igtv.widget;

import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31174DnI;
import X.AbstractC37300Gc1;
import X.AbstractC37302Gc3;
import X.AbstractC53242c7;
import X.AbstractC85253rG;
import X.AnonymousClass001;
import X.C38321qM;
import X.C57482kN;
import X.C85383rT;
import X.C85393rU;
import X.C85413rW;
import X.KXT;
import X.L0H;
import X.MNZ;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public class ExpandableTextView extends IgTextView {
    public int A00;
    public MNZ A01;
    public final L0H A02;

    public void setExpandListener(MNZ mnz) {
        this.A01 = mnz;
    }

    public void setMaxLineCount(int i) {
        this.A00 = i;
    }

    public void setTextLayoutHorizontalPadding(int i) {
        L0H l0h = this.A02;
        l0h.A00 = i;
        l0h.A01 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L0H, java.lang.Object] */
    public ExpandableTextView(Context context) {
        super(context);
        this.A02 = new Object();
        this.A00 = 2;
    }

    public void setExpandableText(String str, UserSession userSession, C38321qM c38321qM) {
        StringBuilder A1C;
        AbstractC25227BEk.A11(this);
        L0H l0h = this.A02;
        Context context = getContext();
        C57482kN c57482kN = l0h.A01;
        if (c57482kN == null) {
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            int A01 = AbstractC31174DnI.A01(context);
            int color = context.getColor(R.color.text_view_link_color);
            int color2 = context.getColor(AbstractC53242c7.A0D(context));
            Resources resources = context.getResources();
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = color;
            textPaint.bgColor = color2;
            textPaint.setTextSize(resources.getDimension(R.dimen.abc_text_size_menu_header_material));
            textPaint.setColor(A01);
            c57482kN = new C57482kN(alignment, textPaint, null, 0.0f, 1.0f, AbstractC167007dF.A0K(context).widthPixels - (l0h.A00 * 2), false);
            l0h.A01 = c57482kN;
        }
        boolean A02 = AbstractC13620mo.A02(context);
        SpannableStringBuilder A012 = AbstractC37300Gc1.A01();
        if (A02) {
            A1C = new StringBuilder("\u200f\u202a");
        } else {
            A1C = AbstractC166987dD.A1C();
        }
        A1C.append(str);
        String string = getResources().getString(2131961991);
        if (A02) {
            string = AnonymousClass001.A0R("\u200f", string);
        }
        CharSequence A013 = AbstractC85253rG.A01(c57482kN, A012, A1C, string, this.A00, false);
        if (A013.toString().equals(A1C.toString())) {
            String obj = A1C.toString();
            SpannableStringBuilder A014 = AbstractC37300Gc1.A01();
            A014.append((CharSequence) obj);
            A012 = AbstractC37300Gc1.A01();
            C85383rT c85383rT = new C85383rT(A014, userSession);
            c85383rT.A03(new C85393rU(userSession, c38321qM, true));
            c85383rT.A02(new C85413rW(userSession, c38321qM, true));
            A012.append((CharSequence) c85383rT.A00());
        } else {
            C85383rT c85383rT2 = new C85383rT(AbstractC25225BEi.A0H(A013.toString()), userSession);
            c85383rT2.A03(new C85393rU(userSession, c38321qM, true));
            c85383rT2.A02(new C85413rW(userSession, c38321qM, true));
            A012.append((CharSequence) c85383rT2.A00());
            int length = A012.length();
            A012.append((CharSequence) string);
            AbstractC37302Gc3.A0q(A012, new KXT(this, AbstractC31174DnI.A03(context)), length);
        }
        setText(A012);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L0H, java.lang.Object] */
    public ExpandableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new Object();
        this.A00 = 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L0H, java.lang.Object] */
    public ExpandableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Object();
        this.A00 = 2;
    }
}
