package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.WVh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70429WVh implements C1WA {
    public final C1WA[] A00;

    public C70429WVh(C1WA... c1waArr) {
        this.A00 = c1waArr;
    }

    @Override // X.C1WA
    public final Drawable AM6(Resources resources, C27771Wf c27771Wf, C3QA c3qa) {
        AbstractC167017dG.A1N(resources, c3qa);
        C14360o3.A0B(c27771Wf, 2);
        C1WA[] c1waArr = this.A00;
        int i = 0;
        do {
            Drawable AM6 = c1waArr[i].AM6(resources, c27771Wf, c3qa);
            if (AM6 == null) {
                i++;
            } else {
                return AM6;
            }
        } while (i < 2);
        return null;
    }
}
