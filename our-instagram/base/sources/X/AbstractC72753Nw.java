package X;

import android.os.Bundle;

/* renamed from: X.3Nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC72753Nw extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IgBloksScreenFragmentBase";
    public int A00 = -1;
    public int A01 = -1;
    public boolean A02;
    public boolean A03;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        this.A03 = true;
        super.onSaveInstanceState(bundle);
        bundle.putInt("__key_screen_modal_level", this.A00);
        bundle.putInt(AbstractC111324zv.A00(1869), this.A00);
        bundle.putBoolean("__key_screen_is_modal_root", this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-292274824);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A02 = bundle.getBoolean("__key_screen_is_modal_root", false);
        this.A00 = bundle.getInt("__key_screen_modal_level", -1);
        this.A01 = bundle.getInt(AbstractC111324zv.A00(1869), -1);
        if (this.A00 == -1) {
            WT5 A00 = WT5.A02.A00(requireActivity());
            if (this.A02) {
                int i = this.A01;
                A00.A00.put(Integer.valueOf(A00.A01.incrementAndGet()), Integer.valueOf(i));
            }
            this.A00 = A00.A01.get();
        }
        C0f9.A09(-1997854916, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroy() {
        int i;
        int A02 = C0f9.A02(500450097);
        super.onDestroy();
        if (this.A03) {
            i = 546930544;
        } else if (this.A02 && getActivity() != null) {
            WT5 A00 = WT5.A02.A00(requireActivity());
            if (A00.A00.remove(Integer.valueOf(this.A00)) != null) {
                A00.A01.decrementAndGet();
            }
            i = 71394671;
        } else {
            i = 1770448331;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(560580616);
        super.onResume();
        this.A03 = false;
        C0f9.A09(1808933995, A02);
    }
}
