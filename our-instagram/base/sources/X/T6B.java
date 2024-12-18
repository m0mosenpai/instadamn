package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class T6B implements InterfaceC65415Tjm {
    public final List A00;

    @Override // X.InterfaceC65415Tjm
    public final void FFh(SEX sex) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC65415Tjm) it.next()).FFh(sex);
        }
    }

    public T6B(Context context, AbstractC61401Rn0 abstractC61401Rn0) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = A1E;
        if (((RNF) abstractC61401Rn0).A02) {
            A1E.add(new T6C(context, abstractC61401Rn0));
        }
    }
}
