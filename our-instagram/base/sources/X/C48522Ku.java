package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48522Ku implements C2Ju {
    public final C48432Kk A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C2KP A02;
    public final C48502Kr A03;
    public final C48492Kq A04;

    @Override // X.C2Ju
    public final synchronized void EDP(C2KM c2km) {
        this.A00.A00(c2km);
    }

    @Override // X.C2Ju
    public final C5KS AGW(int i) {
        C2KP c2kp = this.A02;
        C48402Kh c48402Kh = c2kp.A00;
        if (c48402Kh == null) {
            return C2KP.A00();
        }
        C2KP.A02.A03("cancelInstall(%d)", Integer.valueOf(i));
        C58411Pup c58411Pup = new C58411Pup();
        c48402Kh.A03(c58411Pup, new RP5(c58411Pup, c58411Pup, c2kp, i));
        return c58411Pup.A00;
    }

    @Override // X.C2Ju
    public final C5KS AOV(List list) {
        C2KP c2kp = this.A02;
        C48402Kh c48402Kh = c2kp.A00;
        if (c48402Kh == null) {
            return C2KP.A00();
        }
        C2KP.A02.A03("deferredInstall(%s)", list);
        C58411Pup c58411Pup = new C58411Pup();
        c48402Kh.A03(c58411Pup, new C58627Pyv(c58411Pup, c58411Pup, c2kp, list));
        return c58411Pup.A00;
    }

    @Override // X.C2Ju
    public final C5KS AOW(List list) {
        C48502Kr c48502Kr = this.A03;
        synchronized (C48502Kr.class) {
            HashSet hashSet = new HashSet(c48502Kr.A00());
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= hashSet.add((String) it.next());
            }
            if (z) {
                try {
                    c48502Kr.A00.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
        C2KP c2kp = this.A02;
        C48402Kh c48402Kh = c2kp.A00;
        if (c48402Kh == null) {
            return C2KP.A00();
        }
        C2KP.A02.A03("deferredUninstall(%s)", list);
        C58411Pup c58411Pup = new C58411Pup();
        c48402Kh.A03(c58411Pup, new RP4(c58411Pup, c58411Pup, c2kp, list));
        return c58411Pup.A00;
    }

    @Override // X.C2Ju
    public final java.util.Set BIV() {
        return this.A04.A03();
    }

    @Override // X.C2Ju
    public final C5KS Btp() {
        C2KP c2kp = this.A02;
        C48402Kh c48402Kh = c2kp.A00;
        if (c48402Kh == null) {
            return C2KP.A00();
        }
        C2KP.A02.A03("getSessionStates", new Object[0]);
        C58411Pup c58411Pup = new C58411Pup();
        c48402Kh.A03(c58411Pup, new RP3(c58411Pup, c58411Pup, c2kp));
        return c58411Pup.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r4.containsAll(r2) != false) goto L24;
     */
    @Override // X.C2Ju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5KS EnT(X.C58640PzD r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48522Ku.EnT(X.PzD):X.5KS");
    }

    public C48522Ku(C2KP c2kp, C48502Kr c48502Kr, C48492Kq c48492Kq, C48432Kk c48432Kk) {
        this.A02 = c2kp;
        this.A00 = c48432Kk;
        this.A04 = c48492Kq;
        this.A03 = c48502Kr;
    }
}
