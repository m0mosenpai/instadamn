package X;

/* loaded from: classes11.dex */
public abstract class U6F {
    public static final U6G A00(String str) {
        for (U6G u6g : U6G.A01) {
            if (C14360o3.A0K(u6g.toString(), str)) {
                return u6g;
            }
        }
        C50662Um.A03(C65981Txa.A0T, AnonymousClass001.A0R("Error finding DragToDismiss enum value for: ", str));
        return U6G.A04;
    }
}
