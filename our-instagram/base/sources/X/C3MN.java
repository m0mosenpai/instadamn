package X;

import android.os.FileObserver;
import java.io.File;

/* renamed from: X.3MN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3MN extends FileObserver {
    public final C3MJ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3MN(C3MJ c3mj, String str) {
        super(str, 288);
        C14360o3.A0B(str, 2);
        this.A00 = c3mj;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, final String str) {
        if (str == null) {
            AbstractC150876qm.A00(i);
            return;
        }
        AbstractC150876qm.A00(i);
        final C3MJ c3mj = this.A00;
        String str2 = str;
        int A05 = AbstractC001900j.A05(str, '/', str.length() - 1);
        if (A05 != -1) {
            str2 = str.substring(A05 + 1);
            C14360o3.A07(str2);
        }
        if (AbstractC002300n.A0h(str2, ".pending", false) || c3mj.A03.contains(str2)) {
            return;
        }
        java.util.Set set = c3mj.A04;
        if (set.contains(str) || c3mj.A05.isEmpty()) {
            return;
        }
        set.add(str);
        c3mj.A02.ATO(new AbstractRunnableC14200nk() { // from class: X.91H
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(996210916, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3MJ.A02(C3MJ.this, str);
            }
        });
    }

    public C3MN(C3MJ c3mj, File file) {
        super(file, 288);
        this.A00 = c3mj;
        file.getPath();
    }
}
