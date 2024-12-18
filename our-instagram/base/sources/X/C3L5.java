package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.3L5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3L5 {
    public static final InterfaceC40801un A00(C222015v c222015v, C3JY c3jy, C1EY c1ey, InputStream inputStream, Class cls, boolean z) {
        String str;
        int read;
        String str2;
        C16L A01;
        C16L c16l = null;
        if (inputStream != null) {
            try {
                try {
                    if (z) {
                        try {
                            C23781El A012 = c3jy.A01("Content-Type");
                            if (A012 == null || (str2 = A012.A01) == null || AbstractC001900j.A08(str2, "application/json", 0, false) < 0) {
                                Integer valueOf = Integer.valueOf(c3jy.A01);
                                Integer valueOf2 = Integer.valueOf(c3jy.A02);
                                String str3 = c3jy.A03;
                                C23781El A013 = c3jy.A01("Content-Type");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[4096];
                                try {
                                    read = inputStream.read(bArr);
                                } catch (IOException unused) {
                                }
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    str = new String(bArr, 0, read, C15W.A05);
                                    throw new C902740m(A013, valueOf, valueOf2, str3, str);
                                }
                                str = null;
                                throw new C902740m(A013, valueOf, valueOf2, str3, str);
                            }
                        } catch (C90173zy e) {
                            e = e;
                            throw new C53093Ne6(c3jy.A02, e);
                        } catch (C902740m e2) {
                            e = e2;
                            throw new C53093Ne6(c3jy.A02, e);
                        }
                    }
                    inputStream = c1ey.FEF(c3jy.A01("X-IG-Cache-Control"), inputStream);
                    if (c222015v != null) {
                        A01 = c222015v.A01(inputStream);
                    } else {
                        A01 = AbstractC221915u.A00.A01(inputStream);
                    }
                } catch (Exception e3) {
                    C0f5 AEp = C18950wb.A01.AEp("AutoResponseParserUtil", 817896653);
                    AEp.ABU(TraceFieldType.StatusCode, c3jy.A02);
                    AEp.ABW("reason_phrase", AnonymousClass001.A0R("", c3jy.A03));
                    AEp.ERI(e3);
                    AEp.report();
                    throw e3;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                A01.A1J();
                if (A01.A11() != null) {
                    try {
                        Method method = cls.getMethod("parseFromJson", C16L.class);
                        if (A01 instanceof C07950bF) {
                            C07950bF c07950bF = (C07950bF) A01;
                            boolean z2 = false;
                            if (c3jy.A01("X-IG-ANDROID-FROM-DISK-CACHE") != null) {
                                z2 = true;
                            }
                            c07950bF.A00 = z2;
                        }
                        InterfaceC40801un interfaceC40801un = (InterfaceC40801un) method.invoke(null, A01);
                        if (interfaceC40801un != null) {
                            interfaceC40801un.setStatusCode(c3jy.A02);
                            boolean z3 = false;
                            if (c3jy.A01("X-IG-ANDROID-FROM-DISK-CACHE") != null) {
                                z3 = true;
                            }
                            interfaceC40801un.setFromDiskCache(z3);
                            C23781El A014 = c3jy.A01("Date");
                            if (A014 != null) {
                                try {
                                    Date parse = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).parse(A014.A01);
                                    if (parse != null) {
                                        interfaceC40801un.setResponseTimestamp(parse.getTime());
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                            C23781El A015 = c3jy.A01("X-IG-Request-Elapsed-Time-MS");
                            if (A015 != null) {
                                String str4 = A015.A01;
                                C14360o3.A06(str4);
                                interfaceC40801un.setServerElapsedTime(Long.parseLong(str4));
                            }
                            interfaceC40801un.setResponseId(c3jy.A01);
                            try {
                                A01.close();
                            } catch (IOException unused3) {
                            }
                            inputStream.close();
                            return interfaceC40801un;
                        }
                        throw new IllegalStateException("response should be parsed successfully");
                    } catch (IllegalAccessException e4) {
                        throw new IllegalStateException(e4);
                    } catch (NoSuchMethodException e5) {
                        throw new IllegalArgumentException(AnonymousClass001.A0R("On Class ", cls.getCanonicalName()), e5);
                    } catch (InvocationTargetException e6) {
                        if (e6.getTargetException() instanceof Exception) {
                            Throwable targetException = e6.getTargetException();
                            C14360o3.A0C(targetException, "null cannot be cast to non-null type java.lang.Exception");
                            throw ((Exception) targetException);
                        }
                        throw e6;
                    }
                }
            } catch (C90173zy e7) {
                e = e7;
                throw new C53093Ne6(c3jy.A02, e);
            } catch (C902740m e8) {
                e = e8;
                throw new C53093Ne6(c3jy.A02, e);
            } catch (Throwable th2) {
                th = th2;
                c16l = A01;
                if (c16l != null) {
                    try {
                        c16l.close();
                    } catch (IOException unused4) {
                    }
                }
                if (inputStream != null) {
                    inputStream.close();
                    throw th;
                }
                throw th;
            }
        }
        int i = c3jy.A02;
        if (inputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            try {
                int read2 = inputStream.read(bArr2);
                if (read2 > 0) {
                    byteArrayOutputStream2.write(bArr2, 0, read2);
                    new String(bArr2, 0, read2, C15W.A05);
                }
            } catch (IOException unused5) {
            }
        }
        throw new C58485PwB(i);
    }
}
