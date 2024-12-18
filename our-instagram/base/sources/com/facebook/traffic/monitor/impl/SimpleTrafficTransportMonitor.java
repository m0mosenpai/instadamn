package com.facebook.traffic.monitor.impl;

import X.C0HM;
import android.util.LruCache;
import com.facebook.traffic.monitor.api.ITrafficTransportMonitor;
import java.util.UUID;

/* loaded from: classes.dex */
public class SimpleTrafficTransportMonitor implements ITrafficTransportMonitor {
    public static final int INSTANCE_KEY_CACHE_SIZE = 1000;
    public static final int MARKER_ID_CACHE_SIZE = 100;
    public static SimpleTrafficTransportMonitor instance;
    public final int instanceKeyCacheSize;
    public final LruCache qplMarkerUuids;

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public synchronized UUID getMarkerInstanceUuid(int i, int i2) {
        UUID uuid;
        LruCache lruCache = this.qplMarkerUuids;
        Integer valueOf = Integer.valueOf(i);
        if (lruCache.get(valueOf) != null) {
            uuid = (UUID) ((LruCache) this.qplMarkerUuids.get(valueOf)).get(Integer.valueOf(i2));
        } else {
            uuid = null;
        }
        return uuid;
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public synchronized UUID getOrGenerateQplMarker(int i, int i2) {
        UUID markerInstanceUuid;
        markerInstanceUuid = getMarkerInstanceUuid(i, i2);
        if (markerInstanceUuid == null) {
            markerInstanceUuid = registerQplMarkerInstance(i, i2);
        }
        return markerInstanceUuid;
    }

    @Override // com.facebook.traffic.monitor.api.ITrafficTransportMonitor
    public synchronized UUID registerQplMarkerInstance(int i, int i2) {
        UUID A00;
        LruCache lruCache = this.qplMarkerUuids;
        Integer valueOf = Integer.valueOf(i);
        if (lruCache.get(valueOf) == null) {
            this.qplMarkerUuids.put(valueOf, new LruCache(this.instanceKeyCacheSize));
        }
        A00 = C0HM.A00();
        LruCache lruCache2 = (LruCache) this.qplMarkerUuids.get(valueOf);
        lruCache2.getClass();
        lruCache2.put(Integer.valueOf(i2), A00);
        return A00;
    }

    public static synchronized SimpleTrafficTransportMonitor getInstance() {
        SimpleTrafficTransportMonitor simpleTrafficTransportMonitor;
        synchronized (SimpleTrafficTransportMonitor.class) {
            simpleTrafficTransportMonitor = instance;
            if (simpleTrafficTransportMonitor == null) {
                simpleTrafficTransportMonitor = new SimpleTrafficTransportMonitor();
                instance = simpleTrafficTransportMonitor;
            }
        }
        return simpleTrafficTransportMonitor;
    }

    public SimpleTrafficTransportMonitor(int i, int i2) {
        this.qplMarkerUuids = new LruCache(i);
        this.instanceKeyCacheSize = i2;
    }

    public SimpleTrafficTransportMonitor() {
        this(100, 1000);
    }
}
