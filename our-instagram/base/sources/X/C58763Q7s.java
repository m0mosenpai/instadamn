package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* renamed from: X.Q7s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58763Q7s extends Fragment {
    public Sv5 A00;
    public C58763Q7s A01;
    public final C63869Sv1 A02;
    public final InterfaceC65196Tfe A03;
    public final java.util.Set A04;

    public C58763Q7s() {
        C63869Sv1 c63869Sv1 = new C63869Sv1();
        this.A03 = new C63875Sv9(this);
        this.A04 = AbstractC166987dD.A1H();
        this.A02 = c63869Sv1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.mParentFragment != null) {
            fragment = fragment.mParentFragment;
        }
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        if (abstractC10360h2 == null) {
            if (android.util.Log.isLoggable("SupportRMFragment", 5)) {
                android.util.Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            Context context2 = getContext();
            C58763Q7s c58763Q7s = this.A01;
            if (c58763Q7s != null) {
                c58763Q7s.A04.remove(this);
                this.A01 = null;
            }
            C58763Q7s A02 = C63460Skf.A02(abstractC10360h2, ComponentCallbacks2C63416Sju.A00(context2).A05);
            this.A01 = A02;
            if (equals(A02)) {
                return;
            }
            this.A01.A04.add(this);
        } catch (IllegalStateException e) {
            if (!android.util.Log.isLoggable("SupportRMFragment", 5)) {
                return;
            }
            android.util.Log.w("SupportRMFragment", "Unable to register fragment with root", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1812280972);
        super.onDestroy();
        this.A02.A00();
        C58763Q7s c58763Q7s = this.A01;
        if (c58763Q7s != null) {
            c58763Q7s.A04.remove(this);
            this.A01 = null;
        }
        C0f9.A09(-136973099, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(806206852);
        super.onDetach();
        C58763Q7s c58763Q7s = this.A01;
        if (c58763Q7s != null) {
            c58763Q7s.A04.remove(this);
            this.A01 = null;
        }
        C0f9.A09(-244001966, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(285770725);
        super.onStart();
        C63869Sv1 c63869Sv1 = this.A02;
        c63869Sv1.A00 = true;
        Iterator A0y = AbstractC58322PtE.A0y(c63869Sv1.A02);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStart();
        }
        C0f9.A09(1633551320, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1948325020);
        super.onStop();
        C63869Sv1 c63869Sv1 = this.A02;
        c63869Sv1.A00 = false;
        Iterator A0y = AbstractC58322PtE.A0y(c63869Sv1.A02);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStop();
        }
        C0f9.A09(2120980408, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append("{parent=");
        Fragment fragment = this.mParentFragment;
        if (fragment == null) {
            fragment = null;
        }
        return JQ0.A0l(fragment, A1C);
    }
}
