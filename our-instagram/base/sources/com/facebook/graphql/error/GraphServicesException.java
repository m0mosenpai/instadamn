package com.facebook.graphql.error;

import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import java.io.IOException;

/* loaded from: classes10.dex */
public class GraphServicesException extends IOException {
    public final GraphQLError mError;
    public String mErrorMsg;
    public final Summary mSummary;
    public final TigonError mTigonError;

    public GraphServicesException(TigonError tigonError, Summary summary) {
        super("GraphServicesError ( empty )");
        this.mTigonError = tigonError;
        this.mSummary = summary;
        this.mError = toGraphQLError();
        this.mErrorMsg = toMessageString();
    }

    private GraphQLError toGraphQLError() {
        String str;
        Summary summary = this.mSummary;
        if (summary != null && (str = summary.summary) != null && !str.isEmpty()) {
            int i = summary.apiErrorCode;
            int i2 = summary.code;
            String str2 = summary.debugInfo;
            return new GraphQLError(str, summary.description, summary.fbRequestId, str2, i2, i, 0L, summary.isSilent, summary.isTransient, summary.requiresReauth);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String toMessageString() {
        /*
            r4 = this;
            com.facebook.tigon.TigonError r1 = r4.mTigonError
            if (r1 == 0) goto L4d
            java.lang.StringBuilder r3 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "TigonError(error="
            r3.append(r0)
            com.facebook.tigon.iface.TigonErrorCode r0 = r1.category
            X.AbstractC58318PtA.A1V(r3, r0)
            java.lang.String r0 = ", errorDomain="
            r3.append(r0)
            com.facebook.tigon.TigonError r1 = r4.mTigonError
            java.lang.String r0 = r1.errorDomain
            r3.append(r0)
            java.lang.String r0 = ", domainErrorCode="
            r3.append(r0)
            int r0 = r1.domainErrorCode
            r3.append(r0)
            java.lang.String r1 = r1.analyticsDetail
            if (r1 == 0) goto L3f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L3f
            java.lang.String r0 = ", analyticsDetail=\""
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "\""
            r3.append(r0)
        L3f:
            java.lang.String r0 = ")"
        L41:
            r3.append(r0)
        L44:
            java.lang.String r0 = r3.toString()
            if (r0 != 0) goto L4c
        L4a:
            java.lang.String r0 = "GraphServicesError (empty)"
        L4c:
            return r0
        L4d:
            com.facebook.graphql.error.GraphQLError r2 = r4.mError
            if (r2 == 0) goto L7e
            java.lang.StringBuilder r3 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "[code] "
            r3.append(r0)
            int r0 = r2.code
            r1 = -1
            if (r0 != r1) goto L61
            int r0 = r2.A00
        L61:
            r3.append(r0)
            java.lang.String r0 = " [message]: "
            r3.append(r0)
            java.lang.String r0 = r2.description
            if (r0 != 0) goto L6f
            java.lang.String r0 = r2.A02
        L6f:
            r3.append(r0)
            java.lang.String r0 = " [extra]: "
            r3.append(r0)
            java.lang.String r0 = r2.debugInfo
            if (r0 != 0) goto L41
            java.lang.String r0 = r2.A01
            goto L41
        L7e:
            com.facebook.graphservice.interfaces.Summary r3 = r4.mSummary
            if (r3 == 0) goto L4a
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphServicesException.toMessageString():java.lang.String");
    }

    public GraphQLError getGraphQLError() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.mErrorMsg;
    }

    public Summary getSummary() {
        return this.mSummary;
    }

    public TigonError getTigonError() {
        return this.mTigonError;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GraphServicesException(com.facebook.tigon.TigonErrorException r2, com.facebook.graphservice.interfaces.Summary r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 0
        L3:
            r1.<init>(r0, r3)
            return
        L7:
            com.facebook.tigon.TigonError r0 = r2.tigonError
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphServicesException.<init>(com.facebook.tigon.TigonErrorException, com.facebook.graphservice.interfaces.Summary):void");
    }
}
