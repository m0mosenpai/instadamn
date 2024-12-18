package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.Ka0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46047Ka0 extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "BackgroundImageBottomSheetFragment";
    public KFE A00;
    public boolean A01;
    public final InterfaceC09390do A02 = C1XM.A00(new C50162MDp(this, 25));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "nametag_background_image_bottomsheet_fragment";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context A06 = AbstractC31173DnH.A06(view, 0);
        AbstractC31172DnG.A1B(A06, view, AbstractC53242c7.A02(getContext()));
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        C35246Fgf c35246Fgf = new C35246Fgf(2131953590);
        c35246Fgf.A06 = true;
        c35246Fgf.A01 = R.style.igds_emphasized_title;
        A1E.add(c35246Fgf);
        A1E.add(new C35119FeM(true));
        AbstractC25235BEs.A1C(A06, LQ0.A01(this, 54), A1E, 2131953589);
        A1E.add(new C36731GHa(new LRE(this, 3), 2131953588, this.A01));
        setBottomSheetMenuItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-664278837);
        super.onCreate(bundle);
        this.A01 = requireArguments().getBoolean("ARG_IS_BACKGROUND_IMAGE_BLURRED");
        C0f9.A09(-2066456124, A02);
    }
}
