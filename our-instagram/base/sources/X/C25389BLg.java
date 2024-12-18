package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.BLg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25389BLg extends C03E implements InterfaceC16740sR {
    public C25389BLg(Object obj) {
        super(17, obj, InterfaceC31137Dmc.class, "onProfileLinkTap", "onProfileLinkTap(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/viewer/ui/state/ClipsItemState;Lcom/instagram/user/model/User;Lcom/instagram/feed/insights/InsightsUtil$ProfileType;Landroid/view/View;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;)V", 0);
    }

    @Override // X.InterfaceC16740sR
    public final /* bridge */ /* synthetic */ Object CP2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        C65 c65 = (C65) obj4;
        String str = (String) obj7;
        Float f = (Float) obj10;
        Float f2 = (Float) obj11;
        boolean A1a = AbstractC166987dD.A1a(obj12);
        boolean A1a2 = AbstractC166987dD.A1a(obj13);
        Boolean bool = (Boolean) obj14;
        Boolean bool2 = (Boolean) obj15;
        Float f3 = (Float) obj16;
        Float f4 = (Float) obj17;
        AbstractC167017dG.A1N(c120985dq, c37644Ghd);
        AbstractC25229BEm.A1I(c65, 3, str);
        InterfaceC31010Dk9 interfaceC31010Dk9 = (InterfaceC31010Dk9) this.receiver;
        interfaceC31010Dk9.Dbc((View) obj5, c120985dq, c37644Ghd, c65, (User) obj3, bool, bool2, f, f2, f3, f4, str, (String) obj8, (String) obj9, (InterfaceC16820sZ) obj6, A1a, A1a2);
        return C0eB.A00;
    }
}
