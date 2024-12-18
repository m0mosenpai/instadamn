package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;

/* renamed from: X.0Tn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05990Tn extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ComponentActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05990Tn(ComponentActivity componentActivity) {
        super(0);
        this.A00 = componentActivity;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final ComponentActivity componentActivity = this.A00;
        final C00M c00m = new C00M(new Runnable() { // from class: X.00C
            /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[RETURN] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r3 = this;
                    androidx.activity.ComponentActivity r0 = androidx.activity.ComponentActivity.this
                    androidx.activity.ComponentActivity.access$onBackPressed$s1027565324(r0)     // Catch: java.lang.NullPointerException -> L6 java.lang.IllegalStateException -> Le
                    goto L1d
                L6:
                    r2 = move-exception
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
                    goto L15
                Le:
                    r2 = move-exception
                    java.lang.String r1 = r2.getMessage()
                    java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
                L15:
                    boolean r0 = X.C14360o3.A0K(r1, r0)
                    if (r0 != 0) goto L1c
                    throw r2
                L1c:
                    return
                L1d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C00C.run():void");
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: X.00D
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity componentActivity2 = ComponentActivity.this;
                        C00M c00m2 = c00m;
                        C14360o3.A0B(c00m2, 1);
                        componentActivity2.addObserverForBackInvoker(c00m2);
                    }
                });
            } else {
                componentActivity.addObserverForBackInvoker(c00m);
                return c00m;
            }
        }
        return c00m;
    }
}
