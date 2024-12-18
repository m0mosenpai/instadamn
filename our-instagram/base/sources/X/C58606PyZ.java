package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.PyZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58606PyZ extends Fragment {
    public static final Handler A05 = AbstractC167007dF.A0J();
    public InterfaceC23471Cj A00;
    public C23461Ci A01;
    public boolean A03;
    public String[] A04 = new String[0];
    public boolean A02 = false;

    public final void A01(InterfaceC23471Cj interfaceC23471Cj, C23461Ci c23461Ci, String[] strArr) {
        this.A04 = strArr;
        for (String str : strArr) {
            if (Build.VERSION.SDK_INT >= 34 && (str.equals("android.permission.READ_MEDIA_IMAGES") || str.equals("android.permission.READ_MEDIA_VIDEO") || str.equals("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"))) {
                this.A02 = true;
                break;
            }
        }
        this.A01 = c23461Ci;
        this.A00 = interfaceC23471Cj;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("PermissionRequestFragment.BUNDLE_KEY_PERMISSIONS_REQUESTED", this.A03);
    }

    public static void A00(Context context, ArrayList arrayList) {
        ArrayList A1E = AbstractC166987dD.A1E();
        boolean z = true;
        boolean A1N = AbstractC167007dF.A1N(C02G.A00(context, "android.permission.READ_MEDIA_IMAGES"));
        boolean A1N2 = AbstractC167007dF.A1N(C02G.A00(context, "android.permission.READ_MEDIA_VIDEO"));
        if (C02G.A00(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0) {
            z = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (C02G.A00(context, A1B) != 0 && (!A1B.equals("android.permission.READ_MEDIA_IMAGES") || (!A1N && !z))) {
                if (!A1B.equals("android.permission.READ_MEDIA_VIDEO") || (!A1N2 && !z)) {
                    if (!A1B.equals("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") || (!A1N && !A1N2 && !z)) {
                        A1E.add(A1B);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1722178686);
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("PermissionRequestFragment.BUNDLE_KEY_PERMISSIONS_REQUESTED")) {
            String[] strArr = this.A04;
            if (strArr != null) {
                ArrayList A12 = AbstractC58319PtB.A12(strArr);
                if (this.A02) {
                    A00(requireContext(), A12);
                }
                if (!A12.isEmpty()) {
                    requestPermissions(AbstractC58319PtB.A1b(A12, 0), 0);
                } else {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        A05.post(new RunnableC58645PzI(this, AbstractC23451Ch.A02(activity, strArr)));
                    }
                }
                this.A03 = true;
            } else {
                C0w9.A03("PermissionRequestFragment", "permission cannot be null");
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    C14240no A0G = MSY.A0G(activity2);
                    A0G.A03(this);
                    A0G.A01();
                }
            }
        }
        C0f9.A09(1929008865, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        EnumC172127lh enumC172127lh;
        HashMap A1G = AbstractC166987dD.A1G();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (iArr[i2] == 0) {
                enumC172127lh = EnumC172127lh.A05;
            } else if (shouldShowRequestPermissionRationale(str)) {
                enumC172127lh = EnumC172127lh.A03;
            } else {
                enumC172127lh = EnumC172127lh.A04;
            }
            A1G.put(str, enumC172127lh);
        }
        if (EnumC172127lh.A04.equals(A1G.get("android.permission.ACCESS_FINE_LOCATION")) && EnumC172127lh.A05.equals(A1G.get(AbstractC43591JPw.A00(5)))) {
            A1G.put("android.permission.ACCESS_FINE_LOCATION", EnumC172127lh.A03);
        }
        A05.post(new RunnableC58645PzI(this, A1G));
    }
}
