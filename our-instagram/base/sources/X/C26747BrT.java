package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26747BrT extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ChallengeDetailsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "challenge_details_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 20), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.api.schemas.ChallengeName A00(X.C26747BrT r4) {
        /*
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "CHALLENGE_NAME_KEY"
            r0 = 33
            android.os.Bundle r1 = r4.mArguments
            if (r3 < r0) goto L17
            if (r1 == 0) goto L1e
            java.lang.Class<com.instagram.api.schemas.ChallengeName> r0 = com.instagram.api.schemas.ChallengeName.class
            java.lang.Object r0 = r1.getParcelable(r2, r0)
        L12:
            com.instagram.api.schemas.ChallengeName r0 = (com.instagram.api.schemas.ChallengeName) r0
            if (r0 == 0) goto L1e
            return r0
        L17:
            if (r1 == 0) goto L1e
            android.os.Parcelable r0 = r1.getParcelable(r2)
            goto L12
        L1e:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26747BrT.A00(X.BrT):com.instagram.api.schemas.ChallengeName");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.api.schemas.ChallengeState A01(X.C26747BrT r4) {
        /*
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "CHALLENGE_STATE_KEY"
            r0 = 33
            android.os.Bundle r1 = r4.mArguments
            if (r3 < r0) goto L17
            if (r1 == 0) goto L1e
            java.lang.Class<com.instagram.api.schemas.ChallengeState> r0 = com.instagram.api.schemas.ChallengeState.class
            java.lang.Object r0 = r1.getParcelable(r2, r0)
        L12:
            com.instagram.api.schemas.ChallengeState r0 = (com.instagram.api.schemas.ChallengeState) r0
            if (r0 == 0) goto L1e
            return r0
        L17:
            if (r1 == 0) goto L1e
            android.os.Parcelable r0 = r1.getParcelable(r2)
            goto L12
        L1e:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26747BrT.A01(X.BrT):com.instagram.api.schemas.ChallengeState");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public C26747BrT() {
        C29911DGz A01 = C29911DGz.A01(this, 1);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C29911DGz.A01(C29911DGz.A01(this, 2), 3));
        this.A00 = AbstractC25225BEi.A0a(C29911DGz.A01(A00, 4), A01, new C29894DGi(4, A00, null), AbstractC25225BEi.A1D(C25872BcU.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1329528379);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 25), 1025748293);
        C0f9.A09(76686223, A02);
        return A00;
    }
}
