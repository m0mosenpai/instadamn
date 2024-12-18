package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.Fin, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35372Fin implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ BusinessConversionActivity A01;
    public final /* synthetic */ InterfaceC37191Ga2 A02;
    public final /* synthetic */ C1GL A03;
    public final /* synthetic */ EnumC222416a A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public DialogInterfaceOnClickListenerC35372Fin(Context context, BusinessConversionActivity businessConversionActivity, InterfaceC37191Ga2 interfaceC37191Ga2, C1GL c1gl, EnumC222416a enumC222416a, String str, boolean z) {
        this.A01 = businessConversionActivity;
        this.A03 = c1gl;
        this.A00 = context;
        this.A05 = str;
        this.A02 = interfaceC37191Ga2;
        this.A04 = enumC222416a;
        this.A06 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        BusinessConversionActivity.A00(this.A00, this.A01, this.A02, this.A03, this.A04, true, this.A06);
    }
}
