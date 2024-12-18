package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Efr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32985Efr extends EMQ implements InterfaceC65458TkU {
    public static final String __redex_internal_original_name = "SharedEmailVerifyFragment";
    public String A00;
    public List A01;

    @Override // X.InterfaceC37221GaW
    public final EnumC33445EqI B75() {
        return null;
    }

    @Override // X.InterfaceC37221GaW
    public final EnumC31713DwI C0Q() {
        return EnumC31713DwI.A1R;
    }

    @Override // X.EMQ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-924485725);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        C18C.A07(bundle2, "Arguments in SharedEmailVerifyFragment cannot be null.");
        this.A02 = AbstractC31176DnK.A0R(this);
        this.A06 = AbstractC31173DnH.A0j(bundle2, "key_shared_email");
        this.A00 = bundle2.getString("send_source");
        C0f9.A09(-370028402, A02);
    }

    @Override // X.InterfaceC65458TkU
    public final void Dtf(List list) {
        this.A01 = list;
    }
}
