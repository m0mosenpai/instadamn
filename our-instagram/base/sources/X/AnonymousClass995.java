package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.995, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass995 {
    public List A00;
    public final UserSession A01;
    public final int A02;
    public final C2DS A03;

    public static final void A00(AnonymousClass995 anonymousClass995, final InterfaceC16820sZ interfaceC16820sZ, final InterfaceC16660sJ interfaceC16660sJ) {
        List<C2ED> A0G = ((C2DU) anonymousClass995.A03).A0C.A0G(C4I1.A00, C2EB.A04, C4I3.A03);
        int min = Math.min(anonymousClass995.A02, A0G.size());
        if (min > 0) {
            A0G = A0G.subList(0, min);
        }
        ArrayList arrayList = new ArrayList();
        for (C2ED c2ed : A0G) {
            if (!c2ed.CVQ() && !c2ed.CPl()) {
                arrayList.addAll(c2ed.BSD());
            }
        }
        if (!arrayList.isEmpty()) {
            UserSession userSession = anonymousClass995.A01;
            C1OU c1ou = C1OU.$redex_init_class;
            C14360o3.A0B(userSession, 0);
            C25621Ms c25621Ms = new C25621Ms(userSession, -2);
            c25621Ms.A09(C05F.A01);
            c25621Ms.A0B("feed/get_latest_reel_media/");
            c25621Ms.A0S(C214399ed.class, C208139Iu.class);
            try {
                c25621Ms.A9s("user_ids", C85743s3.A01(arrayList));
            } catch (IOException e) {
                C0K8.A0G("ReelApiUtil", AbstractC111324zv.A00(313), e);
            }
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C1P1() { // from class: X.9Io
                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A0N2 = AbstractC167017dG.A0N(abstractC115105If, -1329492830);
                    super.onFail(abstractC115105If);
                    interfaceC16820sZ.invoke();
                    C0f9.A0A(72986348, A0N2);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(854302752);
                    C214399ed c214399ed = (C214399ed) obj;
                    int A0N2 = AbstractC167017dG.A0N(c214399ed, -1157319181);
                    super.onSuccess(c214399ed);
                    InterfaceC16660sJ interfaceC16660sJ2 = interfaceC16660sJ;
                    List unmodifiableList = Collections.unmodifiableList(c214399ed.A00);
                    C14360o3.A07(unmodifiableList);
                    interfaceC16660sJ2.invoke(unmodifiableList);
                    C0f9.A0A(1621540325, A0N2);
                    C0f9.A0A(836178899, A03);
                }
            };
            C1GJ.A06(A0N, 119, 3, true, false);
        }
    }

    public AnonymousClass995(UserSession userSession, C2DS c2ds) {
        this.A01 = userSession;
        this.A03 = c2ds;
        this.A02 = (int) C18U.A01(C06090Tz.A05, userSession, 36592996807869314L);
    }
}
