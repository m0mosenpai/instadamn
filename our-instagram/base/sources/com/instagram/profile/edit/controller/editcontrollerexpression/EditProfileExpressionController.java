package com.instagram.profile.edit.controller.editcontrollerexpression;

import X.C14360o3;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC57949Pmv;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;

/* loaded from: classes6.dex */
public final class EditProfileExpressionController {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC16660sJ A02;
    public final boolean A03;
    public final boolean A04;
    public final InterfaceC57949Pmv A05;
    public final InterfaceC16820sZ A06;
    public IgFormField nameField;
    public IgFormField usernameField;

    public EditProfileExpressionController(Context context, UserSession userSession, InterfaceC57949Pmv interfaceC57949Pmv, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A06 = interfaceC16820sZ;
        this.A00 = context;
        this.A02 = interfaceC16660sJ;
        this.A03 = z;
        this.A05 = interfaceC57949Pmv;
        this.A04 = z2;
    }
}
