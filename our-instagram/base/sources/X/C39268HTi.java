package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HTi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39268HTi extends C17T implements InterfaceC43488JJa {
    public List A00;

    @Override // X.InterfaceC43488JJa
    public final InterfaceC43488JJa EAN(C1DY c1dy) {
        List<JJK> list = this.A00;
        if (list == null) {
            list = A0o(-463255253, C39176HMe.class);
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (JJK jjk : list) {
            jjk.E8f(c1dy);
            A0q.add(jjk);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC43488JJa
    public final C38771H5l F0v(C1DY c1dy) {
        ClipsACRMidCardSubType clipsACRMidCardSubType = (ClipsACRMidCardSubType) A0N(346870402, JBN.A00);
        List list = this.A00;
        if (list == null) {
            list = A0o(-463255253, C39176HMe.class);
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((JJK) it.next()).EqX(c1dy));
        }
        return new C38771H5l(clipsACRMidCardSubType, A0U(), A0Y(), A0q);
    }
}
