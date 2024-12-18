package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.react.modules.base.IgNetworkingModule;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes10.dex */
public abstract class SUW {
    public static final java.util.Set A00;
    public static final java.util.Set A01;

    public static final C1ON A00(C2JL c2jl, String str, String str2, String str3, ResponseHandler responseHandler, String[] strArr, String[] strArr2) {
        Integer num;
        String str4;
        C126615nx c126615nx = null;
        C26371Ps c26371Ps = new C26371Ps((C1JP) null);
        java.net.URI create = java.net.URI.create(str);
        if ("https".equals(create.getScheme())) {
            if (!AbstractC58319PtB.A1W(A01, create.getPort())) {
                String A10 = AbstractC166997dE.A10(Locale.ROOT, str2);
                if (A10.equals("GET")) {
                    num = C05F.A0N;
                } else if (A10.equals("POST")) {
                    num = C05F.A01;
                    if (str3 != null && str3.length() != 0) {
                        if (MSV.A00(468).equals(create.getHost()) && "/graphql_www".equals(create.getPath())) {
                            str4 = AbstractC111324zv.A00(729);
                        } else {
                            str4 = "application/octet-stream";
                        }
                        C23781El c23781El = new C23781El("Content-Type", str4);
                        Charset A0u = AbstractC58318PtA.A0u();
                        C14360o3.A07(A0u);
                        c126615nx = new C126615nx(c23781El, AbstractC58318PtA.A1a(str3, A0u));
                    }
                } else {
                    throw AbstractC58320PtC.A0l("Method '", str2, "' is not supported");
                }
                c26371Ps.A02 = str;
                c26371Ps.A01(num);
                if (c126615nx != null) {
                    c26371Ps.A00 = c126615nx;
                }
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    if (!A00.contains(strArr[i])) {
                        c26371Ps.A03(strArr[i], strArr2[i]);
                    } else {
                        throw AbstractC58320PtC.A0l("Header '", strArr[i], "' is not supported");
                    }
                }
                C1OK c1ok = new C1OK();
                return new C1ON(c1ok, AbstractC908442x.A00(AbstractC24481Hr.A06.A00(new CallableC58499PwS(c26371Ps, 3), -10, 2, false, true).A02(new C26561Ql(c1ok.A00), -11, 2, true, true).A02(new TG5(c2jl, responseHandler), -15, 2, false, true)), "HttpRequest", "path undefined");
            }
            throw AbstractC166987dD.A12("Port not supported");
        }
        throw AbstractC166987dD.A12("Protocol not supported");
    }

    static {
        Integer[] numArr = new Integer[64];
        System.arraycopy(new Integer[]{1, 7, 9, 11, 13, 15, 17, 19, 20, 21, 22, 23, 25, 37, 42, 43, 53, 77, 79, 87, 95, 101, 102, 103, 104, 109, 110}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{111, 113, 115, 117, 119, 123, 135, 139, 143, 179, 389, 465, 512, 513, 514, 515, 526, 530, 531, 532, 540, 556, 563, 587, 601, 636, 993}, 0, numArr, 27, 27);
        System.arraycopy(new Integer[]{995, 2049, 3659, 4045, 6000, 6665, 6666, 6667, 6668, 6669}, 0, numArr, 54, 10);
        A01 = AbstractC31171DnF.A0k(AbstractC16960so.A1Q(numArr));
        A00 = AbstractC31171DnF.A0k(AbstractC16960so.A1Q("accept-charset", "accept-encoding", "access-control-request-headers", "access-control-request-method", "connection", IgNetworkingModule.CONTENT_LENGTH_HEADER_NAME, "cookie", "cookie2", DatePickerDialogModule.ARG_DATE, "dnt", "expect", "host", "keep-alive", "origin", "referer", "te", "trailer", "transfer-encoding", "upgrade", "via"));
    }
}
