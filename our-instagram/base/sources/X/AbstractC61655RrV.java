package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.RrV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61655RrV {
    public static FragmentActivity A00(Context context) {
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
