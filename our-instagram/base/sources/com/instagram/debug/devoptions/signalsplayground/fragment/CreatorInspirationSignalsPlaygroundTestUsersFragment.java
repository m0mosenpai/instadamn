package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25235BEs;
import X.AbstractC31364DqT;
import X.AbstractC31402Dr6;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC76433bn;
import X.AnonymousClass189;
import X.C00O;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C31368DqX;
import X.C6XJ;
import X.CLD;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundTestUsersAdapter;
import com.instagram.debug.devoptions.signalsplayground.fragment.plugins.CreatorInspirationSignalsPlaygroundRecommendationsFragmentPluginKt;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserRowViewHolder;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUsersFragment extends AbstractC59962oe implements InterfaceC60122ou, CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.Delegate {
    public static final int $stable = 8;
    public static final String ARGS_SIGNAL_DISPLAY_NAME = "signal_display_name";
    public static final String ARGS_SIGNAL_ENTITY = "signal_entity";
    public static final String ARGS_SIGNAL_IDENTIFIER = "signal_identifier";
    public static final Companion Companion = new Object();
    public static final String INTENT_EXTRA_USER_ID = "user_id";
    public static final int REQUEST_CODE_VIEW_RECOMMENDATIONS = 0;
    public final String moduleName;
    public final InterfaceC09390do session$delegate;
    public final InterfaceC09390do signalEntity$delegate;
    public final InterfaceC09390do signalId$delegate;
    public final InterfaceC09390do signalTitle$delegate;
    public CreatorInspirationSignalsPlaygroundTestUsersAdapter testUsersAdapter;
    public final InterfaceC09390do viewModel$delegate;

    @Override // com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundTestUserRowViewHolder.Delegate
    public void onUserRowClick(User user) {
        C14360o3.A0B(user, 0);
        AnonymousClass189.A00(AbstractC166987dD.A0r(this.session$delegate)).A01(user, true, false);
        if (!C14360o3.A0K(AnonymousClass189.A00(AbstractC166987dD.A0r(this.session$delegate)).A02(AbstractC166987dD.A0r(this.session$delegate).userId), user)) {
            C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(this.session$delegate), AbstractC76433bn.A00(user), AbstractC111324zv.A00(4209), this.moduleName);
            UserSession A0r = AbstractC166987dD.A0r(this.session$delegate);
            new C6XJ(requireActivity(), AbstractC31364DqT.A03().A01.A01(AbstractC166987dD.A0r(this.session$delegate), A01.A03()), A0r, ModalActivity.class, "profile").A0D(this, 0);
            return;
        }
        viewSignalRecommendationsForUser(user.getId());
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgTextView igTextView = (IgTextView) AbstractC166997dE.A0S(view, R.id.error_message);
        View A0S = AbstractC166997dE.A0S(view, R.id.loading_spinner);
        IgTextView igTextView2 = (IgTextView) AbstractC166997dE.A0S(view, R.id.header_text);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(view, R.id.test_users_recycler_view);
        setupRecyclerView(recyclerView);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(viewLifecycleOwner, c07s, null, this, igTextView, igTextView2, recyclerView, A0S), C07Y.A00(viewLifecycleOwner));
    }

    /* loaded from: classes5.dex */
    public final class Companion {
        public final CreatorInspirationSignalsPlaygroundTestUsersFragment newInstance(String str, String str2, String str3) {
            AbstractC167027dH.A12(str, str2, str3);
            CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment = new CreatorInspirationSignalsPlaygroundTestUsersFragment();
            AbstractC25227BEk.A1C(creatorInspirationSignalsPlaygroundTestUsersFragment, AbstractC167007dF.A1b(CreatorInspirationSignalsPlaygroundTestUsersFragment.ARGS_SIGNAL_ENTITY, str3, AbstractC166987dD.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.ARGS_SIGNAL_IDENTIFIER, str), AbstractC166987dD.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.ARGS_SIGNAL_DISPLAY_NAME, str2)));
            return creatorInspirationSignalsPlaygroundTestUsersFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final String getSignalEntity() {
        return AbstractC25225BEi.A15(this.signalEntity$delegate);
    }

    private final String getSignalId() {
        return AbstractC25225BEi.A15(this.signalId$delegate);
    }

    private final String getSignalTitle() {
        return AbstractC25225BEi.A15(this.signalTitle$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreatorInspirationSignalsPlaygroundSignalDetailsViewModel getViewModel() {
        return (CreatorInspirationSignalsPlaygroundSignalDetailsViewModel) this.viewModel$delegate.getValue();
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    public CreatorInspirationSignalsPlaygroundTestUsersFragment() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.signalId$delegate = AbstractC09440dt.A00(enumC09460dv, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$1(this, ARGS_SIGNAL_IDENTIFIER, ARGS_SIGNAL_IDENTIFIER));
        this.signalTitle$delegate = AbstractC09440dt.A00(enumC09460dv, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$2(this, ARGS_SIGNAL_DISPLAY_NAME, ARGS_SIGNAL_DISPLAY_NAME));
        this.signalEntity$delegate = AbstractC09440dt.A00(enumC09460dv, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$requiredArgument$default$3(this, ARGS_SIGNAL_ENTITY, ARGS_SIGNAL_ENTITY));
        CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2 creatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2 = new CreatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2(this);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$2(new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = AbstractC25225BEi.A0a(new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$3(A00), creatorInspirationSignalsPlaygroundTestUsersFragment$viewModel$2, new CreatorInspirationSignalsPlaygroundTestUsersFragment$special$$inlined$viewModels$default$4(null, A00), AbstractC25225BEi.A1D(CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.class));
        this.session$delegate = AbstractC60492pY.A02(this);
        this.moduleName = "creator_inspiration_signals_playground_creators";
    }

    private final void setupRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        CreatorInspirationSignalsPlaygroundTestUsersAdapter creatorInspirationSignalsPlaygroundTestUsersAdapter = this.testUsersAdapter;
        if (creatorInspirationSignalsPlaygroundTestUsersAdapter == null) {
            C14360o3.A0F("testUsersAdapter");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(creatorInspirationSignalsPlaygroundTestUsersAdapter);
    }

    private final void viewSignalRecommendationsForUser(String str) {
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity(), AbstractC166987dD.A0r(this.session$delegate));
        A0r.A0D(CLD.A00(AbstractC25225BEi.A15(this.signalId$delegate), AbstractC25225BEi.A15(this.signalTitle$delegate), AbstractC25225BEi.A15(this.signalEntity$delegate), str));
        A0r.A0A = CreatorInspirationSignalsPlaygroundRecommendationsFragmentPluginKt.RECOMMENDATION_FRAGMENT_TAG;
        A0r.A08();
        A0r.A04();
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(AbstractC25225BEi.A15(this.signalTitle$delegate));
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra(INTENT_EXTRA_USER_ID)) != null) {
            viewSignalRecommendationsForUser(stringExtra);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1132337245);
        super.onCreate(bundle);
        this.testUsersAdapter = new CreatorInspirationSignalsPlaygroundTestUsersAdapter(this, this);
        getViewModel().fetchSignalDetails(AbstractC25225BEi.A15(this.signalId$delegate));
        C0f9.A09(686757988, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2052874350);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_signals_playground_creators_fragment, viewGroup, false);
        C0f9.A09(1274216160, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
