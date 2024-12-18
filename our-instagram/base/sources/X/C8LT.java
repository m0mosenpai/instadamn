package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.model.sharelater.ShareLaterMedia;
import java.util.HashMap;

/* renamed from: X.8LT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LT {
    public String A00;
    public final AbstractC59962oe A01;
    public final InterfaceC41501vz A02 = new InterfaceC41501vz() { // from class: X.8LU
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            AbstractC59962oe abstractC59962oe;
            int A03 = C0f9.A03(2037603565);
            int A032 = C0f9.A03(485537034);
            Integer num = ((C211849aB) obj).A00;
            Integer num2 = C05F.A00;
            if (num == num2) {
                String A00 = MSV.A00(380);
                C8LT c8lt = C8LT.this;
                UserSession userSession = c8lt.A03;
                C195918ld.A05.A01(userSession, null, A00, true, true);
                OQ9.A01(userSession, null).A05(true, A00);
                C8LT.A00(c8lt);
                abstractC59962oe = c8lt.A01;
            } else {
                num2 = C05F.A01;
                if (num == num2) {
                    C8LT c8lt2 = C8LT.this;
                    C8LT.A00(c8lt2);
                    abstractC59962oe = c8lt2.A01;
                }
                C0f9.A0A(-186920223, A032);
                C0f9.A0A(-1450168889, A03);
            }
            Context requireContext = abstractC59962oe.requireContext();
            int i = 2131952008;
            if (num2.intValue() != 0) {
                i = 2131952009;
            }
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A0D = requireContext.getString(i);
            c146106i8.A01 = 6000;
            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
            C0f9.A0A(-186920223, A032);
            C0f9.A0A(-1450168889, A03);
        }
    };
    public final UserSession A03;
    public final C183688Ct A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC09390do A06;
    public final int A07;
    public final Activity A08;
    public final C1815383g A09;
    public final C1810981l A0A;
    public final TargetViewSizeProvider A0B;
    public final C8HI A0C;
    public final AnonymousClass840 A0D;
    public final C81J A0E;
    public final C1812682c A0F;
    public final C8FR A0G;
    public final C184858Ia A0H;
    public final C8FA A0I;
    public final StoryDraftsCreationViewModel A0J;
    public final C8JU A0K;
    public final InterfaceC08830cm A0L;
    public final InterfaceC08830cm A0M;
    public final InterfaceC08830cm A0N;
    public final InterfaceC08830cm A0O;

    public static void A00(C8LT c8lt) {
        final C38321qM c38321qM;
        if (c8lt.A00 != null) {
            UserSession userSession = c8lt.A03;
            C47Z A03 = C25A.A00(userSession).A03(c8lt.A00);
            if (A03 != null) {
                C14360o3.A0B(userSession, 0);
                final C23653Adm c23653Adm = (C23653Adm) userSession.A01(C23653Adm.class, new C43205J8c(userSession, 17));
                String str = c8lt.A00;
                final String A0H = A03.A0H();
                final HashMap A0Y = c8lt.A04.A0Y();
                C14360o3.A0B(str, 0);
                if (C14360o3.A0K(c23653Adm.A01, str) && (c38321qM = c23653Adm.A00) != null) {
                    c38321qM.A4H(EnumC76753cN.A06);
                    UserSession userSession2 = c23653Adm.A03;
                    AbstractC54107Nw5.A00(userSession2, "request", "upsell", c23653Adm.A02, A0H, A0Y);
                    C1ON A00 = AbstractC54205Nxj.A00(userSession2, new ShareLaterMedia(c38321qM), C05F.A0N, A0H, "upsell");
                    A00.A00 = new C1P1() { // from class: X.9gI
                        @Override // X.C1P1
                        public final void onFail(AbstractC115105If abstractC115105If) {
                            int A0N = AbstractC167017dG.A0N(abstractC115105If, -634700025);
                            super.onFail(abstractC115105If);
                            C38321qM.this.A4H(EnumC76753cN.A04);
                            C23653Adm c23653Adm2 = c23653Adm;
                            AbstractC54107Nw5.A00(c23653Adm2.A03, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "upsell", c23653Adm2.A02, A0H, A0Y);
                            C0f9.A0A(1898726719, A0N);
                        }

                        @Override // X.C1P1
                        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                            int A032 = C0f9.A03(1382293390);
                            int A0N = AbstractC167017dG.A0N(obj, -535657631);
                            super.onSuccess(obj);
                            C38321qM.this.A4H(EnumC76753cN.A05);
                            C23653Adm c23653Adm2 = c23653Adm;
                            AbstractC54107Nw5.A00(c23653Adm2.A03, "success", "upsell", c23653Adm2.A02, A0H, A0Y);
                            C0f9.A0A(-2040789221, A0N);
                            C0f9.A0A(1467097949, A032);
                        }
                    };
                    C1GJ.A03(A00);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x03c6, code lost:
    
        if (X.C173037nH.A00(r5) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r8.isEmpty() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0185, code lost:
    
        if (r3.get() == X.C22P.A5Q) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r8.isEmpty() != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v140, types: [java.lang.Object, X.1vN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.InterfaceC11380iw r20, X.A5Y r21, X.AH3 r22, java.lang.Integer r23, X.InterfaceC09390do r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LT.A03(X.0iw, X.A5Y, X.AH3, java.lang.Integer, X.0do, boolean, boolean):void");
    }

    public C8LT(C1815383g c1815383g, C1810981l c1810981l, C183688Ct c183688Ct, TargetViewSizeProvider targetViewSizeProvider, C8HI c8hi, AnonymousClass840 anonymousClass840, C81J c81j, C1812682c c1812682c, C8FR c8fr, C184858Ia c184858Ia, C8FA c8fa, StoryDraftsCreationViewModel storyDraftsCreationViewModel, C8JU c8ju, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC09390do interfaceC09390do, int i) {
        this.A0E = c81j;
        this.A03 = c81j.A0S;
        this.A08 = c81j.A05;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        this.A01 = abstractC59962oe;
        this.A0M = interfaceC08830cm;
        this.A0D = anonymousClass840;
        this.A0J = storyDraftsCreationViewModel;
        this.A0I = c8fa;
        this.A0H = c184858Ia;
        this.A07 = i;
        this.A0C = c8hi;
        this.A0B = targetViewSizeProvider;
        this.A06 = interfaceC09390do;
        this.A0F = c1812682c;
        this.A04 = c183688Ct;
        this.A05 = interfaceC08830cm2;
        this.A0L = interfaceC08830cm3;
        this.A0O = interfaceC08830cm4;
        this.A0A = c1810981l;
        this.A0G = c8fr;
        this.A09 = c1815383g;
        this.A0K = c8ju;
        this.A0N = interfaceC08830cm5;
        abstractC59962oe.registerLifecycleListener(new InterfaceC60602pj() { // from class: X.8LV
            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void ADK(View view) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void D8S(View view) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onActivityResult(int i2, int i3, Intent intent) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onCreate() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onDestroy() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onPause() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onResume() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onStart() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onStop() {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
            }

            @Override // X.InterfaceC60602pj
            public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
            }

            @Override // X.InterfaceC60602pj
            public final void onDestroyView() {
                C8LT c8lt = C8LT.this;
                AbstractC25651Mw.A00(c8lt.A03).A02(c8lt.A02, C211849aB.class);
                c8lt.A01.unregisterLifecycleListener(this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (((X.C38052Gof) ((X.C208779Ll) ((X.C9R4) r62.A04.A1J.A07.getValue()).A06.getValue()).A06.getValue()).A01 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo A01(android.util.Pair r63, X.C9B8 r64, com.instagram.camera.effect.models.CameraAREffect r65, X.OTS r66, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r67, X.EnumC40111tc r68, java.lang.Integer r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.util.HashMap r76, java.util.List r77, java.util.List r78, java.util.List r79, int r80, int r81, boolean r82, boolean r83) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LT.A01(android.util.Pair, X.9B8, com.instagram.camera.effect.models.CameraAREffect, X.OTS, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, X.1tc, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.util.List, java.util.List, java.util.List, int, int, boolean, boolean):com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0657, code lost:
    
        if (r3.intValue() <= 1) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x009a, code lost:
    
        if (((X.C38052Gof) ((X.C208779Ll) ((X.C9R4) r1.A1J.A07.getValue()).A06.getValue()).A06.getValue()).A01 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ae, code lost:
    
        if (r4.A0F() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x010f, code lost:
    
        if (r4.A0L() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0156, code lost:
    
        if (r3.A0D() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x016c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36320644341703459L) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x016e, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0170, code lost:
    
        if (r20 != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0172, code lost:
    
        if (r81 > 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0174, code lost:
    
        r1 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0176, code lost:
    
        r11 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x017b, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x017d, code lost:
    
        r0 = r2.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x017f, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0181, code lost:
    
        r11.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0184, code lost:
    
        r62 = X.AbstractC50677MYv.A0C(r2, r160);
        r6 = new X.C005001p(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0193, code lost:
    
        if (r2 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0195, code lost:
    
        r4 = r2.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0197, code lost:
    
        if (r4 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0199, code lost:
    
        r5 = r5.B0Z(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x019d, code lost:
    
        if (r5 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x019f, code lost:
    
        X.AbstractC12120kG.A07("CameraLoggerHelper", X.AnonymousClass001.A0R(X.MSV.A00(365), r4), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0388, code lost:
    
        r6.put(r4, r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01ac, code lost:
    
        r4 = r2.A0K;
        r2 = r2.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01b0, code lost:
    
        r2 = X.AbstractC449424y.A04(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01b4, code lost:
    
        if (r2 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01b6, code lost:
    
        r2 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01b8, code lost:
    
        if (r2 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01ba, code lost:
    
        r63 = java.util.Collections.singletonList(r2);
        X.C14360o3.A07(r63);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01c3, code lost:
    
        if (r169 != null) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01c5, code lost:
    
        r80 = X.AbstractC449424y.A00(r2, r8, r178);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0336, code lost:
    
        if (r160 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0350, code lost:
    
        if (r160 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0369, code lost:
    
        r80 = X.AbstractC449424y.A01(X.AbstractC226019yK.A00(r169));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0373, code lost:
    
        X.AbstractC12120kG.A07("CameraLoggerHelper", X.AnonymousClass001.A0R("Unable to find capture format for name: ", r169), null);
        r80 = X.AbstractC449424y.A00(r2, r8, r178);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0384, code lost:
    
        r63 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0391, code lost:
    
        r4 = null;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0395, code lost:
    
        r1 = new java.util.ArrayList(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x039b, code lost:
    
        if (r20 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x039d, code lost:
    
        r1.add(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03a2, code lost:
    
        if (r81 <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03a4, code lost:
    
        r1.add(java.lang.String.valueOf(r81));
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x015d, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c9  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.24v] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.24v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.util.Pair r159, com.instagram.camera.effect.models.CameraAREffect r160, com.instagram.common.gallery.metadata.MediaUploadMetadata r161, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation r162, X.C3o9 r163, X.EnumC40111tc r164, java.lang.Integer r165, java.lang.String r166, java.lang.String r167, java.lang.String r168, java.lang.String r169, java.lang.String r170, java.lang.String r171, java.lang.String r172, java.lang.String r173, java.lang.String r174, java.util.List r175, java.util.Map r176, int r177, int r178, int r179, boolean r180) {
        /*
            Method dump skipped, instructions count: 1679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LT.A02(android.util.Pair, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.gallery.metadata.MediaUploadMetadata, com.instagram.creation.capture.quickcapture.analytics.common.MediaTransformation, X.3o9, X.1tc, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.Map, int, int, int, boolean):void");
    }
}
