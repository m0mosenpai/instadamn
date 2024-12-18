package X;

import android.view.View;
import com.instagram.profile.edit.controller.EditProfileFieldsController;

/* renamed from: X.FnR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35574FnR implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C25531Mh A01;
    public final /* synthetic */ EditProfileFieldsController A02;

    public ViewOnClickListenerC35574FnR(C25531Mh c25531Mh, EditProfileFieldsController editProfileFieldsController, long j) {
        this.A02 = editProfileFieldsController;
        this.A01 = c25531Mh;
        this.A00 = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1996115389);
        EditProfileFieldsController editProfileFieldsController = this.A02;
        C25531Mh c25531Mh = this.A01;
        C14360o3.A0A(c25531Mh);
        EditProfileFieldsController.A04(c25531Mh, editProfileFieldsController, "tap", this.A00);
        AbstractC31364DqT.A03().A02(editProfileFieldsController.A06(), editProfileFieldsController.A0C, "edit_profile");
        C0f9.A0C(-1867187071, A05);
    }
}
