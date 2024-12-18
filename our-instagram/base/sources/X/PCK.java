package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class PCK implements InterfaceC57985PnV {
    public InterfaceC16820sZ A00;
    public boolean A01;
    public final View A02;
    public final ViewGroup A03;
    public final InterfaceC57897Pm1 A04;
    public final InterfaceC57897Pm1 A05;
    public final InterfaceC11380iw A06;
    public final C57112jm A07;
    public final O57 A08;
    public final O58 A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC16820sZ A0J;
    public final InterfaceC16820sZ A0K;
    public final InterfaceC16820sZ A0L;
    public final InterfaceC16820sZ A0M;
    public final InterfaceC16620sF A0N;
    public final InterfaceC16610sE A0O;
    public final boolean A0P;

    public PCK(View view, ViewGroup viewGroup, InterfaceC57897Pm1 interfaceC57897Pm1, InterfaceC57897Pm1 interfaceC57897Pm12, InterfaceC11380iw interfaceC11380iw, C57112jm c57112jm, O57 o57, O58 o58, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE, boolean z) {
        C14360o3.A0B(viewGroup, 1);
        AbstractC25229BEm.A1N(interfaceC57897Pm1, 12, interfaceC57897Pm12);
        this.A03 = viewGroup;
        this.A02 = view;
        this.A06 = interfaceC11380iw;
        this.A0O = interfaceC16610sE;
        this.A08 = o57;
        this.A0J = interfaceC16820sZ;
        this.A0N = interfaceC16620sF;
        this.A07 = c57112jm;
        this.A09 = o58;
        this.A0M = interfaceC16820sZ2;
        this.A0L = interfaceC16820sZ3;
        this.A04 = interfaceC57897Pm1;
        this.A0K = interfaceC16820sZ4;
        this.A05 = interfaceC57897Pm12;
        this.A0P = z;
        this.A0H = C57524Pfy.A00(this, 38);
        this.A0D = C57524Pfy.A00(this, 34);
        this.A0C = C57524Pfy.A00(this, 33);
        this.A0G = C57524Pfy.A00(this, 37);
        this.A0F = C57524Pfy.A00(this, 36);
        this.A0A = C57524Pfy.A00(this, 31);
        this.A0B = C57524Pfy.A00(this, 32);
        this.A0E = C57524Pfy.A00(this, 35);
        this.A0I = C57524Pfy.A00(this, 39);
    }

    public final void A00() {
        ViewGroup viewGroup = this.A03;
        InterfaceC09390do interfaceC09390do = this.A0A;
        if (viewGroup.indexOfChild(AbstractC166987dD.A0d(interfaceC09390do)) != -1) {
            viewGroup.removeView(AbstractC166987dD.A0d(interfaceC09390do));
            ViewGroup A0B = MSW.A0B(interfaceC09390do);
            InterfaceC09390do interfaceC09390do2 = this.A0E;
            if (A0B.indexOfChild(AbstractC166987dD.A0d(interfaceC09390do2)) != -1) {
                MSW.A0B(interfaceC09390do).removeView(AbstractC166987dD.A0d(interfaceC09390do2));
            }
            AbstractC166987dD.A0d(interfaceC09390do2).setBackground(null);
            MSW.A0B(this.A0B).addView(AbstractC166987dD.A0d(interfaceC09390do2));
        }
    }

    public final boolean A02() {
        InterfaceC09390do interfaceC09390do = this.A0A;
        if (interfaceC09390do.CWa() && this.A03.indexOfChild(AbstractC166987dD.A0d(interfaceC09390do)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        Integer num;
        List subList;
        C50627MWo c50627MWo;
        C51671Ms2 c51671Ms2;
        C51760Mtj c51760Mtj;
        List list;
        Runnable runnable;
        C51905Mwn c51905Mwn = (C51905Mwn) interfaceC57856PlM;
        C14360o3.A0B(c51905Mwn, 0);
        InterfaceC09390do interfaceC09390do = this.A0E;
        AbstractC166987dD.A0d(interfaceC09390do).setVisibility(AbstractC167007dF.A05(c51905Mwn.A0A ? 1 : 0));
        boolean z = c51905Mwn.A07;
        if (this.A01 != z) {
            this.A01 = z;
            InterfaceC09390do interfaceC09390do2 = this.A0I;
            Object value = interfaceC09390do2.getValue();
            if (z) {
                if (value != null) {
                    Ox9 ox9 = (Ox9) interfaceC09390do2.getValue();
                    if (ox9 != null) {
                        ox9.A00 = false;
                    }
                    C57112jm c57112jm = this.A07;
                    C59072n8 A00 = C59062n7.A00(null, null, null);
                    A00.A00((Ox9) interfaceC09390do2.getValue());
                    C59062n7 A01 = A00.A01();
                    OmniGridView omniGridView = (OmniGridView) interfaceC09390do.getValue();
                    N0J n0j = omniGridView.A05;
                    if (n0j == null) {
                        C14360o3.A0F("gridSelfItemDefinition");
                        throw C00O.createAndThrow();
                    }
                    c57112jm.A05(n0j.A01(omniGridView, omniGridView), A01);
                }
            } else if (value != null) {
                Ox9 ox92 = (Ox9) interfaceC09390do2.getValue();
                if (ox92 != null) {
                    ox92.A00 = true;
                    MSW.A09(ox92.A02).removeCallbacksAndMessages(null);
                }
                this.A07.A04(((OmniGridView) interfaceC09390do.getValue()).A01);
            }
        }
        if (!c51905Mwn.A05) {
            num = -16777216;
        } else {
            num = null;
            List list2 = c51905Mwn.A03;
            if (list2.size() > 6) {
                subList = list2.subList(0, 6);
                c50627MWo = c51905Mwn.A00;
                if (c50627MWo == null && (c51671Ms2 = c51905Mwn.A01) != null) {
                    boolean z2 = c51905Mwn.A09;
                    List list3 = c51905Mwn.A02;
                    if (AbstractC166987dD.A1b(list3)) {
                        c51760Mtj = new C51760Mtj(list3);
                    } else if (z2) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj : subList) {
                            if (((C51681MsC) obj).A03 != GridItemType.SELF_VIEW) {
                                A1E.add(obj);
                            }
                        }
                        c51760Mtj = new C51760Mtj(A1E);
                    } else {
                        c51760Mtj = null;
                    }
                    OmniGridView omniGridView2 = (OmniGridView) interfaceC09390do.getValue();
                    if (z2) {
                        list = AbstractC166987dD.A1E();
                        for (Object obj2 : subList) {
                            if (((C51681MsC) obj2).A03 == GridItemType.SELF_VIEW) {
                                list.add(obj2);
                            }
                        }
                    } else {
                        list = subList;
                    }
                    omniGridView2.A05(new C51749MtY(c50627MWo, c51760Mtj, c51671Ms2, num, list, c51905Mwn.A04), c51905Mwn.A06);
                    if (c51905Mwn.A08) {
                        InterfaceC09390do interfaceC09390do3 = this.A0F;
                        AbstractC43593JPy.A1W(interfaceC09390do3, 0);
                        final InterfaceC16820sZ interfaceC16820sZ = this.A0K;
                        this.A00 = interfaceC16820sZ;
                        AbstractC166987dD.A0d(interfaceC09390do3).postDelayed(new Runnable() { // from class: X.POA
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                InterfaceC16820sZ.this.invoke();
                            }
                        }, 4000L);
                        Ok3.A00(AbstractC166987dD.A0d(interfaceC09390do3), 31, this);
                        return;
                    }
                    if (((InterfaceC56392iX) this.A0G.getValue()).CWW()) {
                        InterfaceC09390do interfaceC09390do4 = this.A0F;
                        AbstractC43593JPy.A1Q(interfaceC09390do4.getValue());
                        View A0d = AbstractC166987dD.A0d(interfaceC09390do4);
                        final InterfaceC16820sZ interfaceC16820sZ2 = this.A00;
                        if (interfaceC16820sZ2 != null) {
                            runnable = new Runnable() { // from class: X.POA
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    InterfaceC16820sZ.this.invoke();
                                }
                            };
                        } else {
                            runnable = null;
                        }
                        A0d.removeCallbacks(runnable);
                        this.A00 = null;
                        AbstractC166987dD.A0d(interfaceC09390do4).setOnClickListener(null);
                        return;
                    }
                    return;
                }
            }
        }
        subList = c51905Mwn.A03;
        c50627MWo = c51905Mwn.A00;
        if (c50627MWo == null) {
        }
    }

    public final void A01(int i, int i2) {
        InterfaceC09390do interfaceC09390do = this.A0H;
        int dimensionPixelSize = ((Resources) interfaceC09390do.getValue()).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize2 = ((Resources) interfaceC09390do.getValue()).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize3 = ((Resources) interfaceC09390do.getValue()).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        ((DraggableViewContainer) this.A0A.getValue()).A0A(AbstractC166987dD.A0d(this.A0E), null, null, AbstractC167027dH.A01(this.A0D), AbstractC167027dH.A01(this.A0C), dimensionPixelSize, i + dimensionPixelSize3, dimensionPixelSize2, i2 + dimensionPixelSize3, true);
    }
}
