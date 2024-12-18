package com.instagram.urlhandlers.collabs;

import X.AbstractC001800i;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC37301Gc2;
import X.AbstractC53939NtC;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C1GJ;
import X.C22P;
import X.C38321qM;
import X.C49377LsB;
import X.C50994Mg1;
import X.C88543xC;
import X.EnumC76383bi;
import X.FVK;
import X.N6M;
import android.os.Bundle;
import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.MediaTrialStatus;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class IgEditCollaboratorsUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final void A00(UserSession userSession, C38321qM c38321qM, IgEditCollaboratorsUrlHandlerActivity igEditCollaboratorsUrlHandlerActivity) {
        List list;
        String str;
        MediaTrialStatus mediaTrialStatus;
        C88543xC A1Q;
        String A2a = c38321qM.A2a();
        List A3M = c38321qM.A3M();
        if (A3M == null) {
            A3M = C16930sl.A00;
        }
        C50994Mg1 c50994Mg1 = new C50994Mg1(userSession);
        c50994Mg1.A05 = A3M;
        c50994Mg1.A0A.A0B(A3M);
        List coauthorProducers = c38321qM.A0C.getCoauthorProducers();
        if (coauthorProducers != null) {
            list = AbstractC167007dF.A0i(coauthorProducers);
            Iterator it = coauthorProducers.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1V(list, it);
            }
        } else {
            list = C16930sl.A00;
        }
        List A3i = c38321qM.A3i();
        ArrayList A0i = AbstractC167007dF.A0i(A3i);
        Iterator it2 = A3i.iterator();
        while (it2.hasNext()) {
            AbstractC167017dG.A1V(A0i, it2);
        }
        ArrayList A0S = AbstractC001800i.A0S(A0i, list);
        C14360o3.A0B(A0S, 0);
        c50994Mg1.A03 = A0S;
        c50994Mg1.A09.A0B(A0S);
        boolean A1W = AbstractC167007dF.A1W(c38321qM.A0C.Ar6());
        String str2 = (String) c50994Mg1.A06.A02();
        List list2 = c50994Mg1.A03;
        EnumC76383bi enumC76383bi = c50994Mg1.A01;
        String id = c38321qM.getId();
        if (id != null) {
            C22P c22p = C22P.A0J;
            if (c38321qM.A4y() && (A1Q = c38321qM.A1Q()) != null) {
                str = A1Q.getAssetId();
            } else {
                str = null;
            }
            ClipsTrialDict Aog = c38321qM.A0C.Aog();
            if (Aog != null) {
                mediaTrialStatus = Aog.C0I();
            } else {
                mediaTrialStatus = null;
            }
            boolean A1X = AbstractC167007dF.A1X(mediaTrialStatus, MediaTrialStatus.A04);
            String id2 = c38321qM.getId();
            List A3H = c38321qM.A3H();
            if (A3H == null) {
                A3H = C16930sl.A00;
            }
            N6M A00 = AbstractC53939NtC.A00(c22p, null, userSession, enumC76383bi, true, str2, id, A2a, null, str, id2, A3M, list2, list, A3H, false, A1W, true, A1X, false, true);
            C140966Yy A0P = AbstractC31173DnH.A0P(igEditCollaboratorsUrlHandlerActivity, userSession);
            A0P.A0B(null, A00);
            A0P.A0D = false;
            A0P.A04();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1779079327);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1690158902;
        } else {
            C09Y c09y = C023409i.A0A;
            AbstractC18680vv A05 = c09y.A05(this);
            AbstractC31171DnF.A1Q(A05);
            if (!C18U.A06(AbstractC166997dE.A0U(A05), A05, 36312999301023330L)) {
                finish();
                i = -245895725;
            } else {
                Bundle A07 = AbstractC31176DnK.A07(this);
                if (A07 == null) {
                    finish();
                    i = -693074787;
                } else {
                    String string = A07.getString("original_url");
                    if (string == null) {
                        finish();
                        i = 64552229;
                    } else {
                        AbstractC18680vv A052 = c09y.A05(this);
                        if (!(A052 instanceof UserSession)) {
                            AbstractC35178FfV.A01(this, A07, A052);
                        } else {
                            UserSession userSession = (UserSession) A052;
                            String queryParameter = AbstractC25227BEk.A0B(string).getQueryParameter("media_id");
                            if (queryParameter == null) {
                                finish();
                            } else {
                                AtomicBoolean atomicBoolean = C38321qM.A0i;
                                String str = userSession.userId;
                                C14360o3.A0B(str, 1);
                                C38321qM A0h = AbstractC25229BEm.A0h(userSession, AbstractC37301Gc2.A0p(queryParameter, str));
                                if (A0h == null) {
                                    FVK.A01(userSession, C1GJ.A01(), new C49377LsB(1, userSession, this), queryParameter);
                                } else {
                                    A00(userSession, A0h, this);
                                }
                            }
                        }
                        i = 701698240;
                    }
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
