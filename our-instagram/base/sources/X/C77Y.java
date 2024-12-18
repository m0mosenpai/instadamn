package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.77Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77Y extends AbstractC162927Rd {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.7Rd, X.77Y] */
    public static C77Y A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7RX c7rx, final InterfaceC165017Zq interfaceC165017Zq, AnonymousClass988 anonymousClass988, C7DK c7dk, boolean z) {
        boolean z2 = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z2);
        C1580177l c1580177l = new C1580177l(new C162897Ra(interfaceC165017Zq), new C77Z(interfaceC165017Zq, 1, 0, false), new C158657Ab(interfaceC165017Zq, c7az.A00), new C7Q9(interfaceC165017Zq, z2), interfaceC165017Zq, anonymousClass988, null, false);
        final C7F3 c7f3 = new C7F3(userSession);
        return new AbstractC162927Rd(c7rx, new C1579277b(interfaceC11380iw, userSession, (C7ZZ) interfaceC165017Zq, anonymousClass988, c7dk, Arrays.asList(c7az, c1580177l, new C7QB() { // from class: X.77a
            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void D8a(Object obj) {
            }

            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
            }

            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
                C9CP c9cp;
                String str;
                android.net.Uri A03;
                C7QY c7qy = (C7QY) obj2;
                DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
                String str2 = directMessageIdentifier.A02;
                String str3 = c7qy.A0Y;
                if (str3 == null) {
                    str3 = c7qy.A0T;
                }
                String str4 = directMessageIdentifier.A00;
                if (str2 != null && str3 != null) {
                    ((C7ZT) interfaceC165017Zq).AFl(str2, str3, str3, str4, true);
                }
                C7F3 c7f32 = c7f3;
                if (str2 != null) {
                    java.util.Set set = c7f32.A02;
                    if (!set.contains(str2)) {
                        set.add(str2);
                        List list = c7qy.A0b;
                        if (list != null && (c9cp = (C9CP) AbstractC001800i.A0J(list)) != null && (str = c9cp.A06) != null && (A03 = AbstractC08820cl.A03(str)) != null) {
                            LinkedHashMap A032 = c7f32.A03(A03);
                            if (!A032.isEmpty()) {
                                C18920wW c18920wW = c7f32.A01;
                                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_thread_link_impression");
                                if (A00.isSampled()) {
                                    A00.A9M("extra", A032);
                                    A00.Cht();
                                }
                            }
                        }
                    }
                }
            }
        }), false, z));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C1576676a.class;
    }
}
