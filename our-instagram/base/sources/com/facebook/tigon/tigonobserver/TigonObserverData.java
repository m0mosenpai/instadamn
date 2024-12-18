package com.facebook.tigon.tigonobserver;

import X.C1T4;
import X.C1T5;
import X.C1T7;
import X.C9BO;
import X.InterfaceC74743Xi;
import android.os.SystemClock;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonRequest;

/* loaded from: classes.dex */
public class TigonObserverData implements TigonRequestErrored {
    public int mAttempts;
    public long mCreationTime = SystemClock.uptimeMillis();
    public TigonError mError;
    public long mRequestId;
    public C9BO mResponse;
    public TigonRequest mSentRequest;
    public TigonRequest mSubmittedRequest;
    public InterfaceC74743Xi mSummary;

    private void onEom(byte[] bArr, int i) {
        this.mError = null;
        this.mSummary = C1T4.A01(bArr, i);
    }

    private void onResponse(byte[] bArr, int i) {
        C1T7 c1t7 = new C1T7(bArr, i);
        this.mResponse = new C9BO(C1T5.A00(c1t7), 0, C1T4.A00.A03(c1t7));
    }

    private void onStarted(int i, byte[] bArr, int i2) {
        this.mAttempts = i;
        this.mSentRequest = C1T4.A03(bArr, i2);
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestStarted
    public int attempts() {
        return this.mAttempts;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestAdded
    public long creationTime() {
        return this.mCreationTime;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestErrored
    public TigonError error() {
        return this.mError;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestAdded
    public long requestId() {
        return this.mRequestId;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestResponse
    public C9BO response() {
        return this.mResponse;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestAdded
    public TigonRequest submittedRequest() {
        return this.mSubmittedRequest;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestSucceeded
    public InterfaceC74743Xi summary() {
        return this.mSummary;
    }

    public TigonObserverData(long j, TigonRequest tigonRequest, byte[] bArr, int i) {
        this.mRequestId = j;
        this.mSubmittedRequest = tigonRequest == null ? C1T4.A03(bArr, i) : tigonRequest;
    }

    private void onError(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.mError = C1T4.A00(bArr, i);
        this.mSummary = C1T4.A01(bArr2, i2);
    }
}
