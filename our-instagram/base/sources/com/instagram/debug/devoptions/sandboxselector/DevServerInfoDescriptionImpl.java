package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167017dG;
import X.C2JS;
import X.C4OU;
import X.C94754Oe;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class DevServerInfoDescriptionImpl extends C2JS implements DevServerInfoDescription {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1327467523;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return DevServerInfoDescriptionImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevServerInfoDescription
    public String getDescription() {
        return A07(DevServerEntity.COLUMN_DESCRIPTION);
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC167017dG.A0Z(C94754Oe.A00, DevServerEntity.COLUMN_DESCRIPTION);
    }

    public DevServerInfoDescriptionImpl(int i) {
        super(i);
    }

    public DevServerInfoDescriptionImpl() {
        super(TYPE_TAG);
    }
}
