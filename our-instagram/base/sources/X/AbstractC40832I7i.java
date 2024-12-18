package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.shopping.model.destination.home.DestinationContentType;
import com.instagram.shopping.model.destination.home.DestinationSignalType;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.I7i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40832I7i {
    public static C38685GzQ parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            DestinationContentType destinationContentType = null;
            HashMap hashMap = null;
            DestinationSignalType destinationSignalType = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if (TraceFieldType.ContentType.equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P2 = null;
                        } else {
                            A1P2 = c16l.A1P();
                        }
                        destinationContentType = (DestinationContentType) DestinationContentType.A01.get(A1P2);
                        if (destinationContentType == null) {
                            destinationContentType = DestinationContentType.A07;
                        }
                    } else if ("extra_data".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if ("signal_type".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P = null;
                        } else {
                            A1P = c16l.A1P();
                        }
                        destinationSignalType = (DestinationSignalType) DestinationSignalType.A01.get(A1P);
                        if (destinationSignalType == null) {
                            destinationSignalType = DestinationSignalType.A09;
                        }
                    }
                    c16l.A0z();
                } else {
                    return new C38685GzQ(3, destinationSignalType, destinationContentType, hashMap);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
