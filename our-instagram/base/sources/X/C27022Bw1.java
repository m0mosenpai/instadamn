package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolOnboardingParcelData;

/* renamed from: X.Bw1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27022Bw1 extends AbstractC61132qb {
    public final UserSession A00;
    public final SchoolOnboardingParcelData A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        SchoolOnboardingParcelData schoolOnboardingParcelData = this.A01;
        C14360o3.A0B(schoolOnboardingParcelData, 0);
        String str = schoolOnboardingParcelData.A06;
        String str2 = schoolOnboardingParcelData.A0A;
        EnumC27396C6z enumC27396C6z = schoolOnboardingParcelData.A02;
        Integer num = schoolOnboardingParcelData.A04;
        Integer num2 = schoolOnboardingParcelData.A05;
        ImmutableList A00 = AbstractC54181NxI.A00(schoolOnboardingParcelData.A0D);
        ImmutableList A002 = AbstractC54181NxI.A00(schoolOnboardingParcelData.A0E);
        String str3 = schoolOnboardingParcelData.A09;
        String str4 = schoolOnboardingParcelData.A08;
        String str5 = schoolOnboardingParcelData.A07;
        boolean z = schoolOnboardingParcelData.A0F;
        EnumC27395C6y enumC27395C6y = schoolOnboardingParcelData.A01;
        EnumC27383C6m enumC27383C6m = schoolOnboardingParcelData.A03;
        boolean z2 = schoolOnboardingParcelData.A0G;
        return new C25873BcV(new C27962CUh(userSession, new C26075Bg4(schoolOnboardingParcelData.A00, A00, A002, AbstractC54181NxI.A00(schoolOnboardingParcelData.A0C), enumC27395C6y, enumC27396C6z, enumC27383C6m, num, num2, str, str2, str3, str4, str5, schoolOnboardingParcelData.A0B, z, z2)));
    }

    public C27022Bw1(UserSession userSession, SchoolOnboardingParcelData schoolOnboardingParcelData) {
        AbstractC167017dG.A1P(userSession, schoolOnboardingParcelData);
        this.A00 = userSession;
        this.A01 = schoolOnboardingParcelData;
    }
}
