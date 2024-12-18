package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5pJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127405pJ {
    public static final /* synthetic */ C127405pJ A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5pK] */
    public static final C127415pK A00(final UserSession userSession, final C1M6 c1m6, final AnonymousClass317 anonymousClass317, final List list) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c1m6, 3);
        return new InterfaceC127425pL(userSession, c1m6, anonymousClass317, list) { // from class: X.5pK
            public final C126095n3 A00;
            public final C1M6 A01;
            public final InterfaceC25391Lt A02;
            public final InterfaceC115345Ji A03;
            public final boolean A04;

            {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
                InterfaceC25391Lt A002 = C25361Lq.A00(userSession);
                final EnumC64222vh enumC64222vh = EnumC64222vh.A06;
                InterfaceC115345Ji interfaceC115345Ji = new InterfaceC115345Ji(anonymousClass317, enumC64222vh, list) { // from class: X.5pM
                    public final AnonymousClass317 A00;
                    public final EnumC64222vh A01;
                    public final List A02;

                    @Override // X.InterfaceC115345Ji
                    public final List EMu(List list2) {
                        C14360o3.A0B(list2, 0);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            C9C7 c9c7 = (C9C7) ((C9BW) obj).A01;
                            if (c9c7.A04 == this.A00 && c9c7.A05 == this.A01 && this.A02.contains(c9c7.A01)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    }

                    {
                        this.A01 = enumC64222vh;
                        this.A00 = anonymousClass317;
                        this.A02 = list;
                    }
                };
                C126095n3 c126095n3 = new C126095n3(userSession, c1m6);
                C14360o3.A0B(A002, 6);
                this.A01 = c1m6;
                this.A04 = A06;
                this.A02 = A002;
                this.A03 = interfaceC115345Ji;
                this.A00 = c126095n3;
            }

            @Override // X.InterfaceC127425pL
            public final HashMap AU8(AnonymousClass317 anonymousClass3172, String str) {
                InterfaceC25391Lt interfaceC25391Lt = this.A02;
                List EMt = interfaceC25391Lt.EMt(this.A03);
                if (!this.A04) {
                    interfaceC25391Lt.EGJ(EMt);
                }
                return this.A00.A00(AbstractC123655ie.A00(anonymousClass3172), str, EMt);
            }
        };
    }
}
