package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FiQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35349FiQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;

    public DialogInterfaceOnClickListenerC35349FiQ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, long j) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = j;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC35105Fe7.A00(this.A01, this.A02, this.A03, Long.valueOf(this.A00), "ig_direct");
    }
}
