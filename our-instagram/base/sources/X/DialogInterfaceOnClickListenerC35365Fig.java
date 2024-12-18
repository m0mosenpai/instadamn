package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.user.model.User;

/* renamed from: X.Fig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35365Fig implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC1568572n A01;
    public final /* synthetic */ C154536x3 A02;
    public final /* synthetic */ C70F A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ CharSequence[] A05;

    public DialogInterfaceOnClickListenerC35365Fig(Context context, InterfaceC1568572n interfaceC1568572n, C154536x3 c154536x3, C70F c70f, User user, CharSequence[] charSequenceArr) {
        this.A03 = c70f;
        this.A01 = interfaceC1568572n;
        this.A04 = user;
        this.A02 = c154536x3;
        this.A05 = charSequenceArr;
        this.A00 = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CharSequence[] charSequenceArr = this.A05;
        CharSequence charSequence = charSequenceArr[i];
        Context context = this.A00;
        if (C14360o3.A0K(charSequence, context.getString(2131952349))) {
            C70F.A01(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04, this.A03);
        } else {
            if (C14360o3.A0K(charSequenceArr[i], context.getString(2131952413))) {
                C70F c70f = this.A03;
                C70F.A02(this.A01, this.A02, c70f, this.A04);
                return;
            }
            throw new UnsupportedOperationException("Dialog option not supported");
        }
    }
}
