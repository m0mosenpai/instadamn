package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EHo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32230EHo extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectWellBeingUpsellBottomSheetFragment";
    public IgdsHeadline A00;
    public final InterfaceC09390do A01 = C37054GUk.A00(this, 48);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_WELL_BEING_UPSELL_BOTTOM_SHEET";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            super.onViewCreated(r7, r8)
            r0 = 2131443559(0x7f0b3f67, float:1.850919E38)
            android.view.View r0 = r7.findViewById(r0)
            com.instagram.igds.components.headline.IgdsHeadline r0 = (com.instagram.igds.components.headline.IgdsHeadline) r0
            r6.A00 = r0
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L70
            r0 = 611(0x263, float:8.56E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            android.os.Parcelable r5 = r1.getParcelable(r0)
            com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData r5 = (com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData) r5
            if (r5 == 0) goto L70
            com.instagram.igds.components.headline.IgdsHeadline r1 = r6.A00
            java.lang.String r4 = "headline"
            if (r1 == 0) goto L68
            java.lang.String r0 = r5.A08
            r1.setHeadline(r0)
            java.lang.String r3 = r5.A06
            if (r3 == 0) goto L5e
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L5e
            X.2Fb r0 = r5.A01
            if (r0 == 0) goto L5e
            java.lang.String r0 = r5.A05
            android.text.SpannableStringBuilder r2 = X.AbstractC25225BEi.A0H(r0)
            int r1 = X.AbstractC25233BEq.A04(r6)
            X.Em0 r0 = new X.Em0
            r0.<init>(r5, r6, r1)
            X.AnonymousClass773.A04(r2, r0, r3)
            com.instagram.igds.components.headline.IgdsHeadline r0 = r6.A00
            if (r0 == 0) goto L68
            r0.setBody(r2)
        L54:
            com.instagram.igds.components.headline.IgdsHeadline r1 = r6.A00
            if (r1 == 0) goto L68
            int r0 = r5.A00
            r1.setImageResource(r0)
            return
        L5e:
            com.instagram.igds.components.headline.IgdsHeadline r1 = r6.A00
            if (r1 == 0) goto L68
            java.lang.String r0 = r5.A05
            r1.setBody(r0)
            goto L54
        L68:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L70:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32230EHo.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1980459723);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_upsell_bottom_sheet_content, viewGroup, false);
        C0f9.A09(625320540, A02);
        return inflate;
    }
}
