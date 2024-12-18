package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OaM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55066OaM {
    public final C54993OUc A00;
    public final OLV A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final InterfaceC58100PpP A06;
    public final C54585O9m A07;
    public final String A08;

    private final void A00(C51673Ms4 c51673Ms4, C55097Ob8 c55097Ob8, String str) {
        A01(c51673Ms4, this, C05F.A0u, str);
        try {
            C54993OUc c54993OUc = this.A00;
            Map map = c54993OUc.A0B;
            HashMap hashMap = new HashMap(map);
            hashMap.put("X-MediaAccuracy-TimestampUs", String.valueOf(c51673Ms4.A00));
            String str2 = c51673Ms4.A04;
            if (!C14360o3.A0K(str2, "0")) {
                hashMap.put("X-Player-Session-Id", str2);
            }
            hashMap.put("X-Media-Id", str);
            Map map2 = this.A05;
            Object obj = map2.get("media_features");
            if (obj != null) {
                hashMap.put("X-Media-Features", obj);
            }
            hashMap.put("X-Source-Type", this.A03);
            String A00 = AbstractC53757Nq9.A00(c51673Ms4.A01);
            hashMap.put("X-Snapshot-Type", A00);
            hashMap.put("x-media-accuracy-tags", c51673Ms4.A05);
            map2.put("snapshot_type", A00);
            hashMap.remove("devserver-forward-host");
            hashMap.remove("enable-video-processing-forwarding");
            hashMap.remove("xpv_override");
            hashMap.remove("usc_encoding_override");
            hashMap.remove("X-Instagram-Rupload-Params");
            hashMap.putAll(WGX.A01(this.A02, this.A04));
            HashMap A1G = AbstractC166987dD.A1G();
            new C69056Vgx(new W2I());
            new C69542Vr6(new W2H(0, false));
            A1G.putAll(map);
            W2I w2i = c54993OUc.A04;
            C69056Vgx c69056Vgx = new C69056Vgx(w2i);
            W2H w2h = c54993OUc.A02;
            C69542Vr6 c69542Vr6 = new C69542Vr6(w2h);
            String str3 = c54993OUc.A09;
            String str4 = c54993OUc.A0A;
            boolean z = c54993OUc.A00;
            boolean z2 = c54993OUc.A0F;
            boolean z3 = c54993OUc.A0E;
            boolean z4 = c54993OUc.A0C;
            C69055Vgw c69055Vgw = c54993OUc.A06;
            long j = c54993OUc.A01;
            String str5 = c54993OUc.A08;
            boolean z5 = c54993OUc.A0D;
            EnumC53327Ni6 enumC53327Ni6 = EnumC53327Ni6.A0m;
            C14360o3.A0B(enumC53327Ni6, 0);
            this.A06.En2(new C54993OUc(w2h, enumC53327Ni6, w2i, c69542Vr6, c69055Vgw, c69056Vgx, str5, str3, str4, hashMap, j, z5, z3, z, z2, z4), new C55191Odx(AbstractC166987dD.A11(c51673Ms4.A02), c51673Ms4.A03), new C55651Onc(c51673Ms4, c55097Ob8, this, str));
        } catch (Throwable th) {
            c55097Ob8.A03(c51673Ms4.A02);
            this.A01.A00(c51673Ms4, C05F.A1F, str, "Upload trigger failure", th, this.A05);
        }
    }

    public static final void A01(C51673Ms4 c51673Ms4, C55066OaM c55066OaM, Integer num, String str) {
        c55066OaM.A01.A00(c51673Ms4, num, str, null, null, c55066OaM.A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.0e5] */
    public final void A02() {
        Object A1D;
        Object A1D2;
        Long A0j;
        try {
            C54585O9m c54585O9m = this.A07;
            OLV olv = this.A01;
            C55097Ob8 c55097Ob8 = new C55097Ob8(olv, c54585O9m.A00, c54585O9m.A01, c54585O9m.A02);
            String str = this.A08;
            if (str == null) {
                A01(null, this, C05F.A0u, null);
                olv.A00(null, C05F.A1F, null, "Cannot parse media id from the response", null, this.A05);
                c55097Ob8.A02();
                return;
            }
            try {
                File file = c55097Ob8.A01;
                String[] list = file.list(C56832PKc.A00);
                if (list != null && list.length != 0) {
                    File A0w = MSW.A0w(file, list[0]);
                    AbstractC57194Pae.A08(A0w, C15W.A05, new C50358MLk(c55097Ob8, 25));
                    A0w.delete();
                }
                A1D = C0eB.A00;
            } catch (Throwable th) {
                A1D = MSW.A1D(th);
            }
            Throwable A00 = C09550e6.A00(A1D);
            if (A00 != null) {
                c55097Ob8.A00.A01(C05F.A00, null, null, null, null, null, A00, AbstractC06930Yk.A0E(), null);
            }
            String A1H = AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, c55097Ob8.A05, null);
            Iterator it = c55097Ob8.A01(A1H, true).iterator();
            while (it.hasNext()) {
                A00((C51673Ms4) it.next(), c55097Ob8, str);
            }
            try {
                File file2 = c55097Ob8.A01;
                String[] list2 = file2.list(C56833PKd.A00);
                if (list2 != null) {
                    A1D2 = AbstractC166987dD.A1E();
                    for (String str2 : list2) {
                        List A0R = AbstractC001900j.A0R(AbstractC001900j.A0G(".wav", AbstractC001900j.A0F("preview_audio_", str2)), new String[]{"_"}, 2);
                        if (A0R.size() == 2 && (A0j = AbstractC166997dE.A0j(AbstractC25226BEj.A1I(A0R, 1))) != null) {
                            A1D2.add(new C51673Ms4(false, C05F.A00, c55097Ob8.A03, AbstractC31173DnH.A0s(A0R, 0), MSX.A0i(MSW.A0w(file2, str2)), "audio/wav", A1H, A0j.longValue()));
                        }
                    }
                } else {
                    A1D2 = 0;
                }
            } catch (Throwable th2) {
                A1D2 = MSW.A1D(th2);
            }
            Throwable A002 = C09550e6.A00(A1D2);
            List list3 = A1D2;
            if (A002 != null) {
                c55097Ob8.A00.A02(C05F.A00, null, null, null, A002, null);
                list3 = null;
            }
            List list4 = list3;
            if (list4 == null) {
                list4 = C16930sl.A00;
            }
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                A00((C51673Ms4) it2.next(), c55097Ob8, str);
            }
        } catch (Throwable th3) {
            this.A01.A01(C05F.A1F, null, null, this.A04, this.A08, "Critical failure", th3, null, this.A05);
        }
    }

    public C55066OaM(C54993OUc c54993OUc, InterfaceC58100PpP interfaceC58100PpP, OLV olv, C54585O9m c54585O9m, Integer num, String str, String str2, String str3, Collection collection) {
        this.A07 = c54585O9m;
        this.A01 = olv;
        this.A04 = str;
        this.A00 = c54993OUc;
        this.A08 = str2;
        this.A06 = interfaceC58100PpP;
        this.A02 = num;
        HashMap A1G = AbstractC166987dD.A1G();
        this.A05 = A1G;
        if (collection != null && !collection.isEmpty()) {
            String A00 = AbstractC93184Fu.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, collection);
            C14360o3.A07(A00);
            A1G.put("media_features", A00);
        }
        this.A03 = str3;
    }
}
