package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.B4Z;
import X.C00O;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C0UO;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C3HN;
import X.InterfaceC16620sF;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundTestUsersAdapter;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "CreatorInspirationSignalsPlaygroundTestUsersFragment.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ IgTextView $errorText$inlined;
    public final /* synthetic */ IgTextView $headerText$inlined;
    public final /* synthetic */ View $loadingSpinner$inlined;
    public final /* synthetic */ C07S $minActiveState;
    public final /* synthetic */ RecyclerView $testUsersRecyclerView$inlined;
    public final /* synthetic */ C07X $this_launchAndRepeatWithLifecycle;
    public int label;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundTestUsersFragment this$0;

    @DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "CreatorInspirationSignalsPlaygroundTestUsersFragment.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public final /* synthetic */ IgTextView $errorText$inlined;
        public final /* synthetic */ IgTextView $headerText$inlined;
        public final /* synthetic */ View $loadingSpinner$inlined;
        public final /* synthetic */ RecyclerView $testUsersRecyclerView$inlined;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ CreatorInspirationSignalsPlaygroundTestUsersFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC23621Ds interfaceC23621Ds, CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment, IgTextView igTextView, IgTextView igTextView2, RecyclerView recyclerView, View view) {
            super(2, interfaceC23621Ds);
            this.this$0 = creatorInspirationSignalsPlaygroundTestUsersFragment;
            this.$errorText$inlined = igTextView;
            this.$headerText$inlined = igTextView2;
            this.$testUsersRecyclerView$inlined = recyclerView;
            this.$loadingSpinner$inlined = view;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC23621Ds, this.this$0, this.$errorText$inlined, this.$headerText$inlined, this.$testUsersRecyclerView$inlined, this.$loadingSpinner$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.InterfaceC16620sF
        public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
            return ((AnonymousClass1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            CreatorInspirationSignalsPlaygroundSignalDetailsViewModel viewModel;
            C1JX c1jx = C1JX.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AbstractC166987dD.A13();
                }
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                viewModel = this.this$0.getViewModel();
                C0UO c0uo = viewModel.uiState;
                final IgTextView igTextView = this.$errorText$inlined;
                final IgTextView igTextView2 = this.$headerText$inlined;
                final RecyclerView recyclerView = this.$testUsersRecyclerView$inlined;
                final View view = this.$loadingSpinner$inlined;
                final CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment = this.this$0;
                InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$1$1
                    @Override // X.InterfaceC19960yQ
                    public final Object emit(CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState uiState, InterfaceC23621Ds interfaceC23621Ds) {
                        View view2;
                        if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Loading) {
                            IgTextView.this.setVisibility(8);
                            igTextView2.setVisibility(8);
                            recyclerView.setVisibility(8);
                            view2 = view;
                        } else if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Loaded) {
                            CreatorInspirationSignalsPlaygroundTestUsersAdapter creatorInspirationSignalsPlaygroundTestUsersAdapter = creatorInspirationSignalsPlaygroundTestUsersFragment.testUsersAdapter;
                            if (creatorInspirationSignalsPlaygroundTestUsersAdapter == null) {
                                C14360o3.A0F("testUsersAdapter");
                                throw C00O.createAndThrow();
                            }
                            creatorInspirationSignalsPlaygroundTestUsersAdapter.setTestUserListItems(((CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Loaded) uiState).testUserListItems);
                            IgTextView.this.setVisibility(8);
                            view.setVisibility(8);
                            igTextView2.setVisibility(0);
                            view2 = recyclerView;
                        } else if (uiState instanceof CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.UiState.Error) {
                            view.setVisibility(8);
                            igTextView2.setVisibility(8);
                            recyclerView.setVisibility(8);
                            view2 = IgTextView.this;
                        } else {
                            throw B4Z.A00();
                        }
                        view2.setVisibility(0);
                        return C0eB.A00;
                    }
                };
                this.label = 1;
                if (c0uo.collect(interfaceC19960yQ, this) == c1jx) {
                    return c1jx;
                }
            }
            throw AbstractC25225BEi.A19();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(C07X c07x, C07S c07s, InterfaceC23621Ds interfaceC23621Ds, CreatorInspirationSignalsPlaygroundTestUsersFragment creatorInspirationSignalsPlaygroundTestUsersFragment, IgTextView igTextView, IgTextView igTextView2, RecyclerView recyclerView, View view) {
        super(2, interfaceC23621Ds);
        this.$this_launchAndRepeatWithLifecycle = c07x;
        this.$minActiveState = c07s;
        this.this$0 = creatorInspirationSignalsPlaygroundTestUsersFragment;
        this.$errorText$inlined = igTextView;
        this.$headerText$inlined = igTextView2;
        this.$testUsersRecyclerView$inlined = recyclerView;
        this.$loadingSpinner$inlined = view;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1(this.$this_launchAndRepeatWithLifecycle, this.$minActiveState, interfaceC23621Ds, this.this$0, this.$errorText$inlined, this.$headerText$inlined, this.$testUsersRecyclerView$inlined, this.$loadingSpinner$inlined);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return ((CreatorInspirationSignalsPlaygroundTestUsersFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            C07T lifecycle = this.$this_launchAndRepeatWithLifecycle.getLifecycle();
            C07S c07s = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0, this.$errorText$inlined, this.$headerText$inlined, this.$testUsersRecyclerView$inlined, this.$loadingSpinner$inlined);
            this.label = 1;
            if (C3HN.A00(c07s, lifecycle, this, anonymousClass1) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
