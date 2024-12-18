package X;

import android.content.DialogInterface;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.Ofm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55271Ofm implements DialogInterface.OnClickListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ InstagramMainActivity A01;

    public DialogInterfaceOnClickListenerC55271Ofm(C38321qM c38321qM, InstagramMainActivity instagramMainActivity) {
        this.A01 = instagramMainActivity;
        this.A00 = c38321qM;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InstagramMainActivity.A0P(this.A00, this.A01, EnumC53333Nij.valueOf("USER_DISMISSED_POST_FRICTION_DIALOG").ordinal());
        dialogInterface.dismiss();
    }
}
