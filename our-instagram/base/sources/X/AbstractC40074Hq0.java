package X;

import com.instagram.api.schemas.MetaGalleryAlbumType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hq0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40074Hq0 {
    public static Map A00(InterfaceC38281qI interfaceC38281qI) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38281qI.Ah2() != null) {
            A1I.put("body_text", interfaceC38281qI.Ah2());
        }
        if (interfaceC38281qI.getCtaText() != null) {
            A1I.put("cta_text", interfaceC38281qI.getCtaText());
        }
        if (interfaceC38281qI.Azn() != null) {
            A1I.put("duration_ms", interfaceC38281qI.Azn());
        }
        if (interfaceC38281qI.BDG() != null) {
            A1I.put("header_text", interfaceC38281qI.BDG());
        }
        if (interfaceC38281qI.getId() != null) {
            AbstractC37300Gc1.A12(interfaceC38281qI.getId(), A1I);
        }
        String str = null;
        if (interfaceC38281qI.BR4() != null) {
            List<JKP> BR4 = interfaceC38281qI.BR4();
            if (BR4 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JKP jkp : BR4) {
                    if (jkp != null) {
                        arrayList.add(jkp.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("media_info_list", arrayList);
        }
        if (interfaceC38281qI.BRl() != null) {
            A1I.put("media_thumbnail_urls", interfaceC38281qI.BRl());
        }
        if (interfaceC38281qI.BTH() != null) {
            MetaGalleryAlbumType BTH = interfaceC38281qI.BTH();
            if (BTH != null) {
                str = BTH.A00;
            }
            A1I.put("meta_gallery_album_type", str);
        }
        if (interfaceC38281qI.C93() != null) {
            A1I.put("title_text", interfaceC38281qI.C93());
        }
        if (interfaceC38281qI.C9N() != null) {
            A1I.put("tooltip_text", interfaceC38281qI.C9N());
        }
        if (interfaceC38281qI.CAR() != null) {
            A1I.put("tracking_token", interfaceC38281qI.CAR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
