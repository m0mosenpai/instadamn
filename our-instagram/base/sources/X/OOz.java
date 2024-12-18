package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public abstract class OOz {
    public static final View A00(ViewGroup viewGroup) {
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        View inflate = LayoutInflater.from(A0L).inflate(R.layout.suggestion_cell_panavision, viewGroup, false);
        A0L.getDrawable(R.drawable.creation_suggestion_pill_bg);
        C14360o3.A07(inflate);
        return inflate;
    }

    public static C51314Mlb A01(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        return new C51314Mlb(A00(viewGroup));
    }
}
