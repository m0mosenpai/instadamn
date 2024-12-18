package X;

import android.content.Intent;
import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.CwV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29336CwV implements InterfaceC31051Dkr {
    public final /* synthetic */ C0N A00;

    @Override // X.InterfaceC31051Dkr
    public final void ESs(boolean z) {
        this.A00.A08(true);
    }

    @Override // X.InterfaceC31051Dkr
    public final void Ebi(String str) {
        Object value;
        C51760Mtj c51760Mtj;
        C05A c05a = ((C50922Mer) this.A00.A02.getValue()).A04;
        do {
            value = c05a.getValue();
            c51760Mtj = (C51760Mtj) value;
        } while (!AbstractC25236BEt.A0z(c51760Mtj, OpalProfileData.A00((OpalProfileData) c51760Mtj.A01, null, null, null, null, str, null, null, 0, 8095, false, false), value, c05a));
    }

    public C29336CwV(C0N c0n) {
        this.A00 = c0n;
    }

    @Override // X.InterfaceC31051Dkr
    public final void Cgo(Intent intent, int i) {
        C12260kU.A06(this.A00, intent, i);
    }

    @Override // X.InterfaceC31051Dkr
    public final void EgY() {
        Object value;
        C51760Mtj c51760Mtj;
        C50922Mer c50922Mer = (C50922Mer) this.A00.A02.getValue();
        C05A c05a = c50922Mer.A04;
        do {
            value = c05a.getValue();
            c51760Mtj = (C51760Mtj) value;
        } while (!AbstractC25236BEt.A0z(c51760Mtj, OpalProfileData.A00((OpalProfileData) c51760Mtj.A01, null, null, null, null, AbstractC25228BEl.A19(c50922Mer.A03), null, null, 0, 8095, true, false), value, c05a));
    }
}
