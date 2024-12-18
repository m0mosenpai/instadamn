package com.facebook.avatar.autogen.download;

import X.AbstractC166987dD;
import X.C05F;
import X.C14360o3;
import X.C195908lc;
import X.C1M8;
import X.C1RQ;
import X.C23549Ac3;
import X.C2OD;
import X.C63475SlG;
import X.EnumC27091Ti;
import X.MTC;
import X.MTD;
import X.TGS;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.models.IgModelLoader;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class IgModelDownloader implements FaceTrackerModelsProvider {
    public static final Parcelable.Creator CREATOR = new C63475SlG(11);
    public final UserSession A00;

    public IgModelDownloader(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeValue(this.A00);
    }

    @Override // com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider
    public final Map BUU(Context context) {
        Object obj = new Object();
        MTC mtc = new MTC(EnumC27091Ti.A1D);
        mtc.A03 = C05F.A01;
        mtc.A02 = new TGS(obj, 0);
        C1RQ A00 = C1RQ.A00();
        UserSession userSession = this.A00;
        A00.A03(userSession, new MTD(mtc));
        IgModelLoader A002 = C195908lc.A00(userSession);
        if (A002 != null) {
            C1M8 c1m8 = C1M8.A01;
            HashMap A1G = AbstractC166987dD.A1G();
            CountDownLatch countDownLatch = new CountDownLatch(3);
            ListenableFuture load = A002.load("face_detection_autogen_frame_selection", 4L);
            C14360o3.A07(load);
            C2OD.A03(new C23549Ac3("FaceDetectorWithBundledImage", "bc_face_detector", A1G, countDownLatch), load, c1m8);
            ListenableFuture load2 = A002.load("face_landmarks_autogen_frame_selection", 5L);
            C14360o3.A07(load2);
            C2OD.A03(new C23549Ac3("E2eLandmarksModel", "bc_landmarks_detector", A1G, countDownLatch), load2, c1m8);
            ListenableFuture load3 = A002.load("blur_autogen_frame_selection", 3L);
            C14360o3.A07(load3);
            C2OD.A03(new C23549Ac3("ModelWithOptimizedSize", "blur_model", A1G, countDownLatch), load3, c1m8);
            countDownLatch.await();
            if (A1G.size() >= 3) {
                return A1G;
            }
            throw new Exception("Failed to download autogen models", null);
        }
        throw new Exception("modelLoader not available", null);
    }
}
