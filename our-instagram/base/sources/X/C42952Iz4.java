package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iz4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42952Iz4 implements InterfaceC669530m {
    public int A00;
    public C1ON A01;
    public InterfaceC670130s A02;
    public java.util.Set A04;
    public boolean A08;
    public final Context A09;
    public final UserSession A0A;
    public final InterfaceC60442pS A0B;
    public final C31G A0C;
    public final InterfaceC61432r6 A0D;
    public final String A0E;
    public final IGR A0F;
    public final InterfaceC671231d A0G;
    public Integer A03 = C05F.A00;
    public boolean A06 = true;
    public boolean A05 = true;
    public InterfaceC669830p A07 = new C669730o();

    public C42952Iz4(Context context, UserSession userSession, IMU imu, InterfaceC60442pS interfaceC60442pS, InterfaceC671231d interfaceC671231d, C31G c31g, InterfaceC61432r6 interfaceC61432r6, String str) {
        this.A0A = userSession;
        this.A09 = context;
        this.A0E = str;
        this.A0C = c31g;
        this.A0G = interfaceC671231d;
        this.A0D = interfaceC61432r6;
        this.A0B = interfaceC60442pS;
        this.A0F = new IGR(new C42947Iyz(this, imu));
    }

    public final void A00(List list, int i) {
        String str;
        String str2;
        C14360o3.A0B(list, 0);
        this.A07.DGn(new C85633rs(null, null, null, null, null, null, null, null, list, false, false, false, false));
        Integer num = C05F.A01;
        this.A03 = num;
        InterfaceC61432r6 interfaceC61432r6 = this.A0D;
        Map AUS = interfaceC61432r6.AUS("discover/injected_chaining_explore_media/");
        this.A04 = AbstractC85703rz.A01(AUS);
        UserSession userSession = this.A0A;
        Context context = this.A09;
        InterfaceC670130s interfaceC670130s = this.A02;
        if (interfaceC670130s == null) {
            C14360o3.A0F("responseCallback");
            throw C00O.createAndThrow();
        }
        Map Bkt = interfaceC670130s.Bkt();
        boolean z = this.A05;
        String str3 = this.A0E;
        Map A00 = AbstractC85703rz.A00(AUS);
        Bkt.getClass();
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(num);
        c25621Ms.A0B("discover/injected_chaining_explore_media/");
        c25621Ms.A0I("is_first_page", z);
        c25621Ms.A9s("chaining_session_id", str3);
        c25621Ms.A0D("ad_request_index", i);
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A06 = AbstractC37301Gc2.A06(A0O);
            Iterator A16 = AbstractC166997dE.A16(Bkt);
            while (A16.hasNext()) {
                C5I4 c5i4 = (C5I4) A16.next();
                A06.A0d();
                A06.A0S("ad_id", c5i4.getId());
                A06.A0Q("position", c5i4.BIC());
                A06.A0T("is_client_inserted_ad", c5i4.CWh());
                A06.A0a();
            }
            A06.A0Z();
            A06.close();
            str = A0O.toString();
        } catch (IOException e) {
            C0K8.A07(C40599HzJ.class, AbstractC111324zv.A00(313), e, new Object[0]);
            str = null;
        }
        c25621Ms.AA6("inserted_ad_indices", str);
        try {
            StringWriter A0O2 = AbstractC37300Gc1.A0O();
            C17z A062 = AbstractC37301Gc2.A06(A0O2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A062.A0u(AbstractC166987dD.A1B(it));
            }
            A062.A0Z();
            A062.close();
            str2 = A0O2.toString();
        } catch (IOException e2) {
            C0K8.A07(C40599HzJ.class, AbstractC111324zv.A00(313), e2, new Object[0]);
            str2 = null;
        }
        c25621Ms.AA6("organic_item_ids", str2);
        c25621Ms.A0S(HAM.class, IQJ.class);
        if (!C18U.A06(C06090Tz.A05, userSession, 36330084680221363L)) {
            A00 = AbstractC85703rz.A00(interfaceC61432r6.AUS("discover/injected_chaining_explore_media/"));
        }
        if (!A00.isEmpty()) {
            Iterator A15 = AbstractC166997dE.A15(A00);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                c25621Ms.AA6(AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
            }
        }
        c25621Ms.A0R = true;
        AbstractC37301Gc2.A0t(context, c25621Ms, userSession);
        C1ON A0N = c25621Ms.A0N();
        C39030HGg.A00(A0N, this.A0F, 2);
        this.A01 = A0N;
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A06;
        java.util.Set set = this.A04;
        if (set != null) {
            interfaceC61432r6.FCF(enumC74603Ws, set);
        }
        C1ON c1on = this.A01;
        if (c1on != null) {
            C1GJ.A06(c1on, 1786782215, 2, true, true);
            this.A05 = false;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        boolean A1b = AbstractC25233BEq.A1b(interfaceC670130s, interfaceC669830p, anonymousClass320);
        this.A08 = A1b;
        this.A02 = interfaceC670130s;
        this.A07 = interfaceC669830p;
        A00(anonymousClass320.A03, 0);
        return A1b;
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
        C14360o3.A0B(anonymousClass320, 0);
        if (z) {
            C1ON c1on = this.A01;
            if (c1on != null) {
                c1on.cancel();
            }
            this.A01 = null;
        }
        A00(anonymousClass320.A03, anonymousClass320.A01);
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return AbstractC25229BEm.A1a(this.A03, C05F.A00);
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(53));
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        if (!this.A08) {
            return false;
        }
        if (i >= this.A0F.A00 && this.A03 == C05F.A00) {
            A00(this.A0G.BZU(), i);
            this.A00 = i;
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        C1ON c1on = this.A01;
        if (c1on != null) {
            c1on.cancel();
        }
        this.A01 = null;
        this.A08 = false;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        AbstractC167017dG.A1Q(anonymousClass320, enumC37671p4);
        CoL(anonymousClass320, enumC37671p4, z);
    }
}
