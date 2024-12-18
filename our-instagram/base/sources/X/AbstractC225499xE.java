package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaVCRTappableDataIntf;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225499xE {
    public static Map A00(InterfaceC2042391v interfaceC2042391v) {
        String str;
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC2042391v.AdC() != null) {
            A1I.put("attribution", interfaceC2042391v.AdC());
        }
        if (interfaceC2042391v.AdO() != null) {
            A1I.put("attribution_url", interfaceC2042391v.AdO());
        }
        if (interfaceC2042391v.AvN() != null) {
            A1I.put("custom_text_color", interfaceC2042391v.AvN());
        }
        if (interfaceC2042391v.Ayd() != null) {
            A1I.put("display_type", interfaceC2042391v.Ayd());
        }
        if (interfaceC2042391v.B29() != null) {
            A1I.put("end_time_ms", AbstractC166997dE.A0f(interfaceC2042391v.B29()));
        }
        if (interfaceC2042391v.BDR() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0f(interfaceC2042391v.BDR()));
        }
        if (interfaceC2042391v.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC2042391v.getId());
        }
        if (interfaceC2042391v.CUY() != null) {
            A1I.put("is_fb_sticker", interfaceC2042391v.CUY());
        }
        if (interfaceC2042391v.CVk() != null) {
            A1I.put("is_hidden", interfaceC2042391v.CVk());
        }
        if (interfaceC2042391v.CaJ() != null) {
            A1I.put("is_pinned", interfaceC2042391v.CaJ());
        }
        if (interfaceC2042391v.Cdh() != null) {
            A1I.put("is_sticker", interfaceC2042391v.Cdh());
        }
        if (interfaceC2042391v.getMediaType() != null) {
            A1I.put("media_type", interfaceC2042391v.getMediaType());
        }
        if (interfaceC2042391v.Bpa() != null) {
            A1I.put("rotation", AbstractC166997dE.A0f(interfaceC2042391v.Bpa()));
        }
        if (interfaceC2042391v.Bzq() != null) {
            A1I.put("start_time_ms", AbstractC166997dE.A0f(interfaceC2042391v.Bzq()));
        }
        if (interfaceC2042391v.C0i() != null) {
            A1I.put("sticker_style_enum", interfaceC2042391v.C0i());
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC2042391v.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC2042391v.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("subscription_sticker", treeUpdaterJNI);
        }
        if (interfaceC2042391v.C4I() != null) {
            StickerTraySurface C4I = interfaceC2042391v.C4I();
            if (C4I != null) {
                str = C4I.A00;
            } else {
                str = null;
            }
            A1I.put("surface", str);
        }
        if (interfaceC2042391v.CEg() != null) {
            MediaVCRTappableDataIntf CEg = interfaceC2042391v.CEg();
            if (CEg != null) {
                treeUpdaterJNI2 = CEg.F7o();
            }
            A1I.put("vcr_sticker", treeUpdaterJNI2);
        }
        if (interfaceC2042391v.CHf() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0f(interfaceC2042391v.CHf()));
        }
        if (interfaceC2042391v.CI1() != null) {
            A1I.put("x", AbstractC166997dE.A0f(interfaceC2042391v.CI1()));
        }
        if (interfaceC2042391v.CIa() != null) {
            A1I.put("y", AbstractC166997dE.A0f(interfaceC2042391v.CIa()));
        }
        if (interfaceC2042391v.CIh() != null) {
            A1I.put("z", AbstractC166997dE.A0f(interfaceC2042391v.CIh()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
