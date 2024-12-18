package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ej1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33097Ej1 extends C4A7 implements InterfaceC169507hQ, InterfaceC50482MQk {
    public C5e4 A00;
    public String A01;
    public final Context A02;
    public final UserSession A03;
    public final C36280FzX A04;
    public final InterfaceC169357h9 A05;
    public final InterfaceC169357h9 A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33097Ej1(Context context, UserSession userSession, C36280FzX c36280FzX, InterfaceC169357h9 interfaceC169357h9, InterfaceC169357h9 interfaceC169357h92) {
        super("search_interop", C4A8.A00(359266386));
        C14360o3.A0B(c36280FzX, 5);
        this.A02 = context;
        this.A03 = userSession;
        this.A06 = interfaceC169357h9;
        this.A05 = interfaceC169357h92;
        this.A04 = c36280FzX;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A08 = A0o;
        this.A0A = A0o;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A07 = A1A;
        this.A09 = A1A;
        this.A00 = null;
        this.A01 = "";
        AbstractC166987dD.A1Z(new MC2(this, null, 9), super.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        List list;
        C35040FcD c35040FcD;
        ?? A01;
        String str = this.A01;
        if (str.length() > 0) {
            InterfaceC169357h9 interfaceC169357h9 = this.A06;
            if (C14360o3.A0K(interfaceC169357h9.BjQ(), str)) {
                InterfaceC169357h9 interfaceC169357h92 = this.A05;
                if (interfaceC169357h92 == null || C14360o3.A0K(interfaceC169357h92.BjQ(), this.A01)) {
                    List A0m = AbstractC31171DnF.A0m(interfaceC169357h9);
                    if (interfaceC169357h92 != null) {
                        list = AbstractC31171DnF.A0m(interfaceC169357h92);
                    } else {
                        list = null;
                    }
                    Context context = this.A02;
                    UserSession userSession = this.A03;
                    if (A0m == null) {
                        A0m = C16930sl.A00;
                    }
                    ArrayList A012 = AbstractC31677Dvi.A01(context, userSession, A0m);
                    if (list != null && !list.isEmpty()) {
                        A012.addAll(AbstractC34197F6v.A00(userSession, list));
                    }
                    if (this.A01.length() > 0) {
                        c35040FcD = new C35040FcD(context, this.A00, userSession, C2JD.A00(userSession));
                        c35040FcD.A02(this.A01, "direct_user_search_keypressed", "direct_user_search_nullstate");
                        this.A04.A00(0, 1, 0, c35040FcD.A00(true).size());
                    } else {
                        c35040FcD = null;
                    }
                    C05A c05a = this.A08;
                    if (c35040FcD != null && (A01 = c35040FcD.A01(A012, this.A01)) != 0) {
                        A012 = A01;
                    }
                    c05a.Egh(A012);
                    AbstractC166997dE.A1Y(this.A07, true);
                }
            }
        }
    }

    @Override // X.InterfaceC50482MQk
    public final void FBt(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.A01 = str2;
        AbstractC166987dD.A1Z(new MCF(this, str, null, 25), super.A01);
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO BrB() {
        return this.A0A;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO CXg() {
        return this.A09;
    }
}
