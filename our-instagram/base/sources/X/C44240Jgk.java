package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* renamed from: X.Jgk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44240Jgk implements InterfaceC133315zy {
    public final /* synthetic */ XP9 A00;
    public final /* synthetic */ C43658JSq A01;
    public final /* synthetic */ AbstractC43664JSw A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;

    public C44240Jgk(XP9 xp9, C43658JSq c43658JSq, AbstractC43664JSw abstractC43664JSw, String str, Map map, boolean z) {
        this.A04 = map;
        this.A02 = abstractC43664JSw;
        this.A03 = str;
        this.A01 = c43658JSq;
        this.A05 = z;
        this.A00 = xp9;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    @Override // X.InterfaceC133315zy
    public final /* bridge */ /* synthetic */ ListenableFuture ABq(Object obj) {
        Object obj2;
        C43662JSu c43662JSu = (C43662JSu) obj;
        if (c43662JSu == null) {
            Exception exc = new Exception("fetchAndDecodeImage: ShowreelNativeDocument is null", null);
            ?? obj3 = new Object();
            obj3.setException(exc);
            return obj3;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder();
        C1LC A0I = AbstractC43592JPx.A0I(c43662JSu.A01);
        while (A0I.hasNext()) {
            MUD mud = (MUD) A0I.next();
            Map map = this.A04;
            if (map != null && (obj2 = map.get(mud.A02)) != null) {
                builder2.put(mud.A01, obj2);
            } else {
                builder.add((Object) mud);
            }
        }
        ImmutableList build = builder.build();
        ImmutableMap buildOrThrow = builder2.buildOrThrow();
        if (buildOrThrow.isEmpty()) {
            return this.A02.A03.A00(this.A00, this.A01, c43662JSu, this.A03, this.A05);
        }
        AbstractC43664JSw abstractC43664JSw = this.A02;
        C43661JSt c43661JSt = abstractC43664JSw.A03;
        String str = this.A03;
        C43658JSq c43658JSq = this.A01;
        C14360o3.A0A(build);
        C14360o3.A0B(build, 0);
        return AbstractRunnableC133325zz.A01(new C43624JRh(0, new C50358MLk(buildOrThrow, 22)), c43661JSt.A00(this.A00, c43658JSq, new C43662JSu(c43662JSu.A00, build, c43662JSu.A02, c43662JSu.A04, c43662JSu.A03), str, this.A05), abstractC43664JSw.A04);
    }
}
