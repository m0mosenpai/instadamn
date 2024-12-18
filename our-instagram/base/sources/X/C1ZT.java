package X;

import android.os.Looper;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ZT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZT {
    public final /* synthetic */ C1UP A03;
    public final Map A00 = new HashMap(4);
    public volatile boolean A02 = false;
    public volatile boolean A01 = false;

    public final void A03() {
        Map map;
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                map = this.A00;
            } else {
                throw new RuntimeException("Trying to freeze an editor that is already frozen!");
            }
        }
        try {
            C106154qV A00 = A00(map);
            if (!A00.isEmpty()) {
                C1UP c1up = this.A03;
                C1UP.A04(c1up, A00);
                c1up.A07.execute(new Runnable() { // from class: X.4qY
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1ZT.A02(C1ZT.this);
                    }
                });
            }
        } finally {
            A05();
        }
    }

    public final synchronized void A05() {
        this.A01 = false;
    }

    public final boolean A0C(int i) {
        Map map;
        if (i != 0 && Looper.myLooper() == Looper.getMainLooper()) {
            C0K8.A0E("LightSharedPreferencesImpl", "commit is called on the main thread.");
        }
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                map = this.A00;
            } else {
                throw new RuntimeException("Trying to freeze an editor that is already frozen!");
            }
        }
        try {
            C106154qV A00 = A00(map);
            if (A00.isEmpty()) {
                return true;
            }
            C1UP.A04(this.A03, A00);
            return A02(this);
        } finally {
            A05();
        }
    }

    public C1ZT(C1UP c1up) {
        this.A03 = c1up;
    }

    private C106154qV A00(Map map) {
        C106154qV c106154qV = new C106154qV();
        C1UP c1up = this.A03;
        synchronized (c1up.A03) {
            if (this.A02) {
                Map map2 = c1up.A05;
                c106154qV.addAll(map2.keySet());
                map2.clear();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == C1UP.A0D) {
                    c1up.A05.remove(str);
                } else {
                    value.getClass();
                    Map map3 = c1up.A05;
                    if (!value.equals(map3.get(str))) {
                        map3.put(str, value);
                    }
                }
                c106154qV.add(str);
            }
            AtomicBoolean atomicBoolean = c1up.A08;
            boolean z = false;
            if (!c106154qV.isEmpty()) {
                z = true;
            }
            atomicBoolean.compareAndSet(false, z);
        }
        this.A02 = false;
        map.clear();
        return c106154qV;
    }

    public static void A01(C1ZT c1zt) {
        if (!c1zt.A01) {
        } else {
            throw new ConcurrentModificationException("Editors shouldn't be modified during commit!");
        }
    }

    public static boolean A02(C1ZT c1zt) {
        HashMap hashMap;
        int i;
        C1UP c1up = c1zt.A03;
        AtomicBoolean atomicBoolean = c1up.A08;
        if (atomicBoolean.get()) {
            synchronized (c1up.A03) {
                atomicBoolean.set(false);
                hashMap = new HashMap(c1up.A05);
            }
            try {
                C1UQ c1uq = c1up.A02;
                File file = (File) c1uq.A01.get();
                File createTempFile = File.createTempFile(AnonymousClass001.A0R(file.getName(), "."), ".tmp", file.getParentFile());
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile), 512));
                try {
                    dataOutputStream.writeByte(1);
                    dataOutputStream.writeInt(hashMap.size());
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Boolean) {
                            i = 0;
                        } else if (value instanceof Integer) {
                            i = 1;
                        } else if (value instanceof Long) {
                            i = 2;
                        } else if (value instanceof Float) {
                            i = 3;
                        } else if (value instanceof Double) {
                            i = 4;
                        } else if (value instanceof String) {
                            i = 5;
                        } else if (value instanceof java.util.Set) {
                            i = 6;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unsupported type: ");
                            sb.append(value.getClass());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        dataOutputStream.write(i);
                        dataOutputStream.writeUTF(str);
                        switch (i) {
                            case 0:
                                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                                break;
                            case 1:
                                dataOutputStream.writeInt(((Integer) value).intValue());
                                break;
                            case 2:
                                dataOutputStream.writeLong(((Long) value).longValue());
                                break;
                            case 3:
                                dataOutputStream.writeFloat(((Float) value).floatValue());
                                break;
                            case 4:
                                dataOutputStream.writeDouble(((Double) value).doubleValue());
                                break;
                            case 5:
                                dataOutputStream.writeUTF((String) value);
                                break;
                            default:
                                java.util.Set set = (java.util.Set) value;
                                dataOutputStream.writeInt(set.size());
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    dataOutputStream.writeUTF((String) it.next());
                                }
                                break;
                        }
                    }
                    dataOutputStream.close();
                    synchronized (c1uq.A00) {
                        try {
                            if (!createTempFile.renameTo(file)) {
                                if (!createTempFile.delete()) {
                                    C0K8.A0D("LightSharedPreferencesStorage", "Unable to delete temporary preferences file.");
                                }
                                throw new IOException("Failed to replace the current preference file!");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    dataOutputStream.close();
                    throw th2;
                }
            } catch (IOException e) {
                C0K8.A0H("LightSharedPreferencesImpl", "Commit to disk failed.", e);
                return false;
            }
        }
        return true;
    }

    public final boolean A0B() {
        return A0C(this.A03.A01);
    }

    public final void A04() {
        A01(this);
        this.A02 = true;
    }

    public final void A06(String str) {
        A01(this);
        Map map = this.A00;
        str.getClass();
        map.put(str, C1UP.A0D);
    }

    public final void A07(String str, int i) {
        A01(this);
        Map map = this.A00;
        str.getClass();
        map.put(str, Integer.valueOf(i));
    }

    public final void A08(String str, long j) {
        A01(this);
        Map map = this.A00;
        str.getClass();
        map.put(str, Long.valueOf(j));
    }

    public final void A09(String str, String str2) {
        A01(this);
        if (str2 == null) {
            Map map = this.A00;
            str.getClass();
            map.put(str, C1UP.A0D);
        } else {
            Map map2 = this.A00;
            str.getClass();
            map2.put(str, str2);
        }
    }

    public final void A0A(String str, boolean z) {
        A01(this);
        Map map = this.A00;
        str.getClass();
        map.put(str, Boolean.valueOf(z));
    }
}
