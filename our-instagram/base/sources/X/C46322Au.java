package X;

import android.net.Uri;
import android.util.LruCache;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2Au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46322Au {
    public final AtomicReference A01 = new AtomicReference(new LruCache(10));
    public final AtomicInteger A00 = new AtomicInteger(0);

    public final void A00(android.net.Uri uri, String str, byte[] bArr, int i) {
        C69191VjK c69191VjK;
        boolean z;
        Queue queue;
        if (str != null && uri != null && bArr != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            android.net.Uri build = buildUpon.build();
            AtomicReference atomicReference = this.A01;
            synchronized (atomicReference) {
                c69191VjK = (C69191VjK) ((LruCache) atomicReference.get()).get(str);
                if (c69191VjK == null) {
                    c69191VjK = new C69191VjK(this);
                    ((LruCache) atomicReference.get()).put(str, c69191VjK);
                }
            }
            synchronized (c69191VjK) {
                if (build == null) {
                    android.util.Log.e("DashChunkMemoryCache", String.format("Trying to store chunk blob with null uri", new Object[0]));
                } else {
                    if (!build.getPath().endsWith("init.m4a") && !build.getPath().endsWith("init.m4v") && !build.getPath().endsWith("init.m4t")) {
                        z = false;
                        queue = c69191VjK.A01;
                    } else {
                        z = true;
                        queue = c69191VjK.A02;
                    }
                    W5P w5p = new W5P(build);
                    HashMap hashMap = c69191VjK.A00;
                    if (!hashMap.containsKey(w5p)) {
                        C22860A6g c22860A6g = new C22860A6g(build, Arrays.copyOf(bArr, i));
                        queue.add(w5p);
                        hashMap.put(w5p, c22860A6g);
                        if (!z && queue.size() > c69191VjK.A03.A00.get()) {
                            hashMap.remove((W5P) queue.remove());
                        }
                    }
                }
            }
            return;
        }
        AbstractC459729h.A01("DashChunkMemoryCache", "Invalid input is given", new Object[0]);
    }

    public final byte[] A01(android.net.Uri uri, String str) {
        C69191VjK c69191VjK;
        C22860A6g c22860A6g;
        if (str != null && uri != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.clearQuery();
            android.net.Uri build = buildUpon.build();
            AtomicReference atomicReference = this.A01;
            synchronized (atomicReference) {
                c69191VjK = (C69191VjK) ((LruCache) atomicReference.get()).get(str);
            }
            if (c69191VjK != null) {
                synchronized (c69191VjK) {
                    c22860A6g = (C22860A6g) c69191VjK.A00.get(new W5P(build));
                }
                if (c22860A6g != null) {
                    return c22860A6g.A01;
                }
            }
        } else {
            AbstractC459729h.A01("DashChunkMemoryCache", "Invalid input is given for getDashChunkData", new Object[0]);
        }
        return null;
    }
}
