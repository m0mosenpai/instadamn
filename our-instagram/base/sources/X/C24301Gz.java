package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.1Gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24301Gz extends C19Q {
    public static C24301Gz A05;
    public final InterfaceC24271Gw A00;
    public final C24211Gq A01;
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final Map A02 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());

    public static void A00() {
        C24301Gz c24301Gz = A05;
        if (c24301Gz != null) {
            c24301Gz.A00.clear();
        }
    }

    public final void A01(C26511Qg c26511Qg, C1QW c1qw, String str) {
        if (this.A03.get(c1qw) == null) {
            Map map = this.A04;
            List list = (List) map.get(c1qw);
            if (list == null) {
                list = new LinkedList();
                map.put(c1qw, list);
                c26511Qg.A01(A05);
            }
            list.add(str);
            return;
        }
        throw new IllegalStateException("Registering cacheKey after response has started");
    }

    public final boolean A02(String str) {
        C3IK c3ik = new C3IK(str);
        InterfaceC24271Gw interfaceC24271Gw = this.A00;
        if (interfaceC24271Gw.CKd(c3ik.A0C) && interfaceC24271Gw.CKd(c3ik.A0A)) {
            return true;
        }
        return false;
    }

    @Override // X.C19Q, X.C19O
    public final void onFailed(C1QW c1qw, IOException iOException) {
        List list = (List) this.A03.remove(c1qw);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C3IK) it.next()).A02();
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onNewData(C1QW c1qw, C1QY c1qy, ByteBuffer byteBuffer) {
        InterfaceC24271Gw interfaceC24271Gw;
        Map map = this.A03;
        List list = (List) map.get(c1qw);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3IK c3ik = (C3IK) it.next();
                try {
                    interfaceC24271Gw = this.A00;
                } catch (IllegalStateException unused) {
                    it.remove();
                    C0w9.A03("HttpStore_DuplicateWriting", StringFormatUtil.formatStrLocaleSafe("IllegalStateException while caching response in cache for request %s. RequestId: %d. mActiveWritingResponses: %s", c1qw.A09.getPath(), Integer.valueOf(c1qw.hashCode()), map.keySet()));
                }
                if (c3ik.A09) {
                    try {
                        if (c3ik.A02 == null) {
                            C59732oG ARB = interfaceC24271Gw.ARB(c3ik.A0A);
                            if (ARB.A00 != null) {
                                AbstractC71443Ii abstractC71443Ii = (AbstractC71443Ii) ARB.A00();
                                c3ik.A02 = abstractC71443Ii;
                                c3ik.A07 = new GZIPOutputStream(abstractC71443Ii);
                            } else {
                                C0w9.A03("HttpStoreEntry", "Output ResponseBody file not available");
                            }
                        }
                    } catch (IOException unused2) {
                    }
                    GZIPOutputStream gZIPOutputStream = c3ik.A07;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                        } catch (IOException unused3) {
                        }
                    }
                    c3ik.A02();
                    it.remove();
                } else {
                    throw new IllegalStateException("WriteBatchInCache should not be called if startWriting did not end up successfully");
                    break;
                }
            }
        }
    }

    @Override // X.C19Q, X.C19O
    public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
        Map map = this.A04;
        if (map.get(c1qw) != null) {
            List list = (List) map.remove(c1qw);
            list.getClass();
            if (c3jq.A01()) {
                C23781El A00 = c3jq.A00("X-IG-Cache-Control");
                if ((A00 != null && A00.A01.equals("no-cache")) || c1qy.A0C.equals(C05F.A0j)) {
                    return;
                }
                LinkedList linkedList = new LinkedList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3IK c3ik = new C3IK((String) it.next());
                    try {
                        InterfaceC24271Gw interfaceC24271Gw = this.A00;
                        c3ik.A01 = c1qy;
                        c3ik.A09 = false;
                        try {
                            C59732oG ARB = interfaceC24271Gw.ARB(c3ik.A0C);
                            if (ARB.A00 != null) {
                                AbstractC71443Ii abstractC71443Ii = (AbstractC71443Ii) ARB.A00();
                                c3ik.A03 = abstractC71443Ii;
                                c3ik.A08 = new GZIPOutputStream(abstractC71443Ii);
                                ArrayList arrayList = new ArrayList(Collections.unmodifiableList(c3jq.A03));
                                if (c3jq.A00("X-IG-ANDROID-FROM-DISK-CACHE") == null) {
                                    arrayList.add(new C23781El("X-IG-ANDROID-FROM-DISK-CACHE", String.valueOf(System.currentTimeMillis())));
                                }
                                String str = c1qy.A05;
                                if (str != null && c3jq.A00("X-IG-ANDROID-CACHE-WRITE-REASON") == null) {
                                    arrayList.add(new C23781El("X-IG-ANDROID-CACHE-WRITE-REASON", str));
                                }
                                int i = c3jq.A01;
                                String str2 = c3jq.A02;
                                int i2 = c3jq.A00;
                                StringWriter stringWriter = new StringWriter();
                                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                                A0A.A0d();
                                A0A.A0Q(TraceFieldType.StatusCode, i);
                                if (str2 != null) {
                                    A0A.A0S("reason_phrase", str2);
                                }
                                C16V.A03(A0A, "headers");
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    C23781El c23781El = (C23781El) it2.next();
                                    if (c23781El != null) {
                                        A0A.A0d();
                                        String str3 = c23781El.A00;
                                        if (str3 != null) {
                                            A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
                                        }
                                        String str4 = c23781El.A01;
                                        if (str4 != null) {
                                            A0A.A0S(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str4);
                                        }
                                        A0A.A0a();
                                    }
                                }
                                A0A.A0Z();
                                A0A.A0Q("response_id", i2);
                                A0A.A0a();
                                A0A.close();
                                String obj = stringWriter.toString();
                                if (obj.isEmpty()) {
                                    C0w9.A03("HttpStoreEntry_Serializer", StringFormatUtil.formatStrLocaleSafe("AsyncResponseInfo unexpected. Found: %s and serialized to: %s", c3jq, obj));
                                }
                                c3ik.A08.write(obj.getBytes(Charset.forName(ReactWebViewManager.HTML_ENCODING)));
                                c3ik.A09 = true;
                            } else {
                                C0w9.A03("HttpStoreEntry", "Output ResponseInfo file not available");
                            }
                        } catch (IOException unused) {
                            C0w9.A03("HttpStoreEntry", "IOException found when serializing AsyncHttpResponseInfo");
                        }
                        if (!c3ik.A09) {
                            c3ik.A02();
                        }
                        if (c3ik.A09) {
                            linkedList.add(c3ik);
                        }
                    } catch (IllegalStateException unused2) {
                        C0w9.A03("HttpStore_DuplicateWriting", StringFormatUtil.formatStrLocaleSafe("IllegalStateException found when caching response for request: %s. RequestId: %d. mActiveWritingResponse: %s", c1qw.A09.getPath(), Integer.valueOf(c1qw.hashCode()), this.A03.keySet()));
                    }
                }
                this.A03.put(c1qw, linkedList);
                return;
            }
            return;
        }
        throw new IllegalStateException(StringFormatUtil.formatStrLocaleSafe("Request: %s %n not found when trying to cache response.", c1qw.A09.toString()));
    }

    @Override // X.C19Q, X.C19O
    public final void onSucceeded(C1QW c1qw) {
        GZIPOutputStream gZIPOutputStream;
        int i;
        List<C3IK> list = (List) this.A03.remove(c1qw);
        if (list != null) {
            try {
                for (C3IK c3ik : list) {
                    InterfaceC24271Gw interfaceC24271Gw = this.A00;
                    C24211Gq c24211Gq = this.A01;
                    try {
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        c3ik.A02();
                        throw th;
                    }
                    if (c3ik.A07 != null && c3ik.A02 != null && (gZIPOutputStream = c3ik.A08) != null && c3ik.A03 != null) {
                        gZIPOutputStream.finish();
                        c3ik.A07.finish();
                        c3ik.A03.A03();
                        c3ik.A02.A03();
                        C18C.A07(c3ik.A01, "policy should be set at startWriting() and can't be null");
                        if (c24211Gq != null) {
                            String str = c3ik.A0B;
                            C1Ef A00 = c3ik.A01.A00();
                            if (A00 == C1Ef.OffScreen) {
                                i = 0;
                            } else {
                                i = -1;
                                if (A00 == C1Ef.OnScreen) {
                                    i = 1;
                                }
                            }
                            c24211Gq.A02(str, null, 1, i, interfaceC24271Gw.B2T(c3ik.A0C) + interfaceC24271Gw.B2T(c3ik.A0A));
                        }
                        c3ik.A02();
                    } else {
                        throw new IllegalStateException("Unexpected null Output stream");
                        break;
                    }
                }
            } catch (IllegalStateException e) {
                C0w9.A03("HttpStore_EmptyBody", StringFormatUtil.formatStrLocaleSafe("IllegalStateException while caching response in cache for request %s. %s", c1qw.A09.getPath(), e.getLocalizedMessage()));
            }
        }
    }

    public C24301Gz(InterfaceC24271Gw interfaceC24271Gw, C24211Gq c24211Gq) {
        this.A00 = interfaceC24271Gw;
        this.A01 = c24211Gq;
    }
}
