package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.Bs9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26785Bs9 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "LearnMoreBottomSheetImpl";
    public InterfaceC30958DjF A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "offensive_content_warning";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC30958DjF interfaceC30958DjF = this.A00;
        if (interfaceC30958DjF != null) {
            interfaceC30958DjF.DAn();
            return false;
        }
        return false;
    }

    public C26785Bs9() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C57529Pg3(this, 37));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57529Pg3(this, 38));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C57529Pg3(this, 35));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C57529Pg3(this, 36));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            r0 = 1398241146(0x5357777a, float:9.2542245E11)
            int r2 = X.C0f9.A02(r0)
            r4 = 0
            X.C14360o3.A0B(r10, r4)
            android.content.Context r3 = r9.requireContext()
            r0 = 2131625721(0x7f0e06f9, float:1.8878658E38)
            android.view.View r5 = r10.inflate(r0, r11, r4)
            r0 = 2131435414(0x7f0b1f96, float:1.849267E38)
            android.widget.TextView r8 = X.AbstractC167007dF.A0N(r5, r0)
            X.0do r6 = r9.A01
            java.lang.Object r0 = r6.getValue()
            r7 = 1
            if (r0 == 0) goto L97
            java.lang.Object r0 = r6.getValue()
            X.9rx r0 = (X.EnumC222569rx) r0
            if (r0 == 0) goto L4f
            int r0 = r0.ordinal()
            if (r0 != r4) goto L8f
            boolean r0 = X.AbstractC14490oL.A09(r3)
            if (r0 == 0) goto L97
            r1 = 2131953694(0x7f13081e, float:1.9543866E38)
            r0 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r0 = r9.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r9.getString(r1, r0)
            r8.setText(r0)
        L4f:
            r0 = 2131435404(0x7f0b1f8c, float:1.849265E38)
            android.widget.TextView r8 = X.AbstractC167007dF.A0N(r5, r0)
            X.0do r0 = r9.A04
            java.lang.Object r0 = r0.getValue()
            X.9s5 r0 = (X.EnumC222649s5) r0
            if (r0 == 0) goto Lb1
            int r0 = r0.ordinal()
            if (r0 == r4) goto La2
            if (r0 != r7) goto L87
            java.lang.Object r0 = r6.getValue()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r6.getValue()
            X.9rx r0 = (X.EnumC222569rx) r0
            if (r0 == 0) goto Lb1
            int r0 = r0.ordinal()
            if (r0 == r4) goto L9e
            X.B4Z r1 = X.B4Z.A00()
            r0 = 1691176064(0x64cd4c80, float:3.029676E22)
        L83:
            X.C0f9.A09(r0, r2)
            throw r1
        L87:
            X.B4Z r1 = X.B4Z.A00()
            r0 = 1726085560(0x66e1f9b8, float:5.3356948E23)
            goto L83
        L8f:
            X.B4Z r1 = X.B4Z.A00()
            r0 = -160006633(0xfffffffff6767e17, float:-1.24986566E33)
            goto L83
        L97:
            r0 = 2131968937(0x7f1343a9, float:1.9574783E38)
            r8.setText(r0)
            goto L4f
        L9e:
            r1 = 2131968934(0x7f1343a6, float:1.9574777E38)
            goto Lae
        La2:
            boolean r0 = X.AbstractC14490oL.A09(r3)
            r1 = 2131968933(0x7f1343a5, float:1.9574775E38)
            if (r0 == 0) goto Lae
            r1 = 2131953693(0x7f13081d, float:1.9543864E38)
        Lae:
            r8.setText(r1)
        Lb1:
            r0 = 2131435405(0x7f0b1f8d, float:1.8492651E38)
            android.widget.TextView r6 = X.AbstractC166987dD.A0e(r5, r0)
            if (r6 == 0) goto Lff
            r6.setVisibility(r4)
            r0 = 2131968935(0x7f1343a7, float:1.9574779E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.SpannableStringBuilder r7 = X.AbstractC25225BEi.A0H(r0)
            int r0 = X.AbstractC53242c7.A06(r3)
            int r0 = r3.getColor(r0)
            X.C2f r3 = new X.C2f
            r3.<init>(r9, r0)
            int r1 = r7.length()
            r0 = 18
            r7.setSpan(r3, r4, r1, r0)
            X.AbstractC25227BEk.A11(r6)
            r0 = 2131968936(0x7f1343a8, float:1.957478E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.SpannableStringBuilder r1 = X.AbstractC25225BEi.A0H(r0)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            android.text.SpannableStringBuilder r1 = r0.append(r7)
            java.lang.String r0 = "."
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            r6.setText(r0)
        Lff:
            r0 = 1550701831(0x5c6dd507, float:2.6777518E17)
            X.C0f9.A09(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26785Bs9.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1858772486);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            AbstractC56932jR.A06(view.findViewById(R.id.learn_more_title), 500L);
            C0f9.A09(-1266622204, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-747979172, A02);
            throw A0g;
        }
    }
}
