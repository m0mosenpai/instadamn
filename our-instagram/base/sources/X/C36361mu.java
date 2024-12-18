package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36361mu implements C0KV {
    public static final C36361mu A00 = new C36361mu();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(778161631);
        int A032 = C0f9.A03(848129289);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LQ
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
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                if (str != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    return updateLoadableThreadTheme(str, c5lP, c125205lR, z, interfaceC16620sF);
                }
                return C1333860h.A00;
            }

            public final AbstractC1333760g updateLoadableThreadTheme(String str, C5lP c5lP, C125205lR c125205lR, boolean z, InterfaceC16620sF interfaceC16620sF) {
                C14360o3.A0B(str, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 4);
                C2ED c2ed = (C2ED) interfaceC16620sF.invoke(str, c5lP);
                if (c2ed == null) {
                    return XZZ.A00;
                }
                UserSession userSession2 = this.A00;
                if (!C18U.A06(C06090Tz.A06, userSession2, 36314558373104319L)) {
                    return C1333660e.A00;
                }
                try {
                    C07880b8 c07880b8 = C07950bF.A04;
                    String str2 = c125205lR.A02;
                    C14360o3.A06(str2);
                    C66618UPf parseFromJson = AbstractC65783Tu1.parseFromJson(c07880b8.A01(userSession2, str2));
                    if (parseFromJson != null) {
                        this.A01.FCZ(AbstractC69936Vy7.A00(parseFromJson), c2ed.BKb(), z);
                        return C1333660e.A00;
                    }
                    return new C1334060j(new Exception("Invalid LoadableThreadThemeInfo payload"), "invalid_loadable_thread_theme_info_payload", "Invalid LoadableThreadThemeInfo payload");
                } catch (IOException e) {
                    C0w9.A05("invalid_loadable_thread_theme_info_format", "Invalid LoadableThreadThemeInfo format", 1, e);
                    return new C1334060j(e, "invalid_loadable_thread_theme_info_format", "Invalid LoadableThreadThemeInfo format");
                }
            }
        };
        C0f9.A0A(-596999425, A032);
        C0f9.A0A(-1778233131, A03);
        return c4l3;
    }
}
