package X;

import android.content.Context;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.S1q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62195S1q {
    public static final CharSequence A00(Context context, String str, String str2, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        W4W w4w = new W4W();
        w4w.A01(str2);
        w4w.A01 = 2131961530;
        w4w.A03 = "[[developer_terms_token]]";
        A1E.add(new LinkParams(w4w));
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A1E);
        C14360o3.A07(copyOf);
        C60613RDi A01 = SSE.A01(context, copyOf, str, z);
        T36 t36 = new T36(context, 1);
        C14360o3.A0B(t36, 0);
        return A01.A00(t36, false);
    }
}
