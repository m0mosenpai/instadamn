package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1wG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41661wG implements InterfaceC41671wH {
    public final C41691wJ A00;

    public final synchronized int A01(Reel reel) {
        int size;
        C41691wJ c41691wJ = this.A00;
        synchronized (c41691wJ) {
            if (!reel.A0l()) {
                size = 0;
            } else {
                C41751wP c41751wP = c41691wJ.A03;
                String id = reel.getId();
                List A0M = reel.A0M();
                synchronized (c41751wP) {
                    size = C41751wP.A00(c41751wP, id, A0M).size();
                }
            }
        }
        return size;
    }

    public final synchronized String A03(Reel reel) {
        String str;
        C41691wJ c41691wJ = this.A00;
        synchronized (c41691wJ) {
            if (!reel.A0l()) {
                str = "";
            } else {
                C41751wP c41751wP = c41691wJ.A03;
                String id = reel.getId();
                List A0M = reel.A0M();
                synchronized (c41751wP) {
                    ArrayList A00 = C41751wP.A00(c41751wP, id, A0M);
                    if (A00.isEmpty()) {
                        str = "";
                    } else {
                        str = (String) A00.get(0);
                    }
                }
                if (reel.A0M() == null || reel.A0M().isEmpty() || str.isEmpty()) {
                    if (reel.A0K() != null && !reel.A0K().isEmpty()) {
                        str = (String) reel.A0K().get(0);
                    } else {
                        str = "";
                    }
                }
            }
        }
        return str;
    }

    public final synchronized void A04(Reel reel, Long l) {
        String id;
        List list;
        boolean z;
        C41691wJ c41691wJ = this.A00;
        synchronized (c41691wJ) {
            C41751wP c41751wP = c41691wJ.A03;
            if (reel.A1P) {
                id = "NUX";
            } else {
                id = reel.getId();
            }
            long longValue = l.longValue();
            synchronized (c41751wP) {
                HashMap hashMap = c41751wP.A05;
                if (hashMap.containsKey(id) && longValue <= ((Long) hashMap.get(id)).longValue()) {
                    z = false;
                } else {
                    while (true) {
                        int size = c41751wP.A02.size();
                        list = c41751wP.A02;
                        if (size < 1000) {
                            break;
                        }
                        c41751wP.A01.remove(list.remove(list.size() - 1));
                    }
                    list.remove(id);
                    c41751wP.A02.add(0, id);
                    HashMap hashMap2 = c41751wP.A01;
                    Long valueOf = Long.valueOf(longValue);
                    hashMap2.put(id, valueOf);
                    hashMap.put(id, valueOf);
                    z = true;
                }
            }
            if (z) {
                c41691wJ.A01.A01(Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final synchronized boolean A05(Reel reel) {
        String id;
        boolean z;
        C41691wJ c41691wJ = this.A00;
        synchronized (c41691wJ) {
            if (reel.A0l()) {
                C41751wP c41751wP = c41691wJ.A03;
                String id2 = reel.getId();
                List A0K = reel.A0K();
                synchronized (c41751wP) {
                    ArrayList A01 = C41751wP.A01(A0K);
                    HashMap hashMap = c41751wP.A04;
                    if (hashMap.containsKey(id2)) {
                        List list = (List) hashMap.get(id2);
                        Iterator it = A01.iterator();
                        while (it.hasNext()) {
                            if (list.contains((String) it.next())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                }
            } else {
                C41751wP c41751wP2 = c41691wJ.A03;
                if (reel.A1P) {
                    id = "NUX";
                } else {
                    id = reel.getId();
                }
                long A02 = c41751wP2.A02(id);
                z = false;
                if (A02 > 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final synchronized boolean A06(Reel reel, Long l) {
        boolean z;
        String id;
        C41691wJ c41691wJ = this.A00;
        synchronized (c41691wJ) {
            if (reel.A0l() || (reel.A1O && l.longValue() == 0)) {
                C41751wP c41751wP = c41691wJ.A03;
                String id2 = reel.getId();
                List A0M = reel.A0M();
                synchronized (c41751wP) {
                    ArrayList A01 = C41751wP.A01(A0M);
                    HashMap hashMap = c41751wP.A04;
                    String str = id2;
                    int indexOf = id2.indexOf(58);
                    if (indexOf != -1) {
                        str = id2.substring(indexOf + 1, id2.length());
                    }
                    List list = (List) hashMap.get(str);
                    boolean contains = id2.contains("myWeek");
                    if (hashMap.containsKey(id2)) {
                        List list2 = (List) hashMap.get(id2);
                        Iterator it = A01.iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (!list2.contains(str2)) {
                                if (contains && list != null && list.contains(str2)) {
                                }
                            }
                        }
                        z = true;
                    }
                    z = false;
                    break;
                }
            }
            C41751wP c41751wP2 = c41691wJ.A03;
            if (reel.A1P) {
                id = "NUX";
            } else {
                id = reel.getId();
            }
            long A02 = c41751wP2.A02(id);
            l.getClass();
            if (A02 >= l.longValue()) {
                z = true;
            }
            z = false;
            break;
        }
        return z;
    }

    public final synchronized boolean A07(Reel reel, String str) {
        boolean z;
        C41691wJ c41691wJ = this.A00;
        synchronized (c41691wJ) {
            if (reel.A0l()) {
                z = c41691wJ.A03.A03(reel.getId(), str);
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.InterfaceC41671wH
    public final synchronized boolean Cbf(Reel reel, C41181vS c41181vS) {
        return this.A00.Cbf(reel, c41181vS);
    }

    public static C41661wG A00(final UserSession userSession) {
        return (C41661wG) userSession.A01(C41661wG.class, new InterfaceC16820sZ() { // from class: X.1wI
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C41661wG(UserSession.this);
            }
        });
    }

    public final long A02(Reel reel) {
        String id;
        C41751wP c41751wP = this.A00.A03;
        if (reel.A1P) {
            id = "NUX";
        } else {
            id = reel.getId();
        }
        return c41751wP.A02(id);
    }

    public C41661wG(final UserSession userSession) {
        this.A00 = (C41691wJ) userSession.A01(C41691wJ.class, new InterfaceC16820sZ() { // from class: X.1wM
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                C41751wP c41751wP;
                UserSession userSession2 = UserSession.this;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession2);
                try {
                    c41751wP = AbstractC41731wN.parseFromJson(C16V.A00((String) A00.A7f.CES(A00, C23031Ai.A8c[65])));
                } catch (Exception unused) {
                    c41751wP = new C41751wP();
                }
                return new C41691wJ(userSession2, c41751wP);
            }
        });
    }
}
