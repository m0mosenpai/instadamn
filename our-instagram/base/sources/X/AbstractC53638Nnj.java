package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Nnj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53638Nnj {
    public void A00(int i) {
    }

    public void A01(Exception exc, Map map, int i, boolean z) {
        InterfaceC58135Ppy interfaceC58135Ppy;
        String str;
        String str2;
        int i2;
        InterfaceC58135Ppy interfaceC58135Ppy2;
        java.net.URI uri;
        JSONObject jSONObject;
        if (this instanceof C51510Mow) {
            OML oml = ((C51510Mow) this).A00;
            if (oml != null) {
                oml.A01("save_edit_start");
                return;
            }
            return;
        }
        if (this instanceof C51509Mov) {
            C14360o3.A0B(exc, 0);
            InterfaceC58013Pnx interfaceC58013Pnx = ((C51509Mov) this).A00;
            if (interfaceC58013Pnx == null) {
                return;
            }
            interfaceC58013Pnx.Dcb(EnumC53262Nh0.A0E, AbstractC167017dG.A0n(exc, "Save edit request failed ", AbstractC166987dD.A1C()));
            return;
        }
        if (this instanceof C51512Moy) {
            C51512Moy c51512Moy = (C51512Moy) this;
            if (i == 408 && c51512Moy.A00 > 0) {
                interfaceC58135Ppy2 = c51512Moy.A01;
                if (interfaceC58135Ppy2 == null) {
                    return;
                }
                uri = c51512Moy.A02;
                jSONObject = c51512Moy.A03;
                interfaceC58135Ppy2.ARE(uri, jSONObject);
                return;
            }
            interfaceC58135Ppy = c51512Moy.A01;
            if (interfaceC58135Ppy == null) {
                return;
            }
            str = "Oil uri failure statusCode: ";
            str2 = ", with retries ";
            i2 = c51512Moy.A00;
            interfaceC58135Ppy.DCp(AnonymousClass001.A02(i, i2, str, str2));
        }
        C51511Mox c51511Mox = (C51511Mox) this;
        if (i == 408 && c51511Mox.A00 > 0) {
            interfaceC58135Ppy2 = c51511Mox.A01;
            if (interfaceC58135Ppy2 == null) {
                return;
            }
            uri = c51511Mox.A02;
            jSONObject = c51511Mox.A03;
            interfaceC58135Ppy2.ARE(uri, jSONObject);
            return;
        }
        interfaceC58135Ppy = c51511Mox.A01;
        if (interfaceC58135Ppy == null) {
            return;
        }
        str = "Oil uri failure statusCode: ";
        str2 = ", with retries ";
        i2 = c51511Mox.A00;
        interfaceC58135Ppy.DCp(AnonymousClass001.A02(i, i2, str, str2));
    }

    public void A02(String str, int i, Map map) {
        InterfaceC57895Plz interfaceC57895Plz;
        String str2;
        String str3;
        if (this instanceof C51510Mow) {
            C51510Mow c51510Mow = (C51510Mow) this;
            interfaceC57895Plz = c51510Mow.A01;
            str2 = c51510Mow.A02;
            str3 = c51510Mow.A03;
        } else if (this instanceof C51509Mov) {
            C51509Mov c51509Mov = (C51509Mov) this;
            interfaceC57895Plz = c51509Mov.A01;
            str2 = c51509Mov.A02;
            str3 = c51509Mov.A03;
        } else {
            if (this instanceof C51512Moy) {
                C51512Moy c51512Moy = (C51512Moy) this;
                C14360o3.A0B(str, 0);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    java.net.URI uri = new java.net.URI(jSONObject.getString("output_url"));
                    String string = jSONObject.getString("edit_id");
                    InterfaceC58135Ppy interfaceC58135Ppy = c51512Moy.A01;
                    if (interfaceC58135Ppy == null) {
                        return;
                    }
                    C14360o3.A0A(string);
                    interfaceC58135Ppy.DCo(string, uri);
                    return;
                } catch (Exception e) {
                    InterfaceC58135Ppy interfaceC58135Ppy2 = c51512Moy.A01;
                    if (interfaceC58135Ppy2 == null) {
                        return;
                    }
                    interfaceC58135Ppy2.DCp(AbstractC167017dG.A0n(e, "Oil uri parsing failed: ", AbstractC166987dD.A1C()));
                    return;
                }
            }
            C51511Mox c51511Mox = (C51511Mox) this;
            C14360o3.A0B(str, 0);
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                java.net.URI uri2 = new java.net.URI(jSONObject2.getString("output_url"));
                String string2 = jSONObject2.getString("edit_id");
                InterfaceC58135Ppy interfaceC58135Ppy3 = c51511Mox.A01;
                if (interfaceC58135Ppy3 == null) {
                    return;
                }
                C14360o3.A0A(string2);
                interfaceC58135Ppy3.DCo(string2, uri2);
                return;
            } catch (Exception e2) {
                InterfaceC58135Ppy interfaceC58135Ppy4 = c51511Mox.A01;
                if (interfaceC58135Ppy4 == null) {
                    return;
                }
                interfaceC58135Ppy4.DCp(AbstractC167017dG.A0n(e2, "Oil uri parsing failed: ", AbstractC166987dD.A1C()));
                return;
            }
        }
        interfaceC57895Plz.DiA(str2, str3);
    }
}
