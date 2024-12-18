package com.facebook.react.uimanager.events;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58319PtB;
import X.InterfaceC65656Tqi;
import X.InterfaceC65657Tqj;
import X.R3M;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

/* loaded from: classes10.dex */
public class ReactEventEmitter implements RCTModernEventEmitter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "ReactEventEmitter";
    public final R3M mReactContext;
    public RCTModernEventEmitter mFabricEventEmitter = null;
    public RCTEventEmitter mDefaultEventEmitter = null;

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, InterfaceC65657Tqj interfaceC65657Tqj) {
        receiveEvent(i, i2, str, false, 0, interfaceC65657Tqj, 2);
    }

    public void unregister(int i) {
        if (i == 1) {
            this.mDefaultEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    private RCTEventEmitter getDefaultEventEmitter() {
        if (this.mDefaultEventEmitter == null) {
            if (this.mReactContext.A0F()) {
                this.mDefaultEventEmitter = (RCTEventEmitter) this.mReactContext.A03(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Cannot get RCTEventEmitter from Context, no active Catalyst instance!"));
            }
        }
        return this.mDefaultEventEmitter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if ((r4 % 2) != 0) goto L8;
     */
    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void receiveTouches(X.R6D r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.events.ReactEventEmitter.receiveTouches(X.R6D):void");
    }

    public ReactEventEmitter(R3M r3m) {
        this.mReactContext = r3m;
    }

    public void register(int i, RCTEventEmitter rCTEventEmitter) {
        this.mDefaultEventEmitter = rCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, InterfaceC65657Tqj interfaceC65657Tqj) {
        receiveEvent(-1, i, str, interfaceC65657Tqj);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, InterfaceC65656Tqi interfaceC65656Tqi, InterfaceC65656Tqi interfaceC65656Tqi2) {
        AbstractC05810Sj.A02(AbstractC167007dF.A1O(interfaceC65656Tqi.size()));
        if (interfaceC65656Tqi.getMap(0).getInt("target") % 2 != 0 && getDefaultEventEmitter() != null) {
            this.mDefaultEventEmitter.receiveTouches(str, interfaceC65656Tqi, interfaceC65656Tqi2);
        }
    }

    public void register(int i, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, boolean z, int i3, InterfaceC65657Tqj interfaceC65657Tqj, int i4) {
        if (i != -1 || (i2 % 10 != 1 && i2 % 2 == 0)) {
            RCTModernEventEmitter rCTModernEventEmitter = this.mFabricEventEmitter;
            if (rCTModernEventEmitter != null) {
                rCTModernEventEmitter.receiveEvent(i, i2, str, z, i3, interfaceC65657Tqj, i4);
                return;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Cannot find EventEmitter for receiveEvent: SurfaceId[");
            A1C.append(i);
            A1C.append("] ReactTag[");
            A1C.append(i2);
            A1C.append("] UIManagerType[");
            A1C.append(2);
            A1C.append("] EventName[");
            A1C.append(str);
            ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException(AbstractC58319PtB.A0w(A1C)));
            return;
        }
        RCTEventEmitter defaultEventEmitter = getDefaultEventEmitter();
        if (defaultEventEmitter == null) {
            return;
        }
        defaultEventEmitter.receiveEvent(i2, str, interfaceC65657Tqj);
    }
}
