package X;

import android.content.Context;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Foa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35640Foa implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C38O A02;
    public final /* synthetic */ InterfaceC37216GaR A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C47P A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ CharSequence[] A07;

    public ViewOnClickListenerC35640Foa(Context context, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, User user, C47P c47p, String str, CharSequence[] charSequenceArr, int i) {
        this.A02 = c38o;
        this.A01 = context;
        this.A07 = charSequenceArr;
        this.A03 = interfaceC37216GaR;
        this.A04 = user;
        this.A05 = c47p;
        this.A00 = i;
        this.A06 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-394334130);
        C38O c38o = this.A02;
        Context context = this.A01;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        CharSequence[] charSequenceArr = this.A07;
        A0I.A0f(new DialogInterfaceOnClickListenerC35374Fip(context, this.A03, this.A04, this.A05, this.A06, charSequenceArr, this.A00), charSequenceArr);
        AbstractC31175DnJ.A1O(A0I);
        c38o.AM3(A0I);
        AbstractC166987dD.A1W(A0I);
        C0f9.A0C(2013562733, A05);
    }
}
