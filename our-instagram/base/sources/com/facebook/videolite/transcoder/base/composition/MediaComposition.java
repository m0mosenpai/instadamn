package com.facebook.videolite.transcoder.base.composition;

import X.AnonymousClass001;
import X.C1125456i;
import X.C1125656k;
import X.C1125756l;
import X.C1125856m;
import X.C1125956n;
import X.C1126256q;
import X.C5JJ;
import X.C69688VtY;
import X.EnumC1125356h;
import X.VME;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class MediaComposition {
    public HashMap A00;
    public HashMap A01;
    public HashMap A02;
    public boolean A03;
    public HashMap A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaComposition mediaComposition = (MediaComposition) obj;
            HashMap hashMap = this.A02;
            HashMap hashMap2 = mediaComposition.A02;
            if (hashMap == hashMap2 || hashMap.equals(hashMap2)) {
                HashMap hashMap3 = this.A00;
                HashMap hashMap4 = mediaComposition.A00;
                if (hashMap3 != hashMap4 && !hashMap3.equals(hashMap4)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static MediaComposition A00(String str) {
        File file;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("mTypeToTracksMap");
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                EnumC1125356h A00 = EnumC1125356h.A00(jSONObject2.getInt("TrackType"));
                JSONArray jSONArray2 = jSONObject2.getJSONArray("TrackMap");
                int length = jSONArray2.length();
                HashMap hashMap2 = new HashMap();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    int i3 = jSONObject3.getInt("TrackIndex");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("MediaTrackComposition");
                    String string = jSONObject4.getString("mName");
                    long j = jSONObject4.getLong("mStartAtTimeUs");
                    EnumC1125356h A002 = EnumC1125356h.A00(jSONObject4.getInt("mTrackType"));
                    JSONArray jSONArray3 = jSONObject4.getJSONArray("mSegments");
                    int length2 = jSONArray3.length();
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONObject jSONObject5 = jSONArray3.getJSONObject(i4);
                        String optString = jSONObject5.optString("mSourceFile");
                        URL url = null;
                        if (optString.length() == 0) {
                            file = null;
                        } else {
                            file = new File(optString);
                        }
                        String optString2 = jSONObject5.optString("mUrl");
                        if (optString2.length() != 0) {
                            url = new URL(optString2);
                        }
                        C1125456i A003 = C1125456i.A00(jSONObject5.getJSONObject("mSourceTimeRange"));
                        long j2 = jSONObject5.getLong("mPhotoDurationUs");
                        int i5 = jSONObject5.getInt("mOutputFps");
                        long j3 = jSONObject5.getInt("mMediaOriginalDurationMs");
                        C1125656k c1125656k = new C1125656k(file);
                        c1125656k.A03 = A003;
                        c1125656k.A02 = j2;
                        c1125656k.A00 = i5;
                        c1125656k.A05 = url;
                        c1125656k.A01 = j3;
                        arrayList.add(c1125656k.A00());
                    }
                    C1125856m c1125856m = new C1125856m(A002, string, j);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c1125856m.A02((C1125756l) it.next());
                    }
                    JSONArray jSONArray4 = jSONObject4.getJSONArray("mTimelineSpeedList");
                    int length3 = jSONArray4.length();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i6 = 0; i6 < length3; i6++) {
                        arrayList2.add(new C5JJ(jSONArray4.getJSONObject(i6)));
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C5JJ c5jj = (C5JJ) it2.next();
                        c1125856m.A01(c5jj.A01, c5jj.A00);
                    }
                    jSONObject4.getJSONArray("mTimelineEffects");
                    Iterator it3 = new ArrayList().iterator();
                    while (it3.hasNext()) {
                        c1125856m.A03((C69688VtY) it3.next(), null);
                    }
                    hashMap2.put(Integer.valueOf(i3), new C1125956n(c1125856m));
                }
                hashMap.put(A00, hashMap2);
            }
            C1126256q c1126256q = new C1126256q();
            Iterator it4 = hashMap.values().iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((HashMap) it4.next()).values().iterator();
                while (it5.hasNext()) {
                    c1126256q.A04((C1125956n) it5.next());
                }
            }
            JSONArray jSONArray5 = jSONObject.getJSONArray("mTrackTypeToTimelineEffects");
            HashMap hashMap3 = new HashMap();
            int length4 = jSONArray5.length();
            for (int i7 = 0; i7 < length4; i7++) {
                JSONObject jSONObject6 = jSONArray5.getJSONObject(i7);
                EnumC1125356h A004 = EnumC1125356h.A00(jSONObject6.getInt("TrackType"));
                jSONObject6.getJSONArray("TimelineEffects");
                hashMap3.put(A004, new ArrayList());
            }
            for (Map.Entry entry : hashMap3.entrySet()) {
                for (C69688VtY c69688VtY : (List) entry.getValue()) {
                    c1126256q.A01(c69688VtY.A00, (EnumC1125356h) entry.getKey(), c69688VtY.A01);
                }
            }
            return new MediaComposition(c1126256q);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private void A01() {
        if (!this.A03) {
            for (AbstractMap abstractMap : this.A02.values()) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : abstractMap.entrySet()) {
                    Object key = entry.getKey();
                    C1125956n c1125956n = (C1125956n) entry.getValue();
                    hashMap.put(key, new ArrayList(c1125956n.A04));
                    this.A04.put(c1125956n.A01, hashMap);
                }
            }
            this.A03 = true;
        }
    }

    public final C1126256q A03() {
        C1126256q c1126256q = new C1126256q();
        for (AbstractMap abstractMap : this.A02.values()) {
            for (int i = 0; i < abstractMap.size(); i++) {
                C1125956n c1125956n = (C1125956n) abstractMap.get(Integer.valueOf(i));
                if (c1125956n != null) {
                    c1126256q.A04(c1125956n);
                } else {
                    throw new IllegalArgumentException("track composition is null");
                }
            }
        }
        for (Map.Entry entry : this.A00.entrySet()) {
            for (C69688VtY c69688VtY : (List) entry.getValue()) {
                c1126256q.A01(c69688VtY.A00, (EnumC1125356h) entry.getKey(), c69688VtY.A01);
            }
        }
        return c1126256q;
    }

    public final String A05() {
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = this.A02;
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("TrackType", ((EnumC1125356h) entry.getKey()).A00);
                AbstractMap abstractMap = (AbstractMap) entry.getValue();
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry entry2 : abstractMap.entrySet()) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("TrackIndex", entry2.getKey());
                    jSONObject3.put("MediaTrackComposition", entry2.getValue().hashCode());
                    jSONArray2.put(jSONObject3);
                }
                jSONObject2.put("TrackMap", jSONArray2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("mTypeToTracksMap", jSONArray);
            HashMap hashMap2 = this.A00;
            JSONArray jSONArray3 = new JSONArray();
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("TrackType", ((EnumC1125356h) entry3.getKey()).A00);
                List list = (List) entry3.getValue();
                JSONArray jSONArray4 = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray4.put(it.next().hashCode());
                }
                jSONObject4.put("TimelineEffects", jSONArray4);
                jSONArray3.put(jSONObject4);
            }
            jSONObject.put("mTrackTypeToTimelineEffects", jSONArray3);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final HashMap A06(EnumC1125356h enumC1125356h) {
        HashMap hashMap = new HashMap();
        List list = (List) this.A00.get(enumC1125356h);
        if (list != null && !list.isEmpty()) {
            hashMap.put(-1, list);
        }
        HashMap A07 = A07(enumC1125356h);
        if (A07 != null) {
            for (Map.Entry entry : A07.entrySet()) {
                C1125956n c1125956n = (C1125956n) entry.getValue();
                Object key = entry.getKey();
                List list2 = c1125956n.A05;
                if (!list2.isEmpty()) {
                    hashMap.put(key, list2);
                }
            }
        }
        return hashMap;
    }

    public final JSONObject A09() {
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = this.A02;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : hashMap.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("TrackType", ((EnumC1125356h) entry.getKey()).A00);
            AbstractMap abstractMap = (AbstractMap) entry.getValue();
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry entry2 : abstractMap.entrySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("TrackIndex", entry2.getKey());
                jSONObject3.put("MediaTrackComposition", ((C1125956n) entry2.getValue()).A01());
                jSONArray2.put(jSONObject3);
            }
            jSONObject2.put("TrackMap", jSONArray2);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("mTypeToTracksMap", jSONArray);
        HashMap hashMap2 = this.A00;
        JSONArray jSONArray3 = new JSONArray();
        for (Map.Entry entry3 : hashMap2.entrySet()) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("TrackType", ((EnumC1125356h) entry3.getKey()).A00);
            List<C69688VtY> list = (List) entry3.getValue();
            JSONArray jSONArray4 = new JSONArray();
            for (C69688VtY c69688VtY : list) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("mTargetTimeRange", c69688VtY.A00.A04());
                jSONObject5.put("mMediaEffect", c69688VtY.A01.EqN());
                jSONArray4.put(jSONObject5);
            }
            jSONObject4.put("TimelineEffects", jSONArray4);
            jSONArray3.put(jSONObject4);
        }
        jSONObject.put("mTrackTypeToTimelineEffects", jSONArray3);
        return jSONObject;
    }

    public final void A0A() {
        HashMap hashMap = this.A02;
        boolean z = !hashMap.isEmpty();
        RuntimeException runtimeException = new RuntimeException("type to track map is empty");
        if (z) {
            for (AbstractMap abstractMap : hashMap.values()) {
                ArrayList arrayList = new ArrayList(abstractMap.size());
                for (C1125956n c1125956n : abstractMap.values()) {
                    for (C1125756l c1125756l : c1125956n.A04) {
                        File file = c1125756l.A04;
                        boolean z2 = true;
                        if (file != null) {
                            boolean exists = file.exists();
                            FileNotFoundException fileNotFoundException = new FileNotFoundException(AnonymousClass001.A0R("source file not exist. path=", file.getPath()));
                            if (exists) {
                                boolean canRead = file.canRead();
                                IOException iOException = new IOException(AnonymousClass001.A0R("source file cannot be read. path=", file.getPath()));
                                if (!canRead) {
                                    throw new RuntimeException("media track segment validation error", iOException);
                                }
                            } else {
                                throw new RuntimeException("media track segment validation error", fileNotFoundException);
                            }
                        } else {
                            if (c1125756l.A05 == null) {
                                z2 = false;
                            }
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("url cannot be null");
                            if (!z2) {
                                throw new RuntimeException("media track segment validation error", illegalArgumentException);
                            }
                        }
                    }
                    String str = c1125956n.A02;
                    if (arrayList.contains(str)) {
                        throw new RuntimeException("media composition validation error", new IllegalStateException("duplicate track name"));
                    }
                    arrayList.add(str);
                }
            }
            return;
        }
        throw new RuntimeException("media composition validation error", runtimeException);
    }

    public final boolean A0B(EnumC1125356h enumC1125356h) {
        AbstractMap abstractMap = (AbstractMap) this.A02.get(enumC1125356h);
        if (abstractMap == null) {
            return false;
        }
        Iterator it = abstractMap.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = new ArrayList(((C1125956n) ((Map.Entry) it.next()).getValue()).A07).iterator();
            while (it2.hasNext()) {
                if (!VME.A00(((C5JJ) it2.next()).A00, 1.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00});
    }

    public MediaComposition(C1126256q c1126256q) {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        hashMap.putAll(c1126256q.A02);
        HashMap hashMap2 = new HashMap();
        this.A00 = hashMap2;
        hashMap2.putAll(c1126256q.A00);
        HashMap hashMap3 = new HashMap();
        this.A01 = hashMap3;
        hashMap3.putAll(c1126256q.A01);
        this.A04 = new HashMap();
    }

    public final int A02(EnumC1125356h enumC1125356h, String str) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(enumC1125356h);
        if (abstractMap != null) {
            for (Map.Entry entry : abstractMap.entrySet()) {
                if (((C1125956n) entry.getValue()).A02.equals(str)) {
                    return ((Number) entry.getKey()).intValue();
                }
            }
            return -1;
        }
        return -1;
    }

    public final C1125956n A04(EnumC1125356h enumC1125356h, int i) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A02.get(enumC1125356h);
        if (abstractMap != null) {
            return (C1125956n) abstractMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public final HashMap A07(EnumC1125356h enumC1125356h) {
        A01();
        HashMap hashMap = this.A02;
        if (hashMap.get(enumC1125356h) != null) {
            return (HashMap) hashMap.get(enumC1125356h);
        }
        return null;
    }

    public final List A08(EnumC1125356h enumC1125356h, int i) {
        A01();
        AbstractMap abstractMap = (AbstractMap) this.A04.get(enumC1125356h);
        if (abstractMap != null) {
            return (List) abstractMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public final String toString() {
        try {
            return A09().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
