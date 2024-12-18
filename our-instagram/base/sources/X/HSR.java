package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HSR extends C17T implements InterfaceC39571se {
    @Override // X.InterfaceC39571se
    public final /* synthetic */ C103484lO AKW() {
        return new C103484lO(this);
    }

    @Override // X.InterfaceC39571se
    public final List CDr() {
        return A08(-781022901, HVR.class);
    }

    @Override // X.InterfaceC39571se
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37395Gdb.A00(this));
    }

    @Override // X.InterfaceC39571se
    public final Boolean B1k() {
        return getOptionalBooleanValueByHashCode(1684297097);
    }

    @Override // X.InterfaceC39571se
    public final Double BQC() {
        return getOptionalDoubleValueByHashCode(841304681);
    }

    @Override // X.InterfaceC39571se
    public final String Bew() {
        return A0j(-880243409);
    }

    @Override // X.InterfaceC39571se
    public final String Bex() {
        return A0j(-1551648676);
    }

    @Override // X.InterfaceC39571se
    public final Double BfM() {
        return getOptionalDoubleValueByHashCode(396493666);
    }

    @Override // X.InterfaceC39571se
    public final String BjF() {
        return A0j(1606477834);
    }

    @Override // X.InterfaceC39571se
    public final Double C8M() {
        return getOptionalDoubleValueByHashCode(-607183684);
    }

    @Override // X.InterfaceC39571se
    public final C39561sd Eyq() {
        ArrayList arrayList;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1684297097);
        Double optionalDoubleValueByHashCode = getOptionalDoubleValueByHashCode(841304681);
        String A0j = A0j(-880243409);
        String A0j2 = A0j(-1551648676);
        Double optionalDoubleValueByHashCode2 = getOptionalDoubleValueByHashCode(396493666);
        String A0j3 = A0j(1606477834);
        Double optionalDoubleValueByHashCode3 = getOptionalDoubleValueByHashCode(-607183684);
        List CDr = CDr();
        if (CDr != null) {
            arrayList = AbstractC167017dG.A0q(CDr);
            Iterator it = CDr.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC43522JKi) it.next()).F3b());
            }
        } else {
            arrayList = null;
        }
        return new C39561sd(optionalBooleanValueByHashCode, optionalDoubleValueByHashCode, optionalDoubleValueByHashCode2, optionalDoubleValueByHashCode3, A0j, A0j2, A0j3, arrayList);
    }
}
