package com.facebook.graphservice.interfaces;

import X.AbstractC166987dD;
import X.AbstractC61281Rkr;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class PaginableList {
    public static final String MISSING_PAGINATION_KEY = "MISSING_PAGINATION_KEY";
    public final String mEndCursor;
    public final boolean mFailedLastLoadNext;
    public final boolean mFailedLastLoadPrevious;
    public final boolean mHasNextPage;
    public final boolean mHasPreviousPage;
    public final boolean mIsLoadingNext;
    public final boolean mIsLoadingPrevious;
    public boolean mIsPandoBacked = false;
    public final String mNextPageUUID;
    public final String mPaginationKey;
    public final String mPreviousPageUUID;
    public final ImmutableList mTrees;

    public static PaginableList withoutPaging(ImmutableList immutableList) {
        return new PaginableList(null, immutableList, false, false, false, false, false, false, null, null, null);
    }

    public static PaginableList withMetadata(ImmutableList immutableList, PaginableList paginableList) {
        PaginableList paginableList2 = new PaginableList(paginableList.mPaginationKey, immutableList, paginableList.mHasPreviousPage, paginableList.mHasNextPage, paginableList.mIsLoadingPrevious, paginableList.mIsLoadingNext, paginableList.mFailedLastLoadPrevious, paginableList.mFailedLastLoadNext, paginableList.mNextPageUUID, paginableList.mPreviousPageUUID, paginableList.mEndCursor);
        if (paginableList.mIsPandoBacked) {
            paginableList2.mIsPandoBacked = true;
        }
        return paginableList2;
    }

    public void appendEdgeWithService(GraphQLService graphQLService, Tree tree) {
        if (this.mPaginationKey.equals(MISSING_PAGINATION_KEY)) {
            return;
        }
        if (this.mIsPandoBacked) {
            throw AbstractC166987dD.A15("pandoAppendEdgeForKey");
        }
        throw AbstractC166987dD.A15("appendEdgeForKey");
    }

    public boolean failedLastLoadNext() {
        return this.mFailedLastLoadNext;
    }

    public boolean failedLastLoadPrevious() {
        return this.mFailedLastLoadPrevious;
    }

    public String getEndCursorDO_NOT_USE() {
        return this.mEndCursor;
    }

    public ImmutableList getList() {
        return this.mTrees;
    }

    public String getPaginationKey() {
        return this.mPaginationKey;
    }

    public boolean hasNextPage() {
        return this.mHasNextPage;
    }

    public boolean hasPreviousPage() {
        return this.mHasPreviousPage;
    }

    public boolean isLoadingNext() {
        return this.mIsLoadingNext;
    }

    public boolean isLoadingPrevious() {
        return this.mIsLoadingPrevious;
    }

    public GraphQLService.Token loadNextPageWithService(GraphQLService graphQLService, AbstractC61281Rkr abstractC61281Rkr, Executor executor, String str) {
        if (this.mPaginationKey.equals(MISSING_PAGINATION_KEY)) {
            return null;
        }
        throw AbstractC166987dD.A15("getTotalPageSize");
    }

    public GraphQLService.Token loadPreviousPageWithService(GraphQLService graphQLService, AbstractC61281Rkr abstractC61281Rkr, Executor executor, String str) {
        if (this.mPaginationKey.equals(MISSING_PAGINATION_KEY)) {
            return null;
        }
        throw AbstractC166987dD.A15("getTotalPageSize");
    }

    public String nextPageUUID() {
        return this.mNextPageUUID;
    }

    public void prependEdgeWithService(GraphQLService graphQLService, Tree tree) {
        if (this.mPaginationKey.equals(MISSING_PAGINATION_KEY)) {
            return;
        }
        if (this.mIsPandoBacked) {
            throw AbstractC166987dD.A15("pandoPrependEdgeForKey");
        }
        throw AbstractC166987dD.A15("prependEdgeForKey");
    }

    public String previousPageUUID() {
        return this.mPreviousPageUUID;
    }

    public void replaceEdgeWithService(GraphQLService graphQLService, Tree tree, String str) {
        if (this.mPaginationKey.equals(MISSING_PAGINATION_KEY)) {
        } else {
            throw AbstractC166987dD.A15("replaceEdgeForKey");
        }
    }

    public PaginableList(String str, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, String str3, String str4) {
        this.mTrees = immutableList;
        this.mPaginationKey = str == null ? MISSING_PAGINATION_KEY : str;
        this.mHasPreviousPage = z;
        this.mHasNextPage = z2;
        this.mIsLoadingPrevious = z3;
        this.mIsLoadingNext = z4;
        this.mFailedLastLoadPrevious = z5;
        this.mFailedLastLoadNext = z6;
        this.mNextPageUUID = str2;
        this.mPreviousPageUUID = str3;
        this.mEndCursor = str4;
    }

    public PaginableList setIsPandoBacked(boolean z) {
        this.mIsPandoBacked = z;
        return this;
    }

    public GraphQLService.Token loadNextPageWithService(GraphQLService graphQLService, AbstractC61281Rkr abstractC61281Rkr, Executor executor) {
        return loadNextPageWithService(graphQLService, abstractC61281Rkr, executor, "");
    }

    public GraphQLService.Token loadPreviousPageWithService(GraphQLService graphQLService, AbstractC61281Rkr abstractC61281Rkr, Executor executor) {
        return loadPreviousPageWithService(graphQLService, abstractC61281Rkr, executor, "");
    }
}
