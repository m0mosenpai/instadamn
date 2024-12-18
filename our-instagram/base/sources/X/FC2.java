package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FC2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.EtF] */
    public static final View A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.row_no_results, false);
        C14360o3.A0B(A0C, 1);
        ?? obj = new Object();
        obj.A00 = A0C;
        obj.A01 = AbstractC25230BEn.A0Q(A0C, R.id.row_no_results_textview);
        A0C.setTag(obj);
        return A0C;
    }
}
