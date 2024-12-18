package X;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

/* renamed from: X.Vwb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69850Vwb {
    public static final C63198Sf0 A00(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i, int i2, int i3, int i4, int i5, int i6) {
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(i4);
        Integer valueOf4 = Integer.valueOf(i6);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        if (valueOf != null) {
            i9 = valueOf.intValue();
        }
        if (valueOf2 != null) {
            i7 = valueOf2.intValue();
        }
        if (valueOf3 != null) {
            i8 = valueOf3.intValue();
        }
        if (valueOf4 != null) {
            i10 = valueOf4.intValue();
        }
        return new C63198Sf0(onClickListener2, onClickListener, i7, i8, i5, i10, i3, i9);
    }

    public static final C63198Sf0 A01(Drawable drawable, EnumC68186VFe enumC68186VFe, EnumC68186VFe enumC68186VFe2, InterfaceC71902X9m interfaceC71902X9m, InterfaceC71903X9n interfaceC71903X9n, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        DialogInterfaceOnClickListenerC70208WHm dialogInterfaceOnClickListenerC70208WHm;
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(enumC68186VFe, 5);
        DialogInterfaceOnClickListenerC70208WHm dialogInterfaceOnClickListenerC70208WHm2 = new DialogInterfaceOnClickListenerC70208WHm(enumC68186VFe, interfaceC71902X9m, interfaceC71903X9n, str4, 0);
        if (enumC68186VFe2 != null) {
            dialogInterfaceOnClickListenerC70208WHm = new DialogInterfaceOnClickListenerC70208WHm(enumC68186VFe2, interfaceC71902X9m, interfaceC71903X9n, str6, 1);
        } else {
            dialogInterfaceOnClickListenerC70208WHm = null;
        }
        return new C63198Sf0(dialogInterfaceOnClickListenerC70208WHm, null, dialogInterfaceOnClickListenerC70208WHm2, drawable, str2, str5, str3, str, 0, 0, 0, 2131961305, 1, 0, 0, z);
    }
}
