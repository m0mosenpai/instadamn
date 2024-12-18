package X;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import java.util.List;

/* renamed from: X.WeN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70642WeN implements XAA {
    public final /* synthetic */ C67875V0g A00;

    @Override // X.XAA
    public final void DNL(AudienceGeoLocation audienceGeoLocation) {
        String str;
        C70179WFe c70179WFe = VZI.A00;
        C67875V0g c67875V0g = this.A00;
        boolean A03 = C70179WFe.A03(audienceGeoLocation, ((PromoteData) AbstractC166987dD.A17(c67875V0g.A0E)).A0o.A05);
        InputMethodManager A0A = AbstractC65703TsZ.A0A(c67875V0g.requireContext());
        RecyclerView recyclerView = c67875V0g.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            A0A.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
            UGb uGb = c67875V0g.A05;
            if (uGb == null) {
                str = "selectedLocationAdapter";
            } else {
                PendingLocation pendingLocation = uGb.A01.A0o;
                List list = pendingLocation.A05;
                list.add(audienceGeoLocation);
                pendingLocation.A05 = list;
                PromoteState.A01(uGb.A02, C05F.A1I);
                uGb.notifyDataSetChanged();
                EditText editText = c67875V0g.A00;
                if (editText == null) {
                    str = "searchEditText";
                } else {
                    editText.getText().clear();
                    if (A03) {
                        List list2 = c67875V0g.A06;
                        if (list2 != null) {
                            list2.add(audienceGeoLocation);
                        }
                        C9GR.A09(c67875V0g.requireContext(), AbstractC31174DnI.A0w(c67875V0g, audienceGeoLocation.A05, 2131952241));
                        C67875V0g.A00(c67875V0g);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C70642WeN(C67875V0g c67875V0g) {
        this.A00 = c67875V0g;
    }
}
