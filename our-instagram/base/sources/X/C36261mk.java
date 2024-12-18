package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36261mk implements C0KV {
    public static final C36261mk A00 = new C36261mk();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(806269773);
        int A032 = C0f9.A03(-1758456110);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4LE
            public final C28811aJ A00;

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(c125205lR, 2);
                if (C14360o3.A0K(c125205lR.A00, "resnapshot")) {
                    this.A00.A09();
                    return C1333660e.A00;
                }
                return C1333860h.A00;
            }

            {
                C28811aJ A002 = C28811aJ.A00(userSession);
                C14360o3.A07(A002);
                this.A00 = A002;
            }
        };
        C0f9.A0A(-1187401867, A032);
        C0f9.A0A(-70159239, A03);
        return c4l3;
    }
}
