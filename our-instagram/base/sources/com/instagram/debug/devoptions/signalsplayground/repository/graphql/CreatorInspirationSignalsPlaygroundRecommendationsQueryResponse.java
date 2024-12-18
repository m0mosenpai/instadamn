package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C2JT;
import com.google.common.collect.ImmutableList;

/* loaded from: classes7.dex */
public interface CreatorInspirationSignalsPlaygroundRecommendationsQueryResponse extends C2JT {

    /* loaded from: classes7.dex */
    public interface XdtGetCreatorsSignalPlayground extends C2JT {

        /* loaded from: classes7.dex */
        public interface TestCase extends C2JT {

            /* loaded from: classes7.dex */
            public interface Audios extends C2JT {

                /* loaded from: classes7.dex */
                public interface AudioInfo extends C2JT {
                    CreatorInspirationSignalsPlaygroundAudio asCreatorInspirationSignalsPlaygroundAudio();
                }

                AudioInfo getAudioInfo();
            }

            /* loaded from: classes7.dex */
            public interface Clips extends C2JT {

                /* loaded from: classes7.dex */
                public interface Media extends C2JT {
                    CreatorInspirationSignalsPlaygroundClipsMedia asCreatorInspirationSignalsPlaygroundClipsMedia();
                }

                Media getMedia();
            }

            ImmutableList getAudios();

            ImmutableList getClips();
        }

        TestCase getTestCase();
    }

    XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground();
}
