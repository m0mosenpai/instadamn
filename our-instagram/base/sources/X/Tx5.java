package X;

import com.instagram.api.schemas.StoryLinkInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class Tx5 {
    public static Map A00(StoryLinkInfoDictIntf storyLinkInfoDictIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (storyLinkInfoDictIntf.Anl() != null) {
            linkedHashMap.put("click_id", storyLinkInfoDictIntf.Anl());
        }
        if (storyLinkInfoDictIntf.AvF() != null) {
            linkedHashMap.put("custom_cta", storyLinkInfoDictIntf.AvF());
        }
        if (storyLinkInfoDictIntf.Ayf() != null) {
            linkedHashMap.put("display_url", storyLinkInfoDictIntf.Ayf());
        }
        if (storyLinkInfoDictIntf.CSn() != null) {
            linkedHashMap.put("is_dynamic_dwell_enabled", storyLinkInfoDictIntf.CSn());
        }
        if (storyLinkInfoDictIntf.Cf2() != null) {
            linkedHashMap.put("is_universal_link", storyLinkInfoDictIntf.Cf2());
        }
        if (storyLinkInfoDictIntf.BNV() != null) {
            linkedHashMap.put("link_title", storyLinkInfoDictIntf.BNV());
        }
        if (storyLinkInfoDictIntf.BNY() != null) {
            linkedHashMap.put("link_type", storyLinkInfoDictIntf.BNY());
        }
        if (storyLinkInfoDictIntf.BZ8() != null) {
            linkedHashMap.put("open_external_browser", storyLinkInfoDictIntf.BZ8());
        }
        if (storyLinkInfoDictIntf.BvM() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(1264), storyLinkInfoDictIntf.BvM());
        }
        if (storyLinkInfoDictIntf.C5H() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(3210), storyLinkInfoDictIntf.C5H());
        }
        if (storyLinkInfoDictIntf.getUrl() != null) {
            linkedHashMap.put("url", storyLinkInfoDictIntf.getUrl());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
