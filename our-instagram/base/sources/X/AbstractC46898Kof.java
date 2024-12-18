package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.Kof, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46898Kof {
    public static final String A00(Context context, long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d", Locale.getDefault());
        Long valueOf = Long.valueOf(j);
        boolean A0K = C14360o3.A0K(simpleDateFormat.format(valueOf), new SimpleDateFormat("EEE, MMM d", Locale.getDefault()).format(AbstractC31173DnH.A0g()));
        String format = new SimpleDateFormat("h:mm a", Locale.getDefault()).format(valueOf);
        int i = 2131958998;
        if (A0K) {
            i = 2131958997;
        }
        String A0t = AbstractC31174DnI.A0t(context, AbstractC166997dE.A0p(context, i), format, 2131958996);
        C14360o3.A0A(A0t);
        return A0t;
    }
}
