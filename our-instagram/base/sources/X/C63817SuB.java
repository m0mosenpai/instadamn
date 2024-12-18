package X;

import android.content.res.Resources;

/* renamed from: X.SuB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63817SuB implements InterfaceC65477Tku {
    public final Resources A00;
    public final InterfaceC65477Tku A01;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        Number number = (Number) obj;
        try {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("android.resource://");
            Resources resources = this.A00;
            int intValue = number.intValue();
            A1C.append(resources.getResourcePackageName(intValue));
            A1C.append('/');
            A1C.append(resources.getResourceTypeName(intValue));
            A1C.append('/');
            android.net.Uri parse = android.net.Uri.parse(AbstractC166997dE.A0x(resources.getResourceEntryName(intValue), A1C));
            if (parse != null) {
                return this.A01.AEj(c63729Ssj, parse, i, i2);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            if (android.util.Log.isLoggable("ResourceLoader", 5)) {
                android.util.Log.w("ResourceLoader", AbstractC167017dG.A0n(number, "Received invalid resource id: ", AbstractC166987dD.A1C()), e);
                return null;
            }
            return null;
        }
    }

    public C63817SuB(Resources resources, InterfaceC65477Tku interfaceC65477Tku) {
        this.A00 = resources;
        this.A01 = interfaceC65477Tku;
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        return true;
    }
}
