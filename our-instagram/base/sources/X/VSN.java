package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class VSN {
    public static final C69553VrI A00(View view) {
        C14360o3.A0B(view, 0);
        Object tag = view.getTag(R.id.view_bouncer);
        if (tag != null) {
            return (C69553VrI) tag;
        }
        C69553VrI c69553VrI = new C69553VrI(view);
        view.setTag(R.id.view_bouncer, c69553VrI);
        return c69553VrI;
    }
}
