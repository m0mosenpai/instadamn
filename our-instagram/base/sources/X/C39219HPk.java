package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HPk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39219HPk extends C17T implements InterfaceC43534JKu {
    @Override // X.InterfaceC43534JKu
    public final List AyC() {
        return A08(2122981139, C39220HPl.class);
    }

    @Override // X.InterfaceC43534JKu
    public final IGPostClickEligibleExperienceTypes B14() {
        return (IGPostClickEligibleExperienceTypes) A0N(176560507, C43247J9s.A00);
    }

    @Override // X.InterfaceC43534JKu
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39978HoG.A00(this));
    }

    @Override // X.InterfaceC43534JKu
    public final String AyE() {
        return A0i(682813800);
    }

    @Override // X.InterfaceC43534JKu
    public final H3e Eui() {
        ArrayList arrayList;
        List AyC = AyC();
        if (AyC != null) {
            arrayList = AbstractC167017dG.A0q(AyC);
            Iterator it = AyC.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43535JKv) it.next()).Euj());
            }
        } else {
            arrayList = null;
        }
        return new H3e(B14(), A0i(682813800), arrayList);
    }
}
