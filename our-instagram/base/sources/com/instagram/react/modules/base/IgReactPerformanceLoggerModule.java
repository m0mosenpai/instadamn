package com.instagram.react.modules.base;

import X.AbstractC12990ll;
import X.AbstractC27401Ut;
import X.AbstractC58323PtF;
import X.C64500TGm;
import X.InterfaceC65674Tr4;
import X.R3M;
import com.facebook.fbreact.specs.NativeReactPerformanceLoggerSpec;
import com.facebook.location.platform.api.Location;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.concurrent.atomic.AtomicLong;

@ReactModule(name = "ReactPerformanceLogger", needsEagerInit = true)
/* loaded from: classes10.dex */
public class IgReactPerformanceLoggerModule extends NativeReactPerformanceLoggerSpec {
    public static final String MODULE_NAME = "ReactPerformanceLogger";
    public final InterfaceC65674Tr4 mPerformanceLogger;

    @Override // com.facebook.fbreact.specs.NativeReactPerformanceLoggerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactPerformanceLogger";
    }

    public IgReactPerformanceLoggerModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mPerformanceLogger = AbstractC27401Ut.getInstance().getPerformanceLogger(abstractC12990ll);
    }

    @Override // com.facebook.fbreact.specs.NativeReactPerformanceLoggerSpec
    public void logEvents(ReadableMap readableMap) {
        long j;
        AtomicLong atomicLong;
        InterfaceC65674Tr4 interfaceC65674Tr4;
        long j2;
        InterfaceC65674Tr4 interfaceC65674Tr42;
        long j3;
        InterfaceC65674Tr4 interfaceC65674Tr43;
        long j4;
        ReadableMap map = readableMap.getMap("timespans");
        if (map != null) {
            double d = 0.0d;
            if (map.hasKey("JSAppRequireTime")) {
                ReadableMap map2 = map.getMap("JSAppRequireTime");
                InterfaceC65674Tr4 interfaceC65674Tr44 = this.mPerformanceLogger;
                ((C64500TGm) interfaceC65674Tr44).A0L.set((long) AbstractC58323PtF.A02(map2, "startTime"));
                InterfaceC65674Tr4 interfaceC65674Tr45 = this.mPerformanceLogger;
                j = (long) AbstractC58323PtF.A02(map2, "totalTime");
                atomicLong = ((C64500TGm) interfaceC65674Tr45).A0D;
            } else {
                j = 0;
                ((C64500TGm) this.mPerformanceLogger).A0D.set(0L);
                atomicLong = ((C64500TGm) this.mPerformanceLogger).A0L;
            }
            atomicLong.set(j);
            if (map.hasKey("JSTime")) {
                ReadableMap map3 = map.getMap("JSTime");
                interfaceC65674Tr4 = this.mPerformanceLogger;
                j2 = (long) AbstractC58323PtF.A02(map3, "totalTime");
            } else {
                interfaceC65674Tr4 = this.mPerformanceLogger;
                j2 = 0;
            }
            ((C64500TGm) interfaceC65674Tr4).A0E.set(j2);
            if (map.hasKey("IdleTime")) {
                ReadableMap map4 = map.getMap("IdleTime");
                interfaceC65674Tr42 = this.mPerformanceLogger;
                j3 = (long) AbstractC58323PtF.A02(map4, "totalTime");
            } else {
                interfaceC65674Tr42 = this.mPerformanceLogger;
                j3 = 0;
            }
            ((C64500TGm) interfaceC65674Tr42).A0C.set(j3);
            if (map.hasKey("fetchRelayQuery")) {
                ReadableMap map5 = map.getMap("fetchRelayQuery");
                interfaceC65674Tr43 = this.mPerformanceLogger;
                if (map5.hasKey("totalTime")) {
                    d = map5.getDouble("totalTime");
                }
                j4 = (long) d;
            } else {
                interfaceC65674Tr43 = this.mPerformanceLogger;
                j4 = 0;
            }
            ((C64500TGm) interfaceC65674Tr43).A0B.set(j4);
        }
        ReadableMap map6 = readableMap.getMap(Location.EXTRAS);
        if (map6 != null) {
            if (map6.hasKey("JscBlockSize")) {
                InterfaceC65674Tr4 interfaceC65674Tr46 = this.mPerformanceLogger;
                ((C64500TGm) interfaceC65674Tr46).A0F.set((long) map6.getDouble("JscBlockSize"));
            }
            if (map6.hasKey("JscMallocSize")) {
                InterfaceC65674Tr4 interfaceC65674Tr47 = this.mPerformanceLogger;
                ((C64500TGm) interfaceC65674Tr47).A0G.set((long) map6.getDouble("JscMallocSize"));
            }
            if (map6.hasKey("JscObjectSize")) {
                InterfaceC65674Tr4 interfaceC65674Tr48 = this.mPerformanceLogger;
                ((C64500TGm) interfaceC65674Tr48).A0H.set((long) map6.getDouble("JscObjectSize"));
            }
            if (map6.hasKey("usedRelayModern")) {
                ((C64500TGm) this.mPerformanceLogger).A05.set(map6.getBoolean("usedRelayModern") ? 1 : 0);
            }
            if (map6.hasKey("usedRelayPrefetcher")) {
                ((C64500TGm) this.mPerformanceLogger).A06.set(map6.getBoolean("usedRelayPrefetcher") ? 1 : 0);
            }
        }
        if (readableMap.hasKey("tag")) {
            ((C64500TGm) this.mPerformanceLogger).A0S = readableMap.getString("tag");
        }
        this.mPerformanceLogger.Cks();
    }
}
