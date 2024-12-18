package X;

import org.apache.http.HttpVersion;
import org.apache.http.client.ResponseHandler;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;

/* loaded from: classes10.dex */
public final class TG5 implements InterfaceC25601Mq {
    public final /* synthetic */ C2JL A00;
    public final /* synthetic */ ResponseHandler A01;

    public TG5(C2JL c2jl, ResponseHandler responseHandler) {
        this.A01 = responseHandler;
        this.A00 = c2jl;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        C3JY c3jy = (C3JY) obj;
        C14360o3.A0B(c3jy, 0);
        HttpVersion httpVersion = HttpVersion.HTTP_1_1;
        int i = c3jy.A02;
        String str = c3jy.A03;
        if (str == null) {
            str = "";
        }
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(httpVersion, i, str);
        InterfaceC26481Qd A00 = c3jy.A00();
        if (A00 != null) {
            basicHttpResponse.setEntity(new InputStreamEntity(A00.AjT(), A00.AJp()));
            this.A00.onSuccess(this.A01.handleResponse(basicHttpResponse));
            return new C40791um();
        }
        throw AbstractC166997dE.A0g();
    }
}
