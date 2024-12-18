package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ej2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33098Ej2 extends C4A7 implements InterfaceC169507hQ, InterfaceC50482MQk {
    public DirectSearchResult A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public C0UO A05;
    public boolean A06;
    public final UserSession A07;
    public final C122025fu A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C0UO A0E;
    public final C0UO A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final InterfaceC169357h9 A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C0UO A0M;
    public final C0UO A0N;

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        C14360o3.A0B(interfaceC169517hR, 0);
        AbstractC166997dE.A1Y(this.A0L, false);
        LinkedHashMap A03 = AbstractC06930Yk.A03((Map) this.A0D.getValue());
        A03.put("ibc_chats_context_lines", interfaceC169517hR.Bov());
        this.A0K.Egh(A03);
    }

    @Override // X.InterfaceC50482MQk
    public final void FBt(String str) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33098Ej2(UserSession userSession, InterfaceC169357h9 interfaceC169357h9, boolean z, boolean z2, boolean z3) {
        super("search_interop", C4A8.A00(301436582));
        Boolean A0a = AbstractC166997dE.A0a();
        this.A0J = interfaceC169357h9;
        this.A07 = userSession;
        this.A0H = z;
        this.A0G = z2;
        this.A0I = z3;
        C008002u A00 = C10E.A00(null);
        this.A09 = A00;
        this.A0E = A00;
        C008002u A1H = AbstractC25225BEi.A1H(A0a);
        this.A0L = A1H;
        this.A05 = A1H;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0C = A0o;
        this.A0F = A0o;
        C008002u A0h = AbstractC31179DnN.A0h();
        this.A0K = A0h;
        this.A0D = A0h;
        C008002u A1H2 = AbstractC25225BEi.A1H(A0a);
        this.A0A = A1H2;
        this.A0M = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H("");
        this.A0B = A1H3;
        this.A0N = A1H3;
        this.A08 = AbstractC122015ft.A00(userSession);
        AbstractC166987dD.A1Z(new MC2(this, null, 10), super.A01);
    }

    public static final void A00(C33098Ej2 c33098Ej2) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List list = c33098Ej2.A03;
        if (list != null) {
            A1I.put("ibc_chats", list);
        }
        List list2 = c33098Ej2.A01;
        if (list2 != null) {
            A1I.put("agents", list2);
        }
        DirectSearchResult directSearchResult = c33098Ej2.A00;
        if (directSearchResult != null) {
            A1I.put("meta_ai_agent", directSearchResult);
        }
        List list3 = c33098Ej2.A04;
        if (list3 != null) {
            A1I.put("ai_prompts", list3);
        }
        c33098Ej2.A0K.Egh(A1I);
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO BrB() {
        return this.A0F;
    }

    @Override // X.InterfaceC50482MQk
    public final C0UO CXg() {
        return this.A0M;
    }
}
