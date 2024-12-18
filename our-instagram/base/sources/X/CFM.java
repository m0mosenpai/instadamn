package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* loaded from: classes5.dex */
public abstract class CFM {
    public static final Object A00(C6FQ c6fq) {
        Context context;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            context = c6fg.A00;
        } else {
            context = null;
        }
        AbstractC12990ll A0A = C6BQ.A0A(C6BQ.A09(c6fq));
        if (context != null) {
            C63208SfC A00 = C63208SfC.A00(context);
            AbstractC166987dD.A1Z(new MCC(A00, null, 31), AbstractC167017dG.A0w(C12L.A00, 535));
            C66277U6x A01 = C66277U6x.A01("com.instagram.settings.about", AbstractC167017dG.A0r("is_managed", String.valueOf(A00.A03())));
            IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(A0A);
            igBloksScreenConfig.A0U = context.getString(2131951987);
            A01.A04(context, igBloksScreenConfig);
        }
        return null;
    }
}
