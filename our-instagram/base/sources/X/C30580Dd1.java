package X;

/* renamed from: X.Dd1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30580Dd1 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ EnumC27396C6z A00;
    public final /* synthetic */ CPN A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30580Dd1(EnumC27396C6z enumC27396C6z, CPN cpn, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(3);
        this.A07 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A08 = interfaceC16660sJ;
        this.A06 = interfaceC16820sZ3;
        this.A04 = interfaceC16820sZ4;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = enumC27396C6z;
        this.A09 = z;
        this.A01 = cpn;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(obj, 0);
        if ((A0H & 17) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-641523266, "com.instagram.schools.management.ui.SchoolOnboardingStudentEmailContent.<anonymous> (SchoolOnboardingStudentEmailContent.kt:66)");
            }
            InterfaceC16820sZ interfaceC16820sZ = this.A07;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
            InterfaceC16660sJ interfaceC16660sJ = this.A08;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A06;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A04;
            String str = this.A03;
            String str2 = this.A02;
            AbstractC28445Cgt.A01(c5Tl, this.A00, this.A01, str, str2, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, 0, this.A09);
            if (C0fH.A02()) {
                C0fH.A00(-113399800);
            }
        }
        return C0eB.A00;
    }
}
