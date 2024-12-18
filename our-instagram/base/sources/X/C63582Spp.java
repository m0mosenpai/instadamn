package X;

import java.util.Map;

/* renamed from: X.Spp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63582Spp implements C1N8 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C63582Spp(C62962SZf c62962SZf, SXG sxg, String str, int i) {
        this.A00 = i;
        this.A01 = c62962SZf;
        switch (i) {
            case 5:
            case 6:
                this.A03 = str;
                this.A02 = sxg;
                break;
            default:
                this.A02 = sxg;
                this.A03 = str;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x015b, code lost:
    
        if (r1.length() != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0179, code lost:
    
        if (r1.length() != 0) goto L52;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1N8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63582Spp.apply(java.lang.Object):java.lang.Object");
    }

    public static void A00(Be9 be9, String str, String str2, String str3, Map map) {
        be9.A07(C0HM.A00().toString(), "client_mutation_id");
        be9.A07(str, "actor_id");
        be9.A07(str2, "platform_trust_token");
        be9.A07(str3, "payment_type");
        be9.A07(AbstractC58442PvL.A06(map), "logging_id");
    }

    public C63582Spp(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }
}
