package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.io.Serializable;
import java.security.InvalidParameterException;

/* loaded from: classes8.dex */
public final class KBM extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectPendingInboxFolderFragment";
    public ViewStub A00;
    public UserSession A01;
    public IgFrameLayout A02;
    public LLk A03;
    public InterfaceC62612t0 A04;
    public C3FR A05;
    public EmptyStateView A06;
    public final C47438KxT A07 = new C47438KxT(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "pending_inbox_folder";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        InterfaceC50485MQn A0Y;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31173DnH.A0G(view, R.id.thread_list_stub);
        this.A06 = (EmptyStateView) view.requireViewById(R.id.direct_folder_empty_view);
        IgFrameLayout igFrameLayout = (IgFrameLayout) view.requireViewById(R.id.direct_folder_container);
        this.A02 = igFrameLayout;
        if (igFrameLayout != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Serializable serializable = requireArguments().getSerializable("thread_folder_name");
                if (serializable == null) {
                    serializable = EnumC31648DvE.A08;
                }
                int i = 2131959912;
                if (serializable == EnumC31648DvE.A0B) {
                    i = 2131960089;
                }
                str = activity.getString(i);
            } else {
                str = null;
            }
            igFrameLayout.setContentDescription(str);
            LLk lLk = this.A03;
            if (lLk != null) {
                lLk.A0d();
                LLk lLk2 = this.A03;
                if (lLk2 != null) {
                    EnumC31648DvE enumC31648DvE = (EnumC31648DvE) requireArguments().getSerializable("thread_folder_name");
                    if (enumC31648DvE == null) {
                        enumC31648DvE = EnumC31648DvE.A08;
                    }
                    int ordinal = enumC31648DvE.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            if (ordinal != 8) {
                                if (ordinal == 9) {
                                    A0Y = lLk2.A0X();
                                } else {
                                    throw new InvalidParameterException();
                                }
                            } else {
                                A0Y = lLk2.A0a();
                                if (A0Y == null) {
                                    throw new InvalidParameterException();
                                }
                            }
                        } else {
                            A0Y = lLk2.A0Z();
                        }
                    } else {
                        A0Y = lLk2.A0Y();
                    }
                    C14360o3.A07(A0Y);
                    C49513LuS c49513LuS = new C49513LuS(requireContext(), A0Y);
                    ViewStub viewStub = this.A00;
                    if (viewStub != null) {
                        viewStub.setLayoutResource(R.layout.inbox_refreshable_thread_list_recyclerview_legacy);
                        ViewStub viewStub2 = this.A00;
                        if (viewStub2 != null) {
                            RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(viewStub2.inflate(), R.id.inbox_refreshable_thread_list_recyclerview);
                            AbstractC31177DnL.A17(this, recyclerView);
                            C3FR c3fr = (C3FR) C3FN.A00(recyclerView);
                            if (c3fr != null) {
                                c3fr.APU();
                                c3fr.EPJ(c49513LuS);
                            }
                            InterfaceC62612t0 interfaceC62612t0 = this.A04;
                            if (interfaceC62612t0 != null) {
                                UserSession userSession = this.A01;
                                if (userSession != null) {
                                    C65784Tu2 A00 = AbstractC65908TwF.A00(userSession, interfaceC62612t0, c49513LuS, AbstractC166997dE.A0b(), C05F.A01, 5, false);
                                    if (c3fr != null) {
                                        c3fr.AAJ(A00);
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            }
                            this.A05 = c3fr;
                            LLk lLk3 = this.A03;
                            if (lLk3 != null) {
                                lLk3.A07 = this.A07;
                                lLk3.A0m(false, false);
                                A0Y.AFG();
                                LLk lLk4 = this.A03;
                                if (lLk4 != null) {
                                    lLk4.A0j();
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC59972of
    public final void beforeOnDestroy() {
        LLk lLk = this.A03;
        if (lLk != null) {
            lLk.A07 = null;
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1878021046);
        super.onCreate(bundle);
        UserSession A06 = C023409i.A0A.A06(requireArguments());
        this.A01 = A06;
        KXD A00 = AbstractC47017Kqa.A00(A06);
        Serializable serializable = requireArguments().getSerializable("thread_folder_name");
        if (serializable == null) {
            serializable = EnumC31648DvE.A08;
        }
        if (EnumC31648DvE.A08 == serializable) {
            str = "open_pending";
        } else {
            str = "open_other";
        }
        A00.A04(str, null);
        C0f9.A09(1766743438, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1498564546);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_permissions_inbox_folder, viewGroup, false);
        C0f9.A09(-222737964, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1817269912);
        super.onDestroyView();
        LLk lLk = this.A03;
        if (lLk != null) {
            lLk.A0e();
        }
        LLk lLk2 = this.A03;
        if (lLk2 != null) {
            lLk2.A0i();
        }
        this.A06 = null;
        this.A00 = null;
        this.A02 = null;
        C0f9.A09(1702117029, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(166864962);
        super.onPause();
        LLk lLk = this.A03;
        if (lLk != null) {
            lLk.A0f();
        }
        C0f9.A09(-433809959, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(312134330);
        super.onResume();
        LLk lLk = this.A03;
        if (lLk != null) {
            lLk.A0g();
        }
        IgFrameLayout igFrameLayout = this.A02;
        if (igFrameLayout != null) {
            igFrameLayout.sendAccessibilityEvent(8);
            C0f9.A09(1857415295, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(712415746, A02);
            throw A0g;
        }
    }
}
