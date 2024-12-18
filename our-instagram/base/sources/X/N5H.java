package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import java.util.AbstractMap;

/* loaded from: classes9.dex */
public final class N5H extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "WallMediaPickerTabFragment";
    public ViewPager2 A00;
    public TabLayout A01;
    public InterfaceC154386wo A02;
    public C51393Mmy A03;
    public OBK A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        InterfaceC09390do interfaceC09390do = this.A07;
        int size = ((AbstractMap) AbstractC001800i.A0I(((C51014MgM) interfaceC09390do.getValue()).A02.Bn0())).size();
        String str = null;
        if (size > 0) {
            getString(2131976970, AbstractC25228BEl.A1Y(size));
            if (this.A04 == null) {
                C14360o3.A0F("pickerConfig");
                throw C00O.createAndThrow();
            }
        } else {
            str = getString(2131976969);
        }
        interfaceC56362iU.Ehk(str);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131968535);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC28666ClE(this, 47), A0B, interfaceC56362iU);
        interfaceC56362iU.ARk(0, C51014MgM.A00(interfaceC09390do));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        OBK obk = this.A04;
        if (obk == null) {
            str = "pickerConfig";
        } else {
            EnumC53206Ng4 enumC53206Ng4 = EnumC53206Ng4.A03;
            EnumC53206Ng4 enumC53206Ng42 = null;
            if (!obk.A00) {
                enumC53206Ng4 = null;
            }
            EnumC53206Ng4 enumC53206Ng43 = EnumC53206Ng4.A04;
            if (obk.A02) {
                enumC53206Ng42 = enumC53206Ng43;
            }
            this.A03 = new C51393Mmy(this, AbstractC16960so.A1R(enumC53206Ng4, enumC53206Ng42), new C30179DRk(this, 24));
            ViewPager2 viewPager2 = (ViewPager2) view.requireViewById(R.id.viewpager);
            C51393Mmy c51393Mmy = this.A03;
            if (c51393Mmy == null) {
                str = "tabPagerAdapter";
            } else {
                viewPager2.setAdapter(c51393Mmy);
                this.A00 = viewPager2;
                TabLayout tabLayout = (TabLayout) view.requireViewById(R.id.tab_layout);
                this.A01 = tabLayout;
                String str2 = "tabLayout";
                if (tabLayout != null) {
                    C51393Mmy c51393Mmy2 = this.A03;
                    str = "tabPagerAdapter";
                    if (c51393Mmy2 != null) {
                        int itemCount = c51393Mmy2.getItemCount();
                        int i = 0;
                        if (itemCount <= 1) {
                            i = 8;
                        }
                        tabLayout.setVisibility(i);
                        C51393Mmy c51393Mmy3 = this.A03;
                        if (c51393Mmy3 != null) {
                            if (c51393Mmy3.getItemCount() > 1) {
                                TabLayout tabLayout2 = this.A01;
                                if (tabLayout2 != null) {
                                    ViewPager2 viewPager22 = this.A00;
                                    if (viewPager22 == null) {
                                        str2 = "viewPager";
                                    } else {
                                        new JZX(viewPager22, tabLayout2, new C55798Oq9(this, 3)).A00();
                                    }
                                }
                            }
                            Object value = this.A07.getValue();
                            C07S c07s = C07S.STARTED;
                            C07X viewLifecycleOwner = getViewLifecycleOwner();
                            AbstractC166987dD.A1Z(new B5a(viewLifecycleOwner, c07s, value, this, null, 1), C07Y.A00(viewLifecycleOwner));
                            return;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public N5H() {
        DGU dgu = new DGU(this, 36);
        DGU dgu2 = new DGU(this, 33);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new DGU(dgu2, 34));
        this.A07 = AbstractC25225BEi.A0a(new DGU(A00, 35), dgu, new C29895DGj(28, null, A00), AbstractC25225BEi.A1D(C51014MgM.class));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new DGU(this, 32));
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(68547968);
        super.onCreate(bundle);
        this.A04 = AbstractC54297NzH.A00(AbstractC166987dD.A0r(this.A06));
        C0f9.A09(1675281050, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1357232537);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_wall_media_picker_tab, false);
        C0f9.A09(1801439457, A02);
        return A0R;
    }
}
