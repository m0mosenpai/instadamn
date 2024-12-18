package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.FiX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35356FiX implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C31289DpB A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public DialogInterfaceOnClickListenerC35356FiX(FragmentActivity fragmentActivity, UserSession userSession, C31289DpB c31289DpB, String str, String str2) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = c31289DpB;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A01;
        AbstractC25228BEl.A1G(this.A00, AbstractC31178DnM.A06("origin", "BROADCAST_CHANNEL"), userSession, ModalActivity.class, "fan_club_creator_settings");
        this.A02.A02(EnumC33478ErD.BUTTON_TAPPED, this.A04, this.A03);
    }
}
