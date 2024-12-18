package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3PW, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3PW {
    public static final C3PX A00(View view, int i) {
        C14360o3.A0B(view, 0);
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            if (findViewById instanceof ViewStub) {
                return new C3PX(view, null, (ViewStub) findViewById, i);
            }
            return new C3PX(view, findViewById, null, i);
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Cannot find view stub with id: ", i));
    }
}
