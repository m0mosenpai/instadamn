package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V0O extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceInterestFragmentV2";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public C68955Vet A04;
    public W5D A05;
    public C66419UGo A06;
    public UGZ A07;
    public FRW A08;
    public final InterfaceC09390do A0D = X55.A00(this, 33);
    public final InterfaceC09390do A0F = new C60842q8(new X55(this, 34), new X55(this, 35), new C57253Pbb(28, null, this), new C0YZ(UFT.class));
    public final C69678VtN A0C = new C69678VtN();
    public final C70641WeM A0B = new C70641WeM(this);
    public final C69526Vqq A0A = new C69526Vqq(this);
    public final TextWatcher A09 = new WKU(this, 4);
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970497);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        interfaceC56362iU.EkS(true);
        Context context = getContext();
        if (context != null) {
            FRW frw = new FRW(context, interfaceC56362iU);
            this.A08 = frw;
            WNT.A01(frw, C05F.A1F, this, 35);
            FRW frw2 = this.A08;
            if (frw2 == null) {
                C14360o3.A0F("actionBarButtonController");
                throw C00O.createAndThrow();
            }
            frw2.A01(true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience_interest";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.A04 = new C68955Vet(activity, this, (UserSession) this.A0E.getValue());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0O.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        Editable editable;
        TextView textView = this.A01;
        if (textView != null) {
            EditText editText = this.A00;
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            int i = 0;
            if (editable != null && editable.length() != 0) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public static final void A01(V0O v0o) {
        InterfaceC09390do interfaceC09390do = v0o.A0F;
        UFT uft = (UFT) interfaceC09390do.getValue();
        UQJ A05 = ((UFT) interfaceC09390do.getValue()).A05();
        C66419UGo c66419UGo = v0o.A06;
        if (c66419UGo == null) {
            C14360o3.A0F("selectedAndSuggestedInterestsAdapter");
            throw C00O.createAndThrow();
        }
        uft.A0A(UQJ.A00(null, null, A05, null, null, null, AbstractC31173DnH.A0L(c66419UGo.A08), 0, 0, 959, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.V0O r4, java.util.List r5) {
        /*
            android.widget.EditText r0 = r4.A00
            if (r0 == 0) goto L11
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L11
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L12
        L11:
            r0 = 1
        L12:
            java.lang.String r3 = "selectedAndSuggestedInterestsAdapter"
            java.lang.String r2 = "interestTypeaheadAdapter"
            if (r0 == 0) goto L33
            java.util.List r1 = java.util.Collections.emptyList()
            X.C14360o3.A07(r1)
            X.UGZ r0 = r4.A07
            if (r0 == 0) goto L49
            r0.A00 = r1
            r0.notifyDataSetChanged()
            X.UGo r0 = r4.A06
            if (r0 == 0) goto L4d
            r0.A00()
        L2f:
            r4.A00()
            return
        L33:
            X.UGZ r0 = r4.A07
            if (r0 == 0) goto L49
            r0.A00 = r5
            r0.notifyDataSetChanged()
            X.UGo r1 = r4.A06
            if (r1 == 0) goto L4d
            java.util.List r0 = r1.A07
            r0.clear()
            r1.notifyDataSetChanged()
            goto L2f
        L49:
            X.C14360o3.A0F(r2)
            goto L50
        L4d:
            X.C14360o3.A0F(r3)
        L50:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0O.A02(X.V0O, java.util.List):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0E.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1748021489);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_interest_view, viewGroup, false);
        C0f9.A09(-930434088, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1721698488);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        W5D w5d = this.A05;
        if (w5d != null) {
            w5d.A01();
        }
        this.A05 = null;
        C0f9.A09(-537545345, A02);
    }
}
