package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic.NativeConfigFactory;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;
import com.instagram.iglu.debug.DebugFilterIO;
import java.util.List;

/* renamed from: X.8sO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199728sO extends C81E {
    public FilterManagerImpl A00;
    public IgluFilterNativeGraph A01;
    public AZH A02;
    public AZH A03;
    public C197618oY A04;
    public final InterfaceC198588q7 A05;
    public final C198548q3 A06;
    public final C199738sP A07;
    public final C179387xo A08;
    public final boolean A09;
    public final boolean A0A;

    public C199728sO(InterfaceC198588q7 interfaceC198588q7, C198548q3 c198548q3, boolean z, boolean z2, boolean z3) {
        super(null);
        this.A06 = c198548q3;
        this.A05 = interfaceC198588q7;
        this.A07 = new C199738sP();
        this.A08 = new C179387xo();
        this.A0A = z2;
        this.A09 = z3;
        if (z) {
            DebugFilterIO.setDebugFilterIOEnabled(true);
        }
    }

    private synchronized void A00() {
        if (this.A01 == null || this.A00 == null) {
            C198548q3 c198548q3 = this.A06;
            IgluConfigHolder createIgAssetConfig = NativeConfigFactory.createIgAssetConfig(c198548q3.A00, c198548q3.A01);
            C14360o3.A07(createIgAssetConfig);
            IgluFilterNativeGraph igluFilterNativeGraph = new IgluFilterNativeGraph();
            this.A01 = igluFilterNativeGraph;
            igluFilterNativeGraph.attach(createIgAssetConfig);
            InterfaceC198588q7 interfaceC198588q7 = this.A05;
            if (interfaceC198588q7 != null) {
                interfaceC198588q7.attach(createIgAssetConfig);
            }
            this.A00 = new FilterManagerImpl(interfaceC198588q7, null);
            createIgAssetConfig.release();
        }
    }

    public final synchronized InterfaceC179467xw A04(InterfaceC199548s4 interfaceC199548s4, InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, AbstractC179397xp abstractC179397xp, InterfaceC179037xF interfaceC179037xF, Long l, List list, int i, int i2, boolean z, boolean z2) {
        if (!A03()) {
            return interfaceC179467xw;
        }
        try {
            AbstractC1808580n.A03("IgluFilterMediaGraphRenderer.render");
            boolean z3 = false;
            if (interfaceC179437xt != null) {
                z3 = true;
            }
            return A05(interfaceC199548s4, interfaceC179467xw, interfaceC179437xt, abstractC179397xp, interfaceC179037xF, l, list, i, i2, z, z2, z3);
        } finally {
            AbstractC1808580n.A01();
        }
    }

    private void A01(InterfaceC199548s4 interfaceC199548s4) {
        FilterGroup filterGroup;
        DefectDetectorFilter defectDetectorFilter;
        FilterManagerImpl filterManagerImpl;
        FilterWeakPtr filterWeakPtr;
        if ((interfaceC199548s4 instanceof C199538s3) && (filterGroup = (FilterGroup) ((FilterModel) ((FilterChain) interfaceC199548s4.B6R()).A01.get(27))) != null && (defectDetectorFilter = (DefectDetectorFilter) ((FilterModel) filterGroup.A01.get(27))) != null && (filterManagerImpl = this.A00) != null && (filterWeakPtr = filterManagerImpl.getSubFilterManager(27).getSubFilterManager(27).getFilterWeakPtr()) != null) {
            defectDetectorFilter.updateFrameCount(filterWeakPtr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        if (r2 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A06(X.InterfaceC199548s4 r20, X.AbstractC179397xp r21, X.InterfaceC179037xF r22, java.lang.Long r23, java.util.List r24, int r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            r19 = this;
            r6 = r19
            r11 = r22
            monitor-enter(r6)
            boolean r0 = r6.A03()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L72
            java.lang.String r0 = "IgluFilterMediaGraphRenderer.render"
            X.AbstractC1808580n.A03(r0)     // Catch: java.lang.Throwable -> L6d
            r0 = r27
            java.lang.Object r8 = r11.BHy(r0)     // Catch: java.lang.Throwable -> L6d
            X.7xw r8 = (X.InterfaceC179467xw) r8     // Catch: java.lang.Throwable -> L6d
            r9 = 0
            boolean r0 = r6.A0A     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L49
            r5 = 0
            java.util.List r4 = r11.B9z(r5)     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6d
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L41
            r2 = r9
        L28:
            if (r5 >= r3) goto L3f
            java.lang.Object r1 = r4.get(r5)     // Catch: java.lang.Throwable -> L41
            X.7xt r1 = (X.InterfaceC179437xt) r1     // Catch: java.lang.Throwable -> L41
            boolean r0 = r1.CTm(r8)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3a
            if (r2 == 0) goto L39
            goto L3d
        L39:
            r2 = r1
        L3a:
            int r5 = r5 + 1
            goto L28
        L3d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            goto L49
        L3f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            throw r0     // Catch: java.lang.Throwable -> L6d
        L44:
            r9 = r2
            r18 = 1
            if (r2 != 0) goto L4b
        L49:
            r18 = 0
        L4b:
            r7 = r20
            r10 = r21
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r16 = r28
            r17 = r29
            X.7xw r2 = r6.A05(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L6d
            if (r18 != 0) goto L69
            X.7xE r11 = (X.C179027xE) r11     // Catch: java.lang.Throwable -> L6d
            X.7xH r1 = r11.A07     // Catch: java.lang.Throwable -> L6d
            r0 = 0
            r1.A01(r2, r0)     // Catch: java.lang.Throwable -> L6d
        L69:
            X.AbstractC1808580n.A01()     // Catch: java.lang.Throwable -> L74
            goto L72
        L6d:
            r0 = move-exception
            X.AbstractC1808580n.A01()     // Catch: java.lang.Throwable -> L74
            throw r0     // Catch: java.lang.Throwable -> L74
        L72:
            monitor-exit(r6)
            return
        L74:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199728sO.A06(X.8s4, X.7xp, X.7xF, java.lang.Long, java.util.List, int, int, int, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025b A[Catch: all -> 0x06b3, TryCatch #0 {, blocks: (B:291:0x000d, B:292:0x0011, B:294:0x0017, B:6:0x0027, B:7:0x0031, B:19:0x0055, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x00d8, B:29:0x00dc, B:31:0x00f4, B:33:0x010a, B:35:0x0112, B:37:0x011f, B:39:0x0125, B:41:0x0134, B:43:0x013a, B:54:0x0130, B:45:0x0142, B:49:0x014c, B:55:0x0157, B:60:0x0161, B:64:0x0681, B:65:0x0685, B:66:0x0696, B:68:0x019d, B:70:0x01a1, B:72:0x01ab, B:74:0x01b1, B:76:0x01bf, B:77:0x01cb, B:79:0x01cf, B:82:0x01da, B:84:0x01e9, B:89:0x0209, B:92:0x021f, B:93:0x0227, B:95:0x0238, B:97:0x023e, B:100:0x0246, B:101:0x024c, B:103:0x025b, B:105:0x0266, B:107:0x026b, B:109:0x026f, B:110:0x0276, B:112:0x027a, B:115:0x0284, B:117:0x028a, B:119:0x02cc, B:122:0x0323, B:125:0x0340, B:127:0x0357, B:129:0x0366, B:132:0x039c, B:135:0x03c0, B:137:0x03ca, B:142:0x03d9, B:143:0x03de, B:145:0x03e6, B:150:0x03ef, B:155:0x0400, B:157:0x0417, B:159:0x0425, B:161:0x0432, B:163:0x0450, B:164:0x0452, B:165:0x0456, B:176:0x048a, B:177:0x048c, B:182:0x04b2, B:183:0x04cc, B:186:0x04d4, B:187:0x04d8, B:205:0x052c, B:287:0x06b0, B:212:0x0540, B:216:0x059a, B:218:0x05a0, B:220:0x05a6, B:222:0x05aa, B:226:0x0623, B:229:0x05be, B:231:0x05ce, B:233:0x05d4, B:235:0x05d8, B:237:0x061f, B:238:0x05e0, B:239:0x05e3, B:251:0x04c7, B:252:0x04c4, B:258:0x04ca, B:259:0x04aa, B:260:0x0481, B:261:0x0484, B:262:0x0487, B:274:0x0467, B:275:0x046a, B:278:0x0078, B:279:0x00ca, B:280:0x005e, B:282:0x009d, B:283:0x00a3, B:284:0x0697, B:286:0x06a9), top: B:290:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0450 A[Catch: all -> 0x06b3, TryCatch #0 {, blocks: (B:291:0x000d, B:292:0x0011, B:294:0x0017, B:6:0x0027, B:7:0x0031, B:19:0x0055, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x00d8, B:29:0x00dc, B:31:0x00f4, B:33:0x010a, B:35:0x0112, B:37:0x011f, B:39:0x0125, B:41:0x0134, B:43:0x013a, B:54:0x0130, B:45:0x0142, B:49:0x014c, B:55:0x0157, B:60:0x0161, B:64:0x0681, B:65:0x0685, B:66:0x0696, B:68:0x019d, B:70:0x01a1, B:72:0x01ab, B:74:0x01b1, B:76:0x01bf, B:77:0x01cb, B:79:0x01cf, B:82:0x01da, B:84:0x01e9, B:89:0x0209, B:92:0x021f, B:93:0x0227, B:95:0x0238, B:97:0x023e, B:100:0x0246, B:101:0x024c, B:103:0x025b, B:105:0x0266, B:107:0x026b, B:109:0x026f, B:110:0x0276, B:112:0x027a, B:115:0x0284, B:117:0x028a, B:119:0x02cc, B:122:0x0323, B:125:0x0340, B:127:0x0357, B:129:0x0366, B:132:0x039c, B:135:0x03c0, B:137:0x03ca, B:142:0x03d9, B:143:0x03de, B:145:0x03e6, B:150:0x03ef, B:155:0x0400, B:157:0x0417, B:159:0x0425, B:161:0x0432, B:163:0x0450, B:164:0x0452, B:165:0x0456, B:176:0x048a, B:177:0x048c, B:182:0x04b2, B:183:0x04cc, B:186:0x04d4, B:187:0x04d8, B:205:0x052c, B:287:0x06b0, B:212:0x0540, B:216:0x059a, B:218:0x05a0, B:220:0x05a6, B:222:0x05aa, B:226:0x0623, B:229:0x05be, B:231:0x05ce, B:233:0x05d4, B:235:0x05d8, B:237:0x061f, B:238:0x05e0, B:239:0x05e3, B:251:0x04c7, B:252:0x04c4, B:258:0x04ca, B:259:0x04aa, B:260:0x0481, B:261:0x0484, B:262:0x0487, B:274:0x0467, B:275:0x046a, B:278:0x0078, B:279:0x00ca, B:280:0x005e, B:282:0x009d, B:283:0x00a3, B:284:0x0697, B:286:0x06a9), top: B:290:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04b2 A[Catch: all -> 0x06b3, TryCatch #0 {, blocks: (B:291:0x000d, B:292:0x0011, B:294:0x0017, B:6:0x0027, B:7:0x0031, B:19:0x0055, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x00d8, B:29:0x00dc, B:31:0x00f4, B:33:0x010a, B:35:0x0112, B:37:0x011f, B:39:0x0125, B:41:0x0134, B:43:0x013a, B:54:0x0130, B:45:0x0142, B:49:0x014c, B:55:0x0157, B:60:0x0161, B:64:0x0681, B:65:0x0685, B:66:0x0696, B:68:0x019d, B:70:0x01a1, B:72:0x01ab, B:74:0x01b1, B:76:0x01bf, B:77:0x01cb, B:79:0x01cf, B:82:0x01da, B:84:0x01e9, B:89:0x0209, B:92:0x021f, B:93:0x0227, B:95:0x0238, B:97:0x023e, B:100:0x0246, B:101:0x024c, B:103:0x025b, B:105:0x0266, B:107:0x026b, B:109:0x026f, B:110:0x0276, B:112:0x027a, B:115:0x0284, B:117:0x028a, B:119:0x02cc, B:122:0x0323, B:125:0x0340, B:127:0x0357, B:129:0x0366, B:132:0x039c, B:135:0x03c0, B:137:0x03ca, B:142:0x03d9, B:143:0x03de, B:145:0x03e6, B:150:0x03ef, B:155:0x0400, B:157:0x0417, B:159:0x0425, B:161:0x0432, B:163:0x0450, B:164:0x0452, B:165:0x0456, B:176:0x048a, B:177:0x048c, B:182:0x04b2, B:183:0x04cc, B:186:0x04d4, B:187:0x04d8, B:205:0x052c, B:287:0x06b0, B:212:0x0540, B:216:0x059a, B:218:0x05a0, B:220:0x05a6, B:222:0x05aa, B:226:0x0623, B:229:0x05be, B:231:0x05ce, B:233:0x05d4, B:235:0x05d8, B:237:0x061f, B:238:0x05e0, B:239:0x05e3, B:251:0x04c7, B:252:0x04c4, B:258:0x04ca, B:259:0x04aa, B:260:0x0481, B:261:0x0484, B:262:0x0487, B:274:0x0467, B:275:0x046a, B:278:0x0078, B:279:0x00ca, B:280:0x005e, B:282:0x009d, B:283:0x00a3, B:284:0x0697, B:286:0x06a9), top: B:290:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0540 A[Catch: all -> 0x06b3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:291:0x000d, B:292:0x0011, B:294:0x0017, B:6:0x0027, B:7:0x0031, B:19:0x0055, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x00d8, B:29:0x00dc, B:31:0x00f4, B:33:0x010a, B:35:0x0112, B:37:0x011f, B:39:0x0125, B:41:0x0134, B:43:0x013a, B:54:0x0130, B:45:0x0142, B:49:0x014c, B:55:0x0157, B:60:0x0161, B:64:0x0681, B:65:0x0685, B:66:0x0696, B:68:0x019d, B:70:0x01a1, B:72:0x01ab, B:74:0x01b1, B:76:0x01bf, B:77:0x01cb, B:79:0x01cf, B:82:0x01da, B:84:0x01e9, B:89:0x0209, B:92:0x021f, B:93:0x0227, B:95:0x0238, B:97:0x023e, B:100:0x0246, B:101:0x024c, B:103:0x025b, B:105:0x0266, B:107:0x026b, B:109:0x026f, B:110:0x0276, B:112:0x027a, B:115:0x0284, B:117:0x028a, B:119:0x02cc, B:122:0x0323, B:125:0x0340, B:127:0x0357, B:129:0x0366, B:132:0x039c, B:135:0x03c0, B:137:0x03ca, B:142:0x03d9, B:143:0x03de, B:145:0x03e6, B:150:0x03ef, B:155:0x0400, B:157:0x0417, B:159:0x0425, B:161:0x0432, B:163:0x0450, B:164:0x0452, B:165:0x0456, B:176:0x048a, B:177:0x048c, B:182:0x04b2, B:183:0x04cc, B:186:0x04d4, B:187:0x04d8, B:205:0x052c, B:287:0x06b0, B:212:0x0540, B:216:0x059a, B:218:0x05a0, B:220:0x05a6, B:222:0x05aa, B:226:0x0623, B:229:0x05be, B:231:0x05ce, B:233:0x05d4, B:235:0x05d8, B:237:0x061f, B:238:0x05e0, B:239:0x05e3, B:251:0x04c7, B:252:0x04c4, B:258:0x04ca, B:259:0x04aa, B:260:0x0481, B:261:0x0484, B:262:0x0487, B:274:0x0467, B:275:0x046a, B:278:0x0078, B:279:0x00ca, B:280:0x005e, B:282:0x009d, B:283:0x00a3, B:284:0x0697, B:286:0x06a9), top: B:290:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04aa A[Catch: all -> 0x06b3, TryCatch #0 {, blocks: (B:291:0x000d, B:292:0x0011, B:294:0x0017, B:6:0x0027, B:7:0x0031, B:19:0x0055, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x00d8, B:29:0x00dc, B:31:0x00f4, B:33:0x010a, B:35:0x0112, B:37:0x011f, B:39:0x0125, B:41:0x0134, B:43:0x013a, B:54:0x0130, B:45:0x0142, B:49:0x014c, B:55:0x0157, B:60:0x0161, B:64:0x0681, B:65:0x0685, B:66:0x0696, B:68:0x019d, B:70:0x01a1, B:72:0x01ab, B:74:0x01b1, B:76:0x01bf, B:77:0x01cb, B:79:0x01cf, B:82:0x01da, B:84:0x01e9, B:89:0x0209, B:92:0x021f, B:93:0x0227, B:95:0x0238, B:97:0x023e, B:100:0x0246, B:101:0x024c, B:103:0x025b, B:105:0x0266, B:107:0x026b, B:109:0x026f, B:110:0x0276, B:112:0x027a, B:115:0x0284, B:117:0x028a, B:119:0x02cc, B:122:0x0323, B:125:0x0340, B:127:0x0357, B:129:0x0366, B:132:0x039c, B:135:0x03c0, B:137:0x03ca, B:142:0x03d9, B:143:0x03de, B:145:0x03e6, B:150:0x03ef, B:155:0x0400, B:157:0x0417, B:159:0x0425, B:161:0x0432, B:163:0x0450, B:164:0x0452, B:165:0x0456, B:176:0x048a, B:177:0x048c, B:182:0x04b2, B:183:0x04cc, B:186:0x04d4, B:187:0x04d8, B:205:0x052c, B:287:0x06b0, B:212:0x0540, B:216:0x059a, B:218:0x05a0, B:220:0x05a6, B:222:0x05aa, B:226:0x0623, B:229:0x05be, B:231:0x05ce, B:233:0x05d4, B:235:0x05d8, B:237:0x061f, B:238:0x05e0, B:239:0x05e3, B:251:0x04c7, B:252:0x04c4, B:258:0x04ca, B:259:0x04aa, B:260:0x0481, B:261:0x0484, B:262:0x0487, B:274:0x0467, B:275:0x046a, B:278:0x0078, B:279:0x00ca, B:280:0x005e, B:282:0x009d, B:283:0x00a3, B:284:0x0697, B:286:0x06a9), top: B:290:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc A[Catch: all -> 0x06b3, TryCatch #0 {, blocks: (B:291:0x000d, B:292:0x0011, B:294:0x0017, B:6:0x0027, B:7:0x0031, B:19:0x0055, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x00d8, B:29:0x00dc, B:31:0x00f4, B:33:0x010a, B:35:0x0112, B:37:0x011f, B:39:0x0125, B:41:0x0134, B:43:0x013a, B:54:0x0130, B:45:0x0142, B:49:0x014c, B:55:0x0157, B:60:0x0161, B:64:0x0681, B:65:0x0685, B:66:0x0696, B:68:0x019d, B:70:0x01a1, B:72:0x01ab, B:74:0x01b1, B:76:0x01bf, B:77:0x01cb, B:79:0x01cf, B:82:0x01da, B:84:0x01e9, B:89:0x0209, B:92:0x021f, B:93:0x0227, B:95:0x0238, B:97:0x023e, B:100:0x0246, B:101:0x024c, B:103:0x025b, B:105:0x0266, B:107:0x026b, B:109:0x026f, B:110:0x0276, B:112:0x027a, B:115:0x0284, B:117:0x028a, B:119:0x02cc, B:122:0x0323, B:125:0x0340, B:127:0x0357, B:129:0x0366, B:132:0x039c, B:135:0x03c0, B:137:0x03ca, B:142:0x03d9, B:143:0x03de, B:145:0x03e6, B:150:0x03ef, B:155:0x0400, B:157:0x0417, B:159:0x0425, B:161:0x0432, B:163:0x0450, B:164:0x0452, B:165:0x0456, B:176:0x048a, B:177:0x048c, B:182:0x04b2, B:183:0x04cc, B:186:0x04d4, B:187:0x04d8, B:205:0x052c, B:287:0x06b0, B:212:0x0540, B:216:0x059a, B:218:0x05a0, B:220:0x05a6, B:222:0x05aa, B:226:0x0623, B:229:0x05be, B:231:0x05ce, B:233:0x05d4, B:235:0x05d8, B:237:0x061f, B:238:0x05e0, B:239:0x05e3, B:251:0x04c7, B:252:0x04c4, B:258:0x04ca, B:259:0x04aa, B:260:0x0481, B:261:0x0484, B:262:0x0487, B:274:0x0467, B:275:0x046a, B:278:0x0078, B:279:0x00ca, B:280:0x005e, B:282:0x009d, B:283:0x00a3, B:284:0x0697, B:286:0x06a9), top: B:290:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0238 A[Catch: all -> 0x06b3, TryCatch #0 {, blocks: (B:291:0x000d, B:292:0x0011, B:294:0x0017, B:6:0x0027, B:7:0x0031, B:19:0x0055, B:21:0x0068, B:23:0x006c, B:25:0x0072, B:27:0x00d8, B:29:0x00dc, B:31:0x00f4, B:33:0x010a, B:35:0x0112, B:37:0x011f, B:39:0x0125, B:41:0x0134, B:43:0x013a, B:54:0x0130, B:45:0x0142, B:49:0x014c, B:55:0x0157, B:60:0x0161, B:64:0x0681, B:65:0x0685, B:66:0x0696, B:68:0x019d, B:70:0x01a1, B:72:0x01ab, B:74:0x01b1, B:76:0x01bf, B:77:0x01cb, B:79:0x01cf, B:82:0x01da, B:84:0x01e9, B:89:0x0209, B:92:0x021f, B:93:0x0227, B:95:0x0238, B:97:0x023e, B:100:0x0246, B:101:0x024c, B:103:0x025b, B:105:0x0266, B:107:0x026b, B:109:0x026f, B:110:0x0276, B:112:0x027a, B:115:0x0284, B:117:0x028a, B:119:0x02cc, B:122:0x0323, B:125:0x0340, B:127:0x0357, B:129:0x0366, B:132:0x039c, B:135:0x03c0, B:137:0x03ca, B:142:0x03d9, B:143:0x03de, B:145:0x03e6, B:150:0x03ef, B:155:0x0400, B:157:0x0417, B:159:0x0425, B:161:0x0432, B:163:0x0450, B:164:0x0452, B:165:0x0456, B:176:0x048a, B:177:0x048c, B:182:0x04b2, B:183:0x04cc, B:186:0x04d4, B:187:0x04d8, B:205:0x052c, B:287:0x06b0, B:212:0x0540, B:216:0x059a, B:218:0x05a0, B:220:0x05a6, B:222:0x05aa, B:226:0x0623, B:229:0x05be, B:231:0x05ce, B:233:0x05d4, B:235:0x05d8, B:237:0x061f, B:238:0x05e0, B:239:0x05e3, B:251:0x04c7, B:252:0x04c4, B:258:0x04ca, B:259:0x04aa, B:260:0x0481, B:261:0x0484, B:262:0x0487, B:274:0x0467, B:275:0x046a, B:278:0x0078, B:279:0x00ca, B:280:0x005e, B:282:0x009d, B:283:0x00a3, B:284:0x0697, B:286:0x06a9), top: B:290:0x000d }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.InterfaceC179467xw A05(X.InterfaceC199548s4 r45, X.InterfaceC179467xw r46, X.InterfaceC179437xt r47, X.AbstractC179397xp r48, X.InterfaceC179037xF r49, java.lang.Long r50, java.util.List r51, int r52, int r53, boolean r54, boolean r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199728sO.A05(X.8s4, X.7xw, X.7xt, X.7xp, X.7xF, java.lang.Long, java.util.List, int, int, boolean, boolean, boolean):X.7xw");
    }
}
