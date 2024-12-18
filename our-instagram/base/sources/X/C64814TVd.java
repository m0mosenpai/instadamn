package X;

import android.content.Context;

/* renamed from: X.TVd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64814TVd implements InterfaceC08830cm {
    public final InterfaceC08830cm A00;

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        String packageName = ((Context) this.A00.get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw AbstractC166987dD.A15("Cannot return null from a non-@Nullable @Provides method");
    }

    public C64814TVd(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
