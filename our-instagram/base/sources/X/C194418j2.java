package X;

/* renamed from: X.8j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194418j2 extends AbstractC154146wP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2UU A01;

    public C194418j2(C2UU c2uu, int i) {
        this.A01 = c2uu;
        this.A00 = i;
    }

    @Override // X.AbstractC154146wP
    public final int A03(int i) {
        int itemViewType;
        Class cls;
        C2UU c2uu = this.A01;
        if (c2uu instanceof C66362zD) {
            C66362zD c66362zD = (C66362zD) c2uu;
            Object obj = c66362zD.A05;
            if (C14360o3.A0K(obj, "GalleryGridAdapter")) {
                itemViewType = c66362zD.getItemViewType(i);
                if (itemViewType == c66362zD.A01(C195598kz.class) || itemViewType == c66362zD.A01(C194348iu.class) || itemViewType == c66362zD.A01(C194358iv.class) || itemViewType == c66362zD.A01(C194388iy.class) || itemViewType == c66362zD.A01(C195608l0.class)) {
                    return 1;
                }
                if (itemViewType != c66362zD.A01(C194378ix.class)) {
                    cls = C194368iw.class;
                }
                return this.A00;
            }
            if (C14360o3.A0K(obj, "StoryDraftsGalleryItemAdapter")) {
                itemViewType = c66362zD.getItemViewType(i);
                if (itemViewType == c66362zD.A01(C194198ie.class)) {
                    return 1;
                }
                cls = C194208if.class;
            } else {
                if (C14360o3.A0K(obj, "QuickSnapArchiveController") && c66362zD.getItemViewType(i) == c66362zD.A01(C56123Ovj.class)) {
                    return 1;
                }
                return 0;
            }
            if (itemViewType != c66362zD.A01(cls)) {
                return 0;
            }
            return this.A00;
        }
        return 0;
    }
}
