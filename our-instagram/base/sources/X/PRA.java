package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* loaded from: classes9.dex */
public final class PRA implements Runnable {
    public final /* synthetic */ C55196Oe3 A00;
    public final /* synthetic */ EditProfileFieldsController A01;

    public PRA(C55196Oe3 c55196Oe3, EditProfileFieldsController editProfileFieldsController) {
        this.A01 = editProfileFieldsController;
        this.A00 = c55196Oe3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditProfileFieldsController editProfileFieldsController = this.A01;
        if (editProfileFieldsController.linksTextCell != null && editProfileFieldsController.A08().isAttachedToWindow()) {
            C55196Oe3 c55196Oe3 = this.A00;
            FragmentActivity A06 = editProfileFieldsController.A06();
            IgdsListCell A08 = editProfileFieldsController.A08();
            int ordinal = c55196Oe3.A02.ordinal();
            if (ordinal != 9) {
                if (ordinal != 3) {
                    if (ordinal == 2) {
                        R1K r1k = c55196Oe3.A03;
                        if (r1k.hasFieldValue("is_bloks") && r1k.getCoercedBooleanField(9, "is_bloks")) {
                            C55196Oe3.A01(A06, c55196Oe3);
                            return;
                        } else {
                            C55196Oe3.A02(A06, c55196Oe3);
                            return;
                        }
                    }
                    return;
                }
                throw AbstractC166987dD.A12("Tooltip show config is required for tooltip");
            }
            String A0B = c55196Oe3.A03.A0B(DialogModule.KEY_TITLE);
            if (A0B == null) {
                return;
            }
            if (c55196Oe3.A08()) {
                C55196Oe3.A04(c55196Oe3, "LOG_EXPOSURE");
                return;
            }
            C5SU A0b = MSZ.A0b(A06, A0B);
            A0b.A04(A08, 0, 0, true);
            A0b.A01();
            C55196Oe3.A03(A0b, c55196Oe3, A06);
        }
    }
}
