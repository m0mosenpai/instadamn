package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VP6 {
    public static Map A00(InterfaceC109364wL interfaceC109364wL) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC109364wL.AdC() != null) {
            linkedHashMap.put("attribution", interfaceC109364wL.AdC());
        }
        if (interfaceC109364wL.AdO() != null) {
            linkedHashMap.put("attribution_url", interfaceC109364wL.AdO());
        }
        if (interfaceC109364wL.AvN() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(4233), interfaceC109364wL.AvN());
        }
        if (interfaceC109364wL.Ayd() != null) {
            linkedHashMap.put("display_type", interfaceC109364wL.Ayd());
        }
        if (interfaceC109364wL.B29() != null) {
            linkedHashMap.put("end_time_ms", AbstractC166997dE.A0f(interfaceC109364wL.B29()));
        }
        if (interfaceC109364wL.BDR() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0f(interfaceC109364wL.BDR()));
        }
        if (interfaceC109364wL.getId() != null) {
            linkedHashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC109364wL.getId());
        }
        if (interfaceC109364wL.CUY() != null) {
            linkedHashMap.put("is_fb_sticker", interfaceC109364wL.CUY());
        }
        if (interfaceC109364wL.CVk() != null) {
            linkedHashMap.put("is_hidden", interfaceC109364wL.CVk());
        }
        if (interfaceC109364wL.CaJ() != null) {
            linkedHashMap.put("is_pinned", interfaceC109364wL.CaJ());
        }
        if (interfaceC109364wL.Cdh() != null) {
            linkedHashMap.put("is_sticker", interfaceC109364wL.Cdh());
        }
        if (interfaceC109364wL.getMediaType() != null) {
            linkedHashMap.put("media_type", interfaceC109364wL.getMediaType());
        }
        String str = null;
        if (interfaceC109364wL.Bii() != null) {
            StoryPromptTappableDataIntf Bii = interfaceC109364wL.Bii();
            if (Bii != null) {
                treeUpdaterJNI2 = Bii.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put("prompt_sticker", treeUpdaterJNI2);
        }
        if (interfaceC109364wL.Bpa() != null) {
            linkedHashMap.put("rotation", AbstractC166997dE.A0f(interfaceC109364wL.Bpa()));
        }
        if (interfaceC109364wL.Bzq() != null) {
            linkedHashMap.put("start_time_ms", AbstractC166997dE.A0f(interfaceC109364wL.Bzq()));
        }
        if (interfaceC109364wL.C0i() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(5404), interfaceC109364wL.C0i());
        }
        if (interfaceC109364wL.C3Y() != null) {
            SubscriptionStickerDictIntf C3Y = interfaceC109364wL.C3Y();
            if (C3Y != null) {
                treeUpdaterJNI = C3Y.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(5431), treeUpdaterJNI);
        }
        if (interfaceC109364wL.C4I() != null) {
            StickerTraySurface C4I = interfaceC109364wL.C4I();
            if (C4I != null) {
                str = C4I.A00;
            }
            linkedHashMap.put("surface", str);
        }
        if (interfaceC109364wL.CHf() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0f(interfaceC109364wL.CHf()));
        }
        if (interfaceC109364wL.CI1() != null) {
            linkedHashMap.put("x", AbstractC166997dE.A0f(interfaceC109364wL.CI1()));
        }
        if (interfaceC109364wL.CIa() != null) {
            linkedHashMap.put("y", AbstractC166997dE.A0f(interfaceC109364wL.CIa()));
        }
        if (interfaceC109364wL.CIh() != null) {
            linkedHashMap.put("z", AbstractC166997dE.A0f(interfaceC109364wL.CIh()));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
