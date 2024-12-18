package X;

import android.content.Intent;
import com.facebook.browser.iabcontext.IabCommonTrait;

/* renamed from: X.Rqt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61629Rqt {
    public static Object A00(Intent intent) {
        return intent.getParcelableExtra("EXTRA_IAB_CONTEXT", IabCommonTrait.class);
    }
}
