package X;

import android.content.DialogInterface;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.Fib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35360Fib implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public DialogInterfaceOnClickListenerC35360Fib(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A04 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                for (int i2 = 0; i2 < this.A01; i2++) {
                    if (((boolean[]) this.A04)[i2]) {
                        ((InterfaceC55722hD) this.A02).AHg((InterfaceC94534Ng) this.A03, C05F.A00(5)[i2], this.A05);
                    }
                }
                return;
            case 1:
                G3O g3o = (G3O) this.A04;
                int i3 = AbstractC31174DnI.A0V(g3o.A01).A08;
                C142846ck A0d = AbstractC31172DnG.A0d(g3o.A03);
                int i4 = this.A01;
                InterfaceC83733oI interfaceC83733oI = (InterfaceC83733oI) this.A03;
                String A0f = AbstractC31177DnL.A0f(interfaceC83733oI);
                String str = this.A05;
                C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A0d);
                    AbstractC31174DnI.A1I(A0I, AbstractC111324zv.A00(4078));
                    A0I.A0o("channel_translation_education");
                    AbstractC31177DnL.A1H(A0I, A0d, AbstractC31179DnN.A0a(A0I, "thread_view", A0f, str, i4));
                }
                ((InterfaceC164947Zj) this.A02).Cqe(interfaceC83733oI, AbstractC111324zv.A00(5508), i3);
                return;
            default:
                EM6 em6 = (EM6) this.A02;
                String str2 = this.A05;
                List list = (List) this.A03;
                int i5 = this.A01;
                Runnable runnable = (Runnable) this.A04;
                EM6.A02(em6);
                SavedCollection savedCollection = em6.A0C;
                if (savedCollection != null) {
                    AbstractC35260Fgu.A02(em6.requireContext(), em6, em6.A05, savedCollection, runnable, str2, list, i5);
                    return;
                }
                return;
        }
    }
}
