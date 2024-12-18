package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.P3p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56428P3p implements InterfaceC57951Pmx, InterfaceC57827Pkt {
    public static final C56428P3p A00 = new Object();

    @Override // X.InterfaceC57951Pmx
    public final Fragment B8N(Object obj) {
        C14360o3.A0B(obj, 0);
        C52551NMx c52551NMx = (C52551NMx) obj;
        AbstractC31173DnH.A0u();
        String str = c52551NMx.A02;
        String str2 = c52551NMx.A01;
        String str3 = c52551NMx.A00;
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(str2, str3);
        C38K c38k = new C38K();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("pages_connect_header_subtitle", str);
        A0b.putString("pages_no_admin_pages_header_string", str2);
        A0b.putString("pages_no_admin_pages_explanation_string", str3);
        c38k.setArguments(A0b);
        return c38k;
    }
}
