package X;

import android.content.DialogInterface;

/* renamed from: X.WHm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnClickListenerC70208WHm implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public DialogInterfaceOnClickListenerC70208WHm(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj;
        this.A04 = str;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (2 - this.A00 != 0) {
            C14360o3.A0A(dialogInterface);
            EnumC68186VFe enumC68186VFe = (EnumC68186VFe) this.A03;
            String str = this.A04;
            InterfaceC71903X9n interfaceC71903X9n = (InterfaceC71903X9n) this.A02;
            InterfaceC71902X9m interfaceC71902X9m = (InterfaceC71902X9m) this.A01;
            int ordinal = enumC68186VFe.ordinal();
            if (ordinal != 4 && ordinal != 1) {
                if (ordinal != 3 && ordinal != 2) {
                    return;
                }
                dialogInterface.dismiss();
                if (interfaceC71903X9n == null) {
                    return;
                }
                interfaceC71903X9n.DZy();
                return;
            }
            if (str == null || interfaceC71902X9m == null) {
                return;
            }
            interfaceC71902X9m.DV8(str);
            return;
        }
        V16 v16 = (V16) this.A03;
        W6I w6i = v16.A07;
        if (w6i == null) {
            C14360o3.A0F("adsManagerLogger");
            throw C00O.createAndThrow();
        }
        w6i.A0A("ads_manager_highlights_hub", WGU.A01((VG5) this.A02), this.A04, null);
        V16.A0A(v16, (C70654Wea) this.A01, "ads_manager_highlights_hub");
    }
}
