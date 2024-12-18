package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: X.SJv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62638SJv {
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x00ce. Please report as an issue. */
    public final Object A00(AnonymousClass469 anonymousClass469, String str) {
        Class cls;
        Object[] A1Z;
        String str2;
        Class cls2;
        Object[] objArr;
        String str3;
        Object A0D;
        Object obj;
        TIG tig;
        if (this instanceof R9U) {
            R9U r9u = (R9U) this;
            if (!(r9u instanceof RAr)) {
                if (str == null) {
                    return null;
                }
                try {
                    if (r9u instanceof RAt) {
                        A0D = ((RAt) r9u).A00.invoke(null, str);
                    } else if (r9u instanceof RAs) {
                        A0D = ((RAs) r9u).A00.newInstance(str);
                    } else if (r9u instanceof RAu) {
                        RAu rAu = (RAu) r9u;
                        RBK rbk = rAu.A01;
                        if (rbk != null) {
                            try {
                                A0D = rbk.A0K(str);
                            } catch (Exception e) {
                                e = e;
                                Iterator it = C914045z.A00;
                                while (e.getCause() != null) {
                                    e = e.getCause();
                                }
                                String message = e.getMessage();
                                C914045z.A0F(e);
                                if (!(e instanceof Error)) {
                                    throw new IllegalArgumentException(message, e);
                                }
                                throw e;
                            }
                        } else {
                            if (anonymousClass469.A0j(EnumC912945i.A0J)) {
                                tig = rAu.A00;
                                if (tig == null) {
                                    synchronized (rAu) {
                                        try {
                                            tig = TIG.A00(anonymousClass469.A02, rAu.A02.A00);
                                            rAu.A00 = tig;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                tig = rAu.A02;
                            }
                            HashMap hashMap = tig.A02;
                            A0D = hashMap.get(str);
                            if (A0D == null && tig.A04) {
                                Iterator A14 = AbstractC166997dE.A14(hashMap);
                                while (true) {
                                    if (A14.hasNext()) {
                                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                                        if (str.equalsIgnoreCase(AbstractC31172DnG.A17(A1K))) {
                                            A0D = A1K.getValue();
                                            break;
                                        }
                                    } else {
                                        A0D = null;
                                        break;
                                    }
                                }
                            }
                            if (A0D == null) {
                                Enum r2 = rAu.A03;
                                if (r2 == null || !anonymousClass469.A0j(EnumC912945i.A0L)) {
                                    if (!anonymousClass469.A0j(EnumC912945i.A0K)) {
                                        anonymousClass469.A0d(((R9U) rAu).A02, str, "not one of the values accepted for Enum class: %s", hashMap.keySet());
                                        throw C00O.createAndThrow();
                                    }
                                } else {
                                    obj = r2;
                                    A0D = obj;
                                }
                            }
                        }
                    } else {
                        try {
                        } catch (IllegalArgumentException | MalformedURLException | Exception e2) {
                            cls2 = r9u.A02;
                            objArr = new Object[]{C914045z.A09(e2)};
                            str3 = "problem: %s";
                        }
                        switch (r9u.A00) {
                            case 1:
                                if ("true".equals(str)) {
                                    A0D = Boolean.TRUE;
                                    break;
                                } else if ("false".equals(str)) {
                                    A0D = Boolean.FALSE;
                                    break;
                                } else {
                                    anonymousClass469.A0d(r9u.A02, str, "value not 'true' or 'false'", new Object[0]);
                                    throw C00O.createAndThrow();
                                }
                            case 2:
                                int parseInt = Integer.parseInt(str);
                                if (parseInt >= -128 && parseInt <= 255) {
                                    A0D = Byte.valueOf((byte) parseInt);
                                    break;
                                } else {
                                    anonymousClass469.A0d(r9u.A02, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                                    throw C00O.createAndThrow();
                                }
                            case 3:
                                int parseInt2 = Integer.parseInt(str);
                                if (parseInt2 >= -32768 && parseInt2 <= 32767) {
                                    A0D = Short.valueOf((short) parseInt2);
                                    break;
                                } else {
                                    anonymousClass469.A0d(r9u.A02, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                                    throw C00O.createAndThrow();
                                }
                                break;
                            case 4:
                                if (str.length() == 1) {
                                    A0D = Character.valueOf(str.charAt(0));
                                    break;
                                } else {
                                    anonymousClass469.A0d(r9u.A02, str, "can only convert 1-character Strings", new Object[0]);
                                    throw C00O.createAndThrow();
                                }
                            case 5:
                                A0D = AbstractC58319PtB.A0m(str);
                                break;
                            case 6:
                                A0D = AbstractC25228BEl.A13(str);
                                break;
                            case 7:
                                A0D = Float.valueOf((float) C16Y.A00(str));
                                break;
                            case 8:
                                A0D = Double.valueOf(C16Y.A00(str));
                                break;
                            case 9:
                                A0D = r9u.A01.A0z(anonymousClass469, str);
                                break;
                            case 10:
                                A0D = anonymousClass469.A0P(str);
                                break;
                            case 11:
                                Date A0P = anonymousClass469.A0P(str);
                                TimeZone timeZone = ((C45T) anonymousClass469.A02).A01.A0A;
                                if (timeZone == null) {
                                    timeZone = AnonymousClass451.A0B;
                                }
                                Calendar calendar = Calendar.getInstance(timeZone);
                                calendar.setTime(A0P);
                                obj = calendar;
                                A0D = obj;
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                A0D = UUID.fromString(str);
                                break;
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                A0D = java.net.URI.create(str);
                                break;
                            case 14:
                                A0D = new java.net.URL(str);
                                break;
                            case Process.SIGTERM /* 15 */:
                                try {
                                    A0D = ((C45T) anonymousClass469.A02).A01.A07.A0D(str);
                                    break;
                                } catch (Exception unused) {
                                    cls2 = r9u.A02;
                                    objArr = new Object[0];
                                    str3 = "unable to parse key as Class";
                                    anonymousClass469.A0d(cls2, str, str3, objArr);
                                    throw C00O.createAndThrow();
                                }
                            case 16:
                                A0D = r9u.A01.A0z(anonymousClass469, str);
                                break;
                            case 17:
                                C912044w c912044w = ((C45T) anonymousClass469.A02).A01.A00;
                                C61052ReQ c61052ReQ = new C61052ReQ((C16G) null);
                                c912044w.A06(c61052ReQ, str);
                                A0D = c61052ReQ.A05();
                                break;
                            default:
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("Internal error: unknown key type ");
                                throw AbstractC58320PtC.A0n(r9u.A02, A1C);
                        }
                    }
                    if (A0D != null) {
                        return A0D;
                    }
                    cls = r9u.A02;
                    Iterator it2 = C914045z.A00;
                    if (Enum.class.isAssignableFrom(cls) && anonymousClass469.A02.A0C(EnumC912945i.A0K)) {
                        return null;
                    }
                    A1Z = new Object[0];
                    str2 = "not a valid representation";
                } catch (Exception e3) {
                    cls = r9u.A02;
                    A1Z = new Object[]{MSY.A0h(e3), C914045z.A09(e3)};
                    str2 = "not a valid representation, problem: (%s) %s";
                }
            } else {
                return str;
            }
        } else {
            R9T r9t = (R9T) this;
            if (str == null) {
                return null;
            }
            C914146b c914146b = new C914146b(anonymousClass469.A07, anonymousClass469);
            c914146b.A0u(str);
            try {
                Object A0D2 = r9t.A00.A0D(AbstractC58322PtE.A0c(c914146b), anonymousClass469);
                if (A0D2 != null) {
                    return A0D2;
                }
                anonymousClass469.A0d(r9t.A01, str, "not a valid representation", new Object[0]);
                throw C00O.createAndThrow();
            } catch (Exception e4) {
                cls = r9t.A01;
                A1Z = AbstractC58319PtB.A1Z(e4);
                str2 = "not a valid representation: %s";
            }
        }
        anonymousClass469.A0d(cls, str, str2, A1Z);
        throw C00O.createAndThrow();
    }
}
