package X;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.Field;

/* renamed from: X.WtX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71409WtX implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C1TE A01;

    public RunnableC71409WtX(Activity activity, C1TE c1te) {
        this.A01 = c1te;
        this.A00 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Field field;
        Object obj2;
        Field field2;
        C1TE c1te = this.A01;
        C69192VjL c69192VjL = c1te.A00;
        if (c69192VjL == null) {
            c69192VjL = new C69192VjL();
            c1te.A00 = c69192VjL;
        }
        Context context = c1te.A01;
        Activity activity = this.A00;
        if (c69192VjL.A03) {
            try {
                Field field3 = c69192VjL.A02;
                if (field3 != null && (obj = field3.get(activity)) != null && (field = c69192VjL.A01) != null && (obj2 = field.get(obj)) != null && (field2 = c69192VjL.A00) != null) {
                    field2.set(obj2, context);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
