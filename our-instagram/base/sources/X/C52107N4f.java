package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.N4f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52107N4f extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsTrialNuxBottomSheetFragment";
    public InterfaceC16820sZ A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final String A05 = __redex_internal_original_name;
    public final InterfaceC09390do A03 = C1XM.A00(new C57239PbN(this, 27));
    public final InterfaceC09390do A01 = C1XM.A00(new C57239PbN(this, 26));
    public final InterfaceC09390do A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57239PbN(this, 28));

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (r2 == 3) goto L34;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52107N4f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-510658708);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_trial_bottomsheet, viewGroup, false);
        C0f9.A09(-1279699307, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C57312k6 A0a;
        int i;
        int A02 = C0f9.A02(-1994953570);
        super.onResume();
        int ordinal = ((EnumC53164NfJ) this.A01.getValue()).ordinal();
        if (ordinal != 4) {
            if (ordinal != 3) {
                if (ordinal == 1) {
                    A0a = AbstractC25229BEm.A0a(this);
                    i = 12;
                }
                C0f9.A09(1629492115, A02);
            }
            A0a = AbstractC25229BEm.A0a(this);
            i = 13;
        } else {
            A0a = AbstractC25229BEm.A0a(this);
            i = 14;
        }
        PZE.A02(this, A0a, i);
        C0f9.A09(1629492115, A02);
    }
}
