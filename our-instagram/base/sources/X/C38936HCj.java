package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.HCj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38936HCj extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "CaptionSheetFragment";
    public IgTextView A00;
    public IgdsBottomButtonLayout A01;
    public C41181vS A02;
    public C41117IIi A03;
    public String A04;
    public String A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.U9N, android.text.method.LinkMovementMethod] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38936HCj.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A05;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return I58.A00(this, str);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(665212959);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(3941));
        this.A05 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(44));
        C0f9.A09(1092631082, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1771513062);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.caption_sheet_fragment, viewGroup, false);
        C0f9.A09(-2133184884, A02);
        return inflate;
    }
}
