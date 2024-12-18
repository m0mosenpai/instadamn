package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.model.hashtag.HashtagImpl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LYU implements InterfaceC41501vz {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC144776fx A01;
    public final /* synthetic */ C144466fS A02;

    public LYU(C41181vS c41181vS, InterfaceC144776fx interfaceC144776fx, C144466fS c144466fS) {
        this.A00 = c41181vS;
        this.A02 = c144466fS;
        this.A01 = interfaceC144776fx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = C0f9.A03(267450452);
        C72413Mo c72413Mo = (C72413Mo) obj;
        int A0N = AbstractC167017dG.A0N(c72413Mo, -571433818);
        C38321qM c38321qM = c72413Mo.A02;
        if (c38321qM != null) {
            C41181vS c41181vS = this.A00;
            if (c38321qM.equals(c41181vS.A0b)) {
                InterfaceC144776fx interfaceC144776fx = this.A01;
                String str2 = c72413Mo.A03;
                View view = c72413Mo.A01;
                ClickableSpan clickableSpan = c72413Mo.A00;
                List BlY = c41181vS.BlY(EnumC75383a5.A0d);
                C84823qW c84823qW = null;
                if (BlY != null) {
                    Iterator it = BlY.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        HashtagImpl hashtagImpl = ((C84823qW) next).A0l;
                        if (hashtagImpl != null) {
                            str = hashtagImpl.A0D;
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
        C0f9.A0A(1490410683, A0N);
        C0f9.A0A(-282949747, A03);
    }
}
