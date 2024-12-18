package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.A0p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22719A0p {
    public static final ACU A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.disabled_composer_text, (ViewGroup) null);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new ACU((ViewGroup) inflate);
    }
}
