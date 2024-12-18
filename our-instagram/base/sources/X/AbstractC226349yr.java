package X;

import android.view.View;
import com.facebook.R;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.9yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226349yr {
    public static final void A00(View view) {
        Locale A02 = C1Q2.A02();
        AbstractC167007dF.A0N(view, R.id.like_count).setText(NumberFormat.getInstance(A02).format(1L));
        AbstractC167007dF.A0N(view, R.id.comment_count).setText(NumberFormat.getInstance(A02).format(1L));
    }
}
