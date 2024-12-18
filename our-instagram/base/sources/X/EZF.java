package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import java.io.File;
import java.math.BigInteger;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZF extends C2AG {
    public final int A00;
    public final Object A01;

    public EZF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Context requireContext;
        C07270a1 c07270a1;
        switch (this.A00) {
            case 0:
                SelectHighlightsCoverFragment selectHighlightsCoverFragment = (SelectHighlightsCoverFragment) this.A01;
                FragmentActivity activity = selectHighlightsCoverFragment.getActivity();
                C54662OCo c54662OCo = selectHighlightsCoverFragment.A03;
                if (activity != null && c54662OCo != null) {
                    selectHighlightsCoverFragment.A00.getClass();
                    Rect A05 = MX2.A05(c54662OCo.A01, selectHighlightsCoverFragment.A00.getWidth(), selectHighlightsCoverFragment.A00.getHeight(), 1, 1);
                    Bitmap A0C = C1NC.A0C(selectHighlightsCoverFragment.A00, MX2.A06(A05), A05.width(), A05.height());
                    Activity rootActivity = selectHighlightsCoverFragment.getRootActivity();
                    rootActivity.getClass();
                    File A04 = AbstractC13530mf.A04(rootActivity);
                    C1NC.A0M(A0C, A04);
                    Intent A042 = AbstractC31171DnF.A04();
                    A042.putExtra("extraBitmapFile", A04);
                    return A042;
                }
                return null;
            case 1:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
                Context context = directPrivateStoryRecipientController.A0w.getContext();
                if (context == null) {
                    return new FIZ(null, null);
                }
                AbstractC28761aE.A00(directPrivateStoryRecipientController.A0B).CoS("RecipientsLoader");
                C31675Dvg c31675Dvg = directPrivateStoryRecipientController.A0G;
                if (c31675Dvg == null) {
                    c31675Dvg = new C31675Dvg(context, directPrivateStoryRecipientController.A0B, "coefficient_ios_section_test_bootstrap_ranking", new C31680Dvl(this, 4), true, false, false);
                    directPrivateStoryRecipientController.A0G = c31675Dvg;
                }
                c31675Dvg.A04("");
                ArrayList A03 = directPrivateStoryRecipientController.A0G.A03(Collections.emptyList());
                UserSession userSession = directPrivateStoryRecipientController.A0B;
                List<C2EC> A0G = ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0G(C4I1.A00, C2EB.A04, C4I3.A0I);
                BigInteger bigInteger = AbstractC31677Dvi.A00;
                ArrayList A0q = AbstractC25230BEn.A0q(A0G);
                for (C2EC c2ec : A0G) {
                    if (c2ec.BI1() == 0 && !c2ec.CPl()) {
                        A0q.add(AbstractC31677Dvi.A00(context, userSession, c2ec));
                    }
                }
                ArrayList A17 = AbstractC25225BEi.A17(150);
                Iterator it = A03.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (A17.size() < 150) {
                        A17.add(next);
                    } else {
                        Collections.sort(A17, new C31460Ds4((InterfaceC16620sF) new C30495Dbe(Collator.getInstance(), 30), 7));
                        return new FIZ(A0q, A17);
                    }
                }
                Collections.sort(A17, new C31460Ds4((InterfaceC16620sF) new C30495Dbe(Collator.getInstance(), 30), 7));
                return new FIZ(A0q, A17);
            case 2:
                EKF ekf = (EKF) this.A01;
                requireContext = ekf.requireContext();
                c07270a1 = ekf.A05;
                AbstractC167017dG.A1N(requireContext, c07270a1);
                return C35269Fh4.A01(requireContext, null, c07270a1, null, null);
            default:
                C32316ELf c32316ELf = (C32316ELf) this.A01;
                if (c32316ELf.getContext() != null) {
                    requireContext = c32316ELf.getContext();
                    String str = C32316ELf.A0X;
                    c07270a1 = c32316ELf.A06;
                    AbstractC167017dG.A1N(requireContext, c07270a1);
                    return C35269Fh4.A01(requireContext, null, c07270a1, null, null);
                }
                throw new Exception("the context should not bu null.");
        }
    }

    @Override // X.C11R
    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 294;
            case 1:
                return 435;
            case 2:
                return 270;
            default:
                return 269;
        }
    }

    @Override // X.C2AG, X.C2AH, X.C11R
    public final void onFinish() {
        if (this.A00 != 0) {
            super.onFinish();
        } else {
            super.onFinish();
            AbstractC25231BEo.A16((Fragment) this.A01);
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                Intent intent = (Intent) obj;
                FragmentActivity A09 = AbstractC31171DnF.A09(this.A01);
                if (A09 == null) {
                    return;
                }
                int i = 0;
                if (intent != null) {
                    i = -1;
                }
                A09.setResult(i, intent);
                return;
            case 1:
                FIZ fiz = (FIZ) obj;
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
                List list = fiz.A01;
                List list2 = fiz.A00;
                if (list != null) {
                    DirectPrivateStoryRecipientController.A0B(directPrivateStoryRecipientController, list);
                    DirectPrivateStoryRecipientController.A0C(directPrivateStoryRecipientController, list);
                    C52199N8o c52199N8o = directPrivateStoryRecipientController.A0H;
                    java.util.Set set = c52199N8o.A0e;
                    set.clear();
                    C52199N8o.A01(c52199N8o);
                    set.addAll(list);
                }
                if (list2 != null) {
                    DirectPrivateStoryRecipientController.A0B(directPrivateStoryRecipientController, list2);
                    DirectPrivateStoryRecipientController.A0C(directPrivateStoryRecipientController, list2);
                    directPrivateStoryRecipientController.A0H.A05 = list2;
                }
                directPrivateStoryRecipientController.A0H.A06();
                return;
            case 2:
                ((EKF) this.A01).A0S = (List) obj;
                return;
            default:
                C32316ELf c32316ELf = (C32316ELf) this.A01;
                String str = C32316ELf.A0X;
                c32316ELf.A0F = (List) obj;
                return;
        }
    }
}
