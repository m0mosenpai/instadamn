package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208699Ld {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final Context A05;
    public final SurfaceTexture A06;
    public final C178577wV A07;
    public final UserSession A08;
    public final Integer A09;
    public final StringBuilder A0A = AbstractC166987dD.A1C();
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static final synchronized void A03(C208699Ld c208699Ld, String str) {
        synchronized (c208699Ld) {
            StringBuilder sb = c208699Ld.A0A;
            sb.append(str);
            sb.append(":");
            sb.append(SystemClock.elapsedRealtime());
            sb.append(";");
        }
    }

    public static final C9P7 A00(C208699Ld c208699Ld) {
        String obj;
        C178577wV c178577wV = c208699Ld.A07;
        if (c178577wV.A08()) {
            return (C9P7) c178577wV.A01(C9P7.A00);
        }
        synchronized (c208699Ld) {
            obj = c208699Ld.A0A.toString();
            C14360o3.A07(obj);
        }
        AbstractC12120kG.A07("OneCameraMediaServiceWithAR get captureCoordinator when not connected", obj, null);
        return null;
    }

    private final void A01(int i, int i2) {
        C209159Mx c209159Mx;
        int i3 = this.A00 % 180;
        C9P7 A00 = A00(this);
        if (i3 == 0) {
            if (A00 != null) {
                c209159Mx = (C209159Mx) InterfaceC178207vu.A02(A00);
                c209159Mx.A03 = i;
                c209159Mx.A01 = i2;
            } else {
                return;
            }
        } else {
            if (A00 == null) {
                return;
            }
            c209159Mx = (C209159Mx) InterfaceC178207vu.A02(A00);
            c209159Mx.A03 = i2;
            c209159Mx.A01 = i;
        }
        C209159Mx.A03(c209159Mx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r4 > 2013) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C208699Ld r7) {
        /*
            int r0 = r7.A02
            float r6 = (float) r0
            int r0 = r7.A01
            float r0 = (float) r0
            float r6 = r6 / r0
            int r2 = r7.A04
            int r1 = r7.A03
            android.content.Context r0 = r7.A05
            int r4 = X.C04100Kb.A00(r0)
            r5 = 0
            r3 = 1
            int[] r2 = X.AbstractC199668sI.A00(r6, r2, r1)
            r0 = -1
            if (r4 == r0) goto L1f
            r0 = 2013(0x7dd, float:2.821E-42)
            r1 = 2
            if (r4 <= r0) goto L20
        L1f:
            r1 = 1
        L20:
            r0 = r2[r5]
            int r0 = r0 / r1
            r4 = r2[r3]
            int r4 = r4 / r1
            int[] r0 = new int[]{r0, r4}
            int r3 = r7.A02
            r2 = 0
            r1 = r0[r5]
            if (r3 >= r1) goto L36
            int r0 = r7.A01
            if (r0 >= r4) goto L36
            r2 = 1
        L36:
            java.lang.Integer r0 = r7.A09
            if (r0 == 0) goto L42
            if (r2 == 0) goto L42
            int r0 = r7.A01
            r7.A01(r3, r0)
            return
        L42:
            r7.A01(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208699Ld.A02(X.9Ld):void");
    }

    public final void A04(FilterModel filterModel) {
        String obj;
        InterfaceC199408rh interfaceC199408rh;
        C178577wV c178577wV = this.A07;
        if (c178577wV.A08()) {
            C9PE c9pe = (C9PE) c178577wV.A02(C9PE.A00);
            if (c9pe != null) {
                C9NM c9nm = (C9NM) c9pe;
                if (c9nm.A01 != filterModel && (interfaceC199408rh = c9nm.A02) != null) {
                    c9nm.A01 = filterModel;
                    c9nm.A03.A00 = interfaceC199408rh.B6U().A00(filterModel);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            obj = this.A0A.toString();
            C14360o3.A07(obj);
        }
        AbstractC12120kG.A07("OneCameraMediaServiceWithAR get filterController when not connected", obj, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.8rm] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.AZN] */
    /* JADX WARN: Type inference failed for: r15v3, types: [X.AZB] */
    public C208699Ld(Context context, C199468rn c199468rn, UserSession userSession, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        SurfaceTexture surfaceTexture;
        C198658qF c198658qF;
        C212469bF c212469bF;
        Object c199458rm;
        String A0R;
        String str2;
        this.A05 = context;
        this.A08 = userSession;
        this.A0D = z;
        this.A0H = z2;
        this.A0G = z3;
        this.A0E = z4;
        this.A0F = z5;
        this.A09 = num;
        this.A0B = z7;
        this.A0C = z8;
        if (z2) {
            surfaceTexture = new SurfaceTexture(0);
        } else {
            surfaceTexture = null;
        }
        this.A06 = surfaceTexture;
        C179107xM c179107xM = null;
        if (this.A0E) {
            Context context2 = this.A05;
            C178267w0 c178267w0 = new C178267w0();
            C201438vY c201438vY = new C201438vY();
            C178747wm c178747wm = C178747wm.A01;
            boolean z9 = this.A0D;
            c179107xM = AbstractC179127xO.A00(context2, null, null, c178747wm, c201438vY, c178267w0, true, false, z9, z9, false, true, true, false);
        }
        if (this.A0F) {
            UserSession userSession2 = this.A08;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession2, 36319446046612929L);
            if (A06) {
                AbstractC167027dH.A0y(C18950wb.A01, "OneCameraMediaServiceWithAR");
            }
            c198658qF = AbstractC198488px.A01(this.A05, userSession2, "OneCameraMediaServiceWithAR", true, A06, false, this.A0C);
        } else {
            c198658qF = null;
        }
        Integer num2 = this.A09;
        if (num2 != null) {
            c212469bF = AbstractC198488px.A02(this.A05, this.A08, num2);
        } else {
            c212469bF = null;
        }
        if (z) {
            C178747wm c178747wm2 = C178747wm.A01;
            c199458rm = new AZB(c178747wm2);
            c199458rm.A06 = !this.A0H;
            c199458rm.A05 = true;
            c199458rm.A00 = c199468rn;
            c199458rm.A0D.A03 = true;
            if (this.A0G && !this.A0C) {
                c199458rm.A01(EnumC222969sb.A06, new C212459bE(c178747wm2, false));
            }
            if (c179107xM != null) {
                c199458rm.A01(EnumC222969sb.A03, c179107xM);
            }
            if (c212469bF != null) {
                c199458rm.A01(EnumC222969sb.A05, c212469bF);
            }
            if (c198658qF != null) {
                c199458rm.A01(EnumC222969sb.A04, c198658qF);
            }
        } else if (this.A09 != null && c212469bF != null) {
            C178747wm c178747wm3 = C178747wm.A01;
            C14360o3.A08(c178747wm3);
            c199458rm = new AZN(c199468rn, c179107xM, c178747wm3, c212469bF, c198658qF, true, C18U.A06(C06090Tz.A05, this.A08, 36320137536086109L));
        } else {
            C178747wm c178747wm4 = C178747wm.A01;
            C14360o3.A08(c178747wm4);
            c199458rm = new C199458rm(c199468rn, c179107xM, c178747wm4, c198658qF, true, C18U.A06(C06090Tz.A05, this.A08, 36324187689856981L));
        }
        if (z6) {
            A0R = AnonymousClass001.A0O("OCVideo-", hashCode());
        } else {
            A0R = AnonymousClass001.A0R("OCVideo-", "Thread");
        }
        C178267w0 c178267w02 = new C178267w0();
        C178267w0.A01().A00(A0R, 0);
        switch (str.hashCode()) {
            case -1941167627:
                if (str.equals("post_cap_direct")) {
                    str2 = "instagram_direct_postcapture";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case -1705349612:
                if (str.equals("igtv_share_stories")) {
                    str2 = "instagram_stories_igtv_share";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case -1173729015:
                if (str.equals("shoutout_share_stories")) {
                    str2 = "instagram_stories_shoutout_share";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case -893858883:
                if (str.equals(MSV.A00(1178))) {
                    str2 = "instagram_feed_postcapture_preview";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 299265722:
                if (str.equals("photo_credit_stories")) {
                    str2 = "instagram_stories_photo_credit";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 460837420:
                if (str.equals(AbstractC43591JPw.A00(991))) {
                    str2 = "instagram_feed_postcapture_filter_fragment";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 693541831:
                if (str.equals("post_cap_stories")) {
                    str2 = "instagram_stories_postcapture";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 822756427:
                if (str.equals("mention_reshare_stories")) {
                    str2 = "instagram_stories_mention_reshare";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 906220026:
                if (str.equals("reels_reshare_stories")) {
                    str2 = "instagram_stories_reels_reshare";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 919765506:
                if (str.equals(AbstractC43591JPw.A00(992))) {
                    str2 = "instagram_feed_postcapture_trim_fragment";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 1029649978:
                if (str.equals("reel_memory_share_stories")) {
                    str2 = "instagram_stories_reel_memory_share";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            case 1121724483:
                if (str.equals(AbstractC43591JPw.A00(990))) {
                    str2 = "instagram_feed_postcapture_cover_fragment";
                    break;
                }
                str2 = "instagram_post_capture";
                break;
            default:
                str2 = "instagram_post_capture";
                break;
        }
        C178017va c178017va = new C178017va(str2);
        c178017va.A02(InterfaceC178107vj.A0E, c199458rm);
        c178017va.A02(InterfaceC178047vd.A00, userSession);
        C178017va.A00(c178017va, InterfaceC198728qU.A00, !z);
        c178017va.A02(InterfaceC178107vj.A0I, c178267w02.BAu(A0R));
        c178017va.A02(InterfaceC178107vj.A02, C178117vk.A06);
        c178017va.A02(InterfaceC178107vj.A0A, true);
        C178017va.A00(c178017va, InterfaceC178107vj.A08, z);
        c178017va.A02(InterfaceC178147vn.A00, true);
        C178037vc c178037vc = InterfaceC178107vj.A06;
        C06090Tz c06090Tz = C06090Tz.A05;
        c178017va.A02(c178037vc, AbstractC166997dE.A0c(c06090Tz, userSession, 36324187689856981L));
        c178017va.A02(InterfaceC178107vj.A0L, Integer.valueOf((int) C18U.A01(c06090Tz, userSession, 36605662666691904L)));
        if (z) {
            c178017va.A02(InterfaceC178107vj.A07, AbstractC166997dE.A0c(c06090Tz, userSession, 36327980145851415L));
        }
        if (z6) {
            c178017va.A02(InterfaceC178107vj.A0J, A0R);
        }
        if (c179107xM != null) {
            c178017va.A02(InterfaceC178137vm.A00, c179107xM);
        }
        this.A07 = C178177vr.A00(context, new C178027vb(c178017va), new InterfaceC178157vo() { // from class: X.9Np
            @Override // X.InterfaceC178157vo
            public final /* synthetic */ void ChK(InterfaceC178207vu interfaceC178207vu, C179757yP c179757yP) {
            }

            @Override // X.InterfaceC178157vo
            public final /* synthetic */ void ChM(InterfaceC178207vu interfaceC178207vu, C178257vz c178257vz) {
            }

            @Override // X.InterfaceC178157vo
            public final void ChI(InterfaceC178207vu interfaceC178207vu, C178637wb c178637wb) {
                boolean A1a = AbstractC167017dG.A1a(interfaceC178207vu, c178637wb);
                c178637wb.A00(new C178797wr(interfaceC178207vu));
                c178637wb.A00(new C180147z4(interfaceC178207vu, A1a));
                c178637wb.A00(new AbstractC178657wd(interfaceC178207vu));
                c178637wb.A00(new C209159Mx(interfaceC178207vu));
                c178637wb.A00(new C179487xy(interfaceC178207vu));
                c178637wb.A00(new ComponentCallbacks2C179637yD(interfaceC178207vu));
            }

            @Override // X.InterfaceC178157vo
            public final void ChJ(InterfaceC178207vu interfaceC178207vu, C179677yH c179677yH) {
                AbstractC167017dG.A1N(interfaceC178207vu, c179677yH);
                c179677yH.A00(new AbstractC179687yI(interfaceC178207vu));
                c179677yH.A00(new AbstractC179687yI(interfaceC178207vu));
            }

            @Override // X.InterfaceC178157vo
            public final void ChL(InterfaceC178207vu interfaceC178207vu, C179787yS c179787yS) {
                AbstractC167017dG.A1N(interfaceC178207vu, c179787yS);
                c179787yS.A00(new AbstractC179807yU(interfaceC178207vu));
                c179787yS.A00(new C9NM(interfaceC178207vu));
                c179787yS.A00(new C199418ri(interfaceC178207vu));
            }
        });
        A03(this, "init");
    }
}
