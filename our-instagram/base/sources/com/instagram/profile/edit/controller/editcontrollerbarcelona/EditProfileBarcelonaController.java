package com.instagram.profile.edit.controller.editcontrollerbarcelona;

import X.AbstractC167017dG;
import X.C00O;
import X.C14360o3;
import X.C17P;
import X.InterfaceC11380iw;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC56392iX;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EditProfileBarcelonaController {
    public boolean A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final User A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16660sJ A06;
    public final boolean A07;
    public IgdsListCell toggleBarcelonaSwitchCell;
    public InterfaceC56392iX toggleBarcelonaViewStubber;

    public static final void A00(EditProfileBarcelonaController editProfileBarcelonaController) {
        User user = editProfileBarcelonaController.A04;
        boolean z = editProfileBarcelonaController.A00;
        C17P c17p = user.A03;
        Boolean valueOf = Boolean.valueOf(z);
        c17p.EeK(valueOf);
        user.A03.EeG(valueOf);
        IgdsListCell igdsListCell = editProfileBarcelonaController.toggleBarcelonaSwitchCell;
        if (igdsListCell != null) {
            igdsListCell.setChecked(editProfileBarcelonaController.A00);
        } else {
            C14360o3.A0F("toggleBarcelonaSwitchCell");
            throw C00O.createAndThrow();
        }
    }

    public EditProfileBarcelonaController(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC167017dG.A1Q(userSession, interfaceC11380iw);
        this.A03 = userSession;
        this.A04 = user;
        this.A02 = interfaceC11380iw;
        this.A05 = interfaceC16820sZ;
        this.A01 = context;
        this.A06 = interfaceC16660sJ;
        this.A07 = z;
        this.A00 = user.A1f();
    }
}
