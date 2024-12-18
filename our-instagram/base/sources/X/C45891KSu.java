package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Collections;

/* renamed from: X.KSu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45891KSu extends AbstractC162927Rd implements C7AX {
    public final C7AX A00;

    public static C45891KSu A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7RX c7rx, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, C49038LmQ c49038LmQ) {
        return new C45891KSu(c7rx, c49038LmQ, new C49122Lnz(interfaceC165247aD, anonymousClass988, new C49125Lo4(interfaceC11380iw, userSession, c49038LmQ, Collections.emptyList()), new C158907Bc(interfaceC165247aD, anonymousClass988, Collections.emptyList()), new C162907Rb(Collections.singletonList(new C7AZ(anonymousClass988.A1U)))));
    }

    @Override // X.C7AX
    public final C7D8 CFg(DirectMessageIdentifier directMessageIdentifier) {
        return this.A00.CFg(directMessageIdentifier);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K0J.class;
    }

    public C45891KSu(C7RX c7rx, C7AX c7ax, C49122Lnz c49122Lnz) {
        super(c7rx, c49122Lnz);
        this.A00 = c7ax;
    }
}
