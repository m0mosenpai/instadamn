package org.chromium.support_lib_boundary;

import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public interface WebSettingsBoundaryInterface {
    int getAttributionBehavior();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    Set getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    Map getUserAgentMetadataMap();

    int getWebViewMediaIntegrityApiDefaultStatus();

    Map getWebViewMediaIntegrityApiOverrideRules();

    int getWebauthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z);

    void setAttributionBehavior(int i);

    void setDisabledActionModeMenuItems(int i);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setOffscreenPreRaster(boolean z);

    void setRequestedWithHeaderOriginAllowList(Set set);

    void setSafeBrowsingEnabled(boolean z);

    void setUserAgentMetadataFromMap(Map map);

    void setWebViewMediaIntegrityApiStatus(int i, Map map);

    void setWebauthnSupport(int i);

    void setWillSuppressErrorPage(boolean z);
}
