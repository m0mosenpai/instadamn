package X;

import android.content.Context;

/* loaded from: classes11.dex */
public abstract class V5W extends C4F4 implements InterfaceC71928XAm {
    public Integer A00;

    public abstract int A00(Context context);

    @Override // X.InterfaceC71928XAm
    public final int CFo(Context context) {
        Integer num = this.A00;
        if (num != null) {
            return num.intValue();
        }
        int A00 = A00(context);
        this.A00 = Integer.valueOf(A00);
        return A00;
    }
}
