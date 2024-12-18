package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GV1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GV1(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, User user, String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.A03 = imageUrl;
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A08 = str;
        this.A09 = str2;
        this.A04 = user;
        this.A07 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        C2UY.A01.A06();
        ImageUrl imageUrl = this.A03;
        if (imageUrl != null) {
            Activity activity = this.A00;
            UserSession userSession = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            String str = this.A08;
            String str2 = this.A09;
            User user = this.A04;
            String str3 = this.A07;
            String str4 = this.A05;
            String str5 = this.A06;
            C3DN A0r = AbstractC31172DnG.A0r(activity);
            C189478aR A00 = F86.A00(A0r);
            C34725FRo A06 = C28531Zo.A04.A02.A06(interfaceC11380iw, userSession, "story_comment_reply");
            A06.A03(str);
            A06.A04(str2);
            A06.A06(user.getId());
            A06.A02(str3);
            Bundle bundle = A06.A01;
            bundle.putString(AbstractC111324zv.A00(614), str4);
            bundle.putParcelable(AbstractC111324zv.A00(616), new DirectPendingLayeredXma(new ExtendedImageUrl(imageUrl), new ExtendedImageUrl(user.Bhu()), user, user.getUsername(), str5, false, false));
            bundle.putString(AbstractC111324zv.A00(306), AbstractC111324zv.A00(885));
            C14360o3.A0B(str5, 0);
            bundle.putString(AbstractC111324zv.A00(307), str5);
            A06.A05(str5);
            A06.A01("story_comment_reply");
            if (A0r != null) {
                if (((C3DP) A0r).A0h && A00 != null) {
                    C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                    A0y.A11 = true;
                    A0y.A1O = true;
                    A0y.A03 = 0.8f;
                    AbstractC25225BEi.A1Q(A0y, true);
                    C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
                    c189458aP.A02 = R.drawable.instagram_arrow_back_24;
                    c189458aP.A08 = Integer.valueOf(AbstractC167007dF.A09(activity, R.attr.igds_color_primary_text_on_media));
                    c189458aP.A05 = ViewOnClickListenerC35679FpE.A00(activity, 38);
                    A0y.A06(c189458aP.A00());
                    A00.A0F(A06.A00(), A0y);
                } else {
                    A0r.A0K(A06.A00());
                }
            }
        }
        return C0eB.A00;
    }
}
