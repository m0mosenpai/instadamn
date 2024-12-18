package com.instagram.wellbeing.fundraiser.coverphotopicker;

import X.AbstractC018607g;
import X.AbstractC08820cl;
import X.AbstractC167007dF;
import X.AbstractC25227BEk;
import X.AbstractC31172DnG;
import X.AnonymousClass500;
import X.C0f9;
import X.C153146ui;
import X.C153156uj;
import X.C154786xT;
import X.C38321qM;
import X.C38974HEc;
import X.C38N;
import X.C42508Irn;
import X.C42756Ivu;
import X.C53Z;
import X.C61972ry;
import X.C6BS;
import X.C6BX;
import X.C6FQ;
import X.C6FX;
import X.EnumC125765mR;
import X.EnumC125775mS;
import X.IJU;
import X.InterfaceC103384lE;
import X.InterfaceC38411qV;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

/* loaded from: classes7.dex */
public class FundraiserPhotoPickerPostsTabFragment extends C53Z implements C38N {
    public IJU A00;
    public C154786xT A01;
    public C38974HEc A02;
    public RecyclerView mRecyclerView;

    @Override // X.C38N
    public final boolean DJk(MotionEvent motionEvent, View view, InterfaceC38411qV interfaceC38411qV, int i) {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "fundraiser_photo_picker_posts_tab";
    }

    public static void A00(FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment, boolean z) {
        C154786xT c154786xT = fundraiserPhotoPickerPostsTabFragment.A01;
        if (c154786xT != null && !c154786xT.A02()) {
            if (z || c154786xT.A03.A05()) {
                fundraiserPhotoPickerPostsTabFragment.A01.A00(null, new AnonymousClass500(fundraiserPhotoPickerPostsTabFragment.getSession().userId), z, true, true, false);
            }
        }
    }

    @Override // X.C38N
    public final void DJj(View view, C38321qM c38321qM, int i) {
        IJU iju = this.A00;
        if (iju != null) {
            iju.A02.A0b();
            String A3D = c38321qM.A3D(iju.A01);
            if (A3D != null) {
                C6BS c6bs = C6BS.A02;
                A3D = C6BX.A00(AbstractC08820cl.A03(A3D)).toString();
            }
            C6FQ c6fq = iju.A03;
            InterfaceC103384lE interfaceC103384lE = iju.A04;
            C6FX c6fx = new C6FX();
            c6fx.A01(A3D);
            c6fx.A02(c38321qM.A2u());
            AbstractC25227BEk.A1M(c6fq, c6fx, interfaceC103384lE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1712057436);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        UserSession session = getSession();
        C61972ry c61972ry = new C61972ry(requireContext(), AbstractC018607g.A00(this));
        C42756Ivu c42756Ivu = new C42756Ivu(this);
        EnumC125775mS enumC125775mS = EnumC125765mR.A09.A00;
        AbstractC167007dF.A1G(session, 2, enumC125775mS);
        this.A01 = new C154786xT(requireContext, session, c61972ry, null, c42756Ivu, enumC125775mS, null, null, false);
        C0f9.A09(-1900491831, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1376551888);
        this.A02 = new C38974HEc(requireContext(), this, getSession(), this);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fundraiser_photo_picker_tab);
        C0f9.A09(-975114133, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRecyclerView = AbstractC31172DnG.A0G(view, android.R.id.list);
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A02);
        this.mRecyclerView.A14(new C153156uj(fastScrollingLinearLayoutManager, new C42508Irn(this, 15), C153146ui.A06, false, false));
        A00(this, true);
    }
}
