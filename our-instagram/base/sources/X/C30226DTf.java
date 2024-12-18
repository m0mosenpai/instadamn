package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.DTf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30226DTf extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30226DTf(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        super(2);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool;
        InterfaceC911544r interfaceC911544r;
        String str;
        String str2;
        Integer num;
        Boolean bool2;
        Boolean bool3;
        C5Tl c5Tl;
        int i;
        switch (this.A00) {
            case 0:
                boolean A1a = AbstractC166987dD.A1a(obj2);
                C14360o3.A0B(obj, 0);
                C54s c54s = new C54s(C913045j.A00);
                C43719JVe c43719JVe = (C43719JVe) this.A02;
                C43718JVd c43718JVd = (C43718JVd) this.A01;
                if (c43719JVe != null) {
                    bool = c43719JVe.A01;
                } else {
                    bool = null;
                }
                String A00 = AbstractC111324zv.A00(1066);
                if (bool == null) {
                    interfaceC911544r = C60603RBu.A00;
                } else if (bool.booleanValue()) {
                    interfaceC911544r = AnonymousClass550.A02;
                } else {
                    interfaceC911544r = AnonymousClass550.A01;
                }
                c54s.A00.put(A00, interfaceC911544r);
                c54s.A0G("skips_sync", false);
                JQO jqo = c43718JVd.A01;
                c54s.A0F(AbstractC43591JPw.A00(197), AbstractC44092JeH.A00(jqo.A07));
                c54s.A0F("ndid", jqo.A0F);
                C60H c60h = (C60H) ((LKC) this.A03).A01.invoke(obj);
                String str3 = this.A04;
                if (c43719JVe != null) {
                    str = c43719JVe.A04;
                } else {
                    str = null;
                }
                String str4 = this.A05;
                if (c43719JVe != null) {
                    str2 = c43719JVe.A06;
                } else {
                    str2 = null;
                }
                PushChannelType pushChannelType = jqo.A06;
                int A05 = AbstractC25227BEk.A05(pushChannelType, 0);
                if (A05 != 11) {
                    if (A05 == 10) {
                        num = C05F.A01;
                    } else {
                        throw AbstractC166987dD.A12(AbstractC167017dG.A0n(pushChannelType, "Push channel type not supported: ", AbstractC166987dD.A1C()));
                    }
                } else {
                    num = C05F.A00;
                }
                Boolean valueOf = Boolean.valueOf(AbstractC167007dF.A1X(num, C05F.A01));
                if (c43719JVe != null) {
                    bool2 = c43719JVe.A00;
                    bool3 = c43719JVe.A01;
                } else {
                    bool2 = null;
                    bool3 = null;
                }
                c60h.A02(c54s, valueOf, bool2, bool3, null, str3, str, str4, str2, null, A1a);
                return C0eB.A00;
            case 1:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-773462289, "com.instagram.opal.impl.ui.OpalSwitchIndicatorHelperImpl.addOpalTeaseIndicatorIfRequired.<anonymous>.<anonymous> (OpalSwitchIndicatorHelperImpl.kt:55)");
                    }
                    c5Tl.Eno(-995796267);
                    UserSession userSession = (UserSession) this.A03;
                    boolean AH6 = c5Tl.AH6(userSession);
                    Object obj3 = this.A02;
                    boolean A1X = AbstractC25226BEj.A1X(c5Tl, obj3, AH6);
                    Object EEc = c5Tl.EEc();
                    if (A1X || EEc == C5UI.A00) {
                        EEc = AbstractC25235BEs.A18(c5Tl, obj3, userSession, 19);
                    }
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
                    AbstractC25225BEi.A1T(c5Tl);
                    long A09 = AbstractC25226BEj.A09(c5Tl);
                    String str5 = this.A04;
                    if (str5 == null) {
                        str5 = "";
                    }
                    AbstractC27687CJg.A00(c5Tl, AbstractC25228BEl.A0W(), (InterfaceC11380iw) this.A01, userSession, str5, this.A05, interfaceC16820sZ, 1000, 12582960, A09);
                    if (C0fH.A02()) {
                        i = -2069220011;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1580180715, "com.instagram.opal.impl.ui.OpalSwitchIndicatorHelperImpl.addOpalTeaseIndicatorIfRequired.<anonymous> (OpalSwitchIndicatorHelperImpl.kt:54)");
                    }
                    if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25226BEj.A0T(Modifier.A00), new C30226DTf(this.A03, this.A02, this.A01, this.A04, this.A05, 1), -470097849)) {
                        i = -1470390385;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                C38321qM c38321qM = (C38321qM) obj;
                C38889HAl c38889HAl = (C38889HAl) obj2;
                AbstractC167017dG.A1N(c38321qM, c38889HAl);
                AnonymousClass389.A00(c38321qM, c38889HAl, (AnonymousClass389) this.A03, this.A04, this.A05, ((Product) this.A01).A0H);
                ((InterfaceC31040Dke) this.A02).DgM();
                return C0eB.A00;
        }
    }
}
