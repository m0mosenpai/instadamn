package com.instagram.debug.devoptions.section.xme;

import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC33235ElU;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C35119FeM;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WearableMediaDownloadToolFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public WearableMediaDownloadManager downloadManager;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131958506);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "xme_wearable_media_download_tool";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.downloadManager = new WearableMediaDownloadManager(this, getSession());
        getItems();
    }

    private final void getItems() {
        ArrayList arrayList = new ArrayList();
        C35119FeM.A00(arrayList, true);
        AbstractC25235BEs.A1C(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.WearableMediaDownloadToolFragment$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1429499942);
                WearableMediaDownloadManager wearableMediaDownloadManager = WearableMediaDownloadToolFragment.this.downloadManager;
                if (wearableMediaDownloadManager == null) {
                    C14360o3.A0F("downloadManager");
                    throw C00O.createAndThrow();
                }
                wearableMediaDownloadManager.downloadFile(WearableMediaDownloadManager.MediaType.SN_PHOTO, false);
                C0f9.A0C(60132540, A05);
            }
        }, arrayList, 2131958507);
        AbstractC25235BEs.A1C(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.WearableMediaDownloadToolFragment$getItems$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-30219452);
                WearableMediaDownloadManager wearableMediaDownloadManager = WearableMediaDownloadToolFragment.this.downloadManager;
                if (wearableMediaDownloadManager == null) {
                    C14360o3.A0F("downloadManager");
                    throw C00O.createAndThrow();
                }
                wearableMediaDownloadManager.downloadFile(WearableMediaDownloadManager.MediaType.SN_VIDEO, true);
                C0f9.A0C(-643954282, A05);
            }
        }, arrayList, 2131958508);
        AbstractC25235BEs.A1C(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.WearableMediaDownloadToolFragment$getItems$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1103326420);
                WearableMediaDownloadManager wearableMediaDownloadManager = WearableMediaDownloadToolFragment.this.downloadManager;
                if (wearableMediaDownloadManager == null) {
                    C14360o3.A0F("downloadManager");
                    throw C00O.createAndThrow();
                }
                wearableMediaDownloadManager.downloadFile(WearableMediaDownloadManager.MediaType.STELLA_PHOTO, false);
                C0f9.A0C(352092402, A05);
            }
        }, arrayList, 2131958509);
        AbstractC25235BEs.A1C(requireContext(), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.xme.WearableMediaDownloadToolFragment$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1318607119);
                WearableMediaDownloadManager wearableMediaDownloadManager = WearableMediaDownloadToolFragment.this.downloadManager;
                if (wearableMediaDownloadManager == null) {
                    C14360o3.A0F("downloadManager");
                    throw C00O.createAndThrow();
                }
                wearableMediaDownloadManager.downloadFile(WearableMediaDownloadManager.MediaType.STELLA_VIDEO, true);
                C0f9.A0C(-1096066188, A05);
            }
        }, arrayList, 2131958510);
        setItems(arrayList);
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return (UserSession) this.session$delegate.getValue();
    }
}
