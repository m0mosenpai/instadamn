package X;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public class UF1 extends Fragment implements InterfaceC65382TjF, InterfaceC65379TjC {
    public static final SparseArray A09;
    public Dialog A00;
    public ProgressBar A01;
    public C66420UGp A02;
    public UFZ A03;
    public boolean A04;
    public boolean A05;
    public final C58252li A06;
    public final InterfaceC58362lv A07;
    public final InterfaceC09390do A08;

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, X.X9i] */
    static {
        SparseArray sparseArray = new SparseArray();
        A09 = sparseArray;
        WFY.A02();
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme), null, 0), 0);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme_BSCSectionHeader), null, 0), 28);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme), null, 0), 19);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme_BSCCenteredText_BSCDetailsHeaderTheme), null, 0), 17);
        WFY.A03(sparseArray, new WbD(null, WFY.A01(R.style.BSCIGTheme_BSCCenteredText), new Wb4(R.style.BSCIGTheme_BSCIconView), 0), 20);
        WFY.A03(sparseArray, new WbD(null, new Wb4(R.style.BSCIGTheme), null, 0), 52);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme), null, 0), 1);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme_BSCBody), null, 0), 30);
        WFY.A03(sparseArray, new WbD(WFY.A01(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), null, 0), 27);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme), null, 0), 2);
        WFY.A03(sparseArray, new WbD(null, WFY.A01(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), 0), 23);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), null, 0), 3);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), null, 0), 21);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), null, R.style.BSCIGTheme), 15);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(WFY.A01(R.style.BSCIGTheme), WFY.A01(R.style.BSCIGTheme), new Wb4(R.style.BSCIGTheme_BSCIconView), R.style.BSCIGTheme), 6);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), null, 0), 7);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme_MediumUserProfileIcon), new Wb5(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), null, 0), 43);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme_MediumUserProfileLogo), new Wb5(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), null, 0), 49);
        WFY.A03(sparseArray, new WbC(WFY.A01(R.style.BSCIGTheme), new Wb3(R.style.BSCIGTheme)), 12);
        WFY.A03(sparseArray, new Wb9(R.style.BSCIGTheme_BSCDivider), 4);
        WFY.A03(sparseArray, new Object(), 31);
        WFY.A03(sparseArray, new WbD(null, WFY.A01(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), 0), 8);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), new Wb5(R.style.BSCIGTheme), 0), 9);
        WFY.A03(sparseArray, new WbD(null, WFY.A01(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), 0), 10);
        WFY.A03(sparseArray, new WbD(null, WFY.A01(R.style.BSCIGTheme_BSCEarningDetailsTableLabel), new Wb5(R.style.BSCIGTheme_BSCEarningDetailTableAmount), 0), 18);
        WFY.A03(sparseArray, new WbD(WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme), new Wb5(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme), null, 0), 29);
        WFY.A03(sparseArray, new WbD(null, new Wb3(R.style.BSCIGTheme), null, 0), 11);
        WFY.A03(sparseArray, new WbD(null, new Wb3(R.style.BSCIGTheme), null, 0), 54);
        ?? obj = new Object();
        WFY.A02();
        WFY.A03(sparseArray, new WbD(null, obj, new Wb4(R.style.BSCIGTheme), 0), 13);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), null, 0), 14);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), new Wb6(R.style.BSCIGTheme), 0), 16);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme_BSCCenteredText), null, 0), 24);
        WFY.A03(sparseArray, new WbD(null, new Wb5(R.style.BSCIGTheme_BSCCenteredText), null, 0), 53);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), new Wb5(R.style.BSCIGTheme), R.style.BSCIGTheme), 22);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), new Wb5(R.style.BSCIGTheme), R.style.BSCIGTheme), 32);
        Wb7 wb7 = new Wb7(R.style.BSCIGTheme_ComponentStatusTimelineIconTheme);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(wb7, new Wb5(R.style.BSCIGTheme_ComponentStatusTimelineTextTheme), null, 0), 25);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme_EarningProfileIcon), WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), new Wb4(R.style.BSCIGTheme_BSCIconView), 0), 5);
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme_EarningProfileImage), WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), new Wb4(R.style.BSCIGTheme_BSCIconView), 0), 37);
        sparseArray.put(48, new WbD(WFY.A00(R.style.BSCIGTheme_EarningProfileLogoImage), WFY.A01(R.style.BSCIGTheme_BSCTextComponentDoubleLineBaseTheme_ListTextComponent), new Wb4(R.style.BSCIGTheme_BSCIconView), 0));
        SparseArray A00 = VNR.A00();
        int size = A00.size();
        for (int i = 0; i < size; i++) {
            AbstractC65702TsY.A10(A00, sparseArray, i);
        }
        WFY.A02();
        WFY.A03(sparseArray, new WbA(sparseArray, R.style.BSCIGTheme), 39);
        WFY.A03(sparseArray, new WbD(null, WFY.A01(0), new Wb4(R.style.BSCIGTheme), R.style.BSCIGTheme), 40);
        WFY.A03(sparseArray, new WbD(null, new Wb5(0), null, R.style.BSCIGTheme), 41);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(null, new Wb3(R.style.BSCIGTheme), null, R.style.BSCIGTheme), 42);
        WFY.A03(sparseArray, new WbD(null, new Wb5(0), null, R.style.BSCIGTheme), 45);
        WFY.A03(sparseArray, new WbD(null, new Wb5(0), null, R.style.BSCIGTheme), 46);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme), new Wb5(R.style.BSCIGTheme), null, R.style.BSCIGTheme), 47);
        WFY.A03(sparseArray, new Wb9(R.style.BSCIGTheme), 50);
        WFY.A03(sparseArray, new WbA(sparseArray, R.style.BSCIGTheme), 51);
        sparseArray.put(55, new WbB(R.style.BSCIGTheme));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        bundle.putBoolean("is_display_logged", this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C2GT c2gt;
        C14360o3.A0B(view, 0);
        AbstractC31174DnI.A1C(view, C2FP.A02().A07().A00(requireContext(), 19));
        this.A02 = new C66420UGp(A09);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.content_view);
        C66420UGp c66420UGp = this.A02;
        String str = "itemAdapter";
        if (c66420UGp != null) {
            c66420UGp.registerAdapterDataObserver(new UH2(recyclerView, 3));
            C66420UGp c66420UGp2 = this.A02;
            if (c66420UGp2 != null) {
                recyclerView.setAdapter(c66420UGp2);
                AbstractC31174DnI.A15(getActivity(), recyclerView);
                recyclerView.setOverScrollMode(2);
                recyclerView.A14(new C65986Txf(this, 2));
                ProgressBar progressBar = (ProgressBar) view.requireViewById(R.id.progress_bar);
                this.A01 = progressBar;
                if (progressBar == null) {
                    str = "progressBar";
                } else {
                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                    if (indeterminateDrawable != null) {
                        indeterminateDrawable.setColorFilter(AbstractC46530KiV.A00(C05F.A05, C2FP.A02().A07().A00(requireContext(), 20)));
                    }
                    UFZ A01 = A01();
                    if (A01 instanceof C67717Uwi) {
                        c2gt = ((C67717Uwi) A01).A06;
                    } else if (A01 instanceof C67712Uwd) {
                        c2gt = ((C67712Uwd) A01).A05;
                    } else if (A01 instanceof C67709Uwa) {
                        c2gt = ((C67709Uwa) A01).A01;
                    } else {
                        if (A01 instanceof C67715Uwg) {
                            c2gt = ((C67715Uwg) A01).A00;
                        } else if (A01 instanceof C67714Uwf) {
                            c2gt = ((C67714Uwf) A01).A00;
                        } else if (A01 instanceof C67681Uvy) {
                            c2gt = ((C67681Uvy) A01).A04;
                        } else if (A01 instanceof C67680Uvx) {
                            c2gt = ((C67680Uvx) A01).A07;
                        } else if (A01 instanceof C67679Uvu) {
                            c2gt = ((C67679Uvu) A01).A00;
                        } else if (A01 instanceof Uvw) {
                            c2gt = ((Uvw) A01).A05;
                        } else if (A01 instanceof Uvv) {
                            c2gt = ((Uvv) A01).A00;
                        } else if (A01 instanceof C67716Uwh) {
                            c2gt = ((C67716Uwh) A01).A06;
                        } else if (A01 instanceof C67713Uwe) {
                            c2gt = ((C67713Uwe) A01).A04;
                        } else {
                            c2gt = ((C67711Uwc) A01).A02;
                        }
                        if (c2gt == null) {
                            str = "_dataModelsLiveData";
                        }
                    }
                    AbstractC31180DnO.A1F(this, c2gt, new X59(this, 32), 17);
                    AbstractC31180DnO.A1F(this, A01().A05, new X59(this, 33), 17);
                    AbstractC31180DnO.A1F(this, A01().A03, new X59(this, 34), 17);
                    AbstractC31180DnO.A1F(this, A01().A08, new X59(this, 35), 17);
                    AbstractC31180DnO.A1F(this, A01().A04, new X59(this, 36), 17);
                    this.A06.A0E(A01().A07, this.A07);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final UFZ A01() {
        UFZ ufz = this.A03;
        if (ufz != null) {
            return ufz;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r5.mParentFragment == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A02() {
        /*
            r5 = this;
            android.os.Bundle r1 = r5.mArguments
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L98
            java.lang.String r0 = "viewmodel_class"
            int r2 = r1.getInt(r0)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L92
            r0 = 284(0x11c, float:3.98E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L21
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            r5.A05 = r0
            X.WFY r1 = X.C2FP.A02()
            boolean r0 = r5.A05
            if (r0 == 0) goto L90
            androidx.fragment.app.Fragment r0 = r5.requireParentFragment()
        L30:
            X.C14360o3.A0A(r0)
            X.2bZ r1 = r1.A05(r0, r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel"
            X.C14360o3.A0C(r1, r0)
            X.UFZ r1 = (X.UFZ) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r5.A03 = r1
            X.UFZ r0 = r5.A01()
            boolean r0 = r0.A01
            if (r0 != 0) goto L8d
            X.UFZ r1 = r5.A01()
            android.os.Bundle r0 = r5.mArguments
            r1.A09(r0)
            boolean r0 = A00(r5)
            if (r0 == 0) goto L8d
            X.0do r4 = r5.A08
            java.lang.Object r3 = r4.getValue()
            X.UFY r3 = (X.UFY) r3
            android.os.Bundle r2 = r5.mArguments
            r0 = 0
            if (r2 == 0) goto L8e
            X.UFZ r0 = r5.A01()
            java.lang.String r1 = r0.A08()
            java.lang.String r0 = "parent_view_name"
            r2.putString(r0, r1)
        L75:
            r3.A03(r2)
            X.UFZ r1 = r5.A01()
            boolean r0 = r1 instanceof X.InterfaceC71900X9k
            if (r0 == 0) goto L8d
            X.X9k r1 = (X.InterfaceC71900X9k) r1
            if (r1 == 0) goto L8d
            java.lang.Object r0 = r4.getValue()
            X.UFY r0 = (X.UFY) r0
            r1.COL(r0)
        L8d:
            return
        L8e:
            r2 = r0
            goto L75
        L90:
            r0 = r5
            goto L30
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UF1.A02():void");
    }

    @Override // X.InterfaceC65379TjC
    public final /* bridge */ /* synthetic */ C58252li C8v() {
        return this.A06;
    }

    public UF1() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2x(new X2x(this, 22), 23));
        C0YZ c0yz = new C0YZ(UFY.class);
        this.A08 = new C60842q8(new X2x(A00, 24), new C57533Pg7(40, A00, this), new C57533Pg7(39, null, A00), c0yz);
        this.A06 = new C58252li();
        this.A07 = new C70303WQi(this, 2);
    }

    public static final boolean A00(UF1 uf1) {
        if (C18U.A06(C06090Tz.A05, C2FP.A02().A08().A00, 36316177575710816L) && (uf1.A01() instanceof InterfaceC71900X9k)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        short s;
        int A0K;
        int i;
        String str;
        short s2;
        int i2;
        UFZ A01 = A01();
        if (A01 instanceof C67717Uwi) {
            s = 615;
            String str2 = ((C67717Uwi) A01).A05;
            if (str2 == null) {
                str = "payoutReleaseID";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A0K = AbstractC167017dG.A0K(AbstractC003100w.A0i(str2));
            C2FP.A02();
            i = 667750653;
            AbstractC70159WDv.A02(i, A0K, s);
            return false;
        }
        if (A01 instanceof C67681Uvy) {
            s2 = 615;
            C2FP.A02();
            i2 = 667758015;
        } else if (A01 instanceof C67680Uvx) {
            s2 = 615;
            C2FP.A02();
            i2 = 667749724;
        } else if (A01 instanceof Uvw) {
            s2 = 615;
            C2FP.A02();
            i2 = 667754853;
        } else {
            if (!(A01 instanceof C67716Uwh)) {
                return false;
            }
            s = 615;
            String str3 = ((C67716Uwh) A01).A05;
            if (str3 == null) {
                str = "payoutRecordID";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A0K = AbstractC167017dG.A0K(AbstractC003100w.A0i(str3));
            C2FP.A02();
            i = 667750821;
            AbstractC70159WDv.A02(i, A0K, s);
            return false;
        }
        AbstractC70159WDv.A02(i2, 0, s2);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(-331036352);
        super.onCreate(bundle);
        if (this.A03 == null) {
            if (bundle != null) {
                z = bundle.getBoolean("is_display_logged");
            } else {
                z = false;
            }
            this.A04 = z;
            A02();
            if (bundle == null) {
                UFZ A01 = A01();
                if (A01 instanceof C67717Uwi) {
                    C67717Uwi.A04((C67717Uwi) A01, "client_load_payouthub_init", null, null);
                } else if (A01 instanceof C67712Uwd) {
                    C67712Uwd.A01((C67712Uwd) A01, "client_load_payouthub_init", false);
                } else if (A01 instanceof C67681Uvy) {
                    C67681Uvy.A05((C67681Uvy) A01, "client_load_payouthub_init");
                } else if (A01 instanceof C67680Uvx) {
                    C67680Uvx.A04((C67680Uvx) A01, "client_load_payouthub_init", null);
                } else if (A01 instanceof C67679Uvu) {
                    C67679Uvu.A01((C67679Uvu) A01, "client_load_payouthub_init", null, null);
                } else if (A01 instanceof Uvw) {
                    Uvw.A03((Uvw) A01, "client_load_payouthub_init", null);
                } else if (A01 instanceof Uvv) {
                    Uvv.A01((Uvv) A01, "client_load_payouthub_init");
                } else if (A01 instanceof C67716Uwh) {
                    C67716Uwh.A03((C67716Uwh) A01, "client_load_payouthub_init", null);
                } else if (A01 instanceof C67713Uwe) {
                    C67713Uwe.A01((C67713Uwe) A01, "client_load_payouthub_init", null, null);
                } else if (A01 instanceof C67711Uwc) {
                    C67711Uwc.A01((C67711Uwc) A01, "client_load_payouthub_init", null, null);
                }
            }
        }
        this.mLifecycleRegistry.A09(A01());
        if (A00(this)) {
            this.mLifecycleRegistry.A09((UFY) this.A08.getValue());
        }
        C0f9.A09(-1883020514, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2139109854);
        C14360o3.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        WFY.A02();
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(activity, R.style.BSCIGTheme)).inflate(R.layout.fragment_list_section, viewGroup, false);
        C0f9.A09(-210400312, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1729255595);
        super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        C0f9.A09(-1059330287, A02);
    }
}
