package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC65702TsY;
import X.C126315nS;
import X.C14360o3;
import X.C2JS;
import X.C4OK;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C65928TwZ;
import X.C94754Oe;
import X.C94774Oi;
import X.C95124Py;
import X.V8V;
import X.XFF;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevserversListResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DevserversListResponseImpl extends C2JS implements DevserversListResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1578175719;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return DevserversListResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class XdtApiV1DevserversList extends C2JS implements DevserversListResponse.XdtApiV1DevserversList {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -563281936;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtApiV1DevserversList.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        /* loaded from: classes11.dex */
        public final class DevserverInfos extends C2JS implements DevserversListResponse.XdtApiV1DevserversList.DevserverInfos {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1422414991;

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

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList.DevserverInfos
            public boolean getFragmentDevServerInfoDescriptionIsFulfilled() {
                return getCoercedBooleanField(3, "is_defer_fulfilled(fragment_name:\"DevServerInfoDescription\")");
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList.DevserverInfos
            public String getHostType() {
                return AbstractC65702TsY.A0a(this, DevServerEntity.COLUMN_HOST_TYPE, 1);
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList.DevserverInfos
            public String getUrl() {
                return AbstractC65702TsY.A0a(this, "url", 2);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList.DevserverInfos
            public DevServerInfoDescription asDevServerInfoDescription() {
                return (DevServerInfoDescription) reinterpretIfFulfills(0, DevServerInfoDescriptionImpl.class, DevServerInfoDescriptionImpl.TYPE_TAG, null, null, null, "DevServerInfoDescription", null);
            }

            @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList.DevserverInfos
            public boolean hasFragmentDevServerInfoDescriptionIsFulfilled() {
                return hasFieldValue("is_defer_fulfilled(fragment_name:\"DevServerInfoDescription\")");
            }

            @Override // X.C2JS
            public C4OU modelSelectionSet() {
                C65928TwZ c65928TwZ = new C65928TwZ(new C126315nS(DevServerInfoDescriptionImpl.class, "DevServerInfoDescription", DevServerInfoDescriptionImpl.TYPE_TAG), "DevServerInfoDescription", null);
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58320PtC.A0U(C95124Py.A00, c65928TwZ, new C4OW(new C94774Oi(c94754Oe), DevServerEntity.COLUMN_HOST_TYPE), new C4OW(new C94774Oi(c94754Oe), "url"), "is_defer_fulfilled(fragment_name:\"DevServerInfoDescription\")");
            }

            public DevserverInfos(int i) {
                super(i);
            }

            public DevserverInfos() {
                super(TYPE_TAG);
            }
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList
        public ImmutableList getErrorMessages() {
            return getRequiredCompactedStringListField(1, "error_messages");
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList
        public boolean hasIsInternal() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList
        public boolean isInternal() {
            return getRequiredBooleanField(2, "is_internal");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse.XdtApiV1DevserversList
        public ImmutableList getDevserverInfos() {
            return A06(DevserverInfos.class, "devserver_infos", DevserverInfos.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0X(AbstractC58319PtB.A0S(), new C4OK(C4OO.A02(), DevserverInfos.class, "devserver_infos", DevserverInfos.TYPE_TAG), new C4OW(C94754Oe.A01(), "error_messages"), "is_internal");
        }

        public XdtApiV1DevserversList(int i) {
            super(i);
        }

        public XdtApiV1DevserversList() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse
    public DevserversListResponse.XdtApiV1DevserversList getXdtApiV1DevserversList() {
        C2JS A05 = A05(XdtApiV1DevserversList.class, "xdt_api__v1__devservers__list", XdtApiV1DevserversList.TYPE_TAG);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.sandboxselector.DevserversListResponseImpl.XdtApiV1DevserversList");
        return (XdtApiV1DevserversList) A05;
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevserversListResponse
    public XFF getXdtApiV1DevserversListAsApiTypeModel() {
        Object treeValue = getTreeValue("xdt_api__v1__devservers__list", V8V.class);
        C14360o3.A0C(treeValue, "null cannot be cast to non-null type com.instagram.api.schemas.DevserverListResponseIntf");
        return (XFF) treeValue;
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtApiV1DevserversList.class, "xdt_api__v1__devservers__list", XdtApiV1DevserversList.TYPE_TAG);
    }

    public DevserversListResponseImpl(int i) {
        super(i);
    }

    public DevserversListResponseImpl() {
        super(TYPE_TAG);
    }
}
