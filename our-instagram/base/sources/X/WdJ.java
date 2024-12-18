package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class WdJ implements InterfaceC71974XDh {
    public final /* synthetic */ boolean A00;

    public WdJ(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC71974XDh
    public final String AYz() {
        StringBuilder sb = new StringBuilder();
        sb.append("Both events have the same metric type.");
        sb.append(' ');
        sb.append(this.A00);
        return sb.toString();
    }

    @Override // X.InterfaceC71974XDh
    public final String B35() {
        return "Both events have the same metric type.";
    }

    @Override // X.InterfaceC71974XDh
    public final /* synthetic */ List B6B() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC71974XDh
    public final boolean Ca7() {
        return this.A00;
    }
}
