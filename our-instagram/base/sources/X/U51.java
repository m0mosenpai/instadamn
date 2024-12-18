package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class U51 implements C6FH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Integer A01;

    public U51(Context context, Integer num) {
        this.A00 = context;
        this.A01 = num;
    }

    @Override // X.C6FH
    public final boolean CSL() {
        Context context = this.A00;
        Integer num = this.A01;
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return AbstractC72723Nt.A00(context);
            }
            throw new RuntimeException();
        }
        return false;
    }
}
