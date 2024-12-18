package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.6YD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YD implements InterfaceC669530m {
    public InterfaceC669830p A00 = new C669730o();
    public InterfaceC670130s A01;
    public List A02;
    public C6YE A03;
    public final UserSession A04;
    public final C6Y2 A05;
    public final InterfaceC101944i9 A06;
    public final C1PY A07;

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        C14360o3.A0B(interfaceC670130s, 0);
        C14360o3.A0B(interfaceC669830p, 1);
        C14360o3.A0B(anonymousClass320, 2);
        this.A01 = interfaceC670130s;
        this.A00 = interfaceC669830p;
        this.A02 = anonymousClass320.A03;
        C6Y2 c6y2 = this.A05;
        int i = anonymousClass320.A01;
        int i2 = c6y2.A00;
        if (i < i2) {
            i = i2;
        }
        c6y2.A00 = i;
        return false;
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
    public final boolean CUl() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
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

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return new HashSet();
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        C6Y2 c6y2 = this.A05;
        int i3 = c6y2.A00;
        if (i < i3) {
            i = i3;
        }
        c6y2.A00 = i;
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        C3HY.A00(this.A04).A01(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6YE] */
    public C6YD(final UserSession userSession, C6Y2 c6y2, InterfaceC101944i9 interfaceC101944i9, C1PY c1py) {
        this.A04 = userSession;
        this.A05 = c6y2;
        this.A07 = c1py;
        this.A06 = interfaceC101944i9;
        this.A03 = new InterfaceC669630n(userSession, this) { // from class: X.6YE
            public boolean A00;
            public final UserSession A02;
            public final C6YD A03;
            public final java.util.Set A04 = new LinkedHashSet();
            public final HashMap A01 = AbstractC06930Yk.A02(new C09530e4(AnonymousClass317.A0J, EnumC71153Hb.A0H), new C09530e4(AnonymousClass317.A08, EnumC71153Hb.A07), new C09530e4(AnonymousClass317.A0R, EnumC71153Hb.A0N));

            @Override // X.InterfaceC669630n
            public final String B5L() {
                return "stories_iaa";
            }

            @Override // X.InterfaceC669630n
            public final java.util.Set Bts() {
                if (!this.A00) {
                    java.util.Set<AnonymousClass317> keySet = this.A01.keySet();
                    C14360o3.A07(keySet);
                    for (AnonymousClass317 anonymousClass317 : keySet) {
                        java.util.Set set = this.A04;
                        C14360o3.A0A(anonymousClass317);
                        set.add(new C206209Bd(EnumC64262vl.A05, anonymousClass317, EnumC64222vh.A09));
                    }
                    this.A00 = true;
                }
                ImmutableSet A03 = ImmutableSet.A03(this.A04);
                C14360o3.A07(A03);
                return A03;
            }

            /* JADX WARN: Code restructure failed: missing block: B:120:0x021c, code lost:
            
                if (r1 != null) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x0260, code lost:
            
                if (r1 != null) goto L125;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0093. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:131:0x024c  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0289  */
            /* JADX WARN: Removed duplicated region for block: B:164:0x0401  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
            @Override // X.InterfaceC669630n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void CKM(X.C206209Bd r42, java.util.List r43) {
                /*
                    Method dump skipped, instructions count: 1054
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6YE.CKM(X.9Bd, java.util.List):void");
            }

            {
                this.A03 = this;
                this.A02 = userSession;
            }
        };
        C3HY.A00(userSession).A00(this.A03);
    }
}
