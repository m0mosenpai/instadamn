package X;

/* loaded from: classes5.dex */
public enum C8i implements InterfaceC02530Ab {
    ATTRIBUTE_CLICK("attribute_click"),
    ATTRIBUTE_IMPRESSION("attribute_impression"),
    GALLERY_WEARABLES_ICON_IMPRESSION("gallery_wearables_icon_impression"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_IMPRESSION("media_impression"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_NAVIGATION("media_navigation"),
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_NAVIGATION("profile_navigation"),
    STORE_LINK_CLICK("store_link_click"),
    STORE_LINK_IMPRESSION("store_link_impression"),
    ZOOMED_MEDIA_IMPRESSION("zoomed_media_impression");

    public final String A00;

    C8i(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
