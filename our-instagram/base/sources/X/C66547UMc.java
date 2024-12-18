package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UMc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66547UMc extends AbstractC53638Nnj {
    public final MYB A00;
    public final MediaComposition A01;
    public final C69492VoF A02;
    public final boolean A03;
    public final C69064VhF A04;
    public final W8v A05;
    public final XCC A06;
    public final InterfaceC72009XEx A07;
    public final Map A08;

    @Override // X.AbstractC53638Nnj
    public final void A01(Exception exc, Map map, int i, boolean z) {
        ArrayList A12 = AbstractC166997dE.A12(exc, 0);
        if (A12.isEmpty()) {
            C69064VhF c69064VhF = this.A04;
            XC1 xc1 = c69064VhF.A01;
            AbstractC68335VMv.A00(xc1, exc, "media_upload_fetch_upload_settings_failure", c69064VhF.A02, xc1.now() - c69064VhF.A00);
        }
        this.A07.DGs(exc);
        C69492VoF c69492VoF = this.A02;
        A12.addAll(c69492VoF.A00.AwC(this.A00, this.A01, c69492VoF));
        this.A06.D6X(A12);
    }

    @Override // X.AbstractC53638Nnj
    public final void A02(String str, int i, Map map) {
        List arrayList;
        C14360o3.A0B(str, 0);
        C69064VhF c69064VhF = this.A04;
        Map map2 = c69064VhF.A02;
        map2.put("server_response", str);
        XC1 xc1 = c69064VhF.A01;
        AbstractC68335VMv.A00(xc1, null, "media_upload_fetch_upload_settings_success", map2, xc1.now() - c69064VhF.A00);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("transcode_dimension");
            int optInt2 = jSONObject.optInt("transcode_bit_rate_bps");
            boolean optBoolean = jSONObject.optBoolean("should_expand_to_transcode_dimension");
            int optInt3 = jSONObject.optInt("gop_size_seconds");
            ArrayList A00 = C70125W5g.A06.A00(this.A00, this.A01, this.A02, optInt, optInt2, optInt3, optBoolean, this.A03);
            C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.collections.MutableList<com.facebook.videolite.uploader.StrategyConfig>");
            arrayList = C15500q5.A02(A00);
        } catch (JSONException e) {
            this.A07.DGs(e);
        }
        if (arrayList != null) {
            this.A07.DGt(this.A08, str);
            C69492VoF c69492VoF = this.A02;
            arrayList.addAll(c69492VoF.A00.AwC(this.A00, this.A01, c69492VoF));
            this.A06.D6X(arrayList);
        }
        arrayList = new ArrayList();
        C69492VoF c69492VoF2 = this.A02;
        arrayList.addAll(c69492VoF2.A00.AwC(this.A00, this.A01, c69492VoF2));
        this.A06.D6X(arrayList);
    }

    public C66547UMc(C69064VhF c69064VhF, MYB myb, MediaComposition mediaComposition, C69492VoF c69492VoF, W8v w8v, XCC xcc, InterfaceC72009XEx interfaceC72009XEx, Map map, boolean z) {
        this.A03 = z;
        this.A00 = myb;
        this.A06 = xcc;
        this.A02 = c69492VoF;
        this.A01 = mediaComposition;
        this.A04 = c69064VhF;
        this.A07 = interfaceC72009XEx;
        this.A05 = w8v;
        this.A08 = map;
    }
}
