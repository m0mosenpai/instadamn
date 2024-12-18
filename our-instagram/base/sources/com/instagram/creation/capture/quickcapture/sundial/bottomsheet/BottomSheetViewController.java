package com.instagram.creation.capture.quickcapture.sundial.bottomsheet;

import X.AbstractC001800i;
import X.AbstractC167007dF;
import X.AbstractC50524MSc;
import X.C16930sl;
import X.C55733Ooz;
import X.C55982hj;
import X.C56277Oym;
import X.EnumC53228NgQ;
import X.InterfaceC55932he;
import X.InterfaceC57815Pkh;
import X.InterfaceC58112Ppb;
import X.InterfaceC58282Psa;
import X.InterfaceC60602pj;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import java.util.List;

/* loaded from: classes9.dex */
public final class BottomSheetViewController implements InterfaceC60602pj {
    public float A00;
    public float A01;
    public C55982hj A02;
    public InterfaceC58282Psa A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final ViewGroup A07;
    public final InterfaceC58112Ppb A08;
    public final InterfaceC57815Pkh A09;
    public final boolean A0A;
    public final int A0B;
    public final InterfaceC55932he A0C;
    public ViewGroup bottomSheetBottomButtonContainer;
    public IgTextView bottomSheetBottomTitle;
    public IgTextView bottomSheetCancelButton;
    public ViewGroup bottomSheetContentContainer;
    public ViewGroup bottomSheetContentView;
    public IgTextView bottomSheetDoneButton;
    public View bottomSheetHandle;
    public ViewGroup bottomSheetLayout;
    public IgView bottomSheetTopBackButton;
    public ViewGroup bottomSheetTopButtonContainer;
    public IgTextView bottomSheetTopTitle;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController.A02():void");
    }

    public final void A03(boolean z) {
        this.A05 = false;
        ViewGroup viewGroup = this.bottomSheetLayout;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            C55982hj c55982hj = this.A02;
            if (z) {
                c55982hj.A06 = true;
                c55982hj.A06(0.0d);
            } else {
                c55982hj.A08(0.0d, true);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final List A01(BottomSheetViewController bottomSheetViewController) {
        List Ben;
        InterfaceC58282Psa interfaceC58282Psa = bottomSheetViewController.A03;
        if (interfaceC58282Psa == null || (Ben = interfaceC58282Psa.Ben()) == null) {
            return C16930sl.A00;
        }
        return Ben;
    }

    public BottomSheetViewController(Context context, ViewGroup viewGroup, InterfaceC58112Ppb interfaceC58112Ppb, boolean z) {
        this.A06 = context;
        this.A07 = viewGroup;
        this.A08 = interfaceC58112Ppb;
        this.A0A = z;
        this.A0B = viewGroup.getHeight();
        C55733Ooz c55733Ooz = new C55733Ooz(this, 0);
        this.A0C = c55733Ooz;
        this.A09 = new C56277Oym(this);
        C55982hj A0R = AbstractC167007dF.A0R();
        AbstractC50524MSc.A0I(A0R, c55733Ooz);
        this.A02 = A0R;
    }

    public static final EnumC53228NgQ A00(BottomSheetViewController bottomSheetViewController) {
        if (A01(bottomSheetViewController).size() == 1) {
            List A01 = A01(bottomSheetViewController);
            EnumC53228NgQ enumC53228NgQ = EnumC53228NgQ.A07;
            if (A01.contains(enumC53228NgQ)) {
                return enumC53228NgQ;
            }
        }
        if (A01(bottomSheetViewController).size() == 1) {
            return (EnumC53228NgQ) AbstractC001800i.A0I(A01(bottomSheetViewController));
        }
        return EnumC53228NgQ.A03;
    }
}
