package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.1n5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36461n5 implements C0KV {
    public static final C36461n5 A00 = new C36461n5();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-874134016);
        int A032 = C0f9.A03(973165372);
        C14360o3.A0B(userSession, 0);
        C4L3 c4l3 = new C4L3(userSession) { // from class: X.4Lb
            public final UserSession A00;

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(c125205lR, 2);
                if (C14360o3.A0K(c125205lR.A00, "replace")) {
                    AbstractC25651Mw.A00(this.A00).E4s(new C125685mF(EnumC124815km.A06));
                    return C1333660e.A00;
                }
                return C1333860h.A00;
            }

            {
                this.A00 = userSession;
            }
        };
        C0f9.A0A(711884699, A032);
        C0f9.A0A(464814414, A03);
        return c4l3;
    }
}
