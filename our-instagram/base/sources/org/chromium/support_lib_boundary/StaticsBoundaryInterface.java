package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public interface StaticsBoundaryInterface {
    Uri getSafeBrowsingPrivacyPolicyUrl();

    String getVariationsHeader();

    void initSafeBrowsing(Context context, ValueCallback valueCallback);

    boolean isMultiProcessEnabled();

    void setSafeBrowsingAllowlist(Set set, ValueCallback valueCallback);

    void setSafeBrowsingWhitelist(List list, ValueCallback valueCallback);
}
