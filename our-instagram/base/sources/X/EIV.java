package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class EIV extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CaaLoginOneTapLogOutFragment";
    public C83743oJ A00;
    public LinearLayout A01;
    public C83753oK A02;
    public final HashMap A07 = AbstractC166987dD.A1G();
    public final HashMap A08 = AbstractC166987dD.A1G();
    public final ArrayList A03 = AbstractC166987dD.A1E();
    public final ArrayList A04 = AbstractC166987dD.A1E();
    public final ArrayList A05 = AbstractC166987dD.A1E();
    public final ArrayList A06 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(179);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b A[LOOP:1: B:19:0x00c7->B:33:0x013b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.3oK, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1482260208);
        super.onCreate(bundle);
        this.A00 = C83743oJ.A01(AbstractC166987dD.A0o(this.A09));
        this.A02 = new Object();
        C0f9.A09(-1584959526, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-226627745);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.caa_login_one_tap_bottom_sheet, viewGroup, false);
        this.A01 = AbstractC31172DnG.A0B(inflate, R.id.container);
        C0f9.A09(-388695454, A02);
        return inflate;
    }
}
