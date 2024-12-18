package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.1Ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23461Ci implements InterfaceC23471Cj {
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C01U A03 = new C01U();
    public final HashSet A02 = new HashSet(0);

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        this.A00 = false;
        C01U c01u = this.A03;
        if (!c01u.isEmpty()) {
            C31586DuE c31586DuE = (C31586DuE) c01u.removeFirst();
            HashSet hashSet = this.A02;
            hashSet.addAll(c31586DuE.A00);
            if (!c01u.isEmpty()) {
                C31586DuE c31586DuE2 = (C31586DuE) c01u.A0O();
                this.A00 = true;
                this.A01.post(new RunnableC31585DuD(c31586DuE2, this));
                return;
            }
            hashSet.clear();
        }
    }
}
