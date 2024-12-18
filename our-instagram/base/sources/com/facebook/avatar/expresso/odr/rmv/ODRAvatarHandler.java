package com.facebook.avatar.expresso.odr.rmv;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18560vj;
import X.AnonymousClass139;
import X.AnonymousClass195;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C51456Mo2;
import X.C55018OWr;
import X.C55143Od2;
import X.C57228PbC;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import X.InterfaceC58015Pnz;
import X.MSW;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes9.dex */
public final class ODRAvatarHandler implements InterfaceC58015Pnz {
    public C51456Mo2 A00;
    public float A01;
    public C55018OWr A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC16610sE A07;
    public final C55143Od2 A08;
    public final QuickPerformanceLogger A09;
    public final AnonymousClass195 A0A;
    public final AnonymousClass139 A0B;

    public ODRAvatarHandler(C55018OWr c55018OWr, C51456Mo2 c51456Mo2, C55143Od2 c55143Od2, QuickPerformanceLogger quickPerformanceLogger, InterfaceC16610sE interfaceC16610sE, C19L c19l) {
        C14360o3.A0B(c19l, 1);
        AbstractC167017dG.A1T(c55018OWr, c51456Mo2);
        this.A08 = c55143Od2;
        this.A09 = quickPerformanceLogger;
        this.A02 = c55018OWr;
        this.A00 = c51456Mo2;
        this.A07 = interfaceC16610sE;
        this.A0B = new AnonymousClass139();
        this.A01 = 0.033f;
        this.A0A = AbstractC18560vj.A03(c19l, MSW.A1I(new C57228PbC(this, 1), c55143Od2.A0I));
        C55018OWr.A00(this.A02, c55143Od2);
    }

    @Override // X.InterfaceC58015Pnz
    public final void FCL(C55018OWr c55018OWr, C51456Mo2 c51456Mo2, float f) {
        C14360o3.A0B(c55018OWr, 0);
        this.A02 = c55018OWr;
        this.A01 = f;
        this.A00 = c51456Mo2;
        C55143Od2 c55143Od2 = this.A08;
        AvatarsNativeInputDelegate avatarsNativeInputDelegate = c55143Od2.A0E.A00;
        avatarsNativeInputDelegate.setFixedElapsedTimeForAnimation(f);
        C55018OWr.A00(c55018OWr, c55143Od2);
        String str = this.A03;
        if (str != null) {
            avatarsNativeInputDelegate.loadAnimationFromFile(str, c55018OWr.A00);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58015Pnz
    public final synchronized void onDestroy() {
        this.A0A.AGH(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001e. Please report as an issue. */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01a5: INVOKE (r4 I:X.139), (r5 I:java.lang.Object) VIRTUAL call: X.139.A04(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:421), block:B:89:0x01a5 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:13:0x004b, B:15:0x004f, B:16:0x0057, B:18:0x019e, B:21:0x005c, B:24:0x0076, B:27:0x0094, B:30:0x00a3, B:37:0x00c5, B:39:0x00d4, B:45:0x00d8, B:47:0x00f8, B:48:0x00fb, B:51:0x0101, B:53:0x010b, B:56:0x0123, B:82:0x0196, B:58:0x0128, B:60:0x012c, B:62:0x0130, B:64:0x0148, B:66:0x014c, B:67:0x0150, B:69:0x0168, B:70:0x015e, B:72:0x016d, B:74:0x0171, B:76:0x0175, B:78:0x017d, B:81:0x0192, B:87:0x019b), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #0 {all -> 0x01a4, blocks: (B:13:0x004b, B:15:0x004f, B:16:0x0057, B:18:0x019e, B:21:0x005c, B:24:0x0076, B:27:0x0094, B:30:0x00a3, B:37:0x00c5, B:39:0x00d4, B:45:0x00d8, B:47:0x00f8, B:48:0x00fb, B:51:0x0101, B:53:0x010b, B:56:0x0123, B:82:0x0196, B:58:0x0128, B:60:0x012c, B:62:0x0130, B:64:0x0148, B:66:0x014c, B:67:0x0150, B:69:0x0168, B:70:0x015e, B:72:0x016d, B:74:0x0171, B:76:0x0175, B:78:0x017d, B:81:0x0192, B:87:0x019b), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler r9, X.AbstractC53426NkF r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler.A00(com.facebook.avatar.expresso.odr.rmv.ODRAvatarHandler, X.NkF, X.1Ds):java.lang.Object");
    }

    private final Object A01(InterfaceC23621Ds interfaceC23621Ds) {
        Object A03;
        if (this.A06 && this.A05 && this.A04 && (A03 = this.A08.A03(interfaceC23621Ds)) == C1JX.A02) {
            return A03;
        }
        return C0eB.A00;
    }
}
