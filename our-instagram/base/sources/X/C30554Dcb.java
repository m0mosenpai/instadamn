package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Dcb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30554Dcb extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30554Dcb(ImmutableList immutableList, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        super(3);
        this.A05 = interfaceC16660sJ;
        this.A04 = interfaceC16660sJ2;
        this.A03 = interfaceC16820sZ;
        this.A00 = immutableList;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(957335254, "com.instagram.schools.management.ui.SchoolOnboardingSchoolSelectionContent.<anonymous> (SchoolOnboardingSchoolSelectionContent.kt:47)");
            }
            InterfaceC16660sJ interfaceC16660sJ = this.A05;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A04;
            AbstractC28331CeJ.A01(c5Tl, this.A00, this.A02, this.A01, this.A03, interfaceC16660sJ, interfaceC16660sJ2, 0);
            if (C0fH.A02()) {
                C0fH.A00(115882459);
            }
        }
        return C0eB.A00;
    }
}
