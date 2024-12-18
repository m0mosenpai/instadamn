package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.IkX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewStubOnInflateListenerC42064IkX implements ViewStub.OnInflateListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ JK7 A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C42659IuG A03;
    public final /* synthetic */ IKH A04;
    public final /* synthetic */ C64452w4 A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public ViewStubOnInflateListenerC42064IkX(Context context, JK7 jk7, C38321qM c38321qM, C42659IuG c42659IuG, IKH ikh, C64452w4 c64452w4, Integer num, String str, List list) {
        this.A04 = ikh;
        this.A00 = context;
        this.A03 = c42659IuG;
        this.A08 = list;
        this.A07 = str;
        this.A06 = num;
        this.A01 = jk7;
        this.A05 = c64452w4;
        this.A02 = c38321qM;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        IKH ikh = this.A04;
        C14360o3.A0C(view, MSV.A00(239));
        ikh.A00 = (IgdsButton) view;
        Context context = this.A00;
        C42659IuG c42659IuG = this.A03;
        List list = this.A08;
        String str = this.A07;
        Integer num = this.A06;
        InterfaceC43499JJl B3i = this.A01.B3i();
        C64452w4 c64452w4 = this.A05;
        C38321qM c38321qM = this.A02;
        IgdsButton igdsButton = ikh.A00;
        if (igdsButton != null) {
            igdsButton.setEnabled(AbstractC166987dD.A1b(C41714Idk.A00(c42659IuG, list)));
            igdsButton.setText(str);
            C0fQ.A00(new ViewOnClickListenerC42009Ije(2, num, c64452w4, c38321qM, c42659IuG, B3i, context, list), igdsButton);
        }
        c42659IuG.A00 = C05F.A01;
    }
}
