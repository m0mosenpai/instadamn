package X;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes8.dex */
public final class JZM {
    public static AbstractRunnableC14200nk A00;
    public static final JZM A01 = new Object();
    public static final java.util.Set A03 = AbstractC16830sb.A07("com.instagram.direct.share.handler.category.interop.text.SHARE_TARGET", "com.instagram.direct.share.handler.category.interop.image.SHARE_TARGET");
    public static final java.util.Set A04 = AbstractC16830sb.A07("com.instagram.direct.share.handler.category.text.SHARE_TARGET", "com.instagram.direct.share.handler.category.image.SHARE_TARGET");
    public static final java.util.Set A02 = AbstractC31171DnF.A0l();

    public final void A00(Context context, String str) {
        AbstractC167017dG.A1N(context, str);
        if (A02.contains(str)) {
            Looper.getMainLooper().getQueue().addIdleHandler(new LNK(context, str));
        }
    }
}
