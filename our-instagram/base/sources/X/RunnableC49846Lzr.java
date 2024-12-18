package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Lzr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49846Lzr implements Runnable {
    public final /* synthetic */ C44431Jkk A00;

    public RunnableC49846Lzr(C44431Jkk c44431Jkk) {
        this.A00 = c44431Jkk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44431Jkk c44431Jkk = this.A00;
        L3C l3c = c44431Jkk.A03;
        if (l3c != null) {
            String str = l3c.A03;
            Context context = c44431Jkk.getContext();
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            Context context2 = textView.getContext();
            AbstractC166987dD.A1O(context2, textView, AbstractC53242c7.A09(context2));
            AbstractC43592JPx.A1H(textView, -1, textView.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
            c44431Jkk.A01 = textView;
            c44431Jkk.addView(textView, 0);
            C14360o3.A07(context);
            C44410Jjq c44410Jjq = new C44410Jjq(context, c44431Jkk.A00);
            c44410Jjq.setBaseColor(l3c.A01);
            c44410Jjq.setUnselectedColor(l3c.A02);
            c44410Jjq.setTooltipText(l3c.A04);
            AbstractC43592JPx.A1H(c44410Jjq, -1, (int) ((c44431Jkk.getHeight() - JQ0.A07(c44410Jjq, R.dimen.account_group_management_clickable_width)) * l3c.A00));
            c44431Jkk.A02 = c44410Jjq;
            c44431Jkk.addView(c44410Jjq, 0);
        }
    }
}
