package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Arrays;

/* renamed from: X.KSt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45890KSt extends AbstractC162927Rd implements C7AX {
    public final C7AX A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static C45890KSt A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7RX c7rx, InterfaceC165077Zw interfaceC165077Zw, AnonymousClass988 anonymousClass988, C49038LmQ c49038LmQ) {
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        return new C45890KSt(c7rx, c49038LmQ, new C49125Lo4(interfaceC11380iw, userSession, c49038LmQ, Arrays.asList(c7az, new C1580177l(new C162897Ra(interfaceC165077Zw), new C49008Llw(interfaceC165077Zw), c7az.A00(interfaceC165077Zw), new C7Q9(interfaceC165077Zw, z), interfaceC165077Zw, anonymousClass988, null, false))));
    }

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return this.A00.CFg(directMessageIdentifier);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K0I.class;
    }

    public C45890KSt(C7RX c7rx, C7AX c7ax, C49125Lo4 c49125Lo4) {
        super(c7rx, c49125Lo4);
        this.A00 = c7ax;
    }
}
