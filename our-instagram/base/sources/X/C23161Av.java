package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.1Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23161Av extends AbstractC23171Aw {
    public static C23161Av A01;
    public final C23191Ay A00;

    @Override // X.InterfaceC23181Ax
    public final String Bqg() {
        return null;
    }

    public static C23161Av A00(Context context) {
        C23161Av c23161Av = A01;
        if (c23161Av == null) {
            C23161Av c23161Av2 = new C23161Av(context.getApplicationContext());
            A01 = c23161Av2;
            return c23161Av2;
        }
        return c23161Av;
    }

    @Override // X.AbstractC23171Aw
    public final C23191Ay A01() {
        return this.A00;
    }

    public C23161Av(Context context) {
        C23191Ay c23191Ay;
        synchronized (C23191Ay.class) {
            c23191Ay = C23191Ay.A03;
            if (c23191Ay == null) {
                c23191Ay = new C23191Ay(context);
                C23191Ay.A03 = c23191Ay;
            }
        }
        this.A00 = c23191Ay;
    }

    @Override // X.AbstractC23171Aw, X.InterfaceC23181Ax
    public final File CHo(C1MG c1mg, int i) {
        C1B0 A02 = AbstractC23201Az.A02(i);
        if (A02 != null && A02.A00) {
            throw new IllegalArgumentException("Cannot use scoped paths with ContextCask");
        }
        return super.CHo(c1mg, i);
    }
}
