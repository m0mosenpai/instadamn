package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.FacebookLoggingRequestInfo;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequestBuilder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1T4, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1T4 {
    public static final C1T5 A00 = new Object();
    public static final Charset A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1T5, java.lang.Object] */
    static {
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        C14360o3.A07(forName);
        A01 = forName;
    }

    public static TigonError A00(byte[] bArr, int i) {
        C1T7 c1t7 = new C1T7(bArr, i);
        C1T5 c1t5 = A00;
        return new TigonError(TigonErrorCode.Companion.fromValue(C1T5.A00(c1t7)), c1t5.A02(c1t7), C1T5.A00(c1t7), c1t5.A02(c1t7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C74733Xh A01(byte[] bArr, int i) {
        C74663Xa c74663Xa;
        C114815Gp c114815Gp;
        C114825Gq c114825Gq;
        C74683Xc c74683Xc;
        C74693Xd c74693Xd;
        C74703Xe c74703Xe;
        C74813Xs c74813Xs;
        Object obj;
        Object obj2;
        Object obj3;
        C1SU c1su;
        C1SV c1sv;
        C74713Xf c74713Xf;
        C74723Xg c74723Xg;
        C3Xu c3Xu;
        C1T7 c1t7 = new C1T7(bArr, i);
        C1T5 c1t5 = A00;
        String A02 = c1t5.A02(c1t7);
        boolean z = false;
        if (c1t7.A00() != 0) {
            z = true;
        }
        C85783s7 c85783s7 = null;
        if (z) {
            c74663Xa = new C74663Xa(c1t5.A03(c1t7));
        } else {
            c74663Xa = null;
        }
        if (c1t7.A00() != 0) {
            c114815Gp = new C114815Gp(c1t5.A02(c1t7), c1t5.A02(c1t7));
        } else {
            c114815Gp = null;
        }
        if (c1t7.A00() != 0) {
            c114825Gq = new C114825Gq(C1T5.A01(c1t7));
        } else {
            c114825Gq = null;
        }
        if (c1t7.A00() != 0) {
            int A002 = C1T5.A00(c1t7);
            boolean z2 = false;
            if (c1t7.A00() != 0) {
                z2 = true;
            }
            c74683Xc = new C74683Xc(c1t5.A02(c1t7), A002, C1T5.A01(c1t7), z2);
        } else {
            c74683Xc = null;
        }
        if (c1t7.A00() != 0) {
            long A012 = C1T5.A01(c1t7);
            long A013 = C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            long A014 = C1T5.A01(c1t7);
            long A015 = C1T5.A01(c1t7);
            long A016 = C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            int A003 = C1T5.A00(c1t7);
            C1T5.A01(c1t7);
            C1T5.A01(c1t7);
            boolean z3 = false;
            if (c1t7.A00() != 0) {
                z3 = true;
            }
            c74693Xd = new C74693Xd(A003, A012, A013, A014, A015, A016, z3);
        } else {
            c74693Xd = null;
        }
        if (c1t7.A00() != 0) {
            c74703Xe = new C74703Xe(C1T5.A00(c1t7), c1t5.A03(c1t7));
        } else {
            c74703Xe = null;
        }
        if (c1t7.A00() != 0) {
            c74813Xs = new C74813Xs(c1t5.A03(c1t7));
        } else {
            c74813Xs = null;
        }
        if (c1t7.A00() != 0) {
            final HashMap A03 = c1t5.A03(c1t7);
            obj = new Object(A03) { // from class: X.5Gr
                public final Map A00;

                {
                    this.A00 = A03;
                }
            };
        } else {
            obj = null;
        }
        if (c1t7.A00() != 0) {
            final HashMap A032 = c1t5.A03(c1t7);
            obj2 = new Object(A032) { // from class: X.5Gs
                public final Map A00;

                {
                    this.A00 = A032;
                }
            };
        } else {
            obj2 = null;
        }
        if (c1t7.A00() != 0) {
            final HashMap A033 = c1t5.A03(c1t7);
            obj3 = new Object(A033) { // from class: X.5Gt
                public final Map A00;

                {
                    this.A00 = A033;
                }
            };
        } else {
            obj3 = null;
        }
        if (c1t7.A00() != 0) {
            c1su = A02(c1t7);
        } else {
            c1su = null;
        }
        if (c1t7.A00() != 0) {
            c1sv = new C1SV(c1t5.A03(c1t7));
        } else {
            c1sv = null;
        }
        if (c1t7.A00() != 0) {
            int A004 = C1T5.A00(c1t7);
            HashMap hashMap = new HashMap(A004);
            for (int i2 = 0; i2 < A004; i2++) {
                hashMap.put(c1t5.A02(c1t7), Long.valueOf(C1T5.A01(c1t7)));
            }
            int A005 = C1T5.A00(c1t7);
            HashMap hashMap2 = new HashMap(A005);
            for (int i3 = 0; i3 < A005; i3++) {
                hashMap2.put(c1t5.A02(c1t7), Long.valueOf(C1T5.A01(c1t7)));
            }
            HashMap A034 = c1t5.A03(c1t7);
            int A006 = C1T5.A00(c1t7);
            HashMap hashMap3 = new HashMap(A006);
            for (int i4 = 0; i4 < A006; i4++) {
                String A022 = c1t5.A02(c1t7);
                boolean z4 = false;
                if (c1t7.A00() != 0) {
                    z4 = true;
                }
                hashMap3.put(A022, Boolean.valueOf(z4));
            }
            c74713Xf = new C74713Xf(hashMap, hashMap2, A034, hashMap3);
        } else {
            c74713Xf = null;
        }
        if (c1t7.A00() != 0) {
            c1t5.A02(c1t7);
            c74723Xg = new C74723Xg(C1T5.A00(c1t7), c1t5.A03(c1t7));
        } else {
            c74723Xg = null;
        }
        if (c1t7.A00() != 0) {
            c1t5.A02(c1t7);
            c1t5.A02(c1t7);
            c1t5.A02(c1t7);
            int A007 = C1T5.A00(c1t7);
            ArrayList arrayList = new ArrayList(A007);
            for (int i5 = 0; i5 < A007; i5++) {
                long A017 = C1T5.A01(c1t7);
                byte A008 = c1t7.A00();
                boolean z5 = false;
                if (c1t7.A00() != 0) {
                    z5 = true;
                }
                arrayList.add(new C54518O6v(new C1S0(A008, z5), A017));
            }
            c3Xu = new C3Xu(arrayList);
        } else {
            c3Xu = null;
        }
        if (c1t7.A00() != 0) {
            c85783s7 = new C85783s7(C1T5.A01(c1t7));
        }
        return new C74733Xh(obj2, c74813Xs, c114825Gq, c74703Xe, obj3, obj, c74713Xf, c3Xu, c85783s7, c74723Xg, c74663Xa, c74693Xd, c74683Xc, c114815Gp, c1su, c1sv, A02);
    }

    public static C1SU A02(C1T7 c1t7) {
        C1T5 c1t5 = A00;
        return new C1SU(c1t5.A02(c1t7), c1t5.A02(c1t7), c1t5.A02(c1t7), c1t5.A02(c1t7), C1T5.A01(c1t7), C1T5.A01(c1t7), C1T5.A01(c1t7));
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [com.facebook.tigon.iface.RedirectRequestInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.1SW, java.lang.Object] */
    public static TigonRequestBuilder.TigonRequestImpl A03(byte[] bArr, int i) {
        FacebookLoggingRequestInfo facebookLoggingRequestInfo;
        C1SR c1sr;
        C9BW c9bw;
        Object obj;
        C1ST c1st;
        C1SU c1su;
        C1SV c1sv;
        C26861Rw c26861Rw;
        C1T7 c1t7 = new C1T7(bArr, i);
        C1T5 c1t5 = A00;
        String A02 = c1t5.A02(c1t7);
        String A022 = c1t5.A02(c1t7);
        HashMap A03 = c1t5.A03(c1t7);
        byte A002 = c1t7.A00();
        byte A003 = c1t7.A00();
        boolean z = false;
        if (c1t7.A00() != 0) {
            z = true;
        }
        C1S0 c1s0 = new C1S0(A003, z);
        boolean z2 = false;
        if (c1t7.A00() != 0) {
            z2 = true;
        }
        boolean z3 = false;
        if (c1t7.A00() != 0) {
            z3 = true;
        }
        long A012 = C1T5.A01(c1t7);
        long A013 = C1T5.A01(c1t7);
        long A014 = C1T5.A01(c1t7);
        long A015 = C1T5.A01(c1t7);
        EnumC26881Rz enumC26881Rz = (EnumC26881Rz) EnumC26881Rz.A01.get(Integer.valueOf(C1T5.A00(c1t7)));
        if (enumC26881Rz == null) {
            enumC26881Rz = EnumC26881Rz.A0D;
        }
        String A023 = c1t5.A02(c1t7);
        int A004 = C1T5.A00(c1t7);
        long A016 = C1T5.A01(c1t7);
        boolean z4 = false;
        if (c1t7.A00() != 0) {
            z4 = true;
        }
        boolean z5 = false;
        if (z4) {
            facebookLoggingRequestInfo = new FacebookLoggingRequestInfo(c1t5.A02(c1t7), c1t5.A02(c1t7), c1t5.A02(c1t7));
        } else {
            facebookLoggingRequestInfo = null;
        }
        if (c1t7.A00() != 0) {
            c1sr = new C1SR(C1T5.A00(c1t7), C1T5.A00(c1t7), C1T5.A00(c1t7), C1T5.A00(c1t7));
        } else {
            c1sr = null;
        }
        if (c1t7.A00() != 0) {
            c9bw = new C9BW(0, new C1S5(c1t5.A02(c1t7), c1t5.A03(c1t7)), c1t5.A03(c1t7));
        } else {
            c9bw = null;
        }
        if (c1t7.A00() != 0) {
            boolean z6 = false;
            if (c1t7.A00() != 0) {
                z6 = true;
            }
            int A005 = C1T5.A00(c1t7);
            ?? obj2 = new Object();
            obj2.A01 = z6;
            obj2.A00 = A005;
            obj = obj2;
        } else {
            obj = null;
        }
        if (c1t7.A00() != 0) {
            HashMap A032 = c1t5.A03(c1t7);
            boolean z7 = false;
            if (c1t7.A00() != 0) {
                z7 = true;
            }
            boolean z8 = false;
            if (c1t7.A00() != 0) {
                z8 = true;
            }
            c1st = new C1ST(c1t5.A02(c1t7), A032, z7, z8);
        } else {
            c1st = null;
        }
        if (c1t7.A00() != 0) {
            c1su = A02(c1t7);
        } else {
            c1su = null;
        }
        if (c1t7.A00() != 0) {
            c1sv = new C1SV(c1t5.A03(c1t7));
        } else {
            c1sv = null;
        }
        if (c1t7.A00() != 0) {
            c26861Rw = new C26861Rw(c1t5.A03(c1t7));
        } else {
            c26861Rw = null;
        }
        if (c1t7.A00() != 0) {
            boolean z9 = false;
            if (c1t7.A00() != 0) {
                z9 = true;
            }
            String A024 = c1t5.A02(c1t7);
            String A025 = c1t5.A02(c1t7);
            String A026 = c1t5.A02(c1t7);
            String A027 = c1t5.A02(c1t7);
            String A028 = c1t5.A02(c1t7);
            ?? obj3 = new Object();
            obj3.A05 = z9;
            obj3.A02 = A024;
            obj3.A03 = A025;
            obj3.A04 = A026;
            obj3.A01 = A027;
            obj3.A00 = A028;
            z5 = obj3;
        }
        TigonRequestBuilder tigonRequestBuilder = new TigonRequestBuilder(A02, A022);
        tigonRequestBuilder.addHeaders(A03);
        tigonRequestBuilder.mTigonPriority = A002;
        tigonRequestBuilder.mHttpPriority = c1s0;
        tigonRequestBuilder.mRetryable = z2;
        tigonRequestBuilder.mReplaySafe = z3;
        if (A012 >= 0) {
            tigonRequestBuilder.mConnectionTimeoutMS = A012;
            if (A013 >= 0) {
                tigonRequestBuilder.mIdleTimeoutMS = A013;
                if (A014 >= 0) {
                    tigonRequestBuilder.mRequestTimeoutMS = A014;
                    tigonRequestBuilder.mExpectedResponseSizeBytes = A015;
                    tigonRequestBuilder.mRequestCategory = enumC26881Rz;
                    tigonRequestBuilder.mLoggingId = A023;
                    tigonRequestBuilder.mStartupStatusOnAdded = A004;
                    tigonRequestBuilder.mAddedToMiddlewareSinceEpochMS = A016;
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A01, facebookLoggingRequestInfo);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A06, c1sr);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A02, c9bw);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A03, obj);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A07, c1st);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A00, c1su);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A04, c1sv);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A05, c26861Rw);
                    tigonRequestBuilder.mLayerInformation.put(C1S2.A08, z5);
                    return new TigonRequestBuilder.TigonRequestImpl(tigonRequestBuilder);
                }
                throw new IllegalArgumentException("RequestTimeout should be nonzero.");
            }
            throw new IllegalArgumentException("IdleTimeout should be nonzero.");
        }
        throw new IllegalArgumentException("ConnectionTimeout should be nonzero.");
    }
}
