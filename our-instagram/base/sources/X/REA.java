package X;

import android.os.Bundle;

/* loaded from: classes10.dex */
public final class REA extends Q83 implements InterfaceC65384TjH {
    public DialogC60731ROq A00;
    public REI A01;

    @Override // X.Q83, X.InterfaceC65384TjH
    public final boolean DIB(Bundle bundle, int i, boolean z) {
        DialogC60731ROq dialogC60731ROq = this.A00;
        if (dialogC60731ROq != null) {
            dialogC60731ROq.dismiss();
        }
        return super.DIB(bundle, i, z);
    }

    @Override // X.Q83
    public final void A00() {
        super.A00();
        C63627SqZ.A00(this, this.A01.A0A, 15);
        C63627SqZ.A00(this, this.A01.A0B, 16);
        C63627SqZ.A01(this, this.A01.A09, new C63627SqZ(this, 17), 44);
    }

    @Override // X.Q83
    public final void A01() {
        super.A01();
        this.A01 = (REI) this.A04;
    }

    @Override // X.Q83, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(526805403);
        super.onDestroyView();
        DialogC60731ROq dialogC60731ROq = this.A00;
        if (dialogC60731ROq != null) {
            dialogC60731ROq.dismiss();
        }
        C0f9.A09(585951228, A02);
    }
}
