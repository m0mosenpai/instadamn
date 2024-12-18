package com.facebook.graphservice.interfaces;

import X.AbstractC25233BEq;
import X.C0T6;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class PaginationMetadata extends C0T6 {
    public final String endCursor;
    public final boolean failedLastLoadNext;
    public final boolean failedLastLoadPrevious;
    public final boolean hasNextPage;
    public final boolean hasPreviousPage;
    public final boolean isLoadingNext;
    public final boolean isLoadingPrevious;
    public final boolean isPandoBacked;
    public final String nextPageUUID;
    public final String paginationKey;
    public final String previousPageUUID;

    public PaginationMetadata(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4, boolean z7) {
        AbstractC25233BEq.A0y(1, str, str2, str3);
        C14360o3.A0B(str4, 10);
        this.paginationKey = str;
        this.hasPreviousPage = z;
        this.hasNextPage = z2;
        this.isLoadingPrevious = z3;
        this.isLoadingNext = z4;
        this.failedLastLoadPrevious = z5;
        this.failedLastLoadNext = z6;
        this.nextPageUUID = str2;
        this.previousPageUUID = str3;
        this.endCursor = str4;
        this.isPandoBacked = z7;
    }

    public static /* synthetic */ PaginationMetadata copy$default(PaginationMetadata paginationMetadata, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paginationMetadata.paginationKey;
        }
        if ((i & 2) != 0) {
            z = paginationMetadata.hasPreviousPage;
        }
        if ((i & 4) != 0) {
            z2 = paginationMetadata.hasNextPage;
        }
        if ((i & 8) != 0) {
            z3 = paginationMetadata.isLoadingPrevious;
        }
        if ((i & 16) != 0) {
            z4 = paginationMetadata.isLoadingNext;
        }
        if ((i & 32) != 0) {
            z5 = paginationMetadata.failedLastLoadPrevious;
        }
        if ((i & 64) != 0) {
            z6 = paginationMetadata.failedLastLoadNext;
        }
        if ((i & 128) != 0) {
            str2 = paginationMetadata.nextPageUUID;
        }
        if ((i & 256) != 0) {
            str3 = paginationMetadata.previousPageUUID;
        }
        if ((i & 512) != 0) {
            str4 = paginationMetadata.endCursor;
        }
        if ((i & 1024) != 0) {
            z7 = paginationMetadata.isPandoBacked;
        }
        return paginationMetadata.copy(str, z, z2, z3, z4, z5, z6, str2, str3, str4, z7);
    }

    public final String component1() {
        return this.paginationKey;
    }

    public final String component10() {
        return this.endCursor;
    }

    public final boolean component11() {
        return this.isPandoBacked;
    }

    public final boolean component2() {
        return this.hasPreviousPage;
    }

    public final boolean component3() {
        return this.hasNextPage;
    }

    public final boolean component4() {
        return this.isLoadingPrevious;
    }

    public final boolean component5() {
        return this.isLoadingNext;
    }

    public final boolean component6() {
        return this.failedLastLoadPrevious;
    }

    public final boolean component7() {
        return this.failedLastLoadNext;
    }

    public final String component8() {
        return this.nextPageUUID;
    }

    public final String component9() {
        return this.previousPageUUID;
    }

    public final PaginationMetadata copy(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4, boolean z7) {
        C14360o3.A0B(str, 0);
        AbstractC25233BEq.A0y(7, str2, str3, str4);
        return new PaginationMetadata(str, z, z2, z3, z4, z5, z6, str2, str3, str4, z7);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
