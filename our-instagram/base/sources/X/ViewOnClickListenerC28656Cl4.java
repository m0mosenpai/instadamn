package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.Cl4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28656Cl4 implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ WeakReference A0B;

    public ViewOnClickListenerC28656Cl4(UserSession userSession, ImageUrl imageUrl, C38321qM c38321qM, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        this.A00 = userSession;
        this.A0B = weakReference;
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A04 = num;
        this.A06 = str6;
        this.A03 = num2;
        this.A01 = imageUrl;
        this.A02 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-667517396);
        UserSession userSession = this.A00;
        WeakReference weakReference = this.A0B;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A05;
        EnumC25577BSp enumC25577BSp = EnumC25577BSp.UFI_RESHARE_SHEET;
        String str4 = this.A09;
        String str5 = this.A0A;
        Integer num = this.A04;
        String str6 = this.A06;
        C28358CfI.A00(enumC25577BSp, userSession, this.A01, this.A02, num, this.A03, str, str2, str3, str4, str5, str6, weakReference);
        C0f9.A0C(654995430, A05);
    }
}
