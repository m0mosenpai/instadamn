package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.FiV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35354FiV implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public DialogInterfaceOnClickListenerC35354FiV(Context context, String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A00 = context;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean equals = this.A02.equals("get-directions");
        Context context = this.A00;
        String str = this.A04;
        String str2 = this.A01;
        String str3 = this.A03;
        if (equals) {
            C12260kU.A0E(context, AbstractC35180FfX.A00(context, C05F.A01, AnonymousClass001.A0g(str, AnonymousClass001.A0R(", ", str2), AnonymousClass001.A0R(", ", str3))));
        } else {
            AbstractC35180FfX.A03(context, str, str2, str3);
        }
    }
}
