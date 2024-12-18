package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Seb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63176Seb {
    public static C63176Seb A04;
    public final Handler A01 = AbstractC167007dF.A0J();
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();
    public final Object A03 = AbstractC58318PtA.A0b();
    public int A00 = 0;

    public static synchronized C63176Seb A00(Context context) {
        C63176Seb c63176Seb;
        synchronized (C63176Seb.class) {
            c63176Seb = A04;
            if (c63176Seb == null) {
                c63176Seb = new C63176Seb(context);
                A04 = c63176Seb;
            }
        }
        return c63176Seb;
    }

    public static void A01(C63176Seb c63176Seb, int i) {
        synchronized (c63176Seb.A03) {
            if (c63176Seb.A00 == i) {
                return;
            }
            c63176Seb.A00 = i;
            CopyOnWriteArrayList copyOnWriteArrayList = c63176Seb.A02;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                YNH ynh = (YNH) reference.get();
                if (ynh != null) {
                    ynh.DVM(i);
                } else {
                    copyOnWriteArrayList.remove(reference);
                }
            }
        }
    }

    public final int A02() {
        int i;
        synchronized (this.A03) {
            i = this.A00;
        }
        return i;
    }

    public C63176Seb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Q1c(this), intentFilter);
    }
}
