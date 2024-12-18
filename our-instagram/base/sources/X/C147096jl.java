package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.6jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147096jl implements InterfaceC147106jm {
    public final UserSession A00;
    public final InterfaceC101944i9 A01;
    public final int A02;
    public final int A03;
    public final InterfaceC11380iw A04;

    public C147096jl(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC101944i9 interfaceC101944i9) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC101944i9, 2);
        this.A00 = userSession;
        this.A01 = interfaceC101944i9;
        this.A04 = interfaceC11380iw;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A02 = (int) C18U.A01(c06090Tz, userSession, 36598966814182736L);
        this.A03 = (int) C18U.A01(c06090Tz, userSession, 36598966814248273L);
        C3G6.A00(userSession).A07(this);
    }

    @Override // X.InterfaceC147106jm
    public final void DOA(String str) {
    }

    @Override // X.InterfaceC147106jm
    public final void DOB(String str) {
    }

    @Override // X.InterfaceC147106jm
    public final void DRJ(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DRW(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSI(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSL(String str, String str2) {
    }

    public final void A00(C41551w4 c41551w4, String str) {
        C41551w4 Blt;
        HashMap hashMap = new HashMap();
        UserSession userSession = this.A00;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        int i = this.A02;
        UserSession userSession2 = AbstractC25351Lp.A00(userSession).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36325794008348030L)) {
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            if (interfaceC19630xq.getInt("reel_tray_viewer_swipe_preload_count", -1) != -1) {
                i = interfaceC19630xq.getInt("reel_tray_viewer_swipe_preload_count", -1);
            }
        }
        if (i >= 0) {
            int i2 = 0;
            while (i2 != i) {
                i2++;
                if (i2 != 0) {
                    InterfaceC101944i9 interfaceC101944i9 = this.A01;
                    int CNR = interfaceC101944i9.CNR(c41551w4) + i2;
                    if (CNR >= 0 && (Blt = interfaceC101944i9.Blt(CNR)) != null) {
                        String id = Blt.A0H.getId();
                        C14360o3.A07(id);
                        if (!hashMap.containsKey(id)) {
                            String id2 = Blt.A0H.getId();
                            C14360o3.A07(id2);
                            hashMap.put(id2, new C81943lE(C3G5.A06, id2, 1, -1, CNR));
                        }
                    }
                }
            }
        }
        int i3 = this.A03;
        if (C18U.A06(c06090Tz, AbstractC25351Lp.A00(userSession).A00, 36325794008413567L)) {
            InterfaceC19630xq interfaceC19630xq2 = A00.A01;
            if (interfaceC19630xq2.getInt("reel_tray_viewer_tap_preload_count", -1) != -1) {
                i3 = interfaceC19630xq2.getInt("reel_tray_viewer_tap_preload_count", -1);
            }
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = c41551w4.A01;
        InterfaceC101944i9 interfaceC101944i92 = this.A01;
        int CNR2 = interfaceC101944i92.CNR(c41551w4);
        String str2 = null;
        boolean z = false;
        for (int i8 = 0; i8 < i3; i8++) {
            i7++;
            if (i7 >= c41551w4.A02(userSession)) {
                CNR2++;
                c41551w4 = interfaceC101944i92.Blt(CNR2);
                if (c41551w4 == null) {
                    break;
                } else if (c41551w4.A0L) {
                    i7 = 0;
                } else {
                    i7 = c41551w4.A00;
                }
            }
            if (i7 < c41551w4.A02(userSession)) {
                Reel reel = c41551w4.A0H;
                String id3 = reel.getId();
                C14360o3.A07(id3);
                if (!id3.equals(str2)) {
                    if (z) {
                        hashMap.put(str2, new C81943lE(C3G5.A07, str2, i5, i6, i4));
                    }
                    str2 = reel.getId();
                    C14360o3.A07(str2);
                    i5 = 0;
                    z = true;
                    i6 = i7;
                    i4 = CNR2;
                } else if (!z) {
                    NullPointerException nullPointerException = new NullPointerException();
                    C14360o3.A0G(nullPointerException);
                    throw nullPointerException;
                }
                i5++;
            }
        }
        if (z) {
            hashMap.put(str2, new C81943lE(C3G5.A07, str2, i5, i6, i4));
        }
        if (!hashMap.isEmpty()) {
            C3G6.A00(userSession).A0A(this.A04.getModuleName(), str, new ArrayList(hashMap.values()));
        }
    }

    @Override // X.InterfaceC147106jm
    public final void DOC(String str, boolean z) {
        C41551w4 Blv = this.A01.Blv(str);
        if (Blv != null && !z) {
            Blv.A0B(this.A00);
        }
    }
}
