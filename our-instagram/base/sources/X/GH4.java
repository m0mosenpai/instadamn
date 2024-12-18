package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GH4 implements InterfaceC1119153d {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ FragmentActivity A04;
    public final /* synthetic */ AbstractC12990ll A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ FI9 A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public GH4(Context context, Drawable drawable, Fragment fragment, FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, UserSession userSession, FI9 fi9, String str, long j, boolean z) {
        this.A06 = userSession;
        this.A03 = fragment;
        this.A09 = z;
        this.A01 = context;
        this.A04 = fragmentActivity;
        this.A02 = drawable;
        this.A00 = j;
        this.A05 = abstractC12990ll;
        this.A08 = str;
        this.A07 = fi9;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        UserSession userSession = this.A06;
        long A02 = AbstractC31175DnJ.A02(userSession);
        if (A02 > 0 && (this.A03 instanceof C114485Es) && !this.A09) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            Context context = this.A01;
            AbstractC25226BEj.A1N(context, A0K, 2131975211);
            C56342iS c56342iS = C56352iT.A0t;
            FragmentActivity fragmentActivity = this.A04;
            A0K.A09(c56342iS.A03(fragmentActivity).A0Q());
            AbstractC31175DnJ.A0l(context, A0K, 2131961561);
            A0K.A0A(new C36516G8o(6, fragmentActivity, this.A05, userSession));
            A0K.A04 = this.A02;
            A0K.A02();
            A0K.A0L = true;
            A0K.A06();
            AbstractC31171DnF.A11(context, A0K, 2131975210);
            AbstractC31178DnM.A1S(A0K);
        } else if (this.A09 && A02 > 0 && this.A00 == 0) {
            AbstractC35219FgC.A03(this.A01, this.A04, this.A05, userSession, this.A08, A02);
        }
        if ((this.A03 instanceof C114485Es) || this.A00 == 0 || A02 == 0) {
            C455127l.A03(userSession).A0S();
        }
        FI9 fi9 = this.A07;
        if (fi9 != null) {
            fi9.A00.invoke();
        }
    }
}
