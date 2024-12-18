package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7T0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7T0 implements InterfaceC163837Ux {
    public C83693oE A00;
    public final C42201xA A01;
    public final C42201xA A02;
    public final C42201xA A03;
    public final C42201xA A04;
    public final C42201xA A05;
    public final C42201xA A06;
    public final C42201xA A07;
    public final C42201xA A08;
    public final C42201xA A09;
    public final C41761wQ A0A;
    public final Capabilities A0B;
    public final C7TT A0C;
    public final C34453FGr A0D;
    public final UserSession A0E;
    public final Capabilities A0F;
    public final InterfaceC2056098k A0G;

    @Override // X.InterfaceC163837Ux
    public final int AdZ() {
        return 0;
    }

    @Override // X.InterfaceC163837Ux
    public final List Axh() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final AnonymousClass172 BYs() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final String BYt() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final String Bj3() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final C81543kP Bj4() {
        return null;
    }

    @Override // X.InterfaceC163847Uy
    public final C80993jT BsB(boolean z) {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final int C7E(boolean z) {
        return -1;
    }

    @Override // X.InterfaceC163837Ux
    public final String C7M() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final String C7N() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final String C7q() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CPb(String str) {
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CPl() {
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CRx() {
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CUy() {
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CXo() {
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CYt(String str) {
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CaC() {
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CdS() {
        return false;
    }

    public C7T0(UserSession userSession, Capabilities capabilities, C83693oE c83693oE, InterfaceC2056098k interfaceC2056098k, boolean z) {
        MsysThreadId msysThreadId;
        Capabilities A00;
        this.A0E = userSession;
        this.A0G = interfaceC2056098k;
        this.A0B = capabilities;
        this.A00 = c83693oE;
        this.A0D = new C34453FGr(userSession);
        if (interfaceC2056098k instanceof MsysThreadId) {
            msysThreadId = (MsysThreadId) interfaceC2056098k;
        } else {
            msysThreadId = null;
        }
        boolean z2 = c83693oE != null;
        C16930sl c16930sl = C16930sl.A00;
        C7TT c7tt = new C7TT(null, null, null, null, null, null, null, null, null, null, null, null, null, new C1118752z(null, null, null, null, null, null, null, false), EnumC46982Dm.A05, msysThreadId, 0, 0, null, null, null, null, null, null, null, c16930sl, c16930sl, c16930sl, null, null, null, AbstractC06930Yk.A0E(), null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, z, false, false, false, true, z2, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A0C = c7tt;
        this.A08 = AbstractC42021ws.A01(c7tt);
        this.A06 = AbstractC42021ws.A00();
        this.A01 = AbstractC42021ws.A00();
        this.A07 = AbstractC42021ws.A00();
        this.A03 = AbstractC42021ws.A00();
        this.A02 = AbstractC42021ws.A00();
        this.A05 = AbstractC42021ws.A00();
        this.A04 = AbstractC42021ws.A00();
        this.A09 = AbstractC42021ws.A00();
        this.A0A = new C41761wQ(null);
        if (this.A0C.A0x) {
            A00 = C2054597s.A00.createWithAdditionalCapabilities(c16930sl, c16930sl);
        } else {
            A00 = A0V.A00(userSession);
        }
        this.A0F = A00;
    }

    @Override // X.InterfaceC163837Ux
    public final C160847Is AYU(Context context, C7IH c7ih, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C160847Is c160847Is = (C160847Is) this.A01.A0W();
        if (c160847Is == null) {
            return C160847Is.A0y;
        }
        return c160847Is;
    }

    @Override // X.InterfaceC163837Ux
    public final C3AY Aej() {
        C3AY c3ay;
        C160847Is c160847Is = (C160847Is) this.A01.A0W();
        if (c160847Is == null || (c3ay = c160847Is.A09) == null) {
            return new C3AY(new SimpleImageUrl(""), new SimpleImageUrl(""));
        }
        return c3ay;
    }

    @Override // X.InterfaceC163847Uy
    public final C3o9 Afi() {
        InterfaceC83733oI interfaceC83733oI;
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null && (interfaceC83733oI = c7tt.A0P) != null) {
            return AbstractC1345466e.A05(interfaceC83733oI);
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final Capabilities AlV() {
        return this.A0B;
    }

    @Override // X.InterfaceC163837Ux
    public final InterfaceC83733oI B6k() {
        C83693oE c83693oE = this.A00;
        if (c83693oE == null) {
            return CCa();
        }
        return c83693oE;
    }

    @Override // X.InterfaceC163837Ux
    public final C3o9 B6l() {
        C3o9 A05;
        C83693oE c83693oE = this.A00;
        if (c83693oE == null || (A05 = AbstractC1345466e.A05(c83693oE)) == null) {
            return B90();
        }
        return A05;
    }

    @Override // X.InterfaceC163837Ux
    public final C42221xC BJv() {
        return this.A04.A0C();
    }

    @Override // X.InterfaceC163837Ux
    public final Capabilities BNg() {
        return this.A0F;
    }

    @Override // X.InterfaceC163837Ux
    public final C83693oE BNh() {
        return this.A00;
    }

    @Override // X.InterfaceC163837Ux
    public final String C7I() {
        InterfaceC83733oI interfaceC83733oI;
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null && (interfaceC83733oI = c7tt.A0P) != null) {
            return String.valueOf(AbstractC1345466e.A03(interfaceC83733oI).A00);
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final C7TT C7W() {
        Object A0W = this.A08.A0W();
        if (A0W != null) {
            return (C7TT) A0W;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC163837Ux
    public final C42221xC C7Y() {
        return this.A08.A0C();
    }

    @Override // X.InterfaceC163837Ux
    public final DirectShareTarget C7f(Context context) {
        return (DirectShareTarget) this.A05.A0W();
    }

    @Override // X.InterfaceC163837Ux
    public final DirectThreadThemeInfo C7j() {
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null) {
            return c7tt.A0I;
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final String C7l() {
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null) {
            return c7tt.A0W;
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final /* bridge */ /* synthetic */ Map C7o() {
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final InterfaceC83733oI CCa() {
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null) {
            return c7tt.A0P;
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CTV() {
        return this.A0B.A00(EnumC2054697t.A15);
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CVY() {
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null) {
            return c7tt.A0r;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CWO() {
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null) {
            return c7tt.A0x;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CX1() {
        C7TT c7tt = (C7TT) this.A08.A0W();
        if (c7tt != null) {
            return c7tt.A0y;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CXz() {
        C45125Jxu c45125Jxu = (C45125Jxu) this.A07.A0W();
        if (c45125Jxu != null) {
            return c45125Jxu.A02;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CeQ() {
        Boolean bool = (Boolean) this.A04.A0W();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean Cf6() {
        C45125Jxu c45125Jxu = (C45125Jxu) this.A07.A0W();
        if (c45125Jxu != null) {
            return c45125Jxu.A02;
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final C2EC Co6() {
        C83693oE c83693oE = this.A00;
        if (c83693oE != null) {
            return AbstractC28761aE.A00(this.A0E).B3U(C7P4.A00(c83693oE));
        }
        return null;
    }

    @Override // X.InterfaceC163837Ux
    public final C3o9 B90() {
        C3o9 Afi = Afi();
        if (Afi != null) {
            return Afi;
        }
        throw new IllegalStateException("No value for threadId");
    }

    @Override // X.InterfaceC163837Ux
    public final Integer BAZ() {
        return C7W().A0Q;
    }

    @Override // X.InterfaceC163837Ux
    public final int BSB() {
        return BSH().size();
    }

    @Override // X.InterfaceC163837Ux
    public final List BSH() {
        List list = C7W().A0b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!C14360o3.A0K(((User) obj).getId(), this.A0E.userId)) {
                arrayList.add(obj);
            }
        }
        return AbstractC001800i.A0U(arrayList);
    }

    @Override // X.InterfaceC163837Ux
    public final Integer BuZ() {
        return C7W().A0S;
    }

    @Override // X.InterfaceC163837Ux
    public final EnumC46982Dm C4i() {
        return C7W().A0O;
    }

    @Override // X.InterfaceC163837Ux
    public final List C7U() {
        List list = C7W().A0b;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!C14360o3.A0K(obj, this.A0E.userId)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC001800i.A0U(arrayList2);
    }

    @Override // X.InterfaceC163837Ux
    public final InterfaceC83713oG C7i() {
        InterfaceC83713oG CCa = CCa();
        if (CCa == null) {
            CCa = this.A0G;
        }
        return CCa;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CM7(String str) {
        List list = C7W().A0b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((User) it.next()).getId().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CT8() {
        return CTV();
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CWI() {
        return C7W().A0w;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CXl() {
        if (AbstractC140946Yw.A03(C7i()) instanceof MsysThreadId) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CZc() {
        if (C7W().A0r || C7W().A0b.isEmpty()) {
            return false;
        }
        return ((User) C7W().A0b.get(0)).CYY();
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CaB() {
        return C7W().A1G;
    }

    @Override // X.InterfaceC163837Ux
    public final boolean CeW() {
        return AbstractC31224Do7.A03(C7W().A0b, C7W().A0r);
    }

    @Override // X.InterfaceC163837Ux
    public final boolean Eje() {
        if (!C7W().A1G && !C7W().A0w) {
            if (!AbstractC31224Do7.A03(C7W().A0b, C7W().A0r)) {
                return false;
            }
        }
        return true;
    }
}
