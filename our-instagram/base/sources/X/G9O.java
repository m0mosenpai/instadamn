package X;

import android.view.View;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* loaded from: classes6.dex */
public final class G9O implements InterfaceC1569372x {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C25531Mh A01;
    public final /* synthetic */ EditProfileFieldsController A02;

    @Override // X.InterfaceC1569472y
    public final void CkI(InterfaceC37273GbQ interfaceC37273GbQ) {
    }

    @Override // X.InterfaceC1569372x
    public final void DMe(View view, C51758Mth c51758Mth, boolean z) {
    }

    public G9O(C25531Mh c25531Mh, EditProfileFieldsController editProfileFieldsController, long j) {
        this.A02 = editProfileFieldsController;
        this.A01 = c25531Mh;
        this.A00 = j;
    }

    @Override // X.InterfaceC1569372x
    public final void DMf(C51758Mth c51758Mth) {
        EditProfileFieldsController editProfileFieldsController = this.A02;
        C25531Mh c25531Mh = this.A01;
        C14360o3.A0A(c25531Mh);
        EditProfileFieldsController.A04(c25531Mh, editProfileFieldsController, "tap", this.A00);
        AbstractC31364DqT.A03().A02(editProfileFieldsController.A06(), editProfileFieldsController.A0C, "edit_profile");
    }
}
