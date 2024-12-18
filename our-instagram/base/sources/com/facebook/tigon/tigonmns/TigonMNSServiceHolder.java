package com.facebook.tigon.tigonmns;

import X.AbstractC229319v;
import X.C09170dP;
import X.C09530e4;
import X.C14360o3;
import X.C1FL;
import X.ThreadFactoryC23951Ff;
import com.facebook.jni.HybridData;
import com.facebook.mobilenetwork.DomainInfoUtils;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.tigon.tigonmns.TigonMNSServiceHolder;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TigonMNSServiceHolder extends TigonServiceHolder {
    public static final C1FL Companion = new Object();
    public final Thread evThread;
    public String proxyHost;
    public int proxyPort;
    public final boolean useMNSForDevserver;
    public final boolean useMNSProxy;

    /* loaded from: classes.dex */
    public interface TigonMNSUnexpectedErrorReporter {
        void report(String str, String str2);
    }

    public static final native HybridData initHybrid(TigonMNSConfig tigonMNSConfig, String str, long j, HucClient hucClient, TigonMNSTokenBindingCallbacks tigonMNSTokenBindingCallbacks);

    private final native void preconnect(String str);

    public static final void registerUnexpectedErrorHandler(TigonMNSUnexpectedErrorReporter tigonMNSUnexpectedErrorReporter) {
        C14360o3.A0B(tigonMNSUnexpectedErrorReporter, 0);
        registerUnexpectedErrorHandlerNative(tigonMNSUnexpectedErrorReporter);
    }

    public static final native void registerUnexpectedErrorHandlerNative(TigonMNSUnexpectedErrorReporter tigonMNSUnexpectedErrorReporter);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void runEVLoop();

    private final native void setJavaHolderNative(TigonMNSServiceHolder tigonMNSServiceHolder);

    private final native void setProxyHostAndPortNative(String str, int i, String str2);

    public final native String generateBugReport();

    public final String getRequestUnsupportedReason(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        URI create = URI.create(str);
        C14360o3.A07(create);
        return (String) isRequestSupported(create, str2).A01;
    }

    public final C09530e4 isRequestSupported(URI uri, String str) {
        boolean z;
        String str2;
        C14360o3.A0B(uri, 0);
        if (!AbstractC229319v.A00()) {
            String host = uri.getHost();
            if (host != null) {
                if (!DomainInfoUtils.isFbInfraDomainNative(host)) {
                    z = false;
                    str2 = "Not a Meta domain";
                } else if (DomainInfoUtils.isDevserverOrOnDemandServerDomainNative(uri.getHost()) && !this.useMNSForDevserver) {
                    z = false;
                    str2 = "Sandbox URL";
                } else if ((System.getProperty("http.proxyHost") != null || System.getProperty("https.proxyHost") != null) && !this.useMNSProxy) {
                    z = false;
                    str2 = "HTTP proxy configured";
                }
                return new C09530e4(z, str2);
            }
            throw new IllegalStateException("Required value was null.");
        }
        return new C09530e4(true, "");
    }

    public final boolean setInAppProxyHostAndPortIfSystemProxyIsNotSet(String str, int i, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        String property = System.getProperty("https.proxyHost");
        Integer integer = Integer.getInteger("https.proxyPort");
        if (property != null && property.length() != 0 && integer != null) {
            return false;
        }
        String property2 = System.getProperty("http.proxyHost");
        Integer integer2 = Integer.getInteger("http.proxyPort");
        if (property2 != null && property2.length() != 0 && integer2 != null) {
            return false;
        }
        setProxyHostAndPortNative(str, i, str2);
        return true;
    }

    public final void setProxyHostAndPort(String str, int i) {
        C14360o3.A0B(str, 0);
        if (this.useMNSProxy) {
            if (str.equals(this.proxyHost) && i == this.proxyPort) {
                return;
            }
            this.proxyHost = str;
            this.proxyPort = i;
            setProxyHostAndPortNative(str, i, null);
        }
    }

    public final void validateRequestURL(URI uri) {
        C14360o3.A0B(uri, 0);
        if (uri.getHost() != null) {
            if (uri.isAbsolute()) {
                return;
            } else {
                throw new IOException("URL has non absolute path");
            }
        }
        throw new IOException("URL has no host");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1FL] */
    static {
        C09170dP.A0C("tigonmns-jni");
        C09170dP.A0C("mnscertificateverifier");
    }

    public /* synthetic */ TigonMNSServiceHolder(TigonMNSConfig tigonMNSConfig, String str, long j, HucClient hucClient, TigonMNSTokenBindingCallbacks tigonMNSTokenBindingCallbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tigonMNSConfig, str, j, hucClient, (i & 16) != 0 ? null : tigonMNSTokenBindingCallbacks);
    }

    private final void setJavaHolder() {
        setJavaHolderNative(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonMNSServiceHolder(TigonMNSConfig tigonMNSConfig, String str, long j, HucClient hucClient, TigonMNSTokenBindingCallbacks tigonMNSTokenBindingCallbacks) {
        super(initHybrid(tigonMNSConfig, str, j, hucClient, tigonMNSTokenBindingCallbacks));
        C14360o3.A0B(tigonMNSConfig, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(hucClient, 4);
        setJavaHolderNative(this);
        Thread newThread = new ThreadFactoryC23951Ff(tigonMNSConfig.eventLoopThreadPriority).newThread(new Runnable() { // from class: X.1Fg
            @Override // java.lang.Runnable
            public final void run() {
                TigonMNSServiceHolder.this.runEVLoop();
            }
        });
        this.evThread = newThread;
        newThread.start();
        this.useMNSProxy = tigonMNSConfig.useMnsProxy;
        this.useMNSForDevserver = tigonMNSConfig.useMNSForDevserver;
        this.proxyHost = "";
        this.proxyPort = 0;
        Iterator it = tigonMNSConfig.preconnectHosts.iterator();
        while (it.hasNext()) {
            preconnect((String) it.next());
        }
    }
}
