package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KBI extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MetaAiHcmSourcesBottomSheetFragment";
    public C69681VtR A00;
    public C66136U1d A01;
    public List A02;
    public String A03;
    public List A04;
    public final XAq A06 = new Wk0(this, 0);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "meta_ai_hcm_sources_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.list);
        int i = 0;
        AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
        C66362zD A0R = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new C45667KJe(requireContext(), AbstractC166987dD.A0r(this.A05), this.A00));
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        List list = this.A02;
        String str = "searchResultUriList";
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        break;
                    }
                    List list2 = this.A04;
                    if (list2 == null) {
                        str = "referencesTitleList";
                        break;
                    }
                    String A1I = AbstractC25226BEj.A1I(list2, i);
                    List list3 = this.A02;
                    if (list3 == null) {
                        break;
                    }
                    String A1I2 = AbstractC25226BEj.A1I(list3, i);
                    String str2 = this.A03;
                    if (str2 == null) {
                        str = "botResponseId";
                        break;
                    } else {
                        A0E.A00(new K02(A1I, A1I2, str2, i2));
                        i = i2;
                    }
                } else {
                    A0R.A05(A0E);
                    recyclerView.setAdapter(A0R);
                    XAq xAq = this.A06;
                    if (xAq != null) {
                        List list4 = this.A02;
                        if (list4 != null) {
                            xAq.ECz(recyclerView, list4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(482087826);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        List stringArrayList = requireArguments.getStringArrayList("search_result_uri");
        if (stringArrayList == null) {
            stringArrayList = C16930sl.A00;
        }
        this.A02 = stringArrayList;
        List stringArrayList2 = requireArguments.getStringArrayList("references_title");
        if (stringArrayList2 == null) {
            stringArrayList2 = C16930sl.A00;
        }
        this.A04 = stringArrayList2;
        String string = requireArguments.getString("bot_response_id");
        if (string == null) {
            string = "";
        }
        this.A03 = string;
        C0f9.A09(1176420681, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1852242176);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_meta_ai_hcm_sources_bottom_sheet, false);
        C0f9.A09(-415403074, A02);
        return A0R;
    }
}
