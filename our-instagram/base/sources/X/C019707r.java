package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: X.07r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C019707r {
    public static C019707r A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final Handler A03;
    public final HashMap A02 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final ArrayList A01 = new ArrayList();

    public static C019707r A00(Context context) {
        C019707r c019707r;
        synchronized (A06) {
            c019707r = A05;
            if (c019707r == null) {
                c019707r = new C019707r(context.getApplicationContext());
                A05 = c019707r;
            }
        }
        return c019707r;
    }

    public final void A01(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            C019607q c019607q = new C019607q(broadcastReceiver, intentFilter);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c019607q);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap hashMap2 = this.A04;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(c019607q);
            }
        }
    }

    public final void A02(Intent intent) {
        synchronized (this.A02) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            android.net.Uri data = intent.getData();
            String scheme = intent.getScheme();
            java.util.Set<String> categories = intent.getCategories();
            intent.getFlags();
            ArrayList arrayList = (ArrayList) this.A04.get(intent.getAction());
            if (arrayList != null) {
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    C019607q c019607q = (C019607q) arrayList.get(i);
                    if (!c019607q.A00 && c019607q.A02.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c019607q);
                        c019607q.A00 = true;
                    }
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((C019607q) arrayList2.get(i2)).A00 = false;
                    }
                    this.A01.add(new C019507p(intent, arrayList2));
                    Handler handler = this.A03;
                    if (!handler.hasMessages(1)) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public C019707r(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A03 = new Handler(mainLooper) { // from class: X.07o
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int size;
                C019507p[] c019507pArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C019707r c019707r = this;
                while (true) {
                    synchronized (c019707r.A02) {
                        ArrayList arrayList = c019707r.A01;
                        size = arrayList.size();
                        if (size > 0) {
                            c019507pArr = new C019507p[size];
                            arrayList.toArray(c019507pArr);
                            arrayList.clear();
                        } else {
                            return;
                        }
                    }
                    int i = 0;
                    do {
                        C019507p c019507p = c019507pArr[i];
                        int size2 = c019507p.A01.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ((C019607q) c019507p.A01.get(i2)).A01.onReceive(c019707r.A00, c019507p.A00);
                        }
                        i++;
                    } while (i < size);
                }
            }
        };
    }
}
