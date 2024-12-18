package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* renamed from: X.Ffw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35204Ffw {
    public final ActivityOptions A00;

    public static C35204Ffw A01(Activity activity, C3AY... c3ayArr) {
        int length = c3ayArr.length;
        Pair[] pairArr = new Pair[length];
        for (int i = 0; i < length; i++) {
            C3AY c3ay = c3ayArr[i];
            pairArr[i] = Pair.create(c3ay.A00, c3ay.A01);
        }
        return new C35204Ffw(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public static C35204Ffw A00(Activity activity, View view) {
        return new C35204Ffw(ActivityOptions.makeSceneTransitionAnimation(activity, view, AbstractC111324zv.A00(4925)));
    }

    public final Bundle A02() {
        return this.A00.toBundle();
    }

    public C35204Ffw(ActivityOptions activityOptions) {
        this.A00 = activityOptions;
    }

    public C35204Ffw() {
    }
}
