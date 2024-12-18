package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class G8E implements InterfaceC199918sv {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC08100bW A01;
    public final /* synthetic */ FPK A02;
    public final /* synthetic */ InterfaceC83713oG A03;
    public final /* synthetic */ String A04;

    public G8E(Context context, InterfaceC08100bW interfaceC08100bW, FPK fpk, InterfaceC83713oG interfaceC83713oG, String str) {
        this.A04 = str;
        this.A01 = interfaceC08100bW;
        this.A02 = fpk;
        this.A03 = interfaceC83713oG;
        this.A00 = context;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        Intent A08 = AbstractC31177DnL.A08("android.intent.action.DIAL");
        A08.setData(AbstractC08820cl.A01(this.A01, AnonymousClass001.A0R("tel:", this.A04)));
        this.A02.A00(this.A03, "CALL");
        C12260kU.A0E(this.A00, A08);
    }
}
