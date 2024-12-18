package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.DataTaskListener;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.60t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1334960t {
    public final DataTaskListener A00;
    public final Map A03 = new ConcurrentHashMap();
    public final Map A02 = new ConcurrentHashMap();
    public final C1O3 A01 = new C1O3(new C1O4(100));

    public C1334960t(final C1JP c1jp) {
        this.A00 = new DataTaskListener() { // from class: X.60u
            @Override // com.facebook.msys.mci.DataTaskListener
            public final void onCancelDataTask(String str, NetworkSession networkSession) {
                InterfaceC27201Tu interfaceC27201Tu;
                C1334960t c1334960t = this;
                C126435ne c126435ne = (C126435ne) c1334960t.A03.remove(str);
                if (c126435ne != null) {
                    C126435ne.A00(c126435ne);
                    interfaceC27201Tu = c126435ne.A04;
                } else {
                    interfaceC27201Tu = (InterfaceC27201Tu) c1334960t.A02.remove(str);
                    if (interfaceC27201Tu == null) {
                        return;
                    }
                }
                interfaceC27201Tu.cancel();
            }

            @Override // com.facebook.msys.mci.DataTaskListener
            public final void onNewTask(final DataTask dataTask, final NetworkSession networkSession) {
                FileInputStream fileInputStream;
                int i = dataTask.mTaskType;
                if (i == 4) {
                    try {
                        C1334960t c1334960t = this;
                        c1334960t.A03.put(dataTask.mTaskIdentifier, new C126435ne(dataTask, networkSession, c1jp, c1334960t));
                        return;
                    } catch (IOException e) {
                        C0K8.A0K("IgNetworkSession", "Failed to create StreamingUploadDataTask", e);
                        throw new RejectedExecutionException("Failed to create StreamingUploadDataTask", e);
                    }
                }
                if (i == 3) {
                    String str = dataTask.mContentUrl;
                    if (str == null) {
                        C0K8.A0E("IgNetworkSession", "Null content url provided for upload task");
                        String str2 = dataTask.mTaskCategory;
                        String str3 = dataTask.mTaskIdentifier;
                        int i2 = dataTask.mTaskType;
                        UrlRequest urlRequest = dataTask.mUrlRequest;
                        NetworkUtils networkUtils = NetworkUtils.$redex_init_class;
                        UrlResponse urlResponse = UrlResponse.$redex_init_class;
                        networkSession.markDataTaskAsCompletedCallback(str2, str3, i2, new UrlResponse(urlRequest, 0, new HashMap()), null, null, new IOException("Null content url provided for upload task"));
                        return;
                    }
                    String replaceFirst = str.replaceFirst("file://", "");
                    try {
                        fileInputStream = new FileInputStream(new File(replaceFirst));
                    } catch (FileNotFoundException e2) {
                        C0K8.A0L("IgNetworkSession", "Unable to find file %s on system", e2, replaceFirst);
                        String str4 = dataTask.mTaskCategory;
                        String str5 = dataTask.mTaskIdentifier;
                        int i3 = dataTask.mTaskType;
                        UrlRequest urlRequest2 = dataTask.mUrlRequest;
                        NetworkUtils networkUtils2 = NetworkUtils.$redex_init_class;
                        UrlResponse urlResponse2 = UrlResponse.$redex_init_class;
                        networkSession.markDataTaskAsCompletedCallback(str4, str5, i3, new UrlResponse(urlRequest2, 0, new HashMap()), null, null, new IOException(StringFormatUtil.formatStrLocaleSafe("Unable to find file %s on system", replaceFirst), e2));
                        return;
                    }
                } else {
                    fileInputStream = null;
                }
                C1JP c1jp2 = c1jp;
                File cacheDir = AbstractC12290kX.A00.getCacheDir();
                InterfaceC126575nt interfaceC126575nt = new InterfaceC126575nt() { // from class: X.5ns
                    @Override // X.InterfaceC126575nt
                    public final C69224Vjs AET(long j) {
                        return new C69224Vjs(networkSession, DataTask.this.mTaskIdentifier, j);
                    }
                };
                C1334960t c1334960t2 = this;
                c1334960t2.A02.put(dataTask.mTaskIdentifier, AbstractC126595nv.A00(dataTask, c1jp2, interfaceC126575nt, new C126585nu(dataTask, networkSession, c1jp2, c1334960t2), cacheDir, fileInputStream));
            }

            @Override // com.facebook.msys.mci.DataTaskListener
            public final void onUpdateStreamingDataTask(byte[] bArr, String str, NetworkSession networkSession) {
                C126435ne c126435ne = (C126435ne) this.A03.get(str);
                if (c126435ne != null) {
                    C14120nc.A00().ATO(new C68010V6c(this, c126435ne, bArr));
                }
            }
        };
    }
}
