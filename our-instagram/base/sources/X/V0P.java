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
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class V0P extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceInterestFragment";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public C70399WUb A04;
    public W6E A05;
    public C66424UGt A06;
    public UGZ A07;
    public PromoteData A08;
    public PromoteState A09;
    public UserSession A0A;
    public FRW A0B;
    public WDA A0C;
    public final C69678VtN A0G = new C69678VtN();
    public final C70640WeL A0F = new C70640WeL(this);
    public final C69525Vqp A0E = new C69525Vqp(this);
    public final TextWatcher A0D = new WKU(this, 3);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970497);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        interfaceC56362iU.EkS(true);
        Context context = getContext();
        if (context != null) {
            FRW frw = new FRW(context, interfaceC56362iU);
            this.A0B = frw;
            WNT.A01(frw, C05F.A1F, this, 34);
            FRW frw2 = this.A0B;
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
        C1UC activity = getActivity();
        if (activity != null) {
            this.A08 = ((InterfaceC72021XFj) activity).BiY();
            C1UC activity2 = getActivity();
            if (activity2 != null) {
                this.A09 = ((XFZ) activity2).Bia();
                PromoteData promoteData = this.A08;
                String str = "promoteData";
                if (promoteData != null) {
                    UserSession userSession = promoteData.A0y;
                    this.A0A = userSession;
                    this.A05 = new W6E(getActivity(), this, userSession);
                    UserSession userSession2 = this.A0A;
                    if (userSession2 != null) {
                        this.A04 = C70399WUb.A00(userSession2);
                        return;
                    }
                    str = "session";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r1 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0P.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "searchEmptyStateTextView";
        } else {
            EditText editText = this.A00;
            if (editText == null) {
                str = "searchEditText";
            } else {
                int length = editText.getText().length();
                int i = 8;
                if (length == 0) {
                    i = 0;
                }
                textView.setVisibility(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(V0P v0p) {
        String str;
        WDA wda = v0p.A0C;
        if (wda == null) {
            str = "audiencePotentialReachController";
        } else {
            PromoteData promoteData = v0p.A08;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                PromoteAudienceInfo promoteAudienceInfo = promoteData.A0q;
                C14360o3.A06(promoteAudienceInfo);
                C69649Vsq A00 = AbstractC68446VRc.A00(promoteAudienceInfo);
                C66424UGt c66424UGt = v0p.A06;
                if (c66424UGt == null) {
                    str = "selectedAndSuggestedInterestsAdapter";
                } else {
                    A00.A08 = AbstractC31173DnH.A0L(c66424UGt.A06);
                    wda.A02(A00.A00());
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(V0P v0p, List list) {
        String str;
        EditText editText = v0p.A00;
        if (editText == null) {
            str = "searchEditText";
        } else {
            Editable text = editText.getText();
            C14360o3.A07(text);
            str = "selectedAndSuggestedInterestsAdapter";
            if (AbstractC167007dF.A1N(text.length())) {
                List emptyList = Collections.emptyList();
                C14360o3.A07(emptyList);
                UGZ ugz = v0p.A07;
                if (ugz != null) {
                    ugz.A00 = emptyList;
                    ugz.notifyDataSetChanged();
                    C66424UGt c66424UGt = v0p.A06;
                    if (c66424UGt != null) {
                        c66424UGt.A01();
                        v0p.A00();
                        return;
                    }
                }
                C14360o3.A0F("interestTypeaheadAdapter");
            } else {
                UGZ ugz2 = v0p.A07;
                if (ugz2 != null) {
                    ugz2.A00 = list;
                    ugz2.notifyDataSetChanged();
                    C66424UGt c66424UGt2 = v0p.A06;
                    if (c66424UGt2 != null) {
                        c66424UGt2.A05.clear();
                        c66424UGt2.notifyDataSetChanged();
                        v0p.A00();
                        return;
                    }
                }
                C14360o3.A0F("interestTypeaheadAdapter");
            }
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A0A;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-381281180);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_interest_view, viewGroup, false);
        C0f9.A09(-284304989, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1660940792);
        super.onDestroyView();
        WDA wda = this.A0C;
        if (wda == null) {
            C14360o3.A0F("audiencePotentialReachController");
            throw C00O.createAndThrow();
        }
        wda.A0A.A00();
        wda.A00 = C70121W4x.A01;
        this.A04 = null;
        C0f9.A09(-2114358183, A02);
    }
}
