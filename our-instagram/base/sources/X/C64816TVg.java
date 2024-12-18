package X;

import android.content.Context;
import com.instagram.react.impl.IgReactPackage;

/* renamed from: X.TVg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64816TVg implements InterfaceC08830cm {
    public final int A00;
    public final Object A01;

    public C64816TVg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC08830cm
    public final Object get() {
        switch (this.A00) {
            case 0:
                return AbstractC61801Rtv.A00((Context) this.A01);
            case 1:
                return AbstractC166997dE.A0b();
            default:
                return C62815SSm.A00(((IgReactPackage) this.A01).A00);
        }
    }
}
