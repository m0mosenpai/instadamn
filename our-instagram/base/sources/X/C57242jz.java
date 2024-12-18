package X;

import android.os.Handler;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.2jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57242jz {
    public WeakReference A00;
    public final UserSession A01;
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, C57252k0.A00);
    public final WeakHashMap A03 = new WeakHashMap();
    public final RunnableC57262k1 A02 = new RunnableC57262k1(this);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        if (r3 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C3KQ A00() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57242jz.A00():X.3KQ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.view.View r14, X.InterfaceC95154Qb r15, X.C57242jz r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57242jz.A01(android.view.View, X.4Qb, X.2jz, java.lang.String):void");
    }

    public static final void A02(View view, C57242jz c57242jz, String str) {
        WeakReference weakReference;
        C57112jm c57112jm;
        if (view != null && (weakReference = c57242jz.A00) != null && (c57112jm = (C57112jm) weakReference.get()) != null) {
            c57112jm.A05(view, C59062n7.A07);
        }
        if (str != null) {
            C4S0.A05.A05(str, "");
        }
    }

    public final void A04() {
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            for (InterfaceC95154Qb interfaceC95154Qb : weakHashMap.keySet()) {
                View CFf = interfaceC95154Qb.CFf();
                String CFA = interfaceC95154Qb.CFA();
                weakHashMap.put(interfaceC95154Qb, null);
                A01(CFf, interfaceC95154Qb, this, CFA);
            }
        }
        A03(this);
    }

    public final void A05() {
        View view;
        Reference reference;
        WeakHashMap weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            for (Object obj : weakHashMap.keySet()) {
                C09530e4 c09530e4 = (C09530e4) weakHashMap.get(obj);
                String str = null;
                if (c09530e4 != null && (reference = (Reference) c09530e4.A00) != null) {
                    view = (View) reference.get();
                } else {
                    view = null;
                }
                C09530e4 c09530e42 = (C09530e4) weakHashMap.get(obj);
                if (c09530e42 != null) {
                    str = (String) c09530e42.A01;
                }
                A02(view, this, str);
            }
        }
    }

    public C57242jz(UserSession userSession) {
        this.A01 = userSession;
    }

    public static final void A03(C57242jz c57242jz) {
        if (c57242jz.A00().A02 || c57242jz.A00().A00) {
            InterfaceC09390do interfaceC09390do = c57242jz.A04;
            ((Handler) interfaceC09390do.getValue()).removeCallbacks(c57242jz.A02);
            ((Handler) interfaceC09390do.getValue()).post(new RunnableC24498AtH(c57242jz));
        }
    }
}
