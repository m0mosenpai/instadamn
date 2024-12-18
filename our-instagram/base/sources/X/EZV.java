package X;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class EZV extends AbstractRunnableC14200nk {
    public final /* synthetic */ EV0 A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.1vN] */
    @Override // java.lang.Runnable
    public final void run() {
        C36292Fzm c36292Fzm = (C36292Fzm) this.A00.A01;
        if (c36292Fzm.A05 == null) {
            C2056398n c2056398n = c36292Fzm.A0C;
            String str = (String) AbstractC31171DnF.A0Y(c2056398n, c2056398n.A0Q, C2056398n.A0d, 3);
            if (str != null) {
                try {
                    FFN parseFromJson = F2I.parseFromJson(C16V.A00(str));
                    if (parseFromJson != null) {
                        c36292Fzm.A04(ImmutableList.copyOf((Collection) Collections.unmodifiableList(parseFromJson.A00)));
                    }
                } catch (IOException e) {
                    C0w9.A06("IceBreakerSettingManager", "Error while parsing icebreaker collection model", e);
                }
            }
        }
        c36292Fzm.A06 = false;
        c36292Fzm.A0A.E4s(new Object());
        c36292Fzm.A00 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZV(EV0 ev0) {
        super(551546154);
        this.A00 = ev0;
    }
}
