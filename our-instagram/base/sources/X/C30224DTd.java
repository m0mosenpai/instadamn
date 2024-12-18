package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntegrityInterstitialType;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.List;

/* renamed from: X.DTd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30224DTd extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30224DTd(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A05 = str;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC27505CCa.A00(A0S, this.A05, (InterfaceC16660sJ) this.A04, (InterfaceC16620sF) this.A03, (C5Hc) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                String str = this.A05;
                AbstractC27517CCn.A00(A0S, (C26050Bfd) this.A04, (C83) this.A03, str, (InterfaceC16660sJ) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 2:
                AbstractC27573CEs.A00(A0S, (IntegrityInterstitialType) this.A02, this.A05, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            case 3:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                AbstractC27577CEw.A00(A0S, this.A05, interfaceC16820sZ, (InterfaceC16820sZ) this.A04, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01));
                break;
            case 4:
                Badge badge = (Badge) this.A02;
                AbstractC27645CHq.A00(A0S, (FragmentActivity) this.A03, (UserSession) this.A04, badge, this.A05, AbstractC25225BEi.A04(this.A01));
                break;
            case 5:
                List list = (List) this.A02;
                AbstractC27648CHt.A00(A0S, (FragmentActivity) this.A03, (UserSession) this.A04, this.A05, list, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                CKE.A00(A0S, this.A05, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
