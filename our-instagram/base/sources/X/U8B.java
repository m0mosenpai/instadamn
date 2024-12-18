package X;

import android.app.Dialog;
import android.content.Context;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U8B extends Dialog {
    public final /* synthetic */ C1338462s A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        InterfaceC103384lE interfaceC103384lE = this.A01;
        if (interfaceC103384lE != null) {
            C1338462s c1338462s = this.A00;
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            try {
                C6FP.A03((C6FG) interfaceC16820sZ.invoke(), c1338462s.A02, C6FW.A01, interfaceC103384lE);
            } catch (Exception e) {
                interfaceC16660sJ.invoke(e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8B(Context context, C1338462s c1338462s, InterfaceC103384lE interfaceC103384lE, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, R.style.alaska_full_screen_dialog);
        this.A01 = interfaceC103384lE;
        this.A00 = c1338462s;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16660sJ;
    }
}
