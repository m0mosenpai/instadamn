package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController;

/* renamed from: X.GBb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36577GBb implements GYA {
    public final /* synthetic */ EditProfileExpressionController A00;

    public C36577GBb(EditProfileExpressionController editProfileExpressionController) {
        this.A00 = editProfileExpressionController;
    }

    @Override // X.GYA
    public final void E4H() {
        EditProfileExpressionController editProfileExpressionController = this.A00;
        IgFormField igFormField = editProfileExpressionController.usernameField;
        if (igFormField != null) {
            String A0x = AbstractC31174DnI.A0x(igFormField);
            InterfaceC16660sJ interfaceC16660sJ = editProfileExpressionController.A02;
            C1ON A00 = AbstractC152476ta.A00(editProfileExpressionController.A00, editProfileExpressionController.A01, A0x);
            A00.A00 = new ET3(A0x, new GSw(igFormField, 31));
            interfaceC16660sJ.invoke(A00);
        }
    }
}
