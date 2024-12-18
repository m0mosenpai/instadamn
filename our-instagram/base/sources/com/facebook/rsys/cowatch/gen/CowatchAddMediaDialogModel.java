package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25236BEt;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CowatchAddMediaDialogModel {
    public final boolean amdLaunchedFromPromotion;
    public final int currentPageType;
    public final CowatchMediaTabModel fypTab;
    public final boolean hasEverBeenOpened;
    public final boolean isLoading;
    public final ArrayList logs;
    public final String requestedInitialTabId;
    public final CowatchMediaTabModel searchTab;
    public final long selectedTabIndex;
    public final ArrayList tabs;

    public static native CowatchAddMediaDialogModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAddMediaDialogModel)) {
                return false;
            }
            CowatchAddMediaDialogModel cowatchAddMediaDialogModel = (CowatchAddMediaDialogModel) obj;
            if (this.hasEverBeenOpened == cowatchAddMediaDialogModel.hasEverBeenOpened && this.isLoading == cowatchAddMediaDialogModel.isLoading) {
                String str = this.requestedInitialTabId;
                String str2 = cowatchAddMediaDialogModel.requestedInitialTabId;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.amdLaunchedFromPromotion != cowatchAddMediaDialogModel.amdLaunchedFromPromotion || this.selectedTabIndex != cowatchAddMediaDialogModel.selectedTabIndex) {
                    return false;
                }
                CowatchMediaTabModel cowatchMediaTabModel = this.searchTab;
                CowatchMediaTabModel cowatchMediaTabModel2 = cowatchAddMediaDialogModel.searchTab;
                if (cowatchMediaTabModel == null) {
                    if (cowatchMediaTabModel2 != null) {
                        return false;
                    }
                } else if (!cowatchMediaTabModel.equals(cowatchMediaTabModel2)) {
                    return false;
                }
                if (!this.tabs.equals(cowatchAddMediaDialogModel.tabs)) {
                    return false;
                }
                CowatchMediaTabModel cowatchMediaTabModel3 = this.fypTab;
                CowatchMediaTabModel cowatchMediaTabModel4 = cowatchAddMediaDialogModel.fypTab;
                if (cowatchMediaTabModel3 != null) {
                    if (!cowatchMediaTabModel3.equals(cowatchMediaTabModel4)) {
                        return false;
                    }
                } else if (cowatchMediaTabModel4 != null) {
                    return false;
                }
                if (this.currentPageType != cowatchAddMediaDialogModel.currentPageType || !this.logs.equals(cowatchAddMediaDialogModel.logs)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.logs, (((AbstractC166997dE.A0J(this.tabs, (AbstractC25236BEt.A01(this.selectedTabIndex, (((((((527 + (this.hasEverBeenOpened ? 1 : 0)) * 31) + (this.isLoading ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.requestedInitialTabId)) * 31) + (this.amdLaunchedFromPromotion ? 1 : 0)) * 31) + AbstractC167017dG.A0M(this.searchTab)) * 31) + AbstractC166997dE.A0I(this.fypTab)) * 31) + this.currentPageType) * 31);
    }

    public CowatchAddMediaDialogModel(boolean z, boolean z2, String str, boolean z3, long j, CowatchMediaTabModel cowatchMediaTabModel, ArrayList arrayList, CowatchMediaTabModel cowatchMediaTabModel2, int i, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.hasEverBeenOpened = z;
        this.isLoading = z2;
        this.requestedInitialTabId = str;
        this.amdLaunchedFromPromotion = z3;
        this.selectedTabIndex = j;
        this.searchTab = cowatchMediaTabModel;
        this.tabs = arrayList;
        this.fypTab = cowatchMediaTabModel2;
        this.currentPageType = i;
        this.logs = arrayList2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchAddMediaDialogModel{hasEverBeenOpened=");
        A1C.append(this.hasEverBeenOpened);
        A1C.append(",isLoading=");
        A1C.append(this.isLoading);
        A1C.append(",requestedInitialTabId=");
        A1C.append(this.requestedInitialTabId);
        A1C.append(",amdLaunchedFromPromotion=");
        A1C.append(this.amdLaunchedFromPromotion);
        A1C.append(",selectedTabIndex=");
        A1C.append(this.selectedTabIndex);
        A1C.append(",searchTab=");
        A1C.append(this.searchTab);
        A1C.append(",tabs=");
        A1C.append(this.tabs);
        A1C.append(",fypTab=");
        A1C.append(this.fypTab);
        A1C.append(",currentPageType=");
        A1C.append(this.currentPageType);
        A1C.append(",logs=");
        A1C.append(this.logs);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
