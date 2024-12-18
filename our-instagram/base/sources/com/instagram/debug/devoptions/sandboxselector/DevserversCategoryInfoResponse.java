package com.instagram.debug.devoptions.sandboxselector;

import X.C2JT;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public interface DevserversCategoryInfoResponse extends C2JT {

    /* loaded from: classes11.dex */
    public interface XdtApiV1DevserversListCategorized extends C2JT {

        /* loaded from: classes11.dex */
        public interface DevserverCategories extends C2JT {

            /* loaded from: classes11.dex */
            public interface DevserverInfos extends C2JT {
                String getDescription();

                String getHostType();

                String getUrl();
            }

            ImmutableList getDevserverInfos();

            String getName();

            boolean getSupportsVpnless();

            boolean hasSupportsVpnless();
        }

        ImmutableList getDevserverCategories();

        ImmutableList getErrorMessages();

        boolean hasIsInternal();

        boolean isInternal();
    }

    XdtApiV1DevserversListCategorized getXdtApiV1DevserversListCategorized();
}
