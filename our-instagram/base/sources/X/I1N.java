package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I1N {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IGW] */
    public static IGW parseFromJson(C16L c16l) {
        int i;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str = null;
                if ("appMessages".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51755Mte parseFromJson = F8G.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList2, 0);
                    obj.A01 = arrayList2;
                } else if ("caller".equals(A0s)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                } else if ("ringType".equals(A0s)) {
                    int A0i = c16l.A0i();
                    for (Integer num : C05F.A00(8)) {
                        switch (num.intValue()) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
                                break;
                            case 3:
                                i = 3;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                                i = 5;
                                break;
                            case 6:
                                i = 6;
                                break;
                            case 7:
                                i = -1;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i != A0i) {
                        }
                    }
                } else if ("otherParticipants".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    obj.A02 = arrayList;
                } else if ("isTransferCall".equals(A0s)) {
                    c16l.A0d();
                } else if ("e2eeEnforcement".equals(A0s)) {
                    I1K parseFromJson2 = I1L.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    obj.A00 = parseFromJson2;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
