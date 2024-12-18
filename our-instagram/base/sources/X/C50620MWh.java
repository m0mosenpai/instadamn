package X;

/* renamed from: X.MWh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50620MWh implements C11R {
    public final /* synthetic */ C51758Mth A00;
    public final /* synthetic */ AnonymousClass435 A01;
    public final /* synthetic */ MWH A02;
    public final /* synthetic */ C123645id A03;

    @Override // X.C11R
    public final String getName() {
        return "PROFILE_FEED_GRAPHQL_REST_CONVERSION";
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return 715233643;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    @Override // X.C11R
    public final void run() {
    }

    public C50620MWh(C51758Mth c51758Mth, AnonymousClass435 anonymousClass435, MWH mwh, C123645id c123645id) {
        this.A02 = mwh;
        this.A03 = c123645id;
        this.A00 = c51758Mth;
        this.A01 = anonymousClass435;
    }

    @Override // X.C11R
    public final void onFinish() {
        C62112sC c62112sC;
        MWH mwh = this.A02;
        InterfaceC154766xR interfaceC154766xR = mwh.A06;
        interfaceC154766xR.DRa("profile_on_data", null);
        Integer num = mwh.A00;
        Integer num2 = C05F.A00;
        if (num == num2) {
            C154806xV c154806xV = mwh.A04.A03;
            C123645id c123645id = this.A03;
            c154806xV.A07 = c123645id.A04;
            c154806xV.A0A = c123645id.A07;
            c154806xV.A09 = c123645id.A02;
            c154806xV.A08 = c123645id.A01;
        }
        C123645id c123645id2 = this.A03;
        boolean z = mwh.A08;
        boolean z2 = mwh.A09;
        EnumC125775mS enumC125775mS = mwh.A07;
        interfaceC154766xR.DRd(mwh.A01, this.A00, c123645id2, enumC125775mS, z, z2);
        if (mwh.A00 == num2 && !z && (c62112sC = mwh.A05) != null) {
            c62112sC.A02();
        }
        if (mwh.A00 == num2) {
            mwh.A00 = C05F.A01;
        }
        if (this.A01.A00.isFinal) {
            mwh.A04.A03.A00(C05F.A0C);
            interfaceC154766xR.DRZ(enumC125775mS);
        }
    }
}
