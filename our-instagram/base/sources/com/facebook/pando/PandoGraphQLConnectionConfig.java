package com.facebook.pando;

import X.C09170dP;
import X.C14360o3;
import X.InterfaceC40501uJ;
import X.XgW;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class PandoGraphQLConnectionConfig {
    public static final XgW Companion = new Object();
    public final String connectionQueryName;
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybridData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2);

    private final native void setGeneratedPaginationQueryClientDocId(String str);

    public final void setGeneratedPaginationQueryClientDocId(InterfaceC40501uJ interfaceC40501uJ) {
        C14360o3.A0B(interfaceC40501uJ, 0);
        String clientDocIdForQuery = interfaceC40501uJ.clientDocIdForQuery(this.connectionQueryName);
        if (clientDocIdForQuery == null) {
            clientDocIdForQuery = "";
        }
        setGeneratedPaginationQueryClientDocId(clientDocIdForQuery);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XgW] */
    static {
        C09170dP.A0C("pando-graphql-jni");
    }

    public PandoGraphQLConnectionConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        String str11 = str8;
        String str12 = str5;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str4, 4);
        C14360o3.A0B(str6, 6);
        C14360o3.A0B(str7, 7);
        C14360o3.A0B(str9, 9);
        C14360o3.A0B(str10, 10);
        this.connectionQueryName = str4;
        this.mHybridData = initHybridData(str, str2, str3, str5 == null ? "" : str12, str6, str7, str8 == null ? "" : str11, str9, str10, z, z2);
    }
}
