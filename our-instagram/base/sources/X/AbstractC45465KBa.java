package X;

import X.C3F5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KBa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45465KBa extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AvatarStickerGridFragment";
    public int A00;
    public ViewStub A01;
    public GridLayoutManager A02;
    public RecyclerView A03;
    public EnumC143286dT A04;
    public C66362zD A05;
    public ViewModelListUpdate A06;
    public InterfaceC56392iX A07;
    public InterfaceC56392iX A08;
    public InterfaceC56392iX A09;
    public IgdsInlineSearchBox A0A;
    public SpinnerImageView A0B;
    public Integer A0C;
    public String A0D;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final View.OnTouchListener A0P;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0T;
    public final C47251KuO A0U;
    public final InterfaceC09390do A0S = AbstractC60492pY.A02(this);
    public final L39 A0Q = new L39();
    public InterfaceC16820sZ A0E = C50254MHj.A02(this, 39);

    public void A0H(QIw qIw, AbstractC46382Kg4 abstractC46382Kg4, AbstractC46386Kg8 abstractC46386Kg8, List list) {
        C14360o3.A0B(list, 0);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        this.A06 = A0E;
        A02(abstractC46382Kg4, abstractC46386Kg8, this, A0E, list, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        IgdsInlineSearchBox igdsInlineSearchBox;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.avatar_sticker_grid);
        C14360o3.A0B(A0G, 0);
        this.A03 = A0G;
        this.A0A = (IgdsInlineSearchBox) view.requireViewById(R.id.avatar_sticker_grid_search_box);
        this.A0B = (SpinnerImageView) view.requireViewById(R.id.avatar_sticker_grid_loading_spinner);
        int i = 0;
        ViewGroup.LayoutParams layoutParams = null;
        this.A07 = AbstractC56372iV.A01(view.requireViewById(R.id.avatar_sticker_grid_back_button), false, false);
        this.A08 = AbstractC37301Gc2.A0D(view, R.id.avatar_sticker_grid_empty_view);
        this.A09 = AbstractC37301Gc2.A0D(view, R.id.avatar_sticker_grid_title);
        if (this instanceof C45441KAc) {
            z = ((C45441KAc) this).A03;
        } else {
            z = this.A0L;
        }
        InterfaceC56392iX interfaceC56392iX = this.A07;
        if (interfaceC56392iX != null) {
            if (z) {
                interfaceC56392iX.setVisibility(0);
                InterfaceC56392iX interfaceC56392iX2 = this.A07;
                if (interfaceC56392iX2 != null) {
                    ViewOnClickListenerC48064LPp.A00(interfaceC56392iX2.getView(), 13, this);
                }
            } else {
                interfaceC56392iX.setVisibility(8);
            }
            A03(this);
            View A0S = AbstractC166997dE.A0S(view, R.id.bottom_sheet_drag_handle);
            if (!this.A0M) {
                i = 8;
            }
            A0S.setVisibility(i);
            if (this.A0K) {
                IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0A;
                if (igdsInlineSearchBox2 != null) {
                    layoutParams = igdsInlineSearchBox2.getLayoutParams();
                }
                if ((layoutParams instanceof C56302iJ) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) (marginLayoutParams.topMargin + AbstractC13880nE.A04(AbstractC166997dE.A0L(view), 12)), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
            }
            if (this.A0M && AbstractC56862jK.A00(getContext())) {
                ViewOnClickListenerC48064LPp.A00(A0S, 14, this);
                AbstractC56932jR.A06(A0S, 500L);
                AbstractC166997dE.A18(requireContext(), A0S, 2131956237);
            }
            boolean z2 = this.A0F;
            int i2 = R.id.avatar_sticker_grid_no_avatar_nux;
            if (z2) {
                i2 = R.id.avatar_sticker_grid_avatar_creation_upsell;
            }
            ViewStub A0G2 = AbstractC31173DnH.A0G(view, i2);
            C14360o3.A0B(A0G2, 0);
            this.A01 = A0G2;
            A0G2.setOnInflateListener(new ViewStubOnInflateListenerC48087LQn(this, 0));
            C66392zG A0R = AbstractC31174DnI.A0R(this);
            A0I(A0R);
            this.A05 = A0R.A00();
            RecyclerView A07 = A07();
            C66362zD c66362zD = this.A05;
            if (c66362zD != null) {
                A07.setAdapter(c66362zD);
                A07().setItemAnimator(new UGG());
                final Context requireContext = requireContext();
                final int i3 = this.A00;
                GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext, i3) { // from class: com.instagram.avatars.stickergrid.AvatarStickerGridFragment$setUpRecyclerView$2
                    @Override // X.AbstractC70663Fe
                    public final void A0j(int i4) {
                        this.A0D();
                    }

                    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
                    public final void A1S(C3F5 c3f5) {
                        super.A1S(c3f5);
                        this.A0D();
                    }
                };
                this.A02 = gridLayoutManager;
                gridLayoutManager.A01 = new JnM(this);
                RecyclerView A072 = A07();
                GridLayoutManager gridLayoutManager2 = this.A02;
                if (gridLayoutManager2 != null) {
                    A072.setLayoutManager(gridLayoutManager2);
                    A07().A10(A06());
                    A07().setOnTouchListener(this.A0P);
                    int i4 = this.A00 * 4;
                    JY9 jy9 = new JY9(this, 2);
                    Integer num = C05F.A00;
                    A07().A14(new C153156uj(A07().A0D, jy9, new C153146ui(num, C05F.A01, i4), false, false));
                    if (this.A0N && (igdsInlineSearchBox = this.A0A) != null) {
                        igdsInlineSearchBox.A02 = new C49485Lty(this, 0);
                    }
                    if (this.A0O) {
                        InterfaceC56392iX interfaceC56392iX3 = this.A07;
                        if (interfaceC56392iX3 != null) {
                            View view2 = interfaceC56392iX3.getView();
                            InterfaceC56392iX interfaceC56392iX4 = this.A07;
                            if (interfaceC56392iX4 != null) {
                                ViewGroup.LayoutParams layoutParams2 = interfaceC56392iX4.getView().getLayoutParams();
                                C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                marginLayoutParams2.setMargins(0, 0, 0, AbstractC167017dG.A0D(requireContext()));
                                view2.setLayoutParams(marginLayoutParams2);
                                String str2 = this.A0D;
                                if (str2 != null) {
                                    InterfaceC56392iX interfaceC56392iX5 = this.A09;
                                    if (interfaceC56392iX5 != null) {
                                        ((TextView) interfaceC56392iX5.getView()).setText(str2);
                                    } else {
                                        str = DialogModule.KEY_TITLE;
                                    }
                                }
                            }
                        }
                    }
                    A0E();
                    InterfaceC09390do interfaceC09390do = this.A0T;
                    if (((C44543Jmn) interfaceC09390do.getValue()).A0A) {
                        C44543Jmn c44543Jmn = (C44543Jmn) interfaceC09390do.getValue();
                        if (!c44543Jmn.A0L.A00.getBoolean("key_has_seen_avatar_mentions_tooltip_v4", false)) {
                            c44543Jmn.A0T.Egh(C45448KAj.A00);
                        }
                        C44543Jmn c44543Jmn2 = (C44543Jmn) interfaceC09390do.getValue();
                        KAT kat = KAT.A00;
                        C05A c05a = c44543Jmn2.A0S;
                        ArrayList arrayList = c44543Jmn2.A0R;
                        boolean isEmpty = arrayList.isEmpty();
                        ArrayList arrayList2 = arrayList;
                        if (isEmpty) {
                            arrayList2 = c44543Jmn2.A07;
                        }
                        c05a.Egh(new C45451KAm(null, c44543Jmn2.A03, kat, arrayList2));
                        c44543Jmn2.A04 = kat;
                        AbstractC23641Du.A03(num, AbstractC25231BEo.A0e(C12L.A00), new MBq(c44543Jmn2, null, 21), AbstractC141776au.A00(c44543Jmn2));
                    }
                    if (this.A0G) {
                        InterfaceC09390do interfaceC09390do2 = this.A0R;
                        if (AbstractC167007dF.A1Z(AbstractC43592JPx.A0M(interfaceC09390do2).A08)) {
                            C07S c07s = C07S.STARTED;
                            C07X viewLifecycleOwner = getViewLifecycleOwner();
                            AbstractC23641Du.A03(num, AnonymousClass191.A00, new MCQ(viewLifecycleOwner, c07s, this, null, 39), C07Y.A00(viewLifecycleOwner));
                            AbstractC43592JPx.A0M(interfaceC09390do2).A02(EnumC143276dS.A0J);
                        }
                    }
                    C07S c07s2 = C07S.STARTED;
                    C07X viewLifecycleOwner2 = getViewLifecycleOwner();
                    C57312k6 A00 = C07Y.A00(viewLifecycleOwner2);
                    MCQ mcq = new MCQ(viewLifecycleOwner2, c07s2, this, null, 38);
                    AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                    AbstractC23641Du.A03(num, anonymousClass191, mcq, A00);
                    C07X viewLifecycleOwner3 = getViewLifecycleOwner();
                    AbstractC23641Du.A03(num, anonymousClass191, new MCQ(viewLifecycleOwner3, c07s2, this, null, 40), C07Y.A00(viewLifecycleOwner3));
                    C44543Jmn c44543Jmn3 = (C44543Jmn) interfaceC09390do.getValue();
                    C51758Mth c51758Mth = c44543Jmn3.A0B;
                    if (c51758Mth != null && c51758Mth.A01) {
                        c44543Jmn3.A0K.A00(KOQ.A00);
                        return;
                    }
                    return;
                }
                str = "gridLayoutManager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        str = "backButton";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.AbstractC46382Kg4 r21, X.AbstractC46386Kg8 r22, X.AbstractC45465KBa r23, com.instagram.common.recyclerview.ViewModelListUpdate r24, java.util.List r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC45465KBa.A02(X.Kg4, X.Kg8, X.KBa, com.instagram.common.recyclerview.ViewModelListUpdate, java.util.List, boolean):void");
    }

    public static final void A03(AbstractC45465KBa abstractC45465KBa) {
        if (abstractC45465KBa.A0N) {
            IgdsInlineSearchBox igdsInlineSearchBox = abstractC45465KBa.A0A;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.setVisibility(0);
            }
        } else {
            boolean z = abstractC45465KBa.A0O;
            IgdsInlineSearchBox igdsInlineSearchBox2 = abstractC45465KBa.A0A;
            if (z) {
                if (igdsInlineSearchBox2 != null) {
                    igdsInlineSearchBox2.setVisibility(8);
                }
                InterfaceC56392iX interfaceC56392iX = abstractC45465KBa.A09;
                if (interfaceC56392iX != null) {
                    interfaceC56392iX.setVisibility(0);
                    return;
                }
                C14360o3.A0F(DialogModule.KEY_TITLE);
                throw C00O.createAndThrow();
            }
            if (igdsInlineSearchBox2 != null) {
                igdsInlineSearchBox2.setVisibility(8);
            }
        }
        InterfaceC56392iX interfaceC56392iX2 = abstractC45465KBa.A09;
        if (interfaceC56392iX2 != null) {
            interfaceC56392iX2.setVisibility(8);
            return;
        }
        C14360o3.A0F(DialogModule.KEY_TITLE);
        throw C00O.createAndThrow();
    }

    public static final void A04(AbstractC45465KBa abstractC45465KBa, boolean z) {
        SpinnerImageView spinnerImageView;
        C3T1 c3t1;
        if (z) {
            C66362zD c66362zD = abstractC45465KBa.A05;
            if (c66362zD != null) {
                AbstractC43593JPy.A1O(c66362zD);
                spinnerImageView = abstractC45465KBa.A0B;
                if (spinnerImageView != null) {
                    c3t1 = C3T1.LOADING;
                    spinnerImageView.setLoadingStatus(c3t1);
                    return;
                }
                C14360o3.A0F("loadingSpinner");
            } else {
                AbstractC31171DnF.A0t();
            }
        } else {
            spinnerImageView = abstractC45465KBa.A0B;
            if (spinnerImageView != null) {
                c3t1 = C3T1.SUCCESS;
                spinnerImageView.setLoadingStatus(c3t1);
                return;
            }
            C14360o3.A0F("loadingSpinner");
        }
        throw C00O.createAndThrow();
    }

    public static boolean A05(C45446KAh c45446KAh) {
        return C18U.A06(C06090Tz.A05, ((C7FJ) c45446KAh.A0E.getValue()).A00, 36329612234080695L);
    }

    public final RecyclerView A07() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            return recyclerView;
        }
        C14360o3.A0F("stickerGridRecyclerView");
        throw C00O.createAndThrow();
    }

    public final C51758Mth A08() {
        long j;
        if (this instanceof C45446KAh) {
            C45446KAh c45446KAh = (C45446KAh) this;
            C77H c77h = (C77H) c45446KAh.A0M.getValue();
            InterfaceC09390do interfaceC09390do = c45446KAh.A0N;
            Object value = interfaceC09390do.getValue();
            C14360o3.A0B(value, 0);
            boolean z = false;
            if (!AbstractC166997dE.A1Z(AbstractC166997dE.A0m(c77h.A01, value.hashCode()), false) && !AbstractC167007dF.A1Z(c45446KAh.A0H) && AbstractC31171DnF.A0n(interfaceC09390do).size() == 1) {
                C7FJ c7fj = (C7FJ) c45446KAh.A0E.getValue();
                boolean A1Z = AbstractC167007dF.A1Z(c45446KAh.A0G);
                if (!c7fj.A00()) {
                    UserSession userSession = c7fj.A00;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (A1Z) {
                        j = 36320871975494620L;
                    } else {
                        j = 36318505447987429L;
                    }
                    z = AbstractC31176DnK.A1a(c06090Tz, userSession, j);
                }
            }
            return new C51758Mth(z, AbstractC31171DnF.A0n(interfaceC09390do), 20);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009e, code lost:
    
        if (X.C18U.A06(r3, ((X.C7FJ) r4.getValue()).A00, 36322212004767799L) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        if (X.C18U.A06(r2, r3, r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(((X.C45440KAb) r6).A04), 36323655113780697L) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC143276dS A09() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C45446KAh
            if (r0 == 0) goto L15
            r5 = r6
            X.KAh r5 = (X.C45446KAh) r5
            X.KcO r1 = r5.A03
            if (r1 != 0) goto L72
            java.lang.String r0 = "entryPoint"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L15:
            boolean r0 = r6 instanceof X.C45442KAd
            if (r0 == 0) goto L1c
            X.6dS r0 = X.EnumC143276dS.A06
            return r0
        L1c:
            boolean r0 = r6 instanceof X.C45441KAc
            if (r0 == 0) goto L34
            r0 = r6
            X.KAc r0 = (X.C45441KAc) r0
            X.0do r0 = r0.A07
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36315876928261792(0x81051900040ea0, double:3.029645029507171E-306)
            goto Lb7
        L34:
            boolean r0 = r6 instanceof X.C45445KAg
            if (r0 == 0) goto L46
            r0 = r6
            X.KAg r0 = (X.C45445KAg) r0
            X.0do r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            X.6dS r0 = X.AbstractC173587oA.A00(r0)
            return r0
        L46:
            boolean r0 = r6 instanceof X.C45440KAb
            if (r0 == 0) goto L63
            r0 = r6
            X.KAb r0 = (X.C45440KAb) r0
            X.0do r0 = r0.A04
            X.0ll r3 = X.AbstractC166987dD.A0o(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323655113780697(0x810c2c00002dd9, double:3.0345639853495656E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lbd
        L60:
            X.6dS r0 = X.EnumC143276dS.A0Y
            return r0
        L63:
            boolean r0 = r6 instanceof X.C45443KAe
            if (r0 == 0) goto Lbd
            r0 = r6
            X.KAe r0 = (X.C45443KAe) r0
            X.0do r0 = r0.A02
            r0.getValue()
            X.6dS r0 = X.EnumC143276dS.A0Y
            return r0
        L72:
            X.KcO r0 = X.EnumC46186KcO.A0E
            if (r1 != r0) goto La0
            X.0do r4 = r5.A0E
            java.lang.Object r0 = r4.getValue()
            X.7FJ r0 = (X.C7FJ) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321202687517905(0x8109f1000124d1, double:3.033013061105848E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 == 0) goto La0
            java.lang.Object r0 = r4.getValue()
            X.7FJ r0 = (X.C7FJ) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36322212004767799(0x810adc00002837, double:3.033651357398875E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 == 0) goto Lbd
        La0:
            X.0do r0 = r5.A0E
            java.lang.Object r1 = r0.getValue()
            X.7FJ r1 = (X.C7FJ) r1
            boolean r0 = r1.A00()
            if (r0 != 0) goto L60
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317053749039898(0x81062b0000131a, double:3.030389255705922E-306)
        Lb7:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L60
        Lbd:
            X.6dS r0 = X.EnumC143276dS.A0P
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC45465KBa.A09():X.6dS");
    }

    public final EnumC143286dT A0A() {
        if (this instanceof C45445KAg) {
            return ((C45445KAg) this).A00;
        }
        if (this instanceof C45441KAc) {
            return ((C45441KAc) this).A00;
        }
        if (this instanceof C45443KAe) {
            return ((C45443KAe) this).A00;
        }
        EnumC143286dT enumC143286dT = this.A04;
        if (enumC143286dT != null) {
            return enumC143286dT;
        }
        C14360o3.A0F("stickerTraySurface");
        throw C00O.createAndThrow();
    }

    public AbstractC46518KiH A0B() {
        UserSession A0r = AbstractC166987dD.A0r(this.A0S);
        EnumC143286dT A0A = A0A();
        return new C46042KZn(A08(), A09(), A0A, A0r);
    }

    public final String A0C() {
        if (this instanceof C45441KAc) {
            return ((C45441KAc) this).A01;
        }
        if (this instanceof C45446KAh) {
            return ((C45446KAh) this).A05;
        }
        if (this instanceof C45445KAg) {
            return ((C45445KAg) this).A01;
        }
        if (this instanceof C45440KAb) {
            return ((C45440KAb) this).A00;
        }
        C14360o3.A0F("editorLoggingSurface");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC45465KBa.A0D():void");
    }

    public final void A0E() {
        if (this.A0J) {
            C20Y.A00(AbstractC166987dD.A0r(this.A0S)).A04(new C50262MHr(this, 20));
            return;
        }
        C44543Jmn A0K = AbstractC43593JPy.A0K(this);
        A0K.A09 = true;
        A0K.A00 = 0;
        A0K.A0R.clear();
        A0K.A01();
    }

    public final void A0F() {
        InterfaceC09390do interfaceC09390do = this.A0T;
        C44543Jmn c44543Jmn = (C44543Jmn) interfaceC09390do.getValue();
        c44543Jmn.A09 = true;
        c44543Jmn.A00 = 0;
        c44543Jmn.A0R.clear();
        ((C44543Jmn) interfaceC09390do.getValue()).A0N.A01();
    }

    public final void A0G() {
        String str;
        InterfaceC09390do interfaceC09390do = this.A0T;
        C44543Jmn c44543Jmn = (C44543Jmn) interfaceC09390do.getValue();
        c44543Jmn.A09 = true;
        c44543Jmn.A00 = 0;
        c44543Jmn.A0R.clear();
        ((C44543Jmn) interfaceC09390do.getValue()).A0N.A01();
        this.A06 = AbstractC31171DnF.A0E();
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox == null || (str = igdsInlineSearchBox.getSearchString()) == null) {
            str = "";
        }
        ((C44543Jmn) interfaceC09390do.getValue()).A04(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.AbstractC209779Pn.A00(X.AbstractC166987dD.A0r(r1)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0I(X.C66392zG r14) {
        /*
            r13 = this;
            X.0do r1 = r13.A0S
            com.instagram.common.session.UserSession r6 = X.AbstractC166987dD.A0r(r1)
            X.0do r4 = r13.A0T
            java.lang.Object r0 = r4.getValue()
            X.Jmn r0 = (X.C44543Jmn) r0
            boolean r5 = r0.A0A
            boolean r0 = r13.A0I
            if (r0 != 0) goto L1f
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r1)
            boolean r0 = X.AbstractC209779Pn.A00(r0)
            r3 = 0
            if (r0 == 0) goto L20
        L1f:
            r3 = 1
        L20:
            X.L39 r2 = r13.A0Q
            r1 = 0
            r7 = 0
            X.KIP r0 = new X.KIP
            r0.<init>(r2, r6, r5, r3)
            r14.A01(r0)
            r2 = r13
            boolean r0 = r13 instanceof X.C45441KAc
            if (r0 == 0) goto Le8
            X.KAc r2 = (X.C45441KAc) r2
            boolean r0 = r2.A02
        L35:
            if (r0 == 0) goto L6c
            r2 = r13
            boolean r0 = r13 instanceof X.C45446KAh
            if (r0 == 0) goto Le5
            X.KAh r2 = (X.C45446KAh) r2
            X.7IK r0 = r2.A04
            if (r0 == 0) goto Le5
            android.content.Context r3 = r2.getContext()
            int r0 = r0.A0E
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r3, r0)
            r0 = 2130971414(0x7f040b16, float:1.7551566E38)
            int r0 = X.AbstractC53242c7.A0F(r2, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L58:
            X.Kc8 r2 = X.EnumC46170Kc8.A03
            r0 = 28
            X.MHj r0 = X.C50254MHj.A02(r13, r0)
            java.util.Map r2 = X.AbstractC167007dF.A0n(r2, r0)
            X.KIS r0 = new X.KIS
            r0.<init>(r3, r2)
            r14.A01(r0)
        L6c:
            java.lang.Object r0 = r4.getValue()
            X.Jmn r0 = (X.C44543Jmn) r0
            boolean r0 = r0.A0A
            if (r0 == 0) goto L84
            r0 = 0
            X.Jau r2 = new X.Jau
            r2.<init>(r13, r0)
            X.KJP r0 = new X.KJP
            r0.<init>(r13, r2)
            r14.A01(r0)
        L84:
            boolean r0 = r13.A0G
            if (r0 == 0) goto Lca
            X.0do r0 = r13.A0R
            X.6lt r0 = X.AbstractC43592JPx.A0M(r0)
            X.0do r0 = r0.A08
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto Lca
            X.6dT r2 = r13.A0A()
            X.6dT r0 = X.EnumC143286dT.A0F
            if (r2 == r0) goto Ld3
            X.6dT r2 = r13.A0A()
            X.6dT r0 = X.EnumC143286dT.A0A
            if (r2 == r0) goto Ld3
            android.content.Context r0 = r13.requireContext()
            int r12 = X.AbstractC53242c7.A07(r0)
            r8 = r1
        Laf:
            r0 = 29
            X.MHj r9 = X.C50254MHj.A02(r13, r0)
            r0 = 30
            X.MHj r10 = X.C50254MHj.A02(r13, r0)
            r0 = 19
            X.MHr r11 = new X.MHr
            r11.<init>(r13, r0)
            X.KJi r6 = new X.KJi
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.A01(r6)
        Lca:
            X.NEm r0 = new X.NEm
            r0.<init>(r1)
            r14.A01(r0)
            return
        Ld3:
            r12 = 2131100036(0x7f060184, float:1.7812442E38)
            r0 = 2131100260(0x7f060264, float:1.7812896E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto Laf
        Le5:
            r3 = 0
            goto L58
        Le8:
            boolean r0 = r13.A0H
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC45465KBa.A0I(X.2zG):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0K(String str) {
        JZ8 jz8;
        UserSession A0r;
        FragmentActivity requireActivity;
        String str2;
        String str3;
        C48240LWp c48240LWp;
        List A1J;
        JZ8 jz82;
        UserSession A0r2;
        FragmentActivity requireActivity2;
        String str4;
        String str5;
        int i;
        C45445KAg c45445KAg;
        EnumC143276dS enumC143276dS;
        String str6;
        if (this instanceof C45442KAd) {
            C45442KAd c45442KAd = (C45442KAd) this;
            jz8 = AbstractC47193KtS.A01;
            InterfaceC09390do interfaceC09390do = c45442KAd.A0A;
            A0r = AbstractC166987dD.A0r(interfaceC09390do);
            requireActivity = c45442KAd.requireActivity();
            c48240LWp = new C48240LWp(c45442KAd, 12);
            C149736oQ c149736oQ = EnumC143276dS.A01;
            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
            EnumC143286dT enumC143286dT = EnumC143286dT.A0F;
            A1J = AbstractC43592JPx.A13(c149736oQ.A00(EnumC143276dS.A06, enumC143286dT, A0r3, false), c149736oQ.A00(EnumC143276dS.A05, enumC143286dT, AbstractC166987dD.A0r(interfaceC09390do), false));
            str2 = "ig_stories_consumption";
            str3 = AbstractC111324zv.A00(2507);
        } else {
            if (this instanceof C45441KAc) {
                C45441KAc c45441KAc = (C45441KAc) this;
                EnumC143276dS A09 = c45441KAc.A09();
                EnumC143276dS enumC143276dS2 = EnumC143276dS.A0U;
                InterfaceC09390do interfaceC09390do2 = c45441KAc.A07;
                UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do2);
                if (C18U.A06(AbstractC166997dE.A0U(A0r4), A0r4, 36315876928261792L)) {
                    enumC143276dS = EnumC143276dS.A0S;
                } else {
                    enumC143276dS = EnumC143276dS.A0T;
                }
                List<EnumC143276dS> A1Q = AbstractC16960so.A1Q(A09, enumC143276dS2, enumC143276dS);
                JZ8 jz83 = AbstractC47193KtS.A01;
                UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do2);
                FragmentActivity requireActivity3 = c45441KAc.requireActivity();
                String str7 = c45441KAc.A01;
                if (str == null) {
                    str6 = "ig_music_search_avatar_toggle";
                } else {
                    str6 = "mux_banner";
                }
                C48240LWp c48240LWp2 = new C48240LWp(c45441KAc, 8);
                ArrayList A0q = AbstractC167017dG.A0q(A1Q);
                for (EnumC143276dS enumC143276dS3 : A1Q) {
                    A0q.add(EnumC143276dS.A01.A00(enumC143276dS3, c45441KAc.A00, AbstractC166987dD.A0r(interfaceC09390do2), false));
                }
                jz83.A03(requireActivity3, c48240LWp2, A0r5, str7, str6, null, null, str, A0q, true, false);
                return;
            }
            if (this instanceof C45446KAh) {
                C45446KAh c45446KAh = (C45446KAh) this;
                jz82 = AbstractC47193KtS.A01;
                A0r2 = AbstractC166987dD.A0r(c45446KAh.A0K);
                requireActivity2 = c45446KAh.requireActivity();
                str4 = c45446KAh.A05;
                if (str == null) {
                    str5 = "ig_direct_thread_sticker_tray_from_grid";
                } else {
                    str5 = "mux_banner";
                }
                i = 6;
                c45445KAg = c45446KAh;
            } else if (this instanceof C45445KAg) {
                C45445KAg c45445KAg2 = (C45445KAg) this;
                jz82 = AbstractC47193KtS.A01;
                A0r2 = AbstractC166987dD.A0r(c45445KAg2.A07);
                requireActivity2 = c45445KAg2.requireActivity();
                str4 = c45445KAg2.A01;
                if (str == null) {
                    str5 = "ig_stories_creation_avatar_sticker_sheet";
                } else {
                    str5 = "mux_banner";
                }
                i = 5;
                c45445KAg = c45445KAg2;
            } else {
                if (!(this instanceof C45440KAb)) {
                    return;
                }
                C45440KAb c45440KAb = (C45440KAb) this;
                jz8 = AbstractC47193KtS.A01;
                InterfaceC09390do interfaceC09390do3 = c45440KAb.A04;
                A0r = AbstractC166987dD.A0r(interfaceC09390do3);
                requireActivity = c45440KAb.requireActivity();
                str2 = c45440KAb.A00;
                if (str == null) {
                    str3 = AbstractC111324zv.A00(4586);
                } else {
                    str3 = "mux_banner";
                }
                c48240LWp = new C48240LWp(c45440KAb, 1);
                C149736oQ c149736oQ2 = EnumC143276dS.A01;
                UserSession A0r6 = AbstractC166987dD.A0r(interfaceC09390do3);
                A1J = AbstractC166987dD.A1J(c149736oQ2.A00(c45440KAb.A09(), EnumC143286dT.A05, A0r6, false));
            }
            jz82.A02(requireActivity2, new C48240LWp(c45445KAg, i), A0r2, str4, str5, str);
            return;
        }
        jz8.A04(requireActivity, c48240LWp, A0r, str2, str3, str, A1J);
    }

    public final boolean A0M() {
        if (this instanceof C45446KAh) {
            C45446KAh c45446KAh = (C45446KAh) this;
            if (!AbstractC167007dF.A1Z(c45446KAh.A0H) && !AbstractC167007dF.A1Z(c45446KAh.A0G)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AbstractC45465KBa() {
        C50254MHj A02 = C50254MHj.A02(this, 38);
        C50254MHj A022 = C50254MHj.A02(this, 32);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C50254MHj.A00(A022, enumC09460dv, 33);
        this.A0T = AbstractC25225BEi.A0a(C50254MHj.A02(A00, 34), A02, new MHV(39, (Object) null, A00), AbstractC25225BEi.A1D(C44543Jmn.class));
        C50254MHj A023 = C50254MHj.A02(this, 31);
        InterfaceC09390do A002 = C50254MHj.A00(C50254MHj.A02(this, 35), enumC09460dv, 36);
        this.A0R = AbstractC25225BEi.A0a(C50254MHj.A02(A002, 37), A023, new MHV(40, (Object) null, A002), AbstractC25225BEi.A1D(C148236lt.class));
        this.A0N = true;
        this.A06 = AbstractC31171DnF.A0E();
        this.A00 = 3;
        this.A0G = true;
        this.A0U = new C47251KuO(this);
        this.A0P = ViewOnTouchListenerC48081LQg.A00;
    }

    public static void A01(C0Zx c0Zx, Long l, int i, boolean z, boolean z2) {
        c0Zx.A03("is_avatar_sticker", Boolean.valueOf(z));
        c0Zx.A03("is_social_sticker", Boolean.valueOf(z2));
        c0Zx.A05("page_number", Long.valueOf(i));
        c0Zx.A05("result_size", l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC70653Fc A06() {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int i;
        Resources A0N = AbstractC166997dE.A0N(this);
        if (this.A00 == 3) {
            dimensionPixelSize = A0N.getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
            dimensionPixelSize2 = A0N.getDimensionPixelOffset(R.dimen.asset_picker_cell_margin);
            dimensionPixelSize3 = A0N.getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
        } else {
            dimensionPixelSize = A0N.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            dimensionPixelSize2 = A0N.getDimensionPixelSize(R.dimen.abc_control_corner_material);
            dimensionPixelSize3 = A0N.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        }
        int i2 = this.A00;
        if (this instanceof C45441KAc) {
            i = ((C45441KAc) this).A02;
        } else {
            i = this.A0H;
        }
        return new C46055KaC(A0N, i2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, i);
    }

    public final void A0J(C148286ly c148286ly) {
        AbstractC43593JPy.A0K(this).A03(c148286ly);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0S);
        C6XJ A02 = C6XJ.A02(requireActivity(), AbstractC167017dG.A0T("unlockable_sticker_type", EnumC46137Kbb.A02, AbstractC166987dD.A1L("unlockable_sticker_id", c148286ly.A0S)), A0o, TransparentModalActivity.class, "attribution_quick_camera_fragment");
        AbstractC31179DnN.A1S(A02);
        A02.A0D(this, 60571);
    }

    public void A0L(List list) {
        A02(null, null, this, AbstractC31171DnF.A0E(), list, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1719272859);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_sticker_grid_fragment, viewGroup, false);
        C0f9.A09(287638897, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int A02 = C0f9.A02(1260224594);
        if (isAdded()) {
            AbstractC43593JPy.A0K(this).A0H.markerEnd(129908197, (short) 4);
        }
        super.onDestroy();
        C0f9.A09(1681866342, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(1303607860);
        super.onDestroyView();
        this.A0A = null;
        A07().A0a();
        C0f9.A09(741342942, A02);
    }

    public static void A00(C0Zx c0Zx, C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, String str, String str2) {
        if (C18U.A06(c06090Tz, abstractC12990ll, 36329118312251416L)) {
            c0Zx.A06(AbstractC111324zv.A00(3989), str);
            c0Zx.A06("avatar_revision_id", str2);
        }
    }
}
