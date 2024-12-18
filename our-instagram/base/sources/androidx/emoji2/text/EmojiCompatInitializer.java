package androidx.emoji2.text;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C07T;
import X.C07X;
import X.C08Z;
import X.C58339Pta;
import X.C58340Ptb;
import X.C58341Ptc;
import X.C65710Tsj;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public class EmojiCompatInitializer implements C08Z {
    @Override // X.C08Z
    public final /* bridge */ /* synthetic */ Object ALO(Context context) {
        Object obj;
        C58339Pta c58339Pta = new C58339Pta(context);
        C58340Ptb c58340Ptb = new C58340Ptb();
        if (C58341Ptc.A09 == null) {
            synchronized (C58341Ptc.A08) {
                if (C58341Ptc.A09 == null) {
                    C58341Ptc.A09 = new C58341Ptc(c58340Ptb, c58339Pta);
                }
            }
        }
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        synchronized (AppInitializer.A03) {
            obj = appInitializer.A01.get(ProcessLifecycleInitializer.class);
            if (obj == null) {
                obj = AppInitializer.A00(appInitializer, ProcessLifecycleInitializer.class, AbstractC166987dD.A1H());
            }
        }
        C07T lifecycle = ((C07X) obj).getLifecycle();
        lifecycle.A09(new C65710Tsj(0, this, lifecycle));
        return AbstractC166997dE.A0b();
    }

    @Override // X.C08Z
    public final List AOq() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
