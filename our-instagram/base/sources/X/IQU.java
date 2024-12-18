package X;

import android.content.Context;

/* loaded from: classes7.dex */
public abstract class IQU {
    public static final void A00(Context context, int i) {
        C14360o3.A0B(context, 0);
        Integer valueOf = Integer.valueOf(i);
        EnumC141996bI enumC141996bI = EnumC141996bI.A05;
        String str = null;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        if (valueOf != null) {
            str = context.getString(valueOf.intValue());
        }
        A0K.A0D = str;
        A0K.A0C = enumC141996bI;
        AbstractC31178DnM.A1S(A0K);
    }

    public static final void A01(Context context, InterfaceC58152PqH interfaceC58152PqH, String str, String str2) {
        C14360o3.A0B(str, 1);
        C146106i8 A0X = AbstractC31173DnH.A0X(str);
        if (str2 != null) {
            A0X.A09 = AbstractC25225BEi.A0t(str2);
            A0X.A03();
        }
        if (interfaceC58152PqH != null) {
            A0X.A0L = true;
            AbstractC31175DnJ.A0l(context, A0X, 2131952155);
            A0X.A0A = interfaceC58152PqH;
        }
        AbstractC31178DnM.A1S(A0X);
    }
}
