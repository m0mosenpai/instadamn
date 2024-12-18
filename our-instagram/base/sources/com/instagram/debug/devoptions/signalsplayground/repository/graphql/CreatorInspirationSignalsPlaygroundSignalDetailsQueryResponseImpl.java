package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C2JS;
import X.C4OO;
import X.C4OU;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl extends C2JS implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1937064199;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class XdtGetCreatorsSignalPlayground extends C2JS implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1710470887;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtGetCreatorsSignalPlayground.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class Signal extends C2JS implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 2003872400;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Signal.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class TestCases extends C2JS implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -203418252;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TestCases.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                /* loaded from: classes11.dex */
                public final class User extends C2JS implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases.User {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 999722248;

                    /* loaded from: classes11.dex */
                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return User.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases.User
                    public CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser() {
                        return (CreatorInspirationSignalsPlaygroundTestUser) A01(CreatorInspirationSignalsPlaygroundTestUserImpl.class, CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
                    }

                    @Override // X.C2JS
                    public C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundTestUserImpl.class, "CreatorInspirationSignalsPlaygroundTestUser", CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
                    }

                    public User(int i) {
                        super(i);
                    }

                    public User() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases
                public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases.User getUser() {
                    return (CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases.User) A03(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0b(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG);
                }

                public TestCases(int i) {
                    super(i);
                }

                public TestCases() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal
            public ImmutableList getTestCases() {
                return getOptionalCompactedTreeListField(0, "test_cases", TestCases.class, TestCases.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0W(C4OO.A00(), TestCases.class, "test_cases", TestCases.TYPE_TAG);
            }

            public Signal(int i) {
                super(i);
            }

            public Signal() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground
        public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal getSignal() {
            return (CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal) A03(Signal.class, "signal(identifier:$identifier)", Signal.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0b(Signal.class, "signal(identifier:$identifier)", Signal.TYPE_TAG);
        }

        public XdtGetCreatorsSignalPlayground(int i) {
            super(i);
        }

        public XdtGetCreatorsSignalPlayground() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse
    public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground() {
        C2JS A05 = A05(XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", XdtGetCreatorsSignalPlayground.TYPE_TAG);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl.XdtGetCreatorsSignalPlayground");
        return (XdtGetCreatorsSignalPlayground) A05;
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", XdtGetCreatorsSignalPlayground.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl() {
        super(TYPE_TAG);
    }
}
