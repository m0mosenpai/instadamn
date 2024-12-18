package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.Bqy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26717Bqy extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ProfileCardDownloadBottomSheetFragment";
    public C54695ODv A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setBackgroundColor(view.getContext().getColor(AbstractC53242c7.A02(getContext())));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = C0f9.A02(2046886794);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            i = bundle2.getInt("header_res_key");
        } else {
            i = 0;
        }
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30497Dbg(i, 36, this), -1865358480);
        C0f9.A09(842914962, A02);
        return A00;
    }
}
