package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.LqI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49262LqI implements InterfaceC50481MQj {
    public final int A00;
    public final Object A01;

    public C49262LqI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC50481MQj
    public final void D90() {
        if (2 - this.A00 == 0) {
            C47988LJq c47988LJq = (C47988LJq) this.A01;
            c47988LJq.A0B = true;
            FrameLayout frameLayout = c47988LJq.A0N;
            frameLayout.setVisibility(0);
            View view = c47988LJq.A04;
            if (view != null) {
                view.setVisibility(0);
                InterfaceC56392iX interfaceC56392iX = c47988LJq.A0R;
                interfaceC56392iX.setVisibility(0);
                c47988LJq.A04(c47988LJq.A0A, c47988LJq.A01);
                float f = c47988LJq.A01;
                FrameLayout frameLayout2 = c47988LJq.A0M;
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout2.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(frameLayout2.getHeight(), Integer.MIN_VALUE));
                int measuredHeight = frameLayout.getMeasuredHeight();
                View view2 = c47988LJq.A04;
                if (view2 != null) {
                    view2.setTranslationY(f + measuredHeight);
                }
                View view3 = c47988LJq.A04;
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                }
                interfaceC56392iX.getView().setAlpha(1.0f);
                c47988LJq.A0L.setAlpha(1.0f);
                C3DN c3dn = c47988LJq.A0U;
                if (c3dn != null) {
                    c3dn.A0W(true);
                }
                LKK lkk = c47988LJq.A08;
                String str = null;
                if (lkk == null) {
                    C14360o3.A0F("reactionsTrayController");
                    throw C00O.createAndThrow();
                }
                lkk.A05(0.0f);
                C18920wW c18920wW = c47988LJq.A0P;
                C3o9 c3o9 = c47988LJq.A0T;
                if (c3o9 != null) {
                    str = AbstractC43827JZq.A01(c3o9);
                }
                C14360o3.A0B(c18920wW, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "direct_enter_customize_reactions");
                AbstractC31171DnF.A1C(A0f, "customize_button");
                if (str != null) {
                    AbstractC31171DnF.A1H(A0f, str);
                }
                A0f.Cht();
                DirectThreadKey A02 = JRE.A02(c3o9);
                if (c47988LJq.A0H == 29 && A02 != null) {
                    C142846ck A00 = AbstractC147806l5.A00(c47988LJq.A0Q);
                    int i = c47988LJq.A0E;
                    String str2 = A02.A00;
                    String str3 = A02.A01;
                    C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                    if (AbstractC25226BEj.A1Z(A0I)) {
                        AbstractC31175DnJ.A1B(A0I, A00);
                        AbstractC31174DnI.A1I(A0I, "reaction_customizations_rendered");
                        A0I.A0o("customize_button");
                        AbstractC31177DnL.A1H(A0I, A00, AbstractC31179DnN.A0a(A0I, "reaction_sheet", str2, str3, i));
                        return;
                    }
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC50481MQj
    public final void DDM(C148336m3 c148336m3) {
        String str;
        String str2;
        BottomSheetFragment bottomSheetFragment;
        ViewGroup viewGroup;
        L2Y l2y;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                LIi lIi = (LIi) this.A01;
                C47467Kxw c47467Kxw = lIi.A0C;
                String str3 = c148336m3.A02;
                C14360o3.A0B(str3, 0);
                AbstractC43757JWv abstractC43757JWv = c47467Kxw.A00.A04;
                if (abstractC43757JWv != null) {
                    abstractC43757JWv.A0G(str3, "overreact_tray");
                }
                C189478aR c189478aR = lIi.A03;
                if (c189478aR != null) {
                    c189478aR.A07();
                    return;
                }
                throw AbstractC166997dE.A0g();
            default:
                C47988LJq c47988LJq = (C47988LJq) this.A01;
                if (c47988LJq.A0B) {
                    LKK lkk = c47988LJq.A08;
                    if (lkk == null) {
                        C14360o3.A0F("reactionsTrayController");
                        throw C00O.createAndThrow();
                    }
                    String str4 = c148336m3.A02;
                    C14360o3.A0B(str4, 0);
                    C47660L2t c47660L2t = (C47660L2t) lkk.A0K.get(lkk.A03);
                    List A03 = lkk.A03();
                    if (A03.contains(str4) && A03.indexOf(str4) != lkk.A03) {
                        LKK.A02(lkk, c47660L2t.A00, A03.indexOf(str4));
                    }
                    LES les = lkk.A0G;
                    if (les != null && (l2y = les.A00) != null) {
                        str = l2y.A00;
                    } else {
                        str = null;
                    }
                    if (C14360o3.A0K(str, c47660L2t.A00)) {
                        L2Y l2y2 = les.A00;
                        if (l2y2 != null) {
                            C47985LJk.A00(l2y2.A01, l2y2.A02, l2y2.A03);
                        }
                        les.A02.clear();
                    }
                    AbstractC125325le A0o = AbstractC43592JPx.A0o(c47660L2t.A02, 1);
                    A0o.A0U(1.0f, 0.0f, -1.0f);
                    A0o.A0V(1.0f, 0.0f, -1.0f);
                    AbstractC125325le A0C = A0o.A0C(100L);
                    A0C.A05 = new C49603Lvw(c47660L2t, lkk, str4);
                    A0C.A0H();
                    int i = lkk.A03;
                    boolean z = false;
                    if (i == 0) {
                        z = true;
                        C47988LJq.A02(c47988LJq, str4);
                    }
                    C189478aR c189478aR2 = c47988LJq.A09;
                    if (c189478aR2 != null && (viewGroup = (bottomSheetFragment = c189478aR2.A03).bottomSheetContainer) != null) {
                        AbstractC13880nE.A0O(viewGroup);
                        bottomSheetFragment.DOM();
                    }
                    DirectThreadKey A02 = JRE.A02(c47988LJq.A0T);
                    if (c47988LJq.A0H == 29 && A02 != null) {
                        C142846ck A00 = AbstractC147806l5.A00(c47988LJq.A0Q);
                        int i2 = c47988LJq.A0E;
                        String str5 = A02.A00;
                        String str6 = A02.A01;
                        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
                        if (AbstractC25226BEj.A1Z(A0I)) {
                            AbstractC31175DnJ.A1B(A0I, A00);
                            AbstractC31174DnI.A1I(A0I, "reaction_replaced");
                            A0I.A0o("reaction_list");
                            A0I.A0h(AbstractC31179DnN.A0a(A0I, "reaction_sheet", str5, str6, i2));
                            if (z) {
                                str2 = "True";
                            } else {
                                str2 = "False";
                            }
                            A0I.A0v(AbstractC167007dF.A0n("is_double_tap", str2));
                            A0I.A0u(A00.A01);
                            A0I.Cht();
                            return;
                        }
                        return;
                    }
                    return;
                }
                c47988LJq.A0S.A00(c148336m3.A02, NetInfoModule.CONNECTION_TYPE_NONE, "overreact_tray");
                C189478aR c189478aR3 = c47988LJq.A09;
                if (c189478aR3 != null) {
                    c189478aR3.A07();
                    c47988LJq.A03();
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC50481MQj
    public final void DkO() {
        C189478aR c189478aR;
        if (this.A00 == 0 && (c189478aR = ((C34423FFn) this.A01).A00.A02) != null) {
            c189478aR.A07();
        }
    }
}
