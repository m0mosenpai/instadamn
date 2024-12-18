package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36191md implements C0KV {
    public static final C36191md A00 = new C36191md();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-1828547337);
        int A032 = C0f9.A03(206989305);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4L7
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                AnonymousClass441 anonymousClass441;
                int length;
                C2Io c2Io;
                C2Io c2Io2;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                String str2 = (String) map.get(RealtimeProtocol.ITEM_ID);
                String str3 = (String) map.get(RealtimeProtocol.USER_ID);
                if (str != null && str2 != null && str3 != null) {
                    String str4 = c125205lR.A00;
                    boolean A0K = C14360o3.A0K(str4, "add");
                    C4L7 c4l7 = A0K;
                    if (!A0K) {
                        boolean A0K2 = C14360o3.A0K(str4, "remove");
                        c4l7 = A0K2;
                        if (!A0K2) {
                            return C1333860h.A00;
                        }
                    }
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(str, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        String str5 = c125205lR.A02;
                        if (str5 != null && str5.charAt(0) == '{') {
                            anonymousClass441 = AnonymousClass440.parseFromJson(C16V.A00(c125205lR.A02));
                        } else {
                            String str6 = c125205lR.A02;
                            if (str6 != null && (length = str6.length()) != 0 && length > 4) {
                                try {
                                    String substring = str6.substring(3, length - 1);
                                    C14360o3.A07(substring);
                                    String[] strArr = (String[]) new C11L("\\\\u").A03(substring).toArray(new String[0]);
                                    int length2 = strArr.length;
                                    char[] cArr = new char[length2];
                                    for (int i = 0; i < length2; i++) {
                                        cArr[i] = (char) Integer.parseInt(strArr[i], 16);
                                    }
                                    str6 = new String(cArr);
                                } catch (Exception e) {
                                    C0w9.A06("EmojiParseUtil", AnonymousClass001.A0R("Could not parse badly formatted emoji ", str6), e);
                                }
                            } else {
                                str6 = null;
                            }
                            anonymousClass441 = new AnonymousClass441(null, null, str3, str6, null);
                        }
                        String str7 = c125205lR.A00;
                        if (C14360o3.A0K(str7, "add")) {
                            AbstractC43712JUx.A01(this.A00, c5lP, str, str3, false);
                            C2DS c2ds = this.A01;
                            DirectThreadKey BKb = c2ed.BKb();
                            String str8 = c5lP.A04;
                            C2DU c2du = (C2DU) c2ds;
                            C4GV A0P = c2du.A0P(BKb);
                            if (A0P == null) {
                                C0w9.A03("Null thread entry", "Entry should exist before function call");
                            } else {
                                synchronized (A0P) {
                                    C83403nh A0I = A0P.A0I(str2);
                                    if (A0I == null) {
                                        C18950wb.A01.AEp("liked/unliked message is missing from thread entry", 20134884).report();
                                        c2Io2 = null;
                                    } else {
                                        A0I.A0z(A0P.A0H, anonymousClass441, str3, str8);
                                        c2Io2 = new C2Io(A0P.A0I.BKb(), C05F.A0u, null, null, Collections.singletonList(A0I), true);
                                    }
                                }
                                A0P.A0I(str2);
                                if (c2Io2 != null) {
                                    c2du.A06.E4s(c2Io2);
                                    c2du.A09.accept(c2Io2);
                                    if (z) {
                                        C2DU.A0F(c2du, A0P);
                                    }
                                }
                            }
                            return C1333660e.A00;
                        }
                        if (C14360o3.A0K(str7, "remove")) {
                            AbstractC43712JUx.A01(this.A00, c5lP, str, str3, false);
                            C2DS c2ds2 = this.A01;
                            DirectThreadKey BKb2 = c2ed.BKb();
                            String str9 = c5lP.A04;
                            C2DU c2du2 = (C2DU) c2ds2;
                            C4GV A0P2 = c2du2.A0P(BKb2);
                            if (A0P2 == null) {
                                C0w9.A03("Null thread entry", "Entry should exist before function call");
                            } else {
                                synchronized (A0P2) {
                                    C83403nh A0I2 = A0P2.A0I(str2);
                                    if (A0I2 == null) {
                                        C18950wb.A01.AEp("liked/unliked message is missing from thread entry", 20134884).report();
                                        c2Io = null;
                                    } else {
                                        A0I2.A10(A0P2.A0H, anonymousClass441, str3, str9);
                                        c2Io = new C2Io(A0P2.A0I.BKb(), C05F.A1F, null, null, Collections.singletonList(A0I2), true);
                                    }
                                }
                                A0P2.A0I(str2);
                                if (c2Io != null) {
                                    c2du2.A06.E4s(c2Io);
                                    c2du2.A09.accept(c2Io);
                                    if (z) {
                                        C2DU.A0F(c2du2, A0P2);
                                    }
                                }
                            }
                            return C1333660e.A00;
                        }
                        AbstractC43712JUx.A00(this.A00, c5lP, AnonymousClass001.A0R("Invalid operation: ", c125205lR.A00));
                        String A0R = AnonymousClass001.A0R("Invalid operation: ", c125205lR.A00);
                        return new C1334160k(new Exception(A0R), "Invalid operation", A0R);
                    } catch (IOException | IndexOutOfBoundsException e2) {
                        AbstractC43712JUx.A00(c4l7.A00, c5lP, "Invalid DirectReaction format");
                        C0w9.A01.EmP("invalid_direct_reaction_format", "Invalid DirectReaction format", e2);
                        return new C1334060j(e2, "invalid_direct_reaction_format", "Invalid DirectReaction format");
                    }
                }
                return C1333660e.A00;
            }
        };
        C0f9.A0A(362635337, A032);
        C0f9.A0A(1113050047, A03);
        return c4l3;
    }
}
