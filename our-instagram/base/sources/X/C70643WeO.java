package X;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;

/* renamed from: X.WeO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70643WeO implements XAA {
    public final /* synthetic */ V04 A00;

    @Override // X.XAA
    public final void DNL(AudienceGeoLocation audienceGeoLocation) {
        String str;
        V04 v04 = this.A00;
        InputMethodManager A0A = AbstractC65703TsZ.A0A(v04.requireContext());
        RecyclerView recyclerView = v04.A02;
        if (recyclerView == null) {
            str = "locationsTypeaheadRecyclerView";
        } else {
            A0A.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
            EditText editText = v04.A00;
            if (editText == null) {
                str = "searchEditText";
            } else {
                editText.getText().clear();
                UFT uft = (UFT) v04.A0B.getValue();
                ArrayList A0U = AbstractC001800i.A0U(uft.A06().A05);
                A0U.add(audienceGeoLocation);
                UFT.A02(uft, A0U);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C70643WeO(V04 v04) {
        this.A00 = v04;
    }
}
