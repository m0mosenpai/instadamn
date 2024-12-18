package com.instagram.debug.devoptions.sandboxselector;

import X.C2JT;
import X.XFF;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public interface DevserversListResponse extends C2JT {

    /* loaded from: classes11.dex */
    public interface XdtApiV1DevserversList extends C2JT {

        /* loaded from: classes11.dex */
        public interface DevserverInfos extends C2JT {
            DevServerInfoDescription asDevServerInfoDescription();

            boolean getFragmentDevServerInfoDescriptionIsFulfilled();

            String getHostType();

            String getUrl();

            boolean hasFragmentDevServerInfoDescriptionIsFulfilled();
        }

        ImmutableList getDevserverInfos();

        ImmutableList getErrorMessages();

        boolean hasIsInternal();

        boolean isInternal();
    }

    XdtApiV1DevserversList getXdtApiV1DevserversList();

    XFF getXdtApiV1DevserversListAsApiTypeModel();
}
