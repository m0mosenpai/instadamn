package X;

import android.view.View;

/* renamed from: X.Eew, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32965Eew extends AbstractC85543rj {
    public final /* synthetic */ C9CP A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32965Eew(C9CP c9cp, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super("", i, true);
        this.A01 = interfaceC16660sJ;
        this.A00 = c9cp;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A01.invoke(this.A00);
    }
}
