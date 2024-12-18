package X;

import android.util.Base64;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.Jgj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44239Jgj implements InterfaceC133315zy {
    public final /* synthetic */ XP9 A00;
    public final /* synthetic */ AbstractC43664JSw A01;

    public C44239Jgj(XP9 xp9, AbstractC43664JSw abstractC43664JSw) {
        this.A00 = xp9;
        this.A01 = abstractC43664JSw;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    @Override // X.InterfaceC133315zy
    public final /* bridge */ /* synthetic */ ListenableFuture ABq(Object obj) {
        C43662JSu c43662JSu = (C43662JSu) obj;
        if (c43662JSu == null) {
            Exception exc = new Exception("decodeDocument: ShowreelNativeDocument is null", null);
            ?? obj2 = new Object();
            obj2.setException(exc);
            return obj2;
        }
        String str = c43662JSu.A03;
        int length = str.length();
        if (length == 0) {
            XP9 xp9 = this.A00;
            Integer num = C05F.A0Y;
            ImmutableMap immutableMap = RegularImmutableMap.A02;
            C14360o3.A07(immutableMap);
            xp9.DnK(immutableMap, num, "Document string is empty");
        }
        C43666JSy c43666JSy = this.A01.A02;
        XP9 xp92 = this.A00;
        C14360o3.A0B(xp92, 1);
        try {
            C0JO c0jo = c43666JSy.A00;
            c0jo.now();
            if (length != 0) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    C14360o3.A0A(decode);
                    c0jo.now();
                    String str2 = c43662JSu.A04;
                    ImmutableMap buildOrThrow = new ImmutableMap.Builder().buildOrThrow();
                    C14360o3.A07(buildOrThrow);
                    return new C25191Kx(new C44237Jgh(c43662JSu.A00, str2, c43662JSu.A02, buildOrThrow, decode));
                } catch (IllegalArgumentException e) {
                    throw new Exception("decodeDocument: decode base64 string failed", e);
                }
            }
            throw new Exception("decodeDocument: animationResource.document is empty", null);
        } catch (C46320Keq e2) {
            Integer num2 = C05F.A0j;
            ImmutableMap immutableMap2 = RegularImmutableMap.A02;
            C14360o3.A07(immutableMap2);
            xp92.DnK(immutableMap2, num2, AbstractC111324zv.A00(3578));
            ?? obj3 = new Object();
            obj3.setException(e2);
            return obj3;
        }
    }
}
