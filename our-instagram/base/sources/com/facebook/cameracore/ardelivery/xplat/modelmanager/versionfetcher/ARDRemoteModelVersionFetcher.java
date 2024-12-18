package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.C14360o3;
import X.C1Dk;
import X.C23354AXd;
import X.C61746Rt1;
import X.C62781SQz;
import X.C64021Sxs;
import X.C64026Sxy;
import X.InterfaceC150016ox;
import X.InterfaceC40711ue;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ARDRemoteModelVersionFetcher implements RemoteModelVersionFetcher {
    public static final C61746Rt1 Companion = new Object();
    public static final int REQUEST_CACHE_TTL_SECONDS = 3600;
    public static final String TAG = "ARDRemoteModelVersionFetcher";
    public final InterfaceC150016ox forceDownloadFlagHandler;
    public final InterfaceC40711ue graphQLQueryExecutor;

    @Override // com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.RemoteModelVersionFetcher
    public void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        AbstractC167017dG.A1N(list, xplatRemoteModelVersionFetchCompletionCallback);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String serverValue = ((VersionedCapability) it.next()).toServerValue();
            C14360o3.A07(serverValue);
            A1E.add(serverValue);
        }
        try {
            C64026Sxy c64026Sxy = (C64026Sxy) AbstractC50523MSb.A0R("create", C62781SQz.class);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A1E);
            c64026Sxy.A00.A05("capability_types", copyOf);
            c64026Sxy.A02 = AbstractC167007dF.A1W(copyOf);
            C1Dk A00 = c64026Sxy.A00();
            this.graphQLQueryExecutor.ATV(new C23354AXd(xplatRemoteModelVersionFetchCompletionCallback, 0), new C64021Sxs(0, list, this, A1E, xplatRemoteModelVersionFetchCompletionCallback), A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw AbstractC58318PtA.A0f(e);
        }
    }

    public ARDRemoteModelVersionFetcher(InterfaceC40711ue interfaceC40711ue, InterfaceC150016ox interfaceC150016ox) {
        AbstractC167017dG.A1P(interfaceC40711ue, interfaceC150016ox);
        this.graphQLQueryExecutor = interfaceC40711ue;
        this.forceDownloadFlagHandler = interfaceC150016ox;
    }
}
