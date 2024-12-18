package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.1nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36681nR implements C0KV {
    public static final C36681nR A00 = new C36681nR();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(103732479);
        int A032 = C0f9.A03(205601096);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Lv
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(c125205lR, 2);
                if (C14360o3.A0K(c125205lR.A00, "replace")) {
                    UserSession userSession2 = this.A00;
                    if (C2E8.A02(userSession2)) {
                        C07880b8 c07880b8 = C07950bF.A04;
                        String str = c125205lR.A02;
                        C14360o3.A06(str);
                        ((C2DU) this.A01).A0C.A0T(C23040ADw.parseFromJson(c07880b8.A01(userSession2, str)).A00, z);
                    }
                    return C1333660e.A00;
                }
                String A0R = AnonymousClass001.A0R("Unsupported operation: ", c125205lR.A00);
                return new C1334160k(new Exception(A0R), "Unsupported operation", A0R);
            }
        };
        C0f9.A0A(2012386306, A032);
        C0f9.A0A(631108383, A03);
        return c4l3;
    }
}
