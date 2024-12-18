package X;

import android.os.Handler;
import android.view.View;
import java.lang.ref.Reference;
import java.util.WeakHashMap;

/* renamed from: X.2k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC57262k1 implements Runnable {
    public final /* synthetic */ C57242jz A00;

    public RunnableC57262k1(C57242jz c57242jz) {
        this.A00 = c57242jz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        String str;
        Reference reference;
        C57242jz c57242jz = this.A00;
        WeakHashMap weakHashMap = c57242jz.A03;
        if (!weakHashMap.isEmpty()) {
            for (InterfaceC95154Qb interfaceC95154Qb : weakHashMap.keySet()) {
                C14360o3.A0A(interfaceC95154Qb);
                C09530e4 c09530e4 = (C09530e4) weakHashMap.get(interfaceC95154Qb);
                if (c09530e4 != null && (reference = (Reference) c09530e4.A00) != null) {
                    view = (View) reference.get();
                } else {
                    view = null;
                }
                C09530e4 c09530e42 = (C09530e4) weakHashMap.get(interfaceC95154Qb);
                if (c09530e42 != null) {
                    str = (String) c09530e42.A01;
                } else {
                    str = null;
                }
                View CFf = interfaceC95154Qb.CFf();
                String CFA = interfaceC95154Qb.CFA();
                if (!C14360o3.A0K(view, CFf) || !C14360o3.A0K(CFA, str)) {
                    C57242jz.A02(view, c57242jz, str);
                    weakHashMap.put(interfaceC95154Qb, null);
                    C57242jz.A01(CFf, interfaceC95154Qb, c57242jz, CFA);
                }
            }
            ((Handler) c57242jz.A04.getValue()).postDelayed(this, 100L);
        }
    }
}
