package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.GjD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC37738GjD implements InterfaceC02530Ab {
    ADS_ONLY("ads_only"),
    CONNECTED(RealtimeConstants.MQTT_CONNECTED),
    /* JADX INFO: Fake field, exist only in values array */
    CREATOR_INSPIRATION("creator_inspiration"),
    LOCATION("location"),
    MEDIA_NOTES("media_notes"),
    /* JADX INFO: Fake field, exist only in values array */
    META_VERIFIED("meta_verified"),
    MIXED_MEDIA_ONLY("mixed_media_only"),
    SOCIAL("social"),
    /* JADX INFO: Fake field, exist only in values array */
    SPINNABLE_REELS("spinnable_reels"),
    STAR_SEARCH_ONLY("star_search_only"),
    VOICE_TRANSLATION("voice_translation");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC37738GjD(String str) {
        this.A00 = str;
    }
}
