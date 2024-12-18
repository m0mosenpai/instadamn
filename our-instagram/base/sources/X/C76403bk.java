package X;

import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.RIXUTextLink;
import com.instagram.clips.intf.ClipsViewerSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.3bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76403bk extends C0T6 implements InterfaceC73233Pz, InterfaceC76413bl {
    public C206309Bn A00;
    public C38688GzT A01;
    public C51757Mtg A02;
    public ClipsIFUType A03;
    public C111074zO A04;
    public C39561sd A05;
    public RIXUAspectRatio A06;
    public RIXUCoverSize A07;
    public RIXUCtaType A08;
    public RIXULayoutFormat A09;
    public RIXULayoutStyle A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final String A0S;

    public C76403bk(C111094zQ c111094zQ) {
        ArrayList arrayList;
        C111074zO c111074zO;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str = c111094zQ.A0K;
        String valueOf = String.valueOf(c111094zQ.A06);
        Integer num = c111094zQ.A0I;
        String str2 = c111094zQ.A0N;
        String str3 = c111094zQ.A0M;
        String str4 = c111094zQ.A0L;
        List list = c111094zQ.A0P;
        if (list != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RIXUTextLink) it.next()).Eyx());
            }
        } else {
            arrayList = null;
        }
        ClipsIFUType clipsIFUType = c111094zQ.A03;
        clipsIFUType = clipsIFUType == null ? ClipsIFUType.A07 : clipsIFUType;
        List list2 = c111094zQ.A0O;
        list2 = list2 == null ? C16930sl.A00 : list2;
        InterfaceC111084zP interfaceC111084zP = c111094zQ.A04;
        if (interfaceC111084zP != null) {
            c111074zO = interfaceC111084zP.Ext();
        } else {
            c111074zO = new C111074zO(null, false);
        }
        Boolean bool = c111094zQ.A0E;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Integer num2 = c111094zQ.A0J;
        Boolean bool2 = c111094zQ.A0C;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        Boolean bool3 = c111094zQ.A0F;
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        Boolean bool4 = c111094zQ.A0D;
        if (bool4 != null) {
            z4 = bool4.booleanValue();
        } else {
            z4 = false;
        }
        List list3 = c111094zQ.A0Q;
        Boolean bool5 = c111094zQ.A0G;
        if (bool5 != null) {
            z5 = bool5.booleanValue();
        } else {
            z5 = false;
        }
        Integer num3 = c111094zQ.A0H;
        InterfaceC39571se interfaceC39571se = c111094zQ.A05;
        C39561sd Eyq = interfaceC39571se != null ? interfaceC39571se.Eyq() : null;
        RIXUCoverSize rIXUCoverSize = c111094zQ.A08;
        RIXUCtaType rIXUCtaType = c111094zQ.A09;
        C38688GzT c38688GzT = c111094zQ.A01;
        RIXULayoutFormat rIXULayoutFormat = c111094zQ.A0A;
        RIXULayoutStyle rIXULayoutStyle = c111094zQ.A0B;
        RIXUAspectRatio rIXUAspectRatio = c111094zQ.A07;
        C206309Bn c206309Bn = c111094zQ.A00;
        C51757Mtg c51757Mtg = c111094zQ.A02;
        String obj = UUID.randomUUID().toString();
        Integer num4 = C05F.A00;
        C14360o3.A0B(clipsIFUType, 8);
        C14360o3.A0B(obj, 28);
        C14360o3.A0B(num4, 29);
        this.A0H = str;
        this.A0G = valueOf;
        this.A0D = num;
        this.A0F = str2;
        this.A0J = str3;
        this.A0I = str4;
        this.A0L = arrayList;
        this.A03 = clipsIFUType;
        this.A0M = list2;
        this.A04 = c111074zO;
        this.A0P = z;
        this.A0C = num2;
        this.A0N = z2;
        this.A0Q = z3;
        this.A0O = z4;
        this.A0K = list3;
        this.A0R = z5;
        this.A0B = num3;
        this.A05 = Eyq;
        this.A07 = rIXUCoverSize;
        this.A08 = rIXUCtaType;
        this.A01 = c38688GzT;
        this.A09 = rIXULayoutFormat;
        this.A0A = rIXULayoutStyle;
        this.A06 = rIXUAspectRatio;
        this.A00 = c206309Bn;
        this.A02 = c51757Mtg;
        this.A0S = obj;
        this.A0E = num4;
    }

    public final EnumC120805dQ A00() {
        Object c09540e5;
        String str = this.A0G;
        Object obj = null;
        if (str == null) {
            return null;
        }
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            C14360o3.A07(upperCase);
            c09540e5 = EnumC120805dQ.valueOf(upperCase);
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        if (!(c09540e5 instanceof C09540e5)) {
            obj = c09540e5;
        }
        return (EnumC120805dQ) obj;
    }

    public final ClipsViewerSource A01() {
        int ordinal = this.A03.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 1) {
                            return ClipsViewerSource.A2Z;
                        }
                        return ClipsViewerSource.A0u;
                    }
                    return ClipsViewerSource.A0j;
                }
                if (this.A0E == C05F.A0C) {
                    return ClipsViewerSource.A0f;
                }
                return ClipsViewerSource.A0V;
            }
            return ClipsViewerSource.A0c;
        }
        return ClipsViewerSource.A0S;
    }

    @Override // X.InterfaceC76413bl
    public final boolean AJk(C38321qM c38321qM) {
        List list = this.A0M;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C111034zF) it.next()).A00, c38321qM)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0C;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A0B;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A05;
    }

    @Override // X.InterfaceC73233Pz
    public final Integer BWa() {
        return this.A0D;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A0F;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A0C;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = this.A0H;
        if (str == null) {
            C0w9.A03("ClipsNetego", "ClipsNetego Id is null at time of getId()");
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            return obj;
        }
        return str;
    }

    public C76403bk() {
        ClipsIFUType clipsIFUType = ClipsIFUType.A07;
        C16930sl c16930sl = C16930sl.A00;
        C125905mf A00 = InterfaceC111084zP.A00.A00(false);
        A00.A00 = null;
        C111074zO A002 = A00.A00();
        String obj = UUID.randomUUID().toString();
        Integer num = C05F.A00;
        C14360o3.A0B(clipsIFUType, 8);
        C14360o3.A0B(c16930sl, 9);
        C14360o3.A0B(obj, 28);
        C14360o3.A0B(num, 29);
        this.A0H = null;
        this.A0G = null;
        this.A0D = null;
        this.A0F = null;
        this.A0J = null;
        this.A0I = null;
        this.A0L = null;
        this.A03 = clipsIFUType;
        this.A0M = c16930sl;
        this.A04 = A002;
        this.A0P = false;
        this.A0C = null;
        this.A0N = false;
        this.A0Q = false;
        this.A0O = false;
        this.A0K = null;
        this.A0R = false;
        this.A0B = null;
        this.A05 = null;
        this.A07 = null;
        this.A08 = null;
        this.A01 = null;
        this.A09 = null;
        this.A0A = null;
        this.A06 = null;
        this.A00 = null;
        this.A02 = null;
        this.A0S = obj;
        this.A0E = num;
    }
}
