package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33252Elm extends AnonymousClass772 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33252Elm(Integer num, Object obj, int i) {
        super(num);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                V08 v08 = (V08) this.A01;
                FragmentActivity requireActivity = v08.requireActivity();
                UserSession userSession = v08.A01;
                if (userSession != null) {
                    A0y = AbstractC25228BEl.A0y(requireActivity, userSession, C2Fb.A35, "https://www.facebook.com/policies/ads/prohibited_content/discriminatory_practices");
                    A0y.A0S = "promote";
                    break;
                } else {
                    AbstractC31171DnF.A0u();
                    throw C00O.createAndThrow();
                }
            case 2:
                C34588FLx c34588FLx = (C34588FLx) this.A01;
                Context context = c34588FLx.A00;
                UserSession userSession2 = c34588FLx.A02;
                A0y = new C63397SjR(context, userSession2, C2Fb.A0K, C18U.A04(C06090Tz.A05, userSession2, 36886961551180531L), false);
                break;
            case 3:
                ((C31632Duy) this.A01).A01.A00.A12();
                return;
            case 4:
                ((View.OnClickListener) this.A01).onClick(view);
                return;
            default:
                EKE eke = (EKE) this.A01;
                AbstractC10360h2 abstractC10360h2 = eke.mFragmentManager;
                if (abstractC10360h2 != null) {
                    if (eke.A0E) {
                        abstractC10360h2.A12();
                        return;
                    } else {
                        abstractC10360h2.A18("recovery_lookup_screen", 1);
                        return;
                    }
                }
                return;
        }
        A0y.A0A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33252Elm(C34588FLx c34588FLx, int i) {
        super(Integer.valueOf(i));
        this.A00 = 2;
        this.A01 = c34588FLx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33252Elm(C31632Duy c31632Duy, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = c31632Duy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33252Elm(V08 v08, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = v08;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33252Elm(InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = interfaceC16820sZ;
    }
}
