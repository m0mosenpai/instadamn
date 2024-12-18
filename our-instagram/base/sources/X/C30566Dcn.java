package X;

import com.google.common.collect.ImmutableList;
import com.instagram.schools.management.data.SchoolInfo;

/* renamed from: X.Dcn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30566Dcn extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ SchoolInfo A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30566Dcn(ImmutableList immutableList, SchoolInfo schoolInfo, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        super(3);
        this.A01 = schoolInfo;
        this.A05 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
        this.A00 = immutableList;
        this.A02 = num;
        this.A03 = num2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(429045901, "com.instagram.schools.management.ui.SchoolOnboardingGradudationDateContent.<anonymous> (SchoolOnboardingGraduationDateContent.kt:46)");
            }
            SchoolInfo schoolInfo = this.A01;
            if (schoolInfo != null) {
                AbstractC28330CeI.A01(c5Tl, schoolInfo, this.A02, this.A03, this.A05, this.A04, this.A06, 0, this.A00.contains(C75.A05));
            }
            if (C0fH.A02()) {
                C0fH.A00(-648754785);
            }
        }
        return C0eB.A00;
    }
}
