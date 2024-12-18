package X;

import android.view.View;

/* loaded from: classes5.dex */
public abstract class CBO {
    public static final View A00(C58K c58k) {
        if (!((C58J) c58k).A03.A08) {
            AbstractC28290Cdc.A01("Cannot get View because the Modifier node is not currently attached.");
            throw C00O.createAndThrow();
        }
        Object A00 = C59M.A00(AbstractC114335Dx.A02(c58k));
        C14360o3.A0C(A00, AbstractC111324zv.A00(2));
        return (View) A00;
    }
}
