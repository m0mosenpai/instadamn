package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33254Elo extends AnonymousClass522 {
    public final /* synthetic */ C1577676k A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33254Elo(C1577676k c1577676k, Integer num) {
        super(num);
        this.A00 = c1577676k;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C1577676k c1577676k = this.A00;
        UserSession userSession = c1577676k.A07;
        InterfaceC11380iw interfaceC11380iw = c1577676k.A06;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        AbstractC31175DnJ.A15(AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(5091)), "privacy_disclosure_click");
        ((InterfaceC165737b0) c1577676k.A0A).CrY();
    }
}
