package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KrI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47061KrI {
    public static View A00(Context context, int i, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.family_bridges_basic_netego_content_view);
        A0A.setTag(new C47698L4f(context, A0A, i));
        return A0A;
    }
}
