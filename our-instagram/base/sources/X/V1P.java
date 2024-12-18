package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes11.dex */
public final class V1P extends AbstractC59962oe implements InterfaceC1119153d, InterfaceC62892tS {
    public static final String __redex_internal_original_name = "PromoteEducationDrawerBottomSheetFragment";
    public VG4 A00;
    public VG4 A01;
    public C70399WUb A02;
    public UB9 A03;
    public XCN A04;
    public PromoteData A05;
    public PromoteState A06;
    public ReboundViewPager A07;
    public CirclePageIndicator A08;
    public Integer A09 = C05F.A00;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_education_drawer_bottom_sheet_fragment";
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e7, code lost:
    
        if (r3.A0d == null) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1P.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        XCN xcn;
        Fragment v0w;
        int intValue = this.A09.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            xcn = this.A04;
                            if (xcn != null) {
                                AbstractC65702TsY.A0q();
                                v0w = new C67872V0d();
                            } else {
                                return;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        xcn = this.A04;
                        if (xcn == null) {
                            return;
                        }
                        AbstractC65702TsY.A0q();
                        if (this.A05 != null) {
                            v0w = new V0X();
                        }
                        C14360o3.A0F("promoteData");
                        throw C00O.createAndThrow();
                    }
                } else {
                    xcn = this.A04;
                    if (xcn == null) {
                        return;
                    }
                    C69798Vvi A02 = AbstractC155756z4.A00().A02();
                    PromoteData promoteData = this.A05;
                    if (promoteData != null) {
                        C14360o3.A06(promoteData.A0y);
                        v0w = A02.A06(false);
                    }
                    C14360o3.A0F("promoteData");
                    throw C00O.createAndThrow();
                }
            } else {
                xcn = this.A04;
                if (xcn == null) {
                    return;
                }
                AbstractC65702TsY.A0q();
                v0w = new V0W();
            }
            xcn.Cs8(v0w);
            return;
        }
        XCN xcn2 = this.A04;
        if (xcn2 == null) {
            return;
        }
        xcn2.Czv();
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
        C70399WUb c70399WUb = this.A02;
        if (c70399WUb != null) {
            VG4 vg4 = this.A00;
            if (vg4 == null) {
                C14360o3.A0F("currentScreen");
                throw C00O.createAndThrow();
            }
            c70399WUb.A0S(vg4.toString(), "exit_education_drawer");
        }
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
        UB9 ub9 = this.A03;
        String str = "pageAdapter";
        if (ub9 != null) {
            VG4 vg4 = ((PromoteBottomSheetSlideCardViewModel) ub9.A04.get(i)).A02;
            if (vg4 != null) {
                this.A00 = vg4;
                UB9 ub92 = this.A03;
                if (ub92 != null) {
                    String str2 = ((PromoteBottomSheetSlideCardViewModel) ub92.A04.get(i)).A06;
                    if (str2 != null) {
                        C70399WUb c70399WUb = this.A02;
                        if (c70399WUb != null) {
                            VG4 vg42 = this.A00;
                            if (vg42 == null) {
                                str = "currentScreen";
                            } else {
                                c70399WUb.A0I(vg42, str2);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        str = "promoteComponentValue";
                    }
                }
            } else {
                str = "promoteScreen";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0A.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1159962503);
        super.onCreate(bundle);
        VG4 vg4 = (VG4) requireArguments().get(OptSvcAnalyticsStore.LOGGING_KEY_STEP);
        C14360o3.A0A(vg4);
        this.A01 = vg4;
        C0f9.A09(1709287786, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1736036053);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_education_drawer_bottom_sheet_view, viewGroup, false);
        C0f9.A09(-1331450623, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1514505882);
        super.onDestroyView();
        ReboundViewPager reboundViewPager = this.A07;
        String str = "viewPager";
        if (reboundViewPager != null) {
            CirclePageIndicator circlePageIndicator = this.A08;
            if (circlePageIndicator == null) {
                str = "pageIndicator";
            } else {
                reboundViewPager.A0Q(circlePageIndicator);
                ReboundViewPager reboundViewPager2 = this.A07;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0Q(this);
                    this.A02 = null;
                    C0f9.A09(51918041, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
