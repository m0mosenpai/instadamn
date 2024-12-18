package X;

import androidx.fragment.app.Fragment;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7cS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166567cS {
    public final C2V6 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C166567cS(UserSession userSession) {
        C2V6 c2v6;
        boolean z;
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = C18U.A06(c06090Tz, userSession, 36318741671385530L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318741671451067L);
        this.A03 = A06;
        if (C18U.A06(c06090Tz, userSession, 36318741672106436L)) {
            c2v6 = C77603dk.A00;
        } else {
            c2v6 = C2V3.defaultInstance.A03;
        }
        this.A00 = c2v6;
        if (!A06 && (C18U.A06(c06090Tz, userSession, 36318741672630731L) || C18U.A06(c06090Tz, userSession, 36323328697248931L))) {
            z = true;
        } else {
            z = false;
        }
        this.A02 = z;
    }

    public final void A00(Fragment fragment, LithoView lithoView) {
        C89273yT c89273yT;
        C14360o3.A0B(lithoView, 0);
        C2XE c2xe = new C2XE(lithoView.getContext());
        C75723ad c75723ad = new C75723ad();
        C2VF c2vf = null;
        if (this.A03) {
            C07X A00 = AbstractC55832hO.A00(lithoView);
            if (A00 != null) {
                c89273yT = new C89273yT(A00);
            } else {
                throw new IllegalStateException("Should have lifecycle owner.");
            }
        } else {
            c89273yT = null;
        }
        C75713ac A02 = ComponentTree.A02(c75723ad, c2xe, c89273yT);
        C2V3 c2v3 = C2V3.defaultInstance;
        if (this.A01) {
            c2vf = C2VF.A00;
        }
        A02.A06 = C2V3.A00(null, c2v3, c2vf, this.A00, null, null, null, null, -289, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        ComponentTree A002 = A02.A00();
        if (this.A02) {
            fragment.mViewLifecycleOwnerLiveData.A06(fragment.getViewLifecycleOwner(), new C166577cT(new C206999Ee(lithoView, 46)));
        }
        lithoView.setComponentTree(A002);
    }
}
