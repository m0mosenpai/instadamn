package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.GJp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36792GJp implements InterfaceC42241xE {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;
    public final /* synthetic */ InterfaceC83713oG A01;

    public C36792GJp(DirectAggregatedMediaViewerController directAggregatedMediaViewerController, InterfaceC83713oG interfaceC83713oG) {
        this.A01 = interfaceC83713oG;
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        if (this.A01 instanceof InterfaceC2056098k) {
            DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
            FragmentActivity fragmentActivity = directAggregatedMediaViewerController.A0v;
            DirectShareTarget directShareTarget = directAggregatedMediaViewerController.A0S;
            if (directShareTarget != null) {
                str = AbstractC31172DnG.A14(directShareTarget);
            } else {
                str = null;
            }
            C9GR.A09(fragmentActivity, AbstractC167007dF.A0f(fragmentActivity, str, 2131960438));
        }
    }
}
