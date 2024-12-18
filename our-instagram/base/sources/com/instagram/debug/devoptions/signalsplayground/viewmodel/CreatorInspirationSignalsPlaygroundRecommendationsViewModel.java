package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.AbstractC06930Yk;
import X.AbstractC06950Ym;
import X.AbstractC09560e7;
import X.AbstractC12190kN;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC208910l;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC52922bZ;
import X.AbstractC61132qb;
import X.AnonymousClass057;
import X.AnonymousClass191;
import X.B4Z;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06160Ug;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C10M;
import X.C141796aw;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C38321qM;
import X.InterfaceC06180Ui;
import X.InterfaceC11380iw;
import X.InterfaceC15070pN;
import X.InterfaceC16620sF;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import X.InterfaceC57806PkY;
import X.MU9;
import X.MUq;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository;
import com.instagram.debug.devoptions.signalsplayground.util.CreatorInspirationSignalsPlaygroundLoggerUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundRecommendationsViewModel extends AbstractC52922bZ {
    public final C05A _uiState;
    public final InterfaceC06180Ui _viewEffect;
    public String currentRecommendationId;
    public Map recommendationsFeedback;
    public final CreatorInspirationSignalsPlaygroundRepository repository;
    public final C0UO uiState;
    public final InterfaceC15070pN viewEffect;

    @DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$1", f = "CreatorInspirationSignalsPlaygroundRecommendationsViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int label;

        public AnonymousClass1(InterfaceC23621Ds interfaceC23621Ds) {
            super(2, interfaceC23621Ds);
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass1(interfaceC23621Ds);
        }

        @Override // X.InterfaceC16620sF
        public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
            return new AnonymousClass1(interfaceC23621Ds).invokeSuspend(C0eB.A00);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            C1JX c1jx = C1JX.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AbstractC166987dD.A13();
                }
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                final CreatorInspirationSignalsPlaygroundRecommendationsViewModel creatorInspirationSignalsPlaygroundRecommendationsViewModel = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this;
                C0UO c0uo = creatorInspirationSignalsPlaygroundRecommendationsViewModel.repository.signalRecommendationsState;
                InterfaceC19960yQ interfaceC19960yQ = new InterfaceC19960yQ() { // from class: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.1.1
                    @Override // X.InterfaceC19960yQ
                    public final Object emit(InterfaceC57806PkY interfaceC57806PkY, InterfaceC23621Ds interfaceC23621Ds) {
                        C05A c05a;
                        Object obj2;
                        ViewState clipsViewState;
                        String str;
                        if (interfaceC57806PkY instanceof MUq) {
                            c05a = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this._uiState;
                            obj2 = UiState.Loading.INSTANCE;
                        } else {
                            if (MU9.A01(interfaceC57806PkY, 1)) {
                                CreatorInspirationSignalsPlaygroundRecommendationsViewModel creatorInspirationSignalsPlaygroundRecommendationsViewModel2 = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this;
                                Iterable<RecommendationItem> iterable = (Iterable) ((MU9) interfaceC57806PkY).A01;
                                ArrayList A1E = AbstractC166987dD.A1E();
                                for (RecommendationItem recommendationItem : iterable) {
                                    if (recommendationItem instanceof RecommendationItem.ClipsRecommendation) {
                                        C38321qM c38321qM = ((RecommendationItem.ClipsRecommendation) recommendationItem).clipsItem.A02;
                                        if (c38321qM != null) {
                                            str = c38321qM.A2u();
                                        }
                                    } else if (recommendationItem instanceof RecommendationItem.AudioRecommendation) {
                                        str = ((RecommendationItem.AudioRecommendation) recommendationItem).audioItem.A07;
                                    } else {
                                        throw B4Z.A00();
                                    }
                                    if (str != null) {
                                        A1E.add(str);
                                    }
                                }
                                LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A1E, 10)));
                                Iterator it = A1E.iterator();
                                while (it.hasNext()) {
                                    A18.put(it.next(), FeedbackType.UNKNOWN);
                                }
                                creatorInspirationSignalsPlaygroundRecommendationsViewModel2.recommendationsFeedback = AbstractC06930Yk.A03(A18);
                                boolean z = iterable instanceof Collection;
                                if (!z || !((Collection) iterable).isEmpty()) {
                                    Iterator it2 = iterable.iterator();
                                    while (it2.hasNext()) {
                                        if (it2.next() instanceof RecommendationItem.ClipsRecommendation) {
                                            c05a = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this._uiState;
                                            ArrayList A0i = AbstractC167007dF.A0i(iterable);
                                            for (Object obj3 : iterable) {
                                                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.ClipsRecommendation");
                                                A0i.add(obj3);
                                            }
                                            clipsViewState = new ViewState.ClipsViewState(A0i, FeedbackType.UNKNOWN, !CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this.recommendationsFeedback.containsValue(r1));
                                            obj2 = new UiState.Loaded(clipsViewState);
                                        }
                                    }
                                }
                                if (!z || !((Collection) iterable).isEmpty()) {
                                    Iterator it3 = iterable.iterator();
                                    while (it3.hasNext()) {
                                        if (it3.next() instanceof RecommendationItem.AudioRecommendation) {
                                            c05a = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this._uiState;
                                            ArrayList A0i2 = AbstractC167007dF.A0i(iterable);
                                            for (Object obj4 : iterable) {
                                                C14360o3.A0C(obj4, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.model.RecommendationItem.AudioRecommendation");
                                                A0i2.add(obj4);
                                            }
                                            clipsViewState = new ViewState.AudioViewState(A0i2, FeedbackType.UNKNOWN, !CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this.recommendationsFeedback.containsValue(r1));
                                            obj2 = new UiState.Loaded(clipsViewState);
                                        }
                                    }
                                }
                                return C0eB.A00;
                            }
                            if (MU9.A00(interfaceC57806PkY)) {
                                c05a = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.this._uiState;
                                obj2 = UiState.Error.INSTANCE;
                            } else {
                                throw B4Z.A00();
                            }
                        }
                        c05a.Egh(obj2);
                        return C0eB.A00;
                    }
                };
                this.label = 1;
                if (c0uo.collect(interfaceC19960yQ, this) == c1jx) {
                    return c1jx;
                }
            }
            throw new RuntimeException();
        }
    }

    /* loaded from: classes5.dex */
    public final class Factory extends AbstractC61132qb {
        public final UserSession userSession;

        public Factory(UserSession userSession) {
            C14360o3.A0B(userSession, 1);
            this.userSession = userSession;
        }

        @Override // X.AbstractC61132qb
        public CreatorInspirationSignalsPlaygroundRecommendationsViewModel create() {
            return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel(new CreatorInspirationSignalsPlaygroundRepository(this.userSession, null, 2, null));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class FeedbackType {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ FeedbackType[] $VALUES;
        public static final FeedbackType UNKNOWN = new FeedbackType("UNKNOWN", 0);
        public static final FeedbackType RELEVANT = new FeedbackType("RELEVANT", 1);
        public static final FeedbackType PARTIALLY_RELEVANT = new FeedbackType("PARTIALLY_RELEVANT", 2);
        public static final FeedbackType NOT_RELEVANT = new FeedbackType("NOT_RELEVANT", 3);

        public static final /* synthetic */ FeedbackType[] $values() {
            return new FeedbackType[]{UNKNOWN, RELEVANT, PARTIALLY_RELEVANT, NOT_RELEVANT};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            FeedbackType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static FeedbackType valueOf(String str) {
            return (FeedbackType) Enum.valueOf(FeedbackType.class, str);
        }

        public static FeedbackType[] values() {
            return (FeedbackType[]) $VALUES.clone();
        }

        public FeedbackType(String str, int i) {
        }
    }

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedbackType.values().length];
            try {
                iArr[FeedbackType.RELEVANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedbackType.PARTIALLY_RELEVANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedbackType.NOT_RELEVANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeedbackType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CreatorInspirationSignalsPlaygroundRecommendationsViewModel(CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository) {
        C14360o3.A0B(creatorInspirationSignalsPlaygroundRepository, 1);
        this.repository = creatorInspirationSignalsPlaygroundRepository;
        C008002u A00 = C10E.A00(UiState.Loading.INSTANCE);
        this._uiState = A00;
        this.uiState = AbstractC208910l.A02(A00);
        Integer num = C05F.A00;
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this._viewEffect = A002;
        this.viewEffect = new C06160Ug(null, A002);
        this.recommendationsFeedback = AbstractC166987dD.A1I();
        C141796aw A003 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new AnonymousClass1(null), A003);
    }

    public final void performFeedbackButtonAction(UserSession userSession, InterfaceC11380iw interfaceC11380iw, String str, String str2, FeedbackType feedbackType) {
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A0a(1, interfaceC11380iw, str, str2, feedbackType);
        CreatorInspirationSignalsPlaygroundLoggerUtil.INSTANCE.reportFeedbackButtonClick(userSession, interfaceC11380iw, this.currentRecommendationId, str, str2, getScoreForFeedbackType(feedbackType));
        String str3 = this.currentRecommendationId;
        if (str3 != null) {
            this.recommendationsFeedback.put(str3, feedbackType);
            updateCurrentFeedback();
            AbstractC166987dD.A1Z(new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1(this, null), AbstractC141776au.A00(this));
        }
        if (!this.recommendationsFeedback.containsValue(FeedbackType.UNKNOWN)) {
            AbstractC166987dD.A1Z(new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$2(this, null), AbstractC141776au.A00(this));
        }
    }

    public final C0UO getUiState() {
        return this.uiState;
    }

    public final InterfaceC15070pN getViewEffect() {
        return this.viewEffect;
    }

    public final void updateCurrentFeedback() {
        ViewState copy;
        FeedbackType feedbackType = (FeedbackType) this.recommendationsFeedback.get(this.currentRecommendationId);
        if (feedbackType != null) {
            C05A c05a = this._uiState;
            boolean z = c05a.getValue() instanceof UiState.Loaded;
            Object value = this._uiState.getValue();
            if (z) {
                C14360o3.A0C(value, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.UiState.Loaded");
                ViewState viewState = ((UiState.Loaded) value).viewState;
                if (viewState instanceof ViewState.ClipsViewState) {
                    ViewState.ClipsViewState clipsViewState = (ViewState.ClipsViewState) viewState;
                    copy = clipsViewState.copy(clipsViewState.recommendations, feedbackType, clipsViewState.isFeedbackComplete);
                } else if (viewState instanceof ViewState.AudioViewState) {
                    ViewState.AudioViewState audioViewState = (ViewState.AudioViewState) viewState;
                    copy = audioViewState.copy(audioViewState.recommendations, feedbackType, audioViewState.isFeedbackComplete);
                } else {
                    throw B4Z.A00();
                }
                value = new UiState.Loaded(copy);
            }
            c05a.Egh(value);
        }
    }

    private final int getScoreForFeedbackType(FeedbackType feedbackType) {
        int ordinal = feedbackType.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3 && ordinal != 0) {
                    throw B4Z.A00();
                }
                return 0;
            }
            return 50;
        }
        return 100;
    }

    public final void fetchSignalRecommendations(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        AbstractC166987dD.A1Z(new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1(this, str, str2, null), AbstractC141776au.A00(this));
    }

    /* loaded from: classes7.dex */
    public abstract class UiState {

        /* loaded from: classes7.dex */
        public final class Error extends UiState {
            public static final Error INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public int hashCode() {
                return -1505289528;
            }

            public String toString() {
                return "Error";
            }
        }

        /* loaded from: classes7.dex */
        public final class Loaded extends UiState {
            public final ViewState viewState;

            public Loaded(ViewState viewState) {
                C14360o3.A0B(viewState, 1);
                this.viewState = viewState;
            }

            public final ViewState component1() {
                return this.viewState;
            }

            public final Loaded copy(ViewState viewState) {
                C14360o3.A0B(viewState, 0);
                return new Loaded(viewState);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Loaded) && C14360o3.A0K(this.viewState, ((Loaded) obj).viewState));
            }

            public int hashCode() {
                return this.viewState.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ Loaded copy$default(Loaded loaded, ViewState viewState, int i, Object obj) {
                if ((i & 1) != 0) {
                    viewState = loaded.viewState;
                }
                C14360o3.A0B(viewState, 0);
                return new Loaded(viewState);
            }

            public final ViewState getViewState() {
                return this.viewState;
            }
        }

        /* loaded from: classes7.dex */
        public final class Loading extends UiState {
            public static final Loading INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return -1658586628;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public UiState() {
        }
    }

    /* loaded from: classes7.dex */
    public abstract class ViewEffect {

        /* loaded from: classes7.dex */
        public final class FeedbackComplete extends ViewEffect {
            public static final FeedbackComplete INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof FeedbackComplete);
            }

            public int hashCode() {
                return 1703738439;
            }

            public String toString() {
                return "FeedbackComplete";
            }
        }

        /* loaded from: classes7.dex */
        public final class ScrollToNextPosition extends ViewEffect {
            public static final ScrollToNextPosition INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ScrollToNextPosition);
            }

            public int hashCode() {
                return 1851859821;
            }

            public String toString() {
                return "ScrollToNextPosition";
            }
        }

        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public ViewEffect() {
        }
    }

    /* loaded from: classes7.dex */
    public abstract class ViewState {

        /* loaded from: classes7.dex */
        public final class AudioViewState extends ViewState {
            public final FeedbackType currentFeedback;
            public final boolean isFeedbackComplete;
            public final List recommendations;

            public static /* synthetic */ AudioViewState copy$default(AudioViewState audioViewState, List list, FeedbackType feedbackType, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = audioViewState.recommendations;
                }
                if ((i & 2) != 0) {
                    feedbackType = audioViewState.currentFeedback;
                }
                if ((i & 4) != 0) {
                    z = audioViewState.isFeedbackComplete;
                }
                return audioViewState.copy(list, feedbackType, z);
            }

            public final List component1() {
                return this.recommendations;
            }

            public final FeedbackType component2() {
                return this.currentFeedback;
            }

            public final boolean component3() {
                return this.isFeedbackComplete;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof AudioViewState) {
                        AudioViewState audioViewState = (AudioViewState) obj;
                        if (!C14360o3.A0K(this.recommendations, audioViewState.recommendations) || this.currentFeedback != audioViewState.currentFeedback || this.isFeedbackComplete != audioViewState.isFeedbackComplete) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public String toString() {
                return super.toString();
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewState
            public FeedbackType getCurrentFeedback() {
                return this.currentFeedback;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewState
            public List getRecommendations() {
                return this.recommendations;
            }

            public int hashCode() {
                return AbstractC166987dD.A0K(this.isFeedbackComplete, AbstractC166997dE.A0J(this.currentFeedback, AbstractC166987dD.A0G(this.recommendations)));
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewState
            public boolean isFeedbackComplete() {
                return this.isFeedbackComplete;
            }

            public AudioViewState(List list, FeedbackType feedbackType, boolean z) {
                AbstractC167017dG.A1P(list, feedbackType);
                this.recommendations = list;
                this.currentFeedback = feedbackType;
                this.isFeedbackComplete = z;
            }

            public final AudioViewState copy(List list, FeedbackType feedbackType, boolean z) {
                AbstractC167017dG.A1N(list, feedbackType);
                return new AudioViewState(list, feedbackType, z);
            }
        }

        /* loaded from: classes7.dex */
        public final class ClipsViewState extends ViewState {
            public final FeedbackType currentFeedback;
            public final boolean isFeedbackComplete;
            public final List recommendations;

            public static /* synthetic */ ClipsViewState copy$default(ClipsViewState clipsViewState, List list, FeedbackType feedbackType, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = clipsViewState.recommendations;
                }
                if ((i & 2) != 0) {
                    feedbackType = clipsViewState.currentFeedback;
                }
                if ((i & 4) != 0) {
                    z = clipsViewState.isFeedbackComplete;
                }
                return clipsViewState.copy(list, feedbackType, z);
            }

            public final List component1() {
                return this.recommendations;
            }

            public final FeedbackType component2() {
                return this.currentFeedback;
            }

            public final boolean component3() {
                return this.isFeedbackComplete;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof ClipsViewState) {
                        ClipsViewState clipsViewState = (ClipsViewState) obj;
                        if (!C14360o3.A0K(this.recommendations, clipsViewState.recommendations) || this.currentFeedback != clipsViewState.currentFeedback || this.isFeedbackComplete != clipsViewState.isFeedbackComplete) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public String toString() {
                return super.toString();
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewState
            public FeedbackType getCurrentFeedback() {
                return this.currentFeedback;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewState
            public List getRecommendations() {
                return this.recommendations;
            }

            public int hashCode() {
                return AbstractC166987dD.A0K(this.isFeedbackComplete, AbstractC166997dE.A0J(this.currentFeedback, AbstractC166987dD.A0G(this.recommendations)));
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewState
            public boolean isFeedbackComplete() {
                return this.isFeedbackComplete;
            }

            public ClipsViewState(List list, FeedbackType feedbackType, boolean z) {
                AbstractC167017dG.A1P(list, feedbackType);
                this.recommendations = list;
                this.currentFeedback = feedbackType;
                this.isFeedbackComplete = z;
            }

            public final ClipsViewState copy(List list, FeedbackType feedbackType, boolean z) {
                AbstractC167017dG.A1N(list, feedbackType);
                return new ClipsViewState(list, feedbackType, z);
            }
        }

        public abstract FeedbackType getCurrentFeedback();

        public abstract List getRecommendations();

        public abstract boolean isFeedbackComplete();

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public ViewState() {
        }
    }

    public final void setCurrentRecommendationId(String str) {
        this.currentRecommendationId = str;
    }
}
