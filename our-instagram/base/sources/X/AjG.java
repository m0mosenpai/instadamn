package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes4.dex */
public final class AjG implements InterfaceC30946Dj3 {
    public final /* synthetic */ InterfaceC16620sF A00;

    public AjG(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC30946Dj3
    public final void Dmx(ClickableSpan clickableSpan, View view, String str, String str2) {
        AbstractC167007dF.A1E(str, 0, str2);
        this.A00.invoke(str, str2);
    }
}
