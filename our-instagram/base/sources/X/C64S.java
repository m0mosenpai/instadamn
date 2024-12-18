package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.64S, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C64S {
    public static final void A00(TextView textView) {
        C14360o3.A0B(textView, 0);
        if (!AbstractC74463Wd.A00.contains(((AbstractC215613i) C11X.A00().A01()).A00.getConfiguration().locale.getLanguage())) {
            Integer num = C05F.A01;
            Context context = textView.getContext();
            C14360o3.A07(context);
            AbstractC14710oj.A07(context, AbstractC15960qq.A00(context).A02(EnumC15950qp.A13), textView, num);
            return;
        }
        textView.getPaint().setFakeBoldText(true);
    }
}
