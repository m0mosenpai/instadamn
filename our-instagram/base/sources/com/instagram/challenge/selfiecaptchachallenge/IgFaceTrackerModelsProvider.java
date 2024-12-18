package com.instagram.challenge.selfiecaptchachallenge;

import X.AbstractC12990ll;
import X.C14360o3;
import X.C22863A6j;
import X.C23314AUz;
import X.C70220WId;
import X.C85R;
import X.EnumC142606cM;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class IgFaceTrackerModelsProvider implements FaceTrackerModelsProvider {
    public static final Parcelable.Creator CREATOR = new C70220WId(98);
    public AbstractC12990ll A00;

    @Override // com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider
    public final Map BUU(Context context) {
        C14360o3.A0B(context, 0);
        AbstractC12990ll abstractC12990ll = this.A00;
        C14360o3.A0B(abstractC12990ll, 1);
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C85R.A00(context, abstractC12990ll).A01(new C23314AUz(countDownLatch, atomicReference), EnumC142606cM.A01);
        try {
            countDownLatch.await();
            C22863A6j c22863A6j = (C22863A6j) atomicReference.get();
            if (c22863A6j != null) {
                Map map = c22863A6j.A01;
                if (map == null) {
                    Exception exc = c22863A6j.A00;
                    if (exc != null) {
                        throw new Exception("Model load failed.", exc);
                    }
                    throw new Exception("Model load failed due to an unspecified cause.", null);
                }
                return map;
            }
            throw new Exception("Model load failed due to an unspecified error.", null);
        } catch (InterruptedException e) {
            throw new Exception("Model load was interrupted.", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00.getToken());
    }
}
