package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.47x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC916247x {
    public static C915647m parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C915647m c915647m = new C915647m();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("strength".equals(A0q)) {
                    c915647m.A00 = c16l.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    c915647m.A01 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("timestamps".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        c915647m.A03 = arrayList;
                    } else if ("texture_transforms".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                A65 parseFromJson = A1V.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c915647m.A02 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c915647m;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C915647m c915647m) {
        List<A65> list;
        List<Number> list2;
        anonymousClass182.A0d();
        anonymousClass182.A0Q("strength", c915647m.A00);
        anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c915647m.A01);
        List list3 = c915647m.A03;
        if (list3 != null && Collections.unmodifiableList(list3) != null) {
            C16V.A03(anonymousClass182, "timestamps");
            List list4 = c915647m.A03;
            if (list4 != null) {
                list2 = Collections.unmodifiableList(list4);
            } else {
                list2 = null;
            }
            for (Number number : list2) {
                if (number != null) {
                    anonymousClass182.A0h(number.intValue());
                }
            }
            anonymousClass182.A0Z();
        }
        List list5 = c915647m.A02;
        if (list5 != null && Collections.unmodifiableList(list5) != null) {
            C16V.A03(anonymousClass182, "texture_transforms");
            List list6 = c915647m.A02;
            if (list6 != null) {
                list = Collections.unmodifiableList(list6);
            } else {
                list = null;
            }
            for (A65 a65 : list) {
                if (a65 != null) {
                    anonymousClass182.A0d();
                    C16V.A03(anonymousClass182, "timestamps");
                    for (Number number2 : a65.A00) {
                        if (number2 != null) {
                            anonymousClass182.A0g(number2.floatValue());
                        }
                    }
                    anonymousClass182.A0Z();
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
