package com.facebook.rsys.cowatch.gen;

import X.C00O;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class CowatchLoggingProxy {
    public abstract void logImpressions(ArrayList arrayList, String str, CowatchRankingMetadata cowatchRankingMetadata);

    public abstract void logTimeSpent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d);

    public abstract void logVideoSelect(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, CowatchRankingMetadata cowatchRankingMetadata);

    public CowatchLoggingProxy() {
        throw C00O.createAndThrow();
    }
}
