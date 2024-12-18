package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Tt9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC65734Tt9 {
    public static Map A00(SpritesheetInfo spritesheetInfo) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (spritesheetInfo.B6H() != null) {
            linkedHashMap.put("file_size_kb", spritesheetInfo.B6H());
        }
        if (spritesheetInfo.BQ8() != null) {
            linkedHashMap.put("max_thumbnails_per_sprite", spritesheetInfo.BQ8());
        }
        if (spritesheetInfo.Bmk() != null) {
            linkedHashMap.put("rendered_width", spritesheetInfo.Bmk());
        }
        if (spritesheetInfo.BzP() != null) {
            linkedHashMap.put("sprite_height", spritesheetInfo.BzP());
        }
        if (spritesheetInfo.BzQ() != null) {
            List BzQ = spritesheetInfo.BzQ();
            if (BzQ != null) {
                arrayList = new ArrayList();
                Iterator it = BzQ.iterator();
                while (it.hasNext()) {
                    String url = ((ImageUrl) it.next()).getUrl();
                    if (url != null) {
                        arrayList.add(url);
                    }
                }
            } else {
                arrayList = null;
            }
            linkedHashMap.put("sprite_urls", arrayList);
        }
        if (spritesheetInfo.BzR() != null) {
            linkedHashMap.put("sprite_width", spritesheetInfo.BzR());
        }
        if (spritesheetInfo.C80() != null) {
            linkedHashMap.put("thumbnail_duration", AbstractC166997dE.A0f(spritesheetInfo.C80()));
        }
        if (spritesheetInfo.C82() != null) {
            linkedHashMap.put("thumbnail_height", spritesheetInfo.C82());
        }
        if (spritesheetInfo.C8D() != null) {
            linkedHashMap.put("thumbnail_width", spritesheetInfo.C8D());
        }
        if (spritesheetInfo.C8F() != null) {
            linkedHashMap.put("thumbnails_per_row", spritesheetInfo.C8F());
        }
        if (spritesheetInfo.C9x() != null) {
            linkedHashMap.put("total_thumbnail_num_per_sprite", spritesheetInfo.C9x());
        }
        if (spritesheetInfo.CFE() != null) {
            linkedHashMap.put("video_length", AbstractC166997dE.A0f(spritesheetInfo.CFE()));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
