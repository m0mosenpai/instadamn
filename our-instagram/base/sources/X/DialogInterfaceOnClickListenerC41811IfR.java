package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;

/* renamed from: X.IfR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41811IfR implements DialogInterface.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C145176gc A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ ArrayList A04;

    public DialogInterfaceOnClickListenerC41811IfR(C41181vS c41181vS, C41551w4 c41551w4, C145176gc c145176gc, String str, ArrayList arrayList) {
        this.A02 = c145176gc;
        this.A00 = c41181vS;
        this.A01 = c41551w4;
        this.A04 = arrayList;
        this.A03 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C145176gc c145176gc = this.A02;
        C145906hn c145906hn = c145176gc.A0d;
        if (c145906hn == null) {
            C14360o3.A0F("reelProfileOpener");
            throw C00O.createAndThrow();
        }
        C41181vS c41181vS = this.A00;
        C141596ac C00 = ((ReelViewerFragment) c145176gc.A18).A1C.C00(c41181vS);
        c145906hn.A02(C65.BRAND, c41181vS, this.A01, C00, (User) this.A04.get(i), this.A03, AbstractC111324zv.A00(2989), false);
    }
}
