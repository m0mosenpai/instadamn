package X;

import android.animation.Animator;
import com.facebook.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class U66 {
    public static final void A00(C6FG c6fg, List list) {
        if (AbstractC31177DnL.A1b(c6fg.A01.get(R.id.bk_context_key_disable_animations))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Animator) it.next()).setDuration(0L);
            }
        }
    }
}
