package X;

import com.facebook.papaya.client.ICallback;
import com.google.common.collect.ImmutableList;
import java.util.Map;

/* renamed from: X.Oor, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55725Oor implements ICallback {
    public final /* synthetic */ C54714OEr A00;
    public final /* synthetic */ OII A01;

    public C55725Oor(C54714OEr c54714OEr, OII oii) {
        this.A00 = c54714OEr;
        this.A01 = oii;
    }

    @Override // com.facebook.papaya.client.ICallback
    public final void onExecutorComplete(String str, Map map) {
        C54714OEr c54714OEr = this.A00;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(c54714OEr.A05);
        builder.addAll(c54714OEr.A06);
        C1LC A0I = AbstractC43592JPx.A0I(AbstractC31172DnG.A0K(builder));
        if (A0I.hasNext()) {
            A0I.next();
            throw AbstractC166987dD.A15("getName");
        }
    }
}
