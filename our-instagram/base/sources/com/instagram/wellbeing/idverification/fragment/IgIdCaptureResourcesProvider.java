package com.instagram.wellbeing.idverification.fragment;

import X.AbstractC166987dD;
import X.AbstractC61600RqP;
import X.C11X;
import X.C14360o3;
import X.C27101Tj;
import X.C63472SlD;
import X.InterfaceC65373Tj5;
import X.InterfaceC65501TlQ;
import X.MRQ;
import X.MSW;
import X.Q22;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.facebook.smartcapture.resources.ResourcesProvider;
import java.util.Map;

/* loaded from: classes10.dex */
public final class IgIdCaptureResourcesProvider extends AbstractC61600RqP implements ResourcesProvider {
    public static final Parcelable.Creator CREATOR = new C63472SlD(IgIdCaptureResourcesProvider.class, 0);
    public Resources A00;
    public MRQ A01;

    @Override // com.facebook.smartcapture.resources.ResourcesProvider
    public final MRQ AzR() {
        MRQ mrq = this.A01;
        if (mrq != null) {
            return mrq;
        }
        throw AbstractC166987dD.A14("DrawableProvider not initialized, call initialize(context) first");
    }

    @Override // com.facebook.smartcapture.resources.ResourcesProvider
    public final Resources Boa() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.MRQ, java.lang.Object] */
    @Override // com.facebook.smartcapture.resources.ResourcesProvider
    public final void COB(Context context) {
        this.A01 = new Object();
        C27101Tj A01 = C11X.A00().A01();
        if (context instanceof InterfaceC65501TlQ) {
            InterfaceC65501TlQ interfaceC65501TlQ = (InterfaceC65501TlQ) context;
            Map BFB = interfaceC65501TlQ.BFB();
            if (MSW.A1b(BFB)) {
                InterfaceC65373Tj5 C2t = interfaceC65501TlQ.C2t();
                AssetManager assets = A01.getAssets();
                C14360o3.A07(assets);
                DisplayMetrics displayMetrics = A01.getDisplayMetrics();
                C14360o3.A07(displayMetrics);
                Configuration configuration = A01.getConfiguration();
                C14360o3.A07(configuration);
                this.A00 = new Q22(assets, configuration, A01, displayMetrics, C2t, BFB);
                return;
            }
        }
        this.A00 = A01;
    }
}
