package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V0c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67871V0c extends AbstractC59962oe implements InterfaceC60122ou, XAF {
    public static final String __redex_internal_original_name = "PromoteCampaignControlsBudgetDurationFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public ViewStub A05;
    public FRW A06;
    public String A07;
    public int A08;
    public int A09;
    public int A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public final InterfaceC09390do A0J = X55.A00(this, 12);
    public final InterfaceC09390do A0G = X55.A00(this, 13);
    public final InterfaceC09390do A0F = AbstractC09440dt.A01(new X55(this, 11));
    public final InterfaceC09390do A0H = AbstractC09440dt.A01(new X55(this, 14));
    public final InterfaceC09390do A0E = AbstractC09440dt.A01(new X55(this, 10));
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        C14360o3.A0B(num, 1);
        if (num == C05F.A0Y || num == C05F.A0j) {
            A01(A00(this).A07, A00(this).A0A);
            int i = A00(this).A0I;
            A00(this).A0I = this.A02 + ((A00(this).A0A - this.A00) * A00(this).A07) + this.A01;
            boolean A0E = A00(this).A0E();
            A00(this).A0I = i;
            View view = this.A04;
            if (view != null) {
                view.setVisibility(AbstractC167007dF.A05(A0E ? 1 : 0));
                return;
            }
            if (!A0E) {
                return;
            }
            ViewStub viewStub = this.A05;
            if (viewStub != null) {
                viewStub.setVisibility(0);
                ViewStub viewStub2 = this.A05;
                if (viewStub2 != null) {
                    View inflate = viewStub2.inflate();
                    if (inflate != null) {
                        this.A04 = inflate;
                        View findViewById = inflate.findViewById(R.id.budget_ads_manager_link_text);
                        if (findViewById != null) {
                            WNT.A00(findViewById, 26, this);
                            View view2 = this.A04;
                            if (view2 != null) {
                                AbstractC167007dF.A0N(view2, R.id.budget_warning_text).setText(2131970427);
                                View view3 = this.A04;
                                if (view3 == null) {
                                    return;
                                }
                                view3.setVisibility(0);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C14360o3.A0F("budgetWarningViewStub");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970424);
        interfaceC56362iU.EkS(true);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A06 = frw;
        WNT.A01(frw, C05F.A1F, this, 25);
        FRW frw2 = this.A06;
        if (frw2 != null) {
            frw2.A01(true);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promotion_campaign_controls_budget_duration";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String A00;
        C14360o3.A0B(view, 0);
        AbstractC65703TsZ.A1K(this);
        InterfaceC09390do interfaceC09390do = this.A0H;
        ((PromoteState) interfaceC09390do.getValue()).A0A(this);
        this.A0D = (TextView) view.requireViewById(R.id.total_spend_value_view);
        this.A0B = (TextView) view.requireViewById(R.id.elapsed_spend_text_view);
        this.A0C = (TextView) view.requireViewById(R.id.remaining_spend_text_view);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("daily_spend_offset");
        if (string != null) {
            this.A08 = Integer.parseInt(string);
            this.A02 = requireArguments.getInt("spent_budget_offset_amount");
            this.A00 = requireArguments.getInt("elapsed_duration_in_days");
            this.A0A = requireArguments.getInt("total_duration_in_days");
            this.A03 = requireArguments.getInt("total_budget_offset_amount");
            this.A09 = requireArguments.getInt("remaining_duration_in_hours");
            this.A07 = requireArguments.getString("boosted_id");
            A00(this).A07 = this.A08;
            PromoteData A002 = A00(this);
            int i = this.A0A;
            A002.A0A = i;
            this.A01 = (this.A03 - this.A02) - (this.A08 * (i - this.A00));
            A00(this).A0I = A00(this).A07 * A00(this).A0A;
            int i2 = (this.A0A * 24) - this.A09;
            A01(A00(this).A07, A00(this).A0A);
            A00(this).A1n.add(0, 0);
            List list = A00(this).A1n;
            C14360o3.A06(list);
            Iterator it = AbstractC16960so.A1S(list).iterator();
            while (it.hasNext()) {
                int A003 = ((AbstractC16880sg) it).A00();
                List list2 = A00(this).A1n;
                list2.set(A003, Integer.valueOf(AbstractC31176DnK.A01(list2, A003) + A00(this).A07));
            }
            if (!AbstractC31175DnJ.A1U(A00(this).A07, A00(this).A1n)) {
                MSX.A0u(A00(this).A07, A00(this).A1n);
            }
            List list3 = A00(this).A1n;
            C14360o3.A06(list3);
            C01T.A1C(list3);
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do2 = this.A0I;
            UserSession userSession = (UserSession) interfaceC09390do2.getValue();
            VRU.A00(requireContext, new C69341Vln(view, "budget_slider"), A00(this), (PromoteState) interfaceC09390do.getValue(), userSession, WG3.A04(requireContext(), A00(this)));
            A00(this).A1o = new ArrayList();
            A00(this).A1o.add(0, Integer.valueOf(A00(this).A0A));
            UserSession userSession2 = A00(this).A0y;
            C14360o3.A06(userSession2);
            if (C18U.A06(C06090Tz.A05, userSession2, 36327894246505406L)) {
                List list4 = WG3.A01;
                ArrayList A0i = AbstractC167007dF.A0i(list4);
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    AbstractC166997dE.A1W(A0i, AbstractC167007dF.A0B(it2) + A00(this).A0A);
                }
                Iterator it3 = A0i.iterator();
                while (it3.hasNext()) {
                    MSX.A0u(AbstractC167007dF.A0B(it3), A00(this).A1o);
                }
            } else {
                List list5 = WG3.A00;
                ArrayList A0i2 = AbstractC167007dF.A0i(list5);
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    AbstractC166997dE.A1W(A0i2, AbstractC167007dF.A0B(it4) + A00(this).A0A);
                }
                Iterator it5 = A0i2.iterator();
                while (it5.hasNext()) {
                    MSX.A0u(AbstractC167007dF.A0B(it5), A00(this).A1o);
                }
            }
            if (!AbstractC31175DnJ.A1U(A00(this).A0A, A00(this).A1o)) {
                MSX.A0u(A00(this).A0A, A00(this).A1o);
            }
            List list6 = A00(this).A1o;
            C14360o3.A06(list6);
            C01T.A1C(list6);
            Context requireContext2 = requireContext();
            UserSession userSession3 = (UserSession) interfaceC09390do2.getValue();
            C69341Vln c69341Vln = new C69341Vln(view, "duration_slider");
            Context requireContext3 = requireContext();
            List list7 = A00(this).A1o;
            C14360o3.A06(list7);
            VRU.A00(requireContext2, c69341Vln, A00(this), (PromoteState) interfaceC09390do.getValue(), userSession3, WG3.A05(requireContext3, list7));
            this.A05 = (ViewStub) view.requireViewById(R.id.budget_warning_stub);
            TextView textView = this.A0B;
            if (textView != null) {
                String A15 = AbstractC65703TsZ.A15(this, this.A02);
                if (i2 < 24) {
                    Context requireContext4 = requireContext();
                    int i3 = 2131970649;
                    if (i2 == 1) {
                        i3 = 2131970651;
                    }
                    A00 = AbstractC31177DnL.A0a(requireContext4, i2, i3);
                    C14360o3.A0A(A00);
                } else {
                    A00 = WG3.A00(requireContext(), this.A00);
                }
                textView.setText(getString(2131970455, A15, A00));
                TextView textView2 = this.A0B;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    super.onViewCreated(view, bundle);
                    return;
                }
            }
            C14360o3.A0F("elapsedSpendView");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final PromoteData A00(C67871V0c c67871V0c) {
        return (PromoteData) AbstractC166987dD.A17(c67871V0c.A0J);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(int r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            int r5 = r11 - r0
            int r10 = r10 * r5
            int r0 = r9.A01
            int r10 = r10 + r0
            int r0 = r9.A0A
            int r0 = r11 - r0
            r3 = 24
            int r7 = r0 * 24
            int r0 = r9.A09
            int r7 = r7 + r0
            android.widget.TextView r8 = r9.A0D
            if (r8 != 0) goto L21
            java.lang.String r8 = "totalSpendValueView"
        L19:
            X.C14360o3.A0F(r8)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L21:
            r2 = 2131971000(0x7f134bb8, float:1.9578967E38)
            int r0 = r9.A02
            int r0 = r0 + r10
            java.lang.String r1 = X.AbstractC65703TsZ.A15(r9, r0)
            r4 = 0
            android.content.Context r0 = r9.requireContext()
            java.lang.String r0 = X.WG3.A00(r0, r11)
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = r9.getString(r2, r0)
            r8.setText(r0)
            java.lang.String r8 = "remainingSpendView"
            if (r7 >= r3) goto L75
            android.widget.TextView r5 = r9.A0C
            if (r5 == 0) goto L19
            r3 = 2131970457(0x7f134999, float:1.9577866E38)
            java.lang.String r2 = X.AbstractC65703TsZ.A15(r9, r10)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131970649(0x7f134a59, float:1.9578255E38)
            if (r7 != r6) goto L5b
            r0 = 2131970651(0x7f134a5b, float:1.957826E38)
        L5b:
            java.lang.String r0 = X.AbstractC31177DnL.A0a(r1, r7, r0)
            X.C14360o3.A0A(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r0 = r9.getString(r3, r0)
            r5.setText(r0)
        L6d:
            android.widget.TextView r0 = r9.A0C
            if (r0 == 0) goto L19
            r0.setVisibility(r4)
            return
        L75:
            android.widget.TextView r3 = r9.A0C
            if (r3 == 0) goto L19
            r2 = 2131970457(0x7f134999, float:1.9577866E38)
            java.lang.String r1 = X.AbstractC65703TsZ.A15(r9, r10)
            android.content.Context r0 = r9.requireContext()
            java.lang.String r0 = X.WG3.A00(r0, r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = r9.getString(r2, r0)
            r3.setText(r0)
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67871V0c.A01(int, int):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0I.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-739244584);
        super.onCreate(bundle);
        AbstractC65703TsZ.A1K(this);
        C0f9.A09(-861255262, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1049506367);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_campaign_controls_budget_duration_view, viewGroup, false);
        C0f9.A09(-1867959056, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1017784700);
        super.onDestroy();
        this.A06 = null;
        C0f9.A09(-1712530148, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(195281974);
        super.onDestroyView();
        ((PromoteState) this.A0H.getValue()).A0B(this);
        this.A04 = null;
        C0f9.A09(324931036, A02);
    }
}
