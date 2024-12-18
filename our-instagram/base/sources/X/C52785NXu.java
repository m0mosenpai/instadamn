package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.NXu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52785NXu extends AnonymousClass522 {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52785NXu(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, String str2, int i) {
        super(Integer.valueOf(i));
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC41776Ies.A09(this.A00.requireActivity(), this.A01, C2Fb.A49, this.A02, this.A03);
    }
}
