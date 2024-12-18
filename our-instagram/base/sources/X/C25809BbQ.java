package X;

import android.app.Application;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.imagine.creation.impl.data.ImagineEditRepository;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import java.util.List;

/* renamed from: X.BbQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25809BbQ extends C193578hc {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C28178CbQ A03;
    public final C28283CdV A04;
    public final ImagineEditRepository A05;
    public final CWR A06;
    public final InterfaceC16660sJ A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final C0UO A0E;
    public final boolean A0F;
    public final InterfaceC19390xP A0G;
    public final C05A A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25809BbQ(Application application, FoaUserSession foaUserSession, C28283CdV c28283CdV, CWR cwr, InterfaceC16660sJ interfaceC16660sJ, InterfaceC19390xP interfaceC19390xP) {
        super(application);
        AbstractC167027dH.A0a(1, application, foaUserSession, cwr, c28283CdV);
        AbstractC25229BEm.A1I(interfaceC19390xP, 5, interfaceC16660sJ);
        this.A06 = cwr;
        this.A04 = c28283CdV;
        this.A0G = interfaceC19390xP;
        this.A07 = interfaceC16660sJ;
        this.A03 = new C28178CbQ(foaUserSession, cwr);
        C008002u A1H = AbstractC25225BEi.A1H(new C28272CdH(null, null, false, false, false, true));
        this.A0H = A1H;
        this.A0D = A1H;
        boolean A1X = AbstractC167007dF.A1X(cwr.A08, C05F.A0C);
        this.A0F = A1X;
        C008002u A00 = C10E.A00(C4B.A00);
        this.A0A = A00;
        this.A0E = AbstractC208910l.A02(A00);
        float A002 = A00(this);
        AbstractC27454C9w abstractC27454C9w = C3T.A00;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C45(C29492Cz6.A00, abstractC27454C9w, null, null, null, A002, false, false, true));
        this.A09 = A1H2;
        this.A0C = A1H2;
        C008002u A003 = C10E.A00(A1X ? C3U.A00 : abstractC27454C9w);
        this.A08 = A003;
        this.A0B = A003;
        this.A02 = true;
        ImagineEditRepository imagineEditRepository = new ImagineEditRepository(c28283CdV, cwr.A01, new ImagineNetworkService(application, foaUserSession, cwr.A02), AbstractC141776au.A00(this), cwr.A0N, cwr.A0O);
        this.A05 = imagineEditRepository;
        CWH cwh = cwr.A03;
        if (cwh != null) {
            AbstractC23641Du.A05(C12P.A00, new PZQ(application, this, cwh.A04, null, 42), AbstractC141776au.A00(this));
        }
        C0UO c0uo = imagineEditRepository.A06;
        C30486DbV c30486DbV = new C30486DbV(16, cwh, this);
        C141796aw A004 = AbstractC141776au.A00(this);
        C57168PZm c57168PZm = new C57168PZm(c0uo, c30486DbV, this, (InterfaceC23621Ds) null, 49);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c57168PZm, A004);
        AbstractC23641Du.A05(anonymousClass191, new C57168PZm(interfaceC19390xP, new C30506Dbp(this, 5), this, (InterfaceC23621Ds) null, 49), AbstractC141776au.A00(this));
    }

    public static final float A00(C25809BbQ c25809BbQ) {
        Integer num;
        CWR cwr = c25809BbQ.A06;
        CWH cwh = cwr.A03;
        if (cwh != null && (num = cwh.A02) != null) {
            float intValue = num.intValue();
            Integer num2 = cwh.A01;
            if (num2 != null) {
                float intValue2 = num2.intValue();
                if (intValue != 0.0f && intValue2 != 0.0f) {
                    return intValue / intValue2;
                }
            }
        }
        return cwr.A01.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0013, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C25809BbQ r8, java.lang.Boolean r9, java.lang.String r10) {
        /*
            X.05A r2 = r8.A0H
            X.CWR r0 = r8.A06
            X.CdF r1 = r0.A04
            if (r1 == 0) goto Lc
            boolean r0 = r1.A03
            if (r0 != 0) goto L15
        Lc:
            if (r9 == 0) goto L2b
            boolean r0 = r9.booleanValue()
        L12:
            r6 = 0
            if (r0 == 0) goto L16
        L15:
            r6 = 1
        L16:
            r5 = 0
            if (r1 == 0) goto L28
            boolean r8 = r1.A02
            boolean r9 = r1.A04
        L1d:
            r7 = 0
            X.CdH r3 = new X.CdH
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.F8m(r3)
            return
        L28:
            r8 = 0
            r9 = 1
            goto L1d
        L2b:
            java.lang.Object r0 = r2.getValue()
            X.CdH r0 = (X.C28272CdH) r0
            boolean r0 = r0.A03
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25809BbQ.A01(X.BbQ, java.lang.Boolean, java.lang.String):void");
    }

    public final void A0E(AbstractC27455C9x abstractC27455C9x) {
        QuickPerformanceLogger quickPerformanceLogger;
        int i;
        Object value;
        C29491Cz5 c29491Cz5;
        C27304C3l c27304C3l;
        CWM cwm;
        boolean z;
        boolean z2;
        AbstractC27454C9w abstractC27454C9w;
        float f;
        C05A c05a;
        int i2;
        List list;
        Object value2;
        C29491Cz5 c29491Cz52;
        C27312C3t c27312C3t;
        CWM cwm2;
        String str;
        boolean z3;
        boolean z4;
        AbstractC27454C9w abstractC27454C9w2;
        float f2;
        C19L c19l;
        InterfaceC16620sF c57157PZb;
        CWM cwm3;
        Object value3;
        String A0C;
        C3U c3u;
        CWM cwm4;
        boolean z5;
        boolean z6;
        InterfaceC30841DhG interfaceC30841DhG;
        AbstractC27455C9x abstractC27455C9x2;
        boolean z7;
        float f3;
        Object value4;
        C29491Cz5 c29491Cz53;
        C3V c3v;
        CWM cwm5;
        String str2;
        boolean z8;
        boolean z9;
        AbstractC27454C9w abstractC27454C9w3;
        float f4;
        if (abstractC27455C9x instanceof C27308C3p) {
            C28283CdV c28283CdV = this.A04;
            c28283CdV.A04("rendered");
            quickPerformanceLogger = c28283CdV.A00;
            if (quickPerformanceLogger != null) {
                i = 325724260;
            } else {
                return;
            }
        } else {
            if (abstractC27455C9x instanceof C3V) {
                CWM cwm6 = ((C3V) abstractC27455C9x).A00;
                C28283CdV c28283CdV2 = this.A04;
                QuickPerformanceLogger quickPerformanceLogger2 = c28283CdV2.A00;
                if (quickPerformanceLogger2 != null) {
                    quickPerformanceLogger2.markerStart(325726718);
                }
                if (quickPerformanceLogger2 != null) {
                    quickPerformanceLogger2.markerPoint(325726718, "query_begin");
                }
                CWR cwr = c28283CdV2.A01;
                c28283CdV2.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, cwr.A02.A00);
                c28283CdV2.A06("surface_session_id", cwr.A0C);
                c28283CdV2.A06("bottom_sheet_session_id", cwr.A0B);
                C28178CbQ.A00(C8R.GENERATED, this.A03, "animate_button_click");
                C05A c05a2 = this.A09;
                do {
                    value4 = c05a2.getValue();
                    C45 c45 = (C45) value4;
                    c29491Cz53 = C29491Cz5.A00;
                    c3v = new C3V(cwm6);
                    cwm5 = c45.A04;
                    str2 = c45.A05;
                    z8 = c45.A08;
                    z9 = c45.A07;
                    abstractC27454C9w3 = c45.A02;
                    f4 = c45.A00;
                    AbstractC167017dG.A1S(abstractC27454C9w3, c29491Cz53);
                } while (!c05a2.AIi(value4, new C45(c29491Cz53, abstractC27454C9w3, c3v, cwm5, str2, f4, z8, z9, false)));
                A01(this, AbstractC166997dE.A0b(), null);
                ImagineEditRepository imagineEditRepository = this.A05;
                C14360o3.A0B(cwm6, 0);
                AbstractC166987dD.A1Z(new C57157PZb(cwm6, imagineEditRepository, (InterfaceC23621Ds) null, 47), imagineEditRepository.A04);
                return;
            }
            if (abstractC27455C9x instanceof C3X) {
                String str3 = ((C3X) abstractC27455C9x).A00;
                A01(this, null, AnonymousClass001.A0C(str3, ' '));
                C05A c05a3 = this.A09;
                do {
                    value3 = c05a3.getValue();
                    C45 c452 = (C45) value3;
                    A0C = AnonymousClass001.A0C(str3, ' ');
                    c3u = C3U.A00;
                    cwm4 = c452.A04;
                    z5 = c452.A08;
                    z6 = c452.A07;
                    interfaceC30841DhG = c452.A01;
                    abstractC27455C9x2 = c452.A03;
                    z7 = c452.A06;
                    f3 = c452.A00;
                    AbstractC167017dG.A1S(c3u, interfaceC30841DhG);
                } while (!c05a3.AIi(value3, new C45(interfaceC30841DhG, c3u, abstractC27455C9x2, cwm4, A0C, f3, z5, z6, z7)));
                return;
            }
            if (abstractC27455C9x instanceof C27312C3t) {
                this.A04.A01();
                C28178CbQ.A00(C8R.GENERATED, this.A03, "regenerate_button_click");
                C05A c05a4 = this.A09;
                do {
                    value2 = c05a4.getValue();
                    C45 c453 = (C45) value2;
                    c29491Cz52 = C29491Cz5.A00;
                    c27312C3t = C27312C3t.A00;
                    cwm2 = c453.A04;
                    str = c453.A05;
                    z3 = c453.A08;
                    z4 = c453.A07;
                    abstractC27454C9w2 = c453.A02;
                    f2 = c453.A00;
                    AbstractC167017dG.A1S(abstractC27454C9w2, c29491Cz52);
                } while (!c05a4.AIi(value2, new C45(c29491Cz52, abstractC27454C9w2, c27312C3t, cwm2, str, f2, z3, z4, false)));
                A01(this, AbstractC166997dE.A0b(), null);
                ImagineEditRepository imagineEditRepository2 = this.A05;
                C28269CdE A00 = ImagineEditRepository.A00(imagineEditRepository2);
                if (A00 == null) {
                    return;
                }
                if (A00.A04) {
                    CWM cwm7 = A00.A01;
                    if (cwm7 == null || (cwm3 = A00.A02) == null) {
                        return;
                    }
                    String str4 = A00.A03;
                    c19l = imagineEditRepository2.A04;
                    c57157PZb = new MVR(cwm7, imagineEditRepository2, cwm3, str4, (InterfaceC23621Ds) null, 25);
                } else {
                    CWM cwm8 = A00.A01;
                    if (cwm8 == null) {
                        return;
                    }
                    c19l = imagineEditRepository2.A04;
                    c57157PZb = new C57157PZb(cwm8, imagineEditRepository2, (InterfaceC23621Ds) null, 48);
                }
                AbstractC166987dD.A1Z(c57157PZb, c19l);
                return;
            }
            if (abstractC27455C9x instanceof C27317C3y) {
                C28178CbQ.A00(C8R.GENERATED, this.A03, "undo_button_click");
                ImagineEditRepository imagineEditRepository3 = this.A05;
                imagineEditRepository3.A03();
                c05a = imagineEditRepository3.A05;
                int i3 = ((C28258Cd3) c05a.getValue()).A00;
                if (i3 <= 0) {
                    return;
                }
                i2 = i3 - 1;
                list = ((C28258Cd3) c05a.getValue()).A01;
            } else if (abstractC27455C9x instanceof C27311C3s) {
                C28178CbQ.A00(C8R.GENERATED, this.A03, "redo_button_click");
                c05a = this.A05.A05;
                int i4 = ((C28258Cd3) c05a.getValue()).A00;
                if (i4 >= ((C28258Cd3) c05a.getValue()).A01.size()) {
                    return;
                }
                i2 = i4 + 1;
                list = ((C28258Cd3) c05a.getValue()).A01;
            } else {
                if (abstractC27455C9x instanceof C27309C3q) {
                    AbstractC27455C9x abstractC27455C9x3 = ((C45) this.A09.getValue()).A03;
                    if (abstractC27455C9x3 == null) {
                        return;
                    }
                    A0E(abstractC27455C9x3);
                    return;
                }
                if (abstractC27455C9x instanceof C27304C3l) {
                    String obj = ((C27304C3l) abstractC27455C9x).A01.toString();
                    this.A00 = true;
                    this.A02 = true;
                    String A1A = AbstractC25228BEl.A1A(obj);
                    this.A04.A01();
                    C28178CbQ.A00(C8R.GENERATED, this.A03, "generate_button_click");
                    if (AbstractC001900j.A0T(A1A)) {
                        return;
                    }
                    C05A c05a5 = this.A09;
                    CWM cwm9 = ((C45) c05a5.getValue()).A04;
                    if (cwm9 == null) {
                        return;
                    }
                    do {
                        value = c05a5.getValue();
                        C45 c454 = (C45) value;
                        c29491Cz5 = C29491Cz5.A00;
                        c27304C3l = new C27304C3l(null, A1A, null);
                        cwm = c454.A04;
                        z = c454.A08;
                        z2 = c454.A07;
                        abstractC27454C9w = c454.A02;
                        f = c454.A00;
                        AbstractC167017dG.A1S(abstractC27454C9w, c29491Cz5);
                    } while (!c05a5.AIi(value, new C45(c29491Cz5, abstractC27454C9w, c27304C3l, cwm, null, f, z, z2, false)));
                    ImagineEditRepository imagineEditRepository4 = this.A05;
                    C14360o3.A0B(A1A, 1);
                    AbstractC166987dD.A1Z(new PZQ(cwm9, imagineEditRepository4, A1A, null, 40), imagineEditRepository4.A04);
                    A01(this, true, null);
                    return;
                }
                if (abstractC27455C9x instanceof C27300C3g) {
                    String.valueOf(((C27300C3g) abstractC27455C9x).A00);
                    if (!this.A02) {
                        return;
                    }
                    C28178CbQ.A00(C8R.GENERATED, this.A03, "begin_typing");
                    this.A02 = false;
                    return;
                }
                if (abstractC27455C9x instanceof C27310C3r) {
                    C28178CbQ c28178CbQ = this.A03;
                    C28172CbJ c28172CbJ = c28178CbQ.A02;
                    EnumC72434Xde A002 = AbstractC72653Xjv.A00(c28178CbQ.A01.A02);
                    C8f c8f = C8f.EDIT;
                    AbstractC167007dF.A1D(A002, 0, c8f);
                    C28172CbJ.A00(c8f, A002, c28172CbJ, "feedback_menu_click", null);
                    return;
                }
                if (abstractC27455C9x instanceof C27307C3o) {
                    quickPerformanceLogger = this.A04.A00;
                    if (quickPerformanceLogger == null) {
                        return;
                    }
                    i = 325726718;
                    quickPerformanceLogger.markerPoint(325726718, "rendered");
                } else {
                    this.A07.invoke(abstractC27455C9x);
                    return;
                }
            }
            c05a.Egh(new C28258Cd3(list, i2));
            return;
        }
        quickPerformanceLogger.markerEnd(i, (short) 2);
    }
}
