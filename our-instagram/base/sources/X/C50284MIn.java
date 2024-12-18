package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.MIn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50284MIn extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ DirectShareTarget A03;
    public final /* synthetic */ ExtendedImageUrl A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50284MIn(UserSession userSession, ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
        super(1);
        this.A03 = directShareTarget;
        this.A01 = userSession;
        this.A0C = str;
        this.A00 = j;
        this.A08 = str2;
        this.A0B = str3;
        this.A09 = str4;
        this.A04 = extendedImageUrl;
        this.A06 = str5;
        this.A05 = user;
        this.A0A = str6;
        this.A02 = imageUrl;
        this.A0D = z;
        this.A07 = str7;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
        DirectShareTarget directShareTarget = this.A03;
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            directShareTarget = JQ1.A0G(this.A01, directShareTarget, interfaceC83713oG);
        }
        C7TH A01 = AbstractC140396Wt.A01(this.A01, directShareTarget.A01());
        String str = this.A0C;
        long j = this.A00;
        String str2 = this.A08;
        String str3 = this.A0B;
        String str4 = this.A09;
        ExtendedImageUrl extendedImageUrl = this.A04;
        String str5 = this.A06;
        User user = this.A05;
        String str6 = this.A0A;
        A01.ENv(this.A02, directShareTarget, extendedImageUrl, user, str, str2, str3, str4, null, str5, str6, this.A07, j, this.A0D);
        return C0eB.A00;
    }
}
