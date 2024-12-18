package X;

/* renamed from: X.EjE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33110EjE extends AbstractC32533EUj {
    public final /* synthetic */ C32320ELo A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33110EjE(AbstractC10360h2 abstractC10360h2, C32320ELo c32320ELo, boolean z) {
        super(abstractC10360h2);
        this.A00 = c32320ELo;
        this.A01 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1755696103);
        C32320ELo c32320ELo = this.A00;
        String str = C32320ELo.__redex_internal_original_name;
        c32320ELo.A04.setChecked(!this.A01);
        AbstractC35254Fgn.A02(c32320ELo.requireActivity(), abstractC115105If);
        C0f9.A0A(-1584987484, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1969305173);
        int A032 = C0f9.A03(499403078);
        C32320ELo c32320ELo = this.A00;
        String str = C32320ELo.__redex_internal_original_name;
        c32320ELo.A04.setChecked(this.A01);
        C0f9.A0A(-2096988267, A032);
        C0f9.A0A(1134065829, A03);
    }
}
