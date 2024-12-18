package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.FOw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34663FOw {
    public final EL2 A00(Parcelable parcelable, AbstractC12990ll abstractC12990ll, EnumC33360Eot enumC33360Eot, Integer num, String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31175DnJ.A0r(A0b, abstractC12990ll);
        A0b.putParcelable("argument_content", parcelable);
        A0b.putString("argument_flow", FWK.A00(num));
        A0b.putSerializable("argument_entry_point", enumC33360Eot);
        A0b.putSerializable("argument_selected_age_account_id", str);
        A0b.putSerializable("argument_selected_age_account_type", str2);
        A0b.putSerializable("argument_disclosure_version", EnumC33359Eos.A04);
        A0b.putSerializable("argument_force_disclosure_reading", AbstractC166997dE.A0a());
        EL2 el2 = new EL2();
        el2.setArguments(A0b);
        return el2;
    }
}
