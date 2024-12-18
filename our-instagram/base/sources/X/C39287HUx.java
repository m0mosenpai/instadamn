package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HUx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39287HUx extends C17T implements JMZ {
    @Override // X.JMZ
    public final List Ac6() {
        return A08(-847398795, HUs.class);
    }

    @Override // X.JMZ
    public final INLINE_SURVEY_QUESTION_TYPES CBV() {
        return (INLINE_SURVEY_QUESTION_TYPES) A0N(3575610, C43304JBx.A00);
    }

    @Override // X.JMZ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40374HvL.A00(this));
    }

    @Override // X.JMZ
    public final String AyE() {
        return A0i(-297021103);
    }

    @Override // X.JMZ
    public final String BX4() {
        return A0j(-1115571352);
    }

    @Override // X.JMZ
    public final String Bdb() {
        return A0i(598246771);
    }

    @Override // X.JMZ
    public final Boolean C3K() {
        return getOptionalBooleanValueByHashCode(-260188249);
    }

    @Override // X.JMZ
    public final String C3M() {
        return A0i(53546228);
    }

    @Override // X.JMZ
    public final H6V F2k() {
        ArrayList arrayList;
        List Ac6 = Ac6();
        if (Ac6 != null) {
            arrayList = AbstractC167017dG.A0q(Ac6);
            Iterator it = Ac6.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43563JLx) it.next()).F2g());
            }
        } else {
            arrayList = null;
        }
        String A0i = A0i(-297021103);
        String A0e = A0e();
        String A0j = A0j(-1115571352);
        String A0i2 = A0i(598246771);
        return new H6V(CBV(), getOptionalBooleanValueByHashCode(-260188249), A0i, A0e, A0j, A0i2, A0i(53546228), A0Y(), arrayList);
    }

    @Override // X.JMZ
    public final String getId() {
        return A0e();
    }

    @Override // X.JMZ
    public final String getTitle() {
        return A0Y();
    }
}
