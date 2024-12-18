package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.search.SearchController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.GFe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36684GFe implements InterfaceC169507hQ {
    public InterfaceC66482zP A00;
    public EY2 A01;
    public C36216FyV A02;
    public DirectShareTarget A03;
    public InterfaceC169517hR A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public FPY A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final Context A0M;
    public final AbstractC59962oe A0N;
    public final InterfaceC11380iw A0O;
    public final C66362zD A0P;
    public final UserSession A0Q;
    public final C36303Fzy A0R;
    public final DirectSearchInboxFragment A0S;
    public final C7NH A0T;
    public final C41951wl A0U;
    public final SearchController A0V;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final int A0l;
    public final C2GS A0m;
    public final String A0n;
    public final boolean A0o;
    public boolean A0H = false;
    public final List A0X = new CopyOnWriteArrayList();
    public final List A0Y = AbstractC166987dD.A1E();
    public final List A0W = AbstractC166987dD.A1E();

    public static void A01(C36684GFe c36684GFe) {
        UserSession userSession = c36684GFe.A0Q;
        EI6 A00 = F2F.A00(userSession, C18U.A06(C06090Tz.A05, userSession, 36317908448319143L) ? 1 : 0);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A17 = true;
        AbstractC31173DnH.A1G(c36684GFe.A0N, A00, A0y.A00());
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x04bc, code lost:
    
        if (r1 != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0da6, code lost:
    
        if (((java.util.AbstractMap) r2).get("inform_module") == null) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05ab, code lost:
    
        if (r68.A0D != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0b87, code lost:
    
        if (X.C18U.A06(r4, r2, 36326438253246335L) == false) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r50.isEmpty() == false) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:471:0x08a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x01cd. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0cf9  */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v7, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [int] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v198, types: [X.EXx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.util.List r69, java.lang.String r70) {
        /*
            Method dump skipped, instructions count: 3634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36684GFe.A02(java.util.List, java.lang.String):void");
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        this.A04 = interfaceC169517hR;
        List A0m = AbstractC31171DnF.A0m(interfaceC169517hR);
        this.A08 = interfaceC169517hR.Bo9();
        String An8 = interfaceC169517hR.An8();
        this.A06 = An8;
        this.A05 = interfaceC169517hR.B3l();
        this.A06 = An8;
        this.A0A = interfaceC169517hR.Bri();
        this.A0F = interfaceC169517hR.CZV();
        this.A0D = interfaceC169517hR.CXh();
        this.A0E = interfaceC169517hR.isLoading();
        this.A0C = interfaceC169517hR.CUG();
        A02(A0m, interfaceC169517hR.BjQ());
    }

    public C36684GFe(Context context, AbstractC59962oe abstractC59962oe, C66362zD c66362zD, UserSession userSession, C36303Fzy c36303Fzy, DirectSearchInboxFragment directSearchInboxFragment, SearchController searchController, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2GS c2gs = new C2GS();
        this.A0m = c2gs;
        this.A0G = false;
        this.A0B = false;
        this.A0P = c66362zD;
        this.A0N = abstractC59962oe;
        this.A0M = context;
        this.A0Q = userSession;
        this.A0V = searchController;
        this.A0l = context.getColor(R.color.grey_5);
        this.A0n = context.getString(2131973064);
        this.A0S = directSearchInboxFragment;
        this.A0R = c36303Fzy;
        this.A0o = z;
        this.A0c = z2;
        this.A0e = z4;
        this.A0f = z5;
        this.A0g = z3;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0K = AbstractC31178DnM.A01(c06090Tz, userSession, 36596265278441858L);
        this.A0j = C18U.A06(c06090Tz, userSession, 36320382349287840L);
        this.A0k = C18U.A06(c06090Tz, userSession, 36320382349156766L);
        this.A0Z = C18U.A06(c06090Tz, userSession, 36317496132703516L);
        this.A0a = AbstractC31268Doq.A0B(userSession);
        this.A0h = C18U.A06(c06090Tz, userSession, 36320382348960156L);
        this.A0i = C18U.A06(c06090Tz, userSession, 36320403824452038L);
        C18U.A06(c06090Tz, userSession, 36320403825566164L);
        this.A0b = C18U.A06(c06090Tz, userSession, 36328409642778108L);
        this.A0J = AbstractC25225BEi.A07(c06090Tz, userSession, 36609884619610086L);
        this.A0T = C7NH.A00(userSession);
        this.A0L = AbstractC25225BEi.A07(c06090Tz, userSession, 36601857326977400L);
        this.A0d = C18U.A06(c06090Tz, userSession, 36320382349025693L);
        this.A0O = new InterfaceC11380iw() { // from class: X.Fu1
            public static final String __redex_internal_original_name = "DirectInboxSearchController$DirectInboxSearchResultListener$$ExternalSyntheticLambda0";

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return "direct_inbox_search";
            }
        };
        this.A0U = C41951wl.A00(userSession);
        C31470DsE.A01(directSearchInboxFragment.getViewLifecycleOwner(), c2gs, this, 20);
        if (C18U.A06(c06090Tz, userSession, 36320382348894619L)) {
            this.A0I = C37058GUs.A00(userSession);
        }
    }

    public static List A00(ArrayList arrayList, int i) {
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }
}
