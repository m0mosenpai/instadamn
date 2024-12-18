package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class U59 {
    public Integer A00;
    public int A01;

    public final void A01(View view, AbstractC72463Mt abstractC72463Mt, C65981Txa c65981Txa) {
        Window window;
        Window window2;
        Object obj;
        C14360o3.A0B(view, 1);
        if (((C0SG) abstractC72463Mt).A01 != null) {
            U4Q u4q = W1a.A01.A00;
            Iterator A13 = AbstractC166997dE.A13(u4q.A00);
            while (true) {
                if (A13.hasNext()) {
                    Object next = A13.next();
                    C14360o3.A07(next);
                    InterfaceC57142jp interfaceC57142jp = (InterfaceC57142jp) next;
                    if (!(interfaceC57142jp instanceof Wi3) || ((obj = ((Wi3) interfaceC57142jp).A00.get()) != null && obj.equals(view))) {
                        break;
                    }
                } else {
                    u4q.A7i(new Wi3(view));
                    break;
                }
            }
        }
        FragmentActivity activity = abstractC72463Mt.getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            this.A01 = window2.getAttributes().softInputMode;
        }
        if (c65981Txa.A0E == U6H.A07) {
            Activity rootActivity = abstractC72463Mt.getRootActivity();
            C30D.A04(rootActivity, rootActivity.getColor(R.color.fds_transparent));
            return;
        }
        Integer num = c65981Txa.A0G;
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        Dialog dialog = ((C0SG) abstractC72463Mt).A01;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(intValue);
    }

    public final void A02(AbstractC72463Mt abstractC72463Mt) {
        Window window;
        View view = abstractC72463Mt.mView;
        if (view != null) {
            Iterator A13 = AbstractC166997dE.A13(W1a.A01.A00.A00);
            while (A13.hasNext()) {
                InterfaceC57142jp interfaceC57142jp = (InterfaceC57142jp) AbstractC166997dE.A0l(A13);
                if (!(interfaceC57142jp instanceof Wi3)) {
                    break;
                }
                Object obj = ((Wi3) interfaceC57142jp).A00.get();
                if (obj == null || obj == view) {
                    A13.remove();
                }
            }
        }
        FragmentActivity activity = abstractC72463Mt.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(this.A01);
        }
        Integer num = this.A00;
        if (num != null) {
            C30D.A04(abstractC72463Mt.getRootActivity(), num.intValue());
        }
    }

    public static final void A00(AbstractC72463Mt abstractC72463Mt) {
        AbstractC10360h2 parentFragmentManager = abstractC72463Mt.getParentFragmentManager();
        if (parentFragmentManager.A0L() > 0 && !parentFragmentManager.A0G) {
            parentFragmentManager.A0b();
        } else {
            AbstractC25231BEo.A16(abstractC72463Mt);
        }
    }
}
