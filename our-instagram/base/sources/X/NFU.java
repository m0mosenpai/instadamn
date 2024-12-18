package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.gallery.Medium;
import com.instagram.modal.TransparentModalActivity;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NFU extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public NFU(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A04 = obj;
        this.A03 = obj2;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            C9GR.A0B(AbstractC31172DnG.A06(this.A01), "MediaSaver_something_went_wrong");
        } else {
            C9GR.A0A(AbstractC31171DnF.A09(this.A04), "share_error");
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        if (this.A00 != 0) {
            ((Dialog) this.A02).dismiss();
        } else {
            AbstractC63248Sg4.A01(((Fragment) this.A04).getParentFragmentManager());
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        if (this.A00 != 0) {
            C0fJ.A00((Dialog) this.A02);
        } else {
            AbstractC63248Sg4.A02(((Fragment) this.A04).getParentFragmentManager());
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        InterfaceC69973Cg interfaceC69973Cg;
        if (this.A00 != 0) {
            ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
            RectF rectF = (RectF) this.A04;
            C41181vS c41181vS = (C41181vS) this.A03;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_ENTRY_POINT", C22P.A3n);
            A0b.putParcelable("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_ENTRY_VIEW_BOUNDS", rectF);
            A0b.putString("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_MEDIA_ID", c41181vS.A0j);
            A0b.putString("ReelPollShareResultCameraFragment.ARGUMENTS_KEY_MEDIA_FILE_PATH", ((File) obj).getAbsolutePath());
            AbstractC31173DnH.A1I(reelDashboardFragment, C6XJ.A02(reelDashboardFragment.requireActivity(), A0b, reelDashboardFragment.A06, TransparentModalActivity.class, AbstractC111324zv.A00(5182)));
            return;
        }
        List list = (List) obj;
        C14360o3.A0B(list, 0);
        C22P c22p = C22P.A37;
        C52156N6i c52156N6i = (C52156N6i) this.A04;
        AbstractC208269Jl.A00(AbstractC166987dD.A0r(c52156N6i.A05)).A07(c22p, true);
        List list2 = (List) this.A03;
        if (list2.size() == 1) {
            C38321qM A0x = AbstractC25225BEi.A0x(list2, 0);
            Medium medium = (Medium) list.get(0);
            if (A0x.Cff()) {
                InterfaceC69973Cg interfaceC69973Cg2 = (InterfaceC69973Cg) this.A01;
                if (interfaceC69973Cg2 == null) {
                    return;
                }
                String id = A0x.getId();
                String A15 = AbstractC25225BEi.A15(c52156N6i.A03);
                C69963Cf c69963Cf = (C69963Cf) interfaceC69973Cg2;
                C14360o3.A0B(medium, 0);
                Context context = c69963Cf.A03;
                AbstractC31171DnF.A1O(context);
                Activity activity = (Activity) context;
                if (!AbstractC23048AEe.A01(MSY.A0W(medium, 0), new C7FH(context), true, true)) {
                    return;
                }
                AbstractC86593tX.A0L(activity, c22p, c69963Cf.A04, null, null, A15, id, AbstractC166987dD.A1J(medium), false);
                return;
            }
            if (!A0x.A5x() || (interfaceC69973Cg = (InterfaceC69973Cg) this.A01) == null) {
                return;
            }
            interfaceC69973Cg.EnD(medium.A02(), c22p, null, C5L6.A08, A0x.getId(), null, null, null, AbstractC25225BEi.A15(c52156N6i.A03), null, AbstractC166987dD.A1J(A0x.getId()), 108, 10005, false);
            return;
        }
        InterfaceC69973Cg interfaceC69973Cg3 = (InterfaceC69973Cg) this.A01;
        if (interfaceC69973Cg3 == null) {
            return;
        }
        String A152 = AbstractC25225BEi.A15(c52156N6i.A03);
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC37302Gc3.A0g(it));
        }
        interfaceC69973Cg3.E2N((AbstractC018607g) this.A02, c22p, A152, list2, list, AbstractC001800i.A0X(A0q), 108, 10005);
    }
}
