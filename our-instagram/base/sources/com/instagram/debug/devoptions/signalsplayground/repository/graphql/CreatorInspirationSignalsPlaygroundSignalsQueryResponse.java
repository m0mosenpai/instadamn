package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C2JT;
import X.VFD;
import com.google.common.collect.ImmutableList;

/* loaded from: classes7.dex */
public interface CreatorInspirationSignalsPlaygroundSignalsQueryResponse extends C2JT {

    /* loaded from: classes7.dex */
    public interface XdtGetCreatorsSignalPlayground extends C2JT {

        /* loaded from: classes5.dex */
        public interface Signals extends C2JT {
            String getDisplayName();

            VFD getEntityTypeV2();

            String getIdentifier();
        }

        ImmutableList getSignals();
    }

    XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground();
}
