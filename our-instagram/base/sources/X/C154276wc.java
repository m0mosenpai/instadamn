package X;

import android.content.Context;

/* renamed from: X.6wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154276wc extends AbstractC154286wd {
    public final InterfaceC154766xR A00;
    public final Context A01;
    public final C62112sC A02;
    public final EnumC125775mS A03;
    public final boolean A04;
    public final boolean A05;

    public C154276wc(Context context, C62112sC c62112sC, InterfaceC154766xR interfaceC154766xR, EnumC125775mS enumC125775mS, boolean z, boolean z2) {
        this.A01 = context;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = c62112sC;
        this.A00 = interfaceC154766xR;
        this.A03 = enumC125775mS;
    }

    public final void A00(C123645id c123645id) {
        C62112sC c62112sC;
        int A03 = C0f9.A03(-1849636095);
        C14360o3.A0B(c123645id, 0);
        InterfaceC154766xR interfaceC154766xR = this.A00;
        interfaceC154766xR.DRa("profile_on_data", null);
        boolean z = this.A04;
        interfaceC154766xR.DRd(this.A01, null, c123645id, this.A03, z, this.A05);
        if (!z && (c62112sC = this.A02) != null) {
            c62112sC.A02();
        }
        C0f9.A0A(1616937165, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        C62112sC c62112sC;
        int A03 = C0f9.A03(-1428237257);
        C14360o3.A0B(abstractC115105If, 0);
        this.A00.DRX(abstractC115105If, this.A03);
        if (!this.A04 && (c62112sC = this.A02) != null) {
            c62112sC.A00();
        }
        C0f9.A0A(-2061084339, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(923492935);
        this.A00.DRZ(this.A03);
        C0f9.A0A(-1266964834, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C62112sC c62112sC;
        int A03 = C0f9.A03(-179922914);
        InterfaceC154766xR interfaceC154766xR = this.A00;
        boolean z = this.A04;
        interfaceC154766xR.DRc(this.A03, z, this.A05, false);
        if (!z && (c62112sC = this.A02) != null) {
            c62112sC.A01();
        }
        C0f9.A0A(-2100027232, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(795939274);
        A00((C123645id) obj);
        C0f9.A0A(-2049814875, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(228403958);
        int A032 = C0f9.A03(782351942);
        this.A00.DRa("profile_on_data_bg", null);
        C0f9.A0A(-1062407190, A032);
        C0f9.A0A(-114629957, A03);
    }
}
