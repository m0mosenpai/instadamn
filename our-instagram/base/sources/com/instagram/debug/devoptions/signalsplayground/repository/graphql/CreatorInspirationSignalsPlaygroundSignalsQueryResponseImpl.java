package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C2JS;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.VFD;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl extends C2JS implements CreatorInspirationSignalsPlaygroundSignalsQueryResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1561692376;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class XdtGetCreatorsSignalPlayground extends C2JS implements CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -2104072711;

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
        public final class Signals extends C2JS implements CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -350141370;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Signals.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals
            public String getDisplayName() {
                return A08("display_name");
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals
            public VFD getEntityTypeV2() {
                return (VFD) getOptionalEnumField(2, "entity_type_v2", VFD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals
            public String getIdentifier() {
                return A07("identifier");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0X(c94754Oe, new C4OW(c94754Oe, "identifier"), new C4OW(c94754Oe, "display_name"), "entity_type_v2");
            }

            public Signals(int i) {
                super(i);
            }

            public Signals() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground
        public ImmutableList getSignals() {
            return getOptionalCompactedTreeListField(0, "signals", Signals.class, Signals.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0W(C4OO.A00(), Signals.class, "signals", Signals.TYPE_TAG);
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

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse
    public CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground() {
        C2JS A05 = A05(XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", XdtGetCreatorsSignalPlayground.TYPE_TAG);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl.XdtGetCreatorsSignalPlayground");
        return (XdtGetCreatorsSignalPlayground) A05;
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", XdtGetCreatorsSignalPlayground.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundSignalsQueryResponseImpl() {
        super(TYPE_TAG);
    }
}
