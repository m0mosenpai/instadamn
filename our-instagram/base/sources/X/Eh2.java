package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Eh2 extends C17T implements InterfaceC169427hG {
    public List A00;

    @Override // X.InterfaceC169427hG
    public final InterfaceC169427hG E8j(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(111578632, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }
}
