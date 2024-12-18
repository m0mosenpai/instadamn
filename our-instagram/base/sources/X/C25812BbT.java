package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BbT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25812BbT extends C193578hc {
    public int A00;
    public EnumC27371C6a A01;
    public AbstractC27456C9y A02;
    public AbstractC27457C9z A03;
    public CWM A04;
    public InterfaceC30845DhK A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final Application A0A;
    public final FoaUserSession A0B;
    public final C28178CbQ A0C;
    public final C28426CgY A0D;
    public final C28362CfM A0E;
    public final C28283CdV A0F;
    public final ImagineGenerationImageRepository A0G;
    public final C54797OJq A0H;
    public final CWR A0I;
    public final C01U A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final C0UO A0R;
    public final C0UO A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final ImagineNetworkService A0V;
    public final MetaAIFeedbackNetworkService A0W;
    public final Integer A0X;
    public final List A0Y;
    public final InterfaceC19390xP A0Z;
    public final C05A A0a;
    public final String[] A0b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC28057CYl.A00(r29.A0B), 36325763944166748L) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25812BbT(android.app.Application r30, com.meta.foa.session.FoaUserSession r31, X.C28426CgY r32, X.C28362CfM r33, X.C28283CdV r34, X.CWR r35, X.InterfaceC19390xP r36) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25812BbT.<init>(android.app.Application, com.meta.foa.session.FoaUserSession, X.CgY, X.CfM, X.CdV, X.CWR, X.0xP):void");
    }

    public static String A01(String str) {
        char upperCase = Character.toUpperCase(str.charAt(0));
        String substring = str.substring(1);
        C14360o3.A07(substring);
        return AnonymousClass001.A0D(substring, upperCase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r15.A01 != X.C05F.A0N) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C25812BbT r14, X.CWM r15, X.C28275CdK r16, int r17, boolean r18, boolean r19) {
        /*
            r13 = r14
            X.CWR r0 = r14.A0I
            boolean r0 = r0.A0M
            r9 = 1
            r12 = r15
            if (r0 == 0) goto L23
            if (r19 != 0) goto L23
            X.CgY r2 = r14.A0D
            java.lang.String r3 = r14.A06
            boolean r0 = r14.A0T
            if (r0 == 0) goto L1a
            java.lang.Integer r1 = r15.A01
            java.lang.Integer r0 = X.C05F.A0N
            r6 = 1
            if (r1 == r0) goto L1b
        L1a:
            r6 = 0
        L1b:
            r4 = 0
            boolean r7 = r15.A0D
            r5 = r17
            r2.A04(r3, r4, r5, r6, r7)
        L23:
            X.CgY r3 = r14.A0D
            java.lang.String r5 = r14.A06
            boolean r0 = r14.A0T
            if (r0 == 0) goto L59
            java.lang.Integer r1 = r15.A01
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L59
        L31:
            r10 = 0
            X.C14360o3.A0B(r5, r10)
            java.lang.String r4 = "media_creation_finish"
            r2 = 0
            r7 = -1
            r8 = r18
            r6 = r2
            r11 = r10
            X.C28426CgY.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.C6a r0 = X.EnumC27371C6a.A02
            r14.A01 = r0
            X.6aw r1 = X.AbstractC141776au.A00(r14)
            X.12T r0 = X.C12P.A01
            r15 = 6
            X.PZ2 r10 = new X.PZ2
            r11 = r16
            r14 = r2
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.AbstractC23641Du.A05(r0, r10, r1)
            return
        L59:
            r9 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25812BbT.A04(X.BbT, X.CWM, X.CdK, int, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        if (r15 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012f, code lost:
    
        if (r25.A01 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        if (r5 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C25812BbT r23, X.C29509CzN r24, X.C28275CdK r25, java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25812BbT.A05(X.BbT, X.CzN, X.CdK, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r1.A03 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06(java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            r5 = 0
            r4 = r11
            if (r11 == 0) goto L38
            java.lang.String r1 = X.AbstractC25228BEl.A1A(r11)
        L8:
            if (r12 == 0) goto L36
            java.lang.String r0 = X.AbstractC25228BEl.A1A(r12)
        Le:
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L15
            r5 = r12
        L15:
            X.05A r2 = r10.A0M
            X.CWR r0 = r10.A0I
            X.CdF r1 = r0.A04
            if (r1 == 0) goto L22
            boolean r0 = r1.A03
            r6 = 1
            if (r0 != 0) goto L31
        L22:
            r6 = 0
            if (r1 != 0) goto L31
            r8 = 0
            r9 = 1
        L27:
            X.CdH r3 = new X.CdH
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.F8m(r3)
            return
        L31:
            boolean r8 = r1.A02
            boolean r9 = r1.A04
            goto L27
        L36:
            r0 = r5
            goto Le
        L38:
            r1 = r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25812BbT.A06(java.lang.String, java.lang.String, boolean):void");
    }

    private final void A07(InterfaceC16620sF interfaceC16620sF, InterfaceC19390xP interfaceC19390xP) {
        AbstractC166987dD.A1Z(new C57168PZm(interfaceC19390xP, interfaceC16620sF, this, (InterfaceC23621Ds) null, 48), AbstractC141776au.A00(this));
    }

    public static final boolean A08(C25812BbT c25812BbT, String str) {
        if (str != null) {
            List list = c25812BbT.A0Y;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C11L) it.next()).A08(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0075, code lost:
    
        if (r32 != null) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Type inference failed for: r17v1, types: [X.CW0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.CW0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C8XE A00(X.C25812BbT r30, X.CWM r31, X.C28275CdK r32, java.lang.String r33, java.lang.String r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25812BbT.A00(X.BbT, X.CWM, X.CdK, java.lang.String, java.lang.String, boolean):X.8XE");
    }

    public static final void A02(C25812BbT c25812BbT, AbstractC27456C9y abstractC27456C9y, boolean z) {
        C40 c40;
        C28002CVz c28002CVz;
        C01U c01u = c25812BbT.A0J;
        if (!c01u.isEmpty() && c01u.A0O().getClass() == abstractC27456C9y.getClass()) {
            c01u.removeFirst();
        }
        if (c01u.isEmpty() && z) {
            c01u.addFirst(new C27318C3z(c25812BbT.A05));
        }
        c01u.addFirst(abstractC27456C9y);
        C05A c05a = c25812BbT.A0a;
        do {
        } while (!c05a.AIi(c05a.getValue(), abstractC27456C9y));
        if ((abstractC27456C9y instanceof C40) && (c28002CVz = (c40 = (C40) abstractC27456C9y).A00) != null) {
            c25812BbT.A06(c28002CVz.A01, c40.A02, false);
        }
    }

    public static final void A03(C25812BbT c25812BbT, AbstractC27457C9z abstractC27457C9z) {
        C05A c05a = c25812BbT.A0L;
        do {
        } while (!c05a.AIi(c05a.getValue(), abstractC27457C9z));
    }

    public final void A0E() {
        String str;
        C09530e4 c09530e4;
        C28275CdK c28275CdK;
        CWR cwr = this.A0I;
        if (cwr.A0O) {
            ImagineGenerationImageRepository imagineGenerationImageRepository = this.A0G;
            InterfaceC09390do interfaceC09390do = imagineGenerationImageRepository.A0B;
            if (((BUS) interfaceC09390do.getValue()).A01 != null) {
                String str2 = null;
                if (AbstractC167007dF.A1W(((BUS) interfaceC09390do.getValue()).A00)) {
                    A03(this, new C47(null, false));
                    ((BUS) interfaceC09390do.getValue()).A00 = null;
                    return;
                }
                C28002CVz c28002CVz = (C28002CVz) imagineGenerationImageRepository.A0E.getValue();
                A03(this, C4A.A00);
                if (!imagineGenerationImageRepository.A0H) {
                    c28275CdK = null;
                } else {
                    c28275CdK = ((BUS) interfaceC09390do.getValue()).A02;
                }
                A02(this, new C40(c28002CVz, c28275CdK, null, cwr.A0Q, false), true);
                if (c28002CVz != null) {
                    str2 = c28002CVz.A01;
                }
                A06(str2, null, false);
                BUS bus = (BUS) interfaceC09390do.getValue();
                bus.A00 = null;
                bus.A01 = null;
                bus.A02 = null;
                return;
            }
        }
        int intValue = this.A0X.intValue();
        if (intValue != 0) {
            if (intValue != 1 && intValue != 2) {
                throw B4Z.A00();
            }
            CWH cwh = cwr.A03;
            if (cwh == null) {
                return;
            }
            String str3 = cwh.A03;
            String str4 = cwh.A04;
            String str5 = cwh.A05;
            boolean z = cwh.A06;
            if (str5 == null) {
                str5 = "";
            }
            Integer num = C05F.A01;
            Integer num2 = cwh.A02;
            Integer num3 = cwh.A01;
            if (num2 != null && num3 != null) {
                c09530e4 = AbstractC166987dD.A1L(num2, num3);
            } else if (cwr.A01 == C7N.A04) {
                c09530e4 = ImagineNetworkService.A08;
            } else {
                c09530e4 = ImagineNetworkService.A07;
            }
            A03(this, new C47(new CWM(null, num, C05F.A00, str4, str3, str5, null, null, null, null, null, null, c09530e4, false), z));
            return;
        }
        A03(this, C4A.A00);
        D51.A02(this, AbstractC141776au.A00(this), 12);
        C28270CdF c28270CdF = cwr.A04;
        if (c28270CdF != null && (str = c28270CdF.A01) != null) {
            if (str.length() > 0) {
                str = A01(str);
            }
            if (str != null && str.length() != 0) {
                String str6 = c28270CdF.A00;
                A05(this, null, null, str, str6);
                A06(str, str6, false);
                return;
            }
        }
        A02(this, new C27318C3z(C29511CzP.A00), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02e4, code lost:
    
        if (r6.A02.A01 != X.C05F.A0N) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0187, code lost:
    
        if (r5.A01 != X.C05F.A0N) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f9, code lost:
    
        if (r17.A0U != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0203, code lost:
    
        if (r6 == false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.AbstractC27455C9x r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25812BbT.A0F(X.C9x, boolean):void");
    }

    public final void A0G(C27990CVn c27990CVn, boolean z) {
        C28172CbJ c28172CbJ;
        EnumC72434Xde A00;
        C8f c8f;
        if (z) {
            C28178CbQ c28178CbQ = this.A0C;
            c28172CbJ = c28178CbQ.A02;
            A00 = AbstractC72653Xjv.A00(c28178CbQ.A01.A02);
            c8f = C8f.EDIT;
        } else {
            C28426CgY c28426CgY = this.A0D;
            c28172CbJ = c28426CgY.A02;
            A00 = C28426CgY.A00(c28426CgY);
            c8f = C8f.CREATE;
        }
        C14360o3.A0B(A00, 0);
        C28172CbJ.A00(c8f, A00, c28172CbJ, "negative_feedback_click", null);
        A03(this, new C4D(c27990CVn));
    }

    public final boolean A0H() {
        C28426CgY.A02(this.A0D, "back_button_tap", "suggested", -1, false);
        if (!(this.A02 instanceof C27318C3z)) {
            C01U c01u = this.A0J;
            if (!c01u.isEmpty()) {
                if (c01u.size() == 1) {
                    if (this.A02 instanceof C40) {
                        this.A0E.A02("dropped_off_from_results_screen");
                    }
                    A03(this, C49.A00);
                } else {
                    c01u.removeFirst();
                    Object A0P = c01u.A0P();
                    if ((A0P instanceof C44) || (A0P instanceof C41) || (A0P instanceof C43)) {
                        A06(null, null, false);
                        c01u.removeFirst();
                    }
                    if (AbstractC25226BEj.A1b(c01u)) {
                        AbstractC27456C9y abstractC27456C9y = (AbstractC27456C9y) c01u.removeFirst();
                        if (A0P instanceof C27318C3z) {
                            this.A0H.A00();
                            A06(null, null, false);
                        }
                        if (abstractC27456C9y instanceof C27318C3z) {
                            this.A08 = false;
                            List list = this.A0G.A0A;
                            if (!AbstractC166987dD.A1b(list)) {
                                if (!AbstractC166987dD.A1b(list)) {
                                    D51.A02(this, AbstractC141776au.A00(this), 12);
                                }
                                A02(this, new C27318C3z(this.A05), false);
                                return true;
                            }
                        }
                        A02(this, abstractC27456C9y, false);
                        return true;
                    }
                }
                return true;
            }
        }
        this.A0E.A02("dropped_off_from_icebreakers_screen");
        A03(this, C49.A00);
        return false;
    }
}
