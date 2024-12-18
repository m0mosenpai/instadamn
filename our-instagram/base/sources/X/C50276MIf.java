package X;

import android.util.Base64;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.io.IOException;
import java.util.List;

/* renamed from: X.MIf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50276MIf extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ android.net.Uri A02;
    public final /* synthetic */ LKn A03;
    public final /* synthetic */ C44991Jvh A04;
    public final /* synthetic */ CommonMediaTransport A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50276MIf(android.net.Uri uri, LKn lKn, C44991Jvh c44991Jvh, CommonMediaTransport commonMediaTransport, Integer num, String str, List list, int i, int i2) {
        super(1);
        this.A04 = c44991Jvh;
        this.A03 = lKn;
        this.A06 = num;
        this.A05 = commonMediaTransport;
        this.A02 = uri;
        this.A07 = str;
        this.A08 = list;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        if (str == null) {
            C44991Jvh c44991Jvh = this.A04;
            C0K8.A0C("ArmadilloExpressStreamableDownloadResponse", AbstractC166997dE.A0y("Closing due to error: ", new IOException("Failed to retrieve restore url")));
            C44991Jvh.A00(c44991Jvh);
        } else {
            LKn lKn = this.A03;
            InterfaceC09390do interfaceC09390do = LKn.A05;
            UserSession userSession = lKn.A01;
            Integer num = this.A06;
            CommonMediaTransport commonMediaTransport = this.A05;
            String str2 = commonMediaTransport.fileSha256_;
            C14360o3.A07(str2);
            byte[] decode = Base64.decode(str2, 2);
            C14360o3.A07(decode);
            String str3 = commonMediaTransport.fileEncSha256_;
            C14360o3.A07(str3);
            byte[] decode2 = Base64.decode(str3, 2);
            C14360o3.A07(decode2);
            String str4 = commonMediaTransport.mediaKey_;
            C14360o3.A07(str4);
            byte[] decode3 = Base64.decode(str4, 2);
            C14360o3.A07(decode3);
            long A05 = AbstractC43592JPx.A05(commonMediaTransport.mediaKeyTimestamp_);
            android.net.Uri uri = this.A02;
            C14360o3.A0A(uri);
            byte[] decode4 = Base64.decode(this.A07, 2);
            C14360o3.A07(decode4);
            List list = this.A08;
            int i = this.A01;
            int i2 = this.A00;
            C44991Jvh c44991Jvh2 = this.A04;
            AbstractC167007dF.A1H(num, 1, uri);
            LCH.A01(new C50283MIm(uri, c44991Jvh2, new C44992Jvi(c44991Jvh2), c44991Jvh2, num, str, list, decode, decode2, decode3, decode4, i, i2, A05), userSession);
        }
        return C0eB.A00;
    }
}
