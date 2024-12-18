package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.FiI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35341FiI implements DialogInterface.OnClickListener {
    public final /* synthetic */ C69453Af A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ CharSequence[] A02;

    public DialogInterfaceOnClickListenerC35341FiI(C69453Af c69453Af, Reel reel, CharSequence[] charSequenceArr) {
        this.A00 = c69453Af;
        this.A01 = reel;
        this.A02 = charSequenceArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CharSequence[] charSequenceArr = this.A02;
        CharSequence charSequence = charSequenceArr[i];
        C69453Af c69453Af = this.A00;
        Context context = c69453Af.A0C;
        if (C14360o3.A0K(charSequence, context.getString(2131952428))) {
            UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType = UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04;
            UserSession userSession = c69453Af.A0F;
            AbstractC31173DnH.A1G(c69453Af.A0D, AbstractC33775Ew1.A00(updateProfilePicturePagerAdapter$UpdateProfileTabType, userSession, "ig_self_profile", false, true, false), AbstractC31175DnJ.A0N(userSession));
            return;
        }
        if (C14360o3.A0K(charSequenceArr[i], context.getString(2131952429))) {
            C69453Af.A04(c69453Af, this.A01.A0a());
            return;
        }
        throw new UnsupportedOperationException("Dialog option not supported");
    }
}
