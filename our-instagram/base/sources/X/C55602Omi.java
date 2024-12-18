package X;

import android.graphics.Rect;

/* renamed from: X.Omi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55602Omi implements BBN {
    public final /* synthetic */ C55013OVy A00;

    public C55602Omi(C55013OVy c55013OVy) {
        this.A00 = c55013OVy;
    }

    @Override // X.BBN
    public final void onPreviewFrame(C72816Xnf c72816Xnf) {
        C55013OVy c55013OVy = this.A00;
        if (c55013OVy.A04) {
            C55601Omh c55601Omh = c55013OVy.A01;
            if (c55601Omh != null && !c55601Omh.A02) {
                c55601Omh.A02 = true;
                C54498O6a c54498O6a = c55601Omh.A05.A06;
                AbstractC53656No2.A00(c54498O6a.A00, c54498O6a.A01, "autogen_finished", 38);
                byte[] bArr = AbstractC72563Xgp.A00(c72816Xnf).A0A;
                if (bArr != null) {
                    int i = c72816Xnf.A03;
                    int i2 = c72816Xnf.A00;
                    Rect rect = new Rect(0, 0, i, i2);
                    int i3 = c72816Xnf.A02;
                    AbstractC166987dD.A1Z(new MCN(rect, c55601Omh, (InterfaceC23621Ds) null, bArr, i, i2, i3), AnonymousClass194.A02(C12P.A01));
                    return;
                }
                return;
            }
            return;
        }
        BBN bbn = c55013OVy.A02;
        if (bbn == null) {
            return;
        }
        bbn.onPreviewFrame(c72816Xnf);
    }
}
