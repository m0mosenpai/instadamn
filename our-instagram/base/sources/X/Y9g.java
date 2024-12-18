package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class Y9g implements YNX {
    @Override // X.YNX
    public final /* bridge */ /* synthetic */ Object ChF(Object obj) {
        Context context = (Context) obj;
        if (YB7.A02 == null) {
            YB7.A02 = context.getApplicationContext();
            if (YB7.A02 == null) {
                throw AbstractC166987dD.A14("An application must be set on the injector ```FbInjector.setApplication(app)``` before you can start performing injections");
            }
        }
        return new XVP(context, new XVK(YB7.A02));
    }
}
