package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.25c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C449725c implements InterfaceC449925e {
    public static final SimpleDateFormat A03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    public C74513Wj A00;
    public final List A02 = new ArrayList();
    public final Object A01 = new Object();

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public static final void A00(C449725c c449725c) {
        synchronized (c449725c.A01) {
            C74513Wj c74513Wj = c449725c.A00;
            if (c74513Wj != null) {
                c449725c.A02.add(0, c74513Wj);
            }
            c449725c.A00 = null;
        }
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        StringWriter stringWriter = new StringWriter();
        ArrayList arrayList = new ArrayList();
        synchronized (this.A01) {
            C74513Wj c74513Wj = this.A00;
            if (c74513Wj != null) {
                arrayList.add(c74513Wj);
            }
            arrayList.addAll(this.A02);
        }
        int size = arrayList.size();
        if (size > 50) {
            size = 50;
        }
        for (int i = 0; i < size; i++) {
            C74513Wj c74513Wj2 = (C74513Wj) arrayList.get(i);
            stringWriter.append((CharSequence) A03.format(new Date(c74513Wj2.A05))).append(' ').append((CharSequence) c74513Wj2.A08);
            if (c74513Wj2.A01 > 0) {
                stringWriter.append(' ').append((CharSequence) String.valueOf(c74513Wj2.A01));
            }
            if (c74513Wj2.A02 > 0) {
                stringWriter.append(' ').append((CharSequence) String.valueOf(c74513Wj2.A02)).append((CharSequence) "ms");
            }
            if (c74513Wj2.A00 > 0) {
                stringWriter.append((CharSequence) " items=").append((CharSequence) String.valueOf(c74513Wj2.A00));
            }
            String str = c74513Wj2.A04;
            if (str != null) {
                stringWriter.append((CharSequence) " error=").append((CharSequence) str);
            }
            String str2 = c74513Wj2.A03;
            if (str2 != null) {
                stringWriter.append((CharSequence) " body=\"").append((CharSequence) str2).append('\"');
            }
            stringWriter.append((CharSequence) " request_id=").append((CharSequence) c74513Wj2.A06).append((CharSequence) " session_id=").append((CharSequence) c74513Wj2.A07);
            stringWriter.append('\n');
        }
        String obj = stringWriter.toString();
        C14360o3.A07(obj);
        return obj;
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "FeedRequestsLogCollector";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "feed_requests";
    }
}
