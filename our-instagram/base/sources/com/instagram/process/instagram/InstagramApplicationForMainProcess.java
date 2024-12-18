package com.instagram.process.instagram;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC12280kW;
import X.AbstractC12960li;
import X.AbstractC16960so;
import X.AbstractC19730y1;
import X.AbstractC20100yh;
import X.AbstractC58327PtK;
import X.C02690At;
import X.C02750Az;
import X.C02880Bm;
import X.C02890Bn;
import X.C02980Bw;
import X.C03010Bz;
import X.C03020Cd;
import X.C03030Ce;
import X.C03050Cg;
import X.C03070Ci;
import X.C03080Cj;
import X.C03090Ck;
import X.C03100Cl;
import X.C03110Cm;
import X.C03120Cn;
import X.C03130Co;
import X.C03140Cp;
import X.C03500Hk;
import X.C03510Hl;
import X.C03520Hm;
import X.C03530Ho;
import X.C03550Hr;
import X.C03560Hs;
import X.C03570Hu;
import X.C03580Hw;
import X.C03630Ib;
import X.C03660Ie;
import X.C03670Ig;
import X.C03690Ik;
import X.C03700Il;
import X.C03710Im;
import X.C03780It;
import X.C03790Iu;
import X.C03810Iw;
import X.C03900Jf;
import X.C03910Jg;
import X.C03930Ji;
import X.C03940Jj;
import X.C03980Jo;
import X.C04000Jq;
import X.C04010Jr;
import X.C04080Jz;
import X.C04110Kc;
import X.C04120Ke;
import X.C04180Kk;
import X.C04250Kr;
import X.C05F;
import X.C08750cd;
import X.C0B6;
import X.C0BL;
import X.C0BM;
import X.C0BN;
import X.C0BP;
import X.C0C0;
import X.C0CG;
import X.C0CL;
import X.C0CO;
import X.C0D1;
import X.C0DK;
import X.C0DY;
import X.C0DZ;
import X.C0E5;
import X.C0E6;
import X.C0E7;
import X.C0E8;
import X.C0GT;
import X.C0Gb;
import X.C0Gc;
import X.C0Gi;
import X.C0Gw;
import X.C0HK;
import X.C0HL;
import X.C0IA;
import X.C0IB;
import X.C0IC;
import X.C0ID;
import X.C0IF;
import X.C0IN;
import X.C0IO;
import X.C0IU;
import X.C0IV;
import X.C0IW;
import X.C0JF;
import X.C0JI;
import X.C0Jl;
import X.C0KI;
import X.C0KJ;
import X.C0KK;
import X.C0KS;
import X.C0KU;
import X.C0KZ;
import X.C0L0;
import X.C11X;
import X.C12210kP;
import X.C14360o3;
import X.C17090t4;
import X.C18720vz;
import X.C18920wW;
import X.C18C;
import X.C19760y5;
import X.C1H6;
import X.C1Q2;
import X.C20150ym;
import X.C211011m;
import X.C211211o;
import X.C218914p;
import X.C2W4;
import X.C41451vu;
import X.C55823OqZ;
import X.C58325PtI;
import X.EnumC09460dv;
import X.InterfaceC02590Ai;
import X.InterfaceC07710an;
import X.InterfaceC09390do;
import X.InterfaceC19610xo;
import X.InterfaceC211111n;
import X.S5A;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import android.view.Choreographer;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* loaded from: classes.dex */
public final class InstagramApplicationForMainProcess extends AbstractC12280kW implements InterfaceC07710an {
    public static final C19760y5 Companion = new Object();
    public static boolean instanceAlreadyCreated;
    public final Context appContext;
    public final Choreographer choreographer;
    public boolean enableLazySpInit;

    @Override // X.AbstractC12280kW
    public SharedPreferences getSharedPreferences(String str, int i) {
        C14360o3.A0B(str, 0);
        if (this.enableLazySpInit) {
            Context context = this.appContext;
            C14360o3.A0C(context, "null cannot be cast to non-null type android.content.ContextWrapper");
            return S5A.A00((ContextWrapper) context, str, i);
        }
        return super.getSharedPreferences(str, i);
    }

    @Override // X.AbstractC12280kW
    public void onConfigurationChangedCallback(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        if (AbstractC58327PtK.A09()) {
            AbstractC58327PtK.A05(new C02690At(this, configuration));
        } else {
            onConfigurationChangedCallback$doJob(this, configuration);
        }
    }

