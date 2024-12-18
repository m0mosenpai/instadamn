package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.63Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63Q {
    public static final C1LY A06 = C63R.A00;
    public final HandlerThread A00;
    public final C63P A01;
    public final C0JO A02;
    public final C63C A03;
    public final Executor A04;
    public final AtomicReference A05;

    public C63Q(C63P c63p, C63C c63c) {
        C14360o3.A0B(c63c, 2);
        Object obj = A06.get();
        C14360o3.A07(obj);
        HandlerThread handlerThread = (HandlerThread) obj;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C14360o3.A07(realtimeSinceBootClock);
        C14360o3.A0B(handlerThread, 2);
        this.A01 = c63p;
        this.A00 = handlerThread;
        this.A03 = c63c;
        this.A02 = realtimeSinceBootClock;
        final Handler handler = new Handler(handlerThread.getLooper());
        this.A04 = new Executor(handler) { // from class: X.63S
            public final Handler A00;

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C14360o3.A0B(runnable, 0);
                this.A00.post(runnable);
            }

            {
                this.A00 = handler;
            }
        };
        this.A05 = new AtomicReference(AbstractC06930Yk.A0E());
        this.A04.execute(new FutureTask(new Callable() { // from class: X.63T
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                Map map;
                C63Q c63q = C63Q.this;
                try {
                    C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryDiskCache", "initialize_metadata", ':'));
                    byte[] readResourceToMemory = c63q.A01.A00.readResourceToMemory("__disk_metadata");
                    if (readResourceToMemory == null) {
                        map = AbstractC06930Yk.A0E();
                    } else {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readResourceToMemory);
                        try {
                            Object readObject = new ObjectInputStream(byteArrayInputStream).readObject();
                            C14360o3.A0C(readObject, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.instagram.common.bloks.componentquery.cache.DiskCacheMetadata>");
                            map = (Map) readObject;
                            byteArrayInputStream.close();
                        } finally {
                        }
                    }
                    long now = c63q.A02.now();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (now - ((Q0C) entry.getValue()).A00 < 604800000) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    c63q.A05.set(linkedHashMap);
                    C1LN.A00();
                    return C0eB.A00;
                } catch (Throwable th) {
                    C1LN.A00();
                    throw th;
                }
            }
        }));
    }

    public static final void A00(C63Q c63q, Map map) {
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryDiskCache", "flush_metadata", ':'));
            C63P c63p = c63q.A01;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(map);
                objectOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C14360o3.A07(byteArray);
                c63p.A00.write("__disk_metadata", byteArray);
                c63q.A05.set(map);
            } finally {
            }
        } finally {
            C1LN.A00();
        }
    }
}
