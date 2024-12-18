package X;

import android.view.View;

/* renamed from: X.Bzk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27225Bzk extends AbstractC85543rj {
    public final /* synthetic */ C25671My A00;
    public final /* synthetic */ C38321qM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27225Bzk(C25671My c25671My, C38321qM c38321qM, int i) {
        super(false, i);
        this.A00 = c25671My;
        this.A01 = c38321qM;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A00.E4s(new C3M1(this.A01));
    }
}
