package com.instagram.debug.devoptions.section.xme.graphql;

import X.AbstractC111324zv;
import X.AbstractC167017dG;
import X.C2JS;
import X.C4OU;
import X.C94754Oe;
import com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class Sample3dPhotoResponseImpl extends C2JS implements Sample3dPhotoResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1151711264;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return Sample3dPhotoResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class Sample3dPhoto extends C2JS implements Sample3dPhotoResponse.Sample3dPhoto {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 840945856;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Sample3dPhoto.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoResponse.Sample3dPhoto
        public String getGlbUrl() {
            return A07("glb_url");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C94754Oe.A00, "glb_url");
        }

        public Sample3dPhoto(int i) {
            super(i);
        }

        public Sample3dPhoto() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.section.xme.graphql.Sample3dPhotoResponse
    public Sample3dPhotoResponse.Sample3dPhoto getSample3dPhoto() {
        return (Sample3dPhotoResponse.Sample3dPhoto) A03(Sample3dPhoto.class, AbstractC111324zv.A00(1240), Sample3dPhoto.TYPE_TAG);
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(Sample3dPhoto.class, AbstractC111324zv.A00(1240), Sample3dPhoto.TYPE_TAG);
    }

    public Sample3dPhotoResponseImpl(int i) {
        super(i);
    }

    public Sample3dPhotoResponseImpl() {
        super(TYPE_TAG);
    }
}
