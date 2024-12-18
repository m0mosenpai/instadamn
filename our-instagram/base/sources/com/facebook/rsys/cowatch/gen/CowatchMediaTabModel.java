package com.facebook.rsys.cowatch.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CowatchMediaTabModel {
    public final boolean hasNextPage;
    public final boolean hasPerformedFirstFetch;
    public final boolean isUpdating;
    public final String logInfo;
    public final boolean needsFetchingNextPage;
    public final String query;
    public final CowatchComponentCollectionModel secondaryComponent;
    public final int source;
    public final ArrayList tabSections;
    public final String title;

    public static native CowatchMediaTabModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaTabModel)) {
                return false;
            }
            CowatchMediaTabModel cowatchMediaTabModel = (CowatchMediaTabModel) obj;
            String str = this.title;
            String str2 = cowatchMediaTabModel.title;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.tabSections.equals(cowatchMediaTabModel.tabSections)) {
                return false;
            }
            CowatchComponentCollectionModel cowatchComponentCollectionModel = this.secondaryComponent;
            CowatchComponentCollectionModel cowatchComponentCollectionModel2 = cowatchMediaTabModel.secondaryComponent;
            if (cowatchComponentCollectionModel == null) {
                if (cowatchComponentCollectionModel2 != null) {
                    return false;
                }
            } else if (!cowatchComponentCollectionModel.equals(cowatchComponentCollectionModel2)) {
                return false;
            }
            if (!this.query.equals(cowatchMediaTabModel.query) || this.source != cowatchMediaTabModel.source) {
                return false;
            }
            String str3 = this.logInfo;
            String str4 = cowatchMediaTabModel.logInfo;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            if (this.hasPerformedFirstFetch != cowatchMediaTabModel.hasPerformedFirstFetch || this.hasNextPage != cowatchMediaTabModel.hasNextPage || this.isUpdating != cowatchMediaTabModel.isUpdating || this.needsFetchingNextPage != cowatchMediaTabModel.needsFetchingNextPage) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((AbstractC166997dE.A0K(this.query, (AbstractC166997dE.A0J(this.tabSections, (527 + AbstractC167017dG.A0O(this.title)) * 31) + AbstractC167017dG.A0M(this.secondaryComponent)) * 31) + this.source) * 31) + AbstractC25227BEk.A07(this.logInfo)) * 31) + (this.hasPerformedFirstFetch ? 1 : 0)) * 31) + (this.hasNextPage ? 1 : 0)) * 31) + (this.isUpdating ? 1 : 0)) * 31) + (this.needsFetchingNextPage ? 1 : 0);
    }

    public CowatchMediaTabModel(String str, ArrayList arrayList, CowatchComponentCollectionModel cowatchComponentCollectionModel, String str2, int i, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        arrayList.getClass();
        str2.getClass();
        this.title = str;
        this.tabSections = arrayList;
        this.secondaryComponent = cowatchComponentCollectionModel;
        this.query = str2;
        this.source = i;
        this.logInfo = str3;
        this.hasPerformedFirstFetch = z;
        this.hasNextPage = z2;
        this.isUpdating = z3;
        this.needsFetchingNextPage = z4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CowatchMediaTabModel{title=");
        A1C.append(this.title);
        A1C.append(",tabSections=");
        A1C.append(this.tabSections);
        A1C.append(",secondaryComponent=");
        A1C.append(this.secondaryComponent);
        A1C.append(",query=");
        A1C.append(this.query);
        A1C.append(",source=");
        A1C.append(this.source);
        A1C.append(",logInfo=");
        A1C.append(this.logInfo);
        A1C.append(",hasPerformedFirstFetch=");
        A1C.append(this.hasPerformedFirstFetch);
        A1C.append(",hasNextPage=");
        A1C.append(this.hasNextPage);
        A1C.append(",isUpdating=");
        A1C.append(this.isUpdating);
        A1C.append(",needsFetchingNextPage=");
        A1C.append(this.needsFetchingNextPage);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
