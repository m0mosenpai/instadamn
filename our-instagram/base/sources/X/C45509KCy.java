package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailTabController;
import java.util.List;

/* renamed from: X.KCy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45509KCy extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC152836uD, InterfaceC63982vJ {
    public static final String __redex_internal_original_name = "ProfileEffectsTabFragment";
    public RecyclerView A00;
    public C47510Kyd A01;
    public C47511Kye A02;
    public C44571Jnw A03;
    public UserDetailTabController A04;
    public C64012vM A05;
    public C38E A06;
    public String A07;
    public String A08;
    public List A09;
    public C57112jm A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final ViewGroup A0D;
    public final String A0E;

    @Override // X.InterfaceC152836uD, X.InterfaceC152846uE
    public final String Bi9() {
        return AbstractC111324zv.A00(2915);
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC152836uD
    public final void DcV(UserDetailTabController userDetailTabController) {
        C14360o3.A0B(userDetailTabController, 0);
        if (this.A04 == null) {
            this.A04 = userDetailTabController;
            C44498Jm4 c44498Jm4 = (C44498Jm4) this.A0C.getValue();
            if (!AbstractC31177DnL.A1b(c44498Jm4.A00.A02())) {
                MBq.A01(c44498Jm4, AbstractC141776au.A00(c44498Jm4), 0);
            }
        }
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drq(boolean z) {
    }

    @Override // X.InterfaceC152836uD
    public final void Drw() {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0G(view, R.id.camera_effect_preview_video_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        C44571Jnw c44571Jnw = this.A03;
        String str = "adapter";
        if (c44571Jnw != null) {
            JnN.A00(gridLayoutManager, c44571Jnw, 7);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                C44571Jnw c44571Jnw2 = this.A03;
                if (c44571Jnw2 != null) {
                    recyclerView.A10(c44571Jnw2.A02);
                }
            }
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(gridLayoutManager);
            }
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                C44571Jnw c44571Jnw3 = this.A03;
                if (c44571Jnw3 != null) {
                    recyclerView3.setAdapter(c44571Jnw3);
                }
            }
            C44571Jnw c44571Jnw4 = this.A03;
            if (c44571Jnw4 != null) {
                boolean A1b = AbstractC25226BEj.A1b(c44571Jnw4.A05);
                RecyclerView recyclerView4 = this.A00;
                if (A1b) {
                    if (recyclerView4 != null) {
                        recyclerView4.setVisibility(0);
                    }
                } else {
                    AbstractC167007dF.A0x(recyclerView4);
                }
                C57112jm c57112jm = this.A0A;
                if (c57112jm == null) {
                    str = "gridViewpointManager";
                } else {
                    c57112jm.A08(this.A00, C71163Hc.A00(this), new InterfaceC57142jp[0]);
                    InterfaceC09390do interfaceC09390do = this.A0C;
                    AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C44498Jm4) interfaceC09390do.getValue()).A01, new C50356MLi(this, 41), 10);
                    JQ0.A11(this, new MC5(this, null, 9), ((C44498Jm4) interfaceC09390do.getValue()).A06);
                    AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C44498Jm4) interfaceC09390do.getValue()).A00, new C50356MLi(this, 42), 10);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC152836uD
    public final Fragment ACb() {
        return this;
    }

    @Override // X.InterfaceC152836uD
    public final ViewGroup Br5() {
        return this.A0D;
    }

    @Override // X.InterfaceC152836uD
    public final void Drv(boolean z) {
        AbstractC167007dF.A0w(this.A00);
        C44498Jm4 c44498Jm4 = (C44498Jm4) this.A0C.getValue();
        List list = (List) c44498Jm4.A01.A02();
        if ((list != null && AbstractC166987dD.A1b(list)) || AbstractC31177DnL.A1b(c44498Jm4.A00.A02())) {
            return;
        }
        MBq.A01(c44498Jm4, AbstractC141776au.A00(c44498Jm4), 0);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0E;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0B);
    }

    public C45509KCy() {
        C57508Pfi c57508Pfi = new C57508Pfi(this, 9);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57508Pfi(new C57508Pfi(this, 6), 7));
        this.A0C = AbstractC25225BEi.A0a(new C57508Pfi(A00, 8), c57508Pfi, new C29897DGl(45, null, A00), AbstractC25225BEi.A1D(C44498Jm4.class));
        this.A0B = AbstractC60492pY.A02(this);
        this.A0E = AbstractC111324zv.A00(5184);
        this.A0D = this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1622023857);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A07 = AbstractC166997dE.A0n();
        String string = requireArguments.getString("profile_effect_previews_target_effect_id_count_key");
        if (string != null) {
            this.A08 = string;
            InterfaceC09390do interfaceC09390do = this.A0B;
            this.A06 = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this));
            this.A05 = C1OU.A02(this, AbstractC166987dD.A0r(interfaceC09390do), null);
            String str = ((C22F) AbstractC43593JPy.A0T(interfaceC09390do)).A04.A0L;
            this.A0A = C57112jm.A00();
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C57112jm c57112jm = this.A0A;
            if (c57112jm != null) {
                String str2 = this.A07;
                if (str2 != null) {
                    this.A02 = new C47511Kye(this, A0r, c57112jm, this, str2, str);
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    C57112jm c57112jm2 = this.A0A;
                    if (c57112jm2 != null) {
                        String str3 = this.A07;
                        if (str3 != null) {
                            this.A01 = new C47510Kyd(this, A0r2, c57112jm2, this, str3);
                            FragmentActivity requireActivity = requireActivity();
                            UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                            String str4 = this.A07;
                            if (str4 != null) {
                                this.A03 = new C44571Jnw(requireActivity, this, this, this, A0r3, str4);
                                C0f9.A09(-1368961042, A02);
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F("profileTabSessionId");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("gridViewpointManager");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-1293994846, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-205424851);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.camera_effect_preview_videos_layout, false);
        C0f9.A09(-1211598647, A02);
        return A0R;
    }
}
