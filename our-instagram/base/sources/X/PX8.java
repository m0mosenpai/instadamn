package X;

import com.facebook.avatar.expresso.odr.ODRController;
import com.facebook.browser.lite.extensions.autofill.base.actionhandler.vault.VaultActionHandler;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.repository.common.IgBaseRepository;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* loaded from: classes9.dex */
public final class PX8 extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PX8(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A09 = i;
        this.A0A = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, PX8 px8) {
        px8.A01 = obj;
        px8.A02 = obj2;
        px8.A03 = obj3;
        px8.A04 = obj4;
    }

    public static void A01(Object obj, Object obj2, Object obj3, PX8 px8, int i) {
        px8.A05 = obj;
        px8.A06 = obj2;
        px8.A07 = obj3;
        px8.A00 = i;
    }

    public static void A02(Object obj, PX8 px8) {
        px8.A08 = obj;
        px8.A00 |= Integer.MIN_VALUE;
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof PX8) && ((PX8) obj).A09 == i) {
            return true;
        }
        return false;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A09;
        A02(obj, this);
        switch (i) {
            case 0:
                return ODRController.A08((ODRController) this.A0A, null, this);
            case 1:
                return ((ODRController) this.A0A).A0B(null, this);
            case 2:
                return ((ODRController) this.A0A).A09(null, this, null);
            case 3:
                return ((VaultActionHandler) this.A0A).A00(null, null, null, null, null, null, null, null, this);
            case 4:
                return FanClubConsiderationViewModel.A04(null, (FanClubConsiderationViewModel) this.A0A, null, null, this);
            case 5:
                return IgBaseRepository.A00((IgBaseRepository) this.A0A, null, null, this);
            case 6:
                return ((LimitsPlusRepository) this.A0A).A02(this);
            default:
                return C55214Oeb.A02(null, null, null, (C55214Oeb) this.A0A, this);
        }
    }
}
