package com.facebook.smartcapture.ui.ig;

import X.AbstractC61600RqP;
import X.C00O;
import X.C11X;
import X.C14360o3;
import X.C27101Tj;
import X.C63472SlD;
import X.InterfaceC65373Tj5;
import X.InterfaceC65501TlQ;
import X.MRQ;
import X.Q22;
import X.R7f;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.facebook.smartcapture.resources.ResourcesProvider;

/* loaded from: classes10.dex */
public class IgSelfieResourcesProvider extends AbstractC61600RqP implements ResourcesProvider {
    public static final Parcelable.Creator CREATOR = new C63472SlD(IgSelfieResourcesProvider.class, 0);
    public Resources A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.MRQ, java.lang.Object] */
    @Override // com.facebook.smartcapture.resources.ResourcesProvider
    public final MRQ AzR() {
        if (this instanceof XMDSIgSelfieResourcesProvider) {
            return new R7f();
        }
        return new Object();
    }

    @Override // com.facebook.smartcapture.resources.ResourcesProvider
    public final Resources Boa() {
        Resources resources = this.A00;
        if (resources == null) {
            C14360o3.A0F("resources");
            throw C00O.createAndThrow();
        }
        return resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.smartcapture.resources.ResourcesProvider
    public final void COB(Context context) {
        Resources resources;
        C27101Tj A01 = C11X.A00().A01();
        if (context instanceof InterfaceC65501TlQ) {
            InterfaceC65501TlQ interfaceC65501TlQ = (InterfaceC65501TlQ) context;
            if (!interfaceC65501TlQ.BFB().isEmpty()) {
                InterfaceC65373Tj5 C2t = interfaceC65501TlQ.C2t();
                AssetManager assets = A01.getAssets();
                C14360o3.A07(assets);
                DisplayMetrics displayMetrics = A01.getDisplayMetrics();
                C14360o3.A07(displayMetrics);
                Configuration configuration = A01.getConfiguration();
                C14360o3.A07(configuration);
                resources = new Q22(assets, configuration, A01, displayMetrics, C2t, interfaceC65501TlQ.BFB());
                this.A00 = resources;
            }
        }
        resources = A01;
        this.A00 = resources;
    }
}
