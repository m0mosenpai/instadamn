package X;

import android.content.Context;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.JsonReader;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.1FE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FE implements InterfaceC19630xq {
    public static final Map A09 = Collections.synchronizedMap(new ArrayMap());
    public C1GN A00;
    public C1GO A01;
    public final Context A03;
    public final C1GL A04;
    public final InterfaceC23931Fd A05;
    public Map A02 = Collections.synchronizedMap(new ArrayMap());
    public final Object A06 = new Object();
    public final CopyOnWriteArraySet A07 = new CopyOnWriteArraySet();
    public final CountDownLatch A08 = new CountDownLatch(1);

    @Override // X.InterfaceC19630xq
    public final /* synthetic */ String C2s(String str) {
        C14360o3.A0B(str, 1);
        String str2 = (String) A00(this, "", str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // X.InterfaceC19630xq
    public final /* synthetic */ java.util.Set C2v(String str) {
        C14360o3.A0B(str, 1);
        java.util.Set set = (java.util.Set) A00(this, null, str);
        if (set == null) {
            return C16910sj.A00;
        }
        return set;
    }

    public static void A02(C1FE c1fe) {
        HashMap hashMap;
        EnumC24331Hc enumC24331Hc;
        try {
            try {
                C1GN c1gn = c1fe.A00;
                Context context = c1fe.A03;
                if (C20150ym.A07(AbstractC20100yh.A00(36317650750019014L))) {
                    InputStream Eoz = c1gn.A00.Eoz(context);
                    if (Eoz == null) {
                        hashMap = new HashMap();
                    } else {
                        JsonReader jsonReader = new JsonReader(new InputStreamReader(Eoz, ReactWebViewManager.HTML_ENCODING));
                        try {
                            hashMap = new HashMap();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String str = null;
                                String str2 = null;
                                String str3 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName = jsonReader.nextName();
                                    if (nextName.equals("n")) {
                                        str3 = jsonReader.nextString();
                                    } else if (nextName.equals("v")) {
                                        str2 = jsonReader.nextString();
                                    } else if (nextName.equals("t")) {
                                        str = jsonReader.nextString();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                if (str != null && str2 != null && (enumC24331Hc = (EnumC24331Hc) EnumC24331Hc.A03.get(str)) != null) {
                                    hashMap.put(str3, enumC24331Hc.A00(str2));
                                }
                                jsonReader.endObject();
                            }
                            jsonReader.endArray();
                        } catch (EOFException | IllegalStateException unused) {
                            hashMap = new HashMap();
                        }
                    }
                } else {
                    hashMap = new HashMap();
                    InputStream Eoz2 = c1gn.A00.Eoz(context);
                    if (Eoz2 != null) {
                        C16L A01 = AbstractC221915u.A00.A01(Eoz2);
                        A01.A1J();
                        while (true) {
                            C16R A1J = A01.A1J();
                            if (A1J == null || A1J == C16R.A08) {
                                break;
                            }
                            if (A01.A11() == C16R.A0D) {
                                C24311Ha parseFromJson = C1HZ.parseFromJson(A01);
                                parseFromJson.getClass();
                                EnumC24331Hc enumC24331Hc2 = parseFromJson.A00;
                                if (enumC24331Hc2 != null) {
                                    hashMap.put(parseFromJson.A01, enumC24331Hc2.A00(parseFromJson.A02));
                                }
                            }
                        }
                    }
                }
                synchronized (c1fe.A06) {
                    c1fe.A02 = hashMap;
                }
            } catch (IOException e) {
                C0w9.A07("EncryptedSharedPrefs_readFromDisk_error", e);
            }
        } finally {
            c1fe.A08.countDown();
        }
    }

    @Override // X.InterfaceC19630xq
    public final void EDW(InterfaceC19620xp interfaceC19620xp) {
        this.A07.add(interfaceC19620xp);
    }

    @Override // X.InterfaceC19630xq
    public final void F9e(InterfaceC19620xp interfaceC19620xp) {
        this.A07.remove(interfaceC19620xp);
    }

    public C1FE(Context context, String str) {
        InterfaceC23931Fd tgc;
        InterfaceC23931Fd A00;
        this.A03 = context;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        String string = context.getSharedPreferences(str, 0).getString("transformer_type", null);
        Integer[] A002 = C05F.A00(3);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Integer num = A002[i];
            if (AbstractC002300n.A0g(C1FZ.A00(num), string, true)) {
                if (num != null && C23901Fa.A01(num) && (A00 = C23901Fa.A00(context, num, str)) != null) {
                    this.A05 = A00;
                }
            } else {
                i++;
            }
        }
        Integer[] numArr = C23901Fa.A01;
        int i2 = 0;
        while (true) {
            Integer num2 = numArr[i2];
            if (C23901Fa.A01(num2) && (tgc = C23901Fa.A00(context, num2, str)) != null) {
                context.getSharedPreferences(tgc.getName(), 0).edit().putString("transformer_type", C1FZ.A00(tgc.CBu())).apply();
                break;
            }
            i2++;
            if (i2 >= 3) {
                tgc = new TGC(context, str);
                break;
            }
        }
        this.A05 = tgc;
        this.A04 = C1GJ.A01();
    }

    public static Object A00(C1FE c1fe, Object obj, String str) {
        c1fe.A01();
        synchronized (c1fe.A06) {
            Object obj2 = c1fe.A02.get(str);
            if (obj2 != null) {
                obj = obj2;
            }
        }
        return obj;
    }

    private void A01() {
        if (Looper.myLooper() == Looper.getMainLooper() && this.A08.getCount() > 0) {
            C0w9.A07("EncryptedSharedPrefs_awaitLoaded_onMainThread", new Exception());
        }
        try {
            this.A08.await();
        } catch (InterruptedException e) {
            C0w9.A07("EncryptedSharedPrefs_awaitLoaded_interrupted", e);
        }
    }

    @Override // X.InterfaceC19630xq
    public final /* bridge */ /* synthetic */ InterfaceC19610xo ARD() {
        A01();
        return new C124855kq(this);
    }

    @Override // X.InterfaceC19630xq
    public final boolean contains(String str) {
        boolean containsKey;
        A01();
        synchronized (this.A06) {
            containsKey = this.A02.containsKey(str);
        }
        return containsKey;
    }

    @Override // X.InterfaceC19630xq
    public final Map getAll() {
        HashMap hashMap;
        A01();
        synchronized (this.A06) {
            hashMap = new HashMap(this.A02);
        }
        return hashMap;
    }

    @Override // X.InterfaceC19630xq
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) A00(this, Boolean.valueOf(z), str)).booleanValue();
    }

    @Override // X.InterfaceC19630xq
    public final float getFloat(String str, float f) {
        return ((Number) A00(this, Float.valueOf(f), str)).floatValue();
    }

    @Override // X.InterfaceC19630xq
    public final int getInt(String str, int i) {
        return ((Number) A00(this, Integer.valueOf(i), str)).intValue();
    }

    @Override // X.InterfaceC19630xq
    public final long getLong(String str, long j) {
        return ((Number) A00(this, Long.valueOf(j), str)).longValue();
    }

    @Override // X.InterfaceC19630xq
    public final String getString(String str, String str2) {
        return (String) A00(this, str2, str);
    }

    @Override // X.InterfaceC19630xq
    public final java.util.Set getStringSet(String str, java.util.Set set) {
        return (java.util.Set) A00(this, set, str);
    }
}
