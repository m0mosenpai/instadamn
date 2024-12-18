package X;

import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.promote.model.AudienceInterest;

/* renamed from: X.WeM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70641WeM implements XA9 {
    public final /* synthetic */ V0O A00;

    @Override // X.XA9
    public final void DNM(AudienceInterest audienceInterest) {
        Editable text;
        V0O v0o = this.A00;
        Context context = v0o.getContext();
        if (context != null) {
            InputMethodManager A0A = AbstractC65703TsZ.A0A(context);
            RecyclerView recyclerView = v0o.A02;
            IBinder iBinder = null;
            if (recyclerView != null) {
                iBinder = recyclerView.getWindowToken();
            }
            if (!A0A.hideSoftInputFromWindow(iBinder, 0)) {
                C66419UGo c66419UGo = v0o.A06;
                if (c66419UGo == null) {
                    C14360o3.A0F("selectedAndSuggestedInterestsAdapter");
                    throw C00O.createAndThrow();
                }
                c66419UGo.A01(audienceInterest);
                EditText editText = v0o.A00;
                if (editText != null && (text = editText.getText()) != null) {
                    text.clear();
                }
                V0O.A01(v0o);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C70641WeM(V0O v0o) {
        this.A00 = v0o;
    }
}
