package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KBq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45478KBq extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "RecsFromFriendsReceiverFragment";
    public L9S A00;
    public C44569Jnu A01;
    public C44530Jma A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public RecyclerView A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC48073LPy(this, 32), AbstractC31176DnK.A0I(), interfaceC56362iU);
        interfaceC56362iU.setTitle("");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "recs_from_friends_receiver";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.recs_from_friends_receiver_headline);
        A0S.setPadding(A0S.getPaddingLeft(), 0, A0S.getPaddingRight(), AbstractC167017dG.A03(requireContext()));
        View A0S2 = AbstractC166997dE.A0S(view, R.id.rff_follow_all_button);
        if (this.A07) {
            A0S2.setVisibility(8);
        } else {
            ViewOnClickListenerC48073LPy.A00(A0S2, 33, this);
        }
        this.A08 = AbstractC31172DnG.A0G(view, R.id.rff_receiver_recycler_view);
        UserSession A0r = AbstractC166987dD.A0r(this.A09);
        FragmentActivity requireActivity = requireActivity();
        L9S l9s = this.A00;
        if (l9s != null) {
            C44569Jnu c44569Jnu = new C44569Jnu(requireActivity, this, A0r, l9s, this.A03);
            this.A01 = c44569Jnu;
            RecyclerView recyclerView = this.A08;
            if (recyclerView != null) {
                recyclerView.setAdapter(c44569Jnu);
            }
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
            }
            RecyclerView recyclerView3 = this.A08;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator(null);
            }
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new C57169PZn(viewLifecycleOwner, c07s, A0S, this, null, 20), C07Y.A00(viewLifecycleOwner));
            L9S l9s2 = this.A00;
            if (l9s2 != null) {
                l9s2.A01(this.A03, "full_screen_viewer", "recs_from_friends_receiver");
                return;
            }
        }
        C14360o3.A0F("recsFromFriendsLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1419530029);
        super.onCreate(bundle);
        String string = requireArguments().getString("thread_name");
        String str2 = "";
        if (string == null) {
            string = "";
        }
        this.A05 = string;
        String string2 = requireArguments().getString("recs_from_friends_user_ids");
        if (string2 == null) {
            string2 = "";
        }
        this.A06 = string2;
        String string3 = requireArguments().getString("sender_id");
        if (string3 == null) {
            string3 = "";
        }
        this.A04 = string3;
        C44530Jma c44530Jma = new C44530Jma(null, null, 1);
        this.A02 = c44530Jma;
        String str3 = this.A06;
        if (str3 != null) {
            InterfaceC09390do interfaceC09390do = this.A09;
            Object value = interfaceC09390do.getValue();
            C14360o3.A0B(value, 1);
            AbstractC166987dD.A1Z(new PZQ(value, c44530Jma, str3, null, 13), AbstractC141776au.A00(c44530Jma));
            String str4 = this.A04;
            if (str4 != null) {
                this.A07 = str4.equals(AbstractC31173DnH.A0t(interfaceC09390do));
                this.A00 = new L9S(this, AbstractC166987dD.A0r(interfaceC09390do));
                String string4 = requireArguments().getString("thread_user_id");
                if (string4 != null) {
                    str2 = string4;
                }
                String A0t = AbstractC31173DnH.A0t(interfaceC09390do);
                String str5 = this.A04;
                if (str5 != null) {
                    if (!C14360o3.A0K(A0t, str5)) {
                        str2 = AbstractC31173DnH.A0t(interfaceC09390do);
                    }
                    this.A03 = AbstractC25228BEl.A13(str2);
                    C0f9.A09(620230662, A02);
                    return;
                }
            }
            str = "senderId";
        } else {
            str = "userIds";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1187971835);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.recs_from_friends_receiver_fragment, false);
        C0f9.A09(-1902083816, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-752307341);
        super.onDestroyView();
        this.A08 = null;
        C0f9.A09(464700649, A02);
    }
}
