package com.facebook.avatar.expresso.odr.rmv;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18560vj;
import X.AbstractC25225BEi;
import X.AnonymousClass139;
import X.AnonymousClass195;
import X.C00O;
import X.C0eB;
import X.C14360o3;
import X.C18U;
import X.C19L;
import X.C1JX;
import X.C51456Mo2;
import X.C54835OLu;
import X.C55018OWr;
import X.C55143Od2;
import X.C57228PbC;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import X.InterfaceC58015Pnz;
import X.InterfaceC58017Po2;
import X.MCH;
import X.MSW;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public final class ODRCDLHandler implements InterfaceC58015Pnz {
    public static InterfaceC58017Po2 A0E;
    public static final Companion A0F = new Object();
    public C51456Mo2 A00;
    public GltfMemoryPointerWrapper A01;
    public C55018OWr A03;
    public String A04;
    public boolean A05;
    public final C54835OLu A06;
    public final QuickPerformanceLogger A07;
    public final InterfaceC16610sE A09;
    public final C19L A0A;
    public final C55143Od2 A0B;
    public final AnonymousClass195 A0C;
    public final AnonymousClass139 A0D = new AnonymousClass139();
    public final String A08 = AbstractC167017dG.A0j();
    public float A02 = 0.033f;

    /* loaded from: classes9.dex */
    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A00(X.C54835OLu r39, X.C55018OWr r40, X.C51456Mo2 r41, X.C55143Od2 r42, com.facebook.quicklog.QuickPerformanceLogger r43, com.instagram.common.session.UserSession r44, X.InterfaceC23621Ds r45, X.InterfaceC16610sE r46, X.C19L r47) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.Companion.A00(X.OLu, X.OWr, X.Mo2, X.Od2, com.facebook.quicklog.QuickPerformanceLogger, com.instagram.common.session.UserSession, X.1Ds, X.0sE, X.19L):java.lang.Object");
        }
    }

    @Override // X.InterfaceC58015Pnz
    public final void FCL(C55018OWr c55018OWr, C51456Mo2 c51456Mo2, float f) {
        C14360o3.A0B(c55018OWr, 0);
        this.A03 = c55018OWr;
        this.A02 = f;
        this.A00 = c51456Mo2;
        C55143Od2 c55143Od2 = this.A0B;
        AvatarsNativeInputDelegate avatarsNativeInputDelegate = c55143Od2.A0E.A00;
        avatarsNativeInputDelegate.setFixedElapsedTimeForAnimation(f);
        C55018OWr.A00(c55018OWr, c55143Od2);
        String str = this.A04;
        if (str != null) {
            avatarsNativeInputDelegate.loadAnimationFromFile(str, c55018OWr.A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58015Pnz
    public final synchronized void onDestroy() {
        this.A01 = null;
        this.A0C.AGH(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001f. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01c0: INVOKE (r4 I:X.139), (r5 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:448), block:B:91:0x01c0 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: all -> 0x01bf, TryCatch #0 {all -> 0x01bf, blocks: (B:13:0x004c, B:15:0x0057, B:22:0x006d, B:23:0x01b9, B:26:0x0076, B:31:0x0095, B:33:0x00a4, B:39:0x00a8, B:40:0x00c0, B:42:0x00c4, B:44:0x00ca, B:45:0x00e7, B:47:0x010c, B:48:0x0110, B:51:0x0116, B:53:0x0120, B:54:0x01ad, B:55:0x01b1, B:56:0x0135, B:58:0x0139, B:60:0x013d, B:62:0x0154, B:64:0x0158, B:65:0x015c, B:67:0x0174, B:68:0x016a, B:70:0x0177, B:72:0x017b, B:74:0x017f, B:76:0x0187, B:77:0x019b, B:79:0x01a0, B:81:0x01a4, B:83:0x01a8, B:89:0x01b6), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[Catch: all -> 0x01bf, TryCatch #0 {all -> 0x01bf, blocks: (B:13:0x004c, B:15:0x0057, B:22:0x006d, B:23:0x01b9, B:26:0x0076, B:31:0x0095, B:33:0x00a4, B:39:0x00a8, B:40:0x00c0, B:42:0x00c4, B:44:0x00ca, B:45:0x00e7, B:47:0x010c, B:48:0x0110, B:51:0x0116, B:53:0x0120, B:54:0x01ad, B:55:0x01b1, B:56:0x0135, B:58:0x0139, B:60:0x013d, B:62:0x0154, B:64:0x0158, B:65:0x015c, B:67:0x0174, B:68:0x016a, B:70:0x0177, B:72:0x017b, B:74:0x017f, B:76:0x0187, B:77:0x019b, B:79:0x01a0, B:81:0x01a4, B:83:0x01a8, B:89:0x01b6), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler r12, X.AbstractC53426NkF r13, X.InterfaceC23621Ds r14) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler.A00(com.facebook.avatar.expresso.odr.rmv.ODRCDLHandler, X.NkF, X.1Ds):java.lang.Object");
    }

    public static final Object A01(ODRCDLHandler oDRCDLHandler, InterfaceC23621Ds interfaceC23621Ds) {
        GltfMemoryPointerWrapper gltfMemoryPointerWrapper;
        String str;
        if (oDRCDLHandler.A05 && (gltfMemoryPointerWrapper = oDRCDLHandler.A01) != null && (str = oDRCDLHandler.A04) != null) {
            C55143Od2 c55143Od2 = oDRCDLHandler.A0B;
            c55143Od2.A0E.A00.loadAvatarFromMemory(str, oDRCDLHandler.A08, gltfMemoryPointerWrapper);
            oDRCDLHandler.A07.markerPoint(603995461, "avatar_load_start");
            Object A03 = c55143Od2.A03(interfaceC23621Ds);
            if (A03 == C1JX.A02) {
                return A03;
            }
        }
        return C0eB.A00;
    }

    public ODRCDLHandler(C54835OLu c54835OLu, C55018OWr c55018OWr, C51456Mo2 c51456Mo2, C55143Od2 c55143Od2, QuickPerformanceLogger quickPerformanceLogger, UserSession userSession, InterfaceC16610sE interfaceC16610sE, C19L c19l) {
        this.A0A = c19l;
        this.A06 = c54835OLu;
        this.A0B = c55143Od2;
        this.A07 = quickPerformanceLogger;
        this.A03 = c55018OWr;
        this.A00 = c51456Mo2;
        this.A09 = interfaceC16610sE;
        this.A0C = AbstractC18560vj.A03(c19l, MSW.A1I(new C57228PbC(this, 2), c55143Od2.A0I));
        Map map = c54835OLu.A04;
        QuickPerformanceLogger quickPerformanceLogger2 = this.A07;
        quickPerformanceLogger2.markerPoint(603995461, "avatar_download_start");
        String str = this.A08;
        quickPerformanceLogger2.markerAnnotate(603995461, "cdl_request_id", str);
        C54835OLu c54835OLu2 = this.A06;
        quickPerformanceLogger2.markerAnnotate(603995461, "lod", c54835OLu2.A00);
        quickPerformanceLogger2.markerAnnotate(603995461, "texture_size", c54835OLu2.A01);
        long A01 = C18U.A01(AbstractC25225BEi.A0j(userSession, 0), userSession, 36605868825449831L);
        InterfaceC58017Po2 interfaceC58017Po2 = A0E;
        if (interfaceC58017Po2 == null) {
            C14360o3.A0F("cdlProvider");
            throw C00O.createAndThrow();
        }
        interfaceC58017Po2.AWn(false, Integer.valueOf((int) A01), str, new TreeMap(map), new MCH(this, (InterfaceC23621Ds) null, 2));
        C55018OWr.A00(this.A03, c55143Od2);
    }
}
