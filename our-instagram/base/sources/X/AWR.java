package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AWR implements FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler {
    public final /* synthetic */ C201558vk A00;
    public final /* synthetic */ C177807vE A01;

    public AWR(C201558vk c201558vk, C177807vE c177807vE) {
        this.A00 = c201558vk;
        this.A01 = c177807vE;
    }

    @Override // com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler
    public final void handleLoadError(String str) {
        long j;
        IOException iOException = new IOException(str);
        HashMap hashMap = this.A01.A0I;
        StringBuilder A11 = AbstractC166997dE.A11("onFaceTrackerLoadModelFailed");
        Iterator A0l = AbstractC167007dF.A0l(hashMap);
        while (A0l.hasNext()) {
            Object next = A0l.next();
            String str2 = (String) hashMap.get(next);
            if (str2 != null) {
                File A112 = AbstractC166987dD.A11(str2);
                if (A112.exists()) {
                    j = A112.length();
                } else {
                    j = 0;
                }
            } else {
                j = -1;
            }
            A11.append(" ");
            A11.append((String) hashMap.get(next));
            A11.append(":");
            A11.append(j);
        }
        String obj = A11.toString();
        String A00 = AbstractC58317Pt9.A00(559);
        C14360o3.A0A(obj);
        AbstractC12120kG.A07(A00, obj, iOException);
    }
}
