package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC208410g;
import X.C06650Xb;
import X.C0XJ;
import X.C0XX;
import X.C17280tP;
import com.instagram.debug.devoptions.debughead.data.delegates.QplEventDelegate;
import com.instagram.debug.devoptions.debughead.models.QplDebugData;
import com.instagram.debug.devoptions.debughead.models.QplPointDebugData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class DebugHeadQplListener extends AbstractC208410g {
    public static DebugHeadQplListener sInstance;
    public QplEventDelegate mDelegate;
    public final Map mQplDebugDataCache = new ConcurrentHashMap();
    public int mLoomTriggerMarkerId = -1;

    @Override // X.C0Xc
    public String getName() {
        return "ig_debug_head";
    }

    public static synchronized DebugHeadQplListener getInstance() {
        DebugHeadQplListener debugHeadQplListener;
        synchronized (DebugHeadQplListener.class) {
            debugHeadQplListener = sInstance;
            if (debugHeadQplListener == null) {
                debugHeadQplListener = new DebugHeadQplListener();
                sInstance = debugHeadQplListener;
            }
        }
        return debugHeadQplListener;
    }

    public void clearCache() {
        QplEventDelegate qplEventDelegate = this.mDelegate;
        if (qplEventDelegate != null) {
            qplEventDelegate.initializeFromCache(this.mQplDebugDataCache);
        }
        this.mQplDebugDataCache.clear();
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerDrop(C0XX c0xx) {
        QplEventDelegate qplEventDelegate = this.mDelegate;
        if (qplEventDelegate != null) {
            qplEventDelegate.reportQplEventForDebug(c0xx);
            if (this.mLoomTriggerMarkerId == c0xx.getMarkerId()) {
                qplEventDelegate.onLoomTriggerMarkerEnd();
                return;
            }
            return;
        }
        if (!this.mQplDebugDataCache.containsKey(Integer.valueOf(c0xx.CCe()))) {
            return;
        }
        QplDebugData qplDebugData = (QplDebugData) this.mQplDebugDataCache.get(Integer.valueOf(c0xx.CCe()));
        qplDebugData.updateData(c0xx);
        this.mQplDebugDataCache.put(Integer.valueOf(qplDebugData.mUniqueIdentifier), qplDebugData);
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerPoint(C0XX c0xx, String str, C0XJ c0xj, long j, long j2, boolean z, int i) {
        QplEventDelegate qplEventDelegate = this.mDelegate;
        String str2 = "";
        if (qplEventDelegate != null) {
            int CCe = c0xx.CCe();
            if (c0xj != null) {
                str2 = c0xj.toString();
            }
            qplEventDelegate.reportQplMarkerPointForDebug(CCe, str2, str, j);
            return;
        }
        if (!this.mQplDebugDataCache.containsKey(Integer.valueOf(c0xx.CCe()))) {
            return;
        }
        QplDebugData qplDebugData = (QplDebugData) this.mQplDebugDataCache.get(Integer.valueOf(c0xx.CCe()));
        qplDebugData.updateData(c0xx);
        if (c0xj != null) {
            str2 = c0xj.toString();
        }
        qplDebugData.addPoint(new QplPointDebugData(str2, str, j));
        this.mQplDebugDataCache.put(Integer.valueOf(qplDebugData.mUniqueIdentifier), qplDebugData);
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerStart(C0XX c0xx) {
        QplEventDelegate qplEventDelegate = this.mDelegate;
        if (qplEventDelegate != null) {
            qplEventDelegate.reportQplEventForDebug(c0xx);
            if (this.mLoomTriggerMarkerId == c0xx.getMarkerId()) {
                qplEventDelegate.onLoomTriggerMarkerStart();
                return;
            }
            return;
        }
        this.mQplDebugDataCache.put(Integer.valueOf(c0xx.CCe()), new QplDebugData(c0xx));
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public void onMarkerStop(C0XX c0xx) {
        QplEventDelegate qplEventDelegate = this.mDelegate;
        if (qplEventDelegate != null) {
            qplEventDelegate.reportQplEventForDebug(c0xx);
            if (this.mLoomTriggerMarkerId == c0xx.getMarkerId()) {
                qplEventDelegate.onLoomTriggerMarkerEnd();
                return;
            }
            return;
        }
        if (!this.mQplDebugDataCache.containsKey(Integer.valueOf(c0xx.CCe()))) {
            return;
        }
        QplDebugData qplDebugData = (QplDebugData) this.mQplDebugDataCache.get(Integer.valueOf(c0xx.CCe()));
        qplDebugData.updateData(c0xx);
        this.mQplDebugDataCache.put(Integer.valueOf(qplDebugData.mUniqueIdentifier), qplDebugData);
    }

    public void setDelegate(QplEventDelegate qplEventDelegate) {
        this.mDelegate = qplEventDelegate;
    }

    public void setLoomTriggerMarker(int i) {
        this.mLoomTriggerMarkerId = i;
    }

    @Override // X.C0Xc
    public C06650Xb getListenerMarkers() {
        if (C17280tP.A00().A0W()) {
            return new C06650Xb(new int[]{-1}, null);
        }
        return C06650Xb.A03;
    }
}
