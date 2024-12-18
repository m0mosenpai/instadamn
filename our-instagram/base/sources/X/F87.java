package X;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class F87 {
    public static final int A00(Context context, EnumC33418Epp enumC33418Epp) {
        EnumC33418Epp enumC33418Epp2;
        int A05 = AbstractC25227BEk.A05(enumC33418Epp, 1);
        if (A05 != 0) {
            if (A05 == 1) {
                enumC33418Epp2 = EnumC33418Epp.A06;
            } else {
                throw B4Z.A00();
            }
        } else {
            enumC33418Epp2 = EnumC33418Epp.A05;
        }
        return AbstractC53242c7.A0H(context, enumC33418Epp2.A01);
    }
}
