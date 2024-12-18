package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class D95 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ EnumC25577BSp A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ WeakReference A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D95(EnumC25577BSp enumC25577BSp, UserSession userSession, ImageUrl imageUrl, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        super(0);
        this.A01 = userSession;
        this.A0B = weakReference;
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A00 = enumC25577BSp;
        this.A09 = str4;
        this.A0A = str5;
        this.A04 = num;
        this.A06 = str6;
        this.A03 = num2;
        this.A02 = imageUrl;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        LJe lJe = LJe.A00;
        UserSession userSession = this.A01;
        WeakReference weakReference = this.A0B;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A05;
        EnumC25577BSp enumC25577BSp = this.A00;
        String str4 = this.A09;
        String str5 = this.A0A;
        Integer num = this.A04;
        String str6 = this.A06;
        lJe.A02(userSession, new C45000Jvq(enumC25577BSp, this.A02, null, num, this.A03, str, str2, str3, str4, str5, str6, null, false), weakReference);
        return C0eB.A00;
    }
}
