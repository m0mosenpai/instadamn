package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9RE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RE implements InterfaceC179077xJ {
    public C22979ABd A00;
    public int A01;
    public A9B A03;
    public InterfaceC25213BDl A04;
    public AAA A05;
    public final Context A06;
    public final C178747wm A07;
    public final UserSession A08;
    public final C198658qF A0B;
    public final HashMap A0A = AbstractC166987dD.A1G();
    public final HashMap A09 = AbstractC166987dD.A1G();
    public C199758sR A02 = new C199758sR(0, 0);

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179077xJ
    public final InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        AbstractC167007dF.A1D(interfaceC179467xw, 0, interfaceC179037xF);
        if (l != null) {
            int longValue = (int) (l.longValue() / 1000000);
            InterfaceC25213BDl interfaceC25213BDl = this.A04;
            if (interfaceC25213BDl != null) {
                interfaceC25213BDl.EbJ(longValue, this.A01);
            }
            C14360o3.A0F("overlayRenderer");
            throw C00O.createAndThrow();
        }
        InterfaceC25213BDl interfaceC25213BDl2 = this.A04;
        if (interfaceC25213BDl2 != null) {
            int BlX = interfaceC25213BDl2.BlX();
            for (int i = 0; i < BlX; i++) {
                InterfaceC25213BDl interfaceC25213BDl3 = this.A04;
                if (interfaceC25213BDl3 != null) {
                    C199758sR c199758sR = this.A02;
                    InterfaceC179447xu EGf = interfaceC25213BDl3.EGf(c199758sR, c199758sR, i);
                    if (EGf != null) {
                        A00(i);
                        C198658qF c198658qF = this.A0B;
                        c198658qF.A04 = false;
                        interfaceC179467xw = c198658qF.EGc(EGf.B8Z(), null, interfaceC179037xF, l);
                        InterfaceC25213BDl interfaceC25213BDl4 = this.A04;
                        if (interfaceC25213BDl4 != null) {
                            interfaceC25213BDl4.EEC(i);
                        }
                    }
                }
            }
            return interfaceC179467xw;
        }
        C14360o3.A0F("overlayRenderer");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC179077xJ
    public final void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        C14360o3.A0B(interfaceC179037xF, 0);
        String str = "overlayRenderer";
        if (l != null) {
            int longValue = (int) (l.longValue() / 1000000);
            InterfaceC25213BDl interfaceC25213BDl = this.A04;
            if (interfaceC25213BDl != null) {
                interfaceC25213BDl.EbJ(longValue, this.A01);
                AAA aaa = this.A05;
                if (aaa == null) {
                    str = "transformMatrixProvider";
                } else {
                    aaa.A00 = longValue;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        InterfaceC179437xt interfaceC179437xt = (InterfaceC179437xt) interfaceC179037xF.B9z(0).get(0);
        C178747wm c178747wm = this.A07;
        C179027xE c179027xE = new C179027xE(c178747wm, null, ((C179027xE) interfaceC179037xF).A05);
        c179027xE.A8h(interfaceC179437xt, 0);
        InterfaceC25213BDl interfaceC25213BDl2 = this.A04;
        if (interfaceC25213BDl2 != null) {
            int BlX = interfaceC25213BDl2.BlX() - 1;
            if (BlX >= 0) {
                int i = 0;
                while (true) {
                    InterfaceC25213BDl interfaceC25213BDl3 = this.A04;
                    if (interfaceC25213BDl3 == null) {
                        break;
                    }
                    C199758sR c199758sR = this.A02;
                    InterfaceC179447xu EGf = interfaceC25213BDl3.EGf(c199758sR, c199758sR, i);
                    if (EGf != null) {
                        A00(i);
                        HashMap hashMap = this.A09;
                        C1809380v c1809380v = (C1809380v) hashMap.get(EGf);
                        if (c1809380v == null) {
                            c1809380v = new C1809380v(c178747wm, EGf, C18U.A06(C06090Tz.A05, this.A08, 2342173214152671982L));
                            hashMap.put(EGf, c1809380v);
                        }
                        c179027xE.EWA(c1809380v, 0);
                        C198658qF c198658qF = this.A0B;
                        c198658qF.A04 = false;
                        c198658qF.EGd(c179027xE, l);
                        InterfaceC25213BDl interfaceC25213BDl4 = this.A04;
                        if (interfaceC25213BDl4 == null) {
                            break;
                        } else {
                            interfaceC25213BDl4.EEC(i);
                        }
                    }
                    if (i != BlX) {
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        C14360o3.A0B(obj, 1);
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        this.A0B.detach();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(int r13) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9RE.A00(int):void");
    }

    public static void A01(InterfaceC178817wt interfaceC178817wt, C47Z c47z, C9RE c9re, List list) {
        ClipInfo clipInfo = c47z.A1N;
        c9re.A02(c47z.A2h, list, clipInfo.A05 - clipInfo.A07, interfaceC178817wt.AZ1());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.String r11, java.util.List r12, int r13, int r14) {
        /*
            r10 = this;
            android.content.Context r4 = r10.A06
            com.instagram.common.session.UserSession r5 = r10.A08
            X.ABd r0 = new X.ABd
            r0.<init>(r4, r5, r11)
            r10.A00 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36331201371325650(0x811309000044d2, double:3.039336269007334E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            java.lang.String r2 = "stickerDrawableCache"
            r7 = r12
            if (r0 == 0) goto L45
            if (r12 == 0) goto L52
            java.util.HashMap r8 = r10.A0A
            X.ABd r6 = r10.A00
            if (r6 == 0) goto L57
            X.AoD r3 = new X.AoD
            r3.<init>(r4, r5, r6, r7, r8)
        L28:
            X.BDl r3 = (X.InterfaceC25213BDl) r3
            r10.A04 = r3
            X.ABd r1 = r10.A00
            if (r1 == 0) goto L57
            X.A9B r0 = new X.A9B
            r0.<init>(r1, r12)
            r10.A03 = r0
            X.ABd r1 = r10.A00
            if (r1 == 0) goto L57
            X.AAA r0 = new X.AAA
            r0.<init>(r1, r12, r8)
            r10.A05 = r0
            r10.A01 = r13
            return
        L45:
            java.util.HashMap r8 = r10.A0A
            X.ABd r6 = r10.A00
            if (r6 == 0) goto L57
            X.AoE r3 = new X.AoE
            r9 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L28
        L52:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L57:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9RE.A02(java.lang.String, java.util.List, int, int):void");
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        return true;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A02 = new C199758sR(i4, i5);
        this.A0B.FBm(i, i2, i3, z, i4, i5);
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        InterfaceC25213BDl interfaceC25213BDl = this.A04;
        if (interfaceC25213BDl != null) {
            interfaceC25213BDl.cleanup();
        }
        C22979ABd c22979ABd = this.A00;
        if (c22979ABd != null) {
            c22979ABd.A00.clear();
        }
    }

    public C9RE(Context context, C178747wm c178747wm, C198658qF c198658qF, UserSession userSession) {
        this.A0B = c198658qF;
        this.A06 = context;
        this.A08 = userSession;
        this.A07 = c178747wm;
    }
}
