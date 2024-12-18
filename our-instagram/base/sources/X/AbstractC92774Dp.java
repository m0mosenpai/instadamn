package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.4Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92774Dp {
    public static final LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 A00(Context context, LinearLayoutManager linearLayoutManager, Boolean bool) {
        LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context, bool);
        if (linearLayoutManager != null) {
            linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A1P(linearLayoutManager.A1M());
        }
        return linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
    }
}
