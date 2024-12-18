package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.fx.access.sso.FxSsoViewModel;
import java.util.List;

/* loaded from: classes6.dex */
public final class EK1 extends AbstractC59962oe implements InterfaceC60122ou, GZL {
    public static final String __redex_internal_original_name = "FxSsoAccountPickerFragment";
    public FxSsoViewModel A00;
    public C31873Dzf A01;
    public EVQ A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C50152MDf(this, 11));

    @Override // X.GZL
    public final void F8l(C51757Mtg c51757Mtg) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        View findViewById;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        if (AbstractC56862jK.A01(getContext(), true) && (findViewById = ((C56352iT) interfaceC56362iU).A0S.findViewById(R.id.action_bar_button_back)) != null) {
            findViewById.setFocusable(1);
            findViewById.requestFocusFromTouch();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fx_sso_account_picker";
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r0 = (X.E6N) X.AbstractC001800i.A0J(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r10 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r10 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        r4.A0A(X.C4JK.A00, X.AbstractC31174DnI.A0J("fx_sso_account_picker"), r7, r8, r9, r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        if (r2 != null) goto L20;
     */
    @Override // X.GZL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F8k(X.C51757Mtg r13) {
        /*
            r12 = this;
            java.lang.Object r3 = r13.A00
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = X.AbstractC001800i.A0J(r3)
            X.E6N r0 = (X.E6N) r0
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.Object r2 = r0.A02
        Lf:
            r0 = 10
            boolean r0 = X.QJ0.A02(r2, r0)
            if (r0 == 0) goto L27
            X.QJ0 r2 = (X.QJ0) r2
        L19:
            X.EVQ r4 = r12.A02
            if (r4 != 0) goto L2b
            java.lang.String r0 = "facebookLoginHelper"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L27:
            r2 = r1
            goto L19
        L29:
            r2 = r1
            goto Lf
        L2b:
            X.0do r0 = r12.A03
            java.lang.Object r7 = r0.getValue()
            X.0a1 r7 = (X.C07270a1) r7
            java.lang.String r1 = ""
            if (r2 == 0) goto L3b
            java.lang.String r8 = r2.A03
            if (r8 != 0) goto L3e
        L3b:
            r8 = r1
            if (r2 == 0) goto L42
        L3e:
            java.lang.String r9 = r2.A01
            if (r9 != 0) goto L43
        L42:
            r9 = r1
        L43:
            java.lang.Object r0 = X.AbstractC001800i.A0J(r3)
            X.E6N r0 = (X.E6N) r0
            if (r0 == 0) goto L4f
            java.lang.String r10 = r0.A04
            if (r10 != 0) goto L50
        L4f:
            r10 = r1
        L50:
            X.4JK r5 = X.C4JK.A00
            java.lang.String r0 = "fx_sso_account_picker"
            X.4JL r6 = X.AbstractC31174DnI.A0J(r0)
            r11 = 0
            r4.A0A(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EK1.F8k(X.Mtg):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1181046903);
        super.onCreate(bundle);
        this.A00 = AbstractC31178DnM.A0O(requireActivity());
        CallerContext callerContext = EVQ.A0B;
        this.A02 = new EVQ(this, this, (C07270a1) this.A03.getValue(), null, EnumC31713DwI.A0t, null);
        C0f9.A09(-1290153356, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? r0;
        int A02 = C0f9.A02(-1788310896);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.fx_multi_sso_account_picker, false);
        AbstractC166987dD.A0c(A07, R.id.account_picker_title).setContentDescription(AbstractC31174DnI.A0w(this, getString(2131963028), 2131963468));
        this.A01 = new C31873Dzf(this);
        View findViewById = A07.findViewById(R.id.account_recycler_view);
        C14360o3.A0C(findViewById, AbstractC111324zv.A00(9));
        RecyclerView recyclerView = (RecyclerView) findViewById;
        AbstractC31178DnM.A0z(this, recyclerView);
        C31873Dzf c31873Dzf = this.A01;
        String str = "aymhAdapter";
        if (c31873Dzf != null) {
            recyclerView.setAdapter(c31873Dzf);
            C31873Dzf c31873Dzf2 = this.A01;
            if (c31873Dzf2 != null) {
                c31873Dzf2.A01 = true;
                FxSsoViewModel fxSsoViewModel = this.A00;
                if (fxSsoViewModel == null) {
                    str = "fxSsoViewModel";
                } else {
                    List<E6N> list = (List) AbstractC31176DnK.A0k(fxSsoViewModel.A02);
                    if (list != null) {
                        r0 = AbstractC167017dG.A0q(list);
                        for (E6N e6n : list) {
                            r0.add(new C51757Mtg(e6n.A00, e6n.A03, AbstractC166987dD.A1J(e6n)));
                        }
                    } else {
                        r0 = C16930sl.A00;
                    }
                    c31873Dzf2.A00 = r0;
                    c31873Dzf2.notifyDataSetChanged();
                    C0f9.A09(134041194, A02);
                    return A07;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
