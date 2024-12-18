package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.assethub.AssetHubRepository$allCutoutStickers$1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.75B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75B {
    public final UserSession A00;
    public final C8KH A01;
    public final InterfaceC09390do A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;

    public C75B(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C8KH(userSession);
        C008002u c008002u = new C008002u(new LinkedHashMap());
        this.A06 = c008002u;
        this.A08 = c008002u;
        C008002u c008002u2 = new C008002u(new LinkedHashMap());
        this.A05 = c008002u2;
        this.A07 = c008002u2;
        C008002u c008002u3 = new C008002u(new LinkedHashMap());
        this.A04 = c008002u3;
        this.A03 = C10Q.A00(new AssetHubRepository$allCutoutStickers$1(this, null), c008002u, c008002u2, c008002u3);
        this.A02 = AbstractC09440dt.A01(new C9E0(this, 42));
    }

    public final void A02(C148276lx c148276lx) {
        C14360o3.A0B(c148276lx, 0);
        C05A c05a = this.A04;
        Map map = (Map) c05a.getValue();
        String str = c148276lx.A0Z;
        if (!map.containsKey(str)) {
            LinkedHashMap A03 = AbstractC06930Yk.A03((Map) c05a.getValue());
            A03.put(str, new C206409Bx(c148276lx, (String) null));
            c05a.Egh(A03);
        }
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        C0UO c0uo = this.A08;
        if (((Map) c0uo.getValue()).containsKey(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) c0uo.getValue()).entrySet()) {
                boolean A0K = C14360o3.A0K(entry.getKey(), str);
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (A0K) {
                    C148276lx c148276lx = (C148276lx) ((C206409Bx) value).A00;
                    C14360o3.A0B(c148276lx, 1);
                    value = new C206409Bx(c148276lx, str2);
                }
                linkedHashMap.put(key, value);
            }
            this.A06.Egh(linkedHashMap);
        }
        C0UO c0uo2 = this.A07;
        if (((Map) c0uo2.getValue()).containsKey(str)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : ((Map) c0uo2.getValue()).entrySet()) {
                boolean A0K2 = C14360o3.A0K(entry2.getKey(), str);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (A0K2) {
                    C148276lx c148276lx2 = (C148276lx) ((C206409Bx) value2).A00;
                    C14360o3.A0B(c148276lx2, 1);
                    value2 = new C206409Bx(c148276lx2, str2);
                }
                linkedHashMap2.put(key2, value2);
            }
            this.A05.Egh(linkedHashMap2);
        }
        C05A c05a = this.A04;
        if (((Map) c05a.getValue()).containsKey(str)) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry3 : ((Map) c05a.getValue()).entrySet()) {
                boolean A0K3 = C14360o3.A0K(entry3.getKey(), str);
                Object key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if (A0K3) {
                    C148276lx c148276lx3 = (C148276lx) ((C206409Bx) value3).A00;
                    C14360o3.A0B(c148276lx3, 1);
                    value3 = new C206409Bx(c148276lx3, str2);
                }
                linkedHashMap3.put(key3, value3);
            }
            c05a.Egh(linkedHashMap3);
        }
    }

    public static final LinkedHashMap A00(C75B c75b) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) c75b.A04.getValue());
        linkedHashMap.putAll((Map) c75b.A07.getValue());
        linkedHashMap.putAll((Map) c75b.A08.getValue());
        return linkedHashMap;
    }

    public final void A01(int i, String str) {
        C8KH c8kh = this.A01;
        C45536KEb c45536KEb = new C45536KEb(this, i);
        C40701ud c40701ud = c8kh.A01;
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        Integer valueOf = Integer.valueOf(i);
        c2jm.A03("sticker_count_limit", valueOf);
        boolean z = false;
        if (valueOf != null) {
            z = true;
        }
        c2jm.A04("after", str);
        C18C.A0E(z);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        c40701ud.A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "ClipsMemeHubAssetQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QYR.class, false, null, 0, null, "xdt_meme_hub_graphql", new ArrayList()), c45536KEb);
    }

    public final boolean A04() {
        if (((Map) this.A06.getValue()).isEmpty() && ((Map) this.A05.getValue()).isEmpty() && ((Map) this.A04.getValue()).isEmpty()) {
            return true;
        }
        return false;
    }
}
