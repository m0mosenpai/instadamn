package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36351mt implements C0KV {
    public static final C36351mt A00 = new C36351mt();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-1256221975);
        int A032 = C0f9.A03(-1774248181);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LP
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                if (obj != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        C07880b8 c07880b8 = C07950bF.A04;
                        UserSession userSession2 = this.A00;
                        String str = c125205lR.A02;
                        C14360o3.A06(str);
                        DirectThreadThemeInfo A003 = AbstractC81503kK.A00(c07880b8.A01(userSession2, str));
                        if (A003 != null) {
                            if (C18U.A06(C06090Tz.A06, userSession2, 36314558373104319L)) {
                                if (C14360o3.A0K(A003.A0o, AbstractC125795mU.A00().A0o)) {
                                    C2DS c2ds = this.A01;
                                    DirectThreadKey BKb = c2ed.BKb();
                                    DirectThreadThemeInfo A004 = AbstractC125795mU.A00();
                                    C14360o3.A07(A004);
                                    c2ds.FCZ(A004, BKb, z);
                                }
                            } else {
                                this.A01.FCZ(A003, c2ed.BKb(), z);
                            }
                            return C1333660e.A00;
                        }
                        return new C1334060j(new Exception("Invalid DirectThreadThemeInfo payload"), "invalid_thread_theme_info_payload", "Invalid DirectThreadThemeInfo payload");
                    } catch (IOException e) {
                        C0w9.A05("invalid_thread_theme_info_format", "Invalid DirectThreadThemeInfo format", 1, e);
                        return new C1334060j(e, "invalid_thread_theme_info_format", "Invalid DirectThreadThemeInfo format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(1720941438, A032);
        C0f9.A0A(-46072327, A03);
        return c4l3;
    }
}
