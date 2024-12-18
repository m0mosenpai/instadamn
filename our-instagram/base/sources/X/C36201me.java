package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36201me implements C0KV {
    public static final C36201me A00 = new C36201me();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-725678666);
        int A032 = C0f9.A03(-1538753877);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4L8
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
                C2Io c2Io;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                String str2 = (String) map.get(RealtimeProtocol.ITEM_ID);
                if (str != null && str2 != null && "add".equals(c125205lR.A00)) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(str, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        AbstractC43712JUx.A01(this.A00, c5lP, str, null, false);
                        C2DS c2ds = this.A01;
                        DirectThreadKey BKb = c2ed.BKb();
                        C40946IBt parseFromJson = AbstractC40582Hz2.parseFromJson(C16V.A00(c125205lR.A02));
                        C14360o3.A07(parseFromJson);
                        ArrayList arrayList = new ArrayList();
                        for (IEP iep : parseFromJson.A00) {
                            String str3 = iep.A01;
                            if (str3 != null) {
                                arrayList.add(new DirectCountBasedReaction(str3, iep.A00, false));
                            } else {
                                C14360o3.A0F("emoji");
                                throw C00O.createAndThrow();
                            }
                        }
                        C2DU c2du = (C2DU) c2ds;
                        C4GV A0P = c2du.A0P(BKb);
                        if (A0P == null) {
                            C0w9.A03("Null thread entry", "Entry should exist before function call");
                        } else {
                            synchronized (A0P) {
                                try {
                                    C83403nh A0I = A0P.A0I(str2);
                                    if (A0I == null) {
                                        C18950wb.A01.AEp("Message is missing from thread entry", 20134884).report();
                                        c2Io = null;
                                    } else {
                                        UserSession userSession2 = A0P.A0H;
                                        synchronized (A0I) {
                                            HashMap hashMap = new HashMap();
                                            List<DirectCountBasedReaction> list2 = A0I.A22;
                                            if (list2 != null) {
                                                for (DirectCountBasedReaction directCountBasedReaction : list2) {
                                                    hashMap.put(directCountBasedReaction.A01, directCountBasedReaction);
                                                }
                                            }
                                            Iterator it = arrayList.iterator();
                                            while (true) {
                                                boolean z2 = true;
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                DirectCountBasedReaction directCountBasedReaction2 = (DirectCountBasedReaction) it.next();
                                                String str4 = directCountBasedReaction2.A01;
                                                DirectCountBasedReaction directCountBasedReaction3 = (DirectCountBasedReaction) hashMap.get(str4);
                                                int i = directCountBasedReaction2.A00;
                                                if (i > 0) {
                                                    if (directCountBasedReaction3 == null || !directCountBasedReaction3.A02) {
                                                        z2 = false;
                                                    }
                                                    hashMap.put(str4, new DirectCountBasedReaction(str4, i, z2));
                                                } else {
                                                    hashMap.remove(str4);
                                                }
                                            }
                                            C83403nh.A04(userSession2, A0I, ImmutableList.copyOf(hashMap.values()));
                                            A0I.A2C = true;
                                            C83403nh.A06(A0I);
                                        }
                                        c2Io = new C2Io(A0P.A0I.BKb(), C05F.A1I, null, null, Collections.singletonList(A0I), true);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (c2Io != null) {
                                c2du.A06.E4s(c2Io);
                                c2du.A09.accept(c2Io);
                            }
                        }
                        return C1333660e.A00;
                    } catch (IOException | IndexOutOfBoundsException e) {
                        AbstractC43712JUx.A00(interfaceC16620sF.A00, c5lP, "Invalid DirectCountBasedReaction format");
                        C0w9.A01.EmP("invalid_direct_count_based_reaction_format", "Invalid DirectCountBasedReaction format", e);
                        return new C1334060j(e, "invalid_direct_count_based_reaction_format", "Invalid DirectCountBasedReaction format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(1723774595, A032);
        C0f9.A0A(-259437739, A03);
        return c4l3;
    }
}
