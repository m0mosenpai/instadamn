package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.2pV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60462pV {
    public final ArrayList A00 = new ArrayList();

    public final void A0A(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onSaveInstanceState(bundle);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A0C(View view) {
        C14360o3.A0B(view, 0);
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.D8S(view);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A0D(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onViewCreated(view, bundle);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public static final InterfaceC60602pj A00(C60462pV c60462pV, int i) {
        ArrayList arrayList = c60462pV.A00;
        if (i < arrayList.size()) {
            return (InterfaceC60602pj) arrayList.get(i);
        }
        return null;
    }

    public final void A01() {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onCreate();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A02() {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onDestroy();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A03() {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onDestroyView();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A04() {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onPause();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A05() {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onResume();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A06() {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onStart();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A07() {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onStop();
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A08(int i, int i2, Intent intent) {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i3 = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onActivityResult(i, i2, intent);
            }
            if (i3 >= 0) {
                size = i3;
            } else {
                return;
            }
        }
    }

    public final void A09(Configuration configuration) {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onConfigurationChanged(configuration);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A0B(Bundle bundle) {
        int size = this.A00.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            InterfaceC60602pj A00 = A00(this, size);
            if (A00 != null) {
                A00.onViewStateRestored(bundle);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    public final void A0E(InterfaceC60602pj interfaceC60602pj) {
        if (interfaceC60602pj != null) {
            ArrayList arrayList = this.A00;
            if (!arrayList.contains(interfaceC60602pj)) {
                arrayList.add(interfaceC60602pj);
            }
        }
    }
}
