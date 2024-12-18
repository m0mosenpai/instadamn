package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8iG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193958iG {
    public int A00;
    public int A01;
    public C55U A02;
    public C194388iy A03;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C2GT A0F;
    public final UserSession A0G;
    public final C7Db A0H;
    public final C05A A0J;
    public final C0UO A0K;
    public final C195448kk A0L;
    public Map A09 = AbstractC06930Yk.A0E();
    public Map A05 = AbstractC06930Yk.A0E();
    public Map A08 = AbstractC06930Yk.A0E();
    public List A04 = C16930sl.A00;
    public Map A06 = AbstractC06930Yk.A0E();
    public Map A07 = AbstractC06930Yk.A0E();
    public final Map A0I = new HashMap();

    public static final void A00(GalleryItem galleryItem, C193958iG c193958iG) {
        Medium medium = galleryItem.A00;
        if (medium != null && galleryItem.A09 == C05F.A00) {
            Map map = c193958iG.A06;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                int intValue = ((Number) entry.getKey()).intValue();
                C195598kz c195598kz = (C195598kz) entry.getValue();
                if (intValue == medium.A05) {
                    int CNS = c193958iG.A0H.CNS(medium);
                    C195788lL c195788lL = c195598kz.A02;
                    boolean z = c193958iG.A0A;
                    boolean z2 = c193958iG.A0E;
                    C195788lL c195788lL2 = new C195788lL(c195788lL.A00, c195788lL.A01, z, c195788lL.A03, z2, c195788lL.A02, c195788lL.A05, c195788lL.A07, c195788lL.A04);
                    String A00 = C195778lI.A00.A00(medium, c193958iG.A0G);
                    GalleryItem.LocalGalleryMedium localGalleryMedium = new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05));
                    boolean z3 = false;
                    if (CNS != -1) {
                        z3 = true;
                    }
                    c195598kz = new C195598kz(new C9BB(null, CNS, 0, 12, 3, z3, false), localGalleryMedium, c195788lL2, A00);
                }
                linkedHashMap.put(key, c195598kz);
            }
            c193958iG.A06 = linkedHashMap;
        }
    }

    public final void A01(InterfaceC16660sJ interfaceC16660sJ) {
        C7Db c7Db = this.A0H;
        int count = c7Db.getCount();
        for (int i = 0; i < count; i++) {
            A00(c7Db.BJy(i).A01, this);
        }
        Map map = this.A06;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC16850sd.A0L(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((Number) entry.getKey()).intValue();
            C195598kz c195598kz = (C195598kz) entry.getValue();
            C195788lL c195788lL = c195598kz.A02;
            boolean z = this.A0E;
            C195788lL c195788lL2 = new C195788lL(c195788lL.A00, c195788lL.A01, c195788lL.A06, c195788lL.A03, z, c195788lL.A02, c195788lL.A05, c195788lL.A07, c195788lL.A04);
            C195778lI c195778lI = C195778lI.A00;
            GalleryItem.LocalGalleryMedium localGalleryMedium = c195598kz.A01;
            linkedHashMap.put(key, new C195598kz(c195598kz.A00, localGalleryMedium, c195788lL2, c195778lI.A00(localGalleryMedium.A00, this.A0G)));
        }
        this.A06 = linkedHashMap;
        Map map2 = this.A07;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC16850sd.A0L(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            Object key2 = entry2.getKey();
            entry2.getKey();
            C195608l0 c195608l0 = (C195608l0) entry2.getValue();
            String str = c195608l0.A05;
            ImageUrl imageUrl = c195608l0.A04;
            String str2 = c195608l0.A06;
            int i2 = c195608l0.A01;
            int i3 = c195608l0.A00;
            GalleryItem galleryItem = c195608l0.A03;
            linkedHashMap2.put(key2, new C195608l0(galleryItem, imageUrl, str, str2, c195608l0.A07, i2, i3, c7Db.CNK(galleryItem), this.A0A, c195608l0.A09));
        }
        this.A07 = linkedHashMap2;
        interfaceC16660sJ.invoke(true);
    }

    public C193958iG(UserSession userSession, C7Db c7Db, int i) {
        this.A0G = userSession;
        this.A01 = i;
        this.A0H = c7Db;
        C195448kk A00 = AbstractC195438kj.A00(userSession);
        this.A0L = A00;
        C008002u A002 = C10E.A00(null);
        this.A0J = A002;
        this.A0K = AbstractC208910l.A02(A002);
        this.A0F = AbstractC58232lf.A00(AnonymousClass191.A00, C10Q.A03(new C9D2(4, null), A00.A05, A002));
    }
}
