package X;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.MZc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50684MZc implements InterfaceC59992oh, InterfaceC65626Tpm, InterfaceC60012oj, InterfaceC71183He, InterfaceC60062oo {
    public final C07T A00;
    public final InterfaceC60012oj A01;
    public final List A02;
    public final List A03;

    public C50684MZc(C07T c07t, InterfaceC60012oj interfaceC60012oj) {
        C14360o3.A0B(interfaceC60012oj, 2);
        this.A00 = c07t;
        this.A01 = interfaceC60012oj;
        this.A02 = new CopyOnWriteArrayList();
        this.A03 = new CopyOnWriteArrayList();
        interfaceC60012oj.addFragmentVisibilityListener(this);
        c07t.A09(this);
    }

    @Override // X.InterfaceC60012oj
    public final void addFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.A03.add(interfaceC71183He);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // X.InterfaceC60012oj
    public final void removeFragmentVisibilityListener(InterfaceC71183He interfaceC71183He) {
        C14360o3.A0B(interfaceC71183He, 0);
        this.A03.remove(interfaceC71183He);
    }

    @Override // X.InterfaceC60062oo
    public final boolean isResumed() {
        return MSY.A1R(this.A00.A07().compareTo(C07S.RESUMED));
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC60602pj) it.next()).onDestroyView();
        }
        this.A01.removeFragmentVisibilityListener(this);
        this.A00.A0A(this);
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC60602pj) it.next()).onPause();
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC60602pj) it.next()).onResume();
        }
    }

    @Override // X.InterfaceC59992oh
    public final void registerLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        if (interfaceC60602pj != null) {
            this.A02.add(interfaceC60602pj);
        }
    }

    @Override // X.InterfaceC59992oh
    public final void unregisterLifecycleListener(InterfaceC60602pj interfaceC60602pj) {
        if (interfaceC60602pj != null) {
            this.A02.remove(interfaceC60602pj);
        }
    }

    @Override // X.InterfaceC71183He
    public final void DI9(Fragment fragment) {
        if (isResumed()) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC71183He) it.next()).DI9(fragment);
            }
        }
    }

    @Override // X.InterfaceC71183He
    public final void DID(Fragment fragment) {
        if (isResumed()) {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC71183He) it.next()).DID(fragment);
            }
        }
    }
}
