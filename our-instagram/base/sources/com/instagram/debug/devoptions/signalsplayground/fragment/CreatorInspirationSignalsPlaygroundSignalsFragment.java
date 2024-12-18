package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0f9;
import X.C14360o3;
import X.CLD;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.VFD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundSignalsAdapter;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.L;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundSignalRowViewHolder;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundSignalsFragment extends AbstractC59962oe implements InterfaceC60122ou {
    public static final int $stable = 8;
    public final String moduleName;
    public final InterfaceC09390do session$delegate;
    public final CreatorInspirationSignalsPlaygroundSignalsFragment$signalDelegate$1 signalDelegate;
    public CreatorInspirationSignalsPlaygroundSignalsAdapter signalsAdapter;
    public final InterfaceC09390do viewModel$delegate;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgTextView igTextView = (IgTextView) AbstractC166997dE.A0S(view, R.id.error_message);
        View A0S = AbstractC166997dE.A0S(view, R.id.loading_spinner);
        IgTextView igTextView2 = (IgTextView) AbstractC166997dE.A0S(view, R.id.header_text);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(view, R.id.signals_recycler_view);
        setupRecyclerView(recyclerView);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new CreatorInspirationSignalsPlaygroundSignalsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(viewLifecycleOwner, c07s, null, this, igTextView, igTextView2, recyclerView, A0S), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatorInspirationSignalsPlaygroundSignalsViewModel getViewModel() {
        return (CreatorInspirationSignalsPlaygroundSignalsViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundSignalsFragment$signalDelegate$1] */
    public CreatorInspirationSignalsPlaygroundSignalsFragment() {
        CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2 creatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2 = new CreatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2(this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$2(new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = AbstractC25225BEi.A0a(new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$3(A00), creatorInspirationSignalsPlaygroundSignalsFragment$viewModel$2, new CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$4(null, A00), AbstractC25225BEi.A1D(CreatorInspirationSignalsPlaygroundSignalsViewModel.class));
        this.signalDelegate = new CreatorInspirationSignalsPlaygroundSignalRowViewHolder.Delegate() { // from class: com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundSignalsFragment$signalDelegate$1
            @Override // com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundSignalRowViewHolder.Delegate
            public void onSignalRowClick(CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals signals) {
                String name;
                Fragment newInstance;
                String name2;
                C14360o3.A0B(signals, 0);
                if (signals.getIdentifier() != null && signals.getDisplayName() != null && signals.getEntityTypeV2() != null) {
                    if (L.ig_android_lumen_signals_dogfooding.skip_select_user.getAndExpose(AbstractC166987dD.A0r(CreatorInspirationSignalsPlaygroundSignalsFragment.this.session$delegate)).booleanValue()) {
                        String identifier = signals.getIdentifier();
                        if (identifier != null) {
                            String displayName = signals.getDisplayName();
                            if (displayName != null) {
                                VFD entityTypeV2 = signals.getEntityTypeV2();
                                if (entityTypeV2 != null && (name2 = entityTypeV2.name()) != null) {
                                    newInstance = CLD.A00(identifier, displayName, name2, AbstractC166987dD.A0r(CreatorInspirationSignalsPlaygroundSignalsFragment.this.session$delegate).userId);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        CreatorInspirationSignalsPlaygroundTestUsersFragment.Companion companion = CreatorInspirationSignalsPlaygroundTestUsersFragment.Companion;
                        String identifier2 = signals.getIdentifier();
                        if (identifier2 != null) {
                            String displayName2 = signals.getDisplayName();
                            if (displayName2 != null) {
                                VFD entityTypeV22 = signals.getEntityTypeV2();
                                if (entityTypeV22 != null && (name = entityTypeV22.name()) != null) {
                                    newInstance = companion.newInstance(identifier2, displayName2, name);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    C14360o3.A0A(newInstance);
                    AbstractC25229BEm.A18(newInstance, AbstractC25225BEi.A0r(CreatorInspirationSignalsPlaygroundSignalsFragment.this.requireActivity(), AbstractC166987dD.A0r(CreatorInspirationSignalsPlaygroundSignalsFragment.this.session$delegate)));
                }
            }
        };
        this.session$delegate = AbstractC60492pY.A02(this);
        this.moduleName = "creator_inspiration_signals_playground_list";
    }

    private final void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        CreatorInspirationSignalsPlaygroundSignalsAdapter creatorInspirationSignalsPlaygroundSignalsAdapter = this.signalsAdapter;
        if (creatorInspirationSignalsPlaygroundSignalsAdapter == null) {
            C14360o3.A0F("signalsAdapter");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(creatorInspirationSignalsPlaygroundSignalsAdapter);
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131957937);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2123746323);
        super.onCreate(bundle);
        this.signalsAdapter = new CreatorInspirationSignalsPlaygroundSignalsAdapter(this.signalDelegate);
        getViewModel().fetchSignalsList();
        C0f9.A09(10381852, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1029671205);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_signals_playground_signals_fragment, viewGroup, false);
        C0f9.A09(1529511287, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
