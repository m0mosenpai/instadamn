package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6QV, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6QV {
    public static final void A00(TextView textView) {
        C14360o3.A0B(textView, 0);
        Context context = textView.getContext();
        C14360o3.A07(context);
        textView.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0W));
    }

    public static final void A01(TextView textView) {
        C14360o3.A0B(textView, 0);
        Context context = textView.getContext();
        C14360o3.A0A(context);
        textView.setShadowLayer(AbstractC13880nE.A03(context, 1.0f), 0.0f, AbstractC13880nE.A03(context, 1.0f), context.getColor(R.color.black_25_transparent));
        textView.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0z));
    }

    public static final void A02(TextView textView) {
        C14360o3.A0B(textView, 0);
        Context context = textView.getContext();
        C14360o3.A07(context);
        textView.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0V));
    }
}
