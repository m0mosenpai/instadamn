package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.common.collect.EvictingQueue;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.5GO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GO implements InterfaceC449925e, InterfaceC13050lr {
    public static final SimpleDateFormat A02 = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss", Locale.US);
    public final EvictingQueue A00 = new EvictingQueue(50);
    public final C13920nI A01 = C13920nI.A00;

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        StringWriter stringWriter = new StringWriter();
        Iterator it = this.A00.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C72735Xm7 c72735Xm7 = (C72735Xm7) it.next();
            stringWriter.append((CharSequence) A02.format(new Date(c72735Xm7.A00))).append((CharSequence) " ").append((CharSequence) c72735Xm7.A01);
            stringWriter.append('\n');
        }
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "interaction_logs";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "FeedInteractionObserverLogCollector";
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.clear();
        }
    }
}
