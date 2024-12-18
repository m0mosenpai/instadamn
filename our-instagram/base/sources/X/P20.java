package X;

import android.widget.TextView;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class P20 implements InterfaceC58148PqD {
    public final /* synthetic */ N99 A00;
    public final /* synthetic */ java.util.Set A01;

    @Override // X.InterfaceC58148PqD
    public final void DAS() {
    }

    public P20(N99 n99, java.util.Set set) {
        this.A00 = n99;
        this.A01 = set;
    }

    @Override // X.InterfaceC58148PqD
    public final int BQ4(TextView textView) {
        return this.A00.A04.A00.A0H.A05(textView);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dka() {
        N99 n99 = this.A00;
        java.util.Set<DirectShareTarget> set = this.A01;
        HashSet hashSet = new HashSet(set.size());
        for (DirectShareTarget directShareTarget : set) {
            C51690MsL c51690MsL = C51690MsL.A02;
            C51690MsL A00 = OP5.A00(directShareTarget);
            InterfaceC58010Pnu interfaceC58010Pnu = n99.A06;
            Integer num = interfaceC58010Pnu.AXK().A01(A00).A01;
            if (num == C05F.A0C) {
                interfaceC58010Pnu.AXK().A08(A00);
            } else if (num != C05F.A01 && num != C05F.A00) {
            }
            hashSet.add(directShareTarget);
        }
        n99.A06.AXK().A06(new C49313Lr7(n99.A00, n99.A01, n99.A02, n99.A03, n99.A05, AbstractC166987dD.A1F(hashSet)), C51690MsL.A04);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = n99.A04.A00;
        directPrivateStoryRecipientController.A02++;
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dw9() {
        N99 n99 = this.A00;
        n99.A06.AXK().A08(C51690MsL.A04);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = n99.A04.A00;
        directPrivateStoryRecipientController.A03++;
        AbstractC50523MSb.A1G(directPrivateStoryRecipientController);
    }
}
