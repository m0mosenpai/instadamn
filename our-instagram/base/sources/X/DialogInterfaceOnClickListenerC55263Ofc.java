package X;

import android.content.DialogInterface;
import com.instagram.creation.fragment.EditMediaInfoFragment;

/* renamed from: X.Ofc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55263Ofc implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public DialogInterfaceOnClickListenerC55263Ofc(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OXN oxn = this.A00.A0O;
        if (oxn.A06()) {
            oxn.A01();
        } else {
            oxn.A03();
        }
    }
}
