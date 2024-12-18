package X;

import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EhE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33015EhE extends C17T implements InterfaceC37259GbC {
    public List A00;

    @Override // X.InterfaceC37259GbC
    public final InterfaceC37259GbC E95(C1DY c1dy) {
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
