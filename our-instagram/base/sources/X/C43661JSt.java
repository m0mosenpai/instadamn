package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JSt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43661JSt {
    public final int A00;
    public final C25821No A01;
    public final String A02;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final AnonymousClass600 A00(XP9 xp9, C43658JSq c43658JSq, C43662JSu c43662JSu, String str, boolean z) {
        C43660JSs c43660JSs;
        IgShowreelNativeAsset igShowreelNativeAsset;
        Integer CHg;
        AbstractC167007dF.A1K(str, c43658JSq);
        C14360o3.A0B(xp9, 4);
        ImmutableList immutableList = c43662JSu.A01;
        if (!immutableList.isEmpty()) {
            xp9.CxT();
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ImmutableList.Builder builder = ImmutableList.builder();
        HashMap A1G = AbstractC166987dD.A1G();
        List<C43660JSs> list = c43658JSq.A04;
        if (list != null) {
            for (C43660JSs c43660JSs2 : list) {
                String url = c43660JSs2.A00.getUrl();
                if (url == null) {
                    url = "";
                }
                A1G.put(url, c43660JSs2);
            }
        }
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) A1G);
        C14360o3.A07(copyOf);
        C1LC A0I = AbstractC43592JPx.A0I(immutableList);
        while (A0I.hasNext()) {
            MUD mud = (MUD) A0I.next();
            C25821No c25821No = this.A01;
            String str2 = this.A02;
            C14360o3.A0A(mud);
            C14360o3.A0B(mud, 0);
            ?? obj = new Object();
            JT3 jt3 = new JT3(obj, new JT2(mud, xp9, obj, atomicBoolean));
            String str3 = mud.A02;
            SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str3);
            if (copyOf.containsKey(str3) && (c43660JSs = (C43660JSs) copyOf.get(str3)) != null && (CHg = (igShowreelNativeAsset = c43660JSs.A00).CHg()) != null) {
                int intValue = CHg.intValue();
                Integer BDS = igShowreelNativeAsset.BDS();
                if (BDS != null) {
                    simpleImageUrl = new SimpleImageUrl(str3, intValue, BDS.intValue());
                }
            }
            C1OG A0J = c25821No.A0J(simpleImageUrl, str2);
            A0J.A0I = z;
            A0J.A0F = true;
            A0J.A02(jt3.A00);
            A0J.A01();
            builder.add((Object) jt3);
        }
        return AbstractRunnableC133325zz.A01(new C43624JRh(2, new C50372MLz(12, c43662JSu, this, xp9, c43658JSq)), C2OD.A00(builder.build()), C1M8.A01);
    }

    public C43661JSt(C1341564a c1341564a, C25821No c25821No, String str) {
        this.A01 = c25821No;
        this.A02 = str;
        this.A00 = AbstractC25225BEi.A07(C06090Tz.A05, C1341564a.A00(c1341564a), 36592245191475580L);
    }
}
