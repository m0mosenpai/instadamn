package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uzy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67867Uzy extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteDeleteDraftBottomSheetFragment";
    public View A00;
    public View A01;
    public C70399WUb A02;
    public W6E A03;
    public PromoteData A04;
    public UserSession A05;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new X31(this, 38));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_delete_draft_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), AbstractC167007dF.A0N(view, R.id.delete_draft_bottom_sheet_title), 2131970543);
        View requireViewById = view.requireViewById(R.id.discard_button_row);
        this.A01 = requireViewById;
        String str = "discardButtonRow";
        if (requireViewById != null) {
            TextView A0N = AbstractC167007dF.A0N(requireViewById, R.id.promote_bottom_sheet_button_text);
            AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), A0N, 2131970645);
            AbstractC166987dD.A1O(requireContext(), A0N, AbstractC53242c7.A03(getContext()));
            View view2 = this.A01;
            if (view2 != null) {
                WNT.A00(view2, 18, this);
                View view3 = this.A01;
                if (view3 != null) {
                    view3.setClickable(true);
                    View requireViewById2 = view.requireViewById(R.id.cancel_button_row);
                    this.A00 = requireViewById2;
                    str = "cancelButtonRow";
                    if (requireViewById2 != null) {
                        AbstractC31173DnH.A19(AbstractC166997dE.A0N(this), AbstractC167007dF.A0N(requireViewById2, R.id.promote_bottom_sheet_button_text), 2131970644);
                        View view4 = this.A00;
                        if (view4 != null) {
                            WNT.A00(view4, 19, this);
                            View view5 = this.A00;
                            if (view5 != null) {
                                view5.setClickable(true);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A05;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-908623939);
        super.onCreate(bundle);
        PromoteData A00 = InterfaceC72021XFj.A00(this);
        this.A04 = A00;
        UserSession userSession = A00.A0y;
        this.A05 = userSession;
        this.A03 = new W6E(requireActivity(), this, userSession);
        UserSession userSession2 = this.A05;
        if (userSession2 != null) {
            this.A02 = C70399WUb.A00(userSession2);
            C0f9.A09(-191386834, A02);
        } else {
            C14360o3.A0F("session");
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1466813216);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_delete_draft_bottom_sheet_view, false);
        C0f9.A09(-1858800277, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(945054142);
        super.onDestroyView();
        C0f9.A09(252659642, A02);
    }
}
