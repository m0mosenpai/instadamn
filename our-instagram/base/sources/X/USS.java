package X;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class USS extends AbstractC69781VvI {
    public final Vh9 A00;
    public final Handler A01;
    public final C68683VaJ A02;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Tc, java.lang.Object] */
    public USS(Context context, C69406Vmq c69406Vmq) {
        super(context, c69406Vmq, "neon_android_store");
        this.A01 = AbstractC167007dF.A0J();
        Context context2 = c69406Vmq.A02.A00;
        AtomicReference atomicReference = VYE.A00.A00;
        Object obj = atomicReference.get();
        if (obj == null) {
            context2 = context2 instanceof Application ? context2 : context2.getApplicationContext();
            C14360o3.A0B(context2, 0);
            C70460WWx c70460WWx = C70460WWx.A00;
            ?? obj2 = new Object();
            obj2.A00 = c70460WWx;
            obj = new Vh9(new SIE(context2.getContentResolver(), context2, obj2, new C1Ro(context2, context2.getPackageManager())));
            if (!C1EM.A00(null, obj, atomicReference)) {
                obj = atomicReference.get();
                obj.getClass();
            }
        }
        this.A00 = (Vh9) obj;
        this.A02 = new C68683VaJ(this);
    }
}
