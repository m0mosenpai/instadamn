package X;

import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Ldv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48558Ldv implements InterfaceC69513Al {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48558Ldv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC69513Al
    public final /* bridge */ /* synthetic */ void DLu(View view) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                C44742JrP c44742JrP = (C44742JrP) this.A01;
                C44782Js3 c44782Js3 = new C44782Js3(view);
                c44742JrP.A01 = c44782Js3;
                ((KIQ) this.A02).A03.A07.D8a(c44782Js3);
                return;
            case 1:
                C14360o3.A0B(view, 0);
                C44778Jrz c44778Jrz = (C44778Jrz) this.A01;
                KIC kic = (KIC) this.A02;
                C44780Js1 c44780Js1 = new C44780Js1(view, kic.A00);
                c44778Jrz.A00 = c44780Js1;
                kic.A03.A01.A00(c44780Js1);
                for (IgdsButton igdsButton : c44780Js1.A0B) {
                    igdsButton.setIconPadding(AbstractC166997dE.A07(igdsButton.getResources()));
                }
                return;
            default:
                return;
        }
    }
}
