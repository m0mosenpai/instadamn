package X;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1F5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1F5 {
    public final C1F4 A01;
    public final ScheduledExecutorService A06;
    public final Map A02 = new HashMap();
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public boolean A00 = false;
    public final Runnable A05 = new Runnable() { // from class: X.1F6
        @Override // java.lang.Runnable
        public final void run() {
            C1F5 c1f5 = C1F5.this;
            c1f5.A04.set(false);
            if (!c1f5.A03.get()) {
                C1F5.A00(c1f5);
            }
            Map map = c1f5.A02;
            synchronized (map) {
                if (!c1f5.A00) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(map);
                c1f5.A00 = false;
                C1F4 c1f4 = c1f5.A01;
                synchronized (c1f4) {
                    if (jSONObject.length() == 0) {
                        c1f4.A00.delete();
                        c1f4.A01.delete();
                    } else {
                        try {
                            C1F2 c1f2 = c1f4.A00;
                            File parentFile = c1f2.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            C1F2 c1f22 = c1f4.A01;
                            byte[] bytes = jSONObject.toString().getBytes();
                            OutputStream CHy = c1f22.CHy();
                            try {
                                CHy.write(bytes);
                                CHy.close();
                                c1f22.renameTo(c1f2);
                            } catch (Throwable th) {
                                try {
                                    CHy.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        }
    };

    public static void A00(C1F5 c1f5) {
        BufferedInputStream bufferedInputStream;
        AtomicBoolean atomicBoolean = c1f5.A03;
        if (!atomicBoolean.get()) {
            C1F4 c1f4 = c1f5.A01;
            synchronized (c1f4) {
                if (!atomicBoolean.get()) {
                    try {
                        try {
                            try {
                                bufferedInputStream = new BufferedInputStream(new FileInputStream(c1f4.A00));
                            } catch (IOException | JSONException unused) {
                            }
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                C1FH.A00(bufferedInputStream, byteArrayOutputStream);
                                String str = new String(byteArrayOutputStream.toByteArray());
                                bufferedInputStream.close();
                                JSONObject jSONObject = new JSONObject(str);
                                HashMap hashMap = new HashMap();
                                try {
                                    Iterator<String> keys = jSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        if (next != null) {
                                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                            HashMap hashMap2 = new HashMap();
                                            try {
                                                Iterator<String> keys2 = jSONObject2.keys();
                                                while (keys2.hasNext()) {
                                                    String next2 = keys2.next();
                                                    if (next2 != null) {
                                                        hashMap2.put(next2, jSONObject2.get(next2));
                                                    }
                                                }
                                            } catch (JSONException unused2) {
                                                hashMap2.clear();
                                            }
                                            hashMap.put(next, hashMap2);
                                        }
                                    }
                                } catch (JSONException unused3) {
                                    hashMap.clear();
                                }
                                Map map = c1f5.A02;
                                synchronized (map) {
                                    try {
                                        for (Map.Entry entry : hashMap.entrySet()) {
                                            Object obj = (Map) map.get(entry.getKey());
                                            if (obj == null) {
                                                obj = new HashMap();
                                            }
                                            Map map2 = (Map) entry.getValue();
                                            map2.putAll(obj);
                                            map.put((String) entry.getKey(), map2);
                                        }
                                    } catch (Throwable th) {
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable th3) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    } finally {
                        atomicBoolean.set(true);
                    }
                }
            }
        }
    }

    public static void A01(C1F5 c1f5) {
        if (!c1f5.A04.getAndSet(true)) {
            c1f5.A06.schedule(c1f5.A05, 10L, TimeUnit.SECONDS);
        }
    }

    public final void A04(String str, Object obj, String str2) {
        Map map = this.A02;
        synchronized (map) {
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map2.put(str2, obj);
            map.put(str, map2);
            this.A00 = true;
        }
        A01(this);
    }

    public C1F5(C1F4 c1f4, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = c1f4;
        this.A06 = scheduledExecutorService;
        scheduledExecutorService.execute(new Runnable() { // from class: X.1F7
            @Override // java.lang.Runnable
            public final void run() {
                C1F5.A00(C1F5.this);
            }
        });
    }

    public final Object A02(String str, String str2) {
        Object obj;
        A00(this);
        Map map = this.A02;
        synchronized (map) {
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                obj = map2.get(str2);
            } else {
                obj = null;
            }
        }
        return obj;
    }

    public final void A03(String str) {
        A00(this);
        Map map = this.A02;
        synchronized (map) {
            map.remove(str);
            this.A00 = true;
        }
        A01(this);
    }
}
