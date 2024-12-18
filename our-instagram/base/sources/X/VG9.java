package X;

import com.facebook.maps.ttrc.common.MapboxTTRC;

/* loaded from: classes11.dex */
public enum VG9 {
    UNKNOWN("unknown_request"),
    STYLE("style_request"),
    SOURCE("source_request"),
    TILE("tile_url_request"),
    FONT("font_request"),
    SPRITE_JSON("sprite_image_request"),
    SPRITE_IMAGE("sprite_json_request"),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE("image_request");

    public static VG9[] A01 = values();
    public String A00;

    public static VG9 A00(int i) {
        if (i >= 0 && i < values().length) {
            return A01[i];
        }
        MapboxTTRC.sFbErrorReporter.EmW("MapboxTTRC", AnonymousClass001.A0c("Invalid URLCategory ordinal ", ". Do the Mapbox Resource Kind enums match URLCategory?", i));
        return UNKNOWN;
    }

    VG9(String str) {
        this.A00 = str;
    }
}
