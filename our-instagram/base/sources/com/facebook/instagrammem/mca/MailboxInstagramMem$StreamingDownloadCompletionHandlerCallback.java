package com.facebook.instagrammem.mca;

import X.AbstractC166997dE;
import X.C0K8;
import X.C44991Jvh;
import X.C44992Jvi;
import android.net.Uri;
import com.facebook.msys.mcf.MsysError;

/* loaded from: classes8.dex */
public abstract class MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback {
    private void callbackJNI(Uri uri, MsysError msysError) {
        C44991Jvh c44991Jvh = ((C44992Jvi) this).A00;
        if (msysError == null) {
            synchronized (c44991Jvh) {
                c44991Jvh.A04 = true;
            }
        } else {
            C0K8.A0C("ArmadilloExpressStreamableDownloadResponse", AbstractC166997dE.A0y("Closing due to error: ", msysError));
            C44991Jvh.A00(c44991Jvh);
        }
    }
}
