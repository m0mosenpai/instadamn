package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.Nrg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53852Nrg {
    public static final N5N A00(Parcelable parcelable, Parcelable parcelable2, InterfaceC58266PsA interfaceC58266PsA, String str) {
        AbstractC167017dG.A1N(str, parcelable);
        C14360o3.A0B(interfaceC58266PsA, 3);
        Bundle A09 = AbstractC31176DnK.A09(str);
        A09.putParcelable("GDPRPrivacyCheckFragment.ARGUMENT_BUGREPORT", parcelable);
        A09.putParcelable("GDPRPrivacyCheckFragment.ARGUMENT_COMPOSER_VIEWMODEL", parcelable2);
        A09.putAll(interfaceC58266PsA.E4I());
        N5N n5n = new N5N();
        n5n.setArguments(A09);
        return n5n;
    }
}
