package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ELG extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "InspirationHubFragment";
    public int A00;
    public C1I4 A01;
    public C56352iT A02;
    public YE3 A03;
    public W65 A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public C31500Dsk A0B;
    public boolean A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A07) {
            str = requireContext().getString(2131970751);
        } else {
            str = "";
        }
        interfaceC56362iU.setTitle(str);
        String str2 = this.A05;
        if (str2 != null) {
            if (str2.equals("onboarding_checklist")) {
                C31722DwR.A01(ViewOnClickListenerC35690FpP.A00(this, 52), interfaceC56362iU, new Object());
            }
            C3LO A0B = AbstractC31171DnF.A0B();
            String str3 = this.A05;
            if (str3 != null) {
                boolean equals = str3.equals("ads_manager");
                int i = R.drawable.instagram_arrow_back_24;
                if (equals) {
                    i = R.drawable.instagram_x_pano_outline_24;
                }
                A0B.A01(i);
                ViewOnClickListenerC35690FpP.A02(A0B, interfaceC56362iU, this, 53);
                return;
            }
        }
        C14360o3.A0F("entryPoint");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "inspiration_hub_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BaseFragmentActivity baseFragmentActivity;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.loading_spinner);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.recycler_view);
        FragmentActivity activity = getActivity();
        if ((activity instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) activity) != null) {
            baseFragmentActivity.A0a();
        }
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), ((C44499Jm5) this.A0E.getValue()).A00, new C50372MLz(24, A0S, this, view, A0S2), 48);
    }

    public static final void A02(ELG elg) {
        String str;
        YE3 ye3 = elg.A03;
        if (ye3 == null) {
            str = "logger";
        } else {
            ye3.A06("pro_inspiration_grid", "call_to_action", EnumC39614HeO.A03.toString(), null);
            String str2 = elg.A05;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                if (str2.equals("onboarding_checklist")) {
                    A04(elg, false);
                }
                Object obj = elg.mParentFragment;
                boolean z = obj instanceof InterfaceC53892dT;
                String A00 = AbstractC43591JPw.A00(22);
                if (!z) {
                    obj = elg.getRootActivity();
                }
                C14360o3.A0C(obj, A00);
                ((InterfaceC53892dT) obj).FBp(new PositionConfig(null, new CameraConfiguration(C128535rM.A00, C16910sj.A00), null, "inspiration_hub_create_post", null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(ELG elg) {
        String str;
        YE3 ye3 = elg.A03;
        if (ye3 == null) {
            str = "logger";
        } else {
            ye3.A06("pro_inspiration_grid", "call_to_action", EnumC39614HeO.A04.toString(), null);
            String str2 = elg.A05;
            str = "entryPoint";
            if (str2 != null) {
                if (str2.equals("onboarding_checklist")) {
                    A04(elg, false);
                }
                C1Y6 A00 = AbstractC69888VxF.A00();
                UserSession A0r = AbstractC166987dD.A0r(elg.A0D);
                FragmentActivity requireActivity = elg.requireActivity();
                String str3 = elg.A05;
                if (str3 != null) {
                    A00.A09(requireActivity, A0r, str3);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A04(ELG elg, boolean z) {
        C31500Dsk c31500Dsk = elg.A0B;
        if (c31500Dsk == null) {
            C14360o3.A0F("onboardingChecklistNetworkHelper");
            throw C00O.createAndThrow();
        }
        c31500Dsk.A01(new EUO(2, elg, z), C05F.A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0C) {
            YE3 ye3 = this.A03;
            if (ye3 == null) {
                AbstractC31171DnF.A0s();
                throw C00O.createAndThrow();
            }
            ye3.A03("pro_inspiration_grid");
            this.A0C = false;
        }
        return false;
    }

    public ELG() {
        X31 x31 = new X31(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X31(new X31(this, 44), 45));
        this.A0E = AbstractC25225BEi.A0a(new X31(A00, 46), x31, new C57253Pbb(24, null, A00), AbstractC25225BEi.A1D(C44499Jm5.class));
        this.A0D = AbstractC60492pY.A02(this);
    }

    public static final void A00(EnumC39614HeO enumC39614HeO, ELG elg, C38321qM c38321qM, String str, int i) {
        Context requireContext;
        int i2;
        String string;
        List list;
        ArrayList A1E;
        C47758L7e c47758L7e;
        if (elg.getActivity() != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", true);
            A0b.putString(AbstractC111324zv.A00(1255), enumC39614HeO.toString());
            A0b.putString("call_to_action_button_text", str);
            String str2 = elg.A05;
            if (str2 == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            AbstractC31171DnF.A13(A0b, str2);
            C140966Yy A0c = AbstractC25231BEo.A0c(elg.requireActivity(), elg.A0D);
            if (elg.A06 != null) {
                A0c.A06();
            }
            int ordinal = enumC39614HeO.ordinal();
            if (ordinal != 1) {
                if (ordinal != 0) {
                    string = "";
                    String id = c38321qM.getId();
                    list = (List) ((C44499Jm5) elg.A0E.getValue()).A02.getValue();
                    if (list == null && (c47758L7e = (C47758L7e) list.get(i)) != null) {
                        A1E = AbstractC166987dD.A1E();
                        Iterator it = c47758L7e.A04.iterator();
                        while (it.hasNext()) {
                            String id2 = AbstractC31172DnG.A0i(it).getId();
                            if (id2 != null) {
                                A1E.add(id2);
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    } else {
                        A1E = AbstractC166987dD.A1E();
                    }
                    ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
                    contextualFeedFragment.setArguments(C31569Dtv.A05(A0b, "BUSINESS_INSPIRATION_HUB", string, id, "feed_contextual_business_inspiration_hub", null, null, A1E, false, true, true, false));
                    AbstractC31175DnJ.A0s(null, contextualFeedFragment, A0c);
                }
                requireContext = elg.requireContext();
                i2 = 2131970752;
            } else {
                requireContext = elg.requireContext();
                i2 = 2131970753;
            }
            string = requireContext.getString(i2);
            String id3 = c38321qM.getId();
            list = (List) ((C44499Jm5) elg.A0E.getValue()).A02.getValue();
            if (list == null) {
            }
            A1E = AbstractC166987dD.A1E();
            ContextualFeedFragment contextualFeedFragment2 = new ContextualFeedFragment();
            contextualFeedFragment2.setArguments(C31569Dtv.A05(A0b, "BUSINESS_INSPIRATION_HUB", string, id3, "feed_contextual_business_inspiration_hub", null, null, A1E, false, true, true, false));
            AbstractC31175DnJ.A0s(null, contextualFeedFragment2, A0c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.EnumC39614HeO r3, X.ELG r4, java.lang.String r5) {
        /*
            int r1 = r3.ordinal()
            r3 = 1
            java.lang.String r2 = "actionButtonHolder"
            if (r1 == r3) goto L18
            r0 = 0
            if (r1 != r0) goto L26
            X.W65 r1 = r4.A04
            if (r1 != 0) goto L1d
        L10:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L18:
            X.W65 r1 = r4.A04
            if (r1 == 0) goto L10
            r3 = 0
        L1d:
            X.Ftf r0 = new X.Ftf
            r0.<init>(r4, r3)
            X.AbstractC69913Vxe.A01(r0, r1, r5)
            return
        L26:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELG.A01(X.HeO, X.ELG, java.lang.String):void");
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnPause() {
        super.afterOnPause();
        if (this.A0C) {
            YE3 ye3 = this.A03;
            if (ye3 == null) {
                AbstractC31171DnF.A0s();
                throw C00O.createAndThrow();
            }
            ye3.A04("pro_inspiration_grid");
            this.A0C = false;
        }
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) rootActivity).EfL(this.A0A);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1980130385(0x76066451, float:6.814477E32)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r10)
            android.os.Bundle r7 = r9.mArguments
            if (r7 == 0) goto L86
            java.lang.String r0 = X.AbstractC31171DnF.A0Z(r7)
            if (r0 != 0) goto L16
            java.lang.String r0 = "unknown"
        L16:
            r9.A05 = r0
            X.0do r5 = r9.A0D
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r5)
            X.YE3 r0 = X.AbstractC151606s6.A02(r0)
            r9.A03 = r0
            java.lang.String r1 = r9.A05
            java.lang.String r8 = "entryPoint"
            if (r1 == 0) goto L103
            int r0 = r1.hashCode()
            r6 = 0
            switch(r0) {
                case -1600601123: goto Lea;
                case -1437908653: goto Le7;
                case -1008887324: goto Le4;
                case 812547870: goto Ld9;
                default: goto L32;
            }
        L32:
            java.lang.String r0 = "should_show_promotion_content"
            boolean r0 = r7.getBoolean(r0, r6)
        L38:
            r9.A09 = r0
            java.lang.String r0 = "media_id"
            java.lang.String r0 = r7.getString(r0)
            r9.A06 = r0
            java.lang.String r0 = "ARG_CHECKLIST_ITEM_COMPLETED"
            boolean r0 = r7.getBoolean(r0, r6)
            r9.A08 = r0
            X.0ll r4 = X.AbstractC166987dD.A0o(r5)
            java.lang.String r5 = r9.A05
            if (r5 == 0) goto L103
            X.C14360o3.A0B(r4, r6)
            java.lang.String r0 = "onboarding_checklist"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto La0
            boolean r0 = X.AbstractC151876sX.A05(r4)
            if (r0 == 0) goto L70
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315039409376214(0x81045600000bd6, double:3.0291153791915135E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L83
        L70:
            boolean r0 = X.AbstractC151876sX.A06(r4)
            if (r0 == 0) goto La0
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315043704343512(0x81045700000bd8, double:3.029118095346127E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto La0
        L83:
            r0 = 1
        L84:
            r9.A07 = r0
        L86:
            X.0do r0 = r9.A0D
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            X.Dsk r0 = new X.Dsk
            r0.<init>(r1, r9)
            r9.A0B = r0
            X.2iT r0 = X.AbstractC31177DnL.A0L(r9)
            r9.A02 = r0
            r0 = 222942698(0xd49d5ea, float:6.2195397E-31)
            X.C0f9.A09(r0, r3)
            return
        La0:
            java.lang.String r0 = "pro_dash"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Lb0
            java.lang.String r0 = "deep_link"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld7
        Lb0:
            boolean r0 = X.AbstractC151876sX.A07(r4)
            if (r0 == 0) goto Lc3
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 2342158048623135703(0x2081045600010bd7, double:4.061379720239075E-152)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L83
        Lc3:
            boolean r0 = X.AbstractC151876sX.A06(r4)
            if (r0 == 0) goto Ld7
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315043704409049(0x81045700010bd9, double:3.029118095387573E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto Ld7
            goto L83
        Ld7:
            r0 = 0
            goto L84
        Ld9:
            java.lang.String r0 = "ads_manager"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            r0 = 1
            goto L38
        Le4:
            java.lang.String r0 = "pro_dash"
            goto Lec
        Le7:
            java.lang.String r0 = "b2b_netego_see_all"
            goto Lec
        Lea:
            java.lang.String r0 = "b2b_netego"
        Lec:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            X.0ll r4 = X.AbstractC25230BEn.A0k(r5, r6)
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36312724422067445(0x81023b000104f5, double:3.0276513718957423E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            goto L38
        L103:
            X.C14360o3.A0F(r8)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELG.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-353299984);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_fragment, viewGroup, false);
        C0f9.A09(36711253, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(638659075);
        super.onResume();
        if (!this.A0C) {
            YE3 ye3 = this.A03;
            if (ye3 == null) {
                str = "logger";
            } else {
                String str2 = this.A05;
                if (str2 == null) {
                    str = "entryPoint";
                } else {
                    ye3.A05("pro_inspiration_grid", str2);
                    this.A0C = true;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            this.A0A = ((InterfaceC53712dA) rootActivity).C4u();
            ComponentCallbacks2 rootActivity2 = getRootActivity();
            C14360o3.A0C(rootActivity2, "null cannot be cast to non-null type com.instagram.base.activity.tabactivity.TabWidgetVisibilityDelegate");
            ((InterfaceC53712dA) rootActivity2).EfL(8);
        }
        C0f9.A09(-1868715099, A02);
    }
}
