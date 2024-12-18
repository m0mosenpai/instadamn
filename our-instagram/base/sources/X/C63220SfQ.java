package X;

import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.SfQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63220SfQ {
    public static final Logger A00;
    public static final C63220SfQ A01;

    public void A07(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r2 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r2)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
            java.lang.String r0 = java.lang.System.getProperty(r2)
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 == 0) goto L30
            int r1 = X.C65163Tec.A01()     // Catch: java.lang.ReflectiveOperationException -> L30
            r0 = 29
            if (r1 < r0) goto L30
            java.lang.String r0 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L30
            X.TeY r1 = new X.TeY     // Catch: java.lang.ReflectiveOperationException -> L30
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L30
            goto L6a
        L30:
            X.Tec r1 = X.C65163Tec.A02()
            if (r1 != 0) goto L6a
            java.lang.String r0 = "No platform found on Android"
            java.lang.NullPointerException r0 = X.AbstractC166987dD.A15(r0)
            throw r0
        L3d:
            java.lang.String r2 = "okhttp.platform"
            r1 = 0
            byte[] r0 = X.AbstractC63404SjZ.A07
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.security.AccessControlException -> L49
            if (r0 == 0) goto L49
            r1 = r0
        L49:
            java.lang.String r0 = "conscrypt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            java.security.Provider[] r1 = java.security.Security.getProviders()
            r0 = 0
            r0 = r1[r0]
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "Conscrypt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
        L64:
            X.Teb r1 = X.C65162Teb.A01()
            if (r1 == 0) goto L75
        L6a:
            X.C63220SfQ.A01 = r1
            java.lang.Class<X.TIY> r0 = X.TIY.class
            java.util.logging.Logger r0 = X.AbstractC58319PtB.A17(r0)
            X.C63220SfQ.A00 = r0
            return
        L75:
            java.lang.Class<javax.net.ssl.SSLParameters> r2 = javax.net.ssl.SSLParameters.class
            java.lang.String r1 = "setApplicationProtocols"
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L91
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L91
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r0 = "getApplicationProtocol"
            java.lang.reflect.Method r0 = X.AbstractC58318PtA.A0t(r1, r0)     // Catch: java.lang.NoSuchMethodException -> L91
            X.TeZ r1 = new X.TeZ     // Catch: java.lang.NoSuchMethodException -> L91
            r1.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L91
            goto L6a
        L91:
            r5 = 0
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN"
            r1 = 1
            java.lang.Class r3 = java.lang.Class.forName(r2, r1, r5)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r0 = "$Provider"
            java.lang.String r0 = X.AnonymousClass001.A0R(r2, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.Class r4 = java.lang.Class.forName(r0, r1, r5)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r0 = "$ClientProvider"
            java.lang.String r0 = X.AnonymousClass001.A0R(r2, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.Class r6 = java.lang.Class.forName(r0, r1, r5)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r0 = "$ServerProvider"
            java.lang.String r0 = X.AnonymousClass001.A0R(r2, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.Class r7 = java.lang.Class.forName(r0, r1, r5)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "put"
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r4}     // Catch: java.lang.Throwable -> Lde
            java.lang.reflect.Method r8 = r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "get"
            java.lang.Class[] r0 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> Lde
            java.lang.reflect.Method r9 = r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> Lde
            java.lang.String r1 = "remove"
            java.lang.Class[] r0 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> Lde
            java.lang.reflect.Method r10 = r3.getMethod(r1, r0)     // Catch: java.lang.Throwable -> Lde
            X.Tea r1 = new X.Tea     // Catch: java.lang.Throwable -> Lde
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lde
            goto L6a
        Lde:
            X.SfQ r1 = new X.SfQ
            r1.<init>()
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63220SfQ.<clinit>():void");
    }

    public final void A03(String str, Throwable th, int i) {
        Level level;
        int min;
        if (this instanceof C65163Tec) {
            int i2 = 5;
            if (i != 5) {
                i2 = 3;
            }
            if (th != null) {
                str = AnonymousClass001.A0T(str, android.util.Log.getStackTraceString(th), '\n');
            }
            int i3 = 0;
            int length = str.length();
            while (i3 < length) {
                int indexOf = str.indexOf(10, i3);
                if (indexOf == -1) {
                    indexOf = length;
                }
                do {
                    min = Math.min(indexOf, i3 + CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
                    android.util.Log.println(i2, "OkHttp", str.substring(i3, min));
                    i3 = min;
                } while (min < indexOf);
                i3 = min + 1;
            }
            return;
        }
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        A00.log(level, str, th);
    }

    public String A04(SSLSocket sSLSocket) {
        if (this instanceof C65160TeZ) {
            try {
                String str = (String) ((C65160TeZ) this).A00.invoke(sSLSocket, AbstractC58318PtA.A1b());
                if (str != null) {
                    if (str.equals("")) {
                        return null;
                    }
                    return str;
                }
            } catch (IllegalAccessException unused) {
                throw AbstractC58318PtA.A0W("failed to get ALPN selected protocol");
            } catch (InvocationTargetException e) {
                if (!(e.getCause() instanceof UnsupportedOperationException)) {
                    throw AbstractC58318PtA.A0W("failed to get ALPN selected protocol");
                }
            }
            return null;
        }
        if (this instanceof C65161Tea) {
            try {
                C64739TRx c64739TRx = (C64739TRx) Proxy.getInvocationHandler(((C65161Tea) this).A02.invoke(null, sSLSocket));
                boolean z = c64739TRx.A01;
                if (!z && c64739TRx.A00 == null) {
                    A01.A03("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null, 4);
                    return null;
                }
                if (z) {
                    return null;
                }
                return c64739TRx.A00;
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                throw AbstractC58318PtA.A0W("failed to get ALPN selected protocol");
            }
        }
        if (this instanceof C65163Tec) {
            C65163Tec c65163Tec = (C65163Tec) this;
            if (!c65163Tec.A00.isInstance(sSLSocket)) {
                return null;
            }
            try {
                byte[] bArr = (byte[]) c65163Tec.A01.invoke(sSLSocket, AbstractC58318PtA.A1b());
                if (bArr == null) {
                    return null;
                }
                return AbstractC58318PtA.A0m(StandardCharsets.UTF_8, bArr);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw AbstractC58318PtA.A0W(e2);
            }
        }
        return null;
    }

    public SSLContext A05() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.TWX, java.lang.Object] */
    public void A06(String str, List list, SSLSocket sSLSocket) {
        if (this instanceof C65160TeZ) {
            C65160TeZ c65160TeZ = (C65160TeZ) this;
            try {
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                ArrayList A002 = A00(list);
                c65160TeZ.A01.invoke(sSLParameters, A002.toArray(new String[A002.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw AbstractC58318PtA.A0W("failed to set SSL parameters");
            }
        }
        if (this instanceof C65161Tea) {
            C65161Tea c65161Tea = (C65161Tea) this;
            try {
                c65161Tea.A03.invoke(null, sSLSocket, Proxy.newProxyInstance(C63220SfQ.class.getClassLoader(), new Class[]{c65161Tea.A00, c65161Tea.A01}, new C64739TRx(A00(list))));
                return;
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                throw AbstractC58318PtA.A0W("failed to set ALPN");
            }
        }
        if (this instanceof C65163Tec) {
            C65163Tec c65163Tec = (C65163Tec) this;
            if (c65163Tec.A00.isInstance(sSLSocket)) {
                if (str != null) {
                    try {
                        c65163Tec.A04.invoke(sSLSocket, true);
                        c65163Tec.A03.invoke(sSLSocket, str);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw AbstractC58318PtA.A0W(e);
                    }
                }
                Method method = c65163Tec.A02;
                ?? obj = new Object();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    if (obj2 != EnumC61215RhF.HTTP_1_0) {
                        String obj3 = obj2.toString();
                        obj.A0B(obj3.length());
                        obj.A0G(obj3, 0, obj3.length());
                    }
                }
                try {
                    method.invoke(sSLSocket, obj.E7v(obj.A00));
                } catch (EOFException e2) {
                    throw AbstractC58318PtA.A0W(e2);
                }
            }
        }
    }

    public AbstractC61529Rp5 A08(X509TrustManager x509TrustManager) {
        InterfaceC65462TkY twt;
        if (this instanceof C65163Tec) {
            try {
                Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
                declaredMethod.setAccessible(true);
                twt = new TWU(declaredMethod, x509TrustManager);
            } catch (NoSuchMethodException unused) {
                twt = new TWT(x509TrustManager.getAcceptedIssuers());
            }
        } else {
            twt = new TWT(x509TrustManager.getAcceptedIssuers());
        }
        return new C65164Ted(twt);
    }

    public static ArrayList A00(List list) {
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != EnumC61215RhF.HTTP_1_0) {
                AbstractC166997dE.A1S(obj, A0q);
            }
        }
        return A0q;
    }

    public final String toString() {
        return AbstractC31173DnH.A0q(this);
    }
}
