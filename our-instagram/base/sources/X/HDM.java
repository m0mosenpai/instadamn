package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class HDM extends C53Z {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridPassingNativeValueIntoBloksFragment";
    public FrameLayout A00;
    public C62862tP A01;
    public C6T7 A02;
    public String A03;
    public Button A04;
    public TextView A05;
    public C57112jm A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_bloks_native_hybrid_passing_native_value_into_bloks_example";
    }

    public static void A00(HDM hdm) {
        String str = "A";
        if (hdm.A03.equals("A")) {
            str = "B";
        }
        hdm.A03 = str;
        hdm.A05.setText(str);
        if (hdm.A02 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("abc", hdm.A03);
            hdm.A02.A08(A1G);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(162798144);
        super.onCreate(bundle);
        this.A03 = "A";
        this.A06 = AbstractC31180DnO.A0N();
        this.A01 = C62862tP.A02(this, this, getSession(), this.A06);
        C0f9.A09(385378890, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(267554272);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.passing_native_value_into_bloks_example);
        this.A05 = AbstractC166987dD.A0e(A0A, R.id.native_value);
        Button button = (Button) A0A.requireViewById(R.id.button);
        this.A04 = button;
        ViewOnClickListenerC42032Ik1.A01(button, 2, this);
        this.A00 = (FrameLayout) A0A.findViewById(R.id.bloks_view);
        C1GL c1gl = this.A01.A07;
        AbstractC192798gL A06 = C192108fB.A06(getSession(), "com.instagram.bloks_native_hybrid_shell.passing_native_value_into_bloks", null);
        A06.A00(new C38949HDb(this, 1));
        c1gl.schedule(A06);
        A00(this);
        C0f9.A09(-1608271207, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1515858052);
        super.onDestroyView();
        this.A02.A04();
        C0f9.A09(921932853, A02);
    }
}
