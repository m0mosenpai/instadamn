package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.30u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C670330u implements InterfaceC669530m, InterfaceC670430v {
    public long A01;
    public C1ON A03;
    public C38321qM A04;
    public C75113Zb A05;
    public InterfaceC670130s A06;
    public Boolean A07;
    public Integer A09;
    public final Context A0C;
    public final UserSession A0D;
    public final C64452w4 A0F;
    public Integer A08 = C05F.A00;
    public int A00 = -1;
    public String A0B = "";
    public long A02 = -1;
    public String A0A = "";
    public final C670630x A0E = new C670630x(new C670530w(this));

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        return true;
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
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        C14360o3.A0B(anonymousClass320, 1);
        C14360o3.A0B(enumC37671p4, 3);
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC670430v
    public final void Cw2(AFI_TYPE afi_type, C38321qM c38321qM, C75113Zb c75113Zb, Integer num, int i) {
        AFI_TYPE afi_type2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(num, 3);
        if (SystemClock.elapsedRealtime() >= this.A01 + 1000) {
            this.A01 = SystemClock.elapsedRealtime();
            this.A09 = num;
            this.A00 = i;
            UserSession userSession = this.A0D;
            this.A07 = Boolean.valueOf(AbstractC41071vF.A0O(userSession, c38321qM));
            String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
            if (A0F == null) {
                A0F = "";
            }
            this.A0B = A0F;
            this.A0A = String.valueOf(c38321qM.A2Y());
            this.A04 = c38321qM;
            this.A05 = c75113Zb;
            String A07 = AbstractC41071vF.A07(userSession, c38321qM);
            if (A07 != null) {
                boolean A5w = c38321qM.A5w();
                this.A08 = C05F.A01;
                Integer num2 = this.A09;
                if (num2 == null) {
                    C14360o3.A0F("triggerSource");
                    throw C00O.createAndThrow();
                }
                if (num2 == C05F.A0C) {
                    afi_type2 = AFI_TYPE.A05;
                } else {
                    afi_type2 = AFI_TYPE.A0D;
                }
                C25621Ms c25621Ms = new C25621Ms(userSession, -2);
                c25621Ms.A09(C05F.A0N);
                c25621Ms.A0B("ads_feedback_interface/get/");
                c25621Ms.A0P(null, H9D.class, INe.class, false);
                c25621Ms.A9s("afi_type", afi_type2.A00);
                c25621Ms.A9s("ad_id", A07);
                c25621Ms.A0I("is_sensitive_ads", A5w);
                Context context = this.A0C;
                AbstractC23841Er.A00(context, c25621Ms, userSession, new C1CM(context), false);
                C1ON A0N = c25621Ms.A0N();
                A0N.A00 = new HGK(this.A0E);
                this.A03 = A0N;
                C1GJ.A06(A0N, 1180321215, 2, true, true);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    @Override // X.InterfaceC670430v
    public final boolean Eiv(AFI_TYPE afi_type, C38321qM c38321qM, Integer num) {
        C14360o3.A0B(num, 1);
        if (c38321qM != null) {
            UserSession userSession = this.A0D;
            if ((!AbstractC41071vF.A0O(userSession, c38321qM) || num != C05F.A0C || C18U.A06(C06090Tz.A05, userSession, 36318934945045280L)) && c38321qM.CdW() && C18U.A06(C06090Tz.A05, userSession, 36314652862319355L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
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

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return new HashSet();
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        if (this.A08 == C05F.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        throw new UnsupportedOperationException(AbstractC111324zv.A00(53));
    }

    public C670330u(Context context, UserSession userSession, C64452w4 c64452w4) {
        this.A0C = context;
        this.A0D = userSession;
        this.A0F = c64452w4;
    }

    @Override // X.InterfaceC670430v
    public final void ETV(AFI_TYPE afi_type, long j) {
        this.A02 = j;
    }
}
