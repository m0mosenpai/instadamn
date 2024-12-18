package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;

/* renamed from: X.Oav, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55089Oav {
    public ActionButton A00;
    public final InterfaceC56362iU A01;
    public final Context A02;
    public final C35026Fbz A03 = new C35026Fbz(C05F.A00);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Ffp, java.lang.Object] */
    public final void A02(View.OnClickListener onClickListener) {
        ActionButton A00 = C31722DwR.A00(onClickListener, this.A01, new Object());
        this.A00 = A00;
        A00.setButtonResource(R.drawable.instagram_check_pano_outline_24);
        A03(false);
        ActionButton actionButton = this.A00;
        if (actionButton != null) {
            actionButton.setColorFilter(C3DY.A00(AbstractC31174DnI.A03(this.A02)));
        } else {
            C14360o3.A0F("actionButton");
            throw C00O.createAndThrow();
        }
    }

    public static void A01(C55089Oav c55089Oav, Object obj, int i) {
        c55089Oav.A02(new ViewOnClickListenerC55461OkG(obj, i));
        c55089Oav.A03(true);
    }

    public final void A03(boolean z) {
        ActionButton actionButton = this.A00;
        if (actionButton != null) {
            actionButton.setEnabled(z);
            ActionButton actionButton2 = this.A00;
            if (actionButton2 != null) {
                Context context = this.A02;
                int i = R.attr.igds_color_secondary_text;
                if (z) {
                    i = R.attr.igds_color_primary_text;
                }
                actionButton2.setColorFilter(C3DY.A00(AbstractC167007dF.A09(context, i)));
                return;
            }
        }
        C14360o3.A0F("actionButton");
        throw C00O.createAndThrow();
    }

    public final void A04(boolean z) {
        C35026Fbz c35026Fbz = this.A03;
        Context context = this.A02;
        int i = R.attr.igds_color_secondary_text;
        if (z) {
            i = R.attr.igds_color_primary_text;
        }
        c35026Fbz.A07 = C3DY.A00(AbstractC167007dF.A09(context, i));
        InterfaceC56362iU interfaceC56362iU = this.A01;
        interfaceC56362iU.Ehg(c35026Fbz.A01());
        interfaceC56362iU.ETp(z);
    }

    public C55089Oav(Context context, InterfaceC56362iU interfaceC56362iU) {
        this.A02 = context;
        this.A01 = interfaceC56362iU;
    }

    public static C55089Oav A00(Fragment fragment, InterfaceC56362iU interfaceC56362iU) {
        return new C55089Oav(fragment.requireContext(), interfaceC56362iU);
    }
}
