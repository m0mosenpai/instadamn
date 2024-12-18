package X;

import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* loaded from: classes6.dex */
public final class GMB implements Runnable {
    public final /* synthetic */ EditProfileFieldsController A00;

    public GMB(EditProfileFieldsController editProfileFieldsController) {
        this.A00 = editProfileFieldsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditProfileFieldsController editProfileFieldsController = this.A00;
        if (editProfileFieldsController.linksTextCell != null && editProfileFieldsController.A08().isAttachedToWindow()) {
            C5SU A0f = AbstractC167017dG.A0f(editProfileFieldsController.A06(), editProfileFieldsController.A06().getResources().getString(2131967911));
            A0f.A04(editProfileFieldsController.A08(), 0, 0, true);
            A0f.A02();
            A0f.A07(C5SV.A06);
            A0f.A0B = false;
            A0f.A0A = true;
            EfP.A00(A0f, editProfileFieldsController, 12).A07(editProfileFieldsController.A0C);
        }
    }
}
