package X;

/* renamed from: X.EjJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33115EjJ extends AbstractC32533EUj {
    public final /* synthetic */ FPR A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33115EjJ(AbstractC10360h2 abstractC10360h2, FPR fpr, String str, String str2, String str3) {
        super(abstractC10360h2);
        this.A00 = fpr;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1494344044);
        C11T.A03(new RunnableC36862GMj(this));
        this.A00.A00.A04.A02(this.A01, this.A02, this.A03, false);
        C0f9.A0A(-1229608265, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean equals;
        C23031Ai A00;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        int A03 = C0f9.A03(-1646768855);
        int A032 = C0f9.A03(-805514613);
        String str = this.A01;
        if (str.equals(AbstractC111324zv.A00(886))) {
            equals = this.A02.equals("off");
            A00 = AbstractC23021Ah.A00(this.A00.A00.A02);
            interfaceC16530ry = A00.A0z;
            c0yrArr = C23031Ai.A8c;
            i = 335;
        } else if (str.equals(AbstractC111324zv.A00(1166))) {
            equals = this.A02.equals("off");
            A00 = AbstractC23021Ah.A00(this.A00.A00.A02);
            interfaceC16530ry = A00.A10;
            c0yrArr = C23031Ai.A8c;
            i = 336;
        } else {
            if (str.equals("direct_media_creator_share_activity")) {
                C23031Ai A002 = AbstractC23021Ah.A00(this.A00.A00.A02);
                String str2 = this.A02;
                C14360o3.A0B(str2, 0);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A002);
                A0w.E7K(AbstractC43591JPw.A00(337), str2);
                A0w.apply();
            }
            C11T.A03(new RunnableC36861GMi(this));
            this.A00.A00.A04.A02(str, this.A02, this.A03, true);
            C0f9.A0A(1399265177, A032);
            C0f9.A0A(145710442, A03);
        }
        AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, equals);
        C11T.A03(new RunnableC36861GMi(this));
        this.A00.A00.A04.A02(str, this.A02, this.A03, true);
        C0f9.A0A(1399265177, A032);
        C0f9.A0A(145710442, A03);
    }
}
