package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Anv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24172Anv implements InterfaceC185428Kk {
    public final /* synthetic */ C23874AhT A00;

    public C24172Anv(C23874AhT c23874AhT) {
        this.A00 = c23874AhT;
    }

    @Override // X.InterfaceC185428Kk
    public final void Dt9(int i) {
        ShutterButton shutterButton = this.A00.A01;
        if (shutterButton != null) {
            shutterButton.setInnerText(String.valueOf(i));
        }
    }
}
