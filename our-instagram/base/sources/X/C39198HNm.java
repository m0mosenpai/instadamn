package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HNm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39198HNm extends C17T implements InterfaceC43579JMn {
    @Override // X.InterfaceC43579JMn
    public final ClipsTextAlignment Aar() {
        return (ClipsTextAlignment) A0N(1767875043, J9I.A00);
    }

    @Override // X.InterfaceC43579JMn
    public final List ApQ() {
        return A0o(-1354842768, C39206HNv.class);
    }

    @Override // X.InterfaceC43579JMn
    public final ClipsTextEmphasisMode C6D() {
        return (ClipsTextEmphasisMode) A0N(1084288756, J9J.A00);
    }

    @Override // X.InterfaceC43579JMn
    public final ClipsTextFormatType C6K() {
        return (ClipsTextFormatType) A0N(-824444304, J9K.A00);
    }

    @Override // X.InterfaceC43579JMn
    public final C38700H2l Es6() {
        ClipsTextAlignment Aar = Aar();
        List ApQ = ApQ();
        ArrayList A0q = AbstractC167017dG.A0q(ApQ);
        Iterator it = ApQ.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC93074Fh) it.next()).EsG());
        }
        Float A0E = A0E();
        Float A0K = A0K(-1539906063);
        Float A0C = A0C();
        return new C38700H2l(Aar, C6D(), C6K(), getOptionalBooleanValueByHashCode(-1530233576), getOptionalBooleanValueByHashCode(-1008587329), A0E, A0K, A0C, A0K(-755984436), A0K(-755984435), A0K(-661613907), A0K(109250890), A0D(), A0G(), getOptionalIntValueByHashCode(-573585203), A0X(), A0q);
    }

    @Override // X.InterfaceC43579JMn
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39822HlW.A00(this));
    }

    @Override // X.InterfaceC43579JMn
    public final Float B29() {
        return A0E();
    }

    @Override // X.InterfaceC43579JMn
    public final Float B7g() {
        return A0K(-1539906063);
    }

    @Override // X.InterfaceC43579JMn
    public final Float BDR() {
        return A0C();
    }

    @Override // X.InterfaceC43579JMn
    public final Float BYe() {
        return A0K(-755984436);
    }

    @Override // X.InterfaceC43579JMn
    public final Float BYg() {
        return A0K(-755984435);
    }

    @Override // X.InterfaceC43579JMn
    public final Float Bpc() {
        return A0K(-661613907);
    }

    @Override // X.InterfaceC43579JMn
    public final Float BqQ() {
        return A0K(109250890);
    }

    @Override // X.InterfaceC43579JMn
    public final Float Bzq() {
        return A0D();
    }

    @Override // X.InterfaceC43579JMn
    public final Float CHf() {
        return A0G();
    }

    @Override // X.InterfaceC43579JMn
    public final Integer CIi() {
        return getOptionalIntValueByHashCode(-573585203);
    }

    @Override // X.InterfaceC43579JMn
    public final Boolean CPu() {
        return getOptionalBooleanValueByHashCode(-1530233576);
    }

    @Override // X.InterfaceC43579JMn
    public final Boolean CUj() {
        return getOptionalBooleanValueByHashCode(-1008587329);
    }

    @Override // X.InterfaceC43579JMn
    public final String getText() {
        return A0X();
    }
}
