package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.Dcd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30556Dcd extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl;
        int i;
        switch (this.A00) {
            case 0:
                CW4 cw4 = (CW4) obj;
                c5Tl = (C5Tl) obj2;
                int A0H = AbstractC166987dD.A0H(obj3);
                if ((A0H & 6) == 0) {
                    A0H |= AbstractC25232BEp.A0R(c5Tl, cw4);
                }
                if ((A0H & 19) != 18 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1583894919, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
                    }
                    String str = (String) ((InterfaceC16620sF) this.A01).invoke(c5Tl, 0);
                    if (AbstractC25225BEi.A1Y(str)) {
                        boolean z = this.A05;
                        AbstractC28453Ch3.A01(cw4, c5Tl, (Modifier) this.A03, str, (InterfaceC16820sZ) this.A04, (InterfaceC16610sE) this.A02, (A0H << 6) & 896, 0, z);
                        if (C0fH.A02()) {
                            i = -2061868968;
                            C0fH.A00(i);
                        }
                        return C0eB.A00;
                    }
                    throw AbstractC166987dD.A14("Label must not be blank");
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 1:
                int A0H2 = AbstractC166987dD.A0H(obj);
                int A0H3 = AbstractC166987dD.A0H(obj2);
                boolean A1a = AbstractC166987dD.A1a(obj3);
                if (!A1a) {
                    InterfaceC31114Dlw interfaceC31114Dlw = (InterfaceC31114Dlw) this.A02;
                    A0H2 = interfaceC31114Dlw.F8T(A0H2);
                    A0H3 = interfaceC31114Dlw.F8T(A0H3);
                }
                boolean z2 = true;
                if (this.A05) {
                    C5C3 c5c3 = (C5C3) this.A04;
                    long j = c5c3.A00;
                    if (A0H2 != AbstractC25225BEi.A06(j) || A0H3 != AbstractC25228BEl.A02(j)) {
                        if (Math.min(A0H2, A0H3) >= 0) {
                            int max = Math.max(A0H2, A0H3);
                            C5C8 c5c8 = c5c3.A01;
                            if (max <= c5c8.length()) {
                                if (!A1a && A0H2 != A0H3) {
                                    ((BXF) this.A01).A0E(true);
                                } else {
                                    BXF bxf = (BXF) this.A01;
                                    BXF.A05(bxf, false);
                                    BXF.A01(EnumC27357C5m.None, bxf);
                                }
                                ((CWQ) this.A03).A0O.invoke(new C5C3(c5c8, null, C60Z.A00(A0H2, A0H3)));
                                return Boolean.valueOf(z2);
                            }
                        }
                        BXF bxf2 = (BXF) this.A01;
                        BXF.A05(bxf2, false);
                        BXF.A01(EnumC27357C5m.None, bxf2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 2:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1919763295, "com.instagram.aistudio.home.view.homeSectionItem.<anonymous> (AiAgentsHomeFragment.kt:386)");
                    }
                    C50726MaR c50726MaR = (C50726MaR) this.A02;
                    boolean z3 = this.A05;
                    AbstractC28496Chp.A02(c5Tl, c50726MaR, (C28370CfW) this.A01, (InterfaceC16820sZ) this.A03, (InterfaceC16610sE) this.A04, 0, z3);
                    if (C0fH.A02()) {
                        i = -993650899;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
                C14360o3.A0B(obj, 0);
                if (C0fH.A02()) {
                    C0fH.A01(-129771610, "com.instagram.invite.view.ContactList.<anonymous>.<anonymous> (InviteContactContent.kt:151)");
                }
                LazyListState lazyListState = (LazyListState) this.A02;
                Object obj4 = this.A04;
                boolean z4 = this.A05;
                C6IS.A05(lazyListState, A0S, new MIF(17, this.A01, this.A03, obj4, z4));
                if (C0fH.A02()) {
                    i = 105863023;
                    C0fH.A00(i);
                }
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30556Dcd(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(3);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A05 = z;
        this.A03 = obj3;
        this.A01 = obj4;
    }
}
