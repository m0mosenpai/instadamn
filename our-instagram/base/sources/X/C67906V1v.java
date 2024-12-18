package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.V1v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67906V1v extends AbstractC193068gm {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C67906V1v(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj4;
        this.A02 = obj3;
        this.A01 = obj;
    }

    @Override // X.AbstractC192848gQ
    public final void A02() {
        if (4 - this.A00 != 0) {
            super.A02();
            return;
        }
        JnY jnY = ((V01) this.A02).A06;
        jnY.A0A = true;
        jnY.notifyDataSetChanged();
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(abstractC115105If, 0);
                ((InterfaceC23621Ds) this.A02).resumeWith(new C194848jk(abstractC115105If));
                return;
            case 1:
            case 2:
            default:
                ((View) this.A04).setEnabled(true);
                C9GR.A07((Context) this.A01, 2131954218);
                return;
            case 3:
                return;
            case 4:
                if (!((Fragment) this.A03).isResumed()) {
                    return;
                }
                V01 v01 = (V01) this.A02;
                JnY jnY = v01.A06;
                jnY.A0A = false;
                jnY.notifyItemChanged(1);
                C9GR.A05(v01.requireContext());
                v01.A08.dismiss();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C62862tP A04;
        C66246U5q c66246U5q = (C66246U5q) obj;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c66246U5q, 0);
                ((InterfaceC23621Ds) this.A02).resumeWith(new C3NX(C0eB.A00));
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
                Context context = (Context) this.A03;
                C14360o3.A0C(context, MSV.A00(0));
                A04 = C62862tP.A04((FragmentActivity) context, (InterfaceC11380iw) this.A01, abstractC12990ll);
                AbstractC33787EwD.A00(A04, c66246U5q);
                return;
            case 1:
            case 2:
            default:
                C14360o3.A0B(c66246U5q, 0);
                ((View) this.A04).setEnabled(true);
                A04 = C62862tP.A03((Fragment) this.A02, (AbstractC12990ll) this.A03, null);
                AbstractC33787EwD.A00(A04, c66246U5q);
                return;
            case 3:
                C14360o3.A0B(c66246U5q, 0);
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A04;
                Context context2 = (Context) this.A02;
                C14360o3.A0C(context2, MSV.A00(0));
                AbstractC33787EwD.A00(C62862tP.A04((FragmentActivity) context2, (InterfaceC11380iw) this.A01, abstractC12990ll2), c66246U5q);
                ((InterfaceC148366m6) this.A03).DOh();
                return;
            case 4:
                C14360o3.A0B(c66246U5q, 0);
                Fragment fragment = (Fragment) this.A03;
                if (!fragment.isResumed()) {
                    return;
                }
                C62862tP c62862tP = (C62862tP) this.A01;
                C69651Vss c69651Vss = (C69651Vss) this.A04;
                V01 v01 = (V01) this.A02;
                c62862tP.A01.put(R.id.info_center_refresh_callback, new C70956Wl3(fragment, c69651Vss, v01));
                AbstractC33787EwD.A00(c62862tP, c66246U5q);
                JnY jnY = v01.A06;
                jnY.A0A = false;
                jnY.notifyItemChanged(1);
                return;
        }
    }
}
