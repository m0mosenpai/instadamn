package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4FY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FY {
    public int A00;
    public boolean A01;
    public final Activity A02;
    public final C2d4 A03;
    public final UserSession A04;

    public C4FY(Activity activity, C2d4 c2d4, UserSession userSession) {
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(userSession, 3);
        this.A02 = activity;
        this.A03 = c2d4;
        this.A04 = userSession;
        this.A00 = A00();
    }

    public final int A02(Context context, C4ZY c4zy, float f, int i, boolean z, boolean z2) {
        int A01;
        C14360o3.A0B(c4zy, 1);
        int ordinal = c4zy.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            A01 = (A01(context, z2) + (((int) (AbstractC13890nF.A01(context) / 0.8f)) + context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height))) / 2;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        A01 = ((int) (AbstractC13890nF.A01(context) / 0.8f)) + context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
                    }
                } else {
                    A01 = (int) (AbstractC13890nF.A01(context) / f);
                }
            } else {
                A01 = A01(context, z2) - context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
            }
        } else {
            A01 = A01(context, z2);
        }
        if (!z) {
            if (C18U.A06(C06090Tz.A05, this.A04, 36328663046045397L)) {
                return Math.min(i, A01);
            }
            return A01;
        }
        return A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int A00() {
        int A0B;
        int A08;
        InterfaceC53712dA interfaceC53712dA;
        int intValue;
        Activity activity = this.A02;
        View findViewById = activity.findViewById(R.id.layout_container_main);
        Integer num = null;
        if (findViewById != null) {
            num = Integer.valueOf(findViewById.getHeight());
        }
        int i = 0;
        if (num != null && (intValue = num.intValue()) > 0) {
            this.A01 = false;
            return intValue;
        }
        this.A01 = true;
        int A00 = AbstractC13890nF.A00(activity);
        if ((activity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) activity) != null && interfaceC53712dA.C4u() == 0) {
            i = activity.getResources().getDimensionPixelOffset(AbstractC53242c7.A0H(activity, AbstractC57322k7.A01(this.A04)));
        }
        if (C57992lC.A03()) {
            A0B = A00 - C57992lC.A01();
            A08 = C57992lC.A00();
        } else {
            A0B = A00 - AbstractC13880nE.A0B(activity);
            A08 = AbstractC13880nE.A08(activity);
        }
        return (A0B - A08) - i;
    }

    private final int A01(Context context, boolean z) {
        int A00;
        C56352iT AYT;
        if (this.A01) {
            this.A00 = A00();
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        C2d4 c2d4 = this.A03;
        if (c2d4 != null && (AYT = c2d4.AYT()) != null) {
            A00 = AYT.A0S.getMeasuredHeight();
        } else {
            A00 = C3HB.A00(this.A02);
        }
        int i = dimensionPixelSize + A00;
        if (z) {
            i += context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        }
        return this.A00 - i;
    }
}
