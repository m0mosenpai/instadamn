package com.facebook.fbavatar.cdsavatareditor.liveediting.ig;

import X.AbstractC25225BEi;
import X.C07X;
import X.C0JO;
import X.C14360o3;
import X.C19L;
import X.C51497Moi;
import X.C54806OKa;
import X.C55127Obo;
import X.InterfaceC57900Pm4;
import X.InterfaceC58017Po2;
import X.InterfaceC58098PpN;
import X.O1H;
import X.OMs;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class FoaLiveEditingProvider implements InterfaceC57900Pm4 {
    public InterfaceC58098PpN A00;
    public InterfaceC58017Po2 A01;
    public C55127Obo A02;
    public OMs A03;
    public final C07X A04;
    public final O1H A05;
    public final C0JO A06;
    public final UserSession A07;
    public final C19L A08;

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028f A[Catch: all -> 0x02c1, TryCatch #0 {, blocks: (B:19:0x014b, B:21:0x015b, B:23:0x016d, B:25:0x0180, B:26:0x0187, B:28:0x01a9, B:29:0x01b0, B:31:0x01b6, B:33:0x01ba, B:34:0x01bf, B:36:0x01c5, B:37:0x01ca, B:39:0x01e4, B:41:0x01f1, B:42:0x01f6, B:47:0x01fd, B:48:0x021e, B:50:0x0222, B:52:0x022b, B:53:0x0231, B:55:0x025d, B:57:0x0264, B:73:0x02c0, B:60:0x0281, B:62:0x028f, B:63:0x0295, B:64:0x0268, B:66:0x0274, B:68:0x027d, B:69:0x02a9, B:71:0x018a, B:72:0x02bc, B:74:0x02b5), top: B:18:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0295 A[Catch: all -> 0x02c1, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x014b, B:21:0x015b, B:23:0x016d, B:25:0x0180, B:26:0x0187, B:28:0x01a9, B:29:0x01b0, B:31:0x01b6, B:33:0x01ba, B:34:0x01bf, B:36:0x01c5, B:37:0x01ca, B:39:0x01e4, B:41:0x01f1, B:42:0x01f6, B:47:0x01fd, B:48:0x021e, B:50:0x0222, B:52:0x022b, B:53:0x0231, B:55:0x025d, B:57:0x0264, B:73:0x02c0, B:60:0x0281, B:62:0x028f, B:63:0x0295, B:64:0x0268, B:66:0x0274, B:68:0x027d, B:69:0x02a9, B:71:0x018a, B:72:0x02bc, B:74:0x02b5), top: B:18:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(android.content.Context r28, android.view.ViewGroup r29, X.C54753OHi r30, X.OL0 r31, X.C51653Mrk r32, X.OMg r33, X.InterfaceC23621Ds r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider.A00(android.content.Context, android.view.ViewGroup, X.OHi, X.OL0, X.Mrk, X.OMg, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC57900Pm4
    public final void CwK(C54806OKa c54806OKa) {
        C51497Moi c51497Moi = (C51497Moi) this.A03;
        if (c51497Moi != null) {
            c51497Moi.A02 = AbstractC25225BEi.A16(c54806OKa);
        }
    }

    public FoaLiveEditingProvider(C07X c07x, O1H o1h, UserSession userSession, C19L c19l) {
        this.A07 = userSession;
        this.A04 = c07x;
        this.A08 = c19l;
        this.A05 = o1h;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A06 = awakeTimeSinceBootClock;
    }
}
