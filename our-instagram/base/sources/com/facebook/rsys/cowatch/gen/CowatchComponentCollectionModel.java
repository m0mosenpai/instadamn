package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31180DnO;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CowatchComponentCollectionModel {
    public final ArrayList childrenComponentList;
    public final int componentCollectionType;
    public final String componentDescription;
    public final String componentId;
    public final String componentSubtitle;
    public final String componentTitle;
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final ArrayList mediaList;
    public final boolean needsFetchingNextPage;
    public final String parentComponentId;
    public final String renderingStyles;

    public static native CowatchComponentCollectionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchComponentCollectionModel)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = (CowatchComponentCollectionModel) obj;
            if (this.componentId.equals(cowatchComponentCollectionModel.componentId) && this.parentComponentId.equals(cowatchComponentCollectionModel.parentComponentId)) {
                String str = this.componentTitle;
                String str2 = cowatchComponentCollectionModel.componentTitle;
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                String str3 = this.componentSubtitle;
                String str4 = cowatchComponentCollectionModel.componentSubtitle;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str3.equals(str4)) {
                    return false;
                }
                String str5 = this.componentDescription;
                String str6 = cowatchComponentCollectionModel.componentDescription;
                if (str5 == null) {
                    if (str6 != null) {
                        return false;
                    }
                } else if (!str5.equals(str6)) {
                    return false;
                }
                if (!this.mediaList.equals(cowatchComponentCollectionModel.mediaList) || !this.childrenComponentList.equals(cowatchComponentCollectionModel.childrenComponentList) || this.componentCollectionType != cowatchComponentCollectionModel.componentCollectionType || this.hasPerformedFirstFetch != cowatchComponentCollectionModel.hasPerformedFirstFetch || this.hasNextPage != cowatchComponentCollectionModel.hasNextPage || this.isUpdating != cowatchComponentCollectionModel.isUpdating) {
                    return false;
                }
                String str7 = this.logInfo;
                String str8 = cowatchComponentCollectionModel.logInfo;
                if (str7 == null) {
                    if (str8 != null) {
                        return false;
                    }
                } else if (!str7.equals(str8)) {
                    return false;
                }
                if (this.needsFetchingNextPage != cowatchComponentCollectionModel.needsFetchingNextPage) {
                    return false;
                }
                String str9 = this.renderingStyles;
                String str10 = cowatchComponentCollectionModel.renderingStyles;
                if (str9 != null) {
                    if (!str9.equals(str10)) {
                        return false;
                    }
                } else if (str10 != null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((AbstractC166997dE.A0J(this.childrenComponentList, AbstractC166997dE.A0J(this.mediaList, (((((AbstractC166997dE.A0K(this.parentComponentId, (527 + this.componentId.hashCode()) * 31) + AbstractC167017dG.A0O(this.componentTitle)) * 31) + AbstractC167017dG.A0O(this.componentSubtitle)) * 31) + AbstractC167017dG.A0O(this.componentDescription)) * 31)) + this.componentCollectionType) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + AbstractC167017dG.A0O(this.logInfo)) * 31) + (this.needsFetchingNextPage ? 1 : 0)) * 31) + AbstractC25227BEk.A07(this.renderingStyles);
    }

    public CowatchComponentCollectionModel(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, int i, boolean z, boolean z2, boolean z3, String str6, boolean z4, String str7) {
        AbstractC31180DnO.A1U(str, str2, arrayList);
        arrayList2.getClass();
        this.componentId = str;
        this.parentComponentId = str2;
        this.componentTitle = str3;
        this.componentSubtitle = str4;
        this.componentDescription = str5;
        this.mediaList = arrayList;
        this.childrenComponentList = arrayList2;
        this.componentCollectionType = i;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.logInfo = str6;
        this.needsFetchingNextPage = z4;
        this.renderingStyles = str7;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchComponentCollectionModel{componentId=");
        A1C.append(this.componentId);
        A1C.append(",parentComponentId=");
        A1C.append(this.parentComponentId);
        A1C.append(",componentTitle=");
        A1C.append(this.componentTitle);
        A1C.append(",componentSubtitle=");
        A1C.append(this.componentSubtitle);
        A1C.append(",componentDescription=");
        A1C.append(this.componentDescription);
        A1C.append(",mediaList=");
        A1C.append(this.mediaList);
        A1C.append(",childrenComponentList=");
        A1C.append(this.childrenComponentList);
        A1C.append(",componentCollectionType=");
        A1C.append(this.componentCollectionType);
        A1C.append(",hasPerformedFirstFetch=");
        A1C.append(this.hasPerformedFirstFetch);
        A1C.append(",hasNextPage=");
        A1C.append(this.hasNextPage);
        A1C.append(",isUpdating=");
        A1C.append(this.isUpdating);
        A1C.append(",logInfo=");
        A1C.append(this.logInfo);
        A1C.append(",needsFetchingNextPage=");
        A1C.append(this.needsFetchingNextPage);
        A1C.append(",renderingStyles=");
        A1C.append(this.renderingStyles);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
