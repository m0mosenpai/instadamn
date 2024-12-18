package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.JfT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44164JfT implements InterfaceC13000lm {
    public final ArrayList A01 = AbstractC166987dD.A1E();
    public final HashSet A02 = AbstractC166987dD.A1H();
    public final C25301Lk A00 = new C25301Lk(AbstractC12290kX.A00, new C38078Gp7(0), 1427466249);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IBs] */
    public final synchronized void A00(C45026JwH c45026JwH) {
        HashSet hashSet = this.A02;
        String str = c45026JwH.A01.A05;
        hashSet.add(str);
        ArrayList arrayList = this.A01;
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (true) {
            if (!A13.hasNext()) {
                break;
            }
            C45026JwH c45026JwH2 = (C45026JwH) AbstractC166997dE.A0l(A13);
            if (C14360o3.A0K(str, c45026JwH2.A01.A05)) {
                arrayList.remove(c45026JwH2);
                break;
            }
        }
        arrayList.add(0, c45026JwH);
        if (arrayList.size() > 100) {
            arrayList.remove(100);
        }
        C25301Lk c25301Lk = this.A00;
        ?? obj = new Object();
        obj.A00 = arrayList;
        c25301Lk.A05("direct_recent_stickers_file_key", obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IBs] */
    public final synchronized void A01(C45026JwH c45026JwH) {
        HashSet hashSet = this.A02;
        String str = c45026JwH.A01.A05;
        hashSet.add(str);
        ArrayList arrayList = this.A01;
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (true) {
            if (!A13.hasNext()) {
                break;
            }
            C45026JwH c45026JwH2 = (C45026JwH) AbstractC166997dE.A0l(A13);
            if (C14360o3.A0K(str, c45026JwH2.A01.A05)) {
                arrayList.remove(c45026JwH2);
                break;
            }
        }
        C25301Lk c25301Lk = this.A00;
        ?? obj = new Object();
        obj.A00 = arrayList;
        c25301Lk.A05("direct_recent_stickers_file_key", obj);
    }

    public final synchronized boolean A02(String str) {
        C14360o3.A0B(str, 0);
        Iterator A13 = AbstractC166997dE.A13(this.A01);
        while (A13.hasNext()) {
            if (str.equals(((C45026JwH) AbstractC166997dE.A0l(A13)).A01.A05)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        this.A01.clear();
        this.A02.clear();
    }

    public C44164JfT(InterfaceC14020nS interfaceC14020nS) {
        interfaceC14020nS.ATO(new C44163JfS(this));
    }
}
