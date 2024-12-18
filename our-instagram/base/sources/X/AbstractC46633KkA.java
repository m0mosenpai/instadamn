package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.KkA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46633KkA {
    public static final C45072Jx1 A00(InterfaceC50504MRh interfaceC50504MRh) {
        C14360o3.A0B(interfaceC50504MRh, 0);
        C45150Jyq c45150Jyq = (C45150Jyq) interfaceC50504MRh;
        LineType lineType = c45150Jyq.A00;
        ThreadItemType threadItemType = c45150Jyq.A01;
        C45170JzB c45170JzB = new C45170JzB(c45150Jyq.A02);
        List list = c45150Jyq.A08;
        User user = c45150Jyq.A03;
        boolean z = c45150Jyq.A0A;
        boolean z2 = c45150Jyq.A09;
        return new C45072Jx1(lineType, threadItemType, c45170JzB, user, c45150Jyq.A04, c45150Jyq.A07, list, z, z2, false, AbstractC31177DnL.A1a(c45150Jyq.A05), AbstractC167007dF.A1T(c45150Jyq.A06));
    }
}
