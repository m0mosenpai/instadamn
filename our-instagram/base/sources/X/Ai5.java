package X;

import android.view.View;
import android.view.ViewStub;

/* loaded from: classes4.dex */
public final class Ai5 implements C8DK {
    public View A00;
    public final ViewStub A01;
    public final String A02;

    public Ai5(ViewStub viewStub, String str) {
        C14360o3.A0B(viewStub, 1);
        this.A01 = viewStub;
        this.A02 = str;
    }

    @Override // X.C8DK
    public final void Ede(boolean z) {
    }

    @Override // X.C8DK
    public final void EQs(boolean z) {
        View[] viewArr = new View[1];
        View view = this.A00;
        if (z) {
            if (view != null) {
                viewArr[0] = view;
                AbstractC125325le.A04(null, viewArr, true);
                return;
            }
        } else if (view != null) {
            viewArr[0] = view;
            AbstractC125325le.A05(viewArr, true);
            return;
        }
        C14360o3.A0F("cameraHeader");
        throw C00O.createAndThrow();
    }
}
