package X;

/* renamed from: X.DSl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30206DSl extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C61 A00;
    public final /* synthetic */ EnumC193878i8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30206DSl(C61 c61, EnumC193878i8 enumC193878i8, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(2);
        this.A02 = str;
        this.A03 = interfaceC16820sZ;
        this.A01 = enumC193878i8;
        this.A00 = c61;
        this.A04 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0C(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-265565144, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageSelectionBar.<anonymous> (MagicModGeneratedImageSelectionBar.kt:49)");
            }
            String str = this.A02;
            if (str != null) {
                c5Tl.Eno(937304621);
                InterfaceC16820sZ interfaceC16820sZ = this.A03;
                AbstractC28390Cft.A01(c5Tl, this.A00, this.A01, str, interfaceC16820sZ, this.A04, 0);
            } else {
                AbstractC119685bS.A00(c5Tl, AbstractC25227BEk.A0M(AbstractC25225BEi.A0N(c5Tl, 937553179), 1.0f));
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(171315825);
            }
        }
        return C0eB.A00;
    }
}
