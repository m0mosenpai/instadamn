package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LYT implements InterfaceC41501vz {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC144776fx A01;
    public final /* synthetic */ C144466fS A02;

    public LYT(C41181vS c41181vS, InterfaceC144776fx interfaceC144776fx, C144466fS c144466fS) {
        this.A00 = c41181vS;
        this.A02 = c144466fS;
        this.A01 = interfaceC144776fx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = C0f9.A03(-621461518);
        C72393Mm c72393Mm = (C72393Mm) obj;
        int A0N = AbstractC167017dG.A0N(c72393Mm, -1026552847);
        C38321qM c38321qM = c72393Mm.A02;
        if (c38321qM != null) {
            C41181vS c41181vS = this.A00;
            if (c38321qM.equals(c41181vS.A0b)) {
                InterfaceC144776fx interfaceC144776fx = this.A01;
                String str2 = c72393Mm.A03;
                View view = c72393Mm.A01;
                ClickableSpan clickableSpan = c72393Mm.A00;
                List BlY = c41181vS.BlY(EnumC75383a5.A0n);
                C84823qW c84823qW = null;
                if (BlY != null) {
                    Iterator it = BlY.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        User user = ((C84823qW) next).A1C;
                        if (user != null) {
                            str = user.getUsername();
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(str, str2)) {
                            c84823qW = next;
                            break;
                        }
                    }
                    c84823qW = c84823qW;
                }
                if (view != null && clickableSpan != null && c84823qW != null) {
                    C51u A00 = VWD.A00(clickableSpan, view, true);
                    interfaceC144776fx.D2C(c84823qW, AbstractC166987dD.A0H(A00.A00), AbstractC166987dD.A0H(A00.A01));
                }
            }
        }
        C0f9.A0A(-687209124, A0N);
        C0f9.A0A(38164664, A03);
    }
}
