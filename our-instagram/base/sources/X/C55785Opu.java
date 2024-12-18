package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Opu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55785Opu implements InterfaceC72009XEx {
    public final InterfaceC58135Ppy A00;
    public final InterfaceC58013Pnx A01;

    @Override // X.InterfaceC72009XEx
    public final void D1j(Exception exc) {
    }

    @Override // X.InterfaceC72009XEx
    public final void DGs(Exception exc) {
    }

    @Override // X.InterfaceC72009XEx
    public final void DGt(Map map, String str) {
    }

    @Override // X.InterfaceC72009XEx
    public final void Dk8() {
    }

    @Override // X.InterfaceC72009XEx
    public final void Dk9(C105764pn c105764pn) {
    }

    @Override // X.InterfaceC72009XEx
    public final void DkA(C55176Odf c55176Odf) {
    }

    @Override // X.InterfaceC72009XEx
    public final void Dnt(C69492VoF c69492VoF) {
    }

    @Override // X.InterfaceC72009XEx
    public final void Dpo(C69570VrZ c69570VrZ) {
    }

    @Override // X.InterfaceC72009XEx
    public final void Duv() {
    }

    @Override // X.InterfaceC72009XEx
    public final void Duy(float f) {
    }

    @Override // X.InterfaceC72009XEx
    public final void Duz() {
    }

    @Override // X.InterfaceC72009XEx
    public final void Dv3(MediaComposition mediaComposition, C69492VoF c69492VoF, List list, boolean z) {
    }

    @Override // X.InterfaceC72009XEx
    public final void DvB(Exception exc, Map map, int i) {
    }

    @Override // X.InterfaceC72009XEx
    public final void DvE(float f) {
    }

    @Override // X.InterfaceC72009XEx
    public final void DvG() {
    }

    @Override // X.InterfaceC72009XEx
    public final void DvJ(Map map) {
    }

    @Override // X.InterfaceC72009XEx
    public final /* synthetic */ void DxN(List list) {
    }

    @Override // X.InterfaceC72009XEx
    public final void onFailure(Exception exc) {
    }

    @Override // X.InterfaceC72009XEx
    public final void DkB(Exception exc) {
        InterfaceC58013Pnx interfaceC58013Pnx = this.A01;
        if (interfaceC58013Pnx != null) {
            interfaceC58013Pnx.Dcb(EnumC53262Nh0.A0H, "Uploading failed");
        }
    }

    @Override // X.InterfaceC72009XEx
    public final void DkD(W62 w62) {
        InterfaceC58013Pnx interfaceC58013Pnx = this.A01;
        if (interfaceC58013Pnx != null) {
            interfaceC58013Pnx.Dca(EnumC53262Nh0.A0H);
        }
    }

    @Override // X.InterfaceC72009XEx
    public final void DkE(W63 w63, W62 w62) {
        String str = w63.A03;
        if (str != null) {
            try {
                String string = new JSONObject(str).getString("media_id");
                InterfaceC58135Ppy interfaceC58135Ppy = this.A00;
                if (interfaceC58135Ppy != null) {
                    interfaceC58135Ppy.DxJ(string);
                }
            } catch (JSONException unused) {
                System.out.println((Object) "media id doesn't exist for ruload_igvideo");
            }
        }
    }

    @Override // X.InterfaceC72009XEx
    public final void Dux(C105764pn c105764pn) {
        InterfaceC58013Pnx interfaceC58013Pnx = this.A01;
        if (interfaceC58013Pnx != null) {
            interfaceC58013Pnx.Dcb(EnumC53262Nh0.A0F, "Transcoding failed");
        }
    }

    @Override // X.InterfaceC72009XEx
    public final void Dv1(MYB myb, WDI wdi) {
        InterfaceC58013Pnx interfaceC58013Pnx = this.A01;
        if (interfaceC58013Pnx != null) {
            interfaceC58013Pnx.Dca(EnumC53262Nh0.A0F);
        }
    }

    public C55785Opu(InterfaceC58135Ppy interfaceC58135Ppy, InterfaceC58013Pnx interfaceC58013Pnx) {
        this.A00 = interfaceC58135Ppy;
        this.A01 = interfaceC58013Pnx;
    }
}
