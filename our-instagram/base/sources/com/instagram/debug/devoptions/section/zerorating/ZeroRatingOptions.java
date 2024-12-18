package com.instagram.debug.devoptions.section.zerorating;

import X.AbstractC018607g;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC19750y3;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC26671Qw;
import X.AbstractC31176DnK;
import X.AbstractC50523MSb;
import X.AbstractC59962oe;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C23031Ai;
import X.C26661Qv;
import X.C54732fW;
import X.C69797Vvh;
import X.C9GR;
import X.GHY;
import X.InterfaceC19610xo;
import X.InterfaceC26681Qx;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import com.instagram.debug.devoptions.zero.ZeroDevOptionsFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class ZeroRatingOptions implements DeveloperOptionsSection {
    public static final ZeroRatingOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1762638970);
                AbstractC25229BEm.A18(new ZeroDevOptionsFragment(), new C140966Yy(FragmentActivity.this, userSession));
                C0f9.A0C(133582192, A05);
            }
        }, "Zero Rating Options"), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1360978618);
                AbstractC25229BEm.A18(new ZeroE2ETestFragment(), AbstractC25225BEi.A0r(FragmentActivity.this, userSession));
                C0f9.A0C(895621093, A05);
            }
        }, "Zero E2E Test"), new GHY(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-996852037);
                View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(FragmentActivity.this), null, R.layout.dev_text_input_dialog);
                final IgEditText igEditText = (IgEditText) AbstractC166997dE.A0R(A0A, R.id.edit_text);
                String str = "";
                String string = AbstractC19750y3.A01("PrefZeroRatingDogfoodingFilename").getString("Zero-Dogfood-Carrier-Id", "");
                if (string != null) {
                    str = string;
                }
                igEditText.setText(str);
                igEditText.setHint("Type the carrier id you want to dogfood");
                igEditText.requestFocus();
                C69797Vvh c69797Vvh = new C69797Vvh(FragmentActivity.this);
                c69797Vvh.A08("Dogfood Carrier Id");
                c69797Vvh.A07(A0A);
                final UserSession userSession2 = userSession;
                c69797Vvh.A06(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions$getItems$3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C14360o3.A0B(dialogInterface, 0);
                        String A0g = AbstractC167007dF.A0g(IgEditText.this);
                        InterfaceC19610xo ARD = AbstractC19750y3.A01("PrefZeroRatingDogfoodingFilename").ARD();
                        ARD.E7K("Zero-Dogfood-Carrier-Id", A0g);
                        ARD.apply();
                        InterfaceC26681Qx A00 = C26661Qv.A00(userSession2);
                        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.zero.tokenfetch.IgZeroTokenManager");
                        ((AbstractC26671Qw) A00).A06();
                        dialogInterface.dismiss();
                    }
                }, "Confirm");
                c69797Vvh.A05(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions$getItems$3.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C14360o3.A0B(dialogInterface, 0);
                        InterfaceC19610xo ARD = AbstractC19750y3.A01("PrefZeroRatingDogfoodingFilename").ARD();
                        ARD.EEj("Zero-Dogfood-Carrier-Id");
                        ARD.apply();
                        InterfaceC26681Qx A00 = C26661Qv.A00(UserSession.this);
                        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.zero.tokenfetch.IgZeroTokenManager");
                        ((AbstractC26671Qw) A00).A06();
                        dialogInterface.dismiss();
                    }
                }, "Stop Dogfooding");
                AbstractC50523MSb.A0p(c69797Vvh);
                C0f9.A0C(1469310459, A05);
            }
        }, "Zero Dogfood Carrier"), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-227234136);
                C23031Ai A00 = AbstractC23021Ah.A00(UserSession.this);
                AbstractC167007dF.A1L(A00, A00.A3J, C23031Ai.A8c, 242, false);
                C9GR.A07(fragmentActivity, 2131958323);
                C0f9.A0C(-1990559859, A05);
            }
        }, 2131958322), GHY.A00(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.zerorating.ZeroRatingOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1966125799);
                C54732fW.A00(UserSession.this).AWV();
                C9GR.A07(fragmentActivity, 2131958028);
                C0f9.A0C(351849819, A05);
            }
        }, 2131958027));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131958512;
    }
}
