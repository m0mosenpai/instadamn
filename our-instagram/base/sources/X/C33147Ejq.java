package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Ejq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33147Ejq extends ELn {
    public static final String __redex_internal_original_name = "QuickSnapAudiencePickerFragment";
    public ConstraintLayout A00;
    public IgEditText A02;
    public IgSimpleImageView A03;
    public IgdsButton A04;
    public C6WQ A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public C88Z A01 = C88Z.A0Y;
    public final C3I9 A0B = C3I7.A01(this, false, true);
    public final InterfaceC60152ox A0A = new G0M(this, 6);
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        C88Z c88z;
        C14360o3.A0B(interfaceC56362iU, 0);
        String str = this.A08;
        if (str != null && (c88z = this.A01) != C88Z.A0Y) {
            string = null;
            if (c88z == C88Z.A0W) {
                string = str;
            }
        } else {
            string = AbstractC166997dE.A0N(this).getString(2131971302);
        }
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 49), AbstractC31179DnN.A0B(interfaceC56362iU, string), interfaceC56362iU);
        if (this.A01 == C88Z.A0W) {
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A02(C05F.A00);
            AbstractC31176DnK.A1B(ViewOnClickListenerC31723DwS.A00(this, 50), A0B, interfaceC56362iU);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(475);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33147Ejq.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A03(C33147Ejq c33147Ejq) {
        IgdsButton igdsButton;
        int size = ((ELn) c33147Ejq).A03.A03.size();
        C88Z c88z = c33147Ejq.A01;
        if ((c88z == C88Z.A0Y || c88z == C88Z.A0W) && (igdsButton = c33147Ejq.A04) != null) {
            boolean z = true;
            if (size <= 1) {
                z = false;
            }
            igdsButton.setEnabled(z);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        ConstraintLayout constraintLayout;
        ?? A1a = AbstractC167017dG.A1a(c32069E6v, igdsCheckBox);
        super.A0D(igdsCheckBox, c32069E6v);
        A0B().A00();
        int size = super.A03.A03.size();
        if (this.A01 == C88Z.A0Y && (constraintLayout = this.A00) != null) {
            int i = 0;
            if (size <= A1a) {
                i = 8;
            }
            constraintLayout.setVisibility(i);
        }
        A03(this);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25227BEk.A1B(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1124225680);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(AbstractC111324zv.A00(2241));
        if (string != null) {
            this.A01 = C88Z.valueOf(string);
        }
        String string2 = requireArguments.getString("list_id");
        if (string2 != null) {
            this.A07 = string2;
        }
        String string3 = requireArguments.getString(AbstractC111324zv.A00(2672));
        if (string3 != null) {
            this.A08 = string3;
        }
        String string4 = requireArguments.getString("emoji");
        if (string4 == null) {
            string4 = "⭐";
        }
        this.A06 = string4;
        this.A09 = string4;
        C0f9.A09(-1995531694, A02);
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1478929164);
        ELn.A01(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_quick_snap_audience_picker, viewGroup, false);
        C0f9.A09(2020003949, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1834741420);
        super.onDestroyView();
        this.A0B.EFx(this.A0A);
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        C0f9.A09(-1075173984, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1152622851);
        super.onStart();
        this.A0B.Dnr(requireActivity());
        C0f9.A09(-1932487676, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(2025570928);
        super.onStop();
        this.A0B.onStop();
        C0f9.A09(959499556, A02);
    }
}
