package X;

import android.app.Activity;
import android.app.Fragment;
import java.util.Iterator;

@Deprecated
/* renamed from: X.Q0z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class FragmentC58696Q0z extends Fragment {
    public Sv5 A00;
    public FragmentC58696Q0z A01;
    public final C63869Sv1 A02;
    public final InterfaceC65196Tfe A03;
    public final java.util.Set A04;

    public FragmentC58696Q0z() {
        C63869Sv1 c63869Sv1 = new C63869Sv1();
        this.A03 = new C63874Sv8(this);
        this.A04 = AbstractC166987dD.A1H();
        this.A02 = c63869Sv1;
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            FragmentC58696Q0z fragmentC58696Q0z = this.A01;
            if (fragmentC58696Q0z != null) {
                fragmentC58696Q0z.A04.remove(this);
                this.A01 = null;
            }
            FragmentC58696Q0z A01 = C63460Skf.A01(activity.getFragmentManager(), ComponentCallbacks2C63416Sju.A00(activity).A05);
            this.A01 = A01;
            if (!equals(A01)) {
                this.A01.A04.add(this);
            }
        } catch (IllegalStateException e) {
            if (android.util.Log.isLoggable("RMFragment", 5)) {
                android.util.Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.A02.A00();
        FragmentC58696Q0z fragmentC58696Q0z = this.A01;
        if (fragmentC58696Q0z != null) {
            fragmentC58696Q0z.A04.remove(this);
            this.A01 = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentC58696Q0z fragmentC58696Q0z = this.A01;
        if (fragmentC58696Q0z != null) {
            fragmentC58696Q0z.A04.remove(this);
            this.A01 = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C63869Sv1 c63869Sv1 = this.A02;
        c63869Sv1.A00 = true;
        Iterator A0y = AbstractC58322PtE.A0y(c63869Sv1.A02);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C63869Sv1 c63869Sv1 = this.A02;
        c63869Sv1.A00 = false;
        Iterator A0y = AbstractC58322PtE.A0y(c63869Sv1.A02);
        while (A0y.hasNext()) {
            ((InterfaceC65538TmA) A0y.next()).onStop();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(super.toString());
        A1C.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        return JQ0.A0l(parentFragment, A1C);
    }
}
