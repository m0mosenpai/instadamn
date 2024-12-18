package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.PSv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57056PSv implements Runnable {
    public final /* synthetic */ C56803PIu A00;
    public final /* synthetic */ InterfaceC58172Pqc A01;
    public final /* synthetic */ C51362MmN A02;

    public RunnableC57056PSv(C56803PIu c56803PIu, InterfaceC58172Pqc interfaceC58172Pqc, C51362MmN c51362MmN) {
        this.A02 = c51362MmN;
        this.A00 = c56803PIu;
        this.A01 = interfaceC58172Pqc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A02.A07;
        String str = this.A00.A0D;
        if (str != null) {
            InterfaceC58172Pqc interfaceC58172Pqc = this.A01;
            C14360o3.A0B(textView, 0);
            Context context = textView.getContext();
            Resources resources = context.getResources();
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = AbstractC53242c7.A0F(context, R.attr.igds_color_link);
            AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A07(context));
            textPaint.setTextSize(textView.getTextSize());
            CharSequence A01 = AbstractC85253rG.A01(new C57482kN(Layout.Alignment.ALIGN_NORMAL, textPaint, null, 0.0f, textView.getLineSpacingMultiplier(), textView.getMeasuredWidth(), false), "", str, context.getResources().getString(2131954794), 2, false);
            C14360o3.A07(A01);
            if (A01.equals(str)) {
                textView.setText(str);
                return;
            }
            AbstractC25227BEk.A11(textView);
            textView.setHighlightColor(0);
            SpannableStringBuilder A012 = AbstractC37300Gc1.A01();
            A012.append(A01);
            int length = A012.length();
            A012.append((CharSequence) resources.getString(2131954794));
            AbstractC37302Gc3.A0q(A012, new C52525NLu(context, resources, textView, interfaceC58172Pqc, A01, str, AbstractC31174DnI.A03(context), true), length);
            textView.setText(A012);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
