package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Elg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33246Elg extends AnonymousClass772 {
    public final android.net.Uri A00;
    public final AbstractC12990ll A01;

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        android.net.Uri uri = this.A00;
        if (uri != null) {
            C12260kU.A0G(view.getContext(), uri);
            C1Q9 c1q9 = C1Q9.A1z;
            AbstractC12990ll abstractC12990ll = this.A01;
            C19280xC A04 = c1q9.A02(abstractC12990ll).A04();
            A04.A0C("uri_path", uri.getPath());
            AbstractC31173DnH.A1S(A04, abstractC12990ll);
        }
    }

    public C33246Elg(Context context, AbstractC12990ll abstractC12990ll, String str, int i) {
        super(Integer.valueOf(i));
        android.net.Uri A00;
        android.net.Uri A01 = AbstractC08820cl.A01(AbstractC63260SgI.A00, str);
        if (A01 == null) {
            A00 = null;
        } else {
            A00 = AbstractC63260SgI.A00(context, A01);
        }
        this.A00 = A00;
        this.A01 = abstractC12990ll;
    }
}
