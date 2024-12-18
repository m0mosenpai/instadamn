package X;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.BuE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26911BuE extends AbstractC193068gm {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C26911BuE(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.AbstractC192848gQ
    public final void A01() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
                ((Dialog) this.A01).dismiss();
                return;
            default:
                super.A01();
                return;
        }
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        Context requireContext;
        String str;
        int i = this.A00;
        Fragment fragment = (Fragment) this.A02;
        switch (i) {
            case 0:
            case 2:
                requireContext = fragment.requireContext();
                str = "open_possible_scammer_bottom_sheet";
                break;
            case 1:
            case 3:
                requireContext = fragment.requireContext();
                str = "open_similar_user_failed";
                break;
            default:
                AbstractC25226BEj.A1P(fragment);
                return;
        }
        C9GR.A0D(requireContext, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        InterfaceC09390do interfaceC09390do;
        C66246U5q c66246U5q = (C66246U5q) obj;
        switch (this.A00) {
            case 0:
            case 1:
                C14360o3.A0B(c66246U5q, 0);
                interfaceC09390do = ((C26777Bry) this.A02).A02;
                AbstractC33787EwD.A00((C62862tP) AbstractC166987dD.A17(interfaceC09390do), c66246U5q);
                return;
            case 2:
            case 3:
            default:
                C14360o3.A0B(c66246U5q, 0);
                interfaceC09390do = ((C26872BtZ) this.A02).A06;
                AbstractC33787EwD.A00((C62862tP) AbstractC166987dD.A17(interfaceC09390do), c66246U5q);
                return;
            case 4:
                C14360o3.A0B(c66246U5q, 0);
                AbstractC33787EwD.A00((C62862tP) this.A01, c66246U5q);
                ((C26786BsA) this.A02).A01 = true;
                return;
            case 5:
                C14360o3.A0B(c66246U5q, 0);
                AbstractC33787EwD.A00((C62862tP) this.A01, c66246U5q);
                ((C26787BsB) this.A02).A01 = true;
                return;
        }
    }
}
