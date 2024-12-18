package X;

import android.content.Context;
import android.text.ClipboardManager;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ej4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33100Ej4 extends ET4 {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33100Ej4(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        super(fragmentActivity, abstractC10360h2);
        this.A01 = userSession;
        this.A03 = str;
        this.A00 = interfaceC11380iw;
        this.A04 = str2;
        this.A02 = c38321qM;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1498473537);
        EC0 ec0 = (EC0) obj;
        int A032 = C0f9.A03(173117566);
        C14360o3.A0B(ec0, 0);
        int A033 = C0f9.A03(1143412954);
        Context context = super.A00;
        Object A0X = AbstractC31171DnF.A0X(context);
        A0X.getClass();
        ((ClipboardManager) A0X).setText(ec0.A00);
        AbstractC34301FAv.A00(context, null, null, false);
        C0f9.A0A(1057081563, A033);
        AbstractC73317Y7a.A0I(this.A00, this.A01, null, this.A03, this.A04, "copy_link", ec0.A00, "copy_link", AbstractC25226BEj.A1G(this.A02), null, null);
        C0f9.A0A(-949137156, A032);
        C0f9.A0A(2118073028, A03);
    }

    @Override // X.ET4, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1961194078);
        super.onFail(abstractC115105If);
        AbstractC73317Y7a.A0H(this.A00, this.A01, this.A03, this.A04, "copy_link", abstractC115105If.A01());
        C0f9.A0A(943056849, A0N);
    }
}
