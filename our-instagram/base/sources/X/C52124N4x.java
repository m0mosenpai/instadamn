package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.N4x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52124N4x extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UpcomingEventsListFragment";
    public EnumC53233NgW A00;
    public InterfaceC58087PpC A01;
    public C51176MjK A02;
    public List A03;
    public final C54487O5p A04 = new C54487O5p(this);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "upcoming_events_list";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Ok4.A00(view.requireViewById(R.id.action_bar_button_cancel), 8, this);
        AbstractC166987dD.A1P(requireContext(), AbstractC167007dF.A0N(view, R.id.title), 2131972147);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.events_list);
        AbstractC31178DnM.A0z(this, recyclerView);
        C51176MjK c51176MjK = this.A02;
        if (c51176MjK == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(c51176MjK);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public static final void A00(C52124N4x c52124N4x) {
        FragmentActivity activity;
        C00M onBackPressedDispatcher;
        if (c52124N4x.isAdded() && C06P.A01(c52124N4x.getParentFragmentManager()) && (activity = c52124N4x.getActivity()) != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.A04();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-2000081394);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("prior_surface");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.upcomingevents.creation.enums.UpcomingEventEntryPoint");
        this.A00 = (EnumC53233NgW) serializable;
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("upcoming_event_ids");
        AbstractC153636vY.A03(requireArguments, stringArrayList, "upcoming_event_ids");
        this.A03 = stringArrayList;
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A05);
        EnumC53233NgW enumC53233NgW = this.A00;
        if (enumC53233NgW == null) {
            str = "priorSurface";
        } else {
            boolean z = enumC53233NgW.A00;
            InterfaceC58087PpC interfaceC58087PpC = this.A01;
            if (interfaceC58087PpC != null) {
                C51176MjK c51176MjK = new C51176MjK(requireContext, A0r, this.A04, interfaceC58087PpC, z);
                List list = this.A03;
                if (list == null) {
                    str = "upcomingEventIds";
                } else {
                    C141986bH A00 = AbstractC146056i3.A00(c51176MjK.A01);
                    List list2 = c51176MjK.A04;
                    list2.clear();
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : list) {
                        if (A00.A00((String) obj) != null) {
                            A1E.add(obj);
                        }
                    }
                    list2.addAll(A1E);
                    c51176MjK.notifyDataSetChanged();
                    this.A02 = c51176MjK;
                    C0f9.A09(510490596, A02);
                    return;
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-1887191215, A02);
                throw A0g;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-214912475);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.upcoming_events_list, viewGroup, false);
        C0f9.A09(1639563326, A02);
        return inflate;
    }
}
