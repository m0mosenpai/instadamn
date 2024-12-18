package X;

/* renamed from: X.FxA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36136FxA implements InterfaceC41501vz {
    public final /* synthetic */ EKE A00;

    public C36136FxA(EKE eke) {
        this.A00 = eke;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1502052968);
        C36042Fve c36042Fve = (C36042Fve) obj;
        int A032 = C0f9.A03(-610838176);
        EKE eke = this.A00;
        EVN evn = eke.A07;
        if (evn != null) {
            evn.A01();
        }
        String str = c36042Fve.A00;
        eke.A08.setText(str);
        eke.A08.setSelection(str.length());
        C0f9.A0A(1349984027, A032);
        C0f9.A0A(499266780, A03);
    }
}
