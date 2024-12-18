package X;

import java.lang.ref.Reference;

/* renamed from: X.6Ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140906Ys {
    public final /* synthetic */ C3G7 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C140906Ys(C3G7 c3g7, String str, String str2) {
        this.A00 = c3g7;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void A00(boolean z) {
        C3G7 c3g7 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        java.util.Set<Reference> set = c3g7.A04;
        for (Reference reference : set) {
            InterfaceC147106jm interfaceC147106jm = (InterfaceC147106jm) reference.get();
            if (interfaceC147106jm == null) {
                set.remove(reference);
            } else if (z) {
                interfaceC147106jm.DSL(str, str2);
            } else {
                interfaceC147106jm.DRW(str, str2);
            }
        }
    }
}
