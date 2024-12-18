package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BpJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26622BpJ extends AbstractC77583di {
    public final C139406Sv A00;
    public final C138746Qe A01;
    public final InterfaceC31031DkU A02;
    public final UserSession A03;
    public final C29375Cx8 A04;
    public final InterfaceC31138Dmd A05;
    public final String A06;
    public final String A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C62862tP A0C;

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0oO, java.lang.Object] */
    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C6AV c6av;
        C6AZ c6az;
        C14360o3.A0B(c77993eR, 0);
        C138746Qe c138746Qe = this.A01;
        AbstractC77183d4.A00(c77993eR, C29902DGq.A01(this, 2), new Object[]{c138746Qe});
        ?? obj = new Object();
        obj.A00 = true;
        AbstractC77183d4.A00(c77993eR, C29902DGq.A01(this, 3), new Object[]{c138746Qe});
        C1338462s c1338462s = (C1338462s) AbstractC77183d4.A00(c77993eR, new D8J(42, obj, this), new Object[]{this.A07});
        AbstractC77183d4.A00(c77993eR, new D8J(41, obj, this), new Object[]{c138746Qe});
        Object A00 = AbstractC77183d4.A00(c77993eR, C29902DGq.A01(this, 11), new Object[0]);
        C62862tP c62862tP = this.A0C;
        C14360o3.A0A(c1338462s);
        AbstractC167007dF.A1D(c62862tP, 1, c1338462s);
        C51762Yz A002 = AbstractC77073ct.A00(c77993eR, DF0.A00);
        C6FG c6fg = (C6FG) AbstractC77183d4.A00(c77993eR, C29901DGp.A00(c62862tP, c1338462s, c77993eR, A00, 44), new Object[]{c1338462s});
        AbstractC77313dH.A00(c77993eR, C29902DGq.A01(c6fg, 13), new Object[]{c6fg});
        AtomicReference atomicReference = (AtomicReference) AbstractC77183d4.A00(c77993eR, C29859DEz.A00, new Object[0]);
        BUI bui = (BUI) AbstractC77183d4.A00(c77993eR, C29858DEy.A00, new Object[0]);
        AtomicReference atomicReference2 = (AtomicReference) AbstractC77183d4.A00(c77993eR, C29857DEx.A00, new Object[0]);
        AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
        C14360o3.A07(A02);
        AbstractC77183d4.A00(c77993eR, C29901DGp.A00(c6fg, atomicReference, A002, A02, 45), new Object[]{A02});
        Object A003 = AbstractC77183d4.A00(c77993eR, DH2.A01(c6fg, atomicReference2, bui, 34), new Object[0]);
        C136336Fm c136336Fm = new C136336Fm(new C28961CqC(A002, bui), c6fg);
        HashMap A05 = C1338462s.A05(c1338462s.A01.A02, Collections.emptyMap());
        C136326Fl c136326Fl = (C136326Fl) atomicReference.get();
        C135266Ab c135266Ab = (C135266Ab) atomicReference2.get();
        C6AZ c6az2 = null;
        if (c135266Ab != null && (c6az = (C6AZ) c135266Ab.A02) != null) {
            c6av = c6az.A01;
        } else {
            c6av = null;
        }
        C6TK c6tk = new C6TK(c6fg, c136326Fl, c6av, A05);
        C135266Ab c135266Ab2 = (C135266Ab) atomicReference2.get();
        if (c135266Ab2 != null) {
            c6az2 = (C6AZ) c135266Ab2.A02;
        }
        C6AY A004 = C6TM.A00(c136336Fm, c6az2, c6tk, bui.A00());
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, AbstractC25227BEk.A0d(C29009Cqy.A00, 3, false), C29855DEv.A00, new C30177DRh(33, this, c6fg, A003, c77993eR));
        C29040CrT c29040CrT = new C29040CrT(A004, c6fg);
        C75933ay c75933ay = C51722Yv.A02;
        return AbstractC25225BEi.A0g(C9CV.A00(C9CV.A00(null, C05F.A0B, Integer.valueOf(R.id.clips_showreel_bloks_v2_component_id), 4), C05F.A0D, "reels_server_rendered_new_bloks_integration", 4), c29040CrT, A0c);
    }

    public C26622BpJ(C139406Sv c139406Sv, C138746Qe c138746Qe, InterfaceC31031DkU interfaceC31031DkU, C62862tP c62862tP, UserSession userSession, C29375Cx8 c29375Cx8, InterfaceC31138Dmd interfaceC31138Dmd, String str, String str2, Map map, boolean z, boolean z2, boolean z3) {
        AbstractC167027dH.A13(str, c62862tP, userSession);
        C14360o3.A0B(c138746Qe, 7);
        AbstractC25234BEr.A0l(8, c139406Sv, c29375Cx8, str2, map);
        C14360o3.A0B(interfaceC31138Dmd, 12);
        this.A07 = str;
        this.A0C = c62862tP;
        this.A03 = userSession;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = c138746Qe;
        this.A00 = c139406Sv;
        this.A04 = c29375Cx8;
        this.A06 = str2;
        this.A08 = map;
        this.A05 = interfaceC31138Dmd;
        this.A02 = interfaceC31031DkU;
    }
}
