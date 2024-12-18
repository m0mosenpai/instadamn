package X;

import android.content.res.Resources;

/* renamed from: X.Sut, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63861Sut implements InterfaceC65326Ti7 {
    public final Resources A00;

    @Override // X.InterfaceC65326Ti7
    public final InterfaceC65558Tme F8B(C63729Ssj c63729Ssj, InterfaceC65558Tme interfaceC65558Tme) {
        Resources resources = this.A00;
        if (interfaceC65558Tme == null) {
            return null;
        }
        return new C63792Stm(resources, interfaceC65558Tme);
    }

    public C63861Sut(Resources resources) {
        this.A00 = resources;
    }
}
