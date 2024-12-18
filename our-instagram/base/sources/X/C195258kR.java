package X;

import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8kR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195258kR implements InterfaceC42271xH {
    public final /* synthetic */ C195218kN A00;

    public C195258kR(C195218kN c195218kN) {
        this.A00 = c195218kN;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return ((C2AS) obj).A00.CQf();
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(72886141);
        final C2AS c2as = (C2AS) obj;
        int A032 = C0f9.A03(1045054069);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9j0
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(194);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C195218kN c195218kN = C195258kR.this.A00;
                User user = c2as.A00;
                synchronized (c195218kN) {
                    C195298kV c195298kV = c195218kN.A02;
                    c195298kV.A06(user);
                    c195218kN.A04.A03(user);
                    C195298kV c195298kV2 = c195218kN.A01;
                    Iterator A16 = AbstractC166997dE.A16(c195298kV2.A05);
                    while (A16.hasNext()) {
                        Map map = ((C127165ou) A16.next()).A03;
                        if (map == null) {
                            map = Collections.emptyMap();
                        }
                        map.remove(user.getId());
                    }
                    c195298kV.A04();
                    c195298kV2.A04();
                }
            }
        });
        C0f9.A0A(-786453804, A032);
        C0f9.A0A(332656716, A03);
    }
}
