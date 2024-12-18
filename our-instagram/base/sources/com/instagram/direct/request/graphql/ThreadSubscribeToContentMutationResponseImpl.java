package com.instagram.direct.request.graphql;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class ThreadSubscribeToContentMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class IgDirectSubscribeThreadToContent extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C94754Oe.A00, "result");
        }

        public IgDirectSubscribeThreadToContent() {
            super(1104965674);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(IgDirectSubscribeThreadToContent.class, "ig_direct_subscribe_thread_to_content(data:$data)", 1104965674);
    }

    public ThreadSubscribeToContentMutationResponseImpl() {
        super(1691527732);
    }
}
