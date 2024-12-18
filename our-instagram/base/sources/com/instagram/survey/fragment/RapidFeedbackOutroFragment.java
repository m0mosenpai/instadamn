package com.instagram.survey.fragment;

import X.AbstractC153636vY;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25351Lp;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC68579VWg;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C41703IdX;
import X.C70077W1u;
import X.EVO;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.UB6;
import X.VDB;
import X.WNS;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class RapidFeedbackOutroFragment extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public String A00;
    public Long A01;
    public Long A02;
    public View rootView;
    public final long A04 = System.currentTimeMillis();
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(false);
        interfaceC56362iU.Efu(2131971488);
        interfaceC56362iU.Eha(new WNS(this, 13), R.drawable.instagram_check_pano_outline_24);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "RapidFeedbackOutroFragment";
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.W1u, X.VAQ] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.rootView;
        if (view2 != null) {
            AbsListView absListView = (AbsListView) AbstractC166997dE.A0R(AbstractC166997dE.A0S(view2, R.id.rapidfeedback_page), R.id.rapidfeedback_page_list);
            Context context = getContext();
            if (context != null) {
                ArrayList arrayList = new ArrayList();
                String str = this.A00;
                if (str == null) {
                    C14360o3.A0F("outroToast");
                    throw C00O.createAndThrow();
                }
                ?? c70077W1u = new C70077W1u(VDB.MESSAGE, "");
                c70077W1u.A00 = str;
                arrayList.add(c70077W1u);
                absListView.setAdapter((ListAdapter) new UB6(context, arrayList));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A03.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2119421527);
        super.onCreate(bundle);
        this.A00 = AbstractC153636vY.A01(requireArguments(), "ARG_TOAST_TEXT");
        this.A02 = Long.valueOf(requireArguments().getLong("ARG_SURVEY_START_TIME"));
        this.A01 = Long.valueOf(requireArguments().getLong("ARG_PAGE_ID"));
        EVO.A00(this);
        C0f9.A09(-1223269361, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(647407664);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.rapidfeedback_outro_view, viewGroup, false);
        this.rootView = inflate;
        C0f9.A09(-146751303, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        IllegalStateException illegalStateException;
        int i;
        int A02 = C0f9.A02(-430863931);
        super.onDestroyView();
        InterfaceC09390do interfaceC09390do = this.A03;
        if (AbstractC25351Lp.A02((UserSession) interfaceC09390do.getValue())) {
            C41703IdX A00 = AbstractC68579VWg.A00((UserSession) interfaceC09390do.getValue());
            Long l = this.A02;
            if (l != null) {
                long longValue = l.longValue();
                long j = this.A04;
                Long l2 = this.A01;
                if (l2 != null) {
                    A00.A02(longValue, j, l2.longValue(), false);
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i = 964567427;
                }
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
                i = 1052709127;
            }
            C0f9.A09(i, A02);
            throw illegalStateException;
        }
        this.rootView = null;
        C0f9.A09(1264411690, A02);
    }
}
