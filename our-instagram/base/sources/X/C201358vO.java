package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.RemoteException;
import android.view.Surface;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces.ComponentSyncListener;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl;
import com.meta.arfx.engine.interfaces.IAREngineServiceController;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.8vO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201358vO implements InterfaceC201368vP {
    public int A00;
    public Integer A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public EffectManifest A09;
    public boolean A0A;
    public final C201388vR A0B;
    public final C201378vQ A0C;
    public final Context A0D;
    public final InterfaceC201328vH A0E;
    public final C201308vE A0F;
    public final HashSet A0G;
    public final ScheduledExecutorService A0H;
    public final ScheduledExecutorService A0I;

    public C201358vO(Context context, InterfaceC201328vH interfaceC201328vH, C201308vE c201308vE, C201378vQ c201378vQ, HashSet hashSet, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        C14360o3.A0B(scheduledExecutorService2, 4);
        C14360o3.A0B(hashSet, 7);
        this.A0F = c201308vE;
        this.A0D = context;
        this.A0I = scheduledExecutorService;
        this.A0H = scheduledExecutorService2;
        this.A0E = interfaceC201328vH;
        this.A0C = c201378vQ;
        this.A0G = hashSet;
        this.A0B = new C201388vR(context, interfaceC201328vH, c201308vE, scheduledExecutorService, scheduledExecutorService2);
        this.A01 = C05F.A00;
        this.A09 = new EffectManifest();
        if (c201378vQ != null) {
            c201378vQ.A02();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:79|(16:172|(1:174)|171|89|90|92|93|(1:95)|96|(1:98)|99|(6:103|104|(4:107|(3:109|110|(3:115|116|117))(1:121)|118|105)|122|123|(4:125|(4:128|(3:130|131|132)(1:134)|133|126)|135|136))|141|41|(4:43|(1:45)|46|(1:48))|(8:56|57|(5:69|(1:71)|68|65|66)(1:61)|62|(3:64|65|66)|68|65|66))(1:84)|85|(14:87|89|90|92|93|(0)|96|(0)|99|(7:101|103|104|(1:105)|122|123|(0))|141|41|(0)|(11:50|52|54|56|57|(1:59)|69|(0)|68|65|66))|171|89|90|92|93|(0)|96|(0)|99|(0)|141|41|(0)|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0197, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0198, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a4, code lost:
    
        X.C0K8.A05(X.C201378vQ.class, "Copy rendering of input texture failed: ", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ab, code lost:
    
        if (r10 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r9.A03();
        r0 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b2, code lost:
    
        if (r0 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b4, code lost:
    
        r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b7, code lost:
    
        r2.A03 = null;
        r0 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01bb, code lost:
    
        if (r0 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01bd, code lost:
    
        r0.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r2.A01 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0223, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0224, code lost:
    
        if (r10 != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0228, code lost:
    
        r9.A03();
        r0 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x022d, code lost:
    
        if (r0 != null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x022f, code lost:
    
        r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0232, code lost:
    
        r2.A03 = null;
        r0 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0236, code lost:
    
        if (r0 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0238, code lost:
    
        r0.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x023b, code lost:
    
        r2.A01 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x023d, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x023e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x023f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x019d, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01a3, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x019a, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0104 A[Catch: 80D -> 0x0197, all -> 0x023e, TryCatch #10 {80D -> 0x0197, all -> 0x023e, blocks: (B:93:0x00f0, B:95:0x00f4, B:96:0x00f9, B:98:0x00fd, B:99:0x0100, B:101:0x0104, B:104:0x010a, B:105:0x011a, B:107:0x0120, B:110:0x0137, B:113:0x0147, B:116:0x014f, B:123:0x0153, B:125:0x0157, B:126:0x0166, B:128:0x016c, B:131:0x0178, B:136:0x017c, B:139:0x018b), top: B:92:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0120 A[Catch: RemoteException -> 0x018a, 80D -> 0x0197, all -> 0x023e, TryCatch #8 {RemoteException -> 0x018a, blocks: (B:104:0x010a, B:105:0x011a, B:107:0x0120, B:110:0x0137, B:113:0x0147, B:116:0x014f, B:123:0x0153, B:125:0x0157, B:126:0x0166, B:128:0x016c, B:131:0x0178, B:136:0x017c), top: B:103:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0157 A[Catch: RemoteException -> 0x018a, 80D -> 0x0197, all -> 0x023e, TryCatch #8 {RemoteException -> 0x018a, blocks: (B:104:0x010a, B:105:0x011a, B:107:0x0120, B:110:0x0137, B:113:0x0147, B:116:0x014f, B:123:0x0153, B:125:0x0157, B:126:0x0166, B:128:0x016c, B:131:0x0178, B:136:0x017c), top: B:103:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f4 A[Catch: 80D -> 0x0197, all -> 0x023e, TryCatch #10 {80D -> 0x0197, all -> 0x023e, blocks: (B:93:0x00f0, B:95:0x00f4, B:96:0x00f9, B:98:0x00fd, B:99:0x0100, B:101:0x0104, B:104:0x010a, B:105:0x011a, B:107:0x0120, B:110:0x0137, B:113:0x0147, B:116:0x014f, B:123:0x0153, B:125:0x0157, B:126:0x0166, B:128:0x016c, B:131:0x0178, B:136:0x017c, B:139:0x018b), top: B:92:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fd A[Catch: 80D -> 0x0197, all -> 0x023e, TryCatch #10 {80D -> 0x0197, all -> 0x023e, blocks: (B:93:0x00f0, B:95:0x00f4, B:96:0x00f9, B:98:0x00fd, B:99:0x0100, B:101:0x0104, B:104:0x010a, B:105:0x011a, B:107:0x0120, B:110:0x0137, B:113:0x0147, B:116:0x014f, B:123:0x0153, B:125:0x0157, B:126:0x0166, B:128:0x016c, B:131:0x0178, B:136:0x017c, B:139:0x018b), top: B:92:0x00f0 }] */
    @Override // X.InterfaceC201368vP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AQ2(X.C201528vh r36, java.lang.Integer r37, float[] r38, float[] r39, float[] r40, long r41, long r43, boolean r45) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201358vO.AQ2(X.8vh, java.lang.Integer, float[], float[], float[], long, long, boolean):boolean");
    }

    @Override // X.InterfaceC201368vP
    public final void Eho(int i, int i2, int i3, int i4, boolean z) {
        C201378vQ c201378vQ;
        this.A04 = i;
        this.A03 = i2;
        this.A08 = i3;
        this.A07 = i4;
        this.A0A = z;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null) {
                c201378vQ.A0C.A04(i, i2, i3, i4, z);
                return;
            }
            return;
        }
        this.A0B.Eho(i, i2, i3, i4, z);
    }

    @Override // X.InterfaceC201368vP
    public final void AHT() {
        C201378vQ c201378vQ;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null) {
                C201378vQ.A01(c201378vQ);
                AM6 am6 = c201378vQ.A0C;
                am6.A0B = C05F.A00;
                IAREngineServiceController iAREngineServiceController = am6.A0A;
                if (iAREngineServiceController != null) {
                    try {
                        iAREngineServiceController.AHT();
                        return;
                    } catch (RemoteException e) {
                        C0K8.A05(AM6.class, "cleanupServices() failed: ", e);
                        AM6.A00(am6);
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.A0B.AHT();
    }

    @Override // X.InterfaceC201368vP
    public final List ANB(AnonymousClass904 anonymousClass904) {
        C201378vQ c201378vQ = this.A0C;
        if (c201378vQ != null) {
            c201378vQ.A0D.A00 = anonymousClass904;
        }
        List ANB = this.A0B.ANB(anonymousClass904);
        C14360o3.A07(ANB);
        return ANB;
    }

    @Override // X.InterfaceC201368vP
    public final AnalyticsLogger Abc() {
        AnalyticsLogger analyticsLogger;
        C201378vQ c201378vQ = this.A0C;
        if (c201378vQ == null || (analyticsLogger = c201378vQ.A0A) == null) {
            return this.A0B.B0d().getAnalyticsLogger();
        }
        return analyticsLogger;
    }

    @Override // X.InterfaceC201368vP
    public final EffectServiceHost B0d() {
        EffectServiceHost B0d = this.A0B.B0d();
        C14360o3.A07(B0d);
        return B0d;
    }

    @Override // X.InterfaceC201368vP
    public final int B4A() {
        return C201388vR.A00(this.A0B).getFacesCount();
    }

    @Override // X.InterfaceC201368vP
    public final EffectManifest BPZ() {
        return this.A09;
    }

    @Override // X.InterfaceC201368vP
    public final boolean CKs() {
        if (this.A0B.A0D == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC201368vP
    public final void EGq() {
        C201378vQ c201378vQ = this.A0C;
        if (c201378vQ != null) {
            c201378vQ.A02();
        }
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && c201378vQ != null) {
                C201308vE c201308vE = this.A0F;
                boolean z = c201308vE.A04;
                c201378vQ.A0C.A06(c201308vE.A01, 0, z, c201308vE.A02, false);
                return;
            }
            return;
        }
        this.A0B.EGq();
    }

    @Override // X.InterfaceC201368vP
    public final void EGs() {
        C201378vQ c201378vQ;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null) {
                AM6 am6 = c201378vQ.A0C;
                Integer num = am6.A0D;
                Integer num2 = C05F.A0C;
                if (num == num2) {
                    num = C05F.A01;
                }
                am6.A0D = num;
                Integer num3 = am6.A0E;
                if (num3 == num2) {
                    num3 = C05F.A01;
                }
                am6.A0E = num3;
                Integer num4 = C05F.A00;
                am6.A0F = num4;
                am6.A0B = num4;
                am6.A0C = num4;
                IAREngineServiceController iAREngineServiceController = am6.A0A;
                if (iAREngineServiceController != null) {
                    try {
                        iAREngineServiceController.EGs();
                    } catch (RemoteException e) {
                        C0K8.A05(AM6.class, "renderSessionReleaseGl() failed: ", e);
                        AM6.A00(am6);
                    }
                }
            }
        } else {
            this.A0B.EGs();
        }
        this.A01 = C05F.A00;
    }

    @Override // X.InterfaceC201368vP
    public final void EGt(int i, int i2) {
        C201378vQ c201378vQ;
        AnonymousClass810 anonymousClass810;
        AnonymousClass812 anonymousClass812;
        this.A06 = i;
        this.A05 = i2;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null) {
                if (c201378vQ.A00 != null && (anonymousClass810 = c201378vQ.A05) != null && (anonymousClass812 = anonymousClass810.A02) != null && i == anonymousClass812.A01 && i2 == anonymousClass812.A00) {
                    return;
                }
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("AREngineOutput");
                anonymousClass811.A03 = 36197;
                anonymousClass811.A04 = i;
                anonymousClass811.A02 = i2;
                anonymousClass811.A00 = 6408;
                AnonymousClass810 anonymousClass8102 = new AnonymousClass810(anonymousClass811);
                c201378vQ.A05 = anonymousClass8102;
                SurfaceTexture surfaceTexture = new SurfaceTexture(anonymousClass8102.A00);
                c201378vQ.A00 = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(i, i2);
                SurfaceTexture surfaceTexture2 = c201378vQ.A00;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.setOnFrameAvailableListener(c201378vQ.A09);
                }
                c201378vQ.A08 = false;
                c201378vQ.A0C.A05(new Surface(c201378vQ.A00), i, i2);
                return;
            }
            return;
        }
        this.A0B.EGt(i, i2);
    }

    @Override // X.InterfaceC201368vP
    public final void EKQ() {
        C201378vQ c201378vQ;
        AM6 am6;
        IAREngineServiceController iAREngineServiceController;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null && (iAREngineServiceController = (am6 = c201378vQ.A0C).A0A) != null) {
                try {
                    iAREngineServiceController.EJd();
                    return;
                } catch (RemoteException e) {
                    C0K8.A05(AM6.class, "resetCurrentEffect() failed: ", e);
                    AM6.A00(am6);
                    return;
                }
            }
            return;
        }
        this.A0B.EKQ();
    }

    @Override // X.InterfaceC201368vP
    public final void EQq(int i) {
        C201378vQ c201378vQ;
        this.A02 = i;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null) {
                AM6 am6 = c201378vQ.A0C;
                am6.A00 = i;
                IAREngineServiceController iAREngineServiceController = am6.A0A;
                if (iAREngineServiceController != null) {
                    try {
                        iAREngineServiceController.EQq(i);
                        return;
                    } catch (RemoteException e) {
                        C0K8.A05(AM6.class, "setCameraFacing() failed: ", e);
                        AM6.A00(am6);
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.A0B.EQq(i);
    }

    @Override // X.InterfaceC201368vP
    public final void EQx(int i, int i2, int i3, int i4) {
        C201378vQ c201378vQ;
        AnonymousClass812 anonymousClass812;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null) {
                AnonymousClass810 anonymousClass810 = c201378vQ.A04;
                if (anonymousClass810 != null && i == anonymousClass810.A00 && i2 == anonymousClass810.A01 && (anonymousClass812 = anonymousClass810.A02) != null && i3 == anonymousClass812.A01 && i4 == anonymousClass812.A00) {
                    return;
                }
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("CameraTexture");
                anonymousClass811.A03 = i2;
                anonymousClass811.A04 = i3;
                anonymousClass811.A02 = i4;
                anonymousClass811.A00 = 6408;
                anonymousClass811.A01 = i;
                c201378vQ.A04 = new AnonymousClass810(anonymousClass811);
                return;
            }
            return;
        }
        this.A0B.EQx(i, i2, i3, i4);
    }

    @Override // X.InterfaceC201368vP
    public final void EoW() {
        C201378vQ c201378vQ;
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue == 2 && (c201378vQ = this.A0C) != null) {
                C201378vQ.A01(c201378vQ);
                AM6 am6 = c201378vQ.A0C;
                am6.A0B = C05F.A00;
                am6.A0c.clear();
                IAREngineServiceController iAREngineServiceController = am6.A0A;
                if (iAREngineServiceController != null) {
                    try {
                        iAREngineServiceController.EoW();
                        return;
                    } catch (RemoteException e) {
                        C0K8.A05(AM6.class, "stopEffect() failed: ", e);
                        AM6.A00(am6);
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.A0B.EoW();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
    
        if (r2 != null) goto L32;
     */
    @Override // X.InterfaceC201368vP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FB3(X.AXC r35, int r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201358vO.FB3(X.AXC, int, boolean):void");
    }

    public final void finalize() {
        C201378vQ c201378vQ = this.A0C;
        if (c201378vQ != null) {
            c201378vQ.finalize();
        }
        C201388vR.A01(this.A0B);
    }

    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, X.BBY] */
    @Override // X.InterfaceC201368vP
    public final void ETd(AsyncAssetFetcher asyncAssetFetcher, ProductFeatureConfig productFeatureConfig, EnumC150616qF enumC150616qF, ComponentSyncListener componentSyncListener, C201528vh c201528vh, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(enumC150616qF, 5);
        C14360o3.A0B(list, 8);
        C14360o3.A0B(c201528vh, 12);
        EffectManifest createFromDir = EffectManifest.createFromDir(str6);
        this.A09 = createFromDir;
        Integer num = C05F.A01;
        C201378vQ c201378vQ = this.A0C;
        if (c201378vQ != null) {
            List enabledCapabilities = createFromDir.getEnabledCapabilities();
            C14360o3.A07(enabledCapabilities);
            if (this.A0G.containsAll(enabledCapabilities)) {
                num = C05F.A0C;
            }
        }
        if (num != this.A01) {
            EGs();
            this.A01 = num;
            EGt(this.A06, this.A05);
            EGq();
            Eho(this.A04, this.A03, this.A08, this.A07, this.A0A);
            EQq(this.A02);
            int i = this.A00;
            this.A00 = i;
            int intValue = this.A01.intValue();
            if (intValue != 1) {
                if (intValue == 2 && c201378vQ != null) {
                    AM6 am6 = c201378vQ.A0C;
                    am6.A01 = i;
                    IAREngineServiceController iAREngineServiceController = am6.A0A;
                    if (iAREngineServiceController != null) {
                        try {
                            iAREngineServiceController.EQv(i);
                        } catch (RemoteException e) {
                            C0K8.A05(AM6.class, "setCameraSensorRotation() failed: ", e);
                            AM6.A00(am6);
                        }
                    }
                }
            } else {
                C201388vR.A00(this.A0B).setCameraSensorRotation(i);
            }
        }
        int intValue2 = this.A01.intValue();
        if (intValue2 == 1) {
            this.A0B.ETd(asyncAssetFetcher, productFeatureConfig, enumC150616qF, null, c201528vh, str, str2, str3, str4, str5, str6, list, true);
            return;
        }
        if (intValue2 != 2 || c201378vQ == null) {
            return;
        }
        int i2 = enumC150616qF.A00;
        int i3 = c201528vh.A00.A00;
        EffectManifest effectManifest = this.A09;
        C22906A8b c22906A8b = c201378vQ.A0D;
        Map map = c22906A8b.A02;
        map.clear();
        map.put(12, new C23339AWj());
        map.put(38, new Object());
        if (effectManifest != null) {
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0Q)) {
                map.put(24, new C24223Aop());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0y)) {
                map.put(58, new C24222Aoo());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0m)) {
                map.put(46, new C24218Aok());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0d)) {
                map.put(37, new Object());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0r)) {
                map.put(51, new AWT());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0V)) {
                map.put(29, new C24225Aor());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0O)) {
                map.put(22, new Object());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A1V)) {
                map.put(22, new C23349AWy());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A1f)) {
                map.put(22, new Object());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A14)) {
                map.put(64, new C24226Aos(new NetworkClientImpl(new Object())));
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A17)) {
                map.put(67, new AWW());
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0Y)) {
                map.put(32, new Object());
            }
        }
        List list2 = c22906A8b.A01;
        list2.clear();
        if (effectManifest != null) {
            if (effectManifest.getServiceNeeded(EnumC150506pz.A1c)) {
                EnumC27091Ti enumC27091Ti = EnumC27091Ti.A04;
                list2.add("arservicesforwolf");
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A1X)) {
                EnumC27091Ti enumC27091Ti2 = EnumC27091Ti.A04;
                list2.add("arservicesforunifiedtargettracking");
                list2.add("slam");
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0X)) {
                EnumC27091Ti enumC27091Ti3 = EnumC27091Ti.A04;
                list2.add(C150666qM.PYTORCH_VOLTRON_MODULE_NAME);
                list2.add("arservicesforgenericml");
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0N)) {
                EnumC27091Ti enumC27091Ti4 = EnumC27091Ti.A04;
                list2.add(C150666qM.PYTORCH_VOLTRON_MODULE_NAME);
                list2.add("arservicesforexpressionfitting");
            }
            if (effectManifest.getServiceNeeded(EnumC150506pz.A0c)) {
                EnumC27091Ti enumC27091Ti5 = EnumC27091Ti.A04;
                list2.add(C150666qM.PYTORCH_VOLTRON_MODULE_NAME);
                list2.add("arservicesforhandtracking");
                map.put(36, new Object());
            }
            EnumC150506pz enumC150506pz = EnumC150506pz.A0a;
            if (effectManifest.getServiceNeeded(enumC150506pz)) {
                EnumC27091Ti enumC27091Ti6 = EnumC27091Ti.A04;
                list2.add(C150666qM.PYTORCH_VOLTRON_MODULE_NAME);
                list2.add("arservicesforhairsegmentation");
                map.put(34, new C24221Aon(enumC150506pz));
            }
            EnumC150506pz enumC150506pz2 = EnumC150506pz.A15;
            if (effectManifest.getServiceNeeded(enumC150506pz2)) {
                EnumC27091Ti enumC27091Ti7 = EnumC27091Ti.A04;
                list2.add(C150666qM.PYTORCH_VOLTRON_MODULE_NAME);
                list2.add("arservicesforpersonsegmentation");
                map.put(65, new C24227Aot(enumC150506pz2));
            }
            EnumC150506pz enumC150506pz3 = EnumC150506pz.A09;
            if (effectManifest.getServiceNeeded(enumC150506pz3)) {
                EnumC27091Ti enumC27091Ti8 = EnumC27091Ti.A04;
                list2.add(C150666qM.PYTORCH_VOLTRON_MODULE_NAME);
                list2.add("arservicesforbodytracking");
                map.put(7, new C24227Aot(enumC150506pz3));
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((BE4) it.next()).CO6(c22906A8b.A00);
        }
        c201378vQ.A0C.A08(str, str2, str3, str5, str4, str6, i2, i3, true);
    }
}
