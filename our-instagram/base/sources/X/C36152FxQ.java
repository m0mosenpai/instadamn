package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.FxQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36152FxQ implements InterfaceC41501vz {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final InterfaceC16820sZ A03;

    public C36152FxQ(UserSession userSession, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-677773152);
        C2Io c2Io = (C2Io) obj;
        int A0N = AbstractC167017dG.A0N(c2Io, 353065862);
        List list = c2Io.A04;
        if (list != null) {
            loop0: for (Object obj2 : list) {
                C83403nh c83403nh = (C83403nh) obj2;
                ImmutableList A0H = c83403nh.A0H();
                if (c83403nh.A10 == C2EY.A0z && A0H != null) {
                    C1LC it = A0H.iterator();
                    C14360o3.A07(it);
                    while (it.hasNext()) {
                        if (C14360o3.A0K(AbstractC31180DnO.A0k(((C910143t) it.next()).A0o), this.A01)) {
                            break loop0;
                        }
                    }
                }
                if (c2Io.A01 == C05F.A0M && C14360o3.A0K(c83403nh.A0h(), this.A02)) {
                    if (obj2 != null) {
                        this.A03.invoke();
                    }
                }
            }
        }
        C0f9.A0A(631377402, A0N);
        C0f9.A0A(1856472889, A03);
    }
}
