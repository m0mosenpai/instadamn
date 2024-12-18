package com.facebook.tigon;

import X.AnonymousClass001;
import X.C14360o3;
import X.C74783Xo;
import com.facebook.tigon.iface.TigonErrorCode;

/* loaded from: classes2.dex */
public final class TigonError {
    public static final C74783Xo Companion = new Object();
    public static final TigonError None = new TigonError(TigonErrorCode.NONE, "", 0, "");
    public final String analyticsDetail;
    public final TigonErrorCode category;
    public final int domainErrorCode;
    public final String errorDomain;

    public TigonError(TigonErrorCode tigonErrorCode, String str, int i, String str2) {
        C14360o3.A0B(str2, 4);
        this.category = tigonErrorCode;
        this.errorDomain = str;
        this.domainErrorCode = i;
        this.analyticsDetail = str2;
    }

    public final String description() {
        return AnonymousClass001.A0g(AnonymousClass001.A0b(AnonymousClass001.A0g(this.category.toString(), " domain: ", this.errorDomain), " code: ", this.domainErrorCode), " detail: ", this.analyticsDetail);
    }
}
