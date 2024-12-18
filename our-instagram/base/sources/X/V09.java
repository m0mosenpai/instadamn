package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V09 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteSaveDraftBottomSheetFragment";
    public C70399WUb A00;
    public W6E A01;
    public PromoteData A02;
    public UserSession A03;
    public View A04;
    public View A05;
    public View A06;
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new X32(this, 20));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_save_draft_bottom_sheet";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r1.A0D() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V09.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A00(V09 v09) {
        VG4 vg4;
        PromoteData promoteData = v09.A02;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        if (promoteData.A2S) {
            vg4 = VG4.A1Q;
        } else if (promoteData.A2R) {
            vg4 = VG4.A0T;
        } else if (promoteData.A2Q) {
            vg4 = VG4.A0B;
        } else {
            vg4 = VG4.A17;
        }
        return vg4.toString();
    }

    public static final void A01(V09 v09, boolean z) {
        String str;
        View view = v09.A06;
        if (view == null) {
            str = "saveButtonRow";
        } else {
            view.setClickable(z);
            View view2 = v09.A05;
            if (view2 == null) {
                str = "discardButtonRow";
            } else {
                view2.setClickable(z);
                View view3 = v09.A04;
                if (view3 == null) {
                    str = "cancelButtonRow";
                } else {
                    view3.setClickable(z);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1513602894);
        super.onCreate(bundle);
        PromoteData A00 = InterfaceC72021XFj.A00(this);
        this.A02 = A00;
        UserSession userSession = A00.A0y;
        this.A03 = userSession;
        this.A01 = new W6E(requireActivity(), this, userSession);
        UserSession userSession2 = this.A03;
        if (userSession2 != null) {
            this.A00 = C70399WUb.A00(userSession2);
            C0f9.A09(647245184, A02);
        } else {
            C14360o3.A0F("session");
            throw C00O.createAndThrow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1605742993);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_save_draft_bottom_sheet_view, false);
        C0f9.A09(-468981724, A02);
        return A0R;
    }
}
