package X;

import java.util.AbstractCollection;

/* renamed from: X.Ovh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56122Ovh implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final String A02;

    public static void A00(String str, String str2, String str3, AbstractCollection abstractCollection) {
        abstractCollection.add(new C56122Ovh(str, str2, str3));
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56122Ovh c56122Ovh = (C56122Ovh) obj;
        String str2 = this.A02;
        String str3 = null;
        if (c56122Ovh != null) {
            str = c56122Ovh.A02;
        } else {
            str = null;
        }
        if (AbstractC50102Ry.A00(str2, str)) {
            String str4 = this.A00;
            if (c56122Ovh != null) {
                str3 = c56122Ovh.A00;
            }
            if (AbstractC50102Ry.A00(str4, str3)) {
                return true;
            }
        }
        return false;
    }

    public C56122Ovh(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
