package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.Dvl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31680Dvl implements InterfaceC08830cm {
    public final int A00;
    public final Object A01;

    public C31680Dvl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        switch (this.A00) {
            case 0:
                return C16030qx.A02.A05((Context) this.A01);
            case 1:
                return ((Fragment) this.A01).requireActivity();
            case 2:
            case 3:
            default:
                return ((AbstractC43842Ja5) this.A01).getRecyclerView();
            case 4:
                return AbstractC28761aE.A00(((DirectPrivateStoryRecipientController) ((EZF) this.A01).A01).A0B);
            case 5:
                return AbstractC28761aE.A00(((C31673Dve) this.A01).A01);
            case 6:
                return this.A01;
        }
    }
}
