package X;

import com.facebook.R;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.Map;

/* renamed from: X.Jmu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44550Jmu extends AbstractC52922bZ {
    public final LLN A00;
    public final C47702L4j A01;
    public final C104234ml A02;
    public final UserSession A03;
    public final OnboardingRepository A04;
    public final MonetizationRepository A05;
    public final InterfaceC09390do A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final InterfaceC19390xP A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C46605Kji A0E;

    public final C56479P5t A02(C51733MtG c51733MtG, JWd jWd) {
        Integer valueOf;
        Integer valueOf2;
        int i;
        C14360o3.A0B(c51733MtG, 0);
        MonetizationEligibilityDecision monetizationEligibilityDecision = (MonetizationEligibilityDecision) c51733MtG.A01;
        int ordinal = monetizationEligibilityDecision.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                if (ordinal != 3 && ordinal != 4) {
                    throw AbstractC37303Gc4.A0M(monetizationEligibilityDecision, "Unsupported eligibility decision type ", AbstractC166987dD.A1C());
                }
                valueOf = Integer.valueOf(R.drawable.instagram_circle_x_pano_outline_24);
                valueOf2 = Integer.valueOf(R.attr.igds_color_error_or_destructive);
                i = 2131953094;
            } else {
                valueOf = Integer.valueOf(R.drawable.instagram_warning_pano_outline_24);
                valueOf2 = Integer.valueOf(R.attr.igds_color_gradient_orange);
                i = 2131953091;
            }
        } else {
            valueOf = Integer.valueOf(R.drawable.instagram_circle_check_pano_outline_24);
            valueOf2 = Integer.valueOf(R.attr.igds_color_success);
            i = 2131953092;
        }
        Integer valueOf3 = Integer.valueOf(i);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        int intValue3 = valueOf3.intValue();
        return new C56479P5t(new ViewOnClickListenerC48068LPt(0, this, jWd, c51733MtG), null, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3), null, null, null, null, null, C57381Pdf.A00, false, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r12.A02 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A03(X.C51733MtG r12, X.JWd r13) {
        /*
            r11 = this;
            r1 = 0
            X.C14360o3.A0B(r12, r1)
            boolean r9 = r12.A05
            if (r9 != 0) goto Lf
            boolean r0 = r12.A04
            if (r0 != 0) goto Lf
            X.0sl r0 = X.C16930sl.A00
            return r0
        Lf:
            X.01L r2 = X.C0eM.A1I()
            r10 = 1
            if (r9 == 0) goto L1b
            boolean r0 = r12.A02
            r8 = 1
            if (r0 != 0) goto L1c
        L1b:
            r8 = 0
        L1c:
            X.P3U r5 = new X.P3U
            r5.<init>(r1, r13, r11, r12)
            r4 = 0
            r6 = 2131430701(0x7f0b0d2d, float:1.848311E38)
            r7 = 2131953102(0x7f1305ce, float:1.9542666E38)
            X.P5r r3 = new X.P5r
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.add(r3)
            if (r9 == 0) goto L4c
            X.4ml r3 = r11.A02
            java.lang.Integer r1 = X.C05F.A0Y
            com.instagram.common.session.UserSession r0 = r11.A03
            boolean r0 = r3.A03(r0, r1, r10)
            r1 = 2131953103(0x7f1305cf, float:1.9542668E38)
            if (r0 == 0) goto L44
            r1 = 2131953104(0x7f1305d0, float:1.954267E38)
        L44:
            X.LuX r0 = new X.LuX
            r0.<init>(r1)
            r2.add(r0)
        L4c:
            X.01L r0 = X.C0eM.A1J(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44550Jmu.A03(X.MtG, X.JWd):java.util.List");
    }

    public C44550Jmu(LLN lln, C46605Kji c46605Kji, C47702L4j c47702L4j, C104234ml c104234ml, UserSession userSession, OnboardingRepository onboardingRepository, MonetizationRepository monetizationRepository) {
        boolean A1a = AbstractC31175DnJ.A1a(monetizationRepository);
        C14360o3.A0B(onboardingRepository, 4);
        AbstractC167017dG.A1U(lln, c104234ml);
        this.A03 = userSession;
        this.A01 = c47702L4j;
        this.A05 = monetizationRepository;
        this.A04 = onboardingRepository;
        this.A0E = c46605Kji;
        this.A00 = lln;
        this.A02 = c104234ml;
        this.A06 = C50250MHf.A00(this, 4);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A07 = A12;
        this.A08 = AbstractC07080Za.A03(A12);
        C008002u A1A = AbstractC25235BEs.A1A(A1a);
        this.A0C = A1A;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A0A = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A0B = A1H2;
        C008002u A00 = C10E.A00(null);
        this.A0D = A00;
        this.A09 = new C16400rl(new MCD(34, null), C10Q.A02(new D5O(this, null, A1a ? 1 : 0), A1A, A1H, new C43817JZf(new C15340po(new MBr(this, null, 33), this.A05.A0F), A1a ? 1 : 0), new C50540MSt(new C15340po(new MBr(this, null, 34), this.A01.A05), 8), C10Q.A03(new C57178Pa3(this, null, 0), A00, A1H2)));
    }

    public static final Map A00(ContentAppreciationMetricsDataImpl contentAppreciationMetricsDataImpl) {
        ContentAppreciationMetricsDataImpl.EstimatedEarnings A0E;
        String A08;
        long j;
        String optionalStringField;
        Long A0k;
        if (!contentAppreciationMetricsDataImpl.hasFieldValue("date_range_start_timestamp") || (A0E = contentAppreciationMetricsDataImpl.A0E()) == null || (A08 = A0E.A08("amount_with_offset")) == null || AbstractC003100w.A0k(10, A08) == null) {
            return null;
        }
        long coercedIntField = contentAppreciationMetricsDataImpl.getCoercedIntField(1, "date_range_start_timestamp");
        ContentAppreciationMetricsDataImpl.EstimatedEarnings A0E2 = contentAppreciationMetricsDataImpl.A0E();
        if (A0E2 != null && (optionalStringField = A0E2.getOptionalStringField(1, "amount_with_offset")) != null && (A0k = AbstractC003100w.A0k(10, optionalStringField)) != null) {
            j = A0k.longValue();
        } else {
            j = 0;
        }
        return AbstractC167007dF.A0n(Long.valueOf(coercedIntField), Long.valueOf(j));
    }

    public static final void A01(C51733MtG c51733MtG, JWd jWd, C44550Jmu c44550Jmu) {
        Map map;
        LLN lln = c44550Jmu.A00;
        Integer num = C05F.A01;
        Integer num2 = C05F.A0u;
        Boolean valueOf = Boolean.valueOf(c51733MtG.A05);
        Boolean valueOf2 = Boolean.valueOf(c51733MtG.A02);
        if (jWd != null) {
            map = (Map) jWd.A00;
        } else {
            map = null;
        }
        lln.A07(valueOf, valueOf2, Boolean.valueOf(c51733MtG.A03), Boolean.valueOf(c51733MtG.A04), num, num2, map, null, AbstractC06930Yk.A0E());
        C50120MBu.A01(c44550Jmu, "https://help.instagram.com/738469380549477", AbstractC141776au.A00(c44550Jmu), 5);
    }

    public final void A04(Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Integer num;
        LLN lln = this.A00;
        if (z) {
            num = C05F.A0Y;
        } else {
            num = C05F.A15;
        }
        lln.A08(Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), num, map);
        AbstractC166987dD.A1Z(new PZW(this, (InterfaceC23621Ds) null, 1, z), AbstractC141776au.A00(this));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A05.A0E.Egh(EnumC63312uC.A06);
    }

    public final void A05(boolean z) {
        C141796aw A00 = AbstractC141776au.A00(this);
        MCD mcd = new MCD(this, null, 30);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new MCD(this, null, 31), AbstractC25235BEs.A0W(this, anonymousClass191, mcd, A00));
        if (z) {
            this.A00.A08(null, null, null, null, C05F.A0u, null);
            OY3.A02(EnumC53330NiA.A02, this.A05, new C30712DfA(this, 22));
            AbstractC23641Du.A05(anonymousClass191, new MCD(this, null, 29), AbstractC25235BEs.A0W(this, anonymousClass191, new MCD(this, null, 28), AbstractC141776au.A00(this)));
        }
    }
}
