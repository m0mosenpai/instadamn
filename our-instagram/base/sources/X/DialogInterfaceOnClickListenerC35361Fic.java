package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;

/* renamed from: X.Fic, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35361Fic implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public DialogInterfaceOnClickListenerC35361Fic(GZU gzu, FR7 fr7, User user, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = user;
        this.A03 = fr7;
        this.A04 = str;
        this.A05 = z;
        this.A01 = gzu;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0 || i == 0) {
            User user = (User) this.A02;
            boolean z = !user.A1t();
            FR7 fr7 = (FR7) this.A03;
            fr7.A00(fr7.A00, user, this.A04, this.A05);
            GZU gzu = (GZU) this.A01;
            if (gzu != null) {
                gzu.Dda();
                gzu.Ddb(user, z);
            }
        }
    }
}
