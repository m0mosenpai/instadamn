package X;

import java.util.Collections;
import org.json.JSONObject;

/* renamed from: X.Ilb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42127Ilb implements InterfaceC79643hF {
    public final String A00;
    public final C3u8 A01;
    public final InterfaceC11380iw A02;
    public final C38321qM A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.InterfaceC79643hF
    public final C5H3 AX0() {
        return null;
    }

    @Override // X.InterfaceC79643hF
    public final C5H2 AX1() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4Hy, java.lang.Object] */
    @Override // X.InterfaceC79643hF
    public final C93574Hy AWp() {
        boolean z;
        String str = this.A06;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C38321qM c38321qM = this.A03;
        if (c38321qM != null) {
            z = c38321qM.CdW();
        } else {
            z = false;
        }
        C3u8 c3u8 = this.A01;
        ?? obj = new Object();
        obj.A01 = str;
        obj.A02 = interfaceC11380iw;
        obj.A06 = z;
        obj.A00 = c3u8;
        obj.A05 = Collections.emptySet();
        return obj;
    }

    @Override // X.InterfaceC79643hF
    public final String AWz() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("product_id", this.A06);
        jSONObject.put("merchant_id", this.A05);
        C38321qM c38321qM = this.A03;
        if (c38321qM != null) {
            String id = c38321qM.getId();
            if (id != null) {
                jSONObject.put("m_pk", id);
            }
            String CAR = c38321qM.CAR();
            if (CAR != null) {
                jSONObject.put("tracking_token", CAR);
            }
            jSONObject.put("is_sponsored", c38321qM.CdW());
        }
        String str = this.A04;
        if (str != null) {
            jSONObject.put("central_pdp_version", str);
        }
        return AbstractC166987dD.A19(jSONObject);
    }

    public C42127Ilb(C38321qM c38321qM, String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1R(str2, str3);
        this.A06 = str2;
        this.A05 = str3;
        this.A00 = str4;
        this.A03 = c38321qM;
        this.A04 = str5;
        this.A02 = AbstractC31171DnF.A0D(str);
        this.A01 = new C42124IlY(this, 2);
    }
}
