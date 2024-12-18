package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ELe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32315ELe extends AbstractC59962oe implements InterfaceC60072op, InterfaceC1569372x, InterfaceC60122ou, InterfaceC1569472y {
    public static final String __redex_internal_original_name = "ProfileInterestPickerFragment";
    public TextView A00;
    public C66362zD A01;
    public C66362zD A02;
    public InterfaceC56392iX A03;
    public C57112jm A04;
    public C57112jm A05;
    public C3YB A06;
    public String A07;
    public View A08;
    public final C8SB A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    @Override // X.InterfaceC1569372x
    public final void DMe(View view, C51758Mth c51758Mth, boolean z) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970181);
        interfaceC56362iU.EkS(true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_check_pano_outline_24;
        A0B.A0P = true;
        A0B.A02 = AbstractC31181DnP.A02(this);
        A0B.A05 = 2131961124;
        AbstractC31176DnK.A1B(ViewOnClickListenerC31723DwS.A00(this, 36), A0B, interfaceC56362iU);
        AbstractC31177DnL.A0L(this).A0W(AbstractC53242c7.A0C(getContext()), AbstractC53242c7.A0B(getContext()), false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_interest_picker";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC53712dA interfaceC53712dA;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            interfaceC53712dA = (InterfaceC53712dA) rootActivity;
        } else {
            interfaceC53712dA = null;
        }
        if (interfaceC53712dA != null) {
            interfaceC53712dA.EfL(8);
        }
        this.A00 = AbstractC166997dE.A0T(view, R.id.drag_drop_text);
        this.A08 = view.requireViewById(R.id.divider);
        this.A06 = new C3YB(0, AbstractC166987dD.A0C(requireContext(), 8));
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.interest_picker_recycler_view);
        ViewOnLayoutChangeListenerC35699FpZ.A00(recyclerView, 4, this);
        C57112jm c57112jm = this.A04;
        String str = "interestListViewpointManager";
        if (c57112jm != null) {
            c57112jm.A08(view, C71163Hc.A00(this), new InterfaceC57142jp[0]);
            C66392zG A0R = AbstractC31174DnI.A0R(this);
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do = this.A0A;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Integer num = C05F.A0C;
            C57112jm c57112jm2 = this.A04;
            if (c57112jm2 != null) {
                A0R.A01(new C32603EXd(requireContext, A0r, c57112jm2, this, num));
                this.A01 = AbstractC31173DnH.A0R(A0R, new EX9(requireContext()));
                C70623Ez c70623Ez = new C70623Ez();
                ((C3F0) c70623Ez).A00 = false;
                recyclerView.setItemAnimator(c70623Ez);
                AbstractC31178DnM.A0z(this, recyclerView);
                C66362zD c66362zD = this.A01;
                if (c66362zD == null) {
                    str = "interestListAdapter";
                } else {
                    recyclerView.setAdapter(c66362zD);
                    this.A03 = AbstractC56372iV.A01(view.requireViewById(R.id.selected_interest_row_stub), false, false);
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    FragmentActivity requireActivity = requireActivity();
                    Integer num2 = C05F.A0N;
                    C8SB c8sb = this.A09;
                    C57112jm c57112jm3 = this.A05;
                    String str2 = "selectedListViewpointManager";
                    if (c57112jm3 != null) {
                        C14360o3.A0B(A0r2, 0);
                        C66392zG A00 = C66362zD.A00(requireActivity);
                        A00.A01(new C32604EXe(requireActivity, c8sb, A0r2, c57112jm3, this, num2));
                        this.A02 = AbstractC31173DnH.A0R(A00, new EXU(requireActivity, A0r2, this));
                        C57112jm c57112jm4 = this.A05;
                        if (c57112jm4 != null) {
                            c57112jm4.A08(view, C71163Hc.A00(this), new InterfaceC57142jp[0]);
                            InterfaceC56392iX interfaceC56392iX = this.A03;
                            str2 = "selectedInterestViewStub";
                            if (interfaceC56392iX != null) {
                                View view2 = interfaceC56392iX.getView();
                                C14360o3.A0C(view2, AbstractC111324zv.A00(9));
                                RecyclerView recyclerView2 = (RecyclerView) view2;
                                AbstractC13880nE.A0d(recyclerView2, 0);
                                InterfaceC56392iX interfaceC56392iX2 = this.A03;
                                if (interfaceC56392iX2 != null) {
                                    AbstractC13880nE.A0Y(interfaceC56392iX2.getView(), AbstractC166987dD.A0C(requireContext(), 16));
                                    C70623Ez c70623Ez2 = new C70623Ez();
                                    ((C3F0) c70623Ez2).A00 = false;
                                    recyclerView2.setItemAnimator(c70623Ez2);
                                    AbstractC31174DnI.A17(recyclerView2.getContext(), recyclerView2, false);
                                    C66362zD c66362zD2 = this.A02;
                                    if (c66362zD2 == null) {
                                        str2 = "selectedInterestListAdapter";
                                    } else {
                                        recyclerView2.setAdapter(c66362zD2);
                                        C3YB c3yb = this.A06;
                                        if (c3yb == null) {
                                            str2 = "horizontalDividerItemDecoration";
                                        } else {
                                            recyclerView2.A10(c3yb);
                                            c8sb.A0A(recyclerView2);
                                            C07S c07s = C07S.STARTED;
                                            C07X viewLifecycleOwner = getViewLifecycleOwner();
                                            AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 21), C07Y.A00(viewLifecycleOwner));
                                            AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new PZI(this, null, 1), AbstractC33634Etk.A00(c07s, getViewLifecycleOwner().getLifecycle(), ((Dz6) this.A0B.getValue()).A07)));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1569372x
    public final void DMf(C51758Mth c51758Mth) {
        Object value;
        ArrayList A0U;
        if (c51758Mth != null) {
            Dz6 dz6 = (Dz6) this.A0B.getValue();
            C05A c05a = dz6.A0A;
            do {
                value = c05a.getValue();
                List list = (List) value;
                A0U = AbstractC001800i.A0U(list);
                InterfaceC37273GbQ interfaceC37273GbQ = (InterfaceC37273GbQ) c51758Mth.A00;
                int A00 = Dz6.A00(interfaceC37273GbQ.B6s(), list);
                if (A00 != -1) {
                    A0U.remove(A00);
                } else if (list.size() >= 10) {
                    dz6.A02(null, "max_interests_selected_alert", null);
                    AbstractC31176DnK.A1Z(dz6, AbstractC141776au.A00(dz6), 23);
                } else {
                    A0U.add(new C51758Mth(interfaceC37273GbQ, true));
                    C32315ELe c32315ELe = dz6.A04;
                    int size = A0U.size() - 1;
                    InterfaceC56392iX interfaceC56392iX = c32315ELe.A03;
                    if (interfaceC56392iX == null) {
                        C14360o3.A0F("selectedInterestViewStub");
                        throw C00O.createAndThrow();
                    }
                    AbstractC70663Fe abstractC70663Fe = ((RecyclerView) interfaceC56392iX.getView()).A0D;
                    if (abstractC70663Fe != null) {
                        abstractC70663Fe.A1O(size);
                    }
                }
            } while (!c05a.AIi(value, A0U));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A0B;
        boolean z = ((Dz6) interfaceC09390do.getValue()).A00;
        Dz6 dz6 = (Dz6) interfaceC09390do.getValue();
        Boolean valueOf = Boolean.valueOf(((Dz6) interfaceC09390do.getValue()).A00);
        if (z) {
            dz6.A02(valueOf, "back_unsaved_changes_alert", null);
            C193328hC A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131976209);
            A0O.A09(2131976208);
            A0O.A0I(null, 2131968555);
            AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC35454FkB.A00(this, 54), A0O, 2131977166);
            return true;
        }
        dz6.A02(valueOf, "surface_exit", null);
        return false;
    }

    public C32315ELe() {
        C57244PbS c57244PbS = new C57244PbS(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57244PbS(new C57244PbS(this, 11), 12));
        this.A0B = AbstractC25225BEi.A0a(new C57244PbS(A00, 13), c57244PbS, new C57257Pbf(12, null, A00), AbstractC25225BEi.A1D(Dz6.class));
        this.A09 = new C8SB(new C31856DzO(this));
        this.A0A = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC1569472y
    public final void CkI(InterfaceC37273GbQ interfaceC37273GbQ) {
        String A14 = AbstractC25225BEi.A14();
        if (A14 != null) {
            InterfaceC09390do interfaceC09390do = this.A0A;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0M(this, interfaceC09390do), "ig_bio_interests_picker");
            A0f.A9K("viewer_id", Long.valueOf(AbstractC31178DnM.A04(interfaceC09390do)));
            AbstractC31171DnF.A1D(A0f, "bio_interests_picker");
            A0f.AAP("action_type", "pill_impression");
            A0f.AAP("nav_chain", A14);
            A0f.AAP("topic_name", interfaceC37273GbQ.getName());
            A0f.AAP("entrypoint", this.A07);
            A0f.Cht();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1773498093);
        super.onCreate(bundle);
        this.A07 = requireArguments().getString("entrypoint");
        this.A04 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        this.A05 = AbstractC57052jg.A01(null, AbstractC57052jg.A00());
        C0f9.A09(1295336832, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1564540300);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.profile_interest_picker_layout, false);
        C0f9.A09(-1365362193, A02);
        return A0R;
    }
}
