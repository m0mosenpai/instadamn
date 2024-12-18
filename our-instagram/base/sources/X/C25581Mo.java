package X;

/* renamed from: X.1Mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25581Mo extends C25591Mp {
    public C25581Mo(C222015v c222015v, Class cls) {
        super(c222015v, new C25611Mr(null), cls, false);
    }

    @Override // X.C25591Mp, X.InterfaceC25601Mq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final InterfaceC55612h1 then(C3JY c3jy) {
        long j;
        C23781El A01;
        String str;
        C14360o3.A0B(c3jy, 0);
        if ((c3jy.A01("X-IG-ANDROID-FROM-DISK-READ-START_TIME") != null) && (A01 = c3jy.A01("X-IG-ANDROID-FROM-DISK-READ-START_TIME")) != null && (str = A01.A01) != null) {
            j = Long.parseLong(str);
        } else {
            j = -1;
        }
        InterfaceC55612h1 interfaceC55612h1 = (InterfaceC55612h1) super.then(c3jy);
        C23781El A012 = c3jy.A01("X-IG-ANDROID-FROM-DISK-CACHE");
        if (A012 != null) {
            String str2 = A012.A01;
            C14360o3.A06(str2);
            interfaceC55612h1.EQi(Long.parseLong(str2));
        }
        C23781El A013 = c3jy.A01("X-IG-ANDROID-CACHE-WRITE-REASON");
        if (A013 != null) {
            interfaceC55612h1.EQh(A013.A01);
        }
        if (j != -1) {
            interfaceC55612h1.EQg(System.currentTimeMillis() - j);
        }
        return interfaceC55612h1;
    }
}
