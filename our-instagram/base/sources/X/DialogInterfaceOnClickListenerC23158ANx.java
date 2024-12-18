package X;

import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ANx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23158ANx implements DialogInterface.OnClickListener {
    public final /* synthetic */ C191478dz A00;

    public DialogInterfaceOnClickListenerC23158ANx(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        InterfaceC110214xq interfaceC110214xq;
        List BsT;
        C191478dz c191478dz = this.A00;
        C89P c89p = c191478dz.A0u;
        C84B c84b = c89p.A08;
        if (c84b != null) {
            c89p.A0L.A0O.A02.Egh(c84b);
            c89p.A08 = null;
        } else {
            ClipsCreationViewModel clipsCreationViewModel = c89p.A0L;
            C84B c84b2 = (C84B) clipsCreationViewModel.A0F.A02();
            if (c84b2 != null) {
                ArrayList A05 = c84b2.A05();
                if (!A05.isEmpty() && (interfaceC110214xq = c89p.A04) != null && (BsT = interfaceC110214xq.BsT()) != null && !BsT.isEmpty()) {
                    int size = A05.size();
                    InterfaceC110214xq interfaceC110214xq2 = c89p.A04;
                    C14360o3.A0A(interfaceC110214xq2);
                    int size2 = interfaceC110214xq2.BsT().size();
                    int min = Math.min(size, size2);
                    for (int i2 = 0; i2 < min; i2++) {
                        InterfaceC110214xq interfaceC110214xq3 = c89p.A04;
                        C14360o3.A0A(interfaceC110214xq3);
                        int durationInMs = (int) ((InterfaceC110074xc) interfaceC110214xq3.BsT().get(i2)).getDurationInMs();
                        if (((AbstractC115485Ki) A05.get(i2)).BsL() != durationInMs) {
                            ClipsCreationViewModel.A03(EnumC191648eM.A0g, clipsCreationViewModel, true);
                            ClipsCreationViewModel.A05(clipsCreationViewModel, i2, 0, durationInMs);
                        }
                    }
                    while (size2 < size) {
                        clipsCreationViewModel.A0U(size2, false);
                        size2++;
                    }
                }
            }
        }
        c191478dz.A0N(EnumC222689s9.A02);
    }
}
