package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C2JT;
import com.google.common.collect.ImmutableList;

/* loaded from: classes7.dex */
public interface CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse extends C2JT {

    /* loaded from: classes7.dex */
    public interface XdtGetCreatorsSignalPlayground extends C2JT {

        /* loaded from: classes7.dex */
        public interface Signal extends C2JT {

            /* loaded from: classes7.dex */
            public interface TestCases extends C2JT {

                /* loaded from: classes7.dex */
                public interface User extends C2JT {
                    CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser();
                }

                User getUser();
            }

            ImmutableList getTestCases();
        }

        Signal getSignal();
    }

    XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground();
}
