package X;

import android.view.LayoutInflater;
import android.view.View;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66392zG {
    public C4FC A01;
    public C5GX A02;
    public C5GZ A03;
    public C5GY A05;
    public Object A06;
    public boolean A0A;
    public final LayoutInflater A0B;
    public final List A0C = new ArrayList();
    public boolean A08 = false;
    public boolean A09 = false;
    public View.OnLongClickListener A00 = null;
    public C5GW A04 = null;
    public Map A07 = null;

    public final C66362zD A00() {
        InterfaceC66442zL interfaceC66442zL;
        C66462zN c66462zN;
        if (this.A08) {
            Executor executor = C194178ic.A05;
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            interfaceC66442zL = new C194178ic(A00, executor);
        } else if (this.A09) {
            interfaceC66442zL = new MX3(C14120nc.A00(), MX3.A02);
        } else {
            interfaceC66442zL = new InterfaceC66442zL() { // from class: X.2zK
                public List A01 = C16930sl.A00;
                public InterfaceC65452xh A00 = new Object();

                @Override // X.InterfaceC66442zL
                public final void EYF(InterfaceC65452xh interfaceC65452xh) {
                    C14360o3.A0B(interfaceC65452xh, 0);
                    this.A00 = interfaceC65452xh;
                }

                @Override // X.InterfaceC66442zL
                public final void EpB(ViewModelListUpdate viewModelListUpdate, InterfaceC66382zF interfaceC66382zF) {
                    C14360o3.A0B(viewModelListUpdate, 0);
                    C14360o3.A0B(interfaceC66382zF, 1);
                    C11T.A06("This operation must be run on UI thread.");
                    List A0a = AbstractC001800i.A0a(viewModelListUpdate.A00);
                    List list = this.A01;
                    this.A01 = AbstractC001800i.A0a(A0a);
                    AbstractC66552zX.A00(new C66532zV(list, A0a)).A02(this.A00);
                    interfaceC66382zF.DxB();
                }

                @Override // X.InterfaceC66442zL
                public final List AuX() {
                    return this.A01;
                }
            };
        }
        Map map = this.A07;
        if (map != null) {
            c66462zN = new C66462zN(map);
        } else {
            c66462zN = new C66462zN(this.A0C);
        }
        LayoutInflater layoutInflater = this.A0B;
        boolean z = this.A0A;
        C5GX c5gx = this.A02;
        C5GY c5gy = this.A05;
        Object obj = this.A06;
        C5GZ c5gz = this.A03;
        return new C66362zD(layoutInflater, this.A00, this.A01, c5gx, c5gz, c66462zN, this.A04, interfaceC66442zL, c5gy, obj, z);
    }

    public final void A01(AbstractC66422zJ abstractC66422zJ) {
        this.A0C.add(abstractC66422zJ);
    }

    public C66392zG(LayoutInflater layoutInflater) {
        this.A0B = layoutInflater;
    }
}
