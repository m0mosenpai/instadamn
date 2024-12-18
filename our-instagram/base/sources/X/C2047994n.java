package X;

import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* renamed from: X.94n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2047994n implements InterfaceC70433Ec {
    public C2JM A00 = new C2JM();
    public C2JM A05 = new C2JM();
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A02 = false;
    public boolean A01 = false;

    @Override // X.InterfaceC70433Ec
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final PandoGraphQLRequest build() {
        C18C.A0E(this.A03);
        C18C.A0E(this.A04);
        C18C.A0E(this.A02);
        C18C.A0E(this.A01);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AbstractC40511uK.A00(), "DcpFeaturesUpload", this.A00.getParamsCopy(), this.A05.getParamsCopy(), C2048094o.class, true, null, 0, null, "xfb_post_dcp_features_upload", new ArrayList());
    }
}
