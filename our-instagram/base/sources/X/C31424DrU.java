package X;

import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.model.direct.DirectShareTarget;
import java.util.function.Predicate;

/* renamed from: X.DrU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31424DrU implements Predicate {
    public final int A00;
    public final Object A01;

    public C31424DrU(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            case 1:
            case 2:
            case 4:
            case 6:
            default:
                C14360o3.A0B(interfaceC16660sJ, 1);
                break;
        }
        this.A01 = interfaceC16660sJ;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        switch (this.A00) {
            case 4:
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) this.A01;
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                if (directShareTarget.A0S && directShareTarget.A0K.equals(directInviteContactViewModel.A06)) {
                    return true;
                }
                return false;
            case 5:
            default:
                return AbstractC25231BEo.A1a(obj, (InterfaceC16660sJ) this.A01);
            case 6:
                return ((EnumC46248KdP) obj).A00((C2EC) this.A01);
        }
    }

    public C31424DrU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
