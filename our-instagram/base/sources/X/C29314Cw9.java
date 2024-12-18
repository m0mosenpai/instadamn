package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Cw9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29314Cw9 implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;

    public C29314Cw9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        switch (this.A00) {
            case 0:
                ((C58883QEt) this.A01).A05();
                return;
            case 1:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 2:
            default:
                return;
            case 3:
                C26749BrW.A00((C26749BrW) this.A01);
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        if (2 - this.A00 == 0) {
            AbstractC25231BEo.A16((Fragment) this.A01);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        String str;
        switch (this.A00) {
            case 0:
                C58883QEt c58883QEt = (C58883QEt) this.A01;
                SOY soy = c58883QEt.A0X;
                Bundle A03 = c58883QEt.A03();
                Integer num = c58883QEt.A0Y.A00.A0A.A00;
                C61602RqR A00 = soy.A00("DISPLAYED_AUTOSAVE_TOAST", false);
                if (num != null) {
                    if (1 - num.intValue() != 0) {
                        str = "Update";
                    } else {
                        str = "Overwrite";
                    }
                    A00.A01("save_type", str);
                }
                C63305ShB.A00().A07(A03, A00.A00().A01());
                return;
            case 1:
            case 2:
            case 3:
            default:
                return;
            case 4:
                BP5 bp5 = ((C25869BcQ) this.A01).A05;
                bp5.A04(C8p.A0G, bp5.A00);
                return;
            case 5:
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25226BEj.A10(((C26819Bsh) this.A01).A08));
                A0w.E77("creator_inspiration_hub_toast_impression", true);
                A0w.apply();
                return;
        }
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
