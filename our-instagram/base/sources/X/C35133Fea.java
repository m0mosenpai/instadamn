package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Fea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35133Fea {
    public static void A01(Context context, AbstractC12990ll abstractC12990ll, C35133Fea c35133Fea, SXK sxk, String str) {
        sxk.A02 = str;
        c35133Fea.A02(context, abstractC12990ll, new SimpleWebViewConfig(sxk));
    }

    public static final Intent A00(Context context, AbstractC12990ll abstractC12990ll, SimpleWebViewConfig simpleWebViewConfig) {
        AbstractC167017dG.A1N(context, abstractC12990ll);
        Intent intent = new Intent(context, (Class<?>) SimpleWebViewActivity.class);
        intent.putExtra(MSV.A00(2), simpleWebViewConfig);
        AbstractC31175DnJ.A0o(intent, abstractC12990ll);
        return intent;
    }

    public final void A02(Context context, AbstractC12990ll abstractC12990ll, SimpleWebViewConfig simpleWebViewConfig) {
        AbstractC167017dG.A1N(context, abstractC12990ll);
        C12260kU.A0C(context, A00(context, abstractC12990ll, simpleWebViewConfig));
    }
}
