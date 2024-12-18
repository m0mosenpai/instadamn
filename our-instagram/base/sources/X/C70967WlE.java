package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.WlE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70967WlE implements MQC {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UFT A01;

    @Override // X.MQC
    public final void DYD(EnumC172127lh enumC172127lh) {
        Object value;
        C66628UPq c66628UPq;
        EnumC172127lh enumC172127lh2 = EnumC172127lh.A05;
        UFT uft = this.A01;
        if (enumC172127lh == enumC172127lh2) {
            UFT.A01(this.A00, uft);
            return;
        }
        C05A c05a = uft.A02.A04;
        do {
            value = c05a.getValue();
            c66628UPq = (C66628UPq) value;
        } while (!c05a.AIi(value, C66628UPq.A00(c66628UPq.A03, c66628UPq.A02, c66628UPq.A05, c66628UPq.A04, c66628UPq.A00, c66628UPq.A01, false)));
    }

    @Override // X.MQC
    public final boolean EjC() {
        return true;
    }

    public C70967WlE(FragmentActivity fragmentActivity, UFT uft) {
        this.A01 = uft;
        this.A00 = fragmentActivity;
    }
}
