package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.06C, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C06C {
    public static final void A00(Bundle bundle, Fragment fragment, String str) {
        fragment.getParentFragmentManager().A0y(str, bundle);
    }

    public static final void A01(Fragment fragment, String str, final InterfaceC16620sF interfaceC16620sF) {
        fragment.getParentFragmentManager().A0u(new C06Z() { // from class: X.0hx
            @Override // X.C06Z
            public final void DIA(String str2, Bundle bundle) {
                InterfaceC16620sF.this.invoke(str2, bundle);
            }
        }, fragment, str);
    }
}
