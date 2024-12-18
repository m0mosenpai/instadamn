package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EZ5 extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public EZ5(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(exc, 0);
                C54718OEv c54718OEv = (C54718OEv) this.A02;
                FIN fin = c54718OEv.A02;
                if (fin != null) {
                    fin.A01.APl();
                    fin.A00.DY2();
                }
                c54718OEv.A02 = null;
                return;
            case 1:
            case 2:
            default:
                super.onFail(exc);
                return;
            case 3:
                C35035Fc8 c35035Fc8 = (C35035Fc8) this.A02;
                C35035Fc8.A00(AbstractC121115e3.A00(c35035Fc8.A0F), c35035Fc8);
                c35035Fc8.A01.post(new GLU((C2AH) this.A01));
                return;
            case 4:
                return;
            case 5:
                C14360o3.A0B(exc, 0);
                C55209OeS.A05(exc);
                ((InterfaceC24901Jp) this.A01).EKh(null, new C194848jk(exc));
                return;
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C5e4 c5e4;
        DirectShareSheetFragment directShareSheetFragment;
        FQ1 fq1;
        boolean z;
        Object A08;
        switch (this.A00) {
            case 0:
                File file = (File) obj;
                C14360o3.A0B(file, 0);
                C54718OEv c54718OEv = (C54718OEv) this.A02;
                ((Al8) this.A01).A06 = C8IU.A03(file, 3, 0);
                c54718OEv.A03 = false;
                FIN fin = c54718OEv.A02;
                if (fin != null) {
                    fin.A01.APl();
                    fin.A00.DY3();
                }
                c54718OEv.A02 = null;
                return;
            case 1:
                c5e4 = (C5e4) obj;
                directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                fq1 = (FQ1) this.A02;
                z = false;
                break;
            case 2:
                c5e4 = (C5e4) obj;
                directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                fq1 = (FQ1) this.A02;
                z = true;
                break;
            case 3:
                C5e4 A0L = AbstractC31174DnI.A0L(obj);
                C35035Fc8 c35035Fc8 = (C35035Fc8) this.A02;
                C35035Fc8.A00(A0L, c35035Fc8);
                c35035Fc8.A01.post(new GLU((C2AH) this.A01));
                return;
            case 4:
                AbstractC27461Uz abstractC27461Uz = (AbstractC27461Uz) obj;
                C14360o3.A0B(abstractC27461Uz, 0);
                Fragment fragment = (Fragment) this.A01;
                FragmentActivity activity = fragment.getActivity();
                if (activity == null) {
                    return;
                }
                abstractC27461Uz.getSmartLockBroker(activity, new TGV(fragment, 0), (AbstractC12990ll) this.A02);
                return;
            default:
                C14360o3.A0B(obj, 0);
                ((InterfaceC24901Jp) this.A01).EKh(null, AbstractC25225BEi.A0z(obj));
                return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (String str : fq1.A02) {
            HashMap hashMap = directShareSheetFragment.A19;
            if (hashMap.containsKey(str)) {
                A08 = hashMap.get(str);
            } else if (C5e4.A00(c5e4)) {
                synchronized (c5e4) {
                    A08 = c5e4.A00.A08(str);
                }
            } else {
                A08 = c5e4.A00.A08(str);
            }
            if (A08 == null && str != null) {
                UserSession userSession = directShareSheetFragment.A0H;
                C14360o3.A0B(userSession, 0);
                AnonymousClass777 A0G = DirectThreadApi.A0G(userSession, null, null, null, null, str, null, null, "shortcuts_fetch");
                A0G.A00(new ETR(directShareSheetFragment, A1E, fq1, str, 0, z));
                directShareSheetFragment.A0A++;
                if (z) {
                    DirectShareSheetFragment.A0L(directShareSheetFragment, A1E);
                }
                C1GJ.A03(A0G);
            } else {
                A1E.add(A08);
            }
        }
        Iterator it = fq1.A03.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (A15 != null) {
                A1E.add(new DirectShareTarget(A15));
            }
        }
        if (directShareSheetFragment.A0A != 0) {
            return;
        }
        if (z) {
            DirectShareSheetFragment.A0L(directShareSheetFragment, A1E);
        } else {
            DirectShareSheetFragment.A0H(directShareSheetFragment, fq1, A1E);
        }
    }
}
