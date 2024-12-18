package com.facebookpay.offsite.models.message;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class StartCheckoutContent {

    @SerializedName("cookieNames")
    public final List<String> cookieNames;

    @SerializedName("handle")
    public final String handle;

    public final List getCookieNames() {
        return this.cookieNames;
    }

    public final String getHandle() {
        return this.handle;
    }

    public StartCheckoutContent(String str, List list) {
        this.handle = str;
        this.cookieNames = list;
    }

    public /* synthetic */ StartCheckoutContent(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }

    public StartCheckoutContent() {
        this(null, null);
    }
}
