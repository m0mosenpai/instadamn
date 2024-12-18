package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CsI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29091CsI implements InterfaceC30930Dik {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C29091CsI(C40971v4 c40971v4, C26589Bom c26589Bom, int i) {
        this.A00 = i;
        this.A02 = c26589Bom;
        this.A01 = c40971v4;
    }

    public static HashMap A00(C29091CsI c29091CsI) {
        C40971v4 c40971v4 = (C40971v4) c29091CsI.A01;
        HashMap hashMap = new HashMap();
        String str = c40971v4.A0f;
        if (str != null) {
            hashMap.put("host_media_pk", str);
        }
        return hashMap;
    }

    @Override // X.InterfaceC30930Dik
    public final Map B3g() {
        String str;
        int i = this.A00;
        HashMap A00 = A00(this);
        switch (i) {
            case 0:
                str = "cta";
                break;
            case 1:
                str = "info";
                break;
            case 2:
            case 3:
            default:
                str = "thumbnail";
                break;
            case 4:
                str = DialogModule.KEY_TITLE;
                break;
            case 5:
                str = "card";
                break;
        }
        A00.put(AbstractC111324zv.A00(1324), str);
        return A00;
    }
}
