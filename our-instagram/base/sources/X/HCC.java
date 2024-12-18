package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HCC extends AbstractC59962oe implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "MixAttributionSheetFragment";
    public ListView A00;
    public INT A01;
    public Gt8 A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "mix_attribution_sheet_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-141426963);
        C14360o3.A0B(layoutInflater, 0);
        Bundle requireArguments = requireArguments();
        C153756vk c153756vk = new C153756vk((C8JW) requireArguments.getSerializable("ARGS_PIVOT_PAGE_ENTRY_POINT"), AbstractC153636vY.A01(requireArguments, "ARGS_PIVOT_PAGE_SESSION_ID"));
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A03;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String string = requireArguments.getString("ARGS_MEDIA_ID");
        String string2 = requireArguments.getString("ARGS_MEDIA_AUTHOR_ID");
        long j = requireArguments.getLong("ARGS_CONTAINER_ID");
        this.A01 = new INT(requireContext, requireActivity, (EnumC39636HiR) requireArguments.getSerializable("ARGS_AUDIO_TYPE"), c153756vk, A0r, this, string, string2, requireArguments.getString("ARGS_MEDIA_TAP_TOKEN"), j);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_mix_sheet_fragment, viewGroup, false);
        this.A02 = (Gt8) new C52942bb(requireActivity()).A00(Gt8.class);
        ListView listView = (ListView) inflate.requireViewById(R.id.mix_tracks_list);
        Gt8 gt8 = this.A02;
        C38307Gst c38307Gst = null;
        if (gt8 == null) {
            str = "model";
        } else {
            List list = (List) gt8.A00.A02();
            if (list != null) {
                Context A0L = AbstractC166997dE.A0L(listView);
                interfaceC09390do.getValue();
                C42210Imw c42210Imw = new C42210Imw();
                INT r1 = this.A01;
                if (r1 == null) {
                    str = "mixAttributionHelper";
                } else {
                    c38307Gst = new C38307Gst(A0L, c42210Imw, r1, list);
                }
            }
            listView.setAdapter((ListAdapter) c38307Gst);
            this.A00 = listView;
            C0f9.A09(-1003801923, A02);
            return inflate;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
