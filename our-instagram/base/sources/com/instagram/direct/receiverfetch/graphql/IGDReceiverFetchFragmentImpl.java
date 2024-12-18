package com.instagram.direct.receiverfetch.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import X.C94894Ou;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes10.dex */
public final class IGDReceiverFetchFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class Response extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Y(C94894Ou.A00, AbstractC166987dD.A0i(C94754Oe.A00, AbstractC43591JPw.A00(1248)), TraceFieldType.ErrorCode);
        }

        public Response() {
            super(1622975823);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A02(), Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 1622975823);
    }

    public IGDReceiverFetchFragmentImpl() {
        super(509676106);
    }
}
