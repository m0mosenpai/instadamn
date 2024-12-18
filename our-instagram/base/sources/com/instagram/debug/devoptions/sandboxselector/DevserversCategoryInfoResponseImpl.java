package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167017dG;
import X.AbstractC58317Pt9;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.C14360o3;
import X.C2JS;
import X.C4OK;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94774Oi;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DevserversCategoryInfoResponseImpl extends C2JS implements DevserversCategoryInfoResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -916097597;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return DevserversCategoryInfoResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class XdtApiV1DevserversListCategorized extends C2JS implements DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -93079582;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtApiV1DevserversListCategorized.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class DevserverCategories extends C2JS implements DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 814671409;

            /* loaded from: classes11.dex */
            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return DevserverCategories.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            /* loaded from: classes11.dex */
            public final class DevserverInfos extends C2JS implements DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1467968093;

                /* loaded from: classes11.dex */
                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return DevserverInfos.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos
                public String getHostType() {
                    return AbstractC65702TsY.A0a(this, DevServerEntity.COLUMN_HOST_TYPE, 1);
                }

                @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos
                public String getUrl() {
                    return AbstractC65702TsY.A0a(this, "url", 2);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos
                public String getDescription() {
                    return A07(DevServerEntity.COLUMN_DESCRIPTION);
                }

                @Override // X.C2JS
                public C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(new C94774Oi(c94754Oe), AbstractC58322PtE.A0Y(c94754Oe), new C4OW(new C94774Oi(c94754Oe), DevServerEntity.COLUMN_HOST_TYPE), "url");
                }

                public DevserverInfos(int i) {
                    super(i);
                }

                public DevserverInfos() {
                    super(TYPE_TAG);
                }
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories
            public String getName() {
                return AbstractC65702TsY.A0a(this, "strong_id__", 1);
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories
            public boolean getSupportsVpnless() {
                return getRequiredBooleanField(2, AbstractC58317Pt9.A00(136));
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories
            public boolean hasSupportsVpnless() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories
            public ImmutableList getDevserverInfos() {
                return A06(DevserverInfos.class, "devserver_infos", DevserverInfos.TYPE_TAG);
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                return AbstractC167017dG.A0X(AbstractC58319PtB.A0S(), new C4OK(C4OO.A02(), DevserverInfos.class, "devserver_infos", DevserverInfos.TYPE_TAG), AbstractC65703TsZ.A0K(C94754Oe.A00), AbstractC58317Pt9.A00(136));
            }

            public DevserverCategories(int i) {
                super(i);
            }

            public DevserverCategories() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized
        public ImmutableList getErrorMessages() {
            return getRequiredCompactedStringListField(1, "error_messages");
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized
        public boolean hasIsInternal() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized
        public boolean isInternal() {
            return getRequiredBooleanField(2, "is_internal");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized
        public ImmutableList getDevserverCategories() {
            return A06(DevserverCategories.class, "devserver_categories", DevserverCategories.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0X(AbstractC58319PtB.A0S(), new C4OK(C4OO.A02(), DevserverCategories.class, "devserver_categories", DevserverCategories.TYPE_TAG), new C4OW(C94754Oe.A01(), "error_messages"), "is_internal");
        }

        public XdtApiV1DevserversListCategorized(int i) {
            super(i);
        }

        public XdtApiV1DevserversListCategorized() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse
    public DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized getXdtApiV1DevserversListCategorized() {
        C2JS A05 = A05(XdtApiV1DevserversListCategorized.class, "xdt_api__v1__devservers__list_categorized", XdtApiV1DevserversListCategorized.TYPE_TAG);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponseImpl.XdtApiV1DevserversListCategorized");
        return (XdtApiV1DevserversListCategorized) A05;
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtApiV1DevserversListCategorized.class, "xdt_api__v1__devservers__list_categorized", XdtApiV1DevserversListCategorized.TYPE_TAG);
    }

    public DevserversCategoryInfoResponseImpl(int i) {
        super(i);
    }

    public DevserversCategoryInfoResponseImpl() {
        super(TYPE_TAG);
    }
}
