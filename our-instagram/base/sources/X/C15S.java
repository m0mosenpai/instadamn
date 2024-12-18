package X;

import android.os.Process;
import com.facebook.common.threadutils.ThreadUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.15S, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15S extends AbstractC219814y {
    public final List A00;
    public final boolean A01;
    public final boolean A02;
    public final int A03;
    public final java.util.Set A04;

    @Override // X.AbstractC219814y, X.InterfaceC219914z
    public final int AhK() {
        return 5;
    }

    @Override // X.AbstractC219814y
    public final void A04() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int i = ThreadUtils.instance.maxAffinityMask;
            if (i != 0) {
                ThreadUtils.nativeSetThreadAffinityMask(intValue, i);
            }
        }
        Integer[] numArr = null;
        java.util.Set set = this.A04;
        synchronized (set) {
            if (!set.isEmpty()) {
                numArr = (Integer[]) set.toArray(new Integer[set.size()]);
                set.clear();
            }
        }
        if (numArr != null) {
            for (Integer num : numArr) {
                int intValue2 = num.intValue();
                int i2 = ThreadUtils.instance.maxAffinityMask;
                if (i2 != 0) {
                    ThreadUtils.nativeSetThreadAffinityMask(intValue2, i2);
                }
            }
        }
    }

    @Override // X.AbstractC219814y
    public final boolean A05() {
        int A00;
        List list = this.A00;
        if (list.isEmpty()) {
            if (this.A01) {
                list.add(Integer.valueOf(Process.myPid()));
            }
            if (this.A02 && (A00 = C15T.A00()) >= 0) {
                list.add(Integer.valueOf(A00));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int i = this.A03 & ThreadUtils.instance.maxAffinityMask;
            if (i != 0) {
                ThreadUtils.nativeSetThreadAffinityMask(intValue, i);
            }
        }
        return true;
    }

    public C15S(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.A00 = arrayList;
        this.A04 = new HashSet();
        this.A03 = i;
        arrayList.add(Integer.valueOf(i2));
        this.A01 = false;
        this.A02 = false;
    }

    public C15S(int i, boolean z, boolean z2) {
        this.A00 = new ArrayList();
        this.A04 = new HashSet();
        this.A03 = i;
        this.A01 = z;
        this.A02 = z2;
    }
}
