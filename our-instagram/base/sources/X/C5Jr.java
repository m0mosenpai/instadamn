package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Jr, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Jr implements C5Js {
    public final C5Jv A00;
    public final C1M6 A01;
    public final InterfaceC25391Lt A02;
    public final InterfaceC115345Ji A03;
    public final InterfaceC115345Ji A04;
    public final boolean A05;

    public /* synthetic */ C5Jr(UserSession userSession, C1M6 c1m6, final EnumC64222vh enumC64222vh) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
        InterfaceC25391Lt A00 = C25361Lq.A00(userSession);
        InterfaceC115345Ji interfaceC115345Ji = new InterfaceC115345Ji(enumC64222vh) { // from class: X.5Jt
            public final EnumC64222vh A00;

            @Override // X.InterfaceC115345Ji
            public final List EMu(List list) {
                C14360o3.A0B(list, 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    C9C7 c9c7 = (C9C7) ((C9BW) obj).A01;
                    if (c9c7.A04 == AnonymousClass317.A0D && c9c7.A05 == this.A00) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            {
                this.A00 = enumC64222vh;
            }
        };
        InterfaceC115345Ji interfaceC115345Ji2 = new InterfaceC115345Ji(enumC64222vh) { // from class: X.5Ju
            public final EnumC64222vh A00;

            @Override // X.InterfaceC115345Ji
            public final List EMu(List list) {
                C14360o3.A0B(list, 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    C9C7 c9c7 = (C9C7) ((C9BW) obj).A01;
                    if (c9c7.A04 == AnonymousClass317.A0T && c9c7.A05 == this.A00) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            {
                this.A00 = enumC64222vh;
            }
        };
        C5Jv c5Jv = new C5Jv(userSession, c1m6);
        C14360o3.A0B(A00, 5);
        this.A01 = c1m6;
        this.A05 = A06;
        this.A02 = A00;
        this.A03 = interfaceC115345Ji;
        this.A04 = interfaceC115345Ji2;
        this.A00 = c5Jv;
    }
}
