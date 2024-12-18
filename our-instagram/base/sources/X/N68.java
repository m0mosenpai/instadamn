package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;
import java.util.List;

/* loaded from: classes9.dex */
public final class N68 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenCustomQuestionFragmentV2";
    public View A00;
    public View A01;
    public ScrollView A02;
    public C3I9 A03;
    public IgFormField A04;
    public IgFormField A05;
    public C55089Oav A06;
    public AnonymousClass195 A07;
    public final InterfaceC09390do A0A;
    public final List A09 = AbstractC166987dD.A1E();
    public final InterfaceC60152ox A08 = new C56177Owk(this, 9);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131964968;
        if (A01().A0E) {
            i = 2131964967;
        }
        interfaceC56362iU.Efu(i);
        AbstractC50523MSb.A1E(interfaceC56362iU);
        C55089Oav A00 = C55089Oav.A00(this, interfaceC56362iU);
        this.A06 = A00;
        A00.A02(new ViewOnClickListenerC55461OkG(this, 53));
        Boolean bool = (Boolean) A01().A02.A02();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            C55089Oav c55089Oav = this.A06;
            if (c55089Oav != null) {
                c55089Oav.A03(booleanValue);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_custom_question_fragment";
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0196, code lost:
    
        X.AbstractC16960so.A1U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x019d, code lost:
    
        throw X.C00O.createAndThrow();
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N68.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C51753Mtc c51753Mtc, C54543O7v c54543O7v, N68 n68) {
        int A0H = AbstractC166987dD.A0H(c51753Mtc.A02);
        if (A0H != 1) {
            if (A0H != 2) {
                if (A0H != 0) {
                    throw B4Z.A00();
                }
                return;
            } else {
                c54543O7v.A01 = "error";
                c54543O7v.A00 = n68.getString(c51753Mtc.A01);
                return;
            }
        }
        c54543O7v.A01 = "confirmed";
    }

    public final C51021MgT A01() {
        return (C51021MgT) this.A0A.getValue();
    }

    public N68() {
        C57544PgI A01 = C57544PgI.A01(this, 48);
        InterfaceC09390do A00 = C57544PgI.A00(C57544PgI.A01(this, 45), EnumC09460dv.A02, 46);
        this.A0A = AbstractC25225BEi.A0a(C57544PgI.A01(A00, 47), A01, C57534Pg8.A00(A00, null, 33), AbstractC25225BEi.A1D(C51021MgT.class));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return A01().A05;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C51021MgT A01 = A01();
        if (A01.A00) {
            O3S o3s = A01.A06;
            String str = A01.A08;
            C14360o3.A0B(str, 0);
            InterfaceC58268PsC.A02(o3s.A00, str, "lead_gen_custom_question", "cancel");
        }
        A01.A00 = true;
        AbstractC13880nE.A0O(AbstractC50522MSa.A0J(this));
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1161466177);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_custom_question, viewGroup, false);
        C0f9.A09(-71722744, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1909551141);
        super.onDestroy();
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            c3i9.onDestroy();
        }
        C0f9.A09(-1116444576, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-47152753);
        super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A09.clear();
        this.A00 = null;
        this.A02 = null;
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            c3i9.EFx(this.A08);
        }
        C0f9.A09(-407855271, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-666857663);
        super.onResume();
        IgFormField igFormField = this.A05;
        if (igFormField != null) {
            igFormField.post(new PNG(this));
        }
        C0f9.A09(1468373749, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1002707643);
        super.onStart();
        this.A07 = PZH.A01(this, A01().A0B, 41);
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        C0f9.A09(-243552389, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1323559702);
        super.onStop();
        this.A07 = MSY.A0r(this.A07);
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C0f9.A09(1825980104, A02);
    }
}
