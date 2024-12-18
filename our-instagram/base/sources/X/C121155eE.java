package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121155eE {
    public final C121135e7 A00;
    public final InterfaceC19630xq A01;
    public final LinkedHashMap A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final UserSession A05;

    public C121155eE(C121135e7 c121135e7, UserSession userSession) {
        C14360o3.A0B(c121135e7, 1);
        this.A00 = c121135e7;
        this.A05 = userSession;
        this.A01 = C1AT.A01(userSession).A04(C1AV.A1D, getClass());
        this.A04 = new AtomicBoolean();
        this.A03 = new AtomicBoolean();
        this.A02 = new LinkedHashMap();
    }

    public final void A00() {
        ReentrantReadWriteLock.ReadLock readLock = this.A00.readLock();
        readLock.lock();
        try {
            Map all = this.A01.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : all.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    C14360o3.A0B("shortcuts:", 1);
                    if (str.startsWith("shortcuts:")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (AbstractC001900j.A0R(String.valueOf(entry2.getValue()), new String[]{"36325201302335795L"}, 0).size() == 3) {
                    String str2 = (String) AbstractC001900j.A0R(String.valueOf(entry2.getKey()), new String[]{"shortcuts:"}, 0).get(1);
                    String str3 = (String) AbstractC001900j.A0R(String.valueOf(entry2.getValue()), new String[]{"36325201302335795L"}, 0).get(0);
                    String str4 = (String) AbstractC001900j.A0R(String.valueOf(entry2.getValue()), new String[]{"36325201302335795L"}, 0).get(1);
                    String str5 = (String) AbstractC001900j.A0R(String.valueOf(entry2.getValue()), new String[]{"36325201302335795L"}, 0).get(2);
                    List A0R = AbstractC001900j.A0R(str3, new String[]{"36325201302335711L:"}, 0);
                    List A0R2 = AbstractC001900j.A0R(str4, new String[]{"36325201302335720L"}, 0);
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0R2, 10));
                    Iterator it = A0R2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(AbstractC221815t.A00((String) it.next()));
                    }
                    this.A02.put(str2, new FQ1(str2, str5, A0R, arrayList2));
                }
                arrayList.add(C0eB.A00);
            }
        } finally {
            readLock.unlock();
        }
    }
}
