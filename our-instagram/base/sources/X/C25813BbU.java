package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;
import com.instagram.creation.genai.magicmod.tools.backdrop.viewmodel.MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BbU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25813BbU extends C193578hc {
    public CRU A00;
    public C28224CcU A01;
    public CQN A02;
    public InterfaceC65696TsI A03;
    public final InterfaceC74953Yl A04;
    public final UserSession A05;
    public final CUp A06;
    public final C28374Cfc A07;
    public final CQM A08;
    public final MagicModLaunchParams A09;
    public final C27950CTl A0A;
    public final String A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC24731Iq A0G;
    public final InterfaceC19390xP A0H;
    public final C05A A0I;
    public final C0UO A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static final void A06(C25813BbU c25813BbU, CPB cpb, boolean z) {
        String A0p;
        Object value;
        C26077Bg6 c26077Bg6;
        C77 c77;
        C28224CcU c28224CcU;
        Integer num;
        Application A0D = c25813BbU.A0D();
        C14360o3.A0B(cpb, 1);
        if (!(cpb instanceof C27231Bzq) || (A0p = ((C27231Bzq) cpb).A01) == null) {
            A0p = AbstractC166997dE.A0p(A0D, 2131965935);
        }
        CYI.A01(A0D, A0p, null);
        C05A c05a = c25813BbU.A0I;
        do {
            value = c05a.getValue();
            c26077Bg6 = (C26077Bg6) value;
            if (z) {
                if (c25813BbU.A0L) {
                    c77 = C77.A05;
                } else {
                    c77 = C77.A04;
                }
            } else {
                c77 = C77.A03;
            }
            c28224CcU = c25813BbU.A01;
            if (c28224CcU == null) {
                c28224CcU = c26077Bg6.A04;
            }
            if (!c25813BbU.A0L) {
                num = AbstractC25225BEi.A0v(c05a).A07;
            } else {
                num = C05F.A0C;
            }
        } while (!c05a.AIi(value, C26077Bg6.A00(null, null, c28224CcU, null, c77, c26077Bg6, num, null, 0, 120828, false, false, false)));
    }

    public static final void A08(C25813BbU c25813BbU, List list, int i, boolean z) {
        CPB cpb;
        C38687GzS c38687GzS;
        C28224CcU c28224CcU;
        C38687GzS c38687GzS2;
        Object value;
        String A0p = AbstractC25230BEn.A0p(c25813BbU.A04);
        boolean z2 = false;
        if (A0p.length() != 0) {
            C28224CcU A02 = A00(c25813BbU).A02();
            if (A02 != null && (c38687GzS = A02.A01) != null) {
                C05A c05a = c25813BbU.A0I;
                C51760Mtj c51760Mtj = AbstractC25225BEi.A0v(c05a).A01;
                if (c51760Mtj != null && (c28224CcU = (C28224CcU) c51760Mtj.A00) != null && (c38687GzS2 = c28224CcU.A01) != null) {
                    boolean z3 = c25813BbU.A0L;
                    boolean z4 = !z3;
                    if (z3 && !z) {
                        z2 = true;
                    }
                    if (z4 || z2) {
                        do {
                            value = c05a.getValue();
                        } while (!c05a.AIi(value, C26077Bg6.A02(C77.A06, (C26077Bg6) value)));
                    }
                    c25813BbU.A02 = new CQN(AbstractC25226BEj.A1L(new MagicModBackdropScreenViewModel$onGenerateNewImages$pendingGenerationJob$1(c38687GzS, c38687GzS2, c25813BbU, A0p, list, null, i, z), AbstractC141776au.A00(c25813BbU)), z);
                    return;
                }
                cpb = C27238Bzx.A00;
            } else {
                cpb = C27237Bzw.A00;
            }
            A06(c25813BbU, cpb, z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0115, code lost:
    
        if (X.C18U.A06(r6, r39, 36319888430800655L) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x012c, code lost:
    
        if (X.C18U.A06(r6, r39, 36319888431521558L) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (r0.length() <= 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C25813BbU(android.app.Application r38, com.instagram.common.session.UserSession r39, X.C28374Cfc r40, X.CQM r41, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r42, java.lang.String r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25813BbU.<init>(android.app.Application, com.instagram.common.session.UserSession, X.Cfc, X.CQM, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, java.lang.String, boolean):void");
    }

    public static C27270C1s A00(C25813BbU c25813BbU) {
        return (C27270C1s) c25813BbU.A0D.getValue();
    }

    public static final CRU A01(C25813BbU c25813BbU) {
        C28224CcU c28224CcU = AbstractC25225BEi.A0v(c25813BbU.A0I).A04;
        if (c28224CcU != null) {
            return c28224CcU.A03;
        }
        return null;
    }

    public static final void A02(C25813BbU c25813BbU) {
        Object value;
        String str;
        C05A c05a = c25813BbU.A0I;
        if (AbstractC25225BEi.A0v(c05a).A0F && (str = c25813BbU.A0B) != null) {
            Integer num = C05F.A00;
            C16930sl c16930sl = C16930sl.A00;
            InterfaceC74953Yl interfaceC74953Yl = c25813BbU.A04;
            interfaceC74953Yl.Egh(AbstractC25233BEq.A0G(interfaceC74953Yl, str));
            A07(c25813BbU, num, c16930sl);
            return;
        }
        if (!C18U.A06(C06090Tz.A05, c25813BbU.A05, 36319888432045847L)) {
            A03(c25813BbU);
        }
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C26077Bg6.A03((C26077Bg6) value)));
    }

    public static final void A03(C25813BbU c25813BbU) {
        C28224CcU c28224CcU;
        C38687GzS c38687GzS;
        C51760Mtj c51760Mtj = AbstractC25225BEi.A0v(c25813BbU.A0I).A01;
        if (c51760Mtj != null && (c28224CcU = (C28224CcU) c51760Mtj.A00) != null && (c38687GzS = c28224CcU.A01) != null) {
            AbstractC166987dD.A1Z(new C57171PZp(c38687GzS, c25813BbU, (InterfaceC23621Ds) null, 29), AbstractC141776au.A00(c25813BbU));
        }
    }

    public static final void A05(C25813BbU c25813BbU, CPB cpb) {
        String str;
        Object value;
        CQM cqm = c25813BbU.A08;
        C14360o3.A0B(cpb, 0);
        if (cpb instanceof C27231Bzq) {
            str = ((C27231Bzq) cpb).A00;
            if (str == null) {
                str = "";
            }
        } else if (cpb.equals(C01.A00)) {
            str = "Upload Error: Unable to upload image.";
        } else if (cpb.equals(C27240Bzz.A00)) {
            str = "Saliency Model Error: Saliency detection failed.";
        } else if (cpb.equals(C27234Bzt.A00)) {
            str = "GraphQL Error: Request did not complete successfully.";
        } else if (cpb.equals(C27236Bzv.A00)) {
            str = "GraphQL Error: No generated images returned.";
        } else if (cpb.equals(C27232Bzr.A00)) {
            str = "Download Error: Unable to download generated image(s).";
        } else if (cpb.equals(C27235Bzu.A00)) {
            str = "Download Error: Malformed output from client download service.";
        } else if (cpb.equals(C27233Bzs.A00)) {
            str = "Unknown error: No images generated.";
        } else if (cpb.equals(C27239Bzy.A00)) {
            str = "Timeout: Request timed out.";
        } else if (cpb.equals(C00.A00)) {
            str = "Single Flight error: Request skipped";
        } else if (cpb.equals(C27237Bzw.A00)) {
            str = "Client Error: Missing input image.";
        } else if (cpb.equals(C27238Bzx.A00)) {
            str = "Client Error: Missing input mask.";
        } else {
            throw B4Z.A00();
        }
        String A04 = AnonymousClass001.A04(cpb.A00, ": ", str);
        Number number = (Number) cqm.A01.getAndSet(null);
        if (number != null) {
            int intValue = number.intValue();
            C006802i c006802i = cqm.A00;
            c006802i.markerAnnotate(792330241, intValue, "error", "segmentation_failed");
            if (A04 != null) {
                c006802i.markerAnnotate(792330241, intValue, AbstractC43591JPw.A00(966), C00Q.A03(A04, 200));
            }
            c006802i.markerEnd(792330241, intValue, (short) 3);
        }
        C05A c05a = c25813BbU.A0I;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C26077Bg6.A02(C77.A08, (C26077Bg6) value)));
        Application A0D = c25813BbU.A0D();
        CYI.A01(A0D, AbstractC166997dE.A0p(A0D, 2131965970), A0D.getString(2131965969));
    }

    public static final void A07(C25813BbU c25813BbU, Integer num, List list) {
        int A07;
        c25813BbU.A07.A07(null, num, AbstractC25230BEn.A0p(c25813BbU.A04));
        if (AbstractC25225BEi.A0v(c25813BbU.A0I).A0D) {
            A07 = 1;
        } else {
            boolean z = c25813BbU.A0L;
            A07 = AbstractC25225BEi.A07(C06090Tz.A05, c25813BbU.A05, 36601363408097449L);
            if (z) {
                A07 -= list.size();
            }
        }
        A08(c25813BbU, list, A07, false);
    }

    public static final void A09(C25813BbU c25813BbU, List list, boolean z) {
        Object value;
        C26077Bg6 c26077Bg6;
        C77 c77;
        Integer num;
        if (!z) {
            A00(c25813BbU).A03();
        }
        C27270C1s A00 = A00(c25813BbU);
        C05A c05a = c25813BbU.A0I;
        A00.A04(new C50627MWo(41, AbstractC25225BEi.A0v(c05a).A01, AbstractC25225BEi.A0v(c05a).A05), list);
        do {
            value = c05a.getValue();
            c26077Bg6 = (C26077Bg6) value;
            boolean z2 = c25813BbU.A0L;
            if (z2) {
                c77 = C77.A05;
            } else {
                c77 = C77.A04;
            }
            if (!z2) {
                num = AbstractC25225BEi.A0v(c05a).A07;
            } else {
                if (!z) {
                    if (C18U.A06(C06090Tz.A05, c25813BbU.A05, 36319888432373531L)) {
                        num = C05F.A01;
                    }
                }
                num = C05F.A0N;
            }
        } while (!c05a.AIi(value, C26077Bg6.A01(null, c77, c26077Bg6, num, 116734)));
    }

    public final void A0E() {
        Integer num;
        C05A c05a = this.A0I;
        if (AbstractC25225BEi.A0v(c05a).A06 == C77.A04 || AbstractC25225BEi.A0v(c05a).A06 == C77.A05) {
            if (AbstractC25225BEi.A0v(c05a).A06 == C77.A05) {
                int i = 0;
                Iterator it = AbstractC25225BEi.A0v(c05a).A08.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C14360o3.A0K(it.next(), AbstractC25225BEi.A0v(c05a).A04)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            this.A07.A06(A01(this), num);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (X.C14360o3.A0K(r1, r8.A03) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F() {
        /*
            r8 = this;
            X.TsI r0 = r8.A03
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L36
            X.05A r0 = r8.A0I
            X.Bg6 r0 = X.AbstractC25225BEi.A0v(r0)
            X.Mtj r0 = r0.A01
            if (r0 == 0) goto L34
            java.lang.Object r1 = r0.A02
        L17:
            X.TsI r0 = r8.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L36
        L1f:
            X.Cfc r0 = r8.A07
            X.CRU r1 = r8.A00
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r6 = "MAGIC_MOD_BACKDROP_NEXT"
            r3 = 0
            r4 = r3
            r5 = r3
            r7 = r3
            X.C28374Cfc.A00(r0, r1, r2, r3, r4, r5, r6, r7)
            A02(r8)
            return
        L34:
            r1 = 0
            goto L17
        L36:
            r2 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25813BbU.A0F():void");
    }

    public static final void A04(C25813BbU c25813BbU) {
        C38687GzS c38687GzS;
        Object value;
        C28224CcU A02 = A00(c25813BbU).A02();
        if (A02 != null && (c38687GzS = A02.A01) != null) {
            C05A c05a = c25813BbU.A0I;
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C26077Bg6.A02(C77.A07, (C26077Bg6) value)));
            c25813BbU.A02 = new CQN(AbstractC23641Du.A04(C12L.A00.AOT(1242107527, 3), new C57171PZp(c38687GzS, c25813BbU, (InterfaceC23621Ds) null, 30), AbstractC141776au.A00(c25813BbU)), false);
            return;
        }
        A05(c25813BbU, C27237Bzw.A00);
    }
}
