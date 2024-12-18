package X;

import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback;
import com.facebook.mobileconfig.common.FBMobileConfigGlobalContextHolder;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.quickexperiment.MobileConfigBisection;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.19w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C229419w implements MobileConfigCxxChangeListener, MobileConfigEmergencyPushChangeListener, C0RG {
    public int A00;
    public C0U0 A01;
    public String A02;
    public InterfaceC08830cm A03;
    public int[][] A05;
    public final int A06;
    public final AssetManager A07;
    public final InterfaceC228619o A08;
    public final FBMobileConfigGlobalContextHolder A09;
    public final InterfaceC228919r A0A;
    public final C228319l A0B;
    public final File A0C;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final int A0I;
    public final C1A0 A0J;
    public final C1A0 A0K;
    public final C1A0 A0L;
    public final InterfaceC227319b A0M;
    public final C227419c A0N;
    public final java.util.Set A0S;
    public final InterfaceC08830cm A0V;
    public final boolean A0W;
    public volatile AtomicReferenceArray A0X;
    public volatile InterfaceC08830cm A0Y;
    public volatile InterfaceC10260gi A0Z;
    public volatile AtomicIntegerArray A0a;
    public final Object A0P = new Object();
    public C5F7 A04 = null;
    public final AtomicBoolean A0U = new AtomicBoolean(false);
    public final AtomicBoolean A0D = new AtomicBoolean(true);
    public final AtomicBoolean A0T = new AtomicBoolean(false);
    public final Object A0O = new Object();
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public final java.util.Set A0R = new HashSet();
    public final Random A0Q = new Random();

    private void A04(InterfaceC10260gi interfaceC10260gi, Map map, int i) {
        List A01;
        final String A012;
        final String str;
        String userId;
        InterfaceC08830cm interfaceC08830cm = this.A0Y;
        if (interfaceC10260gi != null && interfaceC08830cm != null && this.A0F) {
            C228319l c228319l = this.A0B;
            String str2 = "";
            c228319l.syncFetchReason();
            MobileConfigManagerHolderImpl A00 = C228319l.A00(c228319l);
            if (A00 != null) {
                str2 = A00.getFamilyDeviceId();
            }
            C5F7 A0B = A0B();
            if (A0B != null && (A01 = A0B.A01(i)) != null && !A01.isEmpty() && (A012 = AbstractC55160OdO.A01(interfaceC10260gi, A01, false)) != null && !TextUtils.isEmpty(A012)) {
                if (this.A06 != 1) {
                    InterfaceC228619o interfaceC228619o = this.A08;
                    String str3 = "";
                    if (interfaceC228619o != null && (userId = interfaceC228619o.getUserId()) != null) {
                        str3 = userId;
                    }
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                }
                ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                if (map == null) {
                    map = new HashMap();
                }
                builder.putAll(map);
                builder.put("isRN", "NO");
                ImmutableMap buildOrThrow = builder.buildOrThrow();
                final C227619e c227619e = (C227619e) interfaceC08830cm.get();
                if (c227619e.A02 != null) {
                    AbstractC09800fd.A01("MobileConfigApi2GeneralLoggerImpl_log", -117825813);
                    try {
                        TreeMap treeMap = new TreeMap();
                        if (buildOrThrow != null) {
                            C1LC it = buildOrThrow.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                treeMap.put((String) entry.getKey(), entry.getValue());
                            }
                        }
                        treeMap.put("useAddedParamsMapResource", "");
                        treeMap.put("universe", c227619e.A01);
                        if (!TextUtils.isEmpty(str2)) {
                            treeMap.put("familyDeviceId", str2);
                        }
                        try {
                            C0CA A02 = AbstractC55160OdO.A00.A02();
                            for (Map.Entry entry2 : treeMap.entrySet()) {
                                C0CA.A00(A02, entry2.getValue().toString(), (String) entry2.getKey());
                            }
                            if (interfaceC10260gi instanceof C1A2) {
                                C1A2 c1a2 = (C1A2) interfaceC10260gi;
                                long BoE = c1a2.BoE();
                                if (BoE > 0) {
                                    C0CA.A00(A02, String.valueOf(BoE), "ts");
                                }
                                List CCi = c1a2.CCi();
                                if (!CCi.isEmpty()) {
                                    C0CA.A00(A02, TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, CCi), "unitIds");
                                }
                            }
                            str = AbstractC55160OdO.A00(A02);
                        } catch (IOException unused) {
                            str = "{}";
                        }
                        ((ExecutorService) c227619e.A02.get()).execute(new Runnable() { // from class: X.TPp
                            @Override // java.lang.Runnable
                            public final void run() {
                                C227619e c227619e2 = C227619e.this;
                                String str4 = A012;
                                String str5 = str;
                                AtomicBoolean atomicBoolean = c227619e2.A06;
                                if (atomicBoolean.get()) {
                                    c227619e2.A01(str4, str5);
                                    return;
                                }
                                synchronized (c227619e2.A04) {
                                    if (atomicBoolean.get()) {
                                        c227619e2.A01(str4, str5);
                                    } else {
                                        c227619e2.A05.add(new Pair(str4, str5));
                                    }
                                }
                            }
                        });
                        AbstractC09800fd.A00(-2005283513);
                    } catch (Throwable th) {
                        AbstractC09800fd.A00(1811953531);
                        throw th;
                    }
                }
            }
        }
    }

    public final synchronized C228319l A0A() {
        return this.A0B;
    }

    public final synchronized void A0F(AbstractC225918h abstractC225918h) {
        java.util.Set unmodifiableSet;
        java.util.Set<C4GE> unmodifiableSet2;
        java.util.Set<C4GE> unmodifiableSet3;
        C228319l c228319l = this.A0B;
        synchronized (c228319l) {
            try {
                AbstractC225918h A01 = c228319l.A01();
                c228319l.A01 = abstractC225918h;
                c228319l.A00 = this;
                if ((A01 instanceof C1A8) && (c228319l.A01 instanceof MobileConfigManagerHolderImpl)) {
                    C1A8 c1a8 = (C1A8) A01;
                    java.util.Set set = c1a8.A09;
                    synchronized (set) {
                        try {
                            unmodifiableSet = Collections.unmodifiableSet(new HashSet(set));
                        } finally {
                        }
                    }
                    if (unmodifiableSet != null) {
                        InterfaceC10260gi A08 = A08(0);
                        Iterator it = unmodifiableSet.iterator();
                        while (it.hasNext()) {
                            A08.CjF(((Long) it.next()).longValue());
                        }
                    }
                    java.util.Set set2 = c1a8.A08;
                    synchronized (set2) {
                        try {
                            unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(set2));
                        } finally {
                        }
                    }
                    for (C4GE c4ge : unmodifiableSet2) {
                        abstractC225918h.logExposure(c4ge.A02, c4ge.A00, c4ge.A03, c4ge.A01);
                    }
                    java.util.Set set3 = c1a8.A07;
                    synchronized (set3) {
                        try {
                            unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(set3));
                        } finally {
                        }
                    }
                    for (C4GE c4ge2 : unmodifiableSet3) {
                        abstractC225918h.logAccessWithoutExposure(c4ge2.A02, c4ge2.A01);
                    }
                    abstractC225918h.isValid();
                } else {
                    abstractC225918h.isValid();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (abstractC225918h instanceof MobileConfigManagerHolderImpl) {
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = (MobileConfigManagerHolderImpl) abstractC225918h;
            mobileConfigManagerHolderImpl.mOverridesTableCallback = new MobileConfigUpdateOverridesTableCallback() { // from class: X.1A9
                @Override // com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback
                public final void onOverridesFileUpdated() {
                    C19z.A01(C229419w.A01(C229419w.this)).A03();
                }
            };
            mobileConfigManagerHolderImpl.registerConfigChangeListener(this);
            C0UN.A00(this.A06);
            mobileConfigManagerHolderImpl.setEpHandler(this);
            if (this.A0G) {
                int i = this.A0I;
                int i2 = i * 1000;
                if (i < 120) {
                    i2 = 120000;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: X.1AA
                    @Override // java.lang.Runnable
                    public final void run() {
                        C229419w c229419w = C229419w.this;
                        if (c229419w.A0F && c229419w.A0G) {
                            AtomicReferenceArray atomicReferenceArray = c229419w.A0X;
                            HashMap hashMap = new HashMap();
                            for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                                if (atomicReferenceArray.get(i3) != null) {
                                    hashMap.put(Integer.valueOf(i3), atomicReferenceArray.get(i3));
                                }
                            }
                            C5F7 A0B = c229419w.A0B();
                            if (A0B == null) {
                                C0K8.A0C("MobileConfigFactoryImpl", "BatchApi consistency paramsmap not ready yet");
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = hashMap.keySet().iterator();
                            while (it2.hasNext()) {
                                arrayList.addAll(A0B.A01(((Number) it2.next()).intValue()));
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            C55697OoO c55697OoO = new C55697OoO(hashMap);
                            try {
                                C0CA A02 = AbstractC55160OdO.A00.A02();
                                AbstractC55160OdO.A02(A02, c55697OoO, arrayList, false);
                                String A00 = AbstractC55160OdO.A00(A02);
                                if (A00 == null || TextUtils.isEmpty(A00)) {
                                    return;
                                }
                                c229419w.A0B.logConfigs(A00, EnumC72343Xbf.A01, new HashMap());
                            } catch (IOException e) {
                                C0K8.A0F("MobileConfigDebugUtil", "Failed to generate consistency logging JSON", e);
                            }
                        }
                    }
                }, i2);
            }
        }
        this.A01 = c228319l.getOrCreateOverridesTable();
        if (A01(this).exists()) {
            C19z.A01(A01(this)).A03();
        }
    }

    @Override // X.InterfaceC18540vh
    public final double AzB(C06090Tz c06090Tz, long j) {
        return AzA(c06090Tz, this.A0A.Az5(j), j);
    }

    @Override // X.InterfaceC18540vh
    public final long BPF(C06090Tz c06090Tz, long j) {
        return BPE(c06090Tz, j, this.A0A.BP7(j));
    }

    private int A00(long j) {
        if (((j >>> 62) & 1) == 1) {
            return ((int) ((j >>> 16) & 4294967295L)) >> 12;
        }
        int i = (int) ((j >>> 54) & 63);
        if (i == 2) {
            i = 1;
        }
        int i2 = (int) ((j >>> 32) & 65535);
        int[][] iArr = this.A05;
        if (iArr != null && i2 >= 0 && i < iArr.length) {
            int[] iArr2 = iArr[i];
            if (i2 < iArr2.length) {
                return iArr2[i2];
            }
            return -1;
        }
        return -1;
    }

    public static File A01(C229419w c229419w) {
        String dataDirPath = c229419w.A0B.getDataDirPath();
        if (dataDirPath == null || dataDirPath.isEmpty()) {
            File file = c229419w.A0C;
            if (file == null) {
                dataDirPath = null;
            } else {
                dataDirPath = file.getPath();
            }
        }
        return new File(new File(dataDirPath, MobileConfigBisection.BISECT_DIR), "mc_overrides.json");
    }

    private boolean A05() {
        String userId;
        int i = this.A06;
        if (i == 2 || i == 4) {
            InterfaceC228619o interfaceC228619o = this.A08;
            String str = "";
            if (interfaceC228619o != null && (userId = interfaceC228619o.getUserId()) != null) {
                str = userId;
            }
            if ("".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean A06(long j) {
        int i = this.A06;
        int i2 = (int) ((j >>> 54) & 63);
        if (i == i2) {
            return true;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s factory used for %s param %d:%d(configKey:paramKey), %d(paramSpecifier)", C0UN.A00(i), C0UN.A00(i2), Integer.valueOf(A00(j)), Integer.valueOf(C0UM.A00(j)), Long.valueOf(j));
        InterfaceC08830cm interfaceC08830cm = this.A0V;
        if (interfaceC08830cm != null) {
            C0f5 AEp = ((C0f6) interfaceC08830cm.get()).AEp("wrongUnitType", 13639536);
            AEp.ERI(new RuntimeException(formatStrLocaleSafe));
            AEp.report();
        }
        C0K8.A0D("MobileConfigFactoryImpl", formatStrLocaleSafe);
        return false;
    }

    public final InterfaceC10260gi A08(int i) {
        InterfaceC10260gi A07;
        InterfaceC10260gi interfaceC10260gi;
        String str;
        String userId;
        AtomicReferenceArray atomicReferenceArray = this.A0X;
        if (i >= 0 && i < atomicReferenceArray.length()) {
            InterfaceC10260gi interfaceC10260gi2 = (InterfaceC10260gi) atomicReferenceArray.get(i);
            Map map = null;
            if (interfaceC10260gi2 == null) {
                if (A05()) {
                    return this.A0J;
                }
                if (this.A0Y != null && this.A0F) {
                    Map hashMap = new HashMap();
                    FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder = this.A09;
                    if (fBMobileConfigGlobalContextHolder != null) {
                        int i2 = this.A06;
                        if (i2 == 1) {
                            str = "";
                        } else {
                            InterfaceC228619o interfaceC228619o = this.A08;
                            str = "";
                            if (interfaceC228619o != null && (userId = interfaceC228619o.getUserId()) != null) {
                                str = userId;
                            }
                        }
                        hashMap = fBMobileConfigGlobalContextHolder.getContextData(i2, str, System.currentTimeMillis());
                    }
                    Pair pair = new Pair(A07(), hashMap);
                    A07 = (InterfaceC10260gi) pair.first;
                    map = (Map) pair.second;
                } else {
                    A07 = A07();
                }
                if (!C1AM.A00(interfaceC10260gi2, A07, atomicReferenceArray, i)) {
                    interfaceC10260gi = (InterfaceC10260gi) atomicReferenceArray.get(i);
                } else {
                    interfaceC10260gi = A07;
                }
                A04(interfaceC10260gi, map, i);
                return interfaceC10260gi;
            }
            return interfaceC10260gi2;
        }
        C0K8.A0P("MobileConfigFactoryImpl", "Attempt to read invalid config index(%d) from config caches, unitType: %s", Integer.valueOf(i), C0UN.A00(this.A06));
        return this.A0K;
    }

    public final InterfaceC10260gi A09(long j) {
        return A08((int) ((j >>> 32) & 65535));
    }

    public final C5F7 A0B() {
        File file;
        if (this.A04 == null) {
            C5F7 c5f7 = (C5F7) this.A03.get();
            this.A04 = c5f7;
            if (c5f7 != null && (file = this.A0C) != null) {
                String path = file.getPath();
                C5F7 c5f72 = this.A04;
                HashMap hashMap = new HashMap();
                File A00 = C5NX.A00(path);
                if (A00.exists()) {
                    try {
                        String obj = A00.toString();
                        StringBuilder sb = new StringBuilder();
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(obj));
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb.append(readLine);
                                sb.append("\n");
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        }
                        bufferedReader.close();
                        JSONArray jSONArray = new JSONArray(sb.toString());
                        for (int i = 0; i < jSONArray.length(); i++) {
                            String string = jSONArray.getString(i);
                            if (string != null) {
                                String[] split = string.split(":", -1);
                                int parseInt = Integer.parseInt(split[0]);
                                String str = split[1];
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put(-2, str);
                                for (int i2 = 2; i2 < split.length; i2 += 2) {
                                    hashMap2.put(Integer.valueOf(Integer.parseInt(split[i2])), split[i2 + 1]);
                                }
                                hashMap.put(Integer.valueOf(parseInt), hashMap2);
                            }
                        }
                    } catch (IOException | NumberFormatException | JSONException e) {
                        C0K8.A0G("MobileConfigIdNameMappingLoader", "loadIdNameMappingFile failed", e);
                    }
                }
                if ((!hashMap.isEmpty()) && c5f72 != null) {
                    List<C5NW> list = c5f72.A03;
                    if (!list.isEmpty()) {
                        ArrayList arrayList = new ArrayList(list.size());
                        for (C5NW c5nw : list) {
                            String str2 = c5nw.A00;
                            if (!C0UK.A00(str2) || !C0UK.A01(c5nw.A01)) {
                                int i3 = c5nw.A03;
                                Map map = (Map) hashMap.get(Integer.valueOf(i3));
                                if (map != null) {
                                    String str3 = "";
                                    if (!C0UK.A00(str2)) {
                                        if (!map.containsKey(-2)) {
                                            str2 = "";
                                        } else {
                                            str2 = (String) map.get(-2);
                                        }
                                    }
                                    String str4 = c5nw.A01;
                                    if (C0UK.A01(str4)) {
                                        str3 = str4;
                                    } else {
                                        Integer valueOf = Integer.valueOf(c5nw.A04);
                                        if (map.containsKey(valueOf)) {
                                            str3 = (String) map.get(valueOf);
                                        }
                                    }
                                    if (str2 == null || str3 == null) {
                                        C0K8.A0C("MobileConfigIdNameMappingLoader", "failed to parse and get namedParamsMapList, name is null");
                                    }
                                    arrayList.add(new C5NW(str2, str3, c5nw.A04, c5nw.A02, c5nw.A05, c5nw.A07, c5nw.A06, c5nw.A08, i3, c5nw.A0A, c5nw.A0B, c5nw.A09));
                                }
                            }
                            arrayList.add(c5nw);
                        }
                        this.A04 = new C5F7(arrayList);
                    }
                }
            }
        }
        return this.A04;
    }

    public final void A0C() {
        String userId;
        AtomicBoolean atomicBoolean = this.A0T;
        if (!atomicBoolean.get()) {
            InterfaceC228619o interfaceC228619o = this.A08;
            String str = "";
            if (interfaceC228619o != null && (userId = interfaceC228619o.getUserId()) != null) {
                str = userId;
            }
            synchronized (this.A0O) {
                if (atomicBoolean.compareAndSet(false, true)) {
                    InterfaceC227319b interfaceC227319b = this.A0M;
                    if (interfaceC227319b == null) {
                        C0K8.A0P("MobileConfigFactoryImpl", "Calling initCppManagerIfNeeded with null mCppManagerCreator, userId:%s", str);
                    } else {
                        int i = this.A06;
                        if ((i != 2 && i != 4) || (!str.isEmpty() && !str.equals("0"))) {
                            AbstractC09800fd.A03("MobileConfigFactoryImpl.initCppManager %s", C0UN.A00(i), -1185965697);
                            try {
                                MobileConfigManagerHolderImpl ALC = interfaceC227319b.ALC(this.A0C, str);
                                if (ALC != null) {
                                    int[] A0I = A0I();
                                    synchronized (this) {
                                        this.A0E.set(true);
                                        A0F(ALC);
                                        A0E();
                                    }
                                    for (int i2 : A0I) {
                                        A08(i2);
                                    }
                                }
                                AbstractC09800fd.A00(-1266389828);
                            } catch (Throwable th) {
                                AbstractC09800fd.A00(621182700);
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A0D() {
        File file = this.A0C;
        if (file != null) {
            synchronized (this.A0P) {
                if (C5NX.A00(file.getPath()).exists()) {
                    this.A04 = null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x037c A[Catch: all -> 0x0391, TRY_ENTER, TryCatch #12 {all -> 0x0391, blocks: (B:115:0x0276, B:122:0x037c, B:194:0x0390, B:199:0x038d, B:117:0x027a, B:119:0x0287, B:120:0x028f, B:129:0x0294, B:131:0x02a0, B:132:0x02a9, B:134:0x02ad, B:136:0x02b1, B:138:0x02d7, B:139:0x02e7, B:141:0x02ea, B:143:0x02ed, B:145:0x02fd, B:171:0x0303, B:175:0x033b, B:177:0x0342, B:178:0x035b, B:158:0x035d, B:180:0x0360, B:162:0x0345, B:166:0x034d, B:148:0x0350, B:150:0x0354, B:151:0x0356, B:190:0x0374, B:191:0x02c6, B:196:0x0388), top: B:114:0x0276, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0381 A[Catch: IOException -> 0x039d, IOException -> 0x03ba, all -> 0x03db, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x03ba, blocks: (B:74:0x016e, B:79:0x017c, B:80:0x018b, B:81:0x018c, B:83:0x01d2, B:86:0x01da, B:88:0x01e0, B:91:0x01e6, B:93:0x0206, B:95:0x020e, B:97:0x0218, B:99:0x0224, B:101:0x022c, B:102:0x024c, B:106:0x0254, B:108:0x025c, B:110:0x0264, B:113:0x026a, B:124:0x0381, B:125:0x03a5, B:127:0x03aa, B:202:0x039c, B:207:0x0399, B:209:0x039e), top: B:73:0x016e, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03aa A[Catch: IOException -> 0x03ba, all -> 0x03db, TRY_LEAVE, TryCatch #3 {IOException -> 0x03ba, blocks: (B:74:0x016e, B:79:0x017c, B:80:0x018b, B:81:0x018c, B:83:0x01d2, B:86:0x01da, B:88:0x01e0, B:91:0x01e6, B:93:0x0206, B:95:0x020e, B:97:0x0218, B:99:0x0224, B:101:0x022c, B:102:0x024c, B:106:0x0254, B:108:0x025c, B:110:0x0264, B:113:0x026a, B:124:0x0381, B:125:0x03a5, B:127:0x03aa, B:202:0x039c, B:207:0x0399, B:209:0x039e), top: B:73:0x016e, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03e9 A[Catch: all -> 0x0430, TryCatch #11 {all -> 0x0430, blocks: (B:27:0x00a4, B:29:0x00bd, B:32:0x00c3, B:34:0x00e3, B:36:0x00eb, B:38:0x00f5, B:40:0x0101, B:42:0x0109, B:43:0x0129, B:46:0x013e, B:48:0x0144, B:50:0x014d, B:51:0x0151, B:72:0x0166, B:128:0x03ac, B:212:0x03c5, B:214:0x03ce, B:226:0x03dc, B:227:0x03e2, B:228:0x03e3, B:230:0x03e9, B:238:0x0133, B:74:0x016e, B:79:0x017c, B:80:0x018b, B:81:0x018c, B:220:0x01cb, B:83:0x01d2, B:86:0x01da, B:88:0x01e0, B:91:0x01e6, B:93:0x0206, B:95:0x020e, B:97:0x0218, B:99:0x0224, B:101:0x022c, B:102:0x024c, B:106:0x0254, B:108:0x025c, B:110:0x0264, B:113:0x026a, B:124:0x0381, B:125:0x03a5, B:127:0x03aa, B:202:0x039c, B:207:0x0399, B:209:0x039e, B:224:0x03bb), top: B:26:0x00a4, outer: #14, inners: #16, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144 A[Catch: all -> 0x0430, TryCatch #11 {all -> 0x0430, blocks: (B:27:0x00a4, B:29:0x00bd, B:32:0x00c3, B:34:0x00e3, B:36:0x00eb, B:38:0x00f5, B:40:0x0101, B:42:0x0109, B:43:0x0129, B:46:0x013e, B:48:0x0144, B:50:0x014d, B:51:0x0151, B:72:0x0166, B:128:0x03ac, B:212:0x03c5, B:214:0x03ce, B:226:0x03dc, B:227:0x03e2, B:228:0x03e3, B:230:0x03e9, B:238:0x0133, B:74:0x016e, B:79:0x017c, B:80:0x018b, B:81:0x018c, B:220:0x01cb, B:83:0x01d2, B:86:0x01da, B:88:0x01e0, B:91:0x01e6, B:93:0x0206, B:95:0x020e, B:97:0x0218, B:99:0x0224, B:101:0x022c, B:102:0x024c, B:106:0x0254, B:108:0x025c, B:110:0x0264, B:113:0x026a, B:124:0x0381, B:125:0x03a5, B:127:0x03aa, B:202:0x039c, B:207:0x0399, B:209:0x039e, B:224:0x03bb), top: B:26:0x00a4, outer: #14, inners: #16, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03fa A[Catch: all -> 0x0438, TryCatch #14 {all -> 0x0438, blocks: (B:25:0x008c, B:54:0x03f5, B:56:0x03fa, B:58:0x03fe, B:60:0x0404, B:62:0x040a, B:63:0x0416, B:243:0x0431, B:244:0x0437, B:27:0x00a4, B:29:0x00bd, B:32:0x00c3, B:34:0x00e3, B:36:0x00eb, B:38:0x00f5, B:40:0x0101, B:42:0x0109, B:43:0x0129, B:46:0x013e, B:48:0x0144, B:50:0x014d, B:51:0x0151, B:72:0x0166, B:128:0x03ac, B:212:0x03c5, B:214:0x03ce, B:226:0x03dc, B:227:0x03e2, B:228:0x03e3, B:230:0x03e9, B:238:0x0133, B:74:0x016e, B:79:0x017c, B:80:0x018b, B:81:0x018c, B:220:0x01cb, B:83:0x01d2, B:86:0x01da, B:88:0x01e0, B:91:0x01e6, B:93:0x0206, B:95:0x020e, B:97:0x0218, B:99:0x0224, B:101:0x022c, B:102:0x024c, B:106:0x0254, B:108:0x025c, B:110:0x0264, B:113:0x026a, B:124:0x0381, B:125:0x03a5, B:127:0x03aa, B:202:0x039c, B:207:0x0399, B:209:0x039e, B:224:0x03bb), top: B:24:0x008c, outer: #4, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0421 A[Catch: all -> 0x0442, TryCatch #4 {all -> 0x0442, blocks: (B:23:0x007d, B:64:0x0419, B:66:0x0421, B:250:0x043b, B:251:0x0441, B:25:0x008c, B:54:0x03f5, B:56:0x03fa, B:58:0x03fe, B:60:0x0404, B:62:0x040a, B:63:0x0416, B:243:0x0431, B:244:0x0437, B:247:0x0439), top: B:22:0x007d, outer: #9, inners: #14, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(boolean r30) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229419w.A0G(boolean):void");
    }

    public final int[] A0I() {
        int[] iArr;
        AtomicReferenceArray atomicReferenceArray = this.A0X;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < atomicReferenceArray.length(); i++) {
            if (atomicReferenceArray.get(i) != null) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList instanceof RandomAccess) {
            int size = arrayList.size();
            iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = ((Number) arrayList.get(i2)).intValue();
            }
        } else {
            iArr = new int[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                iArr[i3] = ((Number) it.next()).intValue();
                i3++;
            }
        }
        return iArr;
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhA(long j) {
        return AhE(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhE(C06090Tz c06090Tz, long j) {
        return AhF(c06090Tz, j, this.A0A.Ah7(j));
    }

    @Override // X.InterfaceC18540vh
    public final double Az2(long j) {
        return AzB(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final double AzA(C06090Tz c06090Tz, double d, long j) {
        InterfaceC10260gi A09;
        MobileConfigValueSource mobileConfigValueSource;
        double d2 = d;
        C06090Tz c06090Tz2 = c06090Tz;
        java.util.Set<C54773OIm> A02 = A02();
        if (!A02.isEmpty()) {
            c06090Tz2 = C06090Tz.A00(c06090Tz2);
            c06090Tz2.A02 = true;
        }
        if (!A06(j)) {
            if (c06090Tz2.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c06090Tz2.A00 = new C0U5(mobileConfigValueSource);
            }
        } else if (4 != ((int) ((j >>> 48) & 63))) {
            A03(j, String.valueOf(d2));
            if (c06090Tz2.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c06090Tz2.A00 = new C0U5(mobileConfigValueSource);
            }
        } else {
            if (c06090Tz2.A01) {
                A09 = A07();
            } else {
                A09 = A09(j);
            }
            d2 = A09.AzA(c06090Tz2, d2, j);
        }
        if (!A02.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c06090Tz2.A00.A00;
            this.A0B.syncFetchReason();
            for (C54773OIm c54773OIm : A02) {
                String name = mobileConfigValueSource2.name();
                String d3 = Double.toString(d2);
                C14360o3.A0B(d3, 5);
                InterfaceC24731Iq interfaceC24731Iq = c54773OIm.A01;
                long currentTimeMillis = System.currentTimeMillis();
                if (name == null) {
                    name = "";
                }
                interfaceC24731Iq.F8s(new C51576MqU(currentTimeMillis, d3, j, name));
            }
        }
        return d2;
    }

    @Override // X.InterfaceC18540vh
    public final long BP2(long j) {
        return BPF(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final long BPE(C06090Tz c06090Tz, long j, long j2) {
        InterfaceC10260gi A09;
        MobileConfigValueSource mobileConfigValueSource;
        long j3 = j2;
        C06090Tz c06090Tz2 = c06090Tz;
        java.util.Set<C54773OIm> A02 = A02();
        if (!A02.isEmpty()) {
            c06090Tz2 = C06090Tz.A00(c06090Tz2);
            c06090Tz2.A02 = true;
        }
        if (!A06(j)) {
            if (c06090Tz2.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c06090Tz2.A00 = new C0U5(mobileConfigValueSource);
            }
        } else if (2 != ((int) ((j >>> 48) & 63))) {
            A03(j, String.valueOf(j3));
            if (c06090Tz2.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c06090Tz2.A00 = new C0U5(mobileConfigValueSource);
            }
        } else {
            if (c06090Tz2.A01) {
                A09 = A07();
            } else {
                A09 = A09(j);
            }
            j3 = A09.BPE(c06090Tz2, j, j3);
        }
        if (!A02.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c06090Tz2.A00.A00;
            this.A0B.syncFetchReason();
            for (C54773OIm c54773OIm : A02) {
                String name = mobileConfigValueSource2.name();
                String l = Long.toString(j3);
                C14360o3.A0B(l, 5);
                InterfaceC24731Iq interfaceC24731Iq = c54773OIm.A01;
                long currentTimeMillis = System.currentTimeMillis();
                if (name == null) {
                    name = "";
                }
                interfaceC24731Iq.F8s(new C51576MqU(currentTimeMillis, l, j, name));
            }
        }
        return j3;
    }

    @Override // X.InterfaceC18540vh
    public final String C2k(long j) {
        return C2x(C06090Tz.A05, j);
    }

    @Override // X.InterfaceC18540vh
    public final String C2l(long j, String str) {
        if (A06(j)) {
            if (3 != ((int) ((j >>> 48) & 63))) {
                A03(j, "__NVAL__");
            } else {
                return A09(j).C2l(j, "__NVAL__");
            }
        }
        return "__NVAL__";
    }

    @Override // X.InterfaceC18540vh
    public final String C2x(C06090Tz c06090Tz, long j) {
        return C2y(c06090Tz, this.A0A.C2o(j), j);
    }

    @Override // X.InterfaceC18540vh
    public final String C2y(C06090Tz c06090Tz, String str, long j) {
        InterfaceC10260gi A09;
        MobileConfigValueSource mobileConfigValueSource;
        C06090Tz c06090Tz2 = c06090Tz;
        String str2 = str;
        java.util.Set<C54773OIm> A02 = A02();
        if (!A02.isEmpty()) {
            c06090Tz2 = C06090Tz.A00(c06090Tz2);
            c06090Tz2.A02 = true;
        }
        if (!A06(j)) {
            if (c06090Tz2.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c06090Tz2.A00 = new C0U5(mobileConfigValueSource);
            }
        } else if (3 != ((int) ((j >>> 48) & 63))) {
            A03(j, str2);
            if (c06090Tz2.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c06090Tz2.A00 = new C0U5(mobileConfigValueSource);
            }
        } else {
            if (c06090Tz2.A01) {
                A09 = A07();
            } else {
                A09 = A09(j);
            }
            str2 = A09.C2y(c06090Tz2, str2, j);
        }
        if (!A02.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c06090Tz2.A00.A00;
            this.A0B.syncFetchReason();
            for (C54773OIm c54773OIm : A02) {
                String name = mobileConfigValueSource2.name();
                String str3 = str2;
                if (str2 == null) {
                    str3 = "<null>";
                } else {
                    int length = str2.length();
                    if (length > 12) {
                        str3 = AnonymousClass001.A0g(str2.substring(0, 5), "..", str2.substring(length - 5, length));
                    }
                }
                C14360o3.A0B(str3, 5);
                InterfaceC24731Iq interfaceC24731Iq = c54773OIm.A01;
                long currentTimeMillis = System.currentTimeMillis();
                if (name == null) {
                    name = "";
                }
                interfaceC24731Iq.F8s(new C51576MqU(currentTimeMillis, str3, j, name));
            }
        }
        return str2;
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxChangeListener
    public final void onConfigChanged(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            this.A0Z = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ba, code lost:
    
        if (java.lang.Math.random() > 0.01d) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (java.lang.Integer.parseInt(r12) == 0) goto L31;
     */
    @Override // com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onEpConfigChanged(java.lang.String[] r49, java.lang.String[] r50) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229419w.onEpConfigChanged(java.lang.String[], java.lang.String[]):boolean");
    }

    private java.util.Set A02() {
        java.util.Set emptySet = Collections.emptySet();
        for (Object obj : this.A0S) {
            if (this.A0Q.nextInt(1) == 0) {
                if (emptySet.isEmpty()) {
                    emptySet = new HashSet();
                }
                emptySet.add(obj);
            }
        }
        return emptySet;
    }

    private void A03(long j, String str) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Invalid param type used for %d:%d(configKey:paramKey), %d(paramSpecifier); return value: %s.", Integer.valueOf(A00(j)), Integer.valueOf(C0UM.A00(j)), Long.valueOf(j), str);
        InterfaceC08830cm interfaceC08830cm = this.A0V;
        if (interfaceC08830cm != null) {
            C0f5 AEp = ((C0f6) interfaceC08830cm.get()).AEp("wrongParamType", 13639536);
            AEp.ERI(new RuntimeException(formatStrLocaleSafe));
            AEp.report();
        }
        C0K8.A0D("MobileConfigFactoryImpl", formatStrLocaleSafe);
    }

    public final InterfaceC10260gi A07() {
        if (A05()) {
            return this.A0J;
        }
        if (!this.A0E.get()) {
            A0G(false);
        }
        InterfaceC10260gi interfaceC10260gi = this.A0Z;
        if (interfaceC10260gi == null) {
            synchronized (this) {
                InterfaceC10260gi interfaceC10260gi2 = this.A0Z;
                if (interfaceC10260gi2 != null) {
                    return interfaceC10260gi2;
                }
                C228319l c228319l = this.A0B;
                long[][] jArr = null;
                AbstractC226118l latestHandle = c228319l.getLatestHandle();
                if (latestHandle == null || latestHandle.getJavaByteBuffer() == null) {
                    C0UN.A00(this.A06);
                }
                AbstractC225918h A0A = A0A();
                while (A0A instanceof C228319l) {
                    A0A = ((C228319l) A0A).A01();
                }
                if (!C1A8.class.isInstance(A0A)) {
                    A0A = null;
                }
                C1A8 c1a8 = (C1A8) A0A;
                if (c1a8 != null) {
                    jArr = c1a8.A01;
                }
                interfaceC10260gi = r3;
                C1AF c1af = new C1AF(latestHandle, c228319l, this.A01, this.A0A);
                if (jArr != null) {
                    interfaceC10260gi = new C55695OoM(new O1Q(jArr), c1af);
                }
                this.A0Z = interfaceC10260gi;
                this.A0R.add(interfaceC10260gi);
                C0UN.A00(this.A06);
            }
        }
        return interfaceC10260gi;
    }

    public final void A0E() {
        boolean A05 = A05();
        synchronized (this) {
            this.A01 = this.A0B.getOrCreateOverridesTable();
            this.A0R.clear();
            this.A0X = new AtomicReferenceArray(10000);
            this.A0Z = null;
            this.A0a = new AtomicIntegerArray(10000);
            if (A05) {
                C0UF c0uf = C0UE.A00;
                if (c0uf == null) {
                    c0uf = new C0UF();
                    C0UE.A00 = c0uf;
                }
                synchronized (c0uf) {
                    c0uf.A00.clear();
                }
                this.A0E.set(false);
                this.A0U.set(false);
                this.A0D.set(true);
                this.A0T.set(false);
                this.A0Y = null;
            }
        }
    }

    public final boolean A0H() {
        String syncFetchReason;
        String str;
        AbstractC225918h A0A = A0A();
        while (A0A instanceof C228319l) {
            A0A = ((C228319l) A0A).A01();
        }
        if (C1A8.class.isInstance(A0A) && A0A != null) {
            syncFetchReason = A0A.syncFetchReason();
            str = "MobileConfigJavaManager: Using translation table.";
        } else {
            MobileConfigManagerHolderImpl A00 = C228319l.A00(A0A());
            if (A00 != null) {
                syncFetchReason = A00.syncFetchReason();
                str = "AppUpgrade";
            } else {
                return false;
            }
        }
        return syncFetchReason.equals(str);
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhB(long j, boolean z) {
        if (A06(j)) {
            if (1 != ((int) ((j >>> 48) & 63))) {
                A03(j, String.valueOf(z));
            } else {
                return A09(j).AhB(j, z);
            }
        }
        return z;
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhF(C06090Tz c06090Tz, long j, boolean z) {
        InterfaceC10260gi A09;
        MobileConfigValueSource mobileConfigValueSource;
        String str;
        java.util.Set<C54773OIm> A02 = A02();
        if (!A02.isEmpty()) {
            c06090Tz = C06090Tz.A00(c06090Tz);
            c06090Tz.A02 = true;
        }
        if (!A06(j)) {
            if (c06090Tz.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_UNIT_TYPE;
                c06090Tz.A00 = new C0U5(mobileConfigValueSource);
            }
        } else if (1 != ((int) ((j >>> 48) & 63))) {
            A03(j, String.valueOf(z));
            if (c06090Tz.A02) {
                mobileConfigValueSource = MobileConfigValueSource.DEFAULT__MISMATCH_PARAM_TYPE;
                c06090Tz.A00 = new C0U5(mobileConfigValueSource);
            }
        } else {
            if (c06090Tz.A01) {
                A09 = A07();
            } else {
                A09 = A09(j);
            }
            z = A09.AhF(c06090Tz, j, z);
        }
        if (!A02.isEmpty()) {
            MobileConfigValueSource mobileConfigValueSource2 = c06090Tz.A00.A00;
            this.A0B.syncFetchReason();
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            for (C54773OIm c54773OIm : A02) {
                String name = mobileConfigValueSource2.name();
                InterfaceC24731Iq interfaceC24731Iq = c54773OIm.A01;
                long currentTimeMillis = System.currentTimeMillis();
                if (name == null) {
                    name = "";
                }
                interfaceC24731Iq.F8s(new C51576MqU(currentTimeMillis, str, j, name));
            }
        }
        return z;
    }

    @Override // X.C0U1
    public final Map B1E() {
        return A07().B1E();
    }

    @Override // X.InterfaceC18540vh
    public final long BP3(long j, long j2) {
        if (A06(j)) {
            if (2 != ((int) ((j >>> 48) & 63))) {
                A03(j, String.valueOf(j2));
            } else {
                return A09(j).BP3(j, j2);
            }
        }
        return j2;
    }

    @Override // X.InterfaceC18540vh
    public final void CjF(long j) {
        if (A06(j)) {
            A09(j).CjF(j);
        }
    }

    @Override // X.InterfaceC18540vh
    public final double Az3(long j, double d) {
        if (A06(j)) {
            if (4 != ((int) ((j >>> 48) & 63))) {
                A03(j, String.valueOf(-123.5d));
            } else {
                return A09(j).Az3(j, -123.5d);
            }
        }
        return -123.5d;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.1A0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1A0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.1A0] */
    public C229419w(AssetManager assetManager, InterfaceC228619o interfaceC228619o, FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder, InterfaceC227319b interfaceC227319b, final InterfaceC228919r interfaceC228919r, C228319l c228319l, C227419c c227419c, File file, String str, java.util.Set set, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, int[][] iArr, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0B = c228319l;
        this.A0N = c227419c;
        this.A0W = z;
        this.A06 = i;
        this.A0C = file;
        this.A07 = assetManager;
        this.A0S = set;
        this.A0Y = interfaceC08830cm;
        this.A0F = z2;
        this.A03 = interfaceC08830cm2;
        this.A05 = iArr;
        this.A08 = interfaceC228619o;
        this.A09 = fBMobileConfigGlobalContextHolder;
        this.A0V = interfaceC08830cm3;
        this.A0M = interfaceC227319b;
        this.A0A = interfaceC228919r;
        final C0U0 orCreateOverridesTable = c228319l.getOrCreateOverridesTable();
        this.A01 = orCreateOverridesTable;
        final MobileConfigValueSource mobileConfigValueSource = MobileConfigValueSource.DEFAULT__ACCESSED_AFTER_MC_DISPOSE;
        this.A0J = new C1A1(orCreateOverridesTable, mobileConfigValueSource, interfaceC228919r) { // from class: X.1A0
            public final C0U5 A00;

            @Override // X.C1A1
            public final double A01(double d, long j, boolean z5) {
                return d;
            }

            @Override // X.C1A1
            public final long A02(long j, long j2, boolean z5) {
                return j2;
            }

            @Override // X.C1A1
            public final String A04(String str2, long j, boolean z5) {
                return str2;
            }

            @Override // X.C1A1
            public final boolean A05(long j, boolean z5, boolean z6) {
                return z5;
            }

            @Override // X.C1A2
            public final String BOq(long j) {
                return null;
            }

            @Override // X.C1A2
            public final int BOv(long j) {
                return 0;
            }

            @Override // X.InterfaceC18540vh
            public final void CjF(long j) {
            }

            @Override // X.C1A1
            public final C0U5 A03(long j) {
                return this.A00;
            }

            @Override // X.C0U1
            public final Map B1E() {
                return new HashMap();
            }

            @Override // X.C1A2
            public final List CCi() {
                return new ArrayList();
            }

            {
                this.A00 = new C0U5(mobileConfigValueSource);
            }
        };
        final MobileConfigValueSource mobileConfigValueSource2 = MobileConfigValueSource.DEFAULT__INVALID_CONFIG_PARAM_NAME;
        this.A0K = new C1A1(orCreateOverridesTable, mobileConfigValueSource2, interfaceC228919r) { // from class: X.1A0
            public final C0U5 A00;

            @Override // X.C1A1
            public final double A01(double d, long j, boolean z5) {
                return d;
            }

            @Override // X.C1A1
            public final long A02(long j, long j2, boolean z5) {
                return j2;
            }

            @Override // X.C1A1
            public final String A04(String str2, long j, boolean z5) {
                return str2;
            }

            @Override // X.C1A1
            public final boolean A05(long j, boolean z5, boolean z6) {
                return z5;
            }

            @Override // X.C1A2
            public final String BOq(long j) {
                return null;
            }

            @Override // X.C1A2
            public final int BOv(long j) {
                return 0;
            }

            @Override // X.InterfaceC18540vh
            public final void CjF(long j) {
            }

            @Override // X.C1A1
            public final C0U5 A03(long j) {
                return this.A00;
            }

            @Override // X.C0U1
            public final Map B1E() {
                return new HashMap();
            }

            @Override // X.C1A2
            public final List CCi() {
                return new ArrayList();
            }

            {
                this.A00 = new C0U5(mobileConfigValueSource2);
            }
        };
        final MobileConfigValueSource mobileConfigValueSource3 = MobileConfigValueSource.DEFAULT__SERVICE_NOT_FOUND;
        this.A0L = new C1A1(orCreateOverridesTable, mobileConfigValueSource3, interfaceC228919r) { // from class: X.1A0
            public final C0U5 A00;

            @Override // X.C1A1
            public final double A01(double d, long j, boolean z5) {
                return d;
            }

            @Override // X.C1A1
            public final long A02(long j, long j2, boolean z5) {
                return j2;
            }

            @Override // X.C1A1
            public final String A04(String str2, long j, boolean z5) {
                return str2;
            }

            @Override // X.C1A1
            public final boolean A05(long j, boolean z5, boolean z6) {
                return z5;
            }

            @Override // X.C1A2
            public final String BOq(long j) {
                return null;
            }

            @Override // X.C1A2
            public final int BOv(long j) {
                return 0;
            }

            @Override // X.InterfaceC18540vh
            public final void CjF(long j) {
            }

            @Override // X.C1A1
            public final C0U5 A03(long j) {
                return this.A00;
            }

            @Override // X.C0U1
            public final Map B1E() {
                return new HashMap();
            }

            @Override // X.C1A2
            public final List CCi() {
                return new ArrayList();
            }

            {
                this.A00 = new C0U5(mobileConfigValueSource3);
            }
        };
        this.A0Z = null;
        this.A0X = new AtomicReferenceArray(10000);
        this.A0a = new AtomicIntegerArray(10000);
        this.A0H = z3;
        this.A0G = z4;
        this.A0I = i2;
        this.A00 = i3;
        this.A02 = str;
    }
}
