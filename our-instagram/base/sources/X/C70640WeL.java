package X;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceInterest;

/* renamed from: X.WeL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70640WeL implements XA9 {
    public final /* synthetic */ V0P A00;

    @Override // X.XA9
    public final void DNM(AudienceInterest audienceInterest) {
        String str;
        V0P v0p = this.A00;
        Context context = v0p.getContext();
        if (context != null) {
            InputMethodManager A0A = AbstractC65703TsZ.A0A(context);
            RecyclerView recyclerView = v0p.A02;
            if (recyclerView == null) {
                str = "interestTypeaheadRecyclerView";
            } else if (!A0A.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0)) {
                C66424UGt c66424UGt = v0p.A06;
                if (c66424UGt == null) {
                    str = "selectedAndSuggestedInterestsAdapter";
                } else {
                    c66424UGt.A02(audienceInterest);
                    EditText editText = v0p.A00;
                    if (editText == null) {
                        str = "searchEditText";
                    } else {
                        editText.getText().clear();
                        V0P.A01(v0p);
                        return;
                    }
                }
            } else {
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public C70640WeL(V0P v0p) {
        this.A00 = v0p;
    }
}
