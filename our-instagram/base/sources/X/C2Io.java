package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Io, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Io implements InterfaceC41141vN {
    public final DirectThreadKey A00;
    public final Integer A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final boolean A05;

    public C2Io(DirectThreadKey directThreadKey, Integer num, List list, List list2, List list3, boolean z) {
        C14360o3.A0B(directThreadKey, 1);
        if (list != null) {
            try {
                if (!(!list.contains(null))) {
                    throw new IllegalStateException("Attempting to create an UpdateThreadEvent object with addedMessages list that has at least one null DirectMessage.");
                }
            } catch (NullPointerException unused) {
            }
        }
        if (list2 != null) {
            try {
                if (!(!list2.contains(null))) {
                    throw new IllegalStateException("Attempting to create an UpdateThreadEvent object with removedMessageInfoList list that has at least one null RemovedMessageInfo.");
                }
            } catch (NullPointerException unused2) {
            }
        }
        if (list3 != null) {
            try {
                if (!(!list3.contains(null))) {
                    throw new IllegalStateException("Attempting to create an UpdateThreadEvent object with updatedMessages list that has at least one null DirectMessage.");
                }
            } catch (NullPointerException unused3) {
            }
        }
        this.A00 = directThreadKey;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A01 = num;
        this.A05 = z;
    }

    public final ArrayList A00() {
        List list = this.A03;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((C9Q7) it.next()).A03;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
        return null;
    }
}
