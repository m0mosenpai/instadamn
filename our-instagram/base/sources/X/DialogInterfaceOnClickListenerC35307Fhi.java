package X;

import android.content.DialogInterface;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.Fhi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35307Fhi implements DialogInterface.OnClickListener {
    public final /* synthetic */ InstagramMainActivity A00;

    public DialogInterfaceOnClickListenerC35307Fhi(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.finish();
    }
}
