package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gh2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37607Gh2 {
    public InterfaceC50122Sb A00;
    public InterfaceC50122Sb A01;
    public InterfaceC50122Sb A02;
    public InterfaceC50122Sb A03;
    public boolean A04;
    public boolean A05;
    public final FragmentActivity A06;
    public final AbstractC59962oe A07;
    public final ClipsViewerConfig A08;
    public final BOX A09;
    public final UserSession A0A;
    public final InterfaceC60442pS A0B;
    public final C57602kZ A0C;
    public final InterfaceC43589JPu A0D;
    public final ILW A0E;
    public final InterfaceC31137Dmc A0F;
    public final BKZ A0G;
    public final C37608Gh3 A0H;
    public final boolean A0I;
    public final XDF A0J;
    public final InterfaceC60142ow A0K;
    public final InterfaceC43585JPa A0L;
    public final C26914BuH A0M;
    public final C37671Gi4 A0N;
    public final C37560GgG A0O;

    public C37607Gh2(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, XDF xdf, ClipsViewerConfig clipsViewerConfig, InterfaceC60142ow interfaceC60142ow, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43585JPa interfaceC43585JPa, AnonymousClass388 anonymousClass388, InterfaceC43589JPu interfaceC43589JPu, C37540Gfw c37540Gfw, ILW ilw, AbstractC37552Gg8 abstractC37552Gg8, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC31069DlB interfaceC31069DlB, BKZ bkz, C26914BuH c26914BuH, IG5 ig5, C37671Gi4 c37671Gi4, C37560GgG c37560GgG, boolean z) {
        this.A06 = fragmentActivity;
        this.A07 = abstractC59962oe;
        this.A0A = userSession;
        this.A0B = interfaceC60442pS;
        this.A0E = ilw;
        this.A0D = interfaceC43589JPu;
        this.A0F = interfaceC31137Dmc;
        this.A0G = bkz;
        this.A08 = clipsViewerConfig;
        this.A0L = interfaceC43585JPa;
        this.A0I = z;
        this.A0K = interfaceC60142ow;
        this.A0J = xdf;
        this.A0N = c37671Gi4;
        this.A0M = c26914BuH;
        this.A0O = c37560GgG;
        this.A0C = C57602kZ.A00(userSession);
        this.A0H = new C37608Gh3(fragmentActivity, abstractC59962oe, xdf, clipsViewerConfig, interfaceC60142ow, interfaceC31077DlK, userSession, interfaceC60442pS, interfaceC43585JPa, anonymousClass388, interfaceC43589JPu, c37540Gfw, ilw, abstractC37552Gg8, interfaceC31137Dmc, interfaceC31069DlB, bkz, c26914BuH, this, ig5, c37560GgG);
        this.A09 = (BOX) new C52942bb(fragmentActivity).A00(BOX.class);
    }

    private final void A02(C38321qM c38321qM) {
        C41721Ids.A00.A02(this.A07.requireContext(), this.A0A, c38321qM, this.A0B, C05F.A01, null, null, this.A0D.getSessionId());
    }

    private final void A03(EnumC39627Hel enumC39627Hel, C50674MYs c50674MYs) {
        c50674MYs.A03(new ViewOnClickListenerC42027Ijw(1, enumC39627Hel, this), C37608Gh3.A0V.A03(this.A0A, enumC39627Hel));
    }

    private final boolean A04(C120985dq c120985dq, C38321qM c38321qM) {
        UserSession userSession = this.A0A;
        C08730cb c08730cb = C17060sy.A01;
        if (C14360o3.A0K(c08730cb.A01(userSession), c120985dq.A09(userSession)) && c38321qM.A5P() && !c38321qM.A5U() && c08730cb.A01(userSession).A2I()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4 A[LOOP:0: B:36:0x00de->B:38:0x00e4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(android.view.View r24, X.C120985dq r25, X.C37644Ghd r26) {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37607Gh2.A06(android.view.View, X.5dq, X.Ghd):void");
    }

    private final void A01(C37644Ghd c37644Ghd, C38321qM c38321qM, List list) {
        int i;
        String str;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof C50676MYu) {
                    str = ((C50676MYu) obj).A03;
                } else if (obj instanceof C35200Ffs) {
                    str = ((C35200Ffs) obj).A0A;
                }
                if (str != null) {
                    A1E.add(str);
                }
            }
        }
        InterfaceC60442pS interfaceC60442pS = this.A0B;
        UserSession userSession = this.A0A;
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            i = c75113Zb.getPosition();
        } else {
            i = -1;
        }
        InterfaceC43589JPu interfaceC43589JPu = this.A0D;
        Double d = this.A0N.A01.A00(c38321qM).A0B;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_overflow_menu_impression");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            String A38 = c38321qM.A38();
            if (A38 != null) {
                AbstractC37303Gc4.A0c(A0f, i, Long.parseLong(A38));
                InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
                AbstractC37303Gc4.A0a(A0f);
                A0f.AAk("options", A1E);
                InterfaceC43589JPu.A01(A0f, interfaceC43589JPu);
                AbstractC37302Gc3.A0y(A0f, c38321qM);
                A0f.A8I(AbstractC111324zv.A00(1100), d);
                AbstractC31176DnK.A1I(A0f);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    private final boolean A05(C38321qM c38321qM) {
        C28221Yb A00 = C27S.A00();
        C104234ml A03 = A00.A03();
        UserSession userSession = this.A0A;
        Integer num = C05F.A00;
        BPT bpt = BPT.A04;
        if (!A03.A01(bpt, userSession, c38321qM, num) && A00.A03().A01(bpt, userSession, c38321qM, C05F.A0N)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x04f9, code lost:
    
        if (r5.BZr() == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0750, code lost:
    
        if (X.C14360o3.A0K(r6, true) != false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0240, code lost:
    
        if (r7 != r6) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.view.View r26, X.C120985dq r27, X.C37644Ghd r28, X.C38321qM r29, X.C37607Gh2 r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 2000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37607Gh2.A00(android.view.View, X.5dq, X.Ghd, X.1qM, X.Gh2, boolean, boolean):void");
    }
}
