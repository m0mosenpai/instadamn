package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

/* loaded from: classes8.dex */
public final class M45 implements Runnable {
    public final /* synthetic */ KBT A00;
    public final /* synthetic */ List A01;

    public M45(KBT kbt, List list) {
        this.A01 = list;
        this.A00 = kbt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        A0E.A01(this.A01);
        KBT kbt = this.A00;
        C66362zD c66362zD = kbt.A04;
        if (c66362zD == null) {
            C14360o3.A0F("magicMediaRemixTemplateAdapter");
            throw C00O.createAndThrow();
        }
        c66362zD.A05(A0E);
        AbstractC167007dF.A0w(kbt.A03);
    }
}
