package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36251mj implements C0KV {
    public static final C36251mj A00 = new C36251mj();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(1400560359);
        int A032 = C0f9.A03(-107100464);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LD
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C2Io c2Io;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                String str2 = (String) map.get(RealtimeProtocol.ITEM_ID);
                if (str != null && str2 != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(str, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        String str3 = AbstractC40586Hz6.parseFromJson(C16V.A00(c125205lR.A02)).A00;
                        C2DU c2du = (C2DU) this.A01;
                        C4GV A0P = c2du.A0P(c2ed.BKb());
                        if (A0P == null) {
                            C0w9.A03("Null thread entry", "Entry should exist before function call");
                        } else {
                            synchronized (A0P) {
                                C83403nh A0I = A0P.A0I(str2);
                                if (A0I == null) {
                                    C18950wb.A01.AEp("Message is missing from thread entry", 20134884).report();
                                    c2Io = null;
                                } else {
                                    synchronized (A0I) {
                                        C38321qM c38321qM = A0I.A0s;
                                        if (c38321qM != null && (c38321qM.A0C.Bs0() == null || !A0I.A0s.A0C.Bs0().contains(str3))) {
                                            C38321qM c38321qM2 = A0I.A0s;
                                            List Bs0 = c38321qM2.A0C.Bs0();
                                            if (Bs0 == null) {
                                                Bs0 = new ArrayList();
                                            }
                                            List A02 = C15500q5.A02(Bs0);
                                            A02.add(str3);
                                            c38321qM2.A0C.EdK(A02);
                                            A0I.A2C = true;
                                        }
                                    }
                                    c2Io = new C2Io(A0P.A0I.BKb(), C05F.A0J, null, null, Collections.singletonList(A0I), false);
                                }
                            }
                            if (c2Io != null) {
                                c2du.A06.E4s(c2Io);
                                c2du.A09.accept(c2Io);
                                if (z) {
                                    C2DU.A0F(c2du, A0P);
                                }
                            }
                        }
                        AbstractC43712JUx.A01(this.A00, c5lP, str, null, false);
                        return C1333660e.A00;
                    } catch (Exception e) {
                        AbstractC43712JUx.A00(this.A00, c5lP, "Invalid DirectSeedSharedAlbum format");
                        C0w9.A01.EmP("invalid_direct_seed_shared_album_format", "Invalid DirectSeedSharedAlbum format", e);
                        return new C1334060j(e, "invalid_direct_seed_shared_album_format", "Invalid DirectSeedSharedAlbum format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(861137801, A032);
        C0f9.A0A(-622030709, A03);
        return c4l3;
    }
}
