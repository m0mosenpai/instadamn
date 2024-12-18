package X;

import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126425nd extends AbstractRunnableC94874Os {
    public final /* synthetic */ AbstractC115105If A00;
    public final /* synthetic */ C126585nu A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126425nd(AbstractC115105If abstractC115105If, C126585nu c126585nu) {
        super("performDataTask");
        this.A01 = c126585nu;
        this.A00 = abstractC115105If;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.File] */
    @Override // java.lang.Runnable
    public final void run() {
        IOException iOException;
        try {
            C126585nu c126585nu = this.A01;
            DataTask dataTask = c126585nu.A00;
            String str = dataTask.mTaskCategory;
            String str2 = dataTask.mTaskIdentifier;
            int i = dataTask.mTaskType;
            AbstractC115105If abstractC115105If = this.A00;
            ?? r2 = abstractC115105If instanceof C115115Ig;
            if (r2 != 0) {
                try {
                    Object A00 = abstractC115105If.A00();
                    A00.getClass();
                    C126415nc c126415nc = (C126415nc) A00;
                    r2 = c126415nc.A01;
                    try {
                        boolean z = true;
                        if (dataTask.mTaskType != 0 || dataTask.mTaskMode != 1) {
                            z = false;
                        }
                        String str3 = null;
                        if (z) {
                            c126585nu.A01.markDataTaskStreamingCompletedCallback(str, str2, c126415nc.A00, null);
                        } else {
                            NetworkSession networkSession = c126585nu.A01;
                            UrlResponse urlResponse = c126415nc.A00;
                            byte[] bArr = c126415nc.A02;
                            if (r2 != 0) {
                                str3 = r2.getCanonicalPath();
                            }
                            networkSession.markDataTaskAsCompletedCallback(str, str2, i, urlResponse, bArr, str3, null);
                        }
                    } catch (IOException e) {
                        C0K8.A0F("IgNetworkSession", "IOException while executing markDataTaskCompleted", e);
                        if (dataTask.mTaskType == 0 && dataTask.mTaskMode == 1) {
                            c126585nu.A01.markDataTaskStreamingCompletedCallback(str, str2, c126415nc.A00, e);
                        } else {
                            c126585nu.A01.markDataTaskAsCompletedCallback(str, str2, i, c126415nc.A00, c126415nc.A02, null, e);
                        }
                    }
                    if (r2 != 0) {
                        r2.delete();
                    }
                } catch (Throwable th) {
                    if (r2 != 0) {
                        r2.delete();
                    }
                    throw th;
                }
            } else {
                Throwable A01 = abstractC115105If.A01();
                A01.getClass();
                NetworkSession networkSession2 = c126585nu.A01;
                UrlRequest urlRequest = dataTask.mUrlRequest;
                NetworkUtils networkUtils = NetworkUtils.$redex_init_class;
                UrlResponse urlResponse2 = UrlResponse.$redex_init_class;
                UrlResponse urlResponse3 = new UrlResponse(urlRequest, 0, new HashMap());
                if (A01 instanceof IOException) {
                    iOException = (IOException) A01;
                } else {
                    iOException = new IOException(A01);
                }
                networkSession2.markDataTaskAsCompletedCallback(str, str2, i, urlResponse3, null, null, iOException);
            }
            String str4 = dataTask.mTaskIdentifier;
            C1334960t c1334960t = c126585nu.A03;
            C126435ne c126435ne = (C126435ne) c1334960t.A03.remove(str4);
            if (c126435ne != null) {
                C126435ne.A00(c126435ne);
            }
            c1334960t.A02.remove(str4);
        } catch (Throwable th2) {
            C126585nu c126585nu2 = this.A01;
            String str5 = c126585nu2.A00.mTaskIdentifier;
            C1334960t c1334960t2 = c126585nu2.A03;
            C126435ne c126435ne2 = (C126435ne) c1334960t2.A03.remove(str5);
            if (c126435ne2 != null) {
                C126435ne.A00(c126435ne2);
            }
            c1334960t2.A02.remove(str5);
            throw th2;
        }
    }
}
