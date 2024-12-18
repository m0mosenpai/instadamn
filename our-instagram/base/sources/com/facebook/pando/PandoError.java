package com.facebook.pando;

import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25234BEr;
import X.C3OO;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PandoError {
    public final String additionalInfoFromRESTDoNotUseExceptForMigration;
    public final String apiErrorDebugInfo;
    public final String apiErrorDescription;
    public final boolean apiErrorIsSilent;
    public final boolean apiErrorIsTransient;
    public final boolean apiErrorRequiresReauth;
    public final String apiErrorSummary;
    public final String message;
    public final String tigonErrorAnalyticsDetail;
    public final String tigonErrorAnalyticsDomain;
    public final short tigonErrorCode;
    public final String tigonErrorCodeDescription;

    public PandoError(String str, String str2, String str3, short s, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8) {
        AbstractC167017dG.A1P(str, str2);
        AbstractC25234BEr.A0k(3, str3, str4, str5, str6);
        AbstractC25229BEm.A1L(str7, 8, str8);
        this.message = str;
        this.tigonErrorCodeDescription = str2;
        this.tigonErrorAnalyticsDomain = str3;
        this.tigonErrorCode = s;
        this.tigonErrorAnalyticsDetail = str4;
        this.apiErrorSummary = str5;
        this.apiErrorDescription = str6;
        this.additionalInfoFromRESTDoNotUseExceptForMigration = str7;
        this.apiErrorIsTransient = z;
        this.apiErrorIsSilent = z2;
        this.apiErrorRequiresReauth = z3;
        this.apiErrorDebugInfo = str8;
    }

    public /* synthetic */ PandoError(String str, String str2, String str3, short s, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? (short) 0 : s, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) == 0 ? z3 : false, (i & C3OO.FLAG_MOVED) == 0 ? str8 : "");
    }
}
