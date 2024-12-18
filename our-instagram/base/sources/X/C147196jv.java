package X;

import android.util.SparseArray;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6jv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147196jv implements InterfaceC147206jw {
    public SparseArray A00;
    public View A01;
    public C41181vS A02;
    public C41551w4 A03;
    public C141596ac A04;
    public C51622Yk A05;
    public String A06;
    public String A07;
    public String A08;
    public final InterfaceC11380iw A09;
    public final UserSession A0A;
    public final InterfaceC147186ju A0B;

    @Override // X.InterfaceC147206jw
    public final void DZf() {
    }

    public final void A00(boolean z, boolean z2) {
        C51622Yk c51622Yk = this.A05;
        if (c51622Yk != null && c51622Yk.isShowing()) {
            if (z2) {
                this.A05.A03 = null;
            }
            this.A05.A03(z);
            this.A05 = null;
        }
    }

    @Override // X.InterfaceC147206jw
    public final void DZe() {
        this.A0B.Dtp();
    }

    @Override // X.InterfaceC147206jw
    public final void onClick() {
        C104294ms c104294ms;
        String str;
        String str2 = this.A07;
        String str3 = this.A08;
        if (str3 != null && str2 != null) {
            View view = this.A01;
            C41551w4 c41551w4 = this.A03;
            String str4 = null;
            if (c41551w4 != null && c41551w4.A0N && view != null) {
                C71313Hs A00 = C71313Hs.A00(this.A0A);
                EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0h;
                C41181vS c41181vS = this.A02;
                if (c41181vS != null) {
                    str = c41181vS.A0k;
                } else {
                    str = null;
                }
                A00.A07(view, enumC71343Hv, new String[]{str}, 1);
            }
            this.A0B.Dtl(this.A02, this.A03, this.A04, str3, str2, this.A06);
            SparseArray sparseArray = this.A00;
            if (sparseArray != null) {
                C41181vS c41181vS2 = this.A02;
                if (c41181vS2 != null && (c104294ms = c41181vS2.A09) != null) {
                    str4 = c104294ms.getId();
                }
                UserSession userSession = this.A0A;
                InterfaceC11380iw interfaceC11380iw = this.A09;
                C14360o3.A0B(userSession, 0);
                C6PG c6pg = new C6PG("su_stories", str3, interfaceC11380iw.getModuleName());
                Object obj = sparseArray.get(1);
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                String str5 = (String) obj;
                if (str5 != null) {
                    c6pg.A04 = str5;
                }
                Object obj2 = sparseArray.get(2);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj2;
                if (str6 != null) {
                    c6pg.A07 = str6;
                }
                if (sparseArray.get(0) != null) {
                    Object obj3 = sparseArray.get(0);
                    C14360o3.A0C(obj3, "null cannot be cast to non-null type kotlin.Int");
                    c6pg.A00 = ((Number) obj3).intValue();
                }
                if (str4 != null) {
                    c6pg.A08 = str4;
                }
                new C63702ur(interfaceC11380iw, userSession).A0B(new C6PH(c6pg));
            }
        }
    }

    public C147196jv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC147186ju interfaceC147186ju) {
        this.A0A = userSession;
        this.A0B = interfaceC147186ju;
        this.A09 = interfaceC11380iw;
    }
}
