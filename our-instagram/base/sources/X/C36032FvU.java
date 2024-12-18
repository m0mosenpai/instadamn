package X;

import com.instagram.registration.model.RegFlowExtras;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FvU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36032FvU implements InterfaceC57632kc {
    public final /* synthetic */ FH6 A00;
    public final /* synthetic */ C35146Fen A01;

    @Override // X.InterfaceC57632kc
    public final void DEF(Exception exc) {
    }

    public C36032FvU(FH6 fh6, C35146Fen c35146Fen) {
        this.A01 = c35146Fen;
        this.A00 = fh6;
    }

    @Override // X.InterfaceC57632kc
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
        if (regFlowExtras != null) {
            C35146Fen c35146Fen = this.A01;
            if (System.currentTimeMillis() - regFlowExtras.A00 > TimeUnit.HOURS.toMillis(24L)) {
                c35146Fen.A00.A04("reg_flow_extras_serialize_key");
            } else {
                this.A00.A00.A03 = regFlowExtras;
            }
        }
    }
}
