package com.instagram.creator.agent.sandbox.profilebutton.graphql;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class IGCreatorAgentSandboxThreadMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XigCreateCreatorAgentThread extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C94754Oe.A00, "thread_igid");
        }

        public XigCreateCreatorAgentThread() {
            super(541112487);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XigCreateCreatorAgentThread.class, "xig_create_creator_agent_thread(request:{\"user_igid\":$user_igid})", 541112487);
    }

    public IGCreatorAgentSandboxThreadMutationResponseImpl() {
        super(596351239);
    }
}
