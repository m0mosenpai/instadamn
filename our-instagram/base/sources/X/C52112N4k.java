package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.N4k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52112N4k extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IGGenAISelfDisclosureBottomsheetFragment";
    public EnumC124565kK A00;
    public C8EZ A01;
    public String A02;
    public View A03;
    public MediaGenAIDetectionMethod A04;
    public IgdsSwitch A05;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C57517Pfr(this, 47));
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_genai_self_disclosure_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A04;
        if (mediaGenAIDetectionMethod != null) {
            bundle.putString("argument_current_value", mediaGenAIDetectionMethod.toString());
        }
        EnumC124565kK enumC124565kK = this.A00;
        if (enumC124565kK != null) {
            bundle.putString("argument_compose_type", enumC124565kK.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 == com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B) goto L13;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            super.onViewCreated(r6, r7)
            android.view.View r2 = r5.A03
            java.lang.String r4 = "root"
            r1 = 0
            if (r2 == 0) goto La4
            r0 = 2131441136(0x7f0b35f0, float:1.8504275E38)
            android.view.View r3 = r2.requireViewById(r0)
            boolean r0 = r3 instanceof com.instagram.igds.components.switchbutton.IgdsSwitch
            if (r0 == 0) goto La1
            com.instagram.igds.components.switchbutton.IgdsSwitch r3 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r3
        L1b:
            r5.A05 = r3
            if (r3 == 0) goto L2c
            com.instagram.api.schemas.MediaGenAIDetectionMethod r2 = r5.A04
            if (r2 == 0) goto L28
            com.instagram.api.schemas.MediaGenAIDetectionMethod r1 = com.instagram.api.schemas.MediaGenAIDetectionMethod.A0B
            r0 = 1
            if (r2 != r1) goto L29
        L28:
            r0 = 0
        L29:
            r3.setChecked(r0)
        L2c:
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = r5.A05
            if (r2 == 0) goto L39
            r1 = 40
            X.P3T r0 = new X.P3T
            r0.<init>(r5, r1)
            r2.A07 = r0
        L39:
            X.0do r0 = r5.A07
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            boolean r0 = X.C124575kL.A01(r0)
            if (r0 == 0) goto L62
            android.view.View r1 = r5.A03
            if (r1 == 0) goto La4
            r0 = 2131441135(0x7f0b35ef, float:1.8504273E38)
            android.view.View r2 = r1.requireViewById(r0)
            boolean r0 = r2 instanceof android.widget.TextView
            if (r0 == 0) goto L62
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L62
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964738(0x7f133342, float:1.9566266E38)
            X.AbstractC166987dD.A1P(r1, r2, r0)
        L62:
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964735(0x7f13333f, float:1.956626E38)
            java.lang.String r3 = X.AbstractC166997dE.A0p(r1, r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131964736(0x7f133340, float:1.9566262E38)
            java.lang.String r2 = X.AbstractC166997dE.A0p(r1, r0)
            int r1 = X.AbstractC25233BEq.A04(r5)
            X.NY0 r0 = new X.NY0
            r0.<init>(r5, r1)
            android.text.SpannableStringBuilder r2 = X.MSY.A0B(r0, r2, r3)
            android.view.View r1 = r5.A03
            if (r1 == 0) goto La4
            r0 = 2131441134(0x7f0b35ee, float:1.8504271E38)
            android.view.View r1 = r1.requireViewById(r0)
            boolean r0 = r1 instanceof android.widget.TextView
            if (r0 == 0) goto La0
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto La0
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r1.setText(r2, r0)
            X.AbstractC25227BEk.A11(r1)
        La0:
            return
        La1:
            r3 = r1
            goto L1b
        La4:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52112N4k.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1479205261);
        super.onCreate(bundle);
        String string = requireArguments().getString("argument_compose_type");
        String string2 = requireArguments().getString("argument_current_value");
        String string3 = requireArguments().getString("argument_post_id");
        if (string != null) {
            this.A00 = EnumC124565kK.valueOf(string);
        }
        if (string2 != null) {
            this.A04 = AbstractC85933sM.A00(string2);
        }
        if (string3 != null) {
            this.A02 = string3;
        }
        C0f9.A09(-1552770757, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(910456481);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.genai_self_disclosure_bottom_sheet_layout, viewGroup, false);
        this.A03 = inflate;
        if (inflate == null) {
            C14360o3.A0F("root");
            throw C00O.createAndThrow();
        }
        C0f9.A09(1272953988, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(367206672);
        super.onDestroyView();
        this.A05 = null;
        C0f9.A09(2113589165, A02);
    }
}
