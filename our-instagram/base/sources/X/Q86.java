package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class Q86 extends Fragment implements InterfaceC65566Tms {
    public static final WeakHashMap A03 = new WeakHashMap();
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(new C005001p(0));
    public int A00 = 0;

    @Override // X.InterfaceC65566Tms
    public final void A80(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new HandlerC1341163w(Looper.getMainLooper()).post(new TQ3(lifecycleCallback, this, str));
                return;
            }
            return;
        }
        throw AbstractC58320PtC.A0l("LifecycleCallback with tag ", str, " already added to this fragment.");
    }

    @Override // X.InterfaceC65566Tms
    public final LifecycleCallback Ajs(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            Iterator A15 = AbstractC166997dE.A15(this.A02);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                Bundle A0b = AbstractC166987dD.A0b();
                ((LifecycleCallback) A1K.getValue()).A05(A0b);
                bundle.putBundle(AbstractC31172DnG.A17(A1K), A0b);
            }
        }
    }

    @Override // X.InterfaceC65566Tms
    public final /* synthetic */ Activity BN7() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((LifecycleCallback) A16.next()).A08(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((LifecycleCallback) A16.next()).A03(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int A02 = C0f9.A02(-544826621);
        super.onCreate(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        Iterator A15 = AbstractC166997dE.A15(this.A02);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            LifecycleCallback lifecycleCallback = (LifecycleCallback) A1K.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(AbstractC31172DnG.A17(A1K));
            } else {
                bundle2 = null;
            }
            lifecycleCallback.A04(bundle2);
        }
        C0f9.A09(-958236405, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1576057034);
        super.onDestroy();
        this.A00 = 5;
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            A16.next();
        }
        C0f9.A09(-1150198533, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1059664708);
        super.onResume();
        this.A00 = 3;
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((LifecycleCallback) A16.next()).A02();
        }
        C0f9.A09(2018005250, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1474959548);
        super.onStart();
        this.A00 = 2;
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((LifecycleCallback) A16.next()).A06();
        }
        C0f9.A09(1912662489, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-949417288);
        super.onStop();
        this.A00 = 4;
        Iterator A16 = AbstractC166997dE.A16(this.A02);
        while (A16.hasNext()) {
            ((LifecycleCallback) A16.next()).A07();
        }
        C0f9.A09(2003769891, A02);
    }
}
