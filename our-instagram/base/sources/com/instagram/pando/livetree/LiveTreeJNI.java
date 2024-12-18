package com.instagram.pando.livetree;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25233BEq;
import X.AbstractC31180DnO;
import X.BFI;
import X.C09170dP;
import X.C0w9;
import X.C14360o3;
import X.C40755I4j;
import X.C51758Mth;
import X.C57249PbX;
import X.C57509Pfj;
import X.EnumC12410kj;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.MHX;
import com.facebook.jni.HybridClassBase;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class LiveTreeJNI extends HybridClassBase {
    public static final C40755I4j Companion = new Object();
    public final Map fieldCache = new ConcurrentHashMap();
    public final Map reconciledFieldCache = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public final class LiveTreeCallbacks {
        public final InterfaceC16820sZ clearCache;

        public LiveTreeCallbacks(InterfaceC16820sZ interfaceC16820sZ) {
            C14360o3.A0B(interfaceC16820sZ, 1);
            this.clearCache = interfaceC16820sZ;
        }

        public final void onShouldClearCache() {
            this.clearCache.invoke();
        }
    }

    public static final native LiveTreeJNI create(String str, String str2, SupportedFieldsJNI supportedFieldsJNI);

    public final native Boolean getOptionalBooleanValueNative(int i);

    public final native Double getOptionalDoubleValueNative(int i);

    public final native List getOptionalIntListNative(int i);

    public final native Integer getOptionalIntValueNative(int i);

    public final native List getOptionalLongListNative(int i);

    public final native Long getOptionalLongValueNative(int i);

    public final native List getOptionalStringListNative(int i);

    public final native String getOptionalStringValueNative(int i);

    public final native List getOptionalTreeListNative(int i, Class cls);

    public final native TreeJNI getOptionalTreeValueNative(int i, Class cls);

    public final native Object getOptionalUntypedIDFieldNative(int i);

    private final native void publishRootTreeNative(TreeJNI treeJNI);

    private final native void publishRootTreeUpdaterNative(TreeUpdaterJNI treeUpdaterJNI);

    private final native void setNullNative(int i);

    private final native void subscribeToUpdatesNative(TreeJNI treeJNI, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, LiveTreeCallbacks liveTreeCallbacks, Executor executor);

    private final native void subscribeToUpdatesWithTreeUpdaterNative(TreeUpdaterJNI treeUpdaterJNI, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, LiveTreeCallbacks liveTreeCallbacks, Executor executor);

    private final native void updateBooleanValueNative(int i, boolean z);

    private final native void updateDoubleValueNative(int i, double d);

    private final native void updateIntListNative(int i, List list);

    private final native void updateIntValueNative(int i, int i2);

    private final native void updateLongListNative(int i, List list);

    private final native void updateLongValueNative(int i, long j);

    private final native void updateStringListNative(int i, List list);

    private final native void updateStringValueNative(int i, String str);

    private final native void updateTreeListNative(int i, List list);

    private final native void updateTreeListWithUpdaterNative(int i, List list);

    private final native void updateTreeValueNative(int i, TreeJNI treeJNI);

    private final native void updateTreeValueWithUpdaterNative(int i, TreeUpdaterJNI treeUpdaterJNI);

    public final List getOptionalEnumListByHashCode(int i, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        return (List) getValueFromCache(i, new BFI(i, 17, this, interfaceC16660sJ));
    }

    public final Object getOptionalEnumValueByHashCode(int i, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        return getValueFromCache(i, new BFI(i, 18, this, interfaceC16660sJ));
    }

    public final List getOptionalTreeListByHashCode(int i, Class cls) {
        C14360o3.A0B(cls, 1);
        return (List) getValueFromCache(i, new BFI(i, 19, this, cls));
    }

    public final Object getOptionalTreeValueByHashCode(int i, Class cls) {
        C14360o3.A0B(cls, 1);
        return getValueFromCache(i, new BFI(i, 20, this, cls));
    }

    public final List getReconciledOptionalTreeListByHashCode(int i, Class cls, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1P(cls, interfaceC16660sJ);
        return (List) getReconciledValueFromCache(i, new MHX(i, 16, interfaceC16660sJ, this, cls));
    }

    public final Object getReconciledOptionalTreeValueByHashCode(int i, Class cls, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1P(cls, interfaceC16660sJ);
        return getReconciledValueFromCache(i, new MHX(i, 17, interfaceC16660sJ, this, cls));
    }

    public final native void publishBatchedUpdate();

    public final void publishRootTree(TreeJNI treeJNI) {
        C14360o3.A0B(treeJNI, 0);
        clearCache();
        publishRootTreeNative(treeJNI);
    }

    public final void publishRootTreeUpdater(TreeUpdaterJNI treeUpdaterJNI) {
        C14360o3.A0B(treeUpdaterJNI, 0);
        clearCache();
        publishRootTreeUpdaterNative(treeUpdaterJNI);
    }

    public final native void startBatchingUpdates();

    public final void subscribeToUpdates(TreeJNI treeJNI, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, Executor executor) {
        C14360o3.A0B(treeJNI, 0);
        AbstractC167017dG.A1P(pandoConsistencyServiceJNI, executor);
        subscribeToUpdatesNative(treeJNI, pandoConsistencyServiceJNI, new LiveTreeCallbacks(new C57509Pfj(this, 0)), executor);
    }

    public final void updateEnumValueByHashCode(int i, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 2);
        if (!isEqualToCachedValue(obj, i)) {
            updateCacheByHashCode(i, obj);
            updateStringValueNative(i, (String) interfaceC16660sJ.invoke(obj));
        }
    }

    public final void updateIDValueByHashCode(int i, Object obj) {
        C14360o3.A0B(obj, 1);
        updateStringValueByHashCode(i, obj.toString());
    }

    public final void updateImageUrlByHashCode(int i, ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 1);
        if (!isEqualToCachedValue(imageUrl, i)) {
            updateCacheByHashCode(i, imageUrl);
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            updateStringValueNative(i, url);
        }
    }

    public final void updateIntListByHashCode(int i, List list) {
        C14360o3.A0B(list, 1);
        if (!isEqualToCachedValue(list, i)) {
            updateCacheByHashCode(i, list);
            updateIntListNative(i, list);
        }
    }

    public final void updateLongListByHashCode(int i, List list) {
        C14360o3.A0B(list, 1);
        if (!isEqualToCachedValue(list, i)) {
            updateCacheByHashCode(i, list);
            updateLongListNative(i, list);
        }
    }

    public final void updateOptionalEnumListByHashCode(int i, List list, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 2);
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateEnumListByHashCode(i, list, interfaceC16660sJ);
        }
    }

    public final void updateOptionalEnumValueByHashCode(int i, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 2);
        if (obj == null) {
            setNullByHashCode(i);
        } else {
            updateEnumValueByHashCode(i, obj, interfaceC16660sJ);
        }
    }

    public final void updateOptionalTreeListByHashCode(int i, List list, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        if (!isEqualToCachedValue(list, i)) {
            updateCacheByHashCode(i, list);
            updateOptionalTreeListInLiveTree(i, list, interfaceC16820sZ);
        }
    }

    public final void updateOptionalTreeValueByHashCode(int i, Object obj, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        if (!isEqualToCachedValue(obj, i)) {
            updateCacheByHashCode(i, obj);
            updateOptionalTreeValueInLiveTree(i, obj, interfaceC16820sZ);
        }
    }

    public final void updateReconciledOptionalTreeListByHashCode(int i, List list, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        if (!isEqualToReconciledCachedValue(list, i)) {
            updateReconciledCacheByHashCode(i, list);
            updateOptionalTreeListInLiveTree(i, list, interfaceC16820sZ);
        }
    }

    public final void updateReconciledOptionalTreeValueByHashCode(int i, Object obj, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 2);
        if (!isEqualToReconciledCachedValue(obj, i)) {
            updateReconciledCacheByHashCode(i, obj);
            updateOptionalTreeValueInLiveTree(i, obj, interfaceC16820sZ);
        }
    }

    public final void updateStringListByHashCode(int i, List list) {
        C14360o3.A0B(list, 1);
        if (!isEqualToCachedValue(list, i)) {
            updateCacheByHashCode(i, list);
            updateStringListNative(i, list);
        }
    }

    public final void updateStringValueByHashCode(int i, String str) {
        C14360o3.A0B(str, 1);
        if (!isEqualToCachedValue(str, i)) {
            updateCacheByHashCode(i, str);
            updateStringValueNative(i, str);
        }
    }

    public final void updateTreeListByHashCode(int i, List list) {
        C14360o3.A0B(list, 1);
        if (!isEqualToCachedValue(list, i)) {
            updateTreeListNative(i, list);
        }
    }

    public final void updateTreeValueByHashCode(int i, TreeJNI treeJNI) {
        C14360o3.A0B(treeJNI, 1);
        updateTreeValueNative(i, treeJNI);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.I4j, java.lang.Object] */
    static {
        C09170dP.A0C("live-tree-jni");
    }

    public final void clearCache() {
        this.fieldCache.clear();
        Iterator A15 = AbstractC166997dE.A15(this.reconciledFieldCache);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            int A0H = AbstractC166987dD.A0H(A1K.getKey());
            C51758Mth c51758Mth = (C51758Mth) A1K.getValue();
            this.reconciledFieldCache.put(Integer.valueOf(A0H), new C51758Mth(35, c51758Mth.A00, true));
        }
    }

    private final Object getReconciledValueFromCache(int i, InterfaceC16820sZ interfaceC16820sZ) {
        Object obj;
        Map map = this.reconciledFieldCache;
        Integer valueOf = Integer.valueOf(i);
        Object obj2 = map.get(valueOf);
        if (obj2 == null) {
            obj2 = new C51758Mth(interfaceC16820sZ.invoke());
            map.put(valueOf, obj2);
        }
        C51758Mth c51758Mth = (C51758Mth) obj2;
        if (c51758Mth.A01) {
            obj = interfaceC16820sZ.invoke();
            updateReconciledCacheByHashCode(i, obj);
        } else {
            obj = c51758Mth.A00;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    private final Object getValueFromCache(int i, InterfaceC16820sZ interfaceC16820sZ) {
        Map map = this.fieldCache;
        Integer valueOf = Integer.valueOf(i);
        Object obj = map.get(valueOf);
        if (obj == null) {
            obj = new C51758Mth(interfaceC16820sZ.invoke());
            map.put(valueOf, obj);
        }
        Object obj2 = ((C51758Mth) obj).A00;
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    private final boolean isEqualToCachedValue(Object obj, int i) {
        Object obj2;
        Map map = this.fieldCache;
        Integer valueOf = Integer.valueOf(i);
        C51758Mth c51758Mth = (C51758Mth) map.get(valueOf);
        if (c51758Mth != null && !c51758Mth.A01) {
            C51758Mth c51758Mth2 = (C51758Mth) this.fieldCache.get(valueOf);
            if (c51758Mth2 != null) {
                obj2 = c51758Mth2.A00;
            } else {
                obj2 = null;
            }
            if (C14360o3.A0K(obj2, obj)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean isEqualToReconciledCachedValue(Object obj, int i) {
        Object obj2;
        Map map = this.reconciledFieldCache;
        Integer valueOf = Integer.valueOf(i);
        C51758Mth c51758Mth = (C51758Mth) map.get(valueOf);
        if (c51758Mth != null && !c51758Mth.A01) {
            C51758Mth c51758Mth2 = (C51758Mth) this.reconciledFieldCache.get(valueOf);
            if (c51758Mth2 != null) {
                obj2 = c51758Mth2.A00;
            } else {
                obj2 = null;
            }
            if (C14360o3.A0K(obj2, obj)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void updateOptionalTreeListInLiveTree(int i, List list, InterfaceC16820sZ interfaceC16820sZ) {
        if (list == null) {
            setNullNative(i);
            return;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof TreeJNI)) {
                    List list2 = (List) interfaceC16820sZ.invoke();
                    if (list2 != null) {
                        updateTreeListWithUpdaterNative(i, list2);
                        return;
                    } else {
                        C0w9.A01(EnumC12410kj.A0A, "LiveTreeJNI", "TreeUpaters returned null!");
                        return;
                    }
                }
            }
        }
        updateTreeListNative(i, list);
    }

    private final void updateOptionalTreeValueInLiveTree(int i, Object obj, InterfaceC16820sZ interfaceC16820sZ) {
        if (obj != null) {
            if (obj instanceof TreeJNI) {
                updateTreeValueNative(i, (TreeJNI) obj);
                return;
            }
            TreeUpdaterJNI treeUpdaterJNI = (TreeUpdaterJNI) interfaceC16820sZ.invoke();
            if (treeUpdaterJNI != null) {
                updateTreeValueWithUpdaterNative(i, treeUpdaterJNI);
                return;
            }
        }
        setNullNative(i);
    }

    public final Boolean getOptionalBooleanValueByHashCode(int i) {
        return (Boolean) getValueFromCache(i, new C57249PbX(i, 36, this));
    }

    public final Double getOptionalDoubleValueByHashCode(int i) {
        return (Double) getValueFromCache(i, new C57249PbX(i, 37, this));
    }

    public final Float getOptionalFloatValueByHashCode(int i) {
        return (Float) getValueFromCache(i, new C57249PbX(i, 38, this));
    }

    public final List getOptionalIDListByHashCode(int i) {
        return (List) getValueFromCache(i, new C57249PbX(i, 39, this));
    }

    public final String getOptionalIDValueByHashCode(int i) {
        return (String) getValueFromCache(i, new C57249PbX(i, 40, this));
    }

    public final ImageUrl getOptionalImageUrlByHashCode(int i) {
        return (ImageUrl) getValueFromCache(i, new C57249PbX(i, 41, this));
    }

    public final List getOptionalIntListByHashCode(int i) {
        return (List) getValueFromCache(i, new C57249PbX(i, 42, this));
    }

    public final Integer getOptionalIntValueByHashCode(int i) {
        return (Integer) getValueFromCache(i, new C57249PbX(i, 43, this));
    }

    public final List getOptionalLongListByHashCode(int i) {
        return (List) getValueFromCache(i, new C57249PbX(i, 44, this));
    }

    public final Long getOptionalLongValueByHashCode(int i) {
        return (Long) getValueFromCache(i, new C57249PbX(i, 45, this));
    }

    public final List getOptionalStringListByHashCode(int i) {
        return (List) getValueFromCache(i, new C57249PbX(i, 46, this));
    }

    public final String getOptionalStringValueByHashCode(int i) {
        return (String) getValueFromCache(i, new C57249PbX(i, 47, this));
    }

    public final void setNullByHashCode(int i) {
        C51758Mth c51758Mth;
        Map map = this.fieldCache;
        Integer valueOf = Integer.valueOf(i);
        C51758Mth c51758Mth2 = (C51758Mth) map.get(valueOf);
        boolean z = false;
        if (c51758Mth2 != null && !c51758Mth2.A01) {
            z = true;
        }
        if (z && ((c51758Mth = (C51758Mth) this.fieldCache.get(valueOf)) == null || c51758Mth.A00 == null)) {
            return;
        }
        updateCacheByHashCode(i, null);
        setNullNative(i);
    }

    public final void updateOptionalBooleanValueByHashCode(int i, Boolean bool) {
        if (bool == null) {
            setNullByHashCode(i);
        } else {
            updateBooleanValueByHashCode(i, bool.booleanValue());
        }
    }

    public final void updateOptionalDoubleValueByHashCode(int i, Double d) {
        if (d == null) {
            setNullByHashCode(i);
        } else {
            updateDoubleValueByHashCode(i, d.doubleValue());
        }
    }

    public final void updateOptionalFloatValueByHashCode(int i, Float f) {
        if (f == null) {
            setNullByHashCode(i);
        } else {
            updateFloatValueByHashCode(i, f.floatValue());
        }
    }

    public final void updateOptionalIDListByHashCode(int i, List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
        } else {
            arrayList = null;
        }
        updateOptionalStringListByHashCode(i, arrayList);
    }

    public final void updateOptionalImageUrlByHashCode(int i, ImageUrl imageUrl) {
        if (imageUrl == null) {
            setNullByHashCode(i);
        } else {
            updateImageUrlByHashCode(i, imageUrl);
        }
    }

    public final void updateOptionalIntListByHashCode(int i, List list) {
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateIntListByHashCode(i, list);
        }
    }

    public final void updateOptionalIntValueByHashCode(int i, Integer num) {
        if (num == null) {
            setNullByHashCode(i);
        } else {
            updateIntValueByHashCode(i, num.intValue());
        }
    }

    public final void updateOptionalLongListByHashCode(int i, List list) {
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateLongListByHashCode(i, list);
        }
    }

    public final void updateOptionalLongValueByHashCode(int i, Long l) {
        if (l == null) {
            setNullByHashCode(i);
        } else {
            updateLongValueByHashCode(i, l.longValue());
        }
    }

    public final void updateOptionalStringListByHashCode(int i, List list) {
        if (list == null) {
            setNullByHashCode(i);
        } else {
            updateStringListByHashCode(i, list);
        }
    }

    public final void updateOptionalStringValueByHashCode(int i, String str) {
        if (str == null) {
            setNullByHashCode(i);
        } else {
            updateStringValueByHashCode(i, str);
        }
    }

    public final void subscribeToUpdatesWithTreeUpdater(TreeUpdaterJNI treeUpdaterJNI, PandoConsistencyServiceJNI pandoConsistencyServiceJNI, Executor executor) {
        subscribeToUpdatesWithTreeUpdaterNative(treeUpdaterJNI, pandoConsistencyServiceJNI, new LiveTreeCallbacks(new C57509Pfj(this, AbstractC25233BEq.A1b(treeUpdaterJNI, pandoConsistencyServiceJNI, executor) ? 1 : 0)), executor);
    }

    public final void updateBooleanValueByHashCode(int i, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        if (!isEqualToCachedValue(valueOf, i)) {
            updateCacheByHashCode(i, valueOf);
            updateBooleanValueNative(i, z);
        }
    }

    public final void updateCacheByHashCode(int i, Object obj) {
        this.fieldCache.put(Integer.valueOf(i), new C51758Mth(obj));
    }

    public final void updateDoubleValueByHashCode(int i, double d) {
        Double valueOf = Double.valueOf(d);
        if (!isEqualToCachedValue(valueOf, i)) {
            updateCacheByHashCode(i, valueOf);
            updateDoubleValueNative(i, d);
        }
    }

    public final void updateEnumListByHashCode(int i, List list, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1P(list, interfaceC16660sJ);
        if (!isEqualToCachedValue(list, i)) {
            updateCacheByHashCode(i, list);
            updateStringListNative(i, (List) interfaceC16660sJ.invoke(list));
        }
    }

    public final void updateFloatValueByHashCode(int i, float f) {
        Float valueOf = Float.valueOf(f);
        if (!isEqualToCachedValue(valueOf, i)) {
            updateCacheByHashCode(i, valueOf);
            updateDoubleValueNative(i, f);
        }
    }

    public final void updateIntValueByHashCode(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        if (!isEqualToCachedValue(valueOf, i)) {
            updateCacheByHashCode(i, valueOf);
            updateIntValueNative(i, i2);
        }
    }

    public final void updateLongValueByHashCode(int i, long j) {
        Long valueOf = Long.valueOf(j);
        if (!isEqualToCachedValue(valueOf, i)) {
            updateCacheByHashCode(i, valueOf);
            updateLongValueNative(i, j);
        }
    }

    public final void updateOptionalIDValueByHashCode(int i, Object obj) {
        updateOptionalStringValueByHashCode(i, AbstractC31180DnO.A0k(obj));
    }

    public final void updateReconciledCacheByHashCode(int i, Object obj) {
        this.reconciledFieldCache.put(Integer.valueOf(i), new C51758Mth(obj));
    }
}
