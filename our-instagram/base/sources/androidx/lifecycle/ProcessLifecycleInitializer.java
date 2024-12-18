package androidx.lifecycle;

import X.AbstractC65708Tsg;
import X.C07V;
import X.C07X;
import X.C08Z;
import X.C14360o3;
import X.C16930sl;
import X.C65705Tsd;
import android.content.Context;
import androidx.startup.AppInitializer;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements C08Z {
    @Override // X.C08Z
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C07X ALO(Context context) {
        C14360o3.A0B(context, 0);
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        C14360o3.A07(appInitializer);
        if (appInitializer.A02.contains(getClass())) {
            C07V.A00(context);
            C65705Tsd c65705Tsd = C65705Tsd.A08;
            AbstractC65708Tsg.A01(context);
            return AbstractC65708Tsg.A00();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }

    @Override // X.C08Z
    public final List AOq() {
        return C16930sl.A00;
    }
}
