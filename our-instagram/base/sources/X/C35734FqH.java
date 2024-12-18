package X;

import android.widget.CompoundButton;
import com.instagram.common.session.UserSession;

/* renamed from: X.FqH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35734FqH implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ G36 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C35734FqH(G36 g36, String str, boolean z) {
        this.A02 = z;
        this.A00 = g36;
        this.A01 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1gj, X.1OW] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.A02) {
            if (z) {
                G36 g36 = this.A00;
                C14360o3.A0A(compoundButton);
                C193328hC A0H = AbstractC31171DnF.A0H(g36.A00);
                A0H.A0A(2131959164);
                A0H.A09(2131959163);
                A0H.A0K(DialogInterfaceOnClickListenerC35452Fk9.A00(g36, 59), 2131959161);
                A0H.A0I(DialogInterfaceOnClickListenerC35408FjR.A00, 2131959162);
                AbstractC31175DnJ.A1O(A0H);
                A0H.A0h(new AP9(compoundButton, 3));
                AbstractC166987dD.A1W(A0H);
                return;
            }
            return;
        }
        UserSession userSession = this.A00.A01;
        String str = this.A01;
        C14360o3.A0B(str, 1);
        C26141Ov A01 = C26141Ov.A01(userSession);
        ?? c1ow = new C1OW(AbstractC31277Doz.A09(userSession, C32531gd.class, 1));
        c1ow.A00 = str;
        c1ow.A01 = z;
        A01.A0B(c1ow);
    }
}
