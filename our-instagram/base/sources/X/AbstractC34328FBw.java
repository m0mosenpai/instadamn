package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.FBw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34328FBw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.E18, java.lang.Object] */
    public static E18 A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_badge_item);
        ?? c3oo = new C3OO(A0A);
        c3oo.A03 = AbstractC31180DnO.A06(A0A);
        c3oo.A01 = AbstractC166997dE.A0T(A0A, R.id.badge);
        c3oo.A02 = AbstractC166997dE.A0T(A0A, R.id.badge_lowpri);
        c3oo.A00 = A0A.requireViewById(R.id.row_divider);
        A0A.setTag(c3oo);
        return c3oo;
    }
}
