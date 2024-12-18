package X;

import android.content.Intent;
import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.CwW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29337CwW implements InterfaceC31051Dkr {
    public final /* synthetic */ C0O A00;

    @Override // X.InterfaceC31051Dkr
    public final void Cgo(Intent intent, int i) {
        C0O c0o = this.A00;
        c0o.A09 = false;
        C12260kU.A08(c0o.requireActivity(), intent, 68683);
    }

    @Override // X.InterfaceC31051Dkr
    public final void ESs(boolean z) {
        this.A00.A08(true);
    }

    public C29337CwW(C0O c0o) {
        this.A00 = c0o;
    }

    @Override // X.InterfaceC31051Dkr
    public final void Ebi(String str) {
        C0O.A00(this.A00).A03(str);
    }

    @Override // X.InterfaceC31051Dkr
    public final void EgY() {
        Object value;
        C26073Bg2 A00;
        C51030Mgd A002 = C0O.A00(this.A00);
        C05A c05a = A002.A05;
        do {
            value = c05a.getValue();
            C26073Bg2 c26073Bg2 = (C26073Bg2) value;
            A00 = C26073Bg2.A00(null, OpalProfileData.A00(c26073Bg2.A05, null, null, null, null, AbstractC25228BEl.A19(A002.A04), null, null, 0, 8095, true, false), null, null, c26073Bg2, null, 0, 2046, false, false);
        } while (!c05a.AIi(value, A00));
    }
}
