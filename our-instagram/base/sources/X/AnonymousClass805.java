package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.805, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass805 {
    public static final void A00(C3OO c3oo, AnonymousClass804 anonymousClass804, List list) {
        C14360o3.A0B(anonymousClass804, 2);
        if (anonymousClass804.ordinal() == 1) {
            Animation loadAnimation = AnimationUtils.loadAnimation(c3oo.itemView.getContext(), R.anim.fade_in_media);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setAnimation(loadAnimation);
            }
        }
    }
}
