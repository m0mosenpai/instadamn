package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* loaded from: classes4.dex */
public final class AAE {
    public A9O A00;
    public A9P A01;
    public C148276lx A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final C3PF A06;
    public final IgLinearLayout A07;

    public AAE(View view, ViewGroup viewGroup, boolean z) {
        View A00;
        boolean A1V = AbstractC167007dF.A1V(view);
        if (z) {
            Context A0L = AbstractC166997dE.A0L(view);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            A00 = LayoutInflater.from(A0L).inflate(R.layout.layout_sticker_sheet_redesign_item, viewGroup, false);
            A00.setLayoutParams(layoutParams);
            A00.setFocusable(A1V);
            A00.setTag(new C210979Uu(A00));
        } else {
            A00 = ALo.A00(AbstractC166997dE.A0L(view), 1.0f, false);
        }
        this.A03 = A00;
        IgLinearLayout igLinearLayout = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.sticker_content);
        this.A07 = igLinearLayout;
        this.A05 = AbstractC167007dF.A0N(igLinearLayout, R.id.sticker_content_title);
        this.A04 = AbstractC167007dF.A0N(igLinearLayout, R.id.sticker_content_body);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A0D = A1V;
        A0s.A07 = A1V;
        this.A06 = C216559iC.A00(A0s, this, 3);
    }
}