    @Override // X.AbstractC12280kW
    public void onCreate(String str, long j, long j2, long j3, long j4) {
        C14360o3.A0B(str, 0);
        AbstractC12280kW._processName = str;
        this.enableLazySpInit = C20150ym.A07(AbstractC20100yh.A00(36314103111551432L));
        if (C20150ym.A07(AbstractC20100yh.A00(36322276430129256L))) {
            AbstractC58327PtK.A02();
        }
        scheduleInitializers(j, j2, j3, j4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramApplicationForMainProcess(Context context) {
        super(context);
        C14360o3.A0D(context, "appContext");
        this.appContext = context;
        this.choreographer = Choreographer.getInstance();
        C19760y5.A00(Companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0092, code lost:
    
        if ((r3.lastModified() / 1000) < (r8.getPackageManager().getPackageInfo(r8.getPackageName(), 0).lastUpdateTime / 1000)) goto L20;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.11l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initializeAllColdStartJobs(long r20, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.process.instagram.InstagramApplicationForMainProcess.initializeAllColdStartJobs(long, long, long, long):void");
    }

    private final void maybeInitialize(C211211o c211211o, boolean z) {
        if (z) {
            c211211o.A00().A03();
        }
    }

    private final void scheduleInitializers(final long j, final long j2, final long j3, final long j4) {
        C08750cd c08750cd = C08750cd.A04;
        if (c08750cd.A02() && C20150ym.A07(AbstractC20100yh.A00(36322276429277287L))) {
            C58325PtI.A02();
            c08750cd.A01();
            AbstractC58327PtK.A01();
            final int threadPriority = Process.getThreadPriority(Process.myTid());
            new Thread(new Runnable(this) { // from class: X.0y6
                public final /* synthetic */ InstagramApplicationForMainProcess A05;

                {
                    this.A05 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(threadPriority - 2);
                    InstagramApplicationForMainProcess instagramApplicationForMainProcess = this.A05;
                    instagramApplicationForMainProcess.initializeAllColdStartJobs(j, j2, j3, j4);
                    AbstractC58327PtK.A04(instagramApplicationForMainProcess.appContext);
                }
            }).start();
            return;
        }
        initializeAllColdStartJobs(j, j2, j3, j4);
        AbstractC58327PtK.A04(this.appContext);
    }

    @Override // X.InterfaceC07710an
    public Resources getOverridingResources() {
        if (C11X.A01) {
            C11X c11x = C11X.A00;
            C18C.A07(c11x, "Must call setInstance() first");
            return c11x.A01();
        }
        return null;
    }

    public static final void onConfigurationChangedCallback$doJob(InstagramApplicationForMainProcess instagramApplicationForMainProcess, Configuration configuration) {
        Integer num;
        C1Q2.A04();
        int i = configuration.uiMode & 48;
        Context applicationContext = instagramApplicationForMainProcess.appContext.getApplicationContext();
        int i2 = C1H6.A00().getInt("KEY_CONFIG_UI_MODE", -1);
        if (i != i2) {
            C18720vz c18720vz = AbstractC12960li.A00;
            if (AbstractC19730y1.A00(c18720vz).A00() == -1) {
                InterfaceC19610xo ARD = C1H6.A00().ARD();
                ARD.E7D("KEY_CONFIG_CURRENT_SYSTEM_UI_MODE", i);
                ARD.apply();
                if (i != 16 && (i == 32 || i2 == 32)) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                C1H6.A01(applicationContext);
                C41451vu.A01.A01(new C2W4(applicationContext));
                InterfaceC19610xo ARD2 = C1H6.A00().ARD();
                ARD2.E7D("KEY_CONFIG_UI_MODE", i);
                ARD2.apply();
                C18920wW A00 = new C12210kP(c18720vz).A00();
                InterfaceC02590Ai A002 = A00.A00(A00.A00, "dark_mode_os_toggled");
                if (A002.isSampled()) {
                    boolean z = false;
                    if (num == C05F.A01) {
                        z = true;
                    }
                    A002.A7v("is_dark_mode", Boolean.valueOf(z));
                    A002.A7v("is_backgrounded", Boolean.valueOf(C218914p.A08()));
                    A002.Cht();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [X.11q, java.lang.Object] */
    private final List getAllColdStartJobs(long j, long j2, long j3, long j4, boolean z) {
        InterfaceC211111n interfaceC211111n;
        boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36328057457491041L));
        boolean A072 = C20150ym.A07(AbstractC20100yh.A00(36328057457425504L));
        if (C20150ym.A07(AbstractC20100yh.A00(36329977305776737L))) {
            int A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36611452282542358L));
            if (A01 == 1) {
                interfaceC211111n = new InterfaceC211111n() { // from class: X.51X
                    @Override // X.InterfaceC211111n
                    public final int[] Awl(int i) {
                        int[] iArr;
                        int i2 = 66;
                        switch (i) {
                            case 0:
                                return new int[0];
                            case 1:
                                return new int[]{0};
                            case 2:
                                return new int[]{1};
                            case 3:
                                iArr = new int[1];
                                i2 = 2;
                                break;
                            case 4:
                                iArr = new int[1];
                                i2 = 107;
                                break;
                            case 5:
                                iArr = new int[1];
                                i2 = 4;
                                break;
                            case 6:
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            case 14:
                            case 21:
                            case 23:
                            case 27:
                            case 28:
                            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 40:
                            case 45:
                            case 49:
                            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                            case 62:
                            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                            case 65:
                            case 68:
                            case 77:
                            case 87:
                            case 88:
                            case 94:
                            case 97:
                            case 98:
                            case 101:
                            case 105:
                            case 109:
                            default:
                                return new int[]{61};
                            case 7:
                                iArr = new int[1];
                                i2 = 115;
                                break;
                            case 8:
                                iArr = new int[1];
                                i2 = 7;
                                break;
                            case 9:
                                iArr = new int[1];
                                i2 = 8;
                                break;
                            case 10:
                                iArr = new int[1];
                                i2 = 9;
                                break;
                            case 11:
                                iArr = new int[1];
                                i2 = 10;
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                iArr = new int[1];
                                i2 = 11;
                                break;
                            case com.facebook.forker.Process.SIGTERM /* 15 */:
                                iArr = new int[1];
                                i2 = 44;
                                break;
                            case 16:
                                iArr = new int[1];
                                i2 = 15;
                                break;
                            case 17:
                                iArr = new int[1];
                                i2 = 16;
                                break;
                            case 18:
                                iArr = new int[1];
                                i2 = 75;
                                break;
                            case com.facebook.forker.Process.SIGSTOP /* 19 */:
                                iArr = new int[1];
                                i2 = 96;
                                break;
                            case 20:
                                iArr = new int[1];
                                i2 = 38;
                                break;
                            case 22:
                                iArr = new int[1];
                                i2 = 48;
                                break;
                            case 24:
                                iArr = new int[1];
                                i2 = 108;
                                break;
                            case 25:
                                iArr = new int[1];
                                i2 = 72;
                                break;
                            case 26:
                                iArr = new int[1];
                                i2 = 85;
                                break;
                            case 36:
                                iArr = new int[1];
                                i2 = 53;
                                break;
                            case 37:
                                iArr = new int[1];
                                i2 = 64;
                                break;
                            case 38:
                                iArr = new int[1];
                                i2 = 47;
                                break;
                            case 39:
                                iArr = new int[1];
                                i2 = 52;
                                break;
                            case Seq.NULL_REFNUM /* 41 */:
                                iArr = new int[1];
                                i2 = 59;
                                break;
                            case Seq.RefTracker.REF_OFFSET /* 42 */:
                                iArr = new int[1];
                                i2 = 24;
                                break;
                            case 43:
                                iArr = new int[1];
                                i2 = 51;
                                break;
                            case 44:
                                iArr = new int[1];
                                i2 = 12;
                                break;
                            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                                iArr = new int[1];
                                i2 = 69;
                                break;
                            case 47:
                                iArr = new int[1];
                                i2 = 25;
                                break;
                            case 48:
                                iArr = new int[1];
                                i2 = 95;
                                break;
                            case 51:
                                iArr = new int[1];
                                i2 = 70;
                                break;
                            case 52:
                                iArr = new int[1];
                                i2 = 81;
                                break;
                            case 53:
                                iArr = new int[1];
                                i2 = 43;
                                break;
                            case 54:
                                iArr = new int[1];
                                i2 = 71;
                                break;
                            case 55:
                                iArr = new int[1];
                                i2 = 56;
                                break;
                            case 56:
                                iArr = new int[1];
                                i2 = 93;
                                break;
                            case 57:
                                iArr = new int[1];
                                i2 = 19;
                                break;
                            case 58:
                                iArr = new int[1];
                                i2 = 102;
                                break;
                            case 59:
                                iArr = new int[1];
                                i2 = 46;
                                break;
                            case 60:
                                iArr = new int[1];
                                i2 = 41;
                                break;
                            case 61:
                            case 116:
                                iArr = new int[1];
                                break;
                            case 64:
                                iArr = new int[1];
                                i2 = 91;
                                break;
                            case 66:
                                iArr = new int[1];
                                i2 = 100;
                                break;
                            case 67:
                                iArr = new int[1];
                                i2 = 90;
                                break;
                            case 69:
                                iArr = new int[1];
                                i2 = 89;
                                break;
                            case 70:
                                iArr = new int[1];
                                i2 = 58;
                                break;
                            case 71:
                                iArr = new int[1];
                                i2 = 55;
                                break;
                            case 72:
                                iArr = new int[1];
                                i2 = 74;
                                break;
                            case 73:
                                iArr = new int[1];
                                i2 = 82;
                                break;
                            case 74:
                                iArr = new int[1];
                                i2 = 103;
                                break;
                            case 75:
                                iArr = new int[1];
                                i2 = 78;
                                break;
                            case 76:
                                iArr = new int[1];
                                i2 = 86;
                                break;
                            case 78:
                                iArr = new int[1];
                                i2 = 111;
                                break;
                            case 79:
                                iArr = new int[1];
                                i2 = 80;
                                break;
                            case 80:
                                iArr = new int[1];
                                i2 = 23;
                                break;
                            case 81:
                                iArr = new int[1];
                                i2 = 60;
                                break;
                            case 82:
                                iArr = new int[1];
                                i2 = 67;
                                break;
                            case 83:
                                iArr = new int[1];
                                i2 = 106;
                                break;
                            case 84:
                                iArr = new int[1];
                                i2 = 73;
                                break;
                            case 85:
                                iArr = new int[1];
                                i2 = 84;
                                break;
                            case 86:
                                iArr = new int[1];
                                i2 = 39;
                                break;
                            case 89:
                                iArr = new int[1];
                                i2 = 99;
                                break;
                            case 90:
                                iArr = new int[1];
                                i2 = 92;
                                break;
                            case 91:
                                iArr = new int[1];
                                i2 = 112;
                                break;
                            case 92:
                                iArr = new int[1];
                                i2 = 83;
                                break;
                            case 93:
                                iArr = new int[1];
                                i2 = 79;
                                break;
                            case 95:
                                iArr = new int[1];
                                i2 = 57;
                                break;
                            case 96:
                                iArr = new int[1];
                                i2 = 104;
                                break;
                            case 99:
                                iArr = new int[1];
                                i2 = 54;
                                break;
                            case 100:
                                iArr = new int[1];
                                i2 = 42;
                                break;
                            case 102:
                                iArr = new int[1];
                                i2 = 26;
                                break;
                            case 103:
                                iArr = new int[1];
                                i2 = 114;
                                break;
                            case 104:
                                iArr = new int[1];
                                i2 = 37;
                                break;
                            case 106:
                                iArr = new int[1];
                                i2 = 76;
                                break;
                            case 107:
                                iArr = new int[1];
                                i2 = 3;
                                break;
                            case 108:
                                iArr = new int[1];
                                i2 = 22;
                                break;
                            case 110:
                                iArr = new int[1];
                                i2 = 17;
                                break;
                            case 111:
                                iArr = new int[1];
                                i2 = 110;
                                break;
                            case 112:
                                iArr = new int[1];
                                i2 = 20;
                                break;
                            case 113:
                                iArr = new int[1];
                                i2 = 5;
                                break;
                            case 114:
                                iArr = new int[1];
                                i2 = 18;
                                break;
                            case 115:
                                iArr = new int[1];
                                i2 = 113;
                                break;
                        }
                        iArr[0] = i2;
                        return iArr;
                    }
                };
            } else if (A01 != 2) {
                interfaceC211111n = new InterfaceC211111n() { // from class: X.54f
                    @Override // X.InterfaceC211111n
                    public final int[] Awl(int i) {
                        int[] iArr;
                        int i2 = 66;
                        switch (i) {
                            case 0:
                                return new int[0];
                            case 1:
                                return new int[]{0};
                            case 2:
                                return new int[]{1};
                            case 3:
                                iArr = new int[1];
                                i2 = 2;
                                break;
                            case 4:
                                iArr = new int[1];
                                i2 = 107;
                                break;
                            case 5:
                                iArr = new int[1];
                                i2 = 4;
                                break;
                            case 7:
                            case 113:
                                return new int[]{5};
                            case 8:
                                iArr = new int[1];
                                i2 = 7;
                                break;
                            case 9:
                                iArr = new int[1];
                                i2 = 8;
                                break;
                            case 10:
                                iArr = new int[1];
                                i2 = 9;
                                break;
                            case 11:
                                iArr = new int[1];
                                i2 = 10;
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                iArr = new int[1];
                                i2 = 11;
                                break;
                            case com.facebook.forker.Process.SIGTERM /* 15 */:
                                iArr = new int[1];
                                i2 = 44;
                                break;
                            case 16:
                                iArr = new int[1];
                                i2 = 15;
                                break;
                            case 17:
                                iArr = new int[1];
                                i2 = 16;
                                break;
                            case 18:
                                iArr = new int[1];
                                i2 = 75;
                                break;
                            case com.facebook.forker.Process.SIGSTOP /* 19 */:
                                iArr = new int[1];
                                i2 = 96;
                                break;
                            case 20:
                                iArr = new int[1];
                                i2 = 38;
                                break;
                            case 22:
                                iArr = new int[1];
                                i2 = 48;
                                break;
                            case 23:
                                iArr = new int[1];
                                i2 = 61;
                                break;
                            case 24:
                                iArr = new int[1];
                                i2 = 108;
                                break;
                            case 25:
                                iArr = new int[1];
                                i2 = 72;
                                break;
                            case 37:
                                iArr = new int[1];
                                i2 = 64;
                                break;
                            case 38:
                                iArr = new int[1];
                                i2 = 47;
                                break;
                            case Seq.RefTracker.REF_OFFSET /* 42 */:
                                iArr = new int[1];
                                i2 = 24;
                                break;
                            case 44:
                                iArr = new int[1];
                                i2 = 12;
                                break;
                            case 47:
                                iArr = new int[1];
                                i2 = 25;
                                break;
                            case 48:
                                iArr = new int[1];
                                i2 = 95;
                                break;
                            case 51:
                            case 66:
                                return new int[]{100};
                            case 57:
                                iArr = new int[1];
                                i2 = 19;
                                break;
                            case 61:
                            case 116:
                                iArr = new int[1];
                                break;
                            case 64:
                                iArr = new int[1];
                                i2 = 91;
                                break;
                            case 72:
                                iArr = new int[1];
                                i2 = 74;
                                break;
                            case 74:
                                iArr = new int[1];
                                i2 = 103;
                                break;
                            case 75:
                                iArr = new int[1];
                                i2 = 78;
                                break;
                            case 78:
                                iArr = new int[1];
                                i2 = 111;
                                break;
                            case 79:
                                iArr = new int[1];
                                i2 = 80;
                                break;
                            case 80:
                                iArr = new int[1];
                                i2 = 23;
                                break;
                            case 91:
                                iArr = new int[1];
                                i2 = 112;
                                break;
                            case 93:
                                iArr = new int[1];
                                i2 = 79;
                                break;
                            case 95:
                                iArr = new int[1];
                                i2 = 57;
                                break;
                            case 96:
                                iArr = new int[1];
                                i2 = 104;
                                break;
                            case 100:
                                iArr = new int[1];
                                i2 = 42;
                                break;
                            case 103:
                                iArr = new int[1];
                                i2 = 114;
                                break;
                            case 104:
                                iArr = new int[1];
                                i2 = 37;
                                break;
                            case 107:
                                iArr = new int[1];
                                i2 = 3;
                                break;
                            case 108:
                                iArr = new int[1];
                                i2 = 22;
                                break;
                            case 110:
                                iArr = new int[1];
                                i2 = 17;
                                break;
                            case 111:
                                iArr = new int[1];
                                i2 = 110;
                                break;
                            case 112:
                                iArr = new int[1];
                                i2 = 20;
                                break;
                            case 114:
                                iArr = new int[1];
                                i2 = 18;
                                break;
                            case 115:
                                iArr = new int[1];
                                i2 = 113;
                                break;
                            default:
                                return new int[]{93};
                        }
                        iArr[0] = i2;
                        return iArr;
                    }
                };
            } else {
                interfaceC211111n = new C55823OqZ();
            }
        } else {
            interfaceC211111n = C211011m.A00;
        }
        InterfaceC211111n interfaceC211111n2 = interfaceC211111n;
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        C17090t4 c17090t4 = new C17090t4();
        C211211o c211211o = new C211211o(interfaceC211111n2, new C04080Jz(this), 1);
        C211211o c211211o2 = new C211211o(interfaceC211111n2, C03940Jj.A00, 2);
        C211211o c211211o3 = new C211211o(interfaceC211111n2, new C0HK(A07), 3);
        C211211o c211211o4 = new C211211o(interfaceC211111n2, new C0Gw(A07), 110);
        C211211o c211211o5 = new C211211o(interfaceC211111n2, new C0KS(this), 116);
        ?? obj = new Object();
        C211211o c211211o6 = new C211211o(interfaceC211111n2, C0KZ.A00, 0);
        C211211o c211211o7 = new C211211o(interfaceC211111n2, new C03780It(obj, this), 107);
        C211211o c211211o8 = new C211211o(interfaceC211111n2, new C0C0(now), 4);
        if (z) {
            c211211o6.A00().A03();
            c211211o.A00().A03();
            c211211o2.A00().A03();
            c211211o3.A00().A03();
            c211211o5.A00().A03();
            c211211o7.A00().A03();
            c211211o8.A00().A03();
        }
        C211211o c211211o9 = new C211211o(interfaceC211111n2, new C03030Ce(this, c17090t4), 5);
        if (z) {
            c211211o9.A00().A03();
        }
        C211211o c211211o10 = new C211211o(interfaceC211111n2, C0IA.A00, 7);
        if (z) {
            c211211o10.A00().A03();
        }
        C211211o c211211o11 = new C211211o(interfaceC211111n2, C0IB.A00, 8);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C0IC(c211211o11));
        if (z) {
            c211211o11.A00().A03();
        }
        C211211o c211211o12 = new C211211o(interfaceC211111n2, new C0IF(A00), 9);
        if (z) {
            c211211o12.A00().A03();
        }
        C211211o c211211o13 = new C211211o(interfaceC211111n2, new C0CL(A00), 10);
        if (z) {
            c211211o13.A00().A03();
        }
        C211211o c211211o14 = new C211211o(interfaceC211111n2, new C03120Cn(c211211o9, this, A00), 11);
        if (z) {
            c211211o14.A00().A03();
        }
        C211211o c211211o15 = new C211211o(interfaceC211111n2, new C03010Bz(this, c17090t4, A00), 12);
        if (z) {
            c211211o15.A00().A03();
        }
        C211211o c211211o16 = new C211211o(interfaceC211111n2, new C03980Jo(this), 44);
        if (z) {
            c211211o16.A00().A03();
        }
        C211211o c211211o17 = new C211211o(interfaceC211111n2, new C0BP(c211211o9, A072), 15);
        C211211o c211211o18 = new C211211o(interfaceC211111n2, new C0BN(c211211o9, A072), 111);
        if (z) {
            c211211o17.A00().A03();
        }
        C211211o c211211o19 = new C211211o(interfaceC211111n2, new C03660Ie(c211211o9, c211211o16, this, A00), 16);
        if (z) {
            c211211o19.A00().A03();
        }
        C211211o c211211o20 = new C211211o(interfaceC211111n2, new C03790Iu(c211211o9, this), 17);
        if (z) {
            c211211o20.A00().A03();
        }
        C211211o c211211o21 = new C211211o(interfaceC211111n2, new C0IO(this), 60);
        C211211o c211211o22 = new C211211o(interfaceC211111n2, new C04120Ke(c211211o9, this, j, j2, j3, j4, now), 25);
        C211211o c211211o23 = new C211211o(interfaceC211111n2, new C03130Co(c211211o9, this), 89);
        C211211o c211211o24 = new C211211o(interfaceC211111n2, new C0KI(c211211o9, this), 41);
        C211211o c211211o25 = new C211211o(interfaceC211111n2, new C0ID(c211211o9, this), 66);
        C211211o c211211o26 = new C211211o(interfaceC211111n2, new C0JF(this), 47);
        C211211o c211211o27 = new C211211o(interfaceC211111n2, new C0E8(c211211o9), 78);
        C211211o c211211o28 = new C211211o(interfaceC211111n2, new C0Gb(c211211o9), 75);
        C211211o c211211o29 = new C211211o(interfaceC211111n2, new C03110Cm(c211211o9, c211211o16, c211211o11, this), 18);
        C211211o c211211o30 = new C211211o(interfaceC211111n2, new C0BM(c211211o29), 103);
        C211211o c211211o31 = new C211211o(interfaceC211111n2, new C0Gc(c211211o29), 74);
        C211211o c211211o32 = new C211211o(interfaceC211111n2, new C03100Cl(c211211o29), 19);
        C211211o c211211o33 = new C211211o(interfaceC211111n2, new C04180Kk(this), 24);
        C211211o c211211o34 = new C211211o(interfaceC211111n2, new C0CO(c211211o9, this), 95);
        C211211o c211211o35 = new C211211o(interfaceC211111n2, new C03810Iw(c211211o9), 48);
        C211211o c211211o36 = new C211211o(interfaceC211111n2, new C0L0(c211211o9), 22);
        C211211o c211211o37 = new C211211o(interfaceC211111n2, new C04250Kr(c211211o9, this), 23);
        C211211o c211211o38 = new C211211o(interfaceC211111n2, new C03910Jg(c211211o9, this), 114);
        C211211o c211211o39 = new C211211o(interfaceC211111n2, new C03080Cj(c211211o9, c211211o22, this), 91);
        C211211o c211211o40 = new C211211o(interfaceC211111n2, new C0IN(c211211o9, this), 64);
        C211211o c211211o41 = new C211211o(interfaceC211111n2, new C0KJ(c211211o22, c211211o9, this), 39);
        C211211o c211211o42 = new C211211o(interfaceC211111n2, new C03070Ci(c211211o9), 108);
        C211211o c211211o43 = new C211211o(interfaceC211111n2, C0E6.A00, 80);
        C211211o c211211o44 = new C211211o(interfaceC211111n2, new C03550Hr(c211211o9, this), 71);
        C211211o c211211o45 = new C211211o(interfaceC211111n2, new C03500Hk(c211211o9, c17090t4), 56);
        C211211o c211211o46 = new C211211o(interfaceC211111n2, new C03510Hl(c211211o9, j), 55);
        C211211o c211211o47 = new C211211o(interfaceC211111n2, new C03520Hm(c211211o9), 72);
        C211211o c211211o48 = new C211211o(interfaceC211111n2, new C0IV(c211211o9, c211211o16, this), 57);
        C211211o c211211o49 = new C211211o(interfaceC211111n2, C02980Bw.A00, 99);
        C211211o c211211o50 = new C211211o(interfaceC211111n2, new C03570Hu(this), 69);
        C211211o c211211o51 = new C211211o(interfaceC211111n2, new C0IU(c211211o9, this), 59);
        C211211o c211211o52 = new C211211o(interfaceC211111n2, new C02890Bn(this), 100);
        C211211o c211211o53 = new C211211o(interfaceC211111n2, new C04000Jq(this), 43);
        C211211o c211211o54 = new C211211o(interfaceC211111n2, new C0E5(c211211o9, this), 61);
        C211211o c211211o55 = new C211211o(interfaceC211111n2, new C03020Cd(c211211o9, this, c17090t4), 93);
        C211211o c211211o56 = new C211211o(interfaceC211111n2, C02880Bm.A00, 81);
        C211211o c211211o57 = new C211211o(interfaceC211111n2, C0Jl.A00, 46);
        C211211o c211211o58 = new C211211o(interfaceC211111n2, new C0KU(this), 37);
        C211211o c211211o59 = new C211211o(interfaceC211111n2, new C0GT(this), 76);
        C211211o c211211o60 = new C211211o(interfaceC211111n2, new C04010Jr(c211211o9, this), 42);
        C211211o c211211o61 = new C211211o(interfaceC211111n2, C0Gi.A00, 106);
        C211211o c211211o62 = new C211211o(interfaceC211111n2, new C0DY(c211211o9, this), 83);
        C211211o c211211o63 = new C211211o(interfaceC211111n2, C03050Cg.A00, 92);
        C211211o c211211o64 = new C211211o(interfaceC211111n2, new C03090Ck(c211211o9), 90);
        C211211o c211211o65 = new C211211o(interfaceC211111n2, new C03710Im(obj, c211211o9, this), 20);
        C211211o c211211o66 = new C211211o(interfaceC211111n2, new C03140Cp(c211211o9), 86);
        C211211o c211211o67 = new C211211o(interfaceC211111n2, new C03580Hw(c211211o9), 67);
        C211211o c211211o68 = new C211211o(interfaceC211111n2, new C02750Az(c211211o9), 104);
        C211211o c211211o69 = new C211211o(interfaceC211111n2, new C0HL(c211211o9, this), 73);
        boolean A073 = C20150ym.A07(AbstractC20100yh.A00(36317212663616455L));
        C211211o c211211o70 = new C211211o(interfaceC211111n2, new C0JI(c211211o9, this, A073), 112);
        C211211o c211211o71 = new C211211o(interfaceC211111n2, new C0E7(c211211o9, this, A073), 79);
        C211211o c211211o72 = new C211211o(interfaceC211111n2, new C0DK(c211211o9, this, c17090t4), 84);
        C211211o c211211o73 = new C211211o(interfaceC211111n2, new C0CG(c211211o9), 96);
        C211211o c211211o74 = new C211211o(interfaceC211111n2, new C03530Ho(c211211o9), 54);
        C211211o c211211o75 = new C211211o(interfaceC211111n2, new C0D1(c211211o9, c17090t4), 85);
        C211211o c211211o76 = new C211211o(interfaceC211111n2, new C04110Kc(c211211o9, this), 26);
        C211211o c211211o77 = new C211211o(interfaceC211111n2, new C0B6(c211211o9, this), 102);
        C211211o c211211o78 = new C211211o(interfaceC211111n2, C0BL.A00, 58);
        C211211o c211211o79 = new C211211o(interfaceC211111n2, new C03670Ig(c211211o9, this), 52);
        C211211o c211211o80 = new C211211o(interfaceC211111n2, new C03690Ik(c211211o9, this), 52);
        C211211o c211211o81 = new C211211o(interfaceC211111n2, new C0KK(c211211o9), 38);
        C211211o c211211o82 = new C211211o(interfaceC211111n2, new C03560Hs(c211211o9), 70);
        C211211o c211211o83 = new C211211o(interfaceC211111n2, new C0DZ(this), 82);
        C211211o c211211o84 = new C211211o(interfaceC211111n2, new C03700Il(c211211o9, this), 51);
        C211211o c211211o85 = new C211211o(interfaceC211111n2, new C0IW(c211211o9), 53);
        C211211o c211211o86 = new C211211o(interfaceC211111n2, new C03630Ib(c211211o9), 36);
        List A1Q = AbstractC16960so.A1Q(c211211o6, c211211o, c211211o2, c211211o3, c211211o7, c211211o8, c211211o9, new C211211o(interfaceC211111n2, new C03930Ji(c211211o9), 113), new C211211o(interfaceC211111n2, new C03900Jf(c211211o9), 115), c211211o10, c211211o11, c211211o12, c211211o13, c211211o14, c211211o15, c211211o16, c211211o17, c211211o19, c211211o20);
        C211211o[] c211211oArr = new C211211o[69];
        System.arraycopy(new C211211o[]{c211211o4, c211211o18, c211211o27, c211211o28, c211211o29, c211211o38, c211211o30, c211211o31, c211211o47, c211211o22, c211211o26, c211211o81, c211211o65, c211211o70, c211211o39, c211211o40, c211211o58, c211211o68, c211211o73, c211211o32, c211211o80, c211211o48, c211211o34, c211211o35, c211211o36, c211211o42, c211211o33}, 0, c211211oArr, 0, 27);
        System.arraycopy(new C211211o[]{c211211o60, c211211o52, c211211o25, c211211o5, c211211o54, c211211o37, c211211o43, c211211o71, c211211o55, c211211o45, c211211o46, c211211o44, c211211o74, c211211o49, c211211o23, c211211o50, c211211o57, c211211o51, c211211o24, c211211o21, c211211o56, c211211o79, c211211o41, c211211o66, c211211o59, c211211o61, c211211o62}, 0, c211211oArr, 27, 27);
        System.arraycopy(new C211211o[]{c211211o63, c211211o64, c211211o67, c211211o83, c211211o69, c211211o72, c211211o75, c211211o76, c211211o77, c211211o78, c211211o82, c211211o84, c211211o53, c211211o85, c211211o86}, 0, c211211oArr, 54, 15);
        List A1Q2 = AbstractC16960so.A1Q(c211211oArr);
        return !z ? AbstractC001800i.A0S(A1Q2, A1Q) : A1Q2;
    }
}
