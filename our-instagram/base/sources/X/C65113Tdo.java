package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.Tdo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65113Tdo extends C0YY implements InterfaceC16600sD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C63024Sau c63024Sau;
        String str;
        int i = this.A00;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        boolean A1a = AbstractC166987dD.A1a(obj3);
        Map map = (Map) obj4;
        boolean A1a2 = AbstractC167017dG.A1a(str2, str3);
        C14360o3.A0B(map, 3);
        boolean A1a3 = AbstractC43592JPx.A1a("PROMPTED_", A1a2 ? 1 : 0, str3);
        if (1 - i != 0) {
            if (A1a3) {
                ((C62762SPv) this.A01).A04(A1a2);
            }
            c63024Sau = (C63024Sau) this.A04;
            str = "save";
        } else {
            if (A1a3) {
                ((C62762SPv) this.A01).A04(A1a2);
            }
            c63024Sau = (C63024Sau) this.A04;
            str = "usage";
        }
        Map map2 = (Map) this.A03;
        java.util.Set set = (java.util.Set) this.A02;
        c63024Sau.A04((Bundle) this.A05, str3, str, str2, this.A06, map2, map, set, A1a);
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65113Tdo(Bundle bundle, C62762SPv c62762SPv, C63024Sau c63024Sau, String str, Map map, java.util.Set set, int i) {
        super(4);
        this.A00 = i;
        this.A01 = c62762SPv;
        this.A04 = c63024Sau;
        this.A03 = map;
        this.A02 = set;
        this.A06 = str;
        this.A05 = bundle;
    }
}
